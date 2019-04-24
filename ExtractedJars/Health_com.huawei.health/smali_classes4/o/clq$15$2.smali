.class Lo/clq$15$2;
.super Lo/cla$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$15;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/clq$15;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/clq$15;J)V
    .locals 0

    .line 995
    iput-object p1, p0, Lo/clq$15$2;->b:Lo/clq$15;

    iput-wide p2, p0, Lo/clq$15$2;->d:J

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

    .line 1005
    iget-object v0, p0, Lo/clq$15$2;->b:Lo/clq$15;

    iget-object v0, v0, Lo/clq$15;->c:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1006
    iget-object v0, p0, Lo/clq$15$2;->b:Lo/clq$15;

    iget-object v0, v0, Lo/clq$15;->c:Lo/clz;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1007
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData fail, cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$15$2;->d:J

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

    .line 1008
    return-void
.end method

.method public e(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 998
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 999
    iget-object v0, p0, Lo/clq$15$2;->b:Lo/clq$15;

    iget-object v0, v0, Lo/clq$15;->c:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1000
    iget-object v0, p0, Lo/clq$15$2;->b:Lo/clq$15;

    iget-object v0, v0, Lo/clq$15;->c:Lo/clz;

    invoke-interface {v0, p1, v2}, Lo/clz;->onSuccess(ILjava/lang/Object;)V

    .line 1001
    :cond_0
    return-void
.end method
