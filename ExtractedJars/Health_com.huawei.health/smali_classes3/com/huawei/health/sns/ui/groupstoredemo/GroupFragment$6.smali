.class final Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z)V
    .locals 0

    .line 1160
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->b:Lcom/huawei/health/sns/model/group/Group;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iput-boolean p3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1160
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 1164
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->b:Lcom/huawei/health/sns/model/group/Group;

    .line 1165
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    .line 1164
    invoke-virtual {v0, v1, v2}, Lo/ath;->b(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 1167
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1169
    new-array v5, v4, [J

    .line 1171
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    .line 1173
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1174
    if-eqz v7, :cond_0

    .line 1176
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    aput-wide v0, v5, v6

    .line 1171
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1179
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->d:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$6;->a:Z

    invoke-static {v0, v1, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z[J)V

    .line 1180
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
