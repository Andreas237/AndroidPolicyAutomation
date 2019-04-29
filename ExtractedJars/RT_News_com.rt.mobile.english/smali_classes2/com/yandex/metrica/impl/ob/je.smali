.class public final Lcom/yandex/metrica/impl/ob/je;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 42
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/je;->d()Lcom/yandex/metrica/impl/ob/je;

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

    .line 14
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/je;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/je;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/je;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 57
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/je;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 59
    :cond_0
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/je;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const/4 v0, 0x2

    .line 60
    iget-wide v4, p0, Lcom/yandex/metrica/impl/ob/je;->c:J

    invoke-virtual {p1, v0, v4, v5}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 62
    :cond_1
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/je;->d:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    const/4 v0, 0x3

    .line 63
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/je;->d:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 65
    :cond_2
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/je;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_4

    const/16 v1, 0xa

    if-eq v0, v1, :cond_3

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    const/16 v1, 0x18

    if-eq v0, v1, :cond_1

    .line 96
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 110
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/je;->d:J

    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/je;->c:J

    goto :goto_0

    .line 102
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/je;->b:Ljava/lang/String;

    goto :goto_0

    :cond_4
    return-object p0
.end method

.method protected c()I
    .locals 7

    .line 70
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 71
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/je;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 72
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/je;->b:Ljava/lang/String;

    .line 73
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 75
    :cond_0
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/je;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    const/4 v1, 0x2

    .line 76
    iget-wide v5, p0, Lcom/yandex/metrica/impl/ob/je;->c:J

    .line 77
    invoke-static {v1, v5, v6}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 79
    :cond_1
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/je;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    const/4 v1, 0x3

    .line 80
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/je;->d:J

    .line 81
    invoke-static {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/je;
    .locals 2

    const-string v0, ""

    .line 46
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/je;->b:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 47
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/je;->c:J

    .line 48
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/je;->d:J

    const/4 v0, -0x1

    .line 49
    iput v0, p0, Lcom/yandex/metrica/impl/ob/je;->a:I

    return-object p0
.end method
