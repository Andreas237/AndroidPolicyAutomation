.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

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

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    if-eqz p2, :cond_1

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Lo/evt;

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

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    const-string v0, "--"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_month_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    :goto_0
    goto :goto_1

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->q:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->u:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 249
    return-void
.end method
