.class public final Lcom/yandex/metrica/impl/ob/jj$a$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public b:Lcom/yandex/metrica/impl/ob/jj$a$c;

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 415
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 416
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jj$a$a;->d()Lcom/yandex/metrica/impl/ob/jj$a$a;

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

    .line 389
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jj$a$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 430
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 431
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    const/4 v0, 0x2

    .line 433
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    const/4 v0, 0x3

    .line 434
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    .line 435
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 457
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_3

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    const/16 v1, 0x18

    if-eq v0, v1, :cond_1

    .line 462
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 479
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    goto :goto_0

    .line 475
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    goto :goto_0

    .line 468
    :cond_3
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    if-nez v0, :cond_4

    .line 469
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$c;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    .line 471
    :cond_4
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method protected c()I
    .locals 4

    .line 440
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 441
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 442
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    .line 443
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    const/4 v1, 0x2

    .line 445
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    .line 446
    invoke-static {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    .line 447
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    .line 448
    invoke-static {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jj$a$a;
    .locals 2

    const/4 v0, 0x0

    .line 420
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    const-wide/32 v0, 0xea60

    .line 421
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    const-wide/32 v0, 0x36ee80

    .line 422
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    const/4 v0, -0x1

    .line 423
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$a;->a:I

    return-object p0
.end method
