.class public interface abstract annotation Lio/swagger/annotations/Info;
.super Ljava/lang/Object;
.source "Info.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/Info;
        contact = .subannotation Lio/swagger/annotations/Contact;
            name = ""
        .end subannotation
        description = ""
        extensions = {
            .subannotation Lio/swagger/annotations/Extension;
                properties = {
                    .subannotation Lio/swagger/annotations/ExtensionProperty;
                        name = ""
                        value = ""
                    .end subannotation
                }
            .end subannotation
        }
        license = .subannotation Lio/swagger/annotations/License;
            name = ""
        .end subannotation
        termsOfService = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract contact()Lio/swagger/annotations/Contact;
.end method

.method public abstract description()Ljava/lang/String;
.end method

.method public abstract extensions()[Lio/swagger/annotations/Extension;
.end method

.method public abstract license()Lio/swagger/annotations/License;
.end method

.method public abstract termsOfService()Ljava/lang/String;
.end method

.method public abstract title()Ljava/lang/String;
.end method

.method public abstract version()Ljava/lang/String;
.end method
