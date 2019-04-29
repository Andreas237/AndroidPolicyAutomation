.class public final Lcom/yandex/metrica/impl/ob/jc$c$e;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jc$c$e$a;,
        Lcom/yandex/metrica/impl/ob/jc$c$e$b;
    }
.end annotation


# static fields
.field private static volatile e:[Lcom/yandex/metrica/impl/ob/jc$c$e;


# instance fields
.field public b:J

.field public c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

.field public d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1468
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 1469
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$e;->e()Lcom/yandex/metrica/impl/ob/jc$c$e;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$c$e;
    .locals 2

    .line 1448
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$e;->e:[Lcom/yandex/metrica/impl/ob/jc$c$e;

    if-nez v0, :cond_1

    .line 1449
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 1451
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$c$e;->e:[Lcom/yandex/metrica/impl/ob/jc$c$e;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 1452
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$e;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$c$e;->e:[Lcom/yandex/metrica/impl/ob/jc$c$e;

    .line 1454
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 1456
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$c$e;->e:[Lcom/yandex/metrica/impl/ob/jc$c$e;

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

    .line 339
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$e;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$e;

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

    .line 1483
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 1484
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 1485
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 1487
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    array-length v0, v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    .line 1488
    :goto_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 1489
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    aget-object v1, v1, v0

    if-eqz v1, :cond_1

    const/4 v2, 0x3

    .line 1491
    invoke-virtual {p1, v2, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1495
    :cond_2
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$e;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1524
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_7

    const/16 v1, 0x12

    if-eq v0, v1, :cond_5

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_1

    .line 1529
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 1547
    :cond_1
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 1548
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    .line 1549
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    if-eqz v1, :cond_3

    .line 1552
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1554
    :cond_3
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_4

    .line 1555
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$c$e$a;-><init>()V

    aput-object v2, v0, v1

    .line 1556
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 1557
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1560
    :cond_4
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$c$e$a;-><init>()V

    aput-object v2, v0, v1

    .line 1561
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 1562
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    goto :goto_0

    .line 1539
    :cond_5
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    if-nez v0, :cond_6

    .line 1540
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$e$b;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    .line 1542
    :cond_6
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 1535
    :cond_7
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->b:J

    goto :goto_0

    :cond_8
    return-object p0
.end method

.method protected c()I
    .locals 4

    .line 1500
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 1501
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->b:J

    const/4 v3, 0x1

    .line 1502
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1503
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    .line 1504
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    .line 1505
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1507
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    array-length v1, v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    .line 1508
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    .line 1509
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    aget-object v2, v2, v1

    if-eqz v2, :cond_1

    const/4 v3, 0x3

    .line 1512
    invoke-static {v3, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$c$e;
    .locals 2

    const-wide/16 v0, 0x0

    .line 1473
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->b:J

    const/4 v0, 0x0

    .line 1474
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->c:Lcom/yandex/metrica/impl/ob/jc$c$e$b;

    .line 1475
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d()[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    const/4 v0, -0x1

    .line 1476
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e;->a:I

    return-object p0
.end method
