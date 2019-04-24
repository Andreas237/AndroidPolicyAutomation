.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;

.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V
    .locals 0

    .line 1592
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->y(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->v(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1596
    return-void
.end method
