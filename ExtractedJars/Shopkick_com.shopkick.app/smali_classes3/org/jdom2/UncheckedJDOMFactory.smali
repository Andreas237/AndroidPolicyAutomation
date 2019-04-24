.class public Lorg/jdom2/UncheckedJDOMFactory;
.super Lorg/jdom2/DefaultJDOMFactory;
.source "UncheckedJDOMFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V
    .locals 1

    .line 311
    instance-of v0, p1, Lorg/jdom2/Element;

    if-eqz v0, :cond_0

    .line 312
    check-cast p1, Lorg/jdom2/Element;

    .line 313
    iget-object p1, p1, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1, p2}, Lorg/jdom2/ContentList;->uncheckedAddContent(Lorg/jdom2/Content;)V

    goto :goto_0

    .line 316
    :cond_0
    check-cast p1, Lorg/jdom2/Document;

    .line 317
    iget-object p1, p1, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1, p2}, Lorg/jdom2/ContentList;->uncheckedAddContent(Lorg/jdom2/Content;)V

    :goto_0
    return-void
.end method

.method public addNamespaceDeclaration(Lorg/jdom2/Element;Lorg/jdom2/Namespace;)V
    .locals 2

    .line 328
    iget-object v0, p1, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-nez v0, :cond_0

    .line 329
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p1, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    .line 331
    :cond_0
    iget-object p1, p1, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Attribute;
    .locals 1

    .line 140
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0}, Lorg/jdom2/Attribute;-><init>()V

    .line 141
    iput-object p1, v0, Lorg/jdom2/Attribute;->name:Ljava/lang/String;

    .line 142
    iput-object p2, v0, Lorg/jdom2/Attribute;->value:Ljava/lang/String;

    .line 143
    sget-object p1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    iput-object p1, v0, Lorg/jdom2/Attribute;->namespace:Lorg/jdom2/Namespace;

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;I)Lorg/jdom2/Attribute;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 151
    invoke-static {p3}, Lorg/jdom2/AttributeType;->byIndex(I)Lorg/jdom2/AttributeType;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lorg/jdom2/UncheckedJDOMFactory;->attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;ILorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 122
    invoke-static {p3}, Lorg/jdom2/AttributeType;->byIndex(I)Lorg/jdom2/AttributeType;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/jdom2/UncheckedJDOMFactory;->attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;)Lorg/jdom2/Attribute;
    .locals 1

    .line 156
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0}, Lorg/jdom2/Attribute;-><init>()V

    .line 157
    iput-object p1, v0, Lorg/jdom2/Attribute;->name:Ljava/lang/String;

    .line 158
    iput-object p3, v0, Lorg/jdom2/Attribute;->type:Lorg/jdom2/AttributeType;

    .line 159
    iput-object p2, v0, Lorg/jdom2/Attribute;->value:Ljava/lang/String;

    .line 160
    sget-object p1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    iput-object p1, v0, Lorg/jdom2/Attribute;->namespace:Lorg/jdom2/Namespace;

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 1

    .line 127
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0}, Lorg/jdom2/Attribute;-><init>()V

    .line 128
    iput-object p1, v0, Lorg/jdom2/Attribute;->name:Ljava/lang/String;

    .line 129
    iput-object p3, v0, Lorg/jdom2/Attribute;->type:Lorg/jdom2/AttributeType;

    .line 130
    iput-object p2, v0, Lorg/jdom2/Attribute;->value:Ljava/lang/String;

    if-nez p4, :cond_0

    .line 132
    sget-object p4, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    .line 134
    :cond_0
    iput-object p4, v0, Lorg/jdom2/Attribute;->namespace:Lorg/jdom2/Namespace;

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 1

    .line 109
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0}, Lorg/jdom2/Attribute;-><init>()V

    .line 110
    iput-object p1, v0, Lorg/jdom2/Attribute;->name:Ljava/lang/String;

    .line 111
    iput-object p2, v0, Lorg/jdom2/Attribute;->value:Ljava/lang/String;

    if-nez p3, :cond_0

    .line 113
    sget-object p3, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    .line 115
    :cond_0
    iput-object p3, v0, Lorg/jdom2/Attribute;->namespace:Lorg/jdom2/Namespace;

    return-object v0
.end method

.method public cdata(IILjava/lang/String;)Lorg/jdom2/CDATA;
    .locals 0

    .line 181
    new-instance p1, Lorg/jdom2/CDATA;

    invoke-direct {p1}, Lorg/jdom2/CDATA;-><init>()V

    .line 182
    iput-object p3, p1, Lorg/jdom2/CDATA;->value:Ljava/lang/String;

    return-object p1
.end method

.method public comment(IILjava/lang/String;)Lorg/jdom2/Comment;
    .locals 0

    .line 192
    new-instance p1, Lorg/jdom2/Comment;

    invoke-direct {p1}, Lorg/jdom2/Comment;-><init>()V

    .line 193
    iput-object p3, p1, Lorg/jdom2/Comment;->text:Ljava/lang/String;

    return-object p1
.end method

.method public docType(IILjava/lang/String;)Lorg/jdom2/DocType;
    .locals 0

    const/4 p1, 0x0

    .line 273
    invoke-virtual {p0, p3, p1, p1}, Lorg/jdom2/UncheckedJDOMFactory;->docType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    return-object p1
.end method

.method public docType(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 0

    const/4 p1, 0x0

    .line 268
    invoke-virtual {p0, p3, p1, p4}, Lorg/jdom2/UncheckedJDOMFactory;->docType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    return-object p1
.end method

.method public docType(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 0

    .line 259
    new-instance p1, Lorg/jdom2/DocType;

    invoke-direct {p1}, Lorg/jdom2/DocType;-><init>()V

    .line 260
    iput-object p3, p1, Lorg/jdom2/DocType;->elementName:Ljava/lang/String;

    .line 261
    iput-object p4, p1, Lorg/jdom2/DocType;->publicID:Ljava/lang/String;

    .line 262
    iput-object p5, p1, Lorg/jdom2/DocType;->systemID:Ljava/lang/String;

    return-object p1
.end method

.method public document(Lorg/jdom2/Element;)Lorg/jdom2/Document;
    .locals 1

    const/4 v0, 0x0

    .line 302
    invoke-virtual {p0, p1, v0, v0}, Lorg/jdom2/UncheckedJDOMFactory;->document(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public document(Lorg/jdom2/Element;Lorg/jdom2/DocType;)Lorg/jdom2/Document;
    .locals 1

    const/4 v0, 0x0

    .line 297
    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/UncheckedJDOMFactory;->document(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public document(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)Lorg/jdom2/Document;
    .locals 1

    .line 282
    new-instance v0, Lorg/jdom2/Document;

    invoke-direct {v0}, Lorg/jdom2/Document;-><init>()V

    if-eqz p2, :cond_0

    .line 284
    invoke-virtual {p0, v0, p2}, Lorg/jdom2/UncheckedJDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 287
    invoke-virtual {p0, v0, p1}, Lorg/jdom2/UncheckedJDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    :cond_1
    if-eqz p3, :cond_2

    .line 290
    iput-object p3, v0, Lorg/jdom2/Document;->baseURI:Ljava/lang/String;

    :cond_2
    return-object v0
.end method

.method public element(IILjava/lang/String;)Lorg/jdom2/Element;
    .locals 0

    .line 87
    new-instance p1, Lorg/jdom2/Element;

    invoke-direct {p1}, Lorg/jdom2/Element;-><init>()V

    .line 88
    iput-object p3, p1, Lorg/jdom2/Element;->name:Ljava/lang/String;

    .line 89
    sget-object p2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    iput-object p2, p1, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    return-object p1
.end method

.method public element(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 0

    const-string p1, ""

    .line 95
    invoke-static {p1, p4}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lorg/jdom2/UncheckedJDOMFactory;->element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public element(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 0

    .line 100
    invoke-static {p4, p5}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lorg/jdom2/UncheckedJDOMFactory;->element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public element(IILjava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 0

    .line 76
    new-instance p1, Lorg/jdom2/Element;

    invoke-direct {p1}, Lorg/jdom2/Element;-><init>()V

    .line 77
    iput-object p3, p1, Lorg/jdom2/Element;->name:Ljava/lang/String;

    if-nez p4, :cond_0

    .line 79
    sget-object p4, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    .line 81
    :cond_0
    iput-object p4, p1, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    return-object p1
.end method

.method public entityRef(IILjava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 0

    .line 231
    new-instance p1, Lorg/jdom2/EntityRef;

    invoke-direct {p1}, Lorg/jdom2/EntityRef;-><init>()V

    .line 232
    iput-object p3, p1, Lorg/jdom2/EntityRef;->name:Ljava/lang/String;

    return-object p1
.end method

.method public entityRef(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 0

    .line 238
    new-instance p1, Lorg/jdom2/EntityRef;

    invoke-direct {p1}, Lorg/jdom2/EntityRef;-><init>()V

    .line 239
    iput-object p3, p1, Lorg/jdom2/EntityRef;->name:Ljava/lang/String;

    .line 240
    iput-object p4, p1, Lorg/jdom2/EntityRef;->systemID:Ljava/lang/String;

    return-object p1
.end method

.method public entityRef(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 0

    .line 246
    new-instance p1, Lorg/jdom2/EntityRef;

    invoke-direct {p1}, Lorg/jdom2/EntityRef;-><init>()V

    .line 247
    iput-object p3, p1, Lorg/jdom2/EntityRef;->name:Ljava/lang/String;

    .line 248
    iput-object p4, p1, Lorg/jdom2/EntityRef;->publicID:Ljava/lang/String;

    .line 249
    iput-object p5, p1, Lorg/jdom2/EntityRef;->systemID:Ljava/lang/String;

    return-object p1
.end method

.method public processingInstruction(IILjava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 0

    .line 219
    new-instance p1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {p1}, Lorg/jdom2/ProcessingInstruction;-><init>()V

    .line 220
    iput-object p3, p1, Lorg/jdom2/ProcessingInstruction;->target:Ljava/lang/String;

    const-string p2, ""

    .line 221
    iput-object p2, p1, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    return-object p1
.end method

.method public processingInstruction(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 0

    .line 211
    new-instance p1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {p1}, Lorg/jdom2/ProcessingInstruction;-><init>()V

    .line 212
    iput-object p3, p1, Lorg/jdom2/ProcessingInstruction;->target:Ljava/lang/String;

    .line 213
    invoke-virtual {p1, p4}, Lorg/jdom2/ProcessingInstruction;->setData(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

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

    .line 203
    new-instance p1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {p1}, Lorg/jdom2/ProcessingInstruction;-><init>()V

    .line 204
    iput-object p3, p1, Lorg/jdom2/ProcessingInstruction;->target:Ljava/lang/String;

    .line 205
    invoke-virtual {p1, p4}, Lorg/jdom2/ProcessingInstruction;->setData(Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;

    return-object p1
.end method

.method public setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V
    .locals 0

    .line 323
    invoke-virtual {p1}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/jdom2/AttributeList;->uncheckedAddAttribute(Lorg/jdom2/Attribute;)V

    return-void
.end method

.method public setRoot(Lorg/jdom2/Document;Lorg/jdom2/Element;)V
    .locals 0

    .line 336
    iget-object p1, p1, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1, p2}, Lorg/jdom2/ContentList;->uncheckedAddContent(Lorg/jdom2/Content;)V

    return-void
.end method

.method public text(IILjava/lang/String;)Lorg/jdom2/Text;
    .locals 0

    .line 170
    new-instance p1, Lorg/jdom2/Text;

    invoke-direct {p1}, Lorg/jdom2/Text;-><init>()V

    .line 171
    iput-object p3, p1, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-object p1
.end method
