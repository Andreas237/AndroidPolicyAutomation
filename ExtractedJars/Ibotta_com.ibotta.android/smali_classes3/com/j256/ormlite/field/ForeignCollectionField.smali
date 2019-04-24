.class public interface abstract annotation Lcom/j256/ormlite/field/ForeignCollectionField;
.super Ljava/lang/Object;
.source "ForeignCollectionField.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/j256/ormlite/field/ForeignCollectionField;
        columnName = ""
        eager = false
        foreignColumnName = ""
        foreignFieldName = ""
        maxEagerForeignCollectionLevel = 0x1
        maxEagerLevel = 0x1
        orderAscending = true
        orderColumnName = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract columnName()Ljava/lang/String;
.end method

.method public abstract eager()Z
.end method

.method public abstract foreignColumnName()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract foreignFieldName()Ljava/lang/String;
.end method

.method public abstract maxEagerForeignCollectionLevel()I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract maxEagerLevel()I
.end method

.method public abstract orderAscending()Z
.end method

.method public abstract orderColumnName()Ljava/lang/String;
.end method
