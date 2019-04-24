.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 5

    .line 436
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "called by getTrackDetailDataByTimeStamp "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 438
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    .line 439
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 442
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 443
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "obj is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    return-void

    .line 446
    :cond_1
    instance-of v0, p2, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_2

    .line 447
    move-object v4, p2

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 448
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->m(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    invoke-virtual {v4}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 451
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "search completed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 455
    :cond_2
    return-void
.end method
