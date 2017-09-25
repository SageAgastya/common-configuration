package hakerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by phanindra on 7/5/16.
 */

class Solution {
    public static class LinkedListNode {
        String val;
        LinkedListNode next;

        LinkedListNode(String node_value) {
            val = node_value;
            next = null;
        }
    }

    static int find(LinkedListNode list, LinkedListNode sublist) {

        LinkedListNode m_current = list, s_current = sublist;
        boolean match = false,completeMatch = false;
        while (s_current.val!=null){

            while (m_current.val!=null){
                if(m_current.val.equals(s_current.val)){
                    m_current = m_current.next;
                    s_current = s_current.next;
                    match = true;
                }
            }
            completeMatch = true;
        }

        return -1;

    }


    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, String val) {
        if (head == null) {
            head = new LinkedListNode(val);
        } else {
            LinkedListNode end = head;
            while (end.next != null) {
                end = end.next;
            }
            LinkedListNode node = new LinkedListNode(val);
            end.next = node;
        }
        return head;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int res;

        int _list_size = Integer.parseInt(in.nextLine()), _list_i;
        String _list_item;
        LinkedListNode _list = null;
        for (_list_i = 0; _list_i < _list_size; _list_i++) {
            try {
                _list_item = in.nextLine();
            } catch (Exception e) {
                _list_item = null;
            }
            _list = _insert_node_into_singlylinkedlist(_list, _list_item);
        }


        int _sublist_size = Integer.parseInt(in.nextLine()), _sublist_i;
        String _sublist_item;
        LinkedListNode _sublist = null;
        for (_sublist_i = 0; _sublist_i < _sublist_size; _sublist_i++) {
            try {
                _sublist_item = in.nextLine();
            } catch (Exception e) {
                _sublist_item = null;
            }
            _sublist = _insert_node_into_singlylinkedlist(_sublist, _sublist_item);
        }

        res = find(_list, _sublist);

    }


}



