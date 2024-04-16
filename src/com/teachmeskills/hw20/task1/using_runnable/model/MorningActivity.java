package com.teachmeskills.hw20.task1.using_runnable.model;

/**
 * A thread representing morning activity
 * contains constructor morning activity
 * method "run" performing morning activities.
 */
public class MorningActivity implements Runnable {
    private String activityName;
    private int priority;

    public MorningActivity(String activityName, int priority) {
        this.activityName = activityName;
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Start " + activityName + " with priority " + priority);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish " + activityName);
    }
}
