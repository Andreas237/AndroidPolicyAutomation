.class Lo/clq$22$1;
.super Lo/cla$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$22;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clq$22;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lo/clq$22;J)V
    .locals 0

    .line 1218
    iput-object p1, p0, Lo/clq$22$1;->a:Lo/clq$22;

    iput-wide p2, p0, Lo/clq$22$1;->b:J

    invoke-direct {p0}, Lo/cla$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1227
    iget-object v0, p0, Lo/clq$22$1;->a:Lo/clq$22;

    iget-object v0, v0, Lo/clq$22;->a:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1228
    iget-object v0, p0, Lo/clq$22$1;->a:Lo/clq$22;

    iget-object v0, v0, Lo/clq$22;->a:Lo/clz;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1229
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo fail, cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$22$1;->b:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " errMsg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1230
    return-void
.end method

.method public e(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1221
    iget-object v0, p0, Lo/clq$22$1;->a:Lo/clq$22;

    iget-object v0, v0, Lo/clq$22;->a:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1222
    iget-object v0, p0, Lo/clq$22$1;->a:Lo/clq$22;

    iget-object v0, v0, Lo/clq$22;->a:Lo/clz;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/clz;->onSuccess(ILjava/lang/Object;)V

    .line 1223
    :cond_0
    return-void
.end method
