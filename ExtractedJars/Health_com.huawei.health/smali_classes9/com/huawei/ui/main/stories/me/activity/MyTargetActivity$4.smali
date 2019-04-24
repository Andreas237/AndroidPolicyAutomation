.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

.field final synthetic e:D


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iput-wide p2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->e:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 0

    .line 507
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 487
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->k(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->e:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 489
    :goto_0
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalChanged = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_goal_change"

    if-eqz v5, :cond_1

    const-string v3, "false"

    goto :goto_1

    :cond_1
    const-string v3, "true"

    :goto_1
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 492
    if-nez v5, :cond_2

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 496
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->e:D

    invoke-virtual {v0, v1, v2, v3}, Lo/dlf;->b(Landroid/content/Context;D)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 498
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->y(Landroid/content/Context;)V

    .line 501
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acs;->d(Z)V

    .line 502
    return-void
.end method
