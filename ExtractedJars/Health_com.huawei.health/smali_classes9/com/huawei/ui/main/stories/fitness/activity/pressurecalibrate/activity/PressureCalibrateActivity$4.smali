.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 63
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TO PressureCalibrateResultActivity time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->d(Z)V

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;Ljava/lang/Class;)V

    .line 66
    return-void
.end method
