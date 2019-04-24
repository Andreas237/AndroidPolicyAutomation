.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

.field final synthetic e:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V
    .locals 0

    .line 1152
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->e:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1155
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1156
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick HealthEventShareActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1157
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1158
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1159
    const-string v0, "EXTRA_GROUP_ACTIVITY_DETAIL"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1160
    const-string v0, "activityRank"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->e:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$8;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/boa;->d(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)V

    .line 1164
    goto :goto_0

    .line 1165
    :cond_0
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1167
    :goto_0
    return-void
.end method
