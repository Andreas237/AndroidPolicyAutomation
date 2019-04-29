.class public final Lcom/yandex/metrica/impl/ob/jc$c$g;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public b:J

.field public c:I

.field public d:J

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 55
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$g;->d()Lcom/yandex/metrica/impl/ob/jc$c$g;

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

    .line 25
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$g;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$g;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 70
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 71
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->c:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->c(II)V

    .line 72
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x3

    .line 73
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->d:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    .line 75
    :cond_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->e:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 76
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->e:Z

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 78
    :cond_1
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$g;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 104
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0x8

    if-eq v0, v1, :cond_4

    const/16 v1, 0x10

    if-eq v0, v1, :cond_3

    const/16 v1, 0x18

    if-eq v0, v1, :cond_2

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    .line 109
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 127
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->e:Z

    goto :goto_0

    .line 123
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->d:J

    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->l()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->c:I

    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->b:J

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method protected c()I
    .locals 6

    .line 83
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 84
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->b:J

    const/4 v3, 0x1

    .line 85
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 86
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->c:I

    const/4 v2, 0x2

    .line 87
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->f(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 88
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->d:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 v1, 0x3

    .line 89
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->d:J

    .line 90
    invoke-static {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 92
    :cond_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->e:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    .line 94
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jc$c$g;
    .locals 3

    const-wide/16 v0, 0x0

    .line 59
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->b:J

    const/4 v2, 0x0

    .line 60
    iput v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->c:I

    .line 61
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->d:J

    .line 62
    iput-boolean v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->e:Z

    const/4 v0, -0x1

    .line 63
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$g;->a:I

    return-object p0
.end method
