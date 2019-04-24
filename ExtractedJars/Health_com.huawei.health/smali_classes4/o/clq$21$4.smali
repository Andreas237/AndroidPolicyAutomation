.class Lo/clq$21$4;
.super Lo/clo$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$21;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic d:Lo/clq$21;


# direct methods
.method constructor <init>(Lo/clq$21;J)V
    .locals 0

    .line 387
    iput-object p1, p0, Lo/clq$21$4;->d:Lo/clq$21;

    iput-wide p2, p0, Lo/clq$21$4;->a:J

    invoke-direct {p0}, Lo/clo$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 391
    iget-object v0, p0, Lo/clq$21$4;->d:Lo/clq$21;

    iget-object v0, v0, Lo/clq$21;->a:Lo/cmg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 392
    iget-object v0, p0, Lo/clq$21$4;->d:Lo/clq$21;

    iget-object v0, v0, Lo/clq$21;->a:Lo/cmg;

    invoke-interface {v0, p1, p2}, Lo/cmg;->onResult(Ljava/util/List;Ljava/util/List;)V

    .line 393
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$21$4;->a:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return-void
.end method

.method public e(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 398
    iget-object v0, p0, Lo/clq$21$4;->d:Lo/clq$21;

    iget-object v0, v0, Lo/clq$21;->a:Lo/cmg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 399
    iget-object v0, p0, Lo/clq$21$4;->d:Lo/clq$21;

    iget-object v0, v0, Lo/clq$21;->a:Lo/cmg;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-wide v5, p5

    invoke-interface/range {v0 .. v6}, Lo/cmg;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V

    .line 400
    :cond_0
    return-void
.end method
