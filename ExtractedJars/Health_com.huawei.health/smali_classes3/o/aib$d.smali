.class Lo/aib$d;
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
    name = "d"
.end annotation


# instance fields
.field private volatile a:Z

.field c:Ljava/net/DatagramSocket;

.field final synthetic e:Lo/aib;


# direct methods
.method private constructor <init>(Lo/aib;)V
    .locals 1

    .line 421
    iput-object p1, p0, Lo/aib$d;->e:Lo/aib;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 422
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aib$d;->a:Z

    .line 423
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    return-void
.end method

.method synthetic constructor <init>(Lo/aib;Lo/aib$2;)V
    .locals 0

    .line 421
    invoke-direct {p0, p1}, Lo/aib$d;-><init>(Lo/aib;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 494
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aib$d;->a:Z

    .line 495
    iget-object v0, p0, Lo/aib$d;->e:Lo/aib;

    invoke-static {v0}, Lo/aib;->e(Lo/aib;)Lo/aib$d;

    move-result-object v0

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 496
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mReceiveAckThread: start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 497
    return-void
.end method

.method public e()V
    .locals 4

    .line 500
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mReceiveAckThread: stoped!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 501
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aib$d;->a:Z

    .line 502
    return-void
.end method

.method public run()V
    .locals 12

    .line 428
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive run enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 431
    const/4 v4, 0x0

    .line 433
    const-string v6, "0.0.0.0"

    .line 434
    const/16 v0, 0x100

    :try_start_0
    new-array v7, v0, [B

    .line 435
    new-instance v0, Ljava/net/DatagramSocket;

    const v1, 0xe59c

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(I)V

    iput-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    .line 436
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 437
    new-instance v8, Ljava/net/DatagramPacket;

    const/16 v0, 0x100

    invoke-direct {v8, v7, v0}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 439
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " receive : new DatagramSocket "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 440
    :goto_0
    iget-boolean v0, p0, Lo/aib$d;->a:Z
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_3

    .line 444
    :try_start_1
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    .line 445
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0, v8}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 456
    goto/16 :goto_1

    .line 446
    :catch_0
    move-exception v9

    .line 447
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive socket timeout, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/net/SocketTimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 448
    goto :goto_0

    .line 449
    :catch_1
    move-exception v9

    .line 450
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive socket failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 452
    const-wide/16 v0, 0x14

    :try_start_3
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 455
    goto :goto_1

    .line 453
    :catch_2
    move-exception v10

    .line 454
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive socket sleep interrupt, "

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

    .line 458
    :goto_1
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reciever offset:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " len:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 459
    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v0

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x100

    if-le v1, v0, :cond_0

    .line 460
    new-instance v4, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v0

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v1

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v2

    const-string v3, "UTF-8"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v4, v0, v1, v2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_2

    .line 462
    :cond_0
    const/4 v4, 0x0

    .line 463
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reciever offset:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " len:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 465
    :goto_2
    const-string v0, "HI-ACK"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 466
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Reciever something but not ACK readMsg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 467
    goto/16 :goto_0

    .line 471
    :cond_1
    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v5

    .line 472
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 473
    invoke-virtual {v5}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 475
    :cond_2
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Reciever: success ipClientAddress:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 476
    iget-object v0, p0, Lo/aib$d;->e:Lo/aib;

    invoke-static {v0}, Lo/aib;->c(Lo/aib;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_4
    .catch Ljava/net/SocketException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 482
    :cond_3
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 484
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 486
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 488
    :cond_4
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Reciever: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 489
    goto :goto_3

    .line 478
    :catch_3
    move-exception v4

    .line 479
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reciever: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/net/SocketException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 482
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 484
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 486
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 488
    :cond_5
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Reciever: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 489
    goto :goto_3

    .line 482
    :catchall_0
    move-exception v11

    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 484
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 486
    iget-object v0, p0, Lo/aib$d;->c:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 488
    :cond_6
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Reciever: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 489
    throw v11

    .line 490
    :goto_3
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Reciever run leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 491
    return-void
.end method
