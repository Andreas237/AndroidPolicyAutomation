.class final Lcom/huawei/health/sns/ui/group/GroupFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupFragment;->b(ZLcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/GroupFragment;)Lo/brd;
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
.field final synthetic a:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic c:Lcom/huawei/health/sns/ui/group/GroupFragment;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/GroupFragment;Z)V
    .locals 0

    .line 1152
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->a:Lcom/huawei/health/sns/model/group/Group;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    iput-boolean p3, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1152
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 1156
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->a:Lcom/huawei/health/sns/model/group/Group;

    .line 1157
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    .line 1156
    invoke-virtual {v0, v1, v2}, Lo/ath;->b(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 1159
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1161
    new-array v5, v4, [J

    .line 1163
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    .line 1165
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1166
    if-eqz v7, :cond_0

    .line 1168
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    aput-wide v0, v5, v6

    .line 1163
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1171
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->c:Lcom/huawei/health/sns/ui/group/GroupFragment;

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$7;->d:Z

    invoke-static {v0, v1, v5}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(Lcom/huawei/health/sns/ui/group/GroupFragment;Z[J)V

    .line 1172
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
