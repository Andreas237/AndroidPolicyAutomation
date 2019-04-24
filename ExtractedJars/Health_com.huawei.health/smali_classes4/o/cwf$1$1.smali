.class Lo/cwf$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dgg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwf$1;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwf$1;


# direct methods
.method constructor <init>(Lo/cwf$1;)V
    .locals 0

    .line 1359
    iput-object p1, p0, Lo/cwf$1$1;->d:Lo/cwf$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)V
    .locals 5

    .line 1362
    move-object v4, p1

    check-cast v4, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;

    .line 1363
    if-eqz v4, :cond_1

    .line 1364
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1365
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transDeviceData is success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1366
    iget-object v0, p0, Lo/cwf$1$1;->d:Lo/cwf$1;

    iget-object v0, v0, Lo/cwf$1;->b:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->g(Lo/cwf;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    .line 1368
    :cond_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transDeviceData is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1371
    :cond_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transDeviceData is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1373
    :goto_0
    return-void
.end method
