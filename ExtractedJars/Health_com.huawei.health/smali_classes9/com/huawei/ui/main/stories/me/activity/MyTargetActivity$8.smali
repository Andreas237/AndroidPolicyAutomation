.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 3

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)D

    .line 376
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    goto :goto_0

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;I)V

    .line 381
    :goto_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$8;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 370
    return-void
.end method
