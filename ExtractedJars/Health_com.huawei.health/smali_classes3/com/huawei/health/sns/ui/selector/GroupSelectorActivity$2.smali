.class Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 773
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 8

    .line 777
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e()V

    .line 779
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    iget-object v4, v4, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    .line 780
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    iget-object v5, v5, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v5

    .line 779
    const/4 v6, 0x2

    invoke-virtual/range {v0 .. v6}, Lo/apz;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 781
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 782
    const-string v0, "groupId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v7}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 784
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->finish()V

    .line 785
    return-void
.end method

.method public d()V
    .locals 1

    .line 790
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$2;->d:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e()V

    .line 791
    return-void
.end method
