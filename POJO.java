// Welcome7.java
public class Welcome7 {
    private All all;

    public All getAll() { return all; }
    public void setAll(All value) { this.all = value; }
}

// All.java
public class All {
    private AllChildren children;

    public AllChildren getChildren() { return children; }
    public void setChildren(AllChildren value) { this.children = value; }
}

// AllChildren.java
public class AllChildren {
    private Windows windows;

    public Windows getWindows() { return windows; }
    public void setWindows(Windows value) { this.windows = value; }
}

// Windows.java
public class Windows {
    private WindowsChildren children;

    public WindowsChildren getChildren() { return children; }
    public void setChildren(WindowsChildren value) { this.children = value; }
}

// WindowsChildren.java
public class WindowsChildren {
    private SAManager saManager;

    public SAManager getSaManager() { return saManager; }
    public void setSaManager(SAManager value) { this.saManager = value; }
}

// SAManager.java
public class SAManager {
    private SAManagerChildren children;

    public SAManagerChildren getChildren() { return children; }
    public void setChildren(SAManagerChildren value) { this.children = value; }
}

// SAManagerChildren.java
public class SAManagerChildren {
    private Sa1 sa1;
    private Sa1 sa2;

    public Sa1 getSa1() { return sa1; }
    public void setSa1(Sa1 value) { this.sa1 = value; }

    public Sa1 getSa2() { return sa2; }
    public void setSa2(Sa1 value) { this.sa2 = value; }
}

// Sa1.java
public class Sa1 {
    private SA1Children children;

    public SA1Children getChildren() { return children; }
    public void setChildren(SA1Children value) { this.children = value; }
}

// SA1Children.java
public class SA1Children {
    private Dev dev;
    private Dev prod;

    public Dev getDev() { return dev; }
    public void setDev(Dev value) { this.dev = value; }

    public Dev getProd() { return prod; }
    public void setProd(Dev value) { this.prod = value; }
}

// Dev.java
public class Dev {
    private Childres childres;

    public Childres getChildres() { return childres; }
    public void setChildres(Childres value) { this.childres = value; }
}

// Childres.java

public class Childres {
    private Commvault generic;
    private Commvault iis;
    private Commvault sql;
    private Commvault commvault;

    public Commvault getGeneric() { return generic; }
    public void setGeneric(Commvault value) { this.generic = value; }

    public Commvault getIIS() { return iis; }
    public void setIIS(Commvault value) { this.iis = value; }

    public Commvault getSQL() { return sql; }
    public void setSQL(Commvault value) { this.sql = value; }

    public Commvault getCommvault() { return commvault; }
    public void setCommvault(Commvault value) { this.commvault = value; }
}

// Commvault.java

public class Commvault {
    private String hosts;

    public String getHosts() { return hosts; }
    public void setHosts(String value) { this.hosts = value; }
}
