package com.Learning.core.day3session2.hashmap.ps8;

class Employeep11 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employeep11(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employeep11 other = (Employeep11) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
