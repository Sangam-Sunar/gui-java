#include <stdio.h>
#include <stdlib.h>

// Define a node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int data) {  
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (!newNode) {
        printf("Memory allocation failed.\n");
        return NULL;
    }
    newNode->data = data;
    newNode->next = newNode; // Point to itself (circular reference)
    return newNode;
}

// Function to insert a node at the end of the circular linked list
void insertAtEnd(struct Node** head, int data) {
    struct Node* newNode = createNode(data);
   
    // If the list is empty, make the new node the head
    if (*head == NULL) {
        *head = newNode;
    } else {
        struct Node* temp = *head;
        // Traverse to the last node (which points to the head)
        while (temp->next != *head) {
            temp = temp->next;
        }
        // Insert the new node after the last node and maintain the circular structure
        temp->next = newNode;
        newNode->next = *head;
    }
}

// Function to print the circular linked list with memory addresses in hexadecimal
void printList(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
   
    struct Node* temp = head;
    printf("\nCircular Linked List with Memory Addresses (Hexadecimal Format):\n");
    do {
        printf("Data: %d, Address: 0x%p, Next: 0x%p\n", temp->data, (void*)temp, (void*)temp->next);
        temp = temp->next;
    } while (temp != head);
    printf("(head points to 0x%p)\n\n", (void*)head); // Indicating that the list is circular
}

// Function to delete a node from the list
void deleteNode(struct Node** head, int data) {
    if (*head == NULL) {
        printf("List is empty.\n");
        return;
    }
   
    struct Node* temp = *head;
    struct Node* prev = NULL;
   
    // If the node to be deleted is the head node
    if (temp->data == data) {
        if (temp->next == *head) { // Only one node in the list
            free(temp);
            *head = NULL;
        } else {
            // Traverse to the last node
            while (temp->next != *head) {
                temp = temp->next;
            }
            temp->next = (*head)->next;
            free(*head);
            *head = temp->next;
        }
        return;
    }

    // Traverse the list to find the node to delete
    while (temp->next != *head && temp->data != data) {
        prev = temp;
        temp = temp->next;
    }
   
    if (temp->data == data) {
        prev->next = temp->next;
        free(temp);
    } else {
        printf("Node with value %d not found.\n", data);
    }
}

int main() {
    struct Node* head = NULL;
   
    // Insert elements into the circular linked list
    insertAtEnd(&head, 10);
    insertAtEnd(&head, 20);
    insertAtEnd(&head, 30);
    insertAtEnd(&head, 40);
   
    // Print the circular linked list
    printList(head);
   
    // Delete a node from the list
    printf("Deleting node with value 20\n");
    deleteNode(&head, 20);
   
    // Print the list after deletion
    printList(head);
   
    return 0;
}

