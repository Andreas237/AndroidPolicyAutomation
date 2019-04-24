.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)V
    .locals 0

    .line 653
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 656
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 658
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 659
    const-string v0, "pressure_is_have_datas"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 662
    goto :goto_0

    :cond_0
    const v0, 0x186a1

    if-ne v0, p1, :cond_1

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$8;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 666
    :cond_1
    :goto_0
    return-void
.end method
