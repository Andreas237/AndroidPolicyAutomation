.class Lo/aig$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field b:Ljava/net/DatagramSocket;

.field private volatile c:Z

.field final synthetic d:Lo/aig;


# direct methods
.method private constructor <init>(Lo/aig;)V
    .locals 1

    .line 627
    iput-object p1, p0, Lo/aig$d;->d:Lo/aig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 628
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig$d;->c:Z

    .line 629
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    return-void
.end method

.method synthetic constructor <init>(Lo/aig;Lo/aig$5;)V
    .locals 0

    .line 627
    invoke-direct {p0, p1}, Lo/aig$d;-><init>(Lo/aig;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 692
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->n(Lo/aig;)Lo/aig$d;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/aig$d;->c:Z

    .line 693
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->n(Lo/aig;)Lo/aig$d;

    move-result-object v0

    iget-object v0, v0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    .line 694
    :cond_0
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUdpServer: is close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v2}, Lo/aig;->n(Lo/aig;)Lo/aig$d;

    move-result-object v2

    iget-object v2, v2, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 695
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->n(Lo/aig;)Lo/aig$d;

    move-result-object v0

    iget-object v0, v0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 696
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: stop() serverSocket closed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 698
    return-void
.end method

.method public d()V
    .locals 2

    .line 687
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->n(Lo/aig;)Lo/aig$d;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/aig$d;->c:Z

    .line 688
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->n(Lo/aig;)Lo/aig$d;

    move-result-object v0

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 689
    return-void
.end method

.method public run()V
    .locals 12

    .line 635
    :try_start_0
    new-instance v0, Ljava/net/DatagramSocket;

    const v1, 0xe59c

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(I)V

    iput-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    .line 636
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: new DatagramSocket "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 637
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 639
    :goto_0
    iget-boolean v0, p0, Lo/aig$d;->c:Z

    if-nez v0, :cond_2

    .line 640
    const-string v4, ""

    .line 641
    const/16 v0, 0x100

    new-array v5, v0, [B

    .line 643
    new-instance v6, Ljava/net/DatagramPacket;

    const/16 v0, 0x100

    invoke-direct {v6, v5, v0}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 645
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0, v6}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 647
    invoke-virtual {v6}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v7

    .line 649
    const/4 v0, 0x0

    aget-byte v0, v5, v0

    and-int/lit16 v8, v0, 0xff

    .line 650
    const-string v0, "MulticastTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: Buffer0= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget-byte v2, v5, v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "crc= "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 651
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->o(Lo/aig;)[I

    move-result-object v0

    const/4 v1, 0x1

    aget v0, v0, v1

    if-eq v8, v0, :cond_0

    .line 652
    const-string v0, "MulticastTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: receivecrc= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mIpData[1]= "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v2}, Lo/aig;->o(Lo/aig;)[I

    move-result-object v2

    const/4 v3, 0x1

    aget v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 653
    goto/16 :goto_0

    .line 655
    :cond_0
    const-string v9, "0.0.0.0"

    .line 656
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 657
    invoke-virtual {v7}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 659
    :cond_1
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: ipClientAddress is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 662
    move-object v4, v9

    .line 663
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer get message: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 664
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v10

    .line 665
    const/4 v0, 0x0

    iput v0, v10, Landroid/os/Message;->what:I

    .line 666
    iput-object v4, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 667
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->p(Lo/aig;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 668
    .line 676
    :cond_2
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 678
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_4

    .line 680
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 681
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto/16 :goto_1

    .line 670
    :catch_0
    move-exception v4

    .line 671
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UdpServer: "

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
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 676
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 678
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_4

    .line 680
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 681
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto/16 :goto_1

    .line 672
    :catch_1
    move-exception v4

    .line 673
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UdpServer: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 674
    iget-object v0, p0, Lo/aig$d;->d:Lo/aig;

    invoke-static {v0}, Lo/aig;->p(Lo/aig;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 676
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 678
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_4

    .line 680
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 681
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto :goto_1

    .line 676
    :catchall_0
    move-exception v11

    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 678
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_3

    .line 680
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 681
    iget-object v0, p0, Lo/aig$d;->b:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 683
    :cond_3
    throw v11

    .line 684
    :cond_4
    :goto_1
    return-void
.end method
