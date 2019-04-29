.class public abstract Lcom/yandex/metrica/impl/ob/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected volatile a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 41
    iput v0, p0, Lcom/yandex/metrica/impl/ob/e;->a:I

    return-void
.end method

.method public static final a(Lcom/yandex/metrica/impl/ob/e;[B)Lcom/yandex/metrica/impl/ob/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/yandex/metrica/impl/ob/e;",
            ">(TT;[B)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yandex/metrica/impl/ob/d;
        }
    .end annotation

    const/4 v0, 0x0

    .line 130
    array-length v1, p1

    invoke-static {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;[BII)Lcom/yandex/metrica/impl/ob/e;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/yandex/metrica/impl/ob/e;[BII)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/yandex/metrica/impl/ob/e;",
            ">(TT;[BII)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yandex/metrica/impl/ob/d;
        }
    .end annotation

    .line 140
    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/a;->a([BII)Lcom/yandex/metrica/impl/ob/a;

    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;

    const/4 p2, 0x0

    .line 143
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/a;->a(I)V
    :try_end_0
    .catch Lcom/yandex/metrica/impl/ob/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 148
    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Reading from a byte array threw an IOException (should never happen)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    move-exception p0

    .line 146
    throw p0
.end method

.method public static final a(Lcom/yandex/metrica/impl/ob/e;)[B
    .locals 3

    .line 99
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/e;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 100
    array-length v1, v0

    const/4 v2, 0x0

    .line 1114
    :try_start_0
    invoke-static {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/b;->a([BII)Lcom/yandex/metrica/impl/ob/b;

    move-result-object v1

    .line 1116
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    .line 1117
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/b;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 1119
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/yandex/metrica/impl/ob/e;->a:I

    if-gez v0, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/e;->b()I

    .line 55
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/e;->a:I

    return v0
.end method

.method public abstract a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public b()I
    .locals 1

    .line 64
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 65
    iput v0, p0, Lcom/yandex/metrica/impl/ob/e;->a:I

    return v0
.end method

.method protected c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 162
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/f;->a(Lcom/yandex/metrica/impl/ob/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
