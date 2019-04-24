.class public Lorg/c/c/b/c/b;
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
.field private b:Lorg/simpleframework/xml/Serializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/c/c/b/c/b;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/simpleframework/xml/core/Persister;

    invoke-direct {v0}, Lorg/simpleframework/xml/core/Persister;-><init>()V

    invoke-direct {p0, v0}, Lorg/c/c/b/c/b;-><init>(Lorg/simpleframework/xml/Serializer;)V

    return-void
.end method

.method public constructor <init>(Lorg/simpleframework/xml/Serializer;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lorg/c/c/j;

    sget-object v1, Lorg/c/c/j;->h:Lorg/c/c/j;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/j;->p:Lorg/c/c/j;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/j;->i:Lorg/c/c/j;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>([Lorg/c/c/j;)V

    invoke-virtual {p0, p1}, Lorg/c/c/b/c/b;->a(Lorg/simpleframework/xml/Serializer;)V

    return-void
.end method

.method private a(Lorg/c/c/c;)Ljava/nio/charset/Charset;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lorg/c/c/b/c/b;->a:Ljava/nio/charset/Charset;

    return-object p1
.end method


# virtual methods
.method protected a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 3

    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object v1

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object p2

    invoke-direct {p0, p2}, Lorg/c/c/b/c/b;->a(Lorg/c/c/c;)Ljava/nio/charset/Charset;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    :try_start_0
    iget-object p2, p0, Lorg/c/c/b/c/b;->b:Lorg/simpleframework/xml/Serializer;

    invoke-interface {p2, p1, v0}, Lorg/simpleframework/xml/Serializer;->write(Ljava/lang/Object;Ljava/io/Writer;)V

    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    new-instance v0, Lorg/c/c/b/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not write ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lorg/c/c/b/g;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public a(Lorg/simpleframework/xml/Serializer;)V
    .locals 1

    const-string v0, "\'serializer\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/c/c/b/c/b;->b:Lorg/simpleframework/xml/Serializer;

    return-void
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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lorg/c/c/b/c/b;->a(Lorg/c/c/j;)Z

    move-result p1

    return p1
.end method

.method protected b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lorg/c/c/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object v1

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object p2

    invoke-direct {p0, p2}, Lorg/c/c/b/c/b;->a(Lorg/c/c/c;)Ljava/nio/charset/Charset;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    :try_start_0
    iget-object p2, p0, Lorg/c/c/b/c/b;->b:Lorg/simpleframework/xml/Serializer;

    invoke-interface {p2, p1, v0}, Lorg/simpleframework/xml/Serializer;->read(Ljava/lang/Class;Ljava/io/Reader;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/c/a/c;

    invoke-direct {v0, p2, p1}, Lorg/c/a/c;-><init>(Ljava/lang/Object;Ljava/lang/Class;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p2

    :catch_0
    move-exception p2

    new-instance v0, Lorg/c/c/b/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not read ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
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

    const-class v0, Lorg/simpleframework/xml/Root;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/c/c/b/c/b;->b(Lorg/c/c/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
