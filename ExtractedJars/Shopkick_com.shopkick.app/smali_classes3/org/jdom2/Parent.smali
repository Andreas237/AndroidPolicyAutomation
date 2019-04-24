.class public interface abstract Lorg/jdom2/Parent;
.super Ljava/lang/Object;
.source "Parent.java"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lorg/jdom2/NamespaceAware;
.implements Ljava/io/Serializable;


# virtual methods
.method public abstract addContent(ILjava/util/Collection;)Lorg/jdom2/Parent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Parent;"
        }
    .end annotation
.end method

.method public abstract addContent(ILorg/jdom2/Content;)Lorg/jdom2/Parent;
.end method

.method public abstract addContent(Ljava/util/Collection;)Lorg/jdom2/Parent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Parent;"
        }
    .end annotation
.end method

.method public abstract addContent(Lorg/jdom2/Content;)Lorg/jdom2/Parent;
.end method

.method public abstract canContainContent(Lorg/jdom2/Content;IZ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/IllegalAddException;
        }
    .end annotation
.end method

.method public abstract clone()Ljava/lang/Object;
.end method

.method public abstract cloneContent()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getContent()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TE;>;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract getContent(I)Lorg/jdom2/Content;
.end method

.method public abstract getContentSize()I
.end method

.method public abstract getDescendants()Lorg/jdom2/util/IteratorIterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/util/IteratorIterable<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDescendants(Lorg/jdom2/filter/Filter;)Lorg/jdom2/util/IteratorIterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TE;>;)",
            "Lorg/jdom2/util/IteratorIterable<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract getDocument()Lorg/jdom2/Document;
.end method

.method public abstract getParent()Lorg/jdom2/Parent;
.end method

.method public abstract indexOf(Lorg/jdom2/Content;)I
.end method

.method public abstract removeContent()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TE;>;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract removeContent(I)Lorg/jdom2/Content;
.end method

.method public abstract removeContent(Lorg/jdom2/Content;)Z
.end method
