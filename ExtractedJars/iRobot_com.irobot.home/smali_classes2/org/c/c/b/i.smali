.class public Lorg/c/c/b/i;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/c/c/b/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/nio/charset/Charset;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/c/b/i;-><init>(Ljava/nio/charset/Charset;)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/charset/Charset;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Ljava/nio/charset/Charset;->availableCharsets()Ljava/util/SortedMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1, v0}, Lorg/c/c/b/i;-><init>(Ljava/nio/charset/Charset;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/nio/charset/Charset;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/charset/Charset;",
            "Ljava/util/List<",
            "Ljava/nio/charset/Charset;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/c/c/j;

    new-instance v1, Lorg/c/c/j;

    const-string v2, "text"

    const-string v3, "plain"

    invoke-direct {v1, v2, v3, p1}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/j;->a:Lorg/c/c/j;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>([Lorg/c/c/j;)V

    iput-boolean v2, p0, Lorg/c/c/b/i;->c:Z

    iput-object p1, p0, Lorg/c/c/b/i;->a:Ljava/nio/charset/Charset;

    iput-object p2, p0, Lorg/c/c/b/i;->b:Ljava/util/List;

    return-void
.end method

.method private c(Lorg/c/c/j;)Ljava/nio/charset/Charset;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lorg/c/c/b/i;->b()Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/i;->a(Ljava/lang/String;Lorg/c/c/j;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected a(Ljava/lang/String;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    invoke-direct {p0, p2}, Lorg/c/c/b/i;->c(Lorg/c/c/j;)Ljava/nio/charset/Charset;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    array-length p1, p1

    int-to-long p1, p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/InternalError;

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/i;->a(Ljava/lang/String;Lorg/c/c/g;)V

    return-void
.end method

.method protected a(Ljava/lang/String;Lorg/c/c/g;)V
    .locals 2

    iget-boolean v0, p0, Lorg/c/c/b/i;->c:Z

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {p0}, Lorg/c/c/b/i;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/c/c/c;->b(Ljava/util/List;)V

    :cond_0
    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/c/b/i;->c(Lorg/c/c/j;)Ljava/nio/charset/Charset;

    move-result-object v0

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p2

    invoke-direct {v1, p2, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-static {p1, v1}, Lorg/c/e/d;->a(Ljava/lang/String;Ljava/io/Writer;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/c/c/b/i;->c:Z

    return-void
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

    const-class v0, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected synthetic b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/i;->c(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/nio/charset/Charset;
    .locals 1

    iget-object v0, p0, Lorg/c/c/b/i;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method protected c(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/String;",
            ">;",
            "Lorg/c/c/d;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/c/c/b/i;->c(Lorg/c/c/j;)Ljava/nio/charset/Charset;

    move-result-object p1

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-static {v0}, Lorg/c/e/d;->a(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/b/i;->b:Ljava/util/List;

    return-object v0
.end method
