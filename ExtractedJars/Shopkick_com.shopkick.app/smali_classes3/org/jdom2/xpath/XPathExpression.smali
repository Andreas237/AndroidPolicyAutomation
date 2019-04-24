.class public interface abstract Lorg/jdom2/xpath/XPathExpression;
.super Ljava/lang/Object;
.source "XPathExpression.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# virtual methods
.method public abstract clone()Lorg/jdom2/xpath/XPathExpression;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract diagnose(Ljava/lang/Object;Z)Lorg/jdom2/xpath/XPathDiagnostic;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Z)",
            "Lorg/jdom2/xpath/XPathDiagnostic<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract evaluate(Ljava/lang/Object;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract evaluateFirst(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract getExpression()Ljava/lang/String;
.end method

.method public abstract getFilter()Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;
.end method

.method public abstract getNamespaces()[Lorg/jdom2/Namespace;
.end method

.method public abstract getVariable(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public abstract getVariable(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/Object;
.end method

.method public abstract setVariable(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract setVariable(Ljava/lang/String;Lorg/jdom2/Namespace;Ljava/lang/Object;)Ljava/lang/Object;
.end method
