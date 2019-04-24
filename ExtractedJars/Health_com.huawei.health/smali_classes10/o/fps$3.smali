.class Lo/fps$3;
.super Lo/frw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps;->b(Lo/fql;Lo/frl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fqq;

.field final synthetic e:Lo/fps;


# direct methods
.method constructor <init>(Lo/fps;Lo/fqq;)V
    .locals 0

    .line 1127
    iput-object p1, p0, Lo/fps$3;->e:Lo/fps;

    iput-object p2, p0, Lo/fps$3;->c:Lo/fqq;

    invoke-direct {p0}, Lo/frw;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/frd;Lo/fqr;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 1131
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Discarding existing connection to [{}] after successful resumption of session [ID={}] by peer [{}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fps$3;->c:Lo/fqq;

    invoke-virtual {v3}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Lo/fqr;->e()Lo/fsa;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    iget-object v0, p0, Lo/fps$3;->e:Lo/fps;

    iget-object v1, p0, Lo/fps$3;->c:Lo/fqq;

    invoke-static {v0, v1}, Lo/fps;->c(Lo/fps;Lo/fqq;)V

    .line 1138
    return-void
.end method
