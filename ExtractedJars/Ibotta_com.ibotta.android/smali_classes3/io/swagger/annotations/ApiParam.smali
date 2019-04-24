.class public interface abstract annotation Lio/swagger/annotations/ApiParam;
.super Ljava/lang/Object;
.source "ApiParam.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/ApiParam;
        access = ""
        allowEmptyValue = false
        allowMultiple = false
        allowableValues = ""
        collectionFormat = ""
        defaultValue = ""
        example = ""
        examples = .subannotation Lio/swagger/annotations/Example;
            value = {
                .subannotation Lio/swagger/annotations/ExampleProperty;
                    mediaType = ""
                    value = ""
                .end subannotation
            }
        .end subannotation
        format = ""
        hidden = false
        name = ""
        readOnly = false
        required = false
        type = ""
        value = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract access()Ljava/lang/String;
.end method

.method public abstract allowEmptyValue()Z
.end method

.method public abstract allowMultiple()Z
.end method

.method public abstract allowableValues()Ljava/lang/String;
.end method

.method public abstract collectionFormat()Ljava/lang/String;
.end method

.method public abstract defaultValue()Ljava/lang/String;
.end method

.method public abstract example()Ljava/lang/String;
.end method

.method public abstract examples()Lio/swagger/annotations/Example;
.end method

.method public abstract format()Ljava/lang/String;
.end method

.method public abstract hidden()Z
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract readOnly()Z
.end method

.method public abstract required()Z
.end method

.method public abstract type()Ljava/lang/String;
.end method

.method public abstract value()Ljava/lang/String;
.end method
