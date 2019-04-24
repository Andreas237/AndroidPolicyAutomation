.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 0

    .line 364
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 367
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 368
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 370
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v0

    if-nez v0, :cond_1

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    goto :goto_0

    .line 377
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 379
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    goto/16 :goto_1

    .line 380
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 387
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 386
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_1

    .line 391
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 398
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 397
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ezz;->b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_1

    .line 401
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->setVisibility(I)V

    .line 403
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 408
    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 407
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ezz;->d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/eyf;->e(Ljava/util/List;Ljava/util/List;)V

    .line 415
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 418
    goto :goto_2

    .line 421
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V

    .line 422
    goto :goto_2

    .line 424
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Landroid/content/Context;)V

    .line 425
    .line 430
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
