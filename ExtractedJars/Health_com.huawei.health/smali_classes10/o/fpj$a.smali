.class Lo/fpj$a;
.super Lo/fpj$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fpj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lo/fpj;

.field private e:Ljava/net/DatagramPacket;


# direct methods
.method private constructor <init>(Lo/fpj;Ljava/lang/String;)V
    .locals 3

    .line 315
    iput-object p1, p0, Lo/fpj$a;->a:Lo/fpj;

    .line 316
    invoke-direct {p0, p1, p2}, Lo/fpj$d;-><init>(Lo/fpj;Ljava/lang/String;)V

    .line 317
    new-instance v0, Ljava/net/DatagramPacket;

    const/4 v1, 0x0

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/net/DatagramPacket;-><init>([BI)V

    iput-object v0, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    .line 318
    return-void
.end method

.method synthetic constructor <init>(Lo/fpj;Ljava/lang/String;Lo/fpj$1;)V
    .locals 0

    .line 311
    invoke-direct {p0, p1, p2}, Lo/fpj$a;-><init>(Lo/fpj;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 321
    iget-object v0, p0, Lo/fpj$a;->a:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->b(Lo/fpj;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fpd;

    .line 327
    :try_start_0
    iget-object v0, p0, Lo/fpj$a;->a:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->k(Lo/fpj;)Lo/foz;

    move-result-object v6

    .line 328
    if-eqz v6, :cond_0

    invoke-virtual {v5}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v6, v0, v1}, Lo/foz;->d(Lo/fow;Lo/fow;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 329
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "UDPConnector ({}) drops {} bytes to {}:{}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fpj$a;->a:Lo/fpj;

    invoke-static {v3}, Lo/fpj;->d(Lo/fpj;)Ljava/net/DatagramSocket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/DatagramSocket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getPort()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    new-instance v0, Lo/fpa;

    invoke-direct {v0}, Lo/fpa;-><init>()V

    invoke-virtual {v5, v0}, Lo/fpd;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 333
    return-void

    .line 335
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v5}, Lo/fpd;->c()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/DatagramPacket;->setData([B)V

    .line 336
    iget-object v0, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v5}, Lo/fpd;->d()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/DatagramPacket;->setAddress(Ljava/net/InetAddress;)V

    .line 337
    iget-object v0, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v5}, Lo/fpd;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/DatagramPacket;->setPort(I)V

    .line 338
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "UDPConnector ({}) sends {} bytes to {}:{}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    iget-object v3, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getPort()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lo/fpj$a;->a:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->d(Lo/fpj;)Ljava/net/DatagramSocket;

    move-result-object v0

    iget-object v1, p0, Lo/fpj$a;->e:Ljava/net/DatagramPacket;

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 341
    invoke-virtual {v5}, Lo/fpd;->g()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 344
    goto :goto_0

    .line 342
    :catch_0
    move-exception v6

    .line 343
    invoke-virtual {v5, v6}, Lo/fpd;->a(Ljava/lang/Throwable;)V

    .line 345
    :goto_0
    return-void
.end method
