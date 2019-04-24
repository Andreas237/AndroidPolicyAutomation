.class public interface abstract Lorg/jdom2/xpath/XPathDiagnostic;
.super Ljava/lang/Object;
.source "XPathDiagnostic.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract getContext()Ljava/lang/Object;
.end method

.method public abstract getFilteredResults()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRawResults()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getResult()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract getXPathExpression()Lorg/jdom2/xpath/XPathExpression;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract isFirstOnly()Z
.end method
