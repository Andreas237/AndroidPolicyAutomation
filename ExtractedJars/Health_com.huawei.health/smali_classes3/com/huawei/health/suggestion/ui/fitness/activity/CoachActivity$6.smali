.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 589
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 592
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 593
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->c(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 594
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 595
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->r()Lo/btc;

    move-result-object v0

    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v1

    invoke-interface {v1}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v2

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v4

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v5

    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/btc;->c(Ljava/lang/String;JFILjava/lang/String;Z)V

    .line 597
    :cond_0
    return-void
.end method
