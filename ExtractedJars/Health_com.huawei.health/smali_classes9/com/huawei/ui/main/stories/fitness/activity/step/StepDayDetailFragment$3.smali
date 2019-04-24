.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 330
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showFitnessDataOriginDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    new-instance v4, Lo/fas;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/fas;-><init>(Landroid/content/Context;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fas;->setmListdata(Ljava/util/List;)V

    .line 334
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_steps_data_source:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 336
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;)V

    .line 337
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 343
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v5

    .line 344
    invoke-virtual {v5}, Lo/egw;->show()V

    .line 345
    return-void
.end method
