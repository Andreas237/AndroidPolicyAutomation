.class public final Lcom/yandex/metrica/impl/ob/jc$d;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static volatile f:[Lcom/yandex/metrica/impl/ob/jc$d;


# instance fields
.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3407
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 3408
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$d;->e()Lcom/yandex/metrica/impl/ob/jc$d;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$d;
    .locals 2

    .line 3384
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$d;->f:[Lcom/yandex/metrica/impl/ob/jc$d;

    if-nez v0, :cond_1

    .line 3385
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 3387
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$d;->f:[Lcom/yandex/metrica/impl/ob/jc$d;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 3388
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$d;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$d;->f:[Lcom/yandex/metrica/impl/ob/jc$d;

    .line 3390
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 3392
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$d;->f:[Lcom/yandex/metrica/impl/ob/jc$d;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3378
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$d;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$d;

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

    .line 3423
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 3424
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->c:I

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 3425
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->c:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->c(II)V

    .line 3427
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->d:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    .line 3428
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 3430
    :cond_1
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->e:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    .line 3431
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->e:Z

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 3433
    :cond_2
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3461
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0x10

    if-eq v0, v1, :cond_3

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_2

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    .line 3466
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 3484
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->e:Z

    goto :goto_0

    .line 3480
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->d:Ljava/lang/String;

    goto :goto_0

    .line 3476
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->l()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->c:I

    goto :goto_0

    .line 3472
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->b:Ljava/lang/String;

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method protected c()I
    .locals 3

    .line 3438
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 3439
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 3440
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3441
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->c:I

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    .line 3442
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$d;->c:I

    .line 3443
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->f(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3445
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->d:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x3

    .line 3446
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$d;->d:Ljava/lang/String;

    .line 3447
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3449
    :cond_1
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->e:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    .line 3451
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$d;
    .locals 2

    const-string v0, ""

    .line 3412
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->b:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3413
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->c:I

    const-string v1, ""

    .line 3414
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$d;->d:Ljava/lang/String;

    .line 3415
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->e:Z

    const/4 v0, -0x1

    .line 3416
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$d;->a:I

    return-object p0
.end method
