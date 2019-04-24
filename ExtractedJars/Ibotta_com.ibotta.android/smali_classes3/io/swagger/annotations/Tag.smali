.class public interface abstract annotation Lio/swagger/annotations/Tag;
.super Ljava/lang/Object;
.source "Tag.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/Tag;
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
        externalDocs = .subannotation Lio/swagger/annotations/ExternalDocs;
            url = ""
        .end subannotation
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
.method public abstract description()Ljava/lang/String;
.end method

.method public abstract extensions()[Lio/swagger/annotations/Extension;
.end method

.method public abstract externalDocs()Lio/swagger/annotations/ExternalDocs;
.end method

.method public abstract name()Ljava/lang/String;
.end method
