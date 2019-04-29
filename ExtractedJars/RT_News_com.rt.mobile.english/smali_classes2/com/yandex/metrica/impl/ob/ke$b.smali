.class abstract Lcom/yandex/metrica/impl/ob/ke$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ke;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "b"
.end annotation


# instance fields
.field b:Landroid/net/Uri;

.field c:Ljava/net/Socket;


# direct methods
.method constructor <init>(Landroid/net/Uri;Ljava/net/Socket;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$b;->b:Landroid/net/Uri;

    .line 89
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ke$b;->c:Ljava/net/Socket;

    return-void
.end method

.method private static a(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "\r\n"

    .line 95
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method private static a(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 127
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/ke$b;->a(Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method a(Ljava/lang/String;Ljava/util/Map;[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 101
    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ke$b;->c:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 103
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    .line 104
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ke$b;->a(Ljava/io/OutputStream;)V

    .line 105
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 106
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {v1, v0, p2}, Lcom/yandex/metrica/impl/ob/ke$b;->a(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Content-Length"

    .line 108
    array-length p2, p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/ke$b;->a(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ke$b;->a(Ljava/io/OutputStream;)V

    .line 110
    invoke-virtual {v1, p3}, Ljava/io/OutputStream;->write([B)V

    .line 111
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 112
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ke$b;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v0, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_2

    :catch_1
    move-exception p1

    .line 114
    :goto_1
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ke$b;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 116
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    return-void

    :goto_2
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    .line 117
    throw p1
.end method

.method protected abstract a(Ljava/lang/Throwable;)V
.end method

.method protected abstract b()V
.end method
