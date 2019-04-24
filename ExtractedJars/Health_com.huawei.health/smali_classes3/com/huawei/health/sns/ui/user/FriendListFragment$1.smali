.class Lcom/huawei/health/sns/ui/user/FriendListFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/FriendListFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/user/FriendListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V

    .line 324
    const/4 v3, 0x0

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Lcom/huawei/health/sns/ui/user/FriendListFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v3

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v3, v2}, Lo/axj;->c(Landroid/app/Activity;IZLandroid/os/Handler;)V

    .line 336
    new-instance v4, Lo/atn;

    invoke-direct {v4}, Lo/atn;-><init>()V

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/atn;->b(Landroid/app/Activity;)V

    .line 338
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 344
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Lcom/huawei/health/sns/ui/user/FriendListFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$1;->b:Lcom/huawei/health/sns/ui/user/FriendListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 348
    :cond_0
    return-void
.end method
