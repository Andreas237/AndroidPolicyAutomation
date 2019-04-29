.class public final Lcom/yandex/metrica/impl/ob/jf$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public b:[B

.field public c:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 42
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jf$a;->d()Lcom/yandex/metrica/impl/ob/jf$a;

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jf$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jf$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->b:[B

    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 56
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf$a;->b:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->c:[B

    sget-object v1, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 59
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf$a;->c:[B

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(I[B)V

    .line 61
    :cond_1
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jf$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 83
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0xa

    if-eq v0, v1, :cond_2

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    .line 88
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 98
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->c:[B

    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->b:[B

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method protected c()I
    .locals 3

    .line 66
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 67
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf$a;->b:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 68
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jf$a;->b:[B

    .line 69
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jf$a;->c:[B

    sget-object v2, Lcom/yandex/metrica/impl/ob/g;->c:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    .line 72
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jf$a;->c:[B

    .line 73
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jf$a;
    .locals 1

    .line 46
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->b:[B

    .line 47
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->c:[B

    const/4 v0, -0x1

    .line 48
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jf$a;->a:I

    return-object p0
.end method
