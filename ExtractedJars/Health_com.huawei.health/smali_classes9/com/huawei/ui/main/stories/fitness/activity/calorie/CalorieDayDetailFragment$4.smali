.class Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->f(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->h(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    return-void

    .line 132
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    return-void
.end method
