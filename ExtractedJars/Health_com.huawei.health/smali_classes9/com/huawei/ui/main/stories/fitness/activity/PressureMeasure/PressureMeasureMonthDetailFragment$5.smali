.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    if-eqz p2, :cond_1

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Lo/evt;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0, v1}, Lo/evt;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;

    move-result-object v3

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    const-string v0, "--"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    :goto_0
    goto :goto_1

    .line 323
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->q:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v1}, Lo/fbx;->J()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(J)V

    .line 327
    return-void
.end method
