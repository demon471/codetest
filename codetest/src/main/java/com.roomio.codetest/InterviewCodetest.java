package com.roomio.codetest;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterviewCodetest {
    //Divide the array into ten pieces
    private static final String[] allcodetype={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
       //type number of you want: ex: arr[]={2,3}

        int arr[]={0,9};

        List<String>  resultlist=combinationNumbers(arr);

        Iterator iterator =resultlist.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

    public static List combinationNumbers(int args[]){
        List<String> addlist=new ArrayList<String>();
        String concatNums="";
        for (int j = 0; j < args.length; j++) {
             concatNums+=args[j]+"";
        }
        for (int i = 0; i <concatNums.length(); i++) {
                char idx=concatNums.charAt(i);
             String strings= allcodetype[Character.getNumericValue(idx)]+"";
            addlist=concatList(addlist,strings);
        }
        return addlist;
    }

    private static List<String> concatList(List<String> addlist, String strings) {
        List<String> rs=new ArrayList<>();
        for (int i = 0; i <strings.length() ; i++) {
            if (addlist.isEmpty()){
                rs.add(strings.substring(i,i+1));
            }else {
                for (String s:addlist) {
                    rs.add(s+strings.substring(i,i+1));
                }
            }
        }
        return  rs;
    }


}
