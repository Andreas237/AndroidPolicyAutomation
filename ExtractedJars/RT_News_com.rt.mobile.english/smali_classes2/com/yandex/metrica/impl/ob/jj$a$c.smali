.class public final Lcom/yandex/metrica/impl/ob/jj$a$c;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public b:J

.field public c:F

.field public d:I

.field public e:I

.field public f:J

.field public g:I

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 281
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 282
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jj$a$c;->d()Lcom/yandex/metrica/impl/ob/jj$a$c;

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

    .line 243
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jj$a$c;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$c;

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

    .line 300
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    .line 301
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IF)V

    .line 302
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 303
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 304
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    .line 305
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 306
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->h:Z

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 307
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$c;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 335
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_7

    const/16 v1, 0x15

    if-eq v0, v1, :cond_6

    const/16 v1, 0x18

    if-eq v0, v1, :cond_5

    const/16 v1, 0x20

    if-eq v0, v1, :cond_4

    const/16 v1, 0x28

    if-eq v0, v1, :cond_3

    const/16 v1, 0x30

    if-eq v0, v1, :cond_2

    const/16 v1, 0x38

    if-eq v0, v1, :cond_1

    .line 340
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 370
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->h:Z

    goto :goto_0

    .line 366
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    goto :goto_0

    .line 362
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    goto :goto_0

    .line 358
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    goto :goto_0

    .line 354
    :cond_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    goto :goto_0

    .line 350
    :cond_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->d()F

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    goto :goto_0

    .line 346
    :cond_7
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    goto :goto_0

    :cond_8
    return-object p0
.end method

.method protected c()I
    .locals 4

    .line 312
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 313
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    const/4 v3, 0x1

    .line 314
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    .line 316
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->e(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 317
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    const/4 v2, 0x3

    .line 318
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 319
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    const/4 v2, 0x4

    .line 320
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 321
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    const/4 v3, 0x5

    .line 322
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 323
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    const/4 v2, 0x6

    .line 324
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x7

    .line 326
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jj$a$c;
    .locals 2

    const-wide/16 v0, 0x1388

    .line 286
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    const/high16 v0, 0x41200000    # 10.0f

    .line 287
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    const/16 v0, 0x14

    .line 288
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    const/16 v0, 0xc8

    .line 289
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    const-wide/32 v0, 0xea60

    .line 290
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    const/16 v0, 0x2710

    .line 291
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    const/4 v0, 0x0

    .line 292
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->h:Z

    const/4 v0, -0x1

    .line 293
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$c;->a:I

    return-object p0
.end method
