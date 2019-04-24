.class Lo/fpj$e;
.super Lo/fpj$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fpj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/net/DatagramPacket;

.field final synthetic c:Lo/fpj;


# direct methods
.method private constructor <init>(Lo/fpj;Ljava/lang/String;)V
    .locals 3

    .line 291
    iput-object p1, p0, Lo/fpj$e;->c:Lo/fpj;

    .line 292
    invoke-direct {p0, p1, p2}, Lo/fpj$d;-><init>(Lo/fpj;Ljava/lang/String;)V

    .line 293
    invoke-static {p1}, Lo/fpj;->a(Lo/fpj;)I

    move-result v0

    iput v0, p0, Lo/fpj$e;->a:I

    .line 294
    new-instance v0, Ljava/net/DatagramPacket;

    iget v1, p0, Lo/fpj$e;->a:I

    new-array v1, v1, [B

    iget v2, p0, Lo/fpj$e;->a:I

    invoke-direct {v0, v1, v2}, Ljava/net/DatagramPacket;-><init>([BI)V

    iput-object v0, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    .line 295
    return-void
.end method

.method synthetic constructor <init>(Lo/fpj;Ljava/lang/String;Lo/fpj$1;)V
    .locals 0

    .line 286
    invoke-direct {p0, p1, p2}, Lo/fpj$e;-><init>(Lo/fpj;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected d()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 298
    iget-object v0, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    iget v1, p0, Lo/fpj$e;->a:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramPacket;->setLength(I)V

    .line 299
    iget-object v0, p0, Lo/fpj$e;->c:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->d(Lo/fpj;)Ljava/net/DatagramSocket;

    move-result-object v0

    iget-object v1, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 300
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "UDPConnector ({}) received {} bytes from {}:{}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fpj$e;->c:Lo/fpj;

    invoke-static {v3}, Lo/fpj;->d(Lo/fpj;)Ljava/net/DatagramSocket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/DatagramSocket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getPort()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v0

    iget-object v1, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v1

    iget-object v2, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v2}, Ljava/net/DatagramPacket;->getLength()I

    move-result v2

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    .line 304
    new-instance v0, Lo/fox;

    iget-object v1, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    iget-object v2, p0, Lo/fpj$e;->b:Ljava/net/DatagramPacket;

    invoke-virtual {v2}, Ljava/net/DatagramPacket;->getPort()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/fox;-><init>(Ljava/net/InetAddress;I)V

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lo/fpd;->e([BLo/fow;Z)Lo/fpd;

    move-result-object v6

    .line 306
    iget-object v0, p0, Lo/fpj$e;->c:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->c(Lo/fpj;)Lo/fpg;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/fpg;->c(Lo/fpd;)V

    .line 307
    return-void
.end method
