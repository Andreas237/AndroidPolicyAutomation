.class Lo/fps$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fkv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps;->d(Ljava/net/DatagramPacket;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fps;

.field final synthetic d:Lo/frl;


# direct methods
.method constructor <init>(Lo/fps;Lo/frl;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lo/fps$1;->c:Lo/fps;

    iput-object p2, p0, Lo/fps$1;->d:Lo/frl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/Object;
    .locals 1

    .line 529
    iget-object v0, p0, Lo/fps$1;->d:Lo/frl;

    invoke-virtual {v0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 2

    .line 534
    iget-object v0, p0, Lo/fps$1;->c:Lo/fps;

    iget-object v1, p0, Lo/fps$1;->d:Lo/frl;

    invoke-static {v0, v1}, Lo/fps;->d(Lo/fps;Lo/frl;)V

    .line 535
    return-void
.end method
