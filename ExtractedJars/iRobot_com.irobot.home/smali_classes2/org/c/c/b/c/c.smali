.class public Lorg/c/c/b/c/c;
.super Lorg/c/c/b/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/c/b/c/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljavax/xml/transform/Source;",
        ">",
        "Lorg/c/c/b/c/a<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/b/c/a;-><init>()V

    return-void
.end method

.method private a(Ljavax/xml/transform/Source;)Ljava/io/ByteArrayInputStream;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljavax/xml/transform/stream/StreamResult;

    invoke-direct {v1, v0}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p0, p1, v1}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object p1
.end method


# virtual methods
.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    check-cast p1, Ljavax/xml/transform/Source;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;Lorg/c/c/j;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected a(Ljavax/xml/transform/Source;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/j;",
            ")",
            "Ljava/lang/Long;"
        }
    .end annotation

    instance-of p2, p1, Ljavax/xml/transform/dom/DOMSource;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    :try_start_0
    new-instance p2, Lorg/c/c/b/c/c$a;

    invoke-direct {p2, v0}, Lorg/c/c/b/c/c$a;-><init>(Lorg/c/c/b/c/c$1;)V

    new-instance v1, Ljavax/xml/transform/stream/StreamResult;

    invoke-direct {v1, p2}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p0, p1, v1}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    invoke-static {p2}, Lorg/c/c/b/c/c$a;->a(Lorg/c/c/b/c/c$a;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    return-object v0
.end method

.method protected synthetic a(Ljava/lang/Class;Lorg/c/c/c;Ljavax/xml/transform/Source;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lorg/c/c/b/c/c;->b(Ljava/lang/Class;Lorg/c/c/c;Ljavax/xml/transform/Source;)Ljavax/xml/transform/Source;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/c;Ljavax/xml/transform/Result;)V
    .locals 0

    check-cast p1, Ljavax/xml/transform/Source;

    invoke-virtual {p0, p1, p2, p3}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;Lorg/c/c/c;Ljavax/xml/transform/Result;)V

    return-void
.end method

.method protected a(Ljavax/xml/transform/Source;Lorg/c/c/c;Ljavax/xml/transform/Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/c;",
            "Ljavax/xml/transform/Result;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1, p3}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    new-instance v0, Lorg/c/c/b/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not transform ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "] to ["

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lorg/c/c/b/g;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, Ljavax/xml/transform/dom/DOMSource;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljavax/xml/transform/sax/SAXSource;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljavax/xml/transform/stream/StreamSource;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljavax/xml/transform/Source;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected b(Ljava/lang/Class;Lorg/c/c/c;Ljavax/xml/transform/Source;)Ljavax/xml/transform/Source;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Lorg/c/c/c;",
            "Ljavax/xml/transform/Source;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    const-class p2, Ljavax/xml/transform/dom/DOMSource;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljavax/xml/transform/dom/DOMResult;

    invoke-direct {p2}, Ljavax/xml/transform/dom/DOMResult;-><init>()V

    invoke-virtual {p0, p3, p2}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    new-instance v0, Ljavax/xml/transform/dom/DOMSource;

    invoke-virtual {p2}, Ljavax/xml/transform/dom/DOMResult;->getNode()Lorg/w3c/dom/Node;

    move-result-object p2

    invoke-direct {v0, p2}, Ljavax/xml/transform/dom/DOMSource;-><init>(Lorg/w3c/dom/Node;)V

    return-object v0

    :cond_0
    const-class p2, Ljavax/xml/transform/sax/SAXSource;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p3}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;)Ljava/io/ByteArrayInputStream;

    move-result-object p2

    new-instance v0, Ljavax/xml/transform/sax/SAXSource;

    new-instance v1, Lorg/xml/sax/InputSource;

    invoke-direct {v1, p2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljavax/xml/transform/sax/SAXSource;-><init>(Lorg/xml/sax/InputSource;)V

    return-object v0

    :cond_1
    const-class p2, Ljavax/xml/transform/stream/StreamSource;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const-class p2, Ljavax/xml/transform/Source;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Lorg/c/c/b/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read class ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]. Only DOMSource, SAXSource, and StreamSource are supported."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lorg/c/c/b/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    invoke-direct {p0, p3}, Lorg/c/c/b/c/c;->a(Ljavax/xml/transform/Source;)Ljava/io/ByteArrayInputStream;

    move-result-object p2

    new-instance v0, Ljavax/xml/transform/stream/StreamSource;

    invoke-direct {v0, p2}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p2

    new-instance v0, Lorg/c/c/b/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not transform from ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "] to ["

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
