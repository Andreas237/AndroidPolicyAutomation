.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/elp;

.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;Lo/elp;)V
    .locals 0

    .line 516
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->c:Lo/elp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->c:Lo/elp;

    if-eqz v0, :cond_0

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->c:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 525
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 526
    const/4 v5, 0x0

    .line 527
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 528
    if-eqz v6, :cond_1

    .line 529
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

    .line 530
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 531
    const/4 v5, 0x1

    .line 534
    :cond_1
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    const-string v0, "havedevice"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    sget-object v0, Lo/dae;->fd:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->d()V

    goto :goto_0

    .line 539
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 540
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHaveWifiDevice() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)Lo/fbv;

    move-result-object v3

    invoke-virtual {v3}, Lo/fbv;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)Lo/fbv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbv;->a()V

    goto :goto_0

    .line 543
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$3;)V

    invoke-static {v0, v1}, Lo/fbw;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 557
    :goto_0
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "you click adjust button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    return-void
.end method
