.class Lcom/huawei/health/sns/ui/group/GroupFragment$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/GroupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 0

    .line 1667
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1671
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 1672
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 1673
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1675
    const-string v0, "GROUP_IMAGE_REFRESH_ACTION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1677
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 1678
    if-eqz v3, :cond_0

    .line 1680
    const-string v0, "groupImageUrl"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1681
    const-string v0, "groupImageDownloadUrl"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1682
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Lcom/huawei/health/sns/ui/group/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 1683
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Lcom/huawei/health/sns/ui/group/GroupFragment;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 1684
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->k(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 1686
    :cond_0
    goto :goto_0

    .line 1687
    :cond_1
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1689
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$5;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->g(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 1692
    :cond_2
    :goto_0
    return-void
.end method
