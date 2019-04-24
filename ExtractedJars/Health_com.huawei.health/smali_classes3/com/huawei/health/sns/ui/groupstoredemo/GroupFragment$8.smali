.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

.field final synthetic d:Lcom/huawei/health/sns/model/group/GroupMember;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 1309
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;->d:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 4

    .line 1314
    if-nez p1, :cond_0

    .line 1316
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;->d:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V

    goto :goto_0

    .line 1318
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1320
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1321
    new-instance v0, Lo/atp;

    invoke-direct {v0}, Lo/atp;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;->d:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Lo/atp;->c(Lcom/huawei/health/sns/model/group/GroupMember;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 1322
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$8;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Ljava/util/ArrayList;)V

    .line 1325
    :cond_1
    :goto_0
    return-void
.end method
