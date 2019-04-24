.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V
    .locals 0

    .line 1677
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1681
    const/16 v0, 0x4e20

    if-ne v0, p1, :cond_3

    .line 1682
    if-nez p2, :cond_0

    const-string v0, "0"

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 1683
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/emy;->a(I)V

    .line 1684
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8fdb\u5ea6\u6761rate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1685
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    .line 1686
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v2

    invoke-static {v2}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 1687
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 1688
    iput v4, v5, Landroid/os/Message;->arg1:I

    .line 1689
    const/16 v0, 0x64

    if-gt v0, v4, :cond_1

    .line 1690
    const/16 v0, 0x18

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1691
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    iget v1, v5, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1692
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_2

    .line 1694
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->h(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;)Z

    move-result v6

    .line 1695
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkDataValid(mTotalSleepData):"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1696
    if-eqz v6, :cond_2

    .line 1697
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b(Z)Z

    goto :goto_1

    .line 1699
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b(Z)Z

    .line 1701
    :goto_1
    const/16 v0, 0x17

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1702
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$10;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1706
    :cond_3
    :goto_2
    return-void
.end method
