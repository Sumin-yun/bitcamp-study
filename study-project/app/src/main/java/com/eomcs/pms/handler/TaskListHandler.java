package com.eomcs.pms.handler;

import static com.eomcs.pms.handler.AbstractTaskHandler.getStatusLabel;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;

public class TaskListHandler extends AbstractTaskHandler {

  ProjectListHandler projectHandler;

  public TaskListHandler(ProjectListHandler projectHandler) {
    super(projectList);
  }


  public void list() {
    System.out.println("[작업 목록]");

    Project project = projectHandler.promptProject();
    if (project == null) {
      System.out.println("작업 등록을 취소합니다.");
      return;
    }

    printTasks(project);
  }

  @Override
  private void printTasks(Project project) {
    System.out.printf("%s:\n\n", project.getTitle());
    for (Task task : project.getTasks()) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          task.getNo(), 
          task.getContent(), 
          task.getDeadline(), 
          getStatusLabel(task.getStatus()), 
          task.getOwner().getName());
    }
  }
}





