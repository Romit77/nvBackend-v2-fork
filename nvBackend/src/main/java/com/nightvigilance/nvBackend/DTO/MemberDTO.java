package com.nightvigilance.nvBackend.DTO;

public class MemberDTO {
    private String memberName;
    private String mail;
    private int empCode;
    private String department;
    private String desig;
    private String contact;
    private String hod;
    private String reportingOfficer;
    private boolean isTeamHead;
    private boolean isShiftIncharge;
    private boolean isSecStaff;

    // Getters and Setters
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public String getReportingOfficer() {
        return reportingOfficer;
    }

    public void setReportingOfficer(String reportingOfficer) {
        this.reportingOfficer = reportingOfficer;
    }

    public boolean isTeamHead() {
        return isTeamHead;
    }

    public void setTeamHead(boolean teamHead) {
        isTeamHead = teamHead;
    }

    public boolean isShiftIncharge() {
        return isShiftIncharge;
    }

    public void setShiftIncharge(boolean shiftIncharge) {
        isShiftIncharge = shiftIncharge;
    }

    public boolean isSecStaff() {
        return isSecStaff;
    }

    public void setSecStaff(boolean secStaff) {
        isSecStaff = secStaff;
    }
}
