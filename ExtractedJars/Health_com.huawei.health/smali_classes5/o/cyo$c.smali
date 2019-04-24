.class Lo/cyo$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lo/cyo;

.field private final c:Ljava/io/InputStream;

.field private final d:Landroid/bluetooth/BluetoothSocket;

.field private final e:Ljava/io/OutputStream;


# direct methods
.method private constructor <init>(Lo/cyo;Landroid/bluetooth/BluetoothSocket;)V
    .locals 9

    .line 355
    iput-object p1, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 356
    iput-object p2, p0, Lo/cyo$c;->d:Landroid/bluetooth/BluetoothSocket;

    .line 357
    const/4 v6, 0x0

    .line 358
    const/4 v7, 0x0

    .line 361
    :try_start_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 363
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothSocket;->getOutputStream()Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 367
    goto :goto_0

    .line 365
    :catch_0
    move-exception v8

    .line 366
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Get Input Stream Handle exception with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :goto_0
    iput-object v6, p0, Lo/cyo$c;->c:Ljava/io/InputStream;

    .line 370
    iput-object v7, p0, Lo/cyo$c;->e:Ljava/io/OutputStream;

    .line 371
    return-void
.end method

.method synthetic constructor <init>(Lo/cyo;Landroid/bluetooth/BluetoothSocket;Lo/cyo$3;)V
    .locals 0

    .line 347
    invoke-direct {p0, p1, p2}, Lo/cyo$c;-><init>(Lo/cyo;Landroid/bluetooth/BluetoothSocket;)V

    return-void
.end method

.method static synthetic a(Lo/cyo$c;[B)V
    .locals 0

    .line 347
    invoke-direct {p0, p1}, Lo/cyo$c;->a([B)V

    return-void
.end method

.method private a([B)V
    .locals 7

    .line 406
    :try_start_0
    iget-object v0, p0, Lo/cyo$c;->e:Ljava/io/OutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 407
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDK-->Device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 408
    iget-object v0, p0, Lo/cyo$c;->e:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    .line 410
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Send BT Data with mBTOutStream is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 415
    :goto_0
    goto :goto_1

    .line 413
    :catch_0
    move-exception v6

    .line 414
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SPP Socket send occur IOException with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 416
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 420
    :try_start_0
    iget-object v0, p0, Lo/cyo$c;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 421
    iget-object v0, p0, Lo/cyo$c;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    goto :goto_0

    .line 423
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Cancel Spp Socket with mBTInStream is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 428
    :goto_0
    goto :goto_1

    .line 426
    :catch_0
    move-exception v6

    .line 427
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "In Stream close occur IOException with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 431
    :goto_1
    :try_start_1
    iget-object v0, p0, Lo/cyo$c;->e:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 432
    iget-object v0, p0, Lo/cyo$c;->e:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    goto :goto_2

    .line 434
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Cancel Spp Socket with mBTOutStream is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 439
    :goto_2
    goto :goto_3

    .line 437
    :catch_1
    move-exception v6

    .line 438
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Out Stream close occur IOException with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 442
    :goto_3
    :try_start_2
    iget-object v0, p0, Lo/cyo$c;->d:Landroid/bluetooth/BluetoothSocket;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 446
    goto :goto_4

    .line 444
    :catch_2
    move-exception v6

    .line 445
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Socket close occur IOException with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 447
    :goto_4
    return-void
.end method

.method public run()V
    .locals 8

    .line 374
    const/16 v0, 0x408

    new-array v5, v0, [B

    .line 380
    :goto_0
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([BB)V

    .line 382
    iget-object v0, p0, Lo/cyo$c;->c:Ljava/io/InputStream;

    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    .line 383
    const/4 v0, 0x0

    invoke-static {v5, v0, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    .line 385
    iget-object v0, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->b(Lo/cyo;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->g(Lo/cyo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 386
    iget-object v0, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->g(Lo/cyo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iget-object v1, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v1}, Lo/cyo;->k(Lo/cyo;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 387
    iget-object v0, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->g(Lo/cyo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iget-object v1, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v1}, Lo/cyo;->k(Lo/cyo;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 390
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device-->SDK : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/cxq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->b(Lo/cyo;)Lo/cxx;

    move-result-object v0

    iget-object v1, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v1}, Lo/cyo;->g(Lo/cyo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-interface {v0, v1, v6, v7}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 399
    :cond_0
    goto/16 :goto_0

    .line 394
    :catch_0
    move-exception v7

    .line 396
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SPP Socket read occur IOException with info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lo/cyo$c;->b:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->f(Lo/cyo;)V

    .line 398
    .line 401
    return-void
.end method
