.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

.field final synthetic d:D


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V
    .locals 0

    .line 453
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->a:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iput-wide p2, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->d:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 456
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal err_code= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    if-nez p1, :cond_0

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->a:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->a:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;Z)Z

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->a:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->d:D

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    goto :goto_0

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->a:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$10;->d:D

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    .line 464
    :goto_0
    return-void
.end method
