.class public interface abstract Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMethod;
.super Ljava/lang/Object;
.source "javaElements.kt"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;
.implements Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameterListOwner;


# virtual methods
.method public abstract getHasAnnotationParameterDefaultValue()Z
.end method

.method public abstract getReturnType()Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getValueParameters()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method