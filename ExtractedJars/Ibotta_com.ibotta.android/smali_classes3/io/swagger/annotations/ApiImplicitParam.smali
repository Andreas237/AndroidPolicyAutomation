.class public interface abstract annotation Lio/swagger/annotations/ApiImplicitParam;
.super Ljava/lang/Object;
.source "ApiImplicitParam.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/ApiImplicitParam;
        access = ""
        allowEmptyValue = false
        allowMultiple = false
        allowableValues = ""
        collectionFormat = ""
        dataType = ""
        dataTypeClass = Ljava/lang/Void;
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
        name = ""
        paramType = ""
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
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
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

.method public abstract dataType()Ljava/lang/String;
.end method

.method public abstract dataTypeClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract defaultValue()Ljava/lang/String;
.end method

.method public abstract example()Ljava/lang/String;
.end method

.method public abstract examples()Lio/swagger/annotations/Example;
.end method

.method public abstract format()Ljava/lang/String;
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract paramType()Ljava/lang/String;
.end method

.method public abstract readOnly()Z
.end method

.method public abstract required()Z
.end method

.method public abstract type()Ljava/lang/String;
.end method

.method public abstract value()Ljava/lang/String;
.end method
