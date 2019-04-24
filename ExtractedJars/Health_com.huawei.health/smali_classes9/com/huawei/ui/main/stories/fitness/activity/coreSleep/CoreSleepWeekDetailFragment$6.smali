.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 380
    return-void

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d()V

    .line 383
    return-void
.end method
