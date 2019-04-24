.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 66
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 67
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 69
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)V

    .line 70
    goto/16 :goto_0

    .line 72
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c:Lo/exq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->a(I)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->e(I)V

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->d(I)V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->b(I)V

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->c(I)V

    .line 78
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestTotalDatas totalFitnessData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v3

    invoke-virtual {v3}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Lo/fad;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;Lo/fad;Ljava/lang/String;)V

    .line 82
    goto :goto_0

    .line 84
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepMonthDetailFragment;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 92
    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1771
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
