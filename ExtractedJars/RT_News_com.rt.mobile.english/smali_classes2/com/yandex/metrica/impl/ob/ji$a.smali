.class public final Lcom/yandex/metrica/impl/ob/ji$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ji$a$a;
    }
.end annotation


# instance fields
.field public b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

.field public c:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 375
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 376
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ji$a;->d()Lcom/yandex/metrica/impl/ob/ji$a;

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

    .line 17
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ji$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/ji$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 389
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    .line 390
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 391
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    .line 393
    invoke-virtual {p1, v3, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 397
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_3

    .line 398
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 399
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    .line 401
    invoke-virtual {p1, v2, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 405
    :cond_3
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/ji$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 442
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_9

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    .line 447
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 474
    :cond_1
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 475
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    .line 476
    new-array v0, v0, [Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 478
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 480
    :cond_3
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_4

    .line 481
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 482
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 485
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 486
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    goto :goto_0

    .line 454
    :cond_5
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 455
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    array-length v1, v1

    :goto_3
    add-int/2addr v0, v1

    .line 456
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/ji$a$a;

    if-eqz v1, :cond_7

    .line 459
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 461
    :cond_7
    :goto_4
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_8

    .line 462
    new-instance v2, Lcom/yandex/metrica/impl/ob/ji$a$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/ji$a$a;-><init>()V

    aput-object v2, v0, v1

    .line 463
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 464
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 467
    :cond_8
    new-instance v2, Lcom/yandex/metrica/impl/ob/ji$a$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/ji$a$a;-><init>()V

    aput-object v2, v0, v1

    .line 468
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 469
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    goto/16 :goto_0

    :cond_9
    return-object p0
.end method

.method protected c()I
    .locals 6

    .line 410
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 411
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    array-length v1, v1

    if-lez v1, :cond_2

    move v1, v0

    move v0, v2

    .line 412
    :goto_0
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    array-length v4, v4

    if-ge v0, v4, :cond_1

    .line 413
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    aget-object v4, v4, v0

    if-eqz v4, :cond_0

    .line 416
    invoke-static {v3, v4}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 420
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_5

    move v1, v2

    move v4, v1

    .line 423
    :goto_1
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    array-length v5, v5

    if-ge v2, v5, :cond_4

    .line 424
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    aget-object v5, v5, v2

    if-eqz v5, :cond_3

    add-int/lit8 v4, v4, 0x1

    .line 428
    invoke-static {v5}, Lcom/yandex/metrica/impl/ob/b;->b(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v1, v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    add-int/2addr v0, v1

    mul-int/2addr v3, v4

    add-int/2addr v0, v3

    :cond_5
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/ji$a;
    .locals 1

    .line 380
    invoke-static {}, Lcom/yandex/metrica/impl/ob/ji$a$a;->d()[Lcom/yandex/metrica/impl/ob/ji$a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    .line 381
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->b:[Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    const/4 v0, -0x1

    .line 382
    iput v0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->a:I

    return-object p0
.end method
