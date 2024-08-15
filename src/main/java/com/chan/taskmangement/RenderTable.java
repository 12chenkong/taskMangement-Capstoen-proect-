package com.chan.taskmangement;

import com.chan.taskmangement.model.Member;
import com.chan.taskmangement.model.StudentTaskInfo;
import com.chan.taskmangement.model.Task;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class RenderTable {
    //this is table show member's info only
  public static void showMemberInfo(List<Member> member){
      CellStyle cellStyle=new CellStyle(CellStyle.HorizontalAlign.CENTER);
      Table table=new Table(5, BorderStyle.UNICODE_DOUBLE_BOX_WIDE, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
      table.setColumnWidth(0,5,10);
      table.setColumnWidth(1,10,100 );
      table.setColumnWidth(2,5,10);
      table.setColumnWidth(3,10,100 );
      table.setColumnWidth(4,5,10);
      table.addCell("ID",cellStyle);
      table.addCell("NAME",cellStyle);
      table.addCell("AGE",cellStyle);
      table.addCell("STATUS",cellStyle);
      table.addCell("MAJOR",cellStyle);
//      show member info via loop
       for(Member members:member){
           table.addCell(String.valueOf(members.getId()),cellStyle);
           table.addCell(String.valueOf(members.getName()),cellStyle);
           table.addCell(String.valueOf(members.getAge()),cellStyle);
           table.addCell(String.valueOf(members.getStatus()),cellStyle);
           table.addCell(String.valueOf(members.getMajor()),cellStyle);
       }
      System.out.println(table.render());


  }
  //This function show only one object
    public static void showOnlyOne(Member members){
        CellStyle cellStyle=new CellStyle(CellStyle.HorizontalAlign.CENTER);
        Table table=new Table(5, BorderStyle.UNICODE_DOUBLE_BOX_WIDE, ShownBorders.SURROUND_HEADER_AND_COLUMNS);

          table.setColumnWidth(0,5,10);
          table.setColumnWidth(1,10,100 );
          table.setColumnWidth(2,5,10);
          table.setColumnWidth(3,10,100 );
          table.setColumnWidth(4,5,10);
          table.addCell("ID",cellStyle);
          table.addCell("NAME",cellStyle);
          table.addCell("AGE",cellStyle);
          table.addCell("STATUS",cellStyle);
          table.addCell("MAJOR",cellStyle);

          table.addCell(String.valueOf(members.getId()),cellStyle);
          table.addCell(String.valueOf(members.getName()),cellStyle);
          table.addCell(String.valueOf(members.getAge()),cellStyle);
          table.addCell(String.valueOf(members.getStatus()),cellStyle);
          table.addCell(String.valueOf(members.getMajor()),cellStyle);
          System.out.println(table.render());

    }
  //this table show only task info
    public static void showTaskinfo(List<Task> tasks){
        CellStyle cellStyle=new CellStyle(CellStyle.HorizontalAlign.CENTER);
        Table table=new Table(2, BorderStyle.UNICODE_DOUBLE_BOX_WIDE, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        table.setColumnWidth(0,5,10);
        table.setColumnWidth(1,10,100 );
        table.addCell("ID",cellStyle);
        table.addCell("Task name",cellStyle);
        for (Task task:tasks){
            table.addCell( String.valueOf(task.getTask_id()),cellStyle);
            table.addCell(String.valueOf(task.getTask_name()),cellStyle);
        }

        System.out.println(table.render());

    }
    // show only student and task
    public static void showTaskStudentInfo(List<StudentTaskInfo> studentTaskInfos){
        CellStyle cellStyle=new CellStyle(CellStyle.HorizontalAlign.CENTER);
        Table table=new Table(4, BorderStyle.UNICODE_DOUBLE_BOX_WIDE, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        table.setColumnWidth(0,5,100);
        table.setColumnWidth(1,10,100 );
        table.setColumnWidth(2,5,10);
        table.setColumnWidth(3,10,100 );
        table.addCell("NAME",cellStyle);
        table.addCell("AGE",cellStyle);
        table.addCell("STATUS",cellStyle);
        table.addCell("TASK",cellStyle);
        for (StudentTaskInfo obj: studentTaskInfos){
            table.addCell(String.valueOf(obj.getName()),cellStyle);
            table.addCell(String.valueOf(obj.getAge()),cellStyle);
            table.addCell(String.valueOf(obj.getStatus()),cellStyle);
            table.addCell(String.valueOf(obj.getTask_name()),cellStyle);
        }
        System.out.println(table.render());
    }

}
