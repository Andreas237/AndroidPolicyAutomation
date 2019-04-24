.class public Lorg/jdom2/Element;
.super Lorg/jdom2/Content;
.source "Element.java"

# interfaces
.implements Lorg/jdom2/Parent;


# static fields
.field private static final INITIAL_ARRAY_SIZE:I = 0x5

.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field transient additionalNamespaces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation
.end field

.field transient attributes:Lorg/jdom2/AttributeList;

.field transient content:Lorg/jdom2/ContentList;

.field protected name:Ljava/lang/String;

.field protected namespace:Lorg/jdom2/Namespace;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 147
    sget-object v0, Lorg/jdom2/Content$CType;->Element:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    .line 123
    iput-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    .line 129
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 173
    check-cast v0, Lorg/jdom2/Namespace;

    invoke-direct {p0, p1, v0}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, ""

    .line 188
    invoke-static {v0, p2}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 204
    invoke-static {p2, p3}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V
    .locals 1

    .line 160
    sget-object v0, Lorg/jdom2/Content$CType;->Element:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    .line 123
    iput-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    .line 129
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    .line 161
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->setName(Ljava/lang/String;)Lorg/jdom2/Element;

    .line 162
    invoke-virtual {p0, p2}, Lorg/jdom2/Element;->setNamespace(Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 2067
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2069
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    .line 2071
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 2074
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Namespace;

    invoke-virtual {p0, v1}, Lorg/jdom2/Element;->addNamespaceDeclaration(Lorg/jdom2/Namespace;)Z

    goto :goto_0

    .line 2077
    :cond_0
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    :goto_1
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 2079
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Attribute;

    invoke-virtual {p0, v1}, Lorg/jdom2/Element;->setAttribute(Lorg/jdom2/Attribute;)Lorg/jdom2/Element;

    goto :goto_1

    .line 2082
    :cond_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    :goto_2
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    .line 2084
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    invoke-virtual {p0, v1}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_2

    :cond_2
    return-void
.end method

.method private final resolve(Ljava/lang/String;Ljava/net/URI;)Ljava/net/URI;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-object p2

    .line 1954
    :cond_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    if-nez p2, :cond_1

    return-object v0

    .line 1958
    :cond_1
    invoke-virtual {v0, p2}, Ljava/net/URI;->resolve(Ljava/net/URI;)Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2028
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 2029
    invoke-virtual {p0}, Lorg/jdom2/Element;->hasAdditionalNamespaces()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2030
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 2031
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2033
    iget-object v3, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2036
    :cond_0
    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 2038
    :cond_1
    invoke-virtual {p0}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2039
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    invoke-virtual {v0}, Lorg/jdom2/AttributeList;->size()I

    move-result v0

    .line 2040
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_3

    .line 2042
    iget-object v3, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    invoke-virtual {v3, v2}, Lorg/jdom2/AttributeList;->get(I)Lorg/jdom2/Attribute;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 2045
    :cond_2
    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 2048
    :cond_3
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->size()I

    move-result v0

    .line 2049
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    :goto_2
    if-ge v1, v0, :cond_4

    .line 2051
    iget-object v2, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v2, v1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method


# virtual methods
.method public addContent(ILjava/util/Collection;)Lorg/jdom2/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Element;"
        }
    .end annotation

    .line 970
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->addAll(ILjava/util/Collection;)Z

    return-object p0
.end method

.method public addContent(ILorg/jdom2/Content;)Lorg/jdom2/Element;
    .locals 1

    .line 950
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    return-object p0
.end method

.method public addContent(Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 906
    new-instance v0, Lorg/jdom2/Text;

    invoke-direct {v0, p1}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public addContent(Ljava/util/Collection;)Lorg/jdom2/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Element;"
        }
    .end annotation

    .line 934
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;
    .locals 1

    .line 917
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public bridge synthetic addContent(ILjava/util/Collection;)Lorg/jdom2/Parent;
    .locals 0

    .line 105
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Element;->addContent(ILjava/util/Collection;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addContent(ILorg/jdom2/Content;)Lorg/jdom2/Parent;
    .locals 0

    .line 105
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Element;->addContent(ILorg/jdom2/Content;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addContent(Ljava/util/Collection;)Lorg/jdom2/Parent;
    .locals 0

    .line 105
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->addContent(Ljava/util/Collection;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addContent(Lorg/jdom2/Content;)Lorg/jdom2/Parent;
    .locals 0

    .line 105
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public addNamespaceDeclaration(Lorg/jdom2/Namespace;)Z
    .locals 2

    .line 385
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-nez v0, :cond_0

    .line 386
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    .line 389
    :cond_0
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Namespace;

    if-ne v1, p1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 397
    :cond_2
    invoke-static {p1, p0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Element;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 402
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 399
    :cond_3
    new-instance v1, Lorg/jdom2/IllegalAddException;

    invoke-direct {v1, p0, p1, v0}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Lorg/jdom2/Namespace;Ljava/lang/String;)V

    throw v1
.end method

.method public canContainContent(Lorg/jdom2/Content;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/IllegalAddException;
        }
    .end annotation

    .line 1833
    instance-of p1, p1, Lorg/jdom2/DocType;

    if-nez p1, :cond_0

    return-void

    .line 1834
    :cond_0
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "A DocType is not allowed except at the document level"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 105
    invoke-virtual {p0}, Lorg/jdom2/Element;->clone()Lorg/jdom2/Element;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/CloneBase;
    .locals 1

    .line 105
    invoke-virtual {p0}, Lorg/jdom2/Element;->clone()Lorg/jdom2/Element;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/Content;
    .locals 1

    .line 105
    invoke-virtual {p0}, Lorg/jdom2/Element;->clone()Lorg/jdom2/Element;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/Element;
    .locals 5

    .line 1428
    invoke-super {p0}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Element;

    .line 1441
    new-instance v1, Lorg/jdom2/ContentList;

    invoke-direct {v1, v0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v1, v0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    .line 1442
    iget-object v1, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/jdom2/AttributeList;

    invoke-direct {v1, v0}, Lorg/jdom2/AttributeList;-><init>(Lorg/jdom2/Element;)V

    :goto_0
    iput-object v1, v0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    .line 1445
    iget-object v1, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v1, v2

    .line 1446
    :goto_1
    iget-object v3, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    invoke-virtual {v3}, Lorg/jdom2/AttributeList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 1447
    iget-object v3, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    invoke-virtual {v3, v1}, Lorg/jdom2/AttributeList;->get(I)Lorg/jdom2/Attribute;

    move-result-object v3

    .line 1448
    iget-object v4, v0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    invoke-virtual {v3}, Lorg/jdom2/Attribute;->clone()Lorg/jdom2/Attribute;

    move-result-object v3

    invoke-virtual {v4, v3}, Lorg/jdom2/AttributeList;->add(Lorg/jdom2/Attribute;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1453
    :cond_1
    iget-object v1, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-eqz v1, :cond_2

    .line 1454
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    .line 1458
    :cond_2
    :goto_2
    iget-object v1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1}, Lorg/jdom2/ContentList;->size()I

    move-result v1

    if-ge v2, v1, :cond_3

    .line 1459
    iget-object v1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v2}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v1

    .line 1460
    iget-object v3, v0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v1

    invoke-virtual {v3, v1}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method public cloneContent()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 976
    invoke-virtual {p0}, Lorg/jdom2/Element;->getContentSize()I

    move-result v0

    .line 977
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 979
    invoke-virtual {p0, v2}, Lorg/jdom2/Element;->getContent(I)Lorg/jdom2/Content;

    move-result-object v3

    .line 980
    invoke-virtual {v3}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public coalesceText(Z)Z
    .locals 7

    if-eqz p1, :cond_0

    .line 707
    invoke-virtual {p0}, Lorg/jdom2/Element;->getDescendants()Lorg/jdom2/util/IteratorIterable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1}, Lorg/jdom2/ContentList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v1

    .line 711
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 712
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Content;

    .line 713
    invoke-virtual {v3}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v4

    sget-object v5, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    if-ne v4, v5, :cond_4

    .line 715
    check-cast v3, Lorg/jdom2/Text;

    const-string v4, ""

    .line 716
    invoke-virtual {v3}, Lorg/jdom2/Text;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    .line 717
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_1
    if-eqz v2, :cond_3

    .line 719
    invoke-virtual {v2}, Lorg/jdom2/Text;->getParent()Lorg/jdom2/Element;

    move-result-object v4

    invoke-virtual {v3}, Lorg/jdom2/Text;->getParent()Lorg/jdom2/Element;

    move-result-object v6

    if-eq v4, v6, :cond_2

    goto :goto_2

    .line 726
    :cond_2
    invoke-virtual {v3}, Lorg/jdom2/Text;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jdom2/Text;->append(Ljava/lang/String;)V

    .line 728
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_3
    :goto_2
    move v5, v0

    move-object v2, v3

    :goto_3
    move v0, v5

    goto :goto_1

    :cond_4
    move-object v2, v1

    goto :goto_1

    :cond_5
    return v0
.end method

.method public bridge synthetic detach()Lorg/jdom2/Content;
    .locals 1

    .line 105
    invoke-virtual {p0}, Lorg/jdom2/Element;->detach()Lorg/jdom2/Element;

    move-result-object v0

    return-object v0
.end method

.method public detach()Lorg/jdom2/Element;
    .locals 1

    .line 1828
    invoke-super {p0}, Lorg/jdom2/Content;->detach()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Element;

    return-object v0
.end method

.method public getAdditionalNamespaces()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 436
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-nez v0, :cond_0

    .line 437
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 439
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAttribute(Ljava/lang/String;)Lorg/jdom2/Attribute;
    .locals 1

    .line 1118
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->getAttribute(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public getAttribute(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 1

    .line 1132
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1135
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/AttributeList;->get(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method getAttributeList()Lorg/jdom2/AttributeList;
    .locals 1

    .line 1087
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    .line 1088
    new-instance v0, Lorg/jdom2/AttributeList;

    invoke-direct {v0, p0}, Lorg/jdom2/AttributeList;-><init>(Lorg/jdom2/Element;)V

    iput-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    .line 1090
    :cond_0
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    return-object v0
.end method

.method public getAttributeValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1149
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1152
    :cond_0
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1167
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    return-object p2

    .line 1170
    :cond_0
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0, p2}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;
    .locals 2

    .line 1185
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 1188
    :cond_0
    invoke-virtual {p0, p1, p2, v1}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1204
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    return-object p3

    .line 1207
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/AttributeList;->get(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p3

    .line 1212
    :cond_1
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAttributes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation

    .line 1105
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    return-object v0
.end method

.method public getChild(Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 1596
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public getChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 2

    .line 1578
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    new-instance v1, Lorg/jdom2/filter/ElementFilter;

    invoke-direct {v1, p1, p2}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    .line 1579
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1580
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 1581
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Element;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getChildText(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 576
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;)Lorg/jdom2/Element;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 580
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->getText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getChildText(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;
    .locals 0

    .line 628
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 632
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->getText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getChildTextNormalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 610
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;)Lorg/jdom2/Element;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 614
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->getTextNormalize()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getChildTextNormalize(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;
    .locals 0

    .line 666
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 670
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->getTextNormalize()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getChildTextTrim(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 593
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;)Lorg/jdom2/Element;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 597
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->getTextTrim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getChildTextTrim(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;
    .locals 0

    .line 647
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Element;->getChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 651
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->getTextTrim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getChildren()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 1523
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    new-instance v1, Lorg/jdom2/filter/ElementFilter;

    invoke-direct {v1}, Lorg/jdom2/filter/ElementFilter;-><init>()V

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getChildren(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 1543
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->getChildren(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getChildren(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/jdom2/Namespace;",
            ")",
            "Ljava/util/List<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 1564
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    new-instance v1, Lorg/jdom2/filter/ElementFilter;

    invoke-direct {v1, p1, p2}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 763
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    return-object v0
.end method

.method public getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;
    .locals 1
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

    .line 780
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getContent(I)Lorg/jdom2/Content;
    .locals 1

    .line 987
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public getContentSize()I
    .locals 1

    .line 479
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->size()I

    move-result v0

    return v0
.end method

.method public getDescendants()Lorg/jdom2/util/IteratorIterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/util/IteratorIterable<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 1474
    new-instance v0, Lorg/jdom2/DescendantIterator;

    invoke-direct {v0, p0}, Lorg/jdom2/DescendantIterator;-><init>(Lorg/jdom2/Parent;)V

    return-object v0
.end method

.method public getDescendants(Lorg/jdom2/filter/Filter;)Lorg/jdom2/util/IteratorIterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TF;>;)",
            "Lorg/jdom2/util/IteratorIterable<",
            "TF;>;"
        }
    .end annotation

    .line 1488
    new-instance v0, Lorg/jdom2/FilterIterator;

    new-instance v1, Lorg/jdom2/DescendantIterator;

    invoke-direct {v1, p0}, Lorg/jdom2/DescendantIterator;-><init>(Lorg/jdom2/Parent;)V

    invoke-direct {v0, v1, p1}, Lorg/jdom2/FilterIterator;-><init>(Lorg/jdom2/DescendantIterator;Lorg/jdom2/filter/Filter;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lorg/jdom2/Element;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace()Lorg/jdom2/Namespace;
    .locals 1

    .line 239
    iget-object v0, p0, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    return-object v0
.end method

.method public getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "xml"

    .line 313
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 315
    sget-object p1, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    return-object p1

    .line 319
    :cond_1
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 320
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    return-object p1

    .line 324
    :cond_2
    iget-object v1, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    .line 325
    :goto_0
    iget-object v2, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 326
    iget-object v2, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 327
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 333
    :cond_4
    iget-object v1, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-eqz v1, :cond_6

    .line 334
    invoke-virtual {v1}, Lorg/jdom2/AttributeList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Attribute;

    .line 335
    invoke-virtual {v2}, Lorg/jdom2/Attribute;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 336
    invoke-virtual {v2}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    return-object p1

    .line 342
    :cond_6
    iget-object v1, p0, Lorg/jdom2/Element;->parent:Lorg/jdom2/Parent;

    instance-of v1, v1, Lorg/jdom2/Element;

    if-eqz v1, :cond_7

    .line 343
    iget-object v0, p0, Lorg/jdom2/Element;->parent:Lorg/jdom2/Parent;

    check-cast v0, Lorg/jdom2/Element;

    invoke-virtual {v0, p1}, Lorg/jdom2/Element;->getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v0
.end method

.method public getNamespacePrefix()Ljava/lang/String;
    .locals 1

    .line 283
    iget-object v0, p0, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNamespaceURI()Ljava/lang/String;
    .locals 1

    .line 294
    iget-object v0, p0, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNamespacesInScope()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 1720
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 1721
    sget-object v1, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1722
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1723
    iget-object v1, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 1724
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAdditionalNamespaces()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 1725
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1726
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1730
    :cond_1
    iget-object v1, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-eqz v1, :cond_3

    .line 1731
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Attribute;

    .line 1732
    invoke-virtual {v2}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v2

    .line 1733
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1734
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1740
    :cond_3
    invoke-virtual {p0}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 1742
    invoke-virtual {v1}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Namespace;

    .line 1743
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 1744
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    if-nez v1, :cond_6

    const-string v1, ""

    .line 1749
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 1751
    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1754
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1755
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1756
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1757
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1759
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNamespacesInherited()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 1764
    invoke-virtual {p0}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v0

    if-nez v0, :cond_3

    .line 1765
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1766
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1767
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 1768
    sget-object v3, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-eq v2, v3, :cond_0

    sget-object v3, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v2, v3, :cond_1

    goto :goto_0

    .line 1771
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1773
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 1778
    :cond_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1779
    invoke-virtual {p0}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 1780
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1783
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1784
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Namespace;

    .line 1785
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_5

    .line 1787
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1791
    :cond_6
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNamespacesIntroduced()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 1796
    invoke-virtual {p0}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v0

    if-nez v0, :cond_3

    .line 1798
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1799
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1800
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 1801
    sget-object v3, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    if-eq v2, v3, :cond_1

    sget-object v3, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v2, v3, :cond_0

    .line 1802
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1805
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 1810
    :cond_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1811
    invoke-virtual {p0}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 1812
    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1815
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1816
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Namespace;

    .line 1817
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v3, v4, :cond_5

    .line 1819
    :cond_6
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1823
    :cond_7
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getQualifiedName()Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 360
    iget-object v1, p0, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    invoke-virtual {p0}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 364
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/Element;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 6

    .line 510
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 515
    :cond_0
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    .line 516
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    .line 517
    instance-of v1, v0, Lorg/jdom2/Text;

    if-eqz v1, :cond_1

    .line 518
    check-cast v0, Lorg/jdom2/Text;

    invoke-virtual {v0}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0

    .line 524
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move v3, v1

    .line 527
    :goto_0
    iget-object v4, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v4}, Lorg/jdom2/ContentList;->size()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 528
    iget-object v4, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v4, v1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v4

    .line 529
    instance-of v5, v4, Lorg/jdom2/Text;

    if-eqz v5, :cond_3

    .line 530
    check-cast v4, Lorg/jdom2/Text;

    invoke-virtual {v4}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-nez v3, :cond_5

    const-string v0, ""

    return-object v0

    .line 538
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTextNormalize()Ljava/lang/String;
    .locals 1

    .line 563
    invoke-virtual {p0}, Lorg/jdom2/Element;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jdom2/Text;->normalizeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTextTrim()Ljava/lang/String;
    .locals 1

    .line 550
    invoke-virtual {p0}, Lorg/jdom2/Element;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 4

    .line 452
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    invoke-virtual {p0}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Content;

    .line 455
    instance-of v3, v2, Lorg/jdom2/Element;

    if-nez v3, :cond_1

    instance-of v3, v2, Lorg/jdom2/Text;

    if-eqz v3, :cond_0

    .line 456
    :cond_1
    invoke-virtual {v2}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 459
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getXMLBaseURI()Ljava/net/URI;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    const/4 v0, 0x0

    move-object v1, v0

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_2

    .line 1987
    instance-of v2, v0, Lorg/jdom2/Element;

    if-eqz v2, :cond_0

    .line 1988
    move-object v2, v0

    check-cast v2, Lorg/jdom2/Element;

    const-string v3, "base"

    sget-object v4, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v2, v3, v4}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lorg/jdom2/Element;->resolve(Ljava/lang/String;Ljava/net/URI;)Ljava/net/URI;

    move-result-object v1

    goto :goto_1

    .line 1991
    :cond_0
    move-object v2, v0

    check-cast v2, Lorg/jdom2/Document;

    invoke-virtual {v2}, Lorg/jdom2/Document;->getBaseURI()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lorg/jdom2/Element;->resolve(Ljava/lang/String;Ljava/net/URI;)Ljava/net/URI;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_1

    .line 1993
    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    .line 1996
    :cond_1
    invoke-interface {v0}, Lorg/jdom2/Parent;->getParent()Lorg/jdom2/Parent;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public hasAdditionalNamespaces()Z
    .locals 1

    .line 1079
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasAttributes()Z
    .locals 1

    .line 1066
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/jdom2/AttributeList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public indexOf(Lorg/jdom2/Content;)I
    .locals 1

    .line 484
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isAncestor(Lorg/jdom2/Element;)Z
    .locals 1

    .line 1047
    invoke-virtual {p1}, Lorg/jdom2/Element;->getParent()Lorg/jdom2/Parent;

    move-result-object p1

    .line 1048
    :goto_0
    instance-of v0, p1, Lorg/jdom2/Element;

    if-eqz v0, :cond_1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1052
    :cond_0
    invoke-interface {p1}, Lorg/jdom2/Parent;->getParent()Lorg/jdom2/Parent;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public isRootElement()Z
    .locals 1

    .line 474
    iget-object v0, p0, Lorg/jdom2/Element;->parent:Lorg/jdom2/Parent;

    instance-of v0, v0, Lorg/jdom2/Document;

    return v0
.end method

.method public removeAttribute(Ljava/lang/String;)Z
    .locals 1

    .line 1348
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->removeAttribute(Ljava/lang/String;Lorg/jdom2/Namespace;)Z

    move-result p1

    return p1
.end method

.method public removeAttribute(Ljava/lang/String;Lorg/jdom2/Namespace;)Z
    .locals 1

    .line 1363
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1366
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/AttributeList;->remove(Ljava/lang/String;Lorg/jdom2/Namespace;)Z

    move-result p1

    return p1
.end method

.method public removeAttribute(Lorg/jdom2/Attribute;)Z
    .locals 1

    .line 1378
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1381
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jdom2/AttributeList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeChild(Ljava/lang/String;)Z
    .locals 1

    .line 1610
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->removeChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Z

    move-result p1

    return p1
.end method

.method public removeChild(Ljava/lang/String;Lorg/jdom2/Namespace;)Z
    .locals 1

    .line 1625
    new-instance v0, Lorg/jdom2/filter/ElementFilter;

    invoke-direct {v0, p1, p2}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    .line 1626
    iget-object p1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1, v0}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    .line 1627
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1628
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 1629
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1630
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeChildren(Ljava/lang/String;)Z
    .locals 1

    .line 1648
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/Element;->removeChildren(Ljava/lang/String;Lorg/jdom2/Namespace;)Z

    move-result p1

    return p1
.end method

.method public removeChildren(Ljava/lang/String;Lorg/jdom2/Namespace;)Z
    .locals 1

    .line 1665
    new-instance v0, Lorg/jdom2/filter/ElementFilter;

    invoke-direct {v0, p1, p2}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    .line 1666
    iget-object p1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1, v0}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    .line 1667
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    .line 1668
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1669
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1670
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    return p2
.end method

.method public removeContent()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 790
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 791
    iget-object v1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1}, Lorg/jdom2/ContentList;->clear()V

    return-object v0
.end method

.method public removeContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TF;>;)",
            "Ljava/util/List<",
            "TF;>;"
        }
    .end annotation

    .line 803
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 804
    iget-object v1, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, p1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 805
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 806
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    .line 807
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 808
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public removeContent(I)Lorg/jdom2/Content;
    .locals 1

    .line 1002
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public removeContent(Lorg/jdom2/Content;)Z
    .locals 1

    .line 997
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeNamespaceDeclaration(Lorg/jdom2/Namespace;)V
    .locals 1

    .line 416
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 419
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 1279
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->getAttribute(Ljava/lang/String;)Lorg/jdom2/Attribute;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1281
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1282
    invoke-virtual {p0, v0}, Lorg/jdom2/Element;->setAttribute(Lorg/jdom2/Attribute;)Lorg/jdom2/Element;

    goto :goto_0

    .line 1284
    :cond_0
    invoke-virtual {v0, p2}, Lorg/jdom2/Attribute;->setValue(Ljava/lang/String;)Lorg/jdom2/Attribute;

    :goto_0
    return-object p0
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 1

    .line 1310
    invoke-virtual {p0, p1, p3}, Lorg/jdom2/Element;->getAttribute(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1312
    new-instance v0, Lorg/jdom2/Attribute;

    invoke-direct {v0, p1, p2, p3}, Lorg/jdom2/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)V

    .line 1313
    invoke-virtual {p0, v0}, Lorg/jdom2/Element;->setAttribute(Lorg/jdom2/Attribute;)Lorg/jdom2/Element;

    goto :goto_0

    .line 1315
    :cond_0
    invoke-virtual {v0, p2}, Lorg/jdom2/Attribute;->setValue(Ljava/lang/String;)Lorg/jdom2/Attribute;

    :goto_0
    return-object p0
.end method

.method public setAttribute(Lorg/jdom2/Attribute;)Lorg/jdom2/Element;
    .locals 1

    .line 1334
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jdom2/AttributeList;->add(Lorg/jdom2/Attribute;)Z

    return-object p0
.end method

.method public setAttributes(Ljava/util/Collection;)Lorg/jdom2/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Attribute;",
            ">;)",
            "Lorg/jdom2/Element;"
        }
    .end annotation

    .line 1259
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributeList()Lorg/jdom2/AttributeList;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jdom2/AttributeList;->clearAndSet(Ljava/util/Collection;)V

    return-object p0
.end method

.method public setContent(ILorg/jdom2/Content;)Lorg/jdom2/Element;
    .locals 1

    .line 869
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    return-object p0
.end method

.method public setContent(Ljava/util/Collection;)Lorg/jdom2/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Element;"
        }
    .end annotation

    .line 849
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->clearAndSet(Ljava/util/Collection;)V

    return-object p0
.end method

.method public setContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;
    .locals 1

    .line 1033
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->clear()V

    .line 1034
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public setContent(ILjava/util/Collection;)Lorg/jdom2/Parent;
    .locals 1
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

    .line 890
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    .line 891
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->addAll(ILjava/util/Collection;)Z

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 3

    .line 225
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkElementName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 229
    iput-object p1, p0, Lorg/jdom2/Element;->name:Ljava/lang/String;

    return-object p0

    .line 227
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalNameException;

    const-string v2, "element"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public setNamespace(Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 2

    if-nez p1, :cond_0

    .line 252
    sget-object p1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    .line 255
    :cond_0
    iget-object v0, p0, Lorg/jdom2/Element;->additionalNamespaces:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 256
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAdditionalNamespaces()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 259
    :cond_1
    new-instance v1, Lorg/jdom2/IllegalAddException;

    invoke-direct {v1, p0, p1, v0}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Lorg/jdom2/Namespace;Ljava/lang/String;)V

    throw v1

    .line 262
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 263
    invoke-virtual {p0}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Attribute;

    .line 264
    invoke-static {p1, v1}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Attribute;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 267
    :cond_3
    new-instance v0, Lorg/jdom2/IllegalAddException;

    invoke-direct {v0, p0, p1, v1}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Lorg/jdom2/Namespace;Ljava/lang/String;)V

    throw v0

    .line 272
    :cond_4
    iput-object p1, p0, Lorg/jdom2/Element;->namespace:Lorg/jdom2/Namespace;

    return-object p0
.end method

.method public setText(Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 688
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->clear()V

    if-eqz p1, :cond_0

    .line 691
    new-instance v0, Lorg/jdom2/Text;

    invoke-direct {v0, p1}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    :cond_0
    return-object p0
.end method

.method public sortAttributes(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Attribute;",
            ">;)V"
        }
    .end annotation

    .line 1899
    iget-object v0, p0, Lorg/jdom2/Element;->attributes:Lorg/jdom2/AttributeList;

    if-eqz v0, :cond_0

    .line 1900
    invoke-virtual {v0, p1}, Lorg/jdom2/AttributeList;->sort(Ljava/util/Comparator;)V

    :cond_0
    return-void
.end method

.method public sortChildren(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Element;",
            ">;)V"
        }
    .end annotation

    .line 1876
    invoke-virtual {p0}, Lorg/jdom2/Element;->getChildren()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lorg/jdom2/ContentList$FilterList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList$FilterList;->sort(Ljava/util/Comparator;)V

    return-void
.end method

.method public sortContent(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .line 1856
    iget-object v0, p0, Lorg/jdom2/Element;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->sort(Ljava/util/Comparator;)V

    return-void
.end method

.method public sortContent(Lorg/jdom2/filter/Filter;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TE;>;",
            "Ljava/util/Comparator<",
            "-TE;>;)V"
        }
    .end annotation

    .line 1936
    invoke-virtual {p0, p1}, Lorg/jdom2/Element;->getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Lorg/jdom2/ContentList$FilterList;

    .line 1937
    invoke-virtual {p1, p2}, Lorg/jdom2/ContentList$FilterList;->sort(Ljava/util/Comparator;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1398
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "[Element: <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1402
    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    .line 1403
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, " [Namespace: "

    .line 1404
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, "/>]"

    .line 1409
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
