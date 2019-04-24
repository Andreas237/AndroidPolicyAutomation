.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fah$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 430
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$7;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(F)V
    .locals 2

    .line 432
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$7;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$7;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    float-to-int v1, p1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;I)V

    .line 435
    :cond_0
    return-void
.end method
