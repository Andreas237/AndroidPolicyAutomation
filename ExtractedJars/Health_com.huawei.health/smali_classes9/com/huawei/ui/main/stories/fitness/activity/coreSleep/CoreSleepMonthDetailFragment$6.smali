.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V
    .locals 0

    .line 440
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    if-eqz p2, :cond_1

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->t(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Lo/eye;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    iget-object v1, v1, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0, v1}, Lo/eye;->c(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;

    move-result-object v4

    .line 446
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    const-string v0, "--"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->f()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;I)I

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;I)V

    goto :goto_0

    .line 451
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;I)I

    .line 453
    :goto_0
    goto :goto_1

    .line 454
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;I)V

    .line 473
    :goto_1
    return-void
.end method
