.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Z)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Z)V
    .locals 0

    .line 472
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iput-boolean p2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 472
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;->c(Lo/bra;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 476
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v4

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;->e:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/ath;->a(J)Ljava/util/ArrayList;

    move-result-object v5

    .line 478
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 480
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 482
    new-instance v7, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 483
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$3;->a:Z

    if-nez v0, :cond_0

    .line 485
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 487
    goto :goto_0

    .line 490
    :cond_0
    invoke-virtual {v9, v7}, Lcom/huawei/health/sns/model/group/GroupMember;->updateToUser(Lcom/huawei/health/sns/model/user/User;)V

    .line 491
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    goto :goto_0

    .line 493
    :cond_1
    return-object v6
.end method
