.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->e(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/Date;

.field final synthetic c:Ljava/util/Date;

.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    .line 684
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->b:Ljava/util/Date;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->c:Ljava/util/Date;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 687
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SleepWeekDetail requestSleepDetailUIData response err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 689
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SleepWeekDetail requestSleepDetailUIData response data success objData is not null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    const-string v0, "UIHLH_CoreSleepMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SleepWeekDetail requestSleepDetailUIData response data success objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 693
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Lo/exp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->b:Ljava/util/Date;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->c:Ljava/util/Date;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->x(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;)Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment$c;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/exp;->e(Ljava/util/Date;Ljava/util/Date;Lo/egg;)V

    .line 695
    return-void
.end method
