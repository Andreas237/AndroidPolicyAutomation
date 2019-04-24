.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;Ljava/lang/Class;)V

    .line 174
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Question have data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;Ljava/lang/Class;)V

    .line 178
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;->d:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->finish()V

    .line 179
    return-void
.end method
