.class Lcom/huawei/health/sns/ui/user/AddFriendFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/AddFriendFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/user/AddFriendFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment$4;->c:Lcom/huawei/health/sns/ui/user/AddFriendFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 0

    .line 365
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 4

    .line 352
    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 353
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment$4;->c:Lcom/huawei/health/sns/ui/user/AddFriendFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->c(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 354
    const/16 v0, 0x512

    iput v0, v2, Landroid/os/Message;->what:I

    .line 355
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 356
    const-string v0, "keyIsGetSettingSucc"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 357
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment$4;->c:Lcom/huawei/health/sns/ui/user/AddFriendFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->c(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 359
    return-void
.end method
