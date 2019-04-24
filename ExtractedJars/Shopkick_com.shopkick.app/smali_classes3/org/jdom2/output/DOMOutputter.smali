.class public Lorg/jdom2/output/DOMOutputter;
.super Ljava/lang/Object;
.source "DOMOutputter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/DOMOutputter$DefaultDOMOutputProcessor;
    }
.end annotation


# static fields
.field private static final DEFAULT_ADAPTER:Lorg/jdom2/adapters/DOMAdapter;

.field private static final DEFAULT_PROCESSOR:Lorg/jdom2/output/support/DOMOutputProcessor;


# instance fields
.field private adapter:Lorg/jdom2/adapters/DOMAdapter;

.field private format:Lorg/jdom2/output/Format;

.field private processor:Lorg/jdom2/output/support/DOMOutputProcessor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 108
    new-instance v0, Lorg/jdom2/adapters/JAXPDOMAdapter;

    invoke-direct {v0}, Lorg/jdom2/adapters/JAXPDOMAdapter;-><init>()V

    sput-object v0, Lorg/jdom2/output/DOMOutputter;->DEFAULT_ADAPTER:Lorg/jdom2/adapters/DOMAdapter;

    .line 110
    new-instance v0, Lorg/jdom2/output/DOMOutputter$DefaultDOMOutputProcessor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jdom2/output/DOMOutputter$DefaultDOMOutputProcessor;-><init>(Lorg/jdom2/output/DOMOutputter$1;)V

    sput-object v0, Lorg/jdom2/output/DOMOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/DOMOutputProcessor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 125
    invoke-direct {p0, v0, v0, v0}, Lorg/jdom2/output/DOMOutputter;-><init>(Lorg/jdom2/adapters/DOMAdapter;Lorg/jdom2/output/Format;Lorg/jdom2/output/support/DOMOutputProcessor;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 176
    sget-object p1, Lorg/jdom2/output/DOMOutputter;->DEFAULT_ADAPTER:Lorg/jdom2/adapters/DOMAdapter;

    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    goto :goto_0

    .line 178
    :cond_0
    const-class v0, Lorg/jdom2/adapters/DOMAdapter;

    invoke-static {p1, v0}, Lorg/jdom2/internal/ReflectionConstructor;->construct(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jdom2/adapters/DOMAdapter;

    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lorg/jdom2/adapters/DOMAdapter;)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 198
    sget-object p1, Lorg/jdom2/output/DOMOutputter;->DEFAULT_ADAPTER:Lorg/jdom2/adapters/DOMAdapter;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/adapters/DOMAdapter;Lorg/jdom2/output/Format;Lorg/jdom2/output/support/DOMOutputProcessor;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 156
    sget-object p1, Lorg/jdom2/output/DOMOutputter;->DEFAULT_ADAPTER:Lorg/jdom2/adapters/DOMAdapter;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    if-nez p2, :cond_1

    .line 157
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    if-nez p3, :cond_2

    .line 158
    sget-object p3, Lorg/jdom2/output/DOMOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/DOMOutputProcessor;

    :cond_2
    iput-object p3, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/support/DOMOutputProcessor;)V
    .locals 1

    const/4 v0, 0x0

    .line 137
    invoke-direct {p0, v0, v0, p1}, Lorg/jdom2/output/DOMOutputter;-><init>(Lorg/jdom2/adapters/DOMAdapter;Lorg/jdom2/output/Format;Lorg/jdom2/output/support/DOMOutputProcessor;)V

    return-void
.end method


# virtual methods
.method public getDOMAdapter()Lorg/jdom2/adapters/DOMAdapter;
    .locals 1

    .line 208
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    return-object v0
.end method

.method public getDOMOutputProcessor()Lorg/jdom2/output/support/DOMOutputProcessor;
    .locals 1

    .line 250
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    return-object v0
.end method

.method public getForceNamespaceAware()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public getFormat()Lorg/jdom2/output/Format;
    .locals 1

    .line 229
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    return-object v0
.end method

.method public output(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Ljava/util/List<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 455
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Document;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Ljava/util/List<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 611
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 438
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 592
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 369
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 512
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 404
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 553
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/Document;)Lorg/w3c/dom/Document;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 301
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-virtual {p1}, Lorg/jdom2/Document;->getDocType()Lorg/jdom2/DocType;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/jdom2/adapters/DOMAdapter;->createDocument(Lorg/jdom2/DocType;)Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)Lorg/w3c/dom/Document;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/DocType;)Lorg/w3c/dom/DocumentType;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 322
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v0, p1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument(Lorg/jdom2/DocType;)Lorg/w3c/dom/Document;

    move-result-object p1

    invoke-interface {p1}, Lorg/w3c/dom/Document;->getDoctype()Lorg/w3c/dom/DocumentType;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/Element;)Lorg/w3c/dom/Element;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 337
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 474
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 422
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 573
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 387
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 533
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/jdom2/Text;)Lorg/w3c/dom/Text;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 353
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    invoke-interface {v1}, Lorg/jdom2/adapters/DOMAdapter;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;

    move-result-object p1

    return-object p1
.end method

.method public output(Lorg/w3c/dom/Document;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 493
    iget-object v0, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, p1, v1, p2}, Lorg/jdom2/output/support/DOMOutputProcessor;->process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;

    move-result-object p1

    return-object p1
.end method

.method public setDOMAdapter(Lorg/jdom2/adapters/DOMAdapter;)V
    .locals 0

    if-nez p1, :cond_0

    .line 219
    sget-object p1, Lorg/jdom2/output/DOMOutputter;->DEFAULT_ADAPTER:Lorg/jdom2/adapters/DOMAdapter;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->adapter:Lorg/jdom2/adapters/DOMAdapter;

    return-void
.end method

.method public setDOMOutputProcessor(Lorg/jdom2/output/support/DOMOutputProcessor;)V
    .locals 0

    if-nez p1, :cond_0

    .line 261
    sget-object p1, Lorg/jdom2/output/DOMOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/DOMOutputProcessor;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->processor:Lorg/jdom2/output/support/DOMOutputProcessor;

    return-void
.end method

.method public setForceNamespaceAware(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setFormat(Lorg/jdom2/output/Format;)V
    .locals 0

    if-nez p1, :cond_0

    .line 240
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/DOMOutputter;->format:Lorg/jdom2/output/Format;

    return-void
.end method
