.class public Lorg/jdom2/DefaultJDOMFactory;
.super Ljava/lang/Object;
.source "DefaultJDOMFactory.java"

# interfaces
.implements Lorg/jdom2/JDOMFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V
    .locals 1

    .line 309
    instance-of v0, p1, Lorg/jdom2/Document;

    if-eqz v0, :cond_0

    .line 310
    check-cast p1, Lorg/jdom2/Document;

    invoke-virtual {p1, p2}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    goto :goto_0

    .line 312
    :cond_0
    check-cast p1, Lorg/jdom2/Element;

    invoke-virtual {p1, p2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    :goto_0
    return-void
.end method

.method public addNamespaceDeclaration(Lorg/jdom2/Element;Lorg/jdom2/Namespace;)V
    .locals 0

    .line 323
    invoke-virtual {p1, p2}, Lorg/jdom2/Element;->addNamespaceDeclaration(Lorg/jdom2/Namespace;)Z

    return-void
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Attribute;
    .locals 1

    .line 100
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;I)Lorg/jdom2/Attribute;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 106
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2, p3}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;ILorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 88
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-static {p3}, Lorg/jdom2/AttributeType;->byIndex(I)Lorg/jdom2/AttributeType;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;)Lorg/jdom2/Attribute;
    .locals 1

    .line 111
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2, p3}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;)V

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 1

    .line 95
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 1

    .line 81
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2, p3}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public cdata(IILjava/lang/String;)Lorg/jdom2/CDATA;
    .locals 0

    .line 121
    new-instance p1, Lorg/jdom2/CDATA;

    invoke-direct {p1, p3}, Lorg/jdom2/CDATA;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public final cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;
    .locals 1

    const/4 v0, -0x1

    .line 116
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->cdata(IILjava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object p1

    return-object p1
.end method

.method public comment(IILjava/lang/String;)Lorg/jdom2/Comment;
    .locals 0

    .line 141
    new-instance p1, Lorg/jdom2/Comment;

    invoke-direct {p1, p3}, Lorg/jdom2/Comment;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public final comment(Ljava/lang/String;)Lorg/jdom2/Comment;
    .locals 1

    const/4 v0, -0x1

    .line 136
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->comment(IILjava/lang/String;)Lorg/jdom2/Comment;

    move-result-object p1

    return-object p1
.end method

.method public docType(IILjava/lang/String;)Lorg/jdom2/DocType;
    .locals 0

    .line 174
    new-instance p1, Lorg/jdom2/DocType;

    invoke-direct {p1, p3}, Lorg/jdom2/DocType;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public docType(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 0

    .line 163
    new-instance p1, Lorg/jdom2/DocType;

    invoke-direct {p1, p3, p4}, Lorg/jdom2/DocType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public docType(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 0

    .line 152
    new-instance p1, Lorg/jdom2/DocType;

    invoke-direct {p1, p3, p4, p5}, Lorg/jdom2/DocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final docType(Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 1

    const/4 v0, -0x1

    .line 168
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->docType(IILjava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    return-object p1
.end method

.method public final docType(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 1

    const/4 v0, -0x1

    .line 157
    invoke-virtual {p0, v0, v0, p1, p2}, Lorg/jdom2/DefaultJDOMFactory;->docType(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    return-object p1
.end method

.method public final docType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 6

    const/4 v1, -0x1

    const/4 v2, -0x1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 146
    invoke-virtual/range {v0 .. v5}, Lorg/jdom2/DefaultJDOMFactory;->docType(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    return-object p1
.end method

.method public document(Lorg/jdom2/Element;)Lorg/jdom2/Document;
    .locals 1

    .line 190
    new-instance v0, Lorg/jdom2/Document;

    invoke-direct {v0, p1}, Lorg/jdom2/Document;-><init>(Lorg/jdom2/Element;)V

    return-object v0
.end method

.method public document(Lorg/jdom2/Element;Lorg/jdom2/DocType;)Lorg/jdom2/Document;
    .locals 1

    .line 179
    new-instance v0, Lorg/jdom2/Document;

    invoke-direct {v0, p1, p2}, Lorg/jdom2/Document;-><init>(Lorg/jdom2/Element;Lorg/jdom2/DocType;)V

    return-object v0
.end method

.method public document(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)Lorg/jdom2/Document;
    .locals 1

    .line 185
    new-instance v0, Lorg/jdom2/Document;

    invoke-direct {v0, p1, p2, p3}, Lorg/jdom2/Document;-><init>(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)V

    return-object v0
.end method

.method public element(IILjava/lang/String;)Lorg/jdom2/Element;
    .locals 0

    .line 211
    new-instance p1, Lorg/jdom2/Element;

    invoke-direct {p1, p3}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public element(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 0

    .line 222
    new-instance p1, Lorg/jdom2/Element;

    invoke-direct {p1, p3, p4}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public element(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 0

    .line 233
    new-instance p1, Lorg/jdom2/Element;

    invoke-direct {p1, p3, p4, p5}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public element(IILjava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 0

    .line 201
    new-instance p1, Lorg/jdom2/Element;

    invoke-direct {p1, p3, p4}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-object p1
.end method

.method public final element(Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    const/4 v0, -0x1

    .line 206
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->element(IILjava/lang/String;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public final element(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    const/4 v0, -0x1

    .line 216
    invoke-virtual {p0, v0, v0, p1, p2}, Lorg/jdom2/DefaultJDOMFactory;->element(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public final element(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 6

    const/4 v1, -0x1

    const/4 v2, -0x1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 227
    invoke-virtual/range {v0 .. v5}, Lorg/jdom2/DefaultJDOMFactory;->element(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public final element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 1

    const/4 v0, -0x1

    .line 195
    invoke-virtual {p0, v0, v0, p1, p2}, Lorg/jdom2/DefaultJDOMFactory;->element(IILjava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public entityRef(IILjava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 0

    .line 278
    new-instance p1, Lorg/jdom2/EntityRef;

    invoke-direct {p1, p3}, Lorg/jdom2/EntityRef;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public entityRef(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 0

    .line 300
    new-instance p1, Lorg/jdom2/EntityRef;

    invoke-direct {p1, p3, p4}, Lorg/jdom2/EntityRef;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public entityRef(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 0

    .line 289
    new-instance p1, Lorg/jdom2/EntityRef;

    invoke-direct {p1, p3, p4, p5}, Lorg/jdom2/EntityRef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 1

    const/4 v0, -0x1

    .line 273
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->entityRef(IILjava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    return-object p1
.end method

.method public final entityRef(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 1

    const/4 v0, -0x1

    .line 294
    invoke-virtual {p0, v0, v0, p1, p2}, Lorg/jdom2/DefaultJDOMFactory;->entityRef(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    return-object p1
.end method

.method public final entityRef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 6

    const/4 v1, -0x1

    const/4 v2, -0x1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 283
    invoke-virtual/range {v0 .. v5}, Lorg/jdom2/DefaultJDOMFactory;->entityRef(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    return-object p1
.end method

.method public processingInstruction(IILjava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 0

    .line 244
    new-instance p1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {p1, p3}, Lorg/jdom2/ProcessingInstruction;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public processingInstruction(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 0

    .line 268
    new-instance p1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {p1, p3, p4}, Lorg/jdom2/ProcessingInstruction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public processingInstruction(IILjava/lang/String;Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;
    .locals 0
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

    .line 256
    new-instance p1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {p1, p3, p4}, Lorg/jdom2/ProcessingInstruction;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1
.end method

.method public final processingInstruction(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 1

    const/4 v0, -0x1

    .line 238
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->processingInstruction(IILjava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public final processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 1

    const/4 v0, -0x1

    .line 262
    invoke-virtual {p0, v0, v0, p1, p2}, Lorg/jdom2/DefaultJDOMFactory;->processingInstruction(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public final processingInstruction(Ljava/lang/String;Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;
    .locals 1
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

    const/4 v0, -0x1

    .line 250
    invoke-virtual {p0, v0, v0, p1, p2}, Lorg/jdom2/DefaultJDOMFactory;->processingInstruction(IILjava/lang/String;Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V
    .locals 0

    .line 318
    invoke-virtual {p1, p2}, Lorg/jdom2/Element;->setAttribute(Lorg/jdom2/Attribute;)Lorg/jdom2/Element;

    return-void
.end method

.method public setRoot(Lorg/jdom2/Document;Lorg/jdom2/Element;)V
    .locals 0

    .line 328
    invoke-virtual {p1, p2}, Lorg/jdom2/Document;->setRootElement(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    return-void
.end method

.method public text(IILjava/lang/String;)Lorg/jdom2/Text;
    .locals 0

    .line 131
    new-instance p1, Lorg/jdom2/Text;

    invoke-direct {p1, p3}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public final text(Ljava/lang/String;)Lorg/jdom2/Text;
    .locals 1

    const/4 v0, -0x1

    .line 126
    invoke-virtual {p0, v0, v0, p1}, Lorg/jdom2/DefaultJDOMFactory;->text(IILjava/lang/String;)Lorg/jdom2/Text;

    move-result-object p1

    return-object p1
.end method
