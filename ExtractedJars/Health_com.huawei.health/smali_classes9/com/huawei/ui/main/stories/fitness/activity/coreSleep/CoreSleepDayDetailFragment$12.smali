.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$12;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$12;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 530
    return-void

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$12;->e:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 533
    return-void
.end method
