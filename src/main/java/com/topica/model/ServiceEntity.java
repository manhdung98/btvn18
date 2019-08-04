package com.topica.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SERVICE", schema = "PUBLIC", catalog = "DATABASE")
public class ServiceEntity {
    private String id;
    private String name;
    private String environment;
    private String namespace;
    private String oldversion;
    private String newversion;
    private ReleaseEntity releaseByReleaseid;

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ENVIRONMENT", nullable = true, length = 30)
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Basic
    @Column(name = "NAMESPACE", nullable = true, length = 30)
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Basic
    @Column(name = "OLDVERSION", nullable = true, length = 10)
    public String getOldversion() {
        return oldversion;
    }

    public void setOldversion(String oldversion) {
        this.oldversion = oldversion;
    }

    @Basic
    @Column(name = "NEWVERSION", nullable = true, length = 10)
    public String getNewversion() {
        return newversion;
    }

    public void setNewversion(String newversion) {
        this.newversion = newversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceEntity that = (ServiceEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(environment, that.environment) &&
                Objects.equals(namespace, that.namespace) &&
                Objects.equals(oldversion, that.oldversion) &&
                Objects.equals(newversion, that.newversion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, environment, namespace, oldversion, newversion);
    }

    @ManyToOne
    @JoinColumn(name = "RELEASEID", referencedColumnName = "ID")
    public ReleaseEntity getReleaseByReleaseid() {
        return releaseByReleaseid;
    }

    public void setReleaseByReleaseid(ReleaseEntity releaseByReleaseid) {
        this.releaseByReleaseid = releaseByReleaseid;
    }
}
