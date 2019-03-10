package com.task;

import java.util.Objects;


public class Task {

    private String taskName;
    private String taskStatus;
    private String taskPriority;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskName, task.taskName) &&
                Objects.equals(taskStatus, task.taskStatus) &&
                Objects.equals(taskPriority, task.taskPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskStatus, taskPriority);
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }
}
