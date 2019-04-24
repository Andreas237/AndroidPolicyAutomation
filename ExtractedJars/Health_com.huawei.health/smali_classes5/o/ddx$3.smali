.class Lo/ddx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ddi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ddx;->e(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ddx;


# direct methods
.method constructor <init>(Lo/ddx;)V
    .locals 0

    .line 1393
    iput-object p1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 2

    .line 1456
    const v0, 0x19645

    if-ne v0, p1, :cond_0

    .line 1458
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/ddx;->b(Lo/ddx;I)I

    .line 1460
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->g(Lo/ddx;)I

    .line 1463
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-virtual {v0}, Lo/ddx;->b()V

    goto :goto_0

    .line 1465
    :cond_0
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->f(Lo/ddx;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1466
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 1467
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1468
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->c(Lo/ddx;Z)Z

    .line 1471
    :cond_1
    :goto_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 1476
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->g(Lo/ddx;)I

    .line 1477
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1478
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1479
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/ddx;->c(Lo/ddx;IZ)V

    .line 1480
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_0

    .line 1482
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceiveNoAck, mErrorPackages.size != 0 , mErrorPackages.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1483
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 1484
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1485
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lo/ddx;->c(Lo/ddx;IZ)V

    .line 1486
    goto/16 :goto_0

    .line 1488
    :cond_1
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceiveNoAck, mChunksDone = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->i(Lo/ddx;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1490
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->i(Lo/ddx;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->p(Lo/ddx;)I

    move-result v1

    div-int/2addr v0, v1

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->l(Lo/ddx;)I

    move-result v1

    if-le v0, v1, :cond_3

    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->l(Lo/ddx;)I

    move-result v0

    const/16 v1, 0x64

    if-ge v0, v1, :cond_3

    .line 1491
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->i(Lo/ddx;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    iget-object v2, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v2}, Lo/ddx;->p(Lo/ddx;)I

    move-result v2

    div-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1492
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1493
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v2}, Lo/ddx;->l(Lo/ddx;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/yc;->a(Ljava/lang/String;I)V

    .line 1495
    :cond_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState,mProcessB0="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->l(Lo/ddx;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1497
    :cond_3
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->l(Lo/ddx;)I

    move-result v0

    const/16 v1, 0x64

    if-ne v1, v0, :cond_4

    .line 1498
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1500
    :cond_4
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->i(Lo/ddx;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ddx;->c(Lo/ddx;IZ)V

    .line 1502
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 5

    .line 1397
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->k(Lo/ddx;)Lo/ddx$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1398
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->k(Lo/ddx;)Lo/ddx$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ddx$c;->removeMessages(I)V

    .line 1400
    :cond_0
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1401
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 1402
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;Landroid/os/HandlerThread;)Landroid/os/HandlerThread;

    .line 1403
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->b(Lo/ddx;Lo/ddx$c;)Lo/ddx$c;

    .line 1404
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandlerThread close.set mOtaHandler null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1406
    :cond_1
    move-object v4, p1

    check-cast v4, Ljava/lang/Byte;

    .line 1407
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ota crc result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Byte;->byteValue()B

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1408
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1409
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/yc;->b(Ljava/lang/String;I)V

    .line 1411
    :cond_2
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1412
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->c(Lo/ddx;Z)Z

    .line 1413
    return-void
.end method

.method public e([B)V
    .locals 4

    .line 1422
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->g(Lo/ddx;)I

    .line 1423
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 1424
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceive,mErrorPackages.size()==0,mChunksDone="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->i(Lo/ddx;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1425
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->i(Lo/ddx;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->p(Lo/ddx;)I

    move-result v1

    div-int/2addr v0, v1

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->l(Lo/ddx;)I

    move-result v1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->l(Lo/ddx;)I

    move-result v0

    const/16 v1, 0x64

    if-ge v0, v1, :cond_1

    .line 1426
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->i(Lo/ddx;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    iget-object v2, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v2}, Lo/ddx;->p(Lo/ddx;)I

    move-result v2

    div-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1427
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1428
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v2}, Lo/ddx;->l(Lo/ddx;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/yc;->a(Ljava/lang/String;I)V

    .line 1430
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState,mProcessB0="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->l(Lo/ddx;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1432
    :cond_1
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->l(Lo/ddx;)I

    move-result v0

    const/16 v1, 0x64

    if-ne v1, v0, :cond_4

    .line 1433
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transfer file over ,set mProcessB0 0. start a Timer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->k(Lo/ddx;)Lo/ddx$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1435
    :cond_2
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "OTATransferFile"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;Landroid/os/HandlerThread;)Landroid/os/HandlerThread;

    .line 1436
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 1437
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    new-instance v1, Lo/ddx$c;

    iget-object v2, p0, Lo/ddx$3;->c:Lo/ddx;

    iget-object v3, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lo/ddx$c;-><init>(Lo/ddx;Landroid/os/Looper;)V

    invoke-static {v0, v1}, Lo/ddx;->b(Lo/ddx;Lo/ddx$c;)Lo/ddx$c;

    .line 1439
    :cond_3
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->k(Lo/ddx;)Lo/ddx$c;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Lo/ddx$c;->sendEmptyMessageDelayed(IJ)Z

    .line 1441
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1443
    :cond_4
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->i(Lo/ddx;)I

    move-result v0

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->p(Lo/ddx;)I

    move-result v1

    if-ge v0, v1, :cond_6

    .line 1444
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    iget-object v1, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->i(Lo/ddx;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ddx;->c(Lo/ddx;IZ)V

    goto :goto_0

    .line 1448
    :cond_5
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/ddx;->b(Lo/ddx;I)I

    .line 1450
    iget-object v0, p0, Lo/ddx$3;->c:Lo/ddx;

    invoke-virtual {v0}, Lo/ddx;->b()V

    .line 1452
    :cond_6
    :goto_0
    return-void
.end method
