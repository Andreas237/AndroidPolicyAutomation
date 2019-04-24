.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 626
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 627
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 628
    const-string v0, "pressure_is_have_datas"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->finish()V

    .line 631
    goto :goto_0

    :cond_0
    const v0, 0x186a1

    if-ne v0, p1, :cond_1

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 634
    :cond_1
    :goto_0
    return-void
.end method
