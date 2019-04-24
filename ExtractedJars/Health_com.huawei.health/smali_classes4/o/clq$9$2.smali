.class Lo/clq$9$2;
.super Lo/clk$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$9;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/clq$9;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/clq$9;J)V
    .locals 0

    .line 764
    iput-object p1, p0, Lo/clq$9$2;->c:Lo/clq$9;

    iput-wide p2, p0, Lo/clq$9$2;->d:J

    invoke-direct {p0}, Lo/clk$d;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthClient;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 767
    iget-object v0, p0, Lo/clq$9$2;->c:Lo/clq$9;

    iget-object v0, v0, Lo/clq$9;->e:Lo/cme;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 768
    iget-object v0, p0, Lo/clq$9$2;->c:Lo/clq$9;

    iget-object v0, v0, Lo/clq$9;->e:Lo/cme;

    invoke-interface {v0, p1}, Lo/cme;->onResult(Lcom/huawei/hihealth/HiHealthClient;)V

    .line 769
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClient cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$9$2;->d:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    return-void
.end method
