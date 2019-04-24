.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 528
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 529
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    const-string v0, "havedevice"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    sget-object v0, Lo/dae;->fi:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 532
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 533
    const-string v0, "pressure_is_have_datas"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 534
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5$3;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->finish()V

    .line 536
    return-void
.end method
