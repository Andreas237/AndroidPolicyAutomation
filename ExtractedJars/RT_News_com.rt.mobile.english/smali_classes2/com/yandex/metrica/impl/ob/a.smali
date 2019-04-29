.class public final Lcom/yandex/metrica/impl/ob/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 403
    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    const/16 v0, 0x40

    .line 407
    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->i:I

    .line 416
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/a;->a:[B

    .line 417
    iput p2, p0, Lcom/yandex/metrica/impl/ob/a;->b:I

    add-int/2addr p3, p2

    .line 418
    iput p3, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    .line 419
    iput p2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    return-void
.end method

.method public static a([BII)Lcom/yandex/metrica/impl/ob/a;
    .locals 1

    .line 60
    new-instance v0, Lcom/yandex/metrica/impl/ob/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/yandex/metrica/impl/ob/a;-><init>([BII)V

    return-object v0
.end method

.method private u()V
    .locals 2

    .line 493
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    .line 494
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    .line 495
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    if-le v0, v1, :cond_0

    .line 497
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->d:I

    .line 498
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 500
    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->d:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 71
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 72
    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->f:I

    return v0

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->f:I

    .line 77
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->f:I

    if-nez v0, :cond_1

    .line 79
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->d()Lcom/yandex/metrica/impl/ob/d;

    move-result-object v0

    throw v0

    .line 81
    :cond_1
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->f:I

    return v0
.end method

.method public a(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yandex/metrica/impl/ob/d;
        }
    .end annotation

    .line 94
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->f:I

    if-eq v0, p1, :cond_0

    .line 95
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->e()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    :cond_0
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 217
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    .line 218
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->h:I

    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->i:I

    if-lt v1, v2, :cond_0

    .line 219
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->g()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 221
    :cond_0
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/a;->c(I)I

    move-result v0

    .line 222
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/yandex/metrica/impl/ob/a;->h:I

    .line 223
    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;

    const/4 p1, 0x0

    .line 224
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->a(I)V

    .line 225
    iget p1, p0, Lcom/yandex/metrica/impl/ob/a;->h:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/yandex/metrica/impl/ob/a;->h:I

    .line 226
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/a;->d(I)V

    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 138
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/a;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public b(I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 106
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/g;->a(I)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 128
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->f()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 125
    :pswitch_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->o()I

    return v1

    :pswitch_1
    const/4 p1, 0x0

    return p1

    .line 117
    :pswitch_2
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->b()V

    .line 118
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/g;->b(I)I

    move-result p1

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->a(I)V

    return v1

    .line 114
    :pswitch_3
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->g(I)V

    return v1

    .line 111
    :pswitch_4
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->p()J

    return v1

    .line 108
    :pswitch_5
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->g()I

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public c(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yandex/metrica/impl/ob/d;
        }
    .end annotation

    if-gez p1, :cond_0

    .line 478
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->b()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 480
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr p1, v0

    .line 481
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    if-le p1, v0, :cond_1

    .line 483
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->a()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 485
    :cond_1
    iput p1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    .line 487
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/a;->u()V

    return v0
.end method

.method public d()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 154
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 510
    iput p1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    .line 511
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/a;->u()V

    return-void
.end method

.method public e()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 159
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public e(I)V
    .locals 3

    .line 564
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->b:I

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_0

    .line 565
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is beyond current "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->b:I

    sub-int/2addr p1, v2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-gez p1, :cond_1

    .line 569
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 571
    :cond_1
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    return-void
.end method

.method public f()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 164
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public f(I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-gez p1, :cond_0

    .line 595
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->b()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 598
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr v0, p1

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    if-le v0, v1, :cond_1

    .line 600
    iget p1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->g(I)V

    .line 602
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->a()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 605
    :cond_1
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_2

    .line 607
    new-array v0, p1, [B

    .line 608
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/a;->a:[B

    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 609
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    return-object v0

    .line 612
    :cond_2
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->a()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1
.end method

.method public g()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 169
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    return v0
.end method

.method public g(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-gez p1, :cond_0

    .line 624
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->b()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 627
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr v0, p1

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    if-le v0, v1, :cond_1

    .line 629
    iget p1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->g(I)V

    .line 631
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->a()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1

    .line 634
    :cond_1
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_2

    .line 636
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    return-void

    .line 638
    :cond_2
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->a()Lcom/yandex/metrica/impl/ob/d;

    move-result-object p1

    throw p1
.end method

.method public h()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 189
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    .line 190
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    if-lez v0, :cond_0

    .line 193
    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/a;->a:[B

    iget v3, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    const-string v4, "UTF-8"

    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 194
    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    return-object v1

    .line 198
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/a;->f(I)[B

    move-result-object v0

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method public j()[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 231
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    .line 232
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    if-lez v0, :cond_0

    .line 235
    new-array v1, v0, [B

    .line 236
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/a;->a:[B

    iget v3, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 237
    iget v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    return-object v1

    .line 241
    :cond_0
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/a;->f(I)[B

    move-result-object v0

    return-object v0
.end method

.method public k()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 247
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    return v0
.end method

.method public l()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 270
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x1

    and-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    xor-int/2addr v0, v1

    return v0
.end method

.method public m()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 285
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    and-int/lit8 v0, v0, 0x7f

    .line 290
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v1

    if-ltz v1, :cond_1

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    .line 294
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v1

    if-ltz v1, :cond_2

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    goto :goto_1

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    .line 298
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v1

    if-ltz v1, :cond_3

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    goto :goto_1

    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    .line 302
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v1

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    if-gez v1, :cond_6

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    .line 306
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v2

    if-ltz v2, :cond_4

    return v0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 310
    :cond_5
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->c()Lcom/yandex/metrica/impl/ob/d;

    move-result-object v0

    throw v0

    :cond_6
    :goto_1
    return v0
.end method

.method public n()J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v0, v3, :cond_1

    .line 323
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v0

    or-long v6, v1, v4

    and-int/lit16 v1, v3, 0x80

    if-nez v1, :cond_0

    return-wide v6

    :cond_0
    add-int/lit8 v0, v0, 0x7

    move-wide v1, v6

    goto :goto_0

    .line 330
    :cond_1
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->c()Lcom/yandex/metrica/impl/ob/d;

    move-result-object v0

    throw v0
.end method

.method public o()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 335
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v0

    .line 336
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v1

    .line 337
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v2

    .line 338
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v3

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public p()J
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 347
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v0

    .line 348
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v1

    .line 349
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v2

    .line 350
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v3

    .line 351
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v4

    .line 352
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v5

    .line 353
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v6

    .line 354
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->t()B

    move-result v7

    int-to-long v8, v0

    const-wide/16 v10, 0xff

    and-long v12, v8, v10

    int-to-long v0, v1

    and-long v8, v0, v10

    const/16 v0, 0x8

    shl-long v0, v8, v0

    or-long v8, v12, v0

    int-to-long v0, v2

    and-long v12, v0, v10

    const/16 v0, 0x10

    shl-long v0, v12, v0

    or-long v12, v8, v0

    int-to-long v0, v3

    and-long v2, v0, v10

    const/16 v0, 0x18

    shl-long v0, v2, v0

    or-long v2, v12, v0

    int-to-long v0, v4

    and-long v8, v0, v10

    const/16 v0, 0x20

    shl-long v0, v8, v0

    or-long v8, v2, v0

    int-to-long v0, v5

    and-long v2, v0, v10

    const/16 v0, 0x28

    shl-long v0, v2, v0

    or-long v2, v8, v0

    int-to-long v0, v6

    and-long v4, v0, v10

    const/16 v0, 0x30

    shl-long v0, v4, v0

    or-long v4, v2, v0

    int-to-long v0, v7

    and-long v2, v0, v10

    const/16 v0, 0x38

    shl-long v0, v2, v0

    or-long v2, v4, v0

    return-wide v2
.end method

.method public q()I
    .locals 2

    .line 519
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 523
    :cond_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    .line 524
    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->g:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public r()Z
    .locals 2

    .line 533
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public s()I
    .locals 2

    .line 540
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public t()B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 581
    iget v0, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->c:I

    if-ne v0, v1, :cond_0

    .line 582
    invoke-static {}, Lcom/yandex/metrica/impl/ob/d;->a()Lcom/yandex/metrica/impl/ob/d;

    move-result-object v0

    throw v0

    .line 584
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/a;->a:[B

    iget v1, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/yandex/metrica/impl/ob/a;->e:I

    aget-byte v0, v0, v1

    return v0
.end method
