package com.yuehai.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 月海
 * @create 2022/1/17 21:50
 */

// 学生类
public class Student {
    // 课程，数组类型的属性
    private String[] courses;
    // list集合类型的属性
    private List<String> list;
    // map集合类型的属性
    private Map<String,String> maps;
    // set集合类型的属性
    private Set<String> sets;
    // 学生所学的多门课程
    private List<Course> courseList;

    // 创建属性对应的 set 方法
    public void setCourses(String[] courses) { this.courses = courses; }
    public void setList(List<String> list) { this.list = list; }
    public void setMaps(Map<String, String> maps) { this.maps = maps; }
    public void setSets(Set<String> sets) { this.sets = sets; }
    public void setCourseList(List<Course> courseList) { this.courseList = courseList; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
