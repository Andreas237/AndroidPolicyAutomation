.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V
    .locals 0

    .line 377
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->p(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 381
    return-void

    .line 383
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->b()V

    .line 384
    return-void
.end method
