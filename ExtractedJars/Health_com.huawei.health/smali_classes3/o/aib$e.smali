.class Lo/aib$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aib;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/aib;

.field private volatile d:Z


# direct methods
.method private constructor <init>(Lo/aib;)V
    .locals 1

    .line 338
    iput-object p1, p0, Lo/aib$e;->b:Lo/aib;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aib$e;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/aib;Lo/aib$2;)V
    .locals 0

    .line 338
    invoke-direct {p0, p1}, Lo/aib$e;-><init>(Lo/aib;)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 404
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aib$e;->d:Z

    .line 405
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/aib$e;->b:Lo/aib;

    invoke-static {v1}, Lo/aib;->b(Lo/aib;)Lo/aib$e;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 406
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "submit isDone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 409
    :cond_0
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send package data thread start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 410
    return-void
.end method

.method public e()V
    .locals 4

    .line 413
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send package data thread stop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 414
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aib$e;->d:Z

    .line 415
    return-void
.end method

.method public run()V
    .locals 12

    .line 346
    const/4 v5, 0x0

    .line 347
    const/4 v6, 0x0

    .line 348
    const/4 v7, 0x0

    .line 349
    iget-object v0, p0, Lo/aib$e;->b:Lo/aib;

    invoke-static {v0}, Lo/aib;->f(Lo/aib;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/net/wifi/WifiManager;

    .line 350
    iget-object v0, p0, Lo/aib$e;->b:Lo/aib;

    invoke-static {v0}, Lo/aib;->f(Lo/aib;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/net/ConnectivityManager;

    .line 352
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SendThread run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 354
    :try_start_0
    new-instance v0, Ljava/net/DatagramSocket;

    invoke-direct {v0}, Ljava/net/DatagramSocket;-><init>()V

    move-object v5, v0

    .line 355
    const/16 v0, 0x400

    invoke-virtual {v5, v0}, Ljava/net/DatagramSocket;->setSendBufferSize(I)V

    .line 357
    const-string v0, "255.255.255.255"

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v4

    .line 358
    new-instance v0, Ljava/net/DatagramPacket;

    iget-object v1, p0, Lo/aib$e;->b:Lo/aib;

    invoke-static {v1}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v1

    iget-object v2, p0, Lo/aib$e;->b:Lo/aib;

    invoke-static {v2}, Lo/aib;->g(Lo/aib;)[B

    move-result-object v2

    array-length v2, v2

    const/16 v3, 0x1633

    invoke-direct {v0, v1, v2, v4, v3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v0

    .line 361
    goto :goto_0

    .line 359
    :catch_0
    move-exception v10

    .line 360
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Create socket failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 362
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 363
    :cond_0
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53d1\u9001packet\u7533\u8bf7\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lo/aib$e;->b:Lo/aib;

    invoke-static {v0}, Lo/aib;->a(Lo/aib;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x452

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    goto/16 :goto_4

    .line 366
    :cond_1
    :goto_1
    iget-boolean v0, p0, Lo/aib$e;->d:Z

    if-nez v0, :cond_5

    .line 368
    :try_start_1
    invoke-static {}, Lo/akl;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 369
    invoke-virtual {v9}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v10

    .line 370
    if-eqz v10, :cond_2

    invoke-virtual {v10}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    invoke-static {v8}, Lo/akl;->a(Landroid/net/wifi/WifiManager;)Z

    .line 374
    :cond_2
    if-eqz v7, :cond_3

    .line 375
    const-wide/16 v0, 0xc8

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_2

    .line 377
    :cond_3
    invoke-virtual {v9}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v10

    .line 378
    invoke-static {}, Lo/akl;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 379
    invoke-virtual {v10}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 380
    invoke-virtual {v8}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    move-result-object v11

    .line 381
    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    iget v0, v11, Landroid/net/DhcpInfo;->gateway:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 382
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendThread Ip:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v11, Landroid/net/DhcpInfo;->gateway:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 383
    const/4 v7, 0x1

    .line 386
    :cond_4
    const-wide/16 v0, 0x3c

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 388
    :goto_2
    invoke-virtual {v5, v6}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    .line 393
    goto :goto_3

    .line 389
    :catch_1
    move-exception v10

    .line 390
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendThread socket failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 393
    goto :goto_3

    .line 391
    :catch_2
    move-exception v10

    .line 392
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendThread socket failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 394
    :goto_3
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SendThread send package data onetime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 397
    :cond_5
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    .line 398
    invoke-virtual {v5}, Ljava/net/DatagramSocket;->close()V

    .line 400
    :cond_6
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SendThread send package data thread out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-void
.end method
