.class public interface abstract annotation Lio/swagger/annotations/ApiModelProperty;
.super Ljava/lang/Object;
.source "ApiModelProperty.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/ApiModelProperty;
        access = ""
        allowEmptyValue = false
        allowableValues = ""
        dataType = ""
        example = ""
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
        hidden = false
        name = ""
        notes = ""
        position = 0x0
        readOnly = false
        reference = ""
        required = false
        value = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract access()Ljava/lang/String;
.end method

.method public abstract allowEmptyValue()Z
.end method

.method public abstract allowableValues()Ljava/lang/String;
.end method

.method public abstract dataType()Ljava/lang/String;
.end method

.method public abstract example()Ljava/lang/String;
.end method

.method public abstract extensions()[Lio/swagger/annotations/Extension;
.end method

.method public abstract hidden()Z
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract notes()Ljava/lang/String;
.end method

.method public abstract position()I
.end method

.method public abstract readOnly()Z
.end method

.method public abstract reference()Ljava/lang/String;
.end method

.method public abstract required()Z
.end method

.method public abstract value()Ljava/lang/String;
.end method
