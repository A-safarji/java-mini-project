/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.edu.yuc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toby
 */
public class TreeIterator implements java.util.Iterator   {
    
	private java.util.Iterator iter;
                List list = new ArrayList<>();
		public TreeIterator (BinarySearchTreeImpl bst) {
			//List list = new ArrayList<>();
                    
		bst.inOrder(list);
		iter = list.iterator();
                        
                        
		}
		@Override
		public boolean hasNext() {
			return iter.hasNext();
		}
		@Override
		public Object next() {
			return iter.next();
		}
	}
   

