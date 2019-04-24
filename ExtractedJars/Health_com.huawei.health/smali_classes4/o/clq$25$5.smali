.class Lo/clq$25$5;
.super Lo/cla$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$25;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:J

.field final synthetic e:Lo/clq$25;


# direct methods
.method constructor <init>(Lo/clq$25;J)V
    .locals 0

    .line 1249
    iput-object p1, p0, Lo/clq$25$5;->e:Lo/clq$25;

    iput-wide p2, p0, Lo/clq$25$5;->d:J

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

    .line 1257
    iget-object v0, p0, Lo/clq$25$5;->e:Lo/clq$25;

    iget-object v0, v0, Lo/clq$25;->c:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1258
    iget-object v0, p0, Lo/clq$25$5;->e:Lo/clq$25;

    iget-object v0, v0, Lo/clq$25;->c:Lo/clz;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1259
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo fail, cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$25$5;->d:J

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

    .line 1260
    return-void
.end method

.method public e(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1252
    iget-object v0, p0, Lo/clq$25$5;->e:Lo/clq$25;

    iget-object v0, v0, Lo/clq$25;->c:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1253
    iget-object v0, p0, Lo/clq$25$5;->e:Lo/clq$25;

    iget-object v0, v0, Lo/clq$25;->c:Lo/clz;

    invoke-interface {v0, p1, p2}, Lo/clz;->onSuccess(ILjava/lang/Object;)V

    .line 1254
    :cond_0
    return-void
.end method
