.class public interface abstract Lorg/jdom2/adapters/DOMAdapter;
.super Ljava/lang/Object;
.source "DOMAdapter.java"


# virtual methods
.method public abstract createDocument()Lorg/w3c/dom/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract createDocument(Lorg/jdom2/DocType;)Lorg/w3c/dom/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method
