.class public Lorg/jdom2/Document;
.super Lorg/jdom2/CloneBase;
.source "Document.java"

# interfaces
.implements Lorg/jdom2/Parent;


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field protected baseURI:Ljava/lang/String;

.field transient content:Lorg/jdom2/ContentList;

.field private transient propertyMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 99
    invoke-direct {p0}, Lorg/jdom2/CloneBase;-><init>()V

    .line 83
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lorg/jdom2/Document;->baseURI:Ljava/lang/String;

    .line 91
    iput-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .line 168
    invoke-direct {p0}, Lorg/jdom2/CloneBase;-><init>()V

    .line 83
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lorg/jdom2/Document;->baseURI:Ljava/lang/String;

    .line 91
    iput-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    .line 169
    invoke-virtual {p0, p1}, Lorg/jdom2/Document;->setContent(Ljava/util/Collection;)Lorg/jdom2/Document;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Element;)V
    .locals 1

    const/4 v0, 0x0

    .line 154
    invoke-direct {p0, p1, v0, v0}, Lorg/jdom2/Document;-><init>(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Element;Lorg/jdom2/DocType;)V
    .locals 1

    const/4 v0, 0x0

    .line 140
    invoke-direct {p0, p1, p2, v0}, Lorg/jdom2/Document;-><init>(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Element;Lorg/jdom2/DocType;Ljava/lang/String;)V
    .locals 1

    .line 115
    invoke-direct {p0}, Lorg/jdom2/CloneBase;-><init>()V

    .line 83
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lorg/jdom2/Document;->baseURI:Ljava/lang/String;

    .line 91
    iput-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    .line 117
    invoke-virtual {p0, p1}, Lorg/jdom2/Document;->setRootElement(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    :cond_0
    if-eqz p2, :cond_1

    .line 120
    invoke-virtual {p0, p2}, Lorg/jdom2/Document;->setDocType(Lorg/jdom2/DocType;)Lorg/jdom2/Document;

    :cond_1
    if-eqz p3, :cond_2

    .line 123
    invoke-virtual {p0, p3}, Lorg/jdom2/Document;->setBaseURI(Ljava/lang/String;)V

    :cond_2
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

    .line 912
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 914
    new-instance v0, Lorg/jdom2/ContentList;

    invoke-direct {v0, p0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    .line 916
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 918
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    invoke-virtual {p0, v1}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 893
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 894
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->size()I

    move-result v0

    .line 895
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 897
    invoke-virtual {p0, v1}, Lorg/jdom2/Document;->getContent(I)Lorg/jdom2/Content;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public addContent(ILjava/util/Collection;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Document;"
        }
    .end annotation

    .line 373
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->addAll(ILjava/util/Collection;)Z

    return-object p0
.end method

.method public addContent(ILorg/jdom2/Content;)Lorg/jdom2/Document;
    .locals 1

    .line 353
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    return-object p0
.end method

.method public addContent(Ljava/util/Collection;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Document;"
        }
    .end annotation

    .line 337
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;
    .locals 1

    .line 320
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public bridge synthetic addContent(ILjava/util/Collection;)Lorg/jdom2/Parent;
    .locals 0

    .line 75
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Document;->addContent(ILjava/util/Collection;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addContent(ILorg/jdom2/Content;)Lorg/jdom2/Parent;
    .locals 0

    .line 75
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/Document;->addContent(ILorg/jdom2/Content;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addContent(Ljava/util/Collection;)Lorg/jdom2/Parent;
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Lorg/jdom2/Document;->addContent(Ljava/util/Collection;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addContent(Lorg/jdom2/Content;)Lorg/jdom2/Parent;
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public canContainContent(Lorg/jdom2/Content;IZ)V
    .locals 1

    .line 793
    instance-of v0, p1, Lorg/jdom2/Element;

    if-eqz v0, :cond_3

    .line 794
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfFirstElement()I

    move-result v0

    if-eqz p3, :cond_0

    if-ne v0, p2, :cond_0

    return-void

    :cond_0
    if-gez v0, :cond_2

    .line 802
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfDocType()I

    move-result v0

    if-ge v0, p2, :cond_1

    goto :goto_0

    .line 803
    :cond_1
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "A root element cannot be added before the DocType"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 799
    :cond_2
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "Cannot add a second root element, only one is allowed"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 807
    :cond_3
    :goto_0
    instance-of v0, p1, Lorg/jdom2/DocType;

    if-eqz v0, :cond_7

    .line 808
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfDocType()I

    move-result v0

    if-eqz p3, :cond_4

    if-ne v0, p2, :cond_4

    return-void

    :cond_4
    if-gez v0, :cond_6

    .line 817
    iget-object p3, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p3}, Lorg/jdom2/ContentList;->indexOfFirstElement()I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_7

    if-lt p3, p2, :cond_5

    goto :goto_1

    .line 819
    :cond_5
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "A DocType cannot be added after the root element"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 814
    :cond_6
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "Cannot add a second doctype, only one is allowed"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 824
    :cond_7
    :goto_1
    instance-of p2, p1, Lorg/jdom2/CDATA;

    if-nez p2, :cond_a

    .line 828
    instance-of p2, p1, Lorg/jdom2/Text;

    if-nez p2, :cond_9

    .line 832
    instance-of p1, p1, Lorg/jdom2/EntityRef;

    if-nez p1, :cond_8

    return-void

    .line 833
    :cond_8
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "An EntityRef is not allowed at the document root"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 829
    :cond_9
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "A Text is not allowed at the document root"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 825
    :cond_a
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "A CDATA is not allowed at the document root"

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

    .line 75
    invoke-virtual {p0}, Lorg/jdom2/Document;->clone()Lorg/jdom2/Document;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/CloneBase;
    .locals 1

    .line 75
    invoke-virtual {p0}, Lorg/jdom2/Document;->clone()Lorg/jdom2/Document;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/Document;
    .locals 4

    .line 684
    invoke-super {p0}, Lorg/jdom2/CloneBase;->clone()Lorg/jdom2/CloneBase;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Document;

    .line 688
    new-instance v1, Lorg/jdom2/ContentList;

    invoke-direct {v1, v0}, Lorg/jdom2/ContentList;-><init>(Lorg/jdom2/Parent;)V

    iput-object v1, v0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    const/4 v1, 0x0

    .line 692
    :goto_0
    iget-object v2, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v2}, Lorg/jdom2/ContentList;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 693
    iget-object v2, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v2, v1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v2

    .line 694
    instance-of v3, v2, Lorg/jdom2/Element;

    if-eqz v3, :cond_0

    .line 695
    check-cast v2, Lorg/jdom2/Element;

    invoke-virtual {v2}, Lorg/jdom2/Element;->clone()Lorg/jdom2/Element;

    move-result-object v2

    .line 696
    iget-object v3, v0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v3, v2}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 698
    :cond_0
    instance-of v3, v2, Lorg/jdom2/Comment;

    if-eqz v3, :cond_1

    .line 699
    check-cast v2, Lorg/jdom2/Comment;

    invoke-virtual {v2}, Lorg/jdom2/Comment;->clone()Lorg/jdom2/Comment;

    move-result-object v2

    .line 700
    iget-object v3, v0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v3, v2}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 702
    :cond_1
    instance-of v3, v2, Lorg/jdom2/ProcessingInstruction;

    if-eqz v3, :cond_2

    .line 703
    check-cast v2, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {v2}, Lorg/jdom2/ProcessingInstruction;->clone()Lorg/jdom2/ProcessingInstruction;

    move-result-object v2

    .line 704
    iget-object v3, v0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v3, v2}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 706
    :cond_2
    instance-of v3, v2, Lorg/jdom2/DocType;

    if-eqz v3, :cond_3

    .line 707
    check-cast v2, Lorg/jdom2/DocType;

    invoke-virtual {v2}, Lorg/jdom2/DocType;->clone()Lorg/jdom2/DocType;

    move-result-object v2

    .line 708
    iget-object v3, v0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v3, v2}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
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

    .line 379
    invoke-virtual {p0}, Lorg/jdom2/Document;->getContentSize()I

    move-result v0

    .line 380
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 382
    invoke-virtual {p0, v2}, Lorg/jdom2/Document;->getContent(I)Lorg/jdom2/Content;

    move-result-object v3

    .line 383
    invoke-virtual {v3}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public detachRootElement()Lorg/jdom2/Element;
    .locals 1

    .line 252
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfFirstElement()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 255
    :cond_0
    invoke-virtual {p0, v0}, Lorg/jdom2/Document;->removeContent(I)Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Element;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getBaseURI()Ljava/lang/String;
    .locals 1

    .line 530
    iget-object v0, p0, Lorg/jdom2/Document;->baseURI:Ljava/lang/String;

    return-object v0
.end method

.method public getContent()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 414
    invoke-virtual {p0}, Lorg/jdom2/Document;->hasRootElement()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    return-object v0

    .line 415
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Root element not set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;
    .locals 1
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

    .line 434
    invoke-virtual {p0}, Lorg/jdom2/Document;->hasRootElement()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 435
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Root element not set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getContent(I)Lorg/jdom2/Content;
    .locals 1

    .line 390
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public getContentSize()I
    .locals 1

    .line 174
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

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

    .line 722
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

    .line 736
    new-instance v0, Lorg/jdom2/FilterIterator;

    new-instance v1, Lorg/jdom2/DescendantIterator;

    invoke-direct {v1, p0}, Lorg/jdom2/DescendantIterator;-><init>(Lorg/jdom2/Parent;)V

    invoke-direct {v0, v1, p1}, Lorg/jdom2/FilterIterator;-><init>(Lorg/jdom2/DescendantIterator;Lorg/jdom2/filter/Filter;)V

    return-object v0
.end method

.method public getDocType()Lorg/jdom2/DocType;
    .locals 2

    .line 266
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfDocType()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 270
    :cond_0
    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/DocType;

    return-object v0
.end method

.method public getDocument()Lorg/jdom2/Document;
    .locals 0

    return-object p0
.end method

.method public getNamespacesInScope()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 855
    new-array v0, v0, [Lorg/jdom2/Namespace;

    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNamespacesInherited()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 867
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNamespacesIntroduced()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 861
    new-array v0, v0, [Lorg/jdom2/Namespace;

    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getParent()Lorg/jdom2/Parent;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 785
    iget-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 788
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getRootElement()Lorg/jdom2/Element;
    .locals 2

    .line 218
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfFirstElement()I

    move-result v0

    if-ltz v0, :cond_0

    .line 222
    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Element;

    return-object v0

    .line 220
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Root element not set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hasRootElement()Z
    .locals 1

    .line 207
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfFirstElement()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 674
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public indexOf(Lorg/jdom2/Content;)I
    .locals 1

    .line 179
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
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

    .line 446
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 447
    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

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

    .line 459
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 460
    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, p1}, Lorg/jdom2/ContentList;->getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 461
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 462
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    .line 463
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public removeContent(I)Lorg/jdom2/Content;
    .locals 1

    .line 582
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public removeContent(Lorg/jdom2/Content;)Z
    .locals 1

    .line 577
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final setBaseURI(Ljava/lang/String;)V
    .locals 0

    .line 518
    iput-object p1, p0, Lorg/jdom2/Document;->baseURI:Ljava/lang/String;

    return-void
.end method

.method public setContent(ILjava/util/Collection;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Document;"
        }
    .end annotation

    .line 570
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    .line 571
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->addAll(ILjava/util/Collection;)Z

    return-object p0
.end method

.method public setContent(ILorg/jdom2/Content;)Lorg/jdom2/Document;
    .locals 1

    .line 549
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1, p2}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    return-object p0
.end method

.method public setContent(Ljava/util/Collection;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Lorg/jdom2/Document;"
        }
    .end annotation

    .line 504
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->clearAndSet(Ljava/util/Collection;)V

    return-object p0
.end method

.method public setContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;
    .locals 1

    .line 613
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->clear()V

    .line 614
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public setDocType(Lorg/jdom2/DocType;)Lorg/jdom2/Document;
    .locals 2

    if-nez p1, :cond_1

    .line 289
    iget-object p1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {p1}, Lorg/jdom2/ContentList;->indexOfDocType()I

    move-result p1

    if-ltz p1, :cond_0

    .line 290
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    :cond_0
    return-object p0

    .line 294
    :cond_1
    invoke-virtual {p1}, Lorg/jdom2/DocType;->getParent()Lorg/jdom2/Document;

    move-result-object v0

    if-nez v0, :cond_3

    .line 300
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfDocType()I

    move-result v0

    if-gez v0, :cond_2

    .line 302
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    goto :goto_0

    .line 305
    :cond_2
    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0, p1}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    :goto_0
    return-object p0

    .line 295
    :cond_3
    new-instance v0, Lorg/jdom2/IllegalAddException;

    const-string v1, "The DocType already is attached to a document"

    invoke-direct {v0, p1, v1}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/DocType;Ljava/lang/String;)V

    throw v0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 770
    iget-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 771
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    .line 773
    :cond_0
    iget-object v0, p0, Lorg/jdom2/Document;->propertyMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setRootElement(Lorg/jdom2/Element;)Lorg/jdom2/Document;
    .locals 2

    .line 236
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0}, Lorg/jdom2/ContentList;->indexOfFirstElement()I

    move-result v0

    if-gez v0, :cond_0

    .line 238
    iget-object v0, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v0, p1}, Lorg/jdom2/ContentList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 241
    :cond_0
    iget-object v1, p0, Lorg/jdom2/Document;->content:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0, p1}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    :goto_0
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 630
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Document: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    invoke-virtual {p0}, Lorg/jdom2/Document;->getDocType()Lorg/jdom2/DocType;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 635
    invoke-virtual {v1}, Lorg/jdom2/DocType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, " No DOCTYPE declaration, "

    .line 638
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    :goto_0
    invoke-virtual {p0}, Lorg/jdom2/Document;->hasRootElement()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lorg/jdom2/Document;->getRootElement()Lorg/jdom2/Element;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    const-string v2, "Root is "

    .line 643
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/jdom2/Element;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const-string v1, " No root element"

    .line 646
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    const-string v1, "]"

    .line 649
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
