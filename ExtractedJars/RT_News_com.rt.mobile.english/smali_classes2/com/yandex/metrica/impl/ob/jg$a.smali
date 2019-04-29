.class public final Lcom/yandex/metrica/impl/ob/jg$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jg$a$a;,
        Lcom/yandex/metrica/impl/ob/jg$a$c;,
        Lcom/yandex/metrica/impl/ob/jg$a$b;
    }
.end annotation


# instance fields
.field public b:[Lcom/yandex/metrica/impl/ob/jg$a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 410
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 411
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jg$a;->d()Lcom/yandex/metrica/impl/ob/jg$a;

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
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jg$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a;

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

    .line 423
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 424
    :goto_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 425
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 427
    invoke-virtual {p1, v2, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 431
    :cond_1
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 454
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    .line 459
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 466
    :cond_1
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 467
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    .line 468
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jg$a$a;

    if-eqz v1, :cond_3

    .line 471
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 473
    :cond_3
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_4

    .line 474
    new-instance v2, Lcom/yandex/metrica/impl/ob/jg$a$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jg$a$a;-><init>()V

    aput-object v2, v0, v1

    .line 475
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 476
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 479
    :cond_4
    new-instance v2, Lcom/yandex/metrica/impl/ob/jg$a$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jg$a$a;-><init>()V

    aput-object v2, v0, v1

    .line 480
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 481
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method protected c()I
    .locals 4

    .line 436
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 437
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    array-length v1, v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    .line 438
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 439
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    aget-object v2, v2, v1

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    .line 442
    invoke-static {v3, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jg$a;
    .locals 1

    .line 415
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jg$a$a;->d()[Lcom/yandex/metrica/impl/ob/jg$a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    const/4 v0, -0x1

    .line 416
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jg$a;->a:I

    return-object p0
.end method
