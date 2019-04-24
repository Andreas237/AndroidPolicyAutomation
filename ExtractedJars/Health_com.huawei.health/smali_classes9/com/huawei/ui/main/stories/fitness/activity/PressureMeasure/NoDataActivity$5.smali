.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/elp;

.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;Lo/elp;)V
    .locals 0

    .line 498
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->d:Lo/elp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->d:Lo/elp;

    if-eqz v0, :cond_0

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->d:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 505
    :cond_0
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "you click adjust button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 509
    const/4 v5, 0x0

    .line 510
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 511
    if-eqz v6, :cond_1

    .line 512
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentDeviceInfo.toString() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 514
    const/4 v5, 0x1

    .line 517
    :cond_1
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    const-string v0, "havedevice"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    sget-object v0, Lo/dae;->fi:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->d()V

    goto :goto_0

    .line 522
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 523
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->a()V

    goto :goto_0

    .line 525
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;)V

    invoke-static {v0, v1}, Lo/fbw;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 540
    :goto_0
    return-void
.end method
