package entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-26T15:40:13")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, Timestamp> created;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, Long> id;
    public static volatile SingularAttribute<Project, Timestamp> lastModified;

}