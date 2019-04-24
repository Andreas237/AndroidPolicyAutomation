.class Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 487
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupUserRank resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 490
    :cond_0
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupUserRank resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\n "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "result = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    :goto_0
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_2

    .line 494
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    const-class v1, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    invoke-static {p2, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->getUserRank()Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->getTotalCount()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;I)I

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 498
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->getGroupUserRank()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->getGroupUserRank()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 502
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;I)I

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->k(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->k(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x5c

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 507
    goto :goto_1

    .line 505
    :catch_0
    move-exception v4

    .line 506
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    goto :goto_1

    .line 509
    :cond_2
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    :goto_1
    return-void
.end method
