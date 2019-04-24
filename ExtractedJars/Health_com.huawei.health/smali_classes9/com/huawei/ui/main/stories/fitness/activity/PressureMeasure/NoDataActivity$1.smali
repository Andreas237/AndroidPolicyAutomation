.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 11

    .line 146
    iget v8, p1, Landroid/os/Message;->what:I

    .line 147
    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_1

    .line 149
    :sswitch_0
    const-string v0, "NoDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mPressureAutoTestLayout.getVisibility() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/widget/RelativeLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 155
    :cond_1
    :goto_0
    invoke-static {}, Lo/fjc;->e()Ljava/lang/String;

    move-result-object v9

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_open_auto_pressure_detector_content:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;)V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    .line 179
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/widget/RelativeLayout;

    move-result-object v2

    move-object v3, v10

    const-string v4, "pressure_auto_detector_agree_no_again_tip"

    const-string v5, "pressure_auto_detector_dialog_time"

    const-string v6, "pressure_auto_detector_count"

    const-string v7, "pressure_auto_detetor_is_show"

    .line 157
    invoke-static/range {v0 .. v7}, Lo/egp;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    goto :goto_1

    .line 182
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;)V

    invoke-static {v0, v1}, Lo/fbw;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 199
    .line 203
    :goto_1
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_1
    .end sparse-switch
.end method
