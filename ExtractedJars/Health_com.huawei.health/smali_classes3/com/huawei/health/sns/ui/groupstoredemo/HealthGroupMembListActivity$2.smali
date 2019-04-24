.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$2;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 169
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "listType == 3 setRightButtonOnClickListener click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$2;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/bil;

    move-result-object v0

    invoke-virtual {v0}, Lo/bil;->e()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 171
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 172
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 174
    :cond_0
    return-void
.end method
