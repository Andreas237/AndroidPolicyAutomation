.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    if-eqz p2, :cond_3

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)Lo/evt;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0, v1}, Lo/evt;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;

    move-result-object v4

    .line 366
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elc$b;

    iget-object v0, v0, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    .line 367
    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)F

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    .line 368
    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 369
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elc$b;

    iget-object v0, v0, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v5

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;F)F

    .line 371
    float-to-long v0, v5

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 372
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 373
    new-instance v9, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "HH:mm"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 374
    invoke-virtual {v9, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 380
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    const-string v0, "--"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 385
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 388
    :goto_0
    goto :goto_1

    .line 389
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->q:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    :goto_1
    return-void
.end method
