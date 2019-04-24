.class public abstract Lorg/jdom2/adapters/AbstractDOMAdapter;
.super Ljava/lang/Object;
.source "AbstractDOMAdapter.java"

# interfaces
.implements Lorg/jdom2/adapters/DOMAdapter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createDocument(Lorg/jdom2/DocType;)Lorg/w3c/dom/Document;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 93
    invoke-virtual {p0}, Lorg/jdom2/adapters/AbstractDOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object p1

    return-object p1

    .line 96
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/adapters/AbstractDOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    invoke-interface {v0}, Lorg/w3c/dom/Document;->getImplementation()Lorg/w3c/dom/DOMImplementation;

    move-result-object v0

    .line 97
    invoke-virtual {p1}, Lorg/jdom2/DocType;->getElementName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/jdom2/DocType;->getPublicID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lorg/jdom2/DocType;->getSystemID()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lorg/w3c/dom/DOMImplementation;->createDocumentType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/DocumentType;

    move-result-object v1

    .line 103
    invoke-virtual {p1}, Lorg/jdom2/DocType;->getInternalSubset()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/jdom2/adapters/AbstractDOMAdapter;->setInternalSubset(Lorg/w3c/dom/DocumentType;Ljava/lang/String;)V

    const-string v2, "http://temporary"

    .line 105
    invoke-virtual {p1}, Lorg/jdom2/DocType;->getElementName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1, v1}, Lorg/w3c/dom/DOMImplementation;->createDocument(Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/DocumentType;)Lorg/w3c/dom/Document;

    move-result-object p1

    .line 109
    invoke-interface {p1}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 111
    invoke-interface {p1, v0}, Lorg/w3c/dom/Document;->removeChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    :cond_1
    return-object p1
.end method

.method protected setInternalSubset(Lorg/w3c/dom/DocumentType;Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setInternalSubset"

    const/4 v2, 0x1

    .line 134
    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 136
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p2, v1, v5

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :cond_1
    :goto_0
    return-void
.end method
