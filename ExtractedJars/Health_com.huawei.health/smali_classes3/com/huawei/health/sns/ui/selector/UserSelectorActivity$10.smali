.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(JLjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JLjava/lang/String;I)V
    .locals 0

    .line 865
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->b:J

    iput-object p4, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->a:Ljava/lang/String;

    iput p5, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 8

    .line 871
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->b:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v4, v4, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    .line 872
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v5, v5, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->c:I

    .line 871
    invoke-virtual/range {v0 .. v6}, Lo/apz;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 873
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 874
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 876
    const-string v0, "userId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->b:J

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_0

    .line 878
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 880
    const-string v0, "groupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->b:J

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 882
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v7}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 883
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$10;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 884
    return-void
.end method

.method public d()V
    .locals 0

    .line 890
    return-void
.end method
