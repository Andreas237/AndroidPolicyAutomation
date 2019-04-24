.class Lo/fps$2;
.super Lo/fps$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps;->e(Ljava/net/InetSocketAddress;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final b:Ljava/net/DatagramPacket;

.field final synthetic d:Lo/fps;

.field private final e:[B


# direct methods
.method constructor <init>(Lo/fps;Ljava/lang/String;)V
    .locals 3

    .line 398
    iput-object p1, p0, Lo/fps$2;->d:Lo/fps;

    invoke-direct {p0, p1, p2}, Lo/fps$c;-><init>(Lo/fps;Ljava/lang/String;)V

    .line 400
    iget-object v0, p0, Lo/fps$2;->d:Lo/fps;

    invoke-static {v0}, Lo/fps;->b(Lo/fps;)I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fps$2;->e:[B

    .line 401
    new-instance v0, Ljava/net/DatagramPacket;

    iget-object v1, p0, Lo/fps$2;->e:[B

    iget-object v2, p0, Lo/fps$2;->d:Lo/fps;

    invoke-static {v2}, Lo/fps;->b(Lo/fps;)I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/net/DatagramPacket;-><init>([BI)V

    iput-object v0, p0, Lo/fps$2;->b:Ljava/net/DatagramPacket;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 405
    iget-object v0, p0, Lo/fps$2;->b:Ljava/net/DatagramPacket;

    iget-object v1, p0, Lo/fps$2;->e:[B

    invoke-virtual {v0, v1}, Ljava/net/DatagramPacket;->setData([B)V

    .line 406
    iget-object v0, p0, Lo/fps$2;->d:Lo/fps;

    iget-object v1, p0, Lo/fps$2;->b:Ljava/net/DatagramPacket;

    invoke-static {v0, v1}, Lo/fps;->e(Lo/fps;Ljava/net/DatagramPacket;)V

    .line 407
    return-void
.end method
