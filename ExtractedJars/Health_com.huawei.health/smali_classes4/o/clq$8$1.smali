.class Lo/clq$8$1;
.super Lo/cli$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$8;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/clq$8;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/clq$8;J)V
    .locals 0

    .line 839
    iput-object p1, p0, Lo/clq$8$1;->c:Lo/clq$8;

    iput-wide p2, p0, Lo/clq$8$1;->d:J

    invoke-direct {p0}, Lo/cli$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 842
    iget-object v0, p0, Lo/clq$8$1;->c:Lo/clq$8;

    iget-object v0, v0, Lo/clq$8;->e:Lo/cmc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 843
    iget-object v0, p0, Lo/clq$8$1;->c:Lo/clq$8;

    iget-object v0, v0, Lo/clq$8;->e:Lo/cmc;

    invoke-interface {v0, p1}, Lo/cmc;->a(Ljava/util/List;)V

    .line 844
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchManualDataClient cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$8$1;->d:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    return-void
.end method
