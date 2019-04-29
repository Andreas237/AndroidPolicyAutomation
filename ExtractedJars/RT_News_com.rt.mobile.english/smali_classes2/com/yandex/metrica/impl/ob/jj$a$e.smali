.class public final Lcom/yandex/metrica/impl/ob/jj$a$e;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public b:J

.field public c:Ljava/lang/String;

.field public d:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 524
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 525
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jj$a$e;->d()Lcom/yandex/metrica/impl/ob/jj$a$e;

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

    .line 498
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jj$a$e;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$e;

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

    .line 539
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    .line 540
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->c:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 541
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 542
    :goto_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v1, 0x3

    .line 543
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    aget v2, v2, v0

    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 546
    :cond_0
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$e;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 574
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_c

    const/16 v1, 0x8

    if-eq v0, v1, :cond_b

    const/16 v1, 0x12

    if-eq v0, v1, :cond_a

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-eq v0, v1, :cond_6

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_1

    .line 579
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 610
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    .line 611
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->c(I)I

    move-result v0

    .line 614
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->s()I

    move-result v1

    move v3, v2

    .line 615
    :goto_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->q()I

    move-result v4

    if-lez v4, :cond_2

    .line 616
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 619
    :cond_2
    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->e(I)V

    .line 620
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v1, v1

    :goto_2
    add-int/2addr v3, v1

    .line 621
    new-array v3, v3, [I

    if-eqz v1, :cond_4

    .line 623
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 625
    :cond_4
    :goto_3
    array-length v2, v3

    if-ge v1, v2, :cond_5

    .line 626
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v2

    aput v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 628
    :cond_5
    iput-object v3, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    .line 629
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->d(I)V

    goto :goto_0

    .line 594
    :cond_6
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 595
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v1, v1

    :goto_4
    add-int/2addr v0, v1

    .line 596
    new-array v0, v0, [I

    if-eqz v1, :cond_8

    .line 598
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 600
    :cond_8
    :goto_5
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_9

    .line 601
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v2

    aput v2, v0, v1

    .line 602
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 605
    :cond_9
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v2

    aput v2, v0, v1

    .line 606
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    goto/16 :goto_0

    .line 589
    :cond_a
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 585
    :cond_b
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->b:J

    goto/16 :goto_0

    :cond_c
    return-object p0
.end method

.method protected c()I
    .locals 5

    .line 551
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 552
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->b:J

    const/4 v3, 0x1

    .line 553
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 554
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->c:Ljava/lang/String;

    const/4 v2, 0x2

    .line 555
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 556
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v1, v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    move v2, v1

    .line 558
    :goto_0
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v4, v4

    if-ge v1, v4, :cond_0

    .line 559
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    aget v4, v4, v1

    .line 561
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/b;->g(I)I

    move-result v4

    add-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v0, v2

    .line 564
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    array-length v1, v1

    mul-int/2addr v3, v1

    add-int/2addr v0, v3

    :cond_1
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jj$a$e;
    .locals 2

    const-wide/16 v0, 0x0

    .line 529
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->b:J

    const-string v0, ""

    .line 530
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->c:Ljava/lang/String;

    .line 531
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->a:[I

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    const/4 v0, -0x1

    .line 532
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$e;->a:I

    return-object p0
.end method
