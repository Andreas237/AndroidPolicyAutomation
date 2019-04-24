.class Lo/clq$3$4;
.super Lo/clh$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic e:Lo/clq$3;


# direct methods
.method constructor <init>(Lo/clq$3;J)V
    .locals 0

    .line 591
    iput-object p1, p0, Lo/clq$3$4;->e:Lo/clq$3;

    iput-wide p2, p0, Lo/clq$3$4;->b:J

    invoke-direct {p0}, Lo/clh$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 594
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 595
    iget-object v0, p0, Lo/clq$3$4;->e:Lo/clq$3;

    iget-object v0, v0, Lo/clq$3;->a:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 596
    iget-object v0, p0, Lo/clq$3$4;->e:Lo/clq$3;

    iget-object v0, v0, Lo/clq$3;->a:Lo/cma;

    invoke-interface {v0, p1, v6}, Lo/cma;->onResult(ILjava/lang/Object;)V

    .line 597
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$3$4;->b:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    return-void
.end method
