.class public interface abstract Lorg/jdom2/JDOMFactory;
.super Ljava/lang/Object;
.source "JDOMFactory.java"


# virtual methods
.method public abstract addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V
.end method

.method public abstract addNamespaceDeclaration(Lorg/jdom2/Element;Lorg/jdom2/Namespace;)V
.end method

.method public abstract attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Attribute;
.end method

.method public abstract attribute(Ljava/lang/String;Ljava/lang/String;I)Lorg/jdom2/Attribute;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract attribute(Ljava/lang/String;Ljava/lang/String;ILorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;)Lorg/jdom2/Attribute;
.end method

.method public abstract attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
.end method

.method public abstract attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
.end method

.method public abstract cdata(IILjava/lang/String;)Lorg/jdom2/CDATA;
.end method

.method public abstract cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;
.end method

.method public abstract comment(IILjava/lang/String;)Lorg/jdom2/Comment;
.end method

.method public abstract comment(Ljava/lang/String;)Lorg/jdom2/Comment;
.end method

.method public abstract docType(IILjava/lang/String;)Lorg/jdom2/DocType;
.end method

.method public abstract docType(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
.end method

.method public abstract docType(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
.end method

.method public abstract docType(Ljava/lang/String;)Lorg/jdom2/DocType;
.end method

.method public abstract docType(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
.end method

.method public abstract docType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
.end method

.method public abstract document(Lorg/jdom2/Element;)Lorg/jdom2/Document;
.end method

.method public abstract document(Lorg/jdom2/Element;Lorg/jdom2/DocType;)Lorg/jdom2/Document;
.end method

.method public abstract document(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)Lorg/jdom2/Document;
.end method

.method public abstract element(IILjava/lang/String;)Lorg/jdom2/Element;
.end method

.method public abstract element(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
.end method

.method public abstract element(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
.end method

.method public abstract element(IILjava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
.end method

.method public abstract element(Ljava/lang/String;)Lorg/jdom2/Element;
.end method

.method public abstract element(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
.end method

.method public abstract element(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
.end method

.method public abstract element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
.end method

.method public abstract entityRef(IILjava/lang/String;)Lorg/jdom2/EntityRef;
.end method

.method public abstract entityRef(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
.end method

.method public abstract entityRef(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
.end method

.method public abstract entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;
.end method

.method public abstract entityRef(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
.end method

.method public abstract entityRef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
.end method

.method public abstract processingInstruction(IILjava/lang/String;)Lorg/jdom2/ProcessingInstruction;
.end method

.method public abstract processingInstruction(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
.end method

.method public abstract processingInstruction(IILjava/lang/String;Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/jdom2/ProcessingInstruction;"
        }
    .end annotation
.end method

.method public abstract processingInstruction(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
.end method

.method public abstract processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
.end method

.method public abstract processingInstruction(Ljava/lang/String;Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/jdom2/ProcessingInstruction;"
        }
    .end annotation
.end method

.method public abstract setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V
.end method

.method public abstract setRoot(Lorg/jdom2/Document;Lorg/jdom2/Element;)V
.end method

.method public abstract text(IILjava/lang/String;)Lorg/jdom2/Text;
.end method

.method public abstract text(Ljava/lang/String;)Lorg/jdom2/Text;
.end method
