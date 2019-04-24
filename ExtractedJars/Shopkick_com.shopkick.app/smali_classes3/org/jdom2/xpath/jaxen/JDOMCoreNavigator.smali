.class Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;
.super Lorg/jaxen/DefaultNavigator;
.source "JDOMCoreNavigator.java"


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private transient emtnsmap:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lorg/jdom2/Element;",
            "[",
            "Lorg/jdom2/xpath/jaxen/NamespaceContainer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 84
    invoke-direct {p0}, Lorg/jaxen/DefaultNavigator;-><init>()V

    .line 91
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->emtnsmap:Ljava/util/IdentityHashMap;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 330
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 331
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->emtnsmap:Ljava/util/IdentityHashMap;

    return-void
.end method

.method private final recurseElementText(Lorg/jdom2/Element;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 168
    invoke-virtual {p1}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Content;

    .line 170
    instance-of v1, v0, Lorg/jdom2/Element;

    if-eqz v1, :cond_1

    .line 171
    check-cast v0, Lorg/jdom2/Element;

    invoke-direct {p0, v0, p2}, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->recurseElementText(Lorg/jdom2/Element;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 172
    :cond_1
    instance-of v1, v0, Lorg/jdom2/Text;

    if-eqz v1, :cond_0

    .line 173
    check-cast v0, Lorg/jdom2/Text;

    invoke-virtual {v0}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 336
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    return-void
.end method


# virtual methods
.method public final getAttributeAxisIterator(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/UnsupportedAxisException;
        }
    .end annotation

    .line 276
    invoke-virtual {p0, p1}, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->isElement(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/jdom2/Element;

    invoke-virtual {p1}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {p1}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    .line 279
    :cond_0
    sget-object p1, Lorg/jaxen/JaxenConstants;->EMPTY_ITERATOR:Ljava/util/Iterator;

    return-object p1
.end method

.method public final getAttributeName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 230
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributeNamespaceUri(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 225
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespaceURI()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributeQName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 216
    check-cast p1, Lorg/jdom2/Attribute;

    .line 217
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 218
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 220
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributeStringValue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 211
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getChildAxisIterator(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/UnsupportedAxisException;
        }
    .end annotation

    .line 284
    instance-of v0, p1, Lorg/jdom2/Parent;

    if-eqz v0, :cond_0

    .line 285
    check-cast p1, Lorg/jdom2/Parent;

    invoke-interface {p1}, Lorg/jdom2/Parent;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    .line 287
    :cond_0
    sget-object p1, Lorg/jaxen/JaxenConstants;->EMPTY_ITERATOR:Ljava/util/Iterator;

    return-object p1
.end method

.method public final getCommentStringValue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 206
    check-cast p1, Lorg/jdom2/Comment;

    invoke-virtual {p1}, Lorg/jdom2/Comment;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDocument(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/FunctionCallException;
        }
    .end annotation

    .line 106
    new-instance v0, Lorg/jdom2/input/SAXBuilder;

    invoke-direct {v0}, Lorg/jdom2/input/SAXBuilder;-><init>()V

    .line 108
    :try_start_0
    invoke-virtual {v0, p1}, Lorg/jdom2/input/SAXBuilder;->build(Ljava/lang/String;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catch Lorg/jdom2/JDOMException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 112
    new-instance v1, Lorg/jaxen/FunctionCallException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to access "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lorg/jaxen/FunctionCallException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :catch_1
    move-exception v0

    .line 110
    new-instance v1, Lorg/jaxen/FunctionCallException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to parse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lorg/jaxen/FunctionCallException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final getDocumentNode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 245
    instance-of v0, p1, Lorg/jdom2/Document;

    if-eqz v0, :cond_0

    return-object p1

    .line 248
    :cond_0
    instance-of v0, p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    if-eqz v0, :cond_1

    .line 249
    check-cast p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getParentElement()Lorg/jdom2/Element;

    move-result-object p1

    invoke-virtual {p1}, Lorg/jdom2/Element;->getDocument()Lorg/jdom2/Document;

    move-result-object p1

    return-object p1

    .line 251
    :cond_1
    instance-of v0, p1, Lorg/jdom2/Attribute;

    if-eqz v0, :cond_2

    .line 252
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getDocument()Lorg/jdom2/Document;

    move-result-object p1

    return-object p1

    .line 254
    :cond_2
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p1}, Lorg/jdom2/Content;->getDocument()Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public final getElementName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 201
    check-cast p1, Lorg/jdom2/Element;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getElementNamespaceUri(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 196
    check-cast p1, Lorg/jdom2/Element;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getElementQName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 187
    check-cast p1, Lorg/jdom2/Element;

    .line 188
    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 189
    invoke-virtual {p1}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 191
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getElementStringValue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    check-cast p1, Lorg/jdom2/Element;

    invoke-direct {p0, p1, v0}, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->recurseElementText(Lorg/jdom2/Element;Ljava/lang/StringBuilder;)V

    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getNamespaceAxisIterator(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/UnsupportedAxisException;
        }
    .end annotation

    .line 293
    invoke-virtual {p0, p1}, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->isElement(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 294
    sget-object p1, Lorg/jaxen/JaxenConstants;->EMPTY_ITERATOR:Ljava/util/Iterator;

    return-object p1

    .line 296
    :cond_0
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->emtnsmap:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    if-nez v0, :cond_2

    .line 298
    check-cast p1, Lorg/jdom2/Element;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v0

    .line 299
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    const/4 v2, 0x0

    .line 301
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Namespace;

    add-int/lit8 v4, v2, 0x1

    .line 302
    new-instance v5, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-direct {v5, v3, p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;-><init>(Lorg/jdom2/Namespace;Lorg/jdom2/Element;)V

    aput-object v5, v1, v2

    move v2, v4

    goto :goto_0

    .line 304
    :cond_1
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->emtnsmap:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 307
    :cond_2
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public final getNamespacePrefix(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 164
    check-cast p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getNamespaceStringValue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 159
    check-cast p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getParentAxisIterator(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/UnsupportedAxisException;
        }
    .end annotation

    .line 315
    instance-of v0, p1, Lorg/jdom2/Content;

    if-eqz v0, :cond_0

    .line 316
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p1}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object p1

    goto :goto_0

    .line 317
    :cond_0
    instance-of v0, p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    if-eqz v0, :cond_1

    .line 318
    check-cast p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getParentElement()Lorg/jdom2/Element;

    move-result-object p1

    goto :goto_0

    .line 319
    :cond_1
    instance-of v0, p1, Lorg/jdom2/Attribute;

    if-eqz v0, :cond_2

    .line 320
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 323
    new-instance v0, Lorg/jaxen/util/SingleObjectIterator;

    invoke-direct {v0, p1}, Lorg/jaxen/util/SingleObjectIterator;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 325
    :cond_3
    sget-object p1, Lorg/jaxen/JaxenConstants;->EMPTY_ITERATOR:Ljava/util/Iterator;

    return-object p1
.end method

.method public final getParentNode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/UnsupportedAxisException;
        }
    .end annotation

    .line 259
    instance-of v0, p1, Lorg/jdom2/Document;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 262
    :cond_0
    instance-of v0, p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    if-eqz v0, :cond_1

    .line 263
    check-cast p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getParentElement()Lorg/jdom2/Element;

    move-result-object p1

    return-object p1

    .line 265
    :cond_1
    instance-of v0, p1, Lorg/jdom2/Content;

    if-eqz v0, :cond_2

    .line 266
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p1}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object p1

    return-object p1

    .line 268
    :cond_2
    instance-of v0, p1, Lorg/jdom2/Attribute;

    if-eqz v0, :cond_3

    .line 269
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method public final getProcessingInstructionData(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 240
    check-cast p1, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p1}, Lorg/jdom2/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getProcessingInstructionTarget(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 235
    check-cast p1, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p1}, Lorg/jdom2/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getTextStringValue(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 154
    check-cast p1, Lorg/jdom2/Text;

    invoke-virtual {p1}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final isAttribute(Ljava/lang/Object;)Z
    .locals 0

    .line 148
    instance-of p1, p1, Lorg/jdom2/Attribute;

    return p1
.end method

.method public final isComment(Ljava/lang/Object;)Z
    .locals 0

    .line 143
    instance-of p1, p1, Lorg/jdom2/Comment;

    return p1
.end method

.method public final isDocument(Ljava/lang/Object;)Z
    .locals 0

    .line 138
    instance-of p1, p1, Lorg/jdom2/Document;

    return p1
.end method

.method public final isElement(Ljava/lang/Object;)Z
    .locals 0

    .line 133
    instance-of p1, p1, Lorg/jdom2/Element;

    return p1
.end method

.method public final isNamespace(Ljava/lang/Object;)Z
    .locals 0

    .line 128
    instance-of p1, p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    return p1
.end method

.method public final isProcessingInstruction(Ljava/lang/Object;)Z
    .locals 0

    .line 123
    instance-of p1, p1, Lorg/jdom2/ProcessingInstruction;

    return p1
.end method

.method public final isText(Ljava/lang/Object;)Z
    .locals 0

    .line 118
    instance-of p1, p1, Lorg/jdom2/Text;

    return p1
.end method

.method public final parseXPath(Ljava/lang/String;)Lorg/jaxen/XPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/saxpath/SAXPathException;
        }
    .end annotation

    .line 101
    new-instance v0, Lorg/jaxen/BaseXPath;

    invoke-direct {v0, p1, p0}, Lorg/jaxen/BaseXPath;-><init>(Ljava/lang/String;Lorg/jaxen/Navigator;)V

    return-object v0
.end method

.method reset()V
    .locals 1

    .line 95
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->emtnsmap:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    return-void
.end method
