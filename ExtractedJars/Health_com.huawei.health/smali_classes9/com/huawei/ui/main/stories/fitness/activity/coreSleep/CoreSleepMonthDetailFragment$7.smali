.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fah$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$7;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(F)V
    .locals 2

    .line 434
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->a()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$7;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$7;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    float-to-int v1, p1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;I)V

    .line 437
    :cond_0
    return-void
.end method
