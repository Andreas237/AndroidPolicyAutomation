.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)V
    .locals 0

    .line 430
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

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

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->n(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 434
    if-eqz p2, :cond_1

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->l(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Lo/eye;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0, v1}, Lo/eye;->c(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;

    move-result-object v3

    .line 436
    const-string v0, "--"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->e()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;I)I

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;I)V

    goto :goto_0

    .line 440
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->c()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;I)I

    .line 442
    :goto_0
    goto :goto_1

    .line 443
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$8;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;I)V

    .line 460
    :goto_1
    return-void
.end method
