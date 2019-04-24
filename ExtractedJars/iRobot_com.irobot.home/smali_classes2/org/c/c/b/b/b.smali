.class public Lorg/c/c/b/b/b;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/c/c/b/a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# instance fields
.field private b:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/c/c/b/b/b;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lorg/c/c/j;

    const-string v1, "application"

    const-string v2, "json"

    sget-object v3, Lorg/c/c/b/b/b;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2, v3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>(Lorg/c/c/j;)V

    new-instance v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>()V

    iput-object v0, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/c/c/b/b/b;->c:Z

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 2

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/c/c/b/b/b;->c(Lorg/c/c/j;)Lcom/fasterxml/jackson/core/JsonEncoding;

    move-result-object v0

    iget-object v1, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v1

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p2

    invoke-virtual {v1, p2, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p2

    :try_start_0
    iget-boolean v0, p0, Lorg/c/c/b/b/b;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "{} && "

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValue(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lorg/c/c/b/g;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not write JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/g;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method protected a(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public a(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/c/c/b/b/b;->b(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    iget-object v0, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->canDeserialize(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/c/c/b/b/b;->a(Lorg/c/c/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected b(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JavaType;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/c/c/b/b/b;->b(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/io/InputStream;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lorg/c/c/b/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public b(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/b/b/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->canSerialize(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/c/c/b/b/b;->b(Lorg/c/c/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected c(Lorg/c/c/j;)Lcom/fasterxml/jackson/core/JsonEncoding;
    .locals 6

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-static {}, Lcom/fasterxml/jackson/core/JsonEncoding;->values()[Lcom/fasterxml/jackson/core/JsonEncoding;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonEncoding;->getJavaName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    return-object p1
.end method
