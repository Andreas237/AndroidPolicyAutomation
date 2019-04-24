.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


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

    .line 358
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$6;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$6;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x68

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$6;->d:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->c(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 363
    return-void
.end method
