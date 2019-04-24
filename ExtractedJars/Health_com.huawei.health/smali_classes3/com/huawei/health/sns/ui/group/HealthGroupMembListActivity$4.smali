.class Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 279
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "listType == 3 setRightButtonOnClickListener click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/bhk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bhk;->e()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 281
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 282
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 283
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 286
    :cond_0
    return-void
.end method
