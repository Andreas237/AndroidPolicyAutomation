.class Lo/aif$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aif;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/net/DatagramSocket;

.field final synthetic b:Lo/aif;

.field private volatile c:Z


# direct methods
.method private constructor <init>(Lo/aif;)V
    .locals 1

    .line 89
    iput-object p1, p0, Lo/aif$a;->b:Lo/aif;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aif$a;->c:Z

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    return-void
.end method

.method synthetic constructor <init>(Lo/aif;Lo/aif$1;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lo/aif$a;-><init>(Lo/aif;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 150
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->a(Lo/aif;)Lo/aif$a;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/aif$a;->c:Z

    .line 151
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->a(Lo/aif;)Lo/aif$a;

    move-result-object v0

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 152
    return-void
.end method

.method public b()V
    .locals 4

    .line 155
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->a(Lo/aif;)Lo/aif$a;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/aif$a;->c:Z

    .line 156
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->a(Lo/aif;)Lo/aif$a;

    move-result-object v0

    iget-object v0, v0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    .line 157
    :cond_0
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUdpServer: is close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v2}, Lo/aif;->a(Lo/aif;)Lo/aif$a;

    move-result-object v2

    iget-object v2, v2, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->a(Lo/aif;)Lo/aif$a;

    move-result-object v0

    iget-object v0, v0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 159
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: stop() serverSocket closed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 160
    return-void
.end method

.method public run()V
    .locals 12

    .line 97
    :try_start_0
    new-instance v0, Ljava/net/DatagramSocket;

    const v1, 0xe59c

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(I)V

    iput-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    .line 98
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: new DatagramSocket "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 101
    :goto_0
    iget-boolean v0, p0, Lo/aif$a;->c:Z

    if-nez v0, :cond_2

    .line 102
    const-string v4, ""

    .line 103
    const/16 v0, 0x100

    new-array v5, v0, [B

    .line 105
    new-instance v6, Ljava/net/DatagramPacket;

    const/16 v0, 0x100

    invoke-direct {v6, v5, v0}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 107
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0, v6}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 109
    invoke-virtual {v6}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v7

    .line 111
    const/4 v0, 0x0

    aget-byte v0, v5, v0

    and-int/lit16 v8, v0, 0xff

    .line 112
    const-string v0, "ProbeRequestTask"

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

    .line 113
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->e(Lo/aif;)[I

    move-result-object v0

    const/4 v1, 0x1

    aget v0, v0, v1

    if-eq v8, v0, :cond_0

    .line 114
    const-string v0, "ProbeRequestTask"

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

    iget-object v2, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v2}, Lo/aif;->e(Lo/aif;)[I

    move-result-object v2

    const/4 v3, 0x1

    aget v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 115
    goto/16 :goto_0

    .line 118
    :cond_0
    const-string v9, "0.0.0.0"

    .line 119
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 120
    invoke-virtual {v7}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 122
    :cond_1
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: ipClientAddress is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 125
    move-object v4, v9

    .line 126
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer get message: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v10

    .line 128
    const/4 v0, 0x1

    iput v0, v10, Landroid/os/Message;->what:I

    .line 129
    iput-object v4, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 130
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->d(Lo/aif;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 139
    :cond_2
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_4

    .line 143
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 144
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto/16 :goto_1

    .line 133
    :catch_0
    move-exception v4

    .line 134
    const-string v0, "ProbeRequestTask"

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

    .line 139
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_4

    .line 143
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 144
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto/16 :goto_1

    .line 135
    :catch_1
    move-exception v4

    .line 136
    const-string v0, "ProbeRequestTask"

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

    .line 137
    iget-object v0, p0, Lo/aif$a;->b:Lo/aif;

    invoke-static {v0}, Lo/aif;->d(Lo/aif;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_4

    .line 143
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 144
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto :goto_1

    .line 139
    :catchall_0
    move-exception v11

    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UdpServer: finally close resource"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_3

    .line 143
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->disconnect()V

    .line 144
    iget-object v0, p0, Lo/aif$a;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 146
    :cond_3
    throw v11

    .line 147
    :cond_4
    :goto_1
    return-void
.end method
