/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.edu.yuc;

import java.util.List;

/**
 *
 * @author toby
 */
public class Node<T> {
   
		int item;
		Node leftChild;
		Node rightChild;
		public Node(int item){
			this.item = item;
		}
		public void preOrder(){
                     System.out.print(item + "--->");
			if(leftChild != null)
				this.leftChild.preOrder();
			
		if(rightChild != null)
				this.rightChild.preOrder();
		}
		public void postOrder() {
			if(leftChild != null)
				this.leftChild.postOrder();
		
		if(rightChild != null)
			this.rightChild.postOrder();
                System.out.print(item + "--->");
		}
		public void inOrder(){
			if(leftChild != null)
				this.leftChild.inOrder();
			System.out.print(item + "--->");
			if(rightChild != null)
				this.rightChild.inOrder();
		}
		public void inOrder(List list) {
			if (leftChild != null) leftChild.inOrder(list);
			list.add(item);
			if (rightChild != null) rightChild.inOrder(list);
		}
		public void preOrder(List list) {
                    list.add(item);
			if (leftChild != null) leftChild.preOrder(list);
		
			if (rightChild != null) rightChild.preOrder(list);
		}
		public void postOrder(List list) {
			if (leftChild != null) leftChild.postOrder(list);
			
			if (rightChild != null) rightChild.postOrder(list);
                        list.add(item);
		}
	}

