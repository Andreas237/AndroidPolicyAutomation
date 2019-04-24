.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 106
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 107
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 109
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    .line 110
    goto/16 :goto_0

    .line 112
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->a(I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->e(I)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->d(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->b(I)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-virtual {v1}, Lo/exq;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->c(I)V

    .line 118
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestTotalDatas totalFitnessData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

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

    .line 121
    :cond_0
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Lo/fad;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 125
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fad;->c(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Lo/fad;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    goto/16 :goto_0

    .line 130
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    goto :goto_0

    .line 137
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Ljava/util/List;)Ljava/util/List;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/exq;->e(Lo/egg;)V

    .line 141
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Ljava/util/Date;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Ljava/util/Date;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Landroid/content/Context;Ljava/util/Date;)V

    goto :goto_0

    .line 148
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    .line 149
    .line 153
    :cond_4
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1771 -> :sswitch_0
        0x1772 -> :sswitch_1
        0x1773 -> :sswitch_2
        0x1774 -> :sswitch_3
        0xea6a -> :sswitch_4
    .end sparse-switch
.end method
