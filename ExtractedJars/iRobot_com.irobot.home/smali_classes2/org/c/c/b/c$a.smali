.class Lorg/c/c/b/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/c/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/c/c/b/c;

.field private final b:Lorg/c/c/c;

.field private final c:Ljava/io/OutputStream;

.field private d:Z


# direct methods
.method public constructor <init>(Lorg/c/c/b/c;Ljava/io/OutputStream;)V
    .locals 0

    iput-object p1, p0, Lorg/c/c/b/c$a;->a:Lorg/c/c/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lorg/c/c/c;

    invoke-direct {p1}, Lorg/c/c/c;-><init>()V

    iput-object p1, p0, Lorg/c/c/b/c$a;->b:Lorg/c/c/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/c/c/b/c$a;->d:Z

    iput-object p2, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    return-void
.end method

.method private b()V
    .locals 6

    iget-boolean v0, p0, Lorg/c/c/b/c$a;->d:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/c/c/b/c$a;->b:Lorg/c/c/c;

    invoke-virtual {v0}, Lorg/c/c/c;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/c/c/b/c$a;->a(Ljava/lang/String;)[B

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lorg/c/c/b/c$a;->a(Ljava/lang/String;)[B

    move-result-object v3

    iget-object v4, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    iget-object v4, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    const/16 v5, 0x3a

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    iget-object v4, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    const/16 v5, 0x20

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    iget-object v4, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v3, p0, Lorg/c/c/b/c$a;->a:Lorg/c/c/b/c;

    iget-object v4, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    invoke-static {v3, v4}, Lorg/c/c/b/c;->a(Lorg/c/c/b/c;Ljava/io/OutputStream;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/c/c/b/c$a;->a:Lorg/c/c/b/c;

    iget-object v1, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    invoke-static {v0, v1}, Lorg/c/c/b/c;->a(Lorg/c/c/b/c;Ljava/io/OutputStream;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/c/c/b/c$a;->d:Z

    :cond_2
    return-void
.end method


# virtual methods
.method public a()Ljava/io/OutputStream;
    .locals 1

    invoke-direct {p0}, Lorg/c/c/b/c$a;->b()V

    iget-object v0, p0, Lorg/c/c/b/c$a;->c:Ljava/io/OutputStream;

    return-object v0
.end method

.method protected a(Ljava/lang/String;)[B
    .locals 1

    :try_start_0
    const-string v0, "US-ASCII"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getHeaders()Lorg/c/c/c;
    .locals 1

    iget-boolean v0, p0, Lorg/c/c/b/c$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/c/b/c$a;->b:Lorg/c/c/c;

    invoke-static {v0}, Lorg/c/c/c;->a(Lorg/c/c/c;)Lorg/c/c/c;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/c/c/b/c$a;->b:Lorg/c/c/c;

    return-object v0
.end method
