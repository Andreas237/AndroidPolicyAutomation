.class public interface abstract Lorg/jdom2/filter/Filter;
.super Ljava/lang/Object;
.source "Filter.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# virtual methods
.method public abstract and(Lorg/jdom2/filter/Filter;)Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/filter/Filter<",
            "*>;)",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract filter(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract filter(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract matches(Ljava/lang/Object;)Z
.end method

.method public abstract negate()Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract or(Lorg/jdom2/filter/Filter;)Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/filter/Filter<",
            "*>;)",
            "Lorg/jdom2/filter/Filter<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract refine(Lorg/jdom2/filter/Filter;)Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TR;>;)",
            "Lorg/jdom2/filter/Filter<",
            "TR;>;"
        }
    .end annotation
.end method
