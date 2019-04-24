.class Lo/fps$4;
.super Lo/frw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps;->a(Lo/fpd;)Lo/fsb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fpd;

.field final synthetic d:Lo/fps;


# direct methods
.method constructor <init>(Lo/fps;Lo/fpd;)V
    .locals 0

    .line 1365
    iput-object p1, p0, Lo/fps$4;->d:Lo/fps;

    iput-object p2, p0, Lo/fps$4;->c:Lo/fpd;

    invoke-direct {p0}, Lo/frw;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/frd;Lo/fqr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 1369
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Session with [{}] established, now sending deferred message"

    invoke-virtual {p2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1370
    iget-object v0, p0, Lo/fps$4;->d:Lo/fps;

    iget-object v1, p0, Lo/fps$4;->c:Lo/fpd;

    invoke-static {v0, v1, p2}, Lo/fps;->e(Lo/fps;Lo/fpd;Lo/fqr;)V

    .line 1371
    return-void
.end method

.method public e(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V
    .locals 2

    .line 1375
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Session with [{}] failed, report error"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1376
    iget-object v0, p0, Lo/fps$4;->c:Lo/fpd;

    invoke-virtual {v0, p2}, Lo/fpd;->a(Ljava/lang/Throwable;)V

    .line 1377
    return-void
.end method
