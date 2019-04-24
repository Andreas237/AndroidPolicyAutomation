.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 385
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewd;->f(Z)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;Ljava/lang/Class;)V

    goto :goto_0

    .line 389
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;Ljava/lang/Class;)V

    .line 391
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->finish()V

    .line 392
    return-void
.end method
