package entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-26T15:40:13")
@StaticMetamodel(ProjectUser.class)
public class ProjectUser_ { 

    public static volatile SingularAttribute<ProjectUser, Timestamp> created;
    public static volatile SingularAttribute<ProjectUser, Long> id;
    public static volatile SingularAttribute<ProjectUser, String> userName;
    public static volatile SingularAttribute<ProjectUser, String> email;

}