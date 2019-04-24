.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

.field final synthetic c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 537
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->e:Ljava/util/List;

    iput-object p4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->d:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 541
    if-eqz p2, :cond_3

    .line 542
    move-object v4, p2

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getTrackDistanceSum()I

    move-result v1

    int-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setBestValue(D)V

    .line 546
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 548
    const/4 v5, 0x1

    .line 549
    const/4 v6, 0x0

    .line 550
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->d:Ljava/util/List;

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    if-nez v6, :cond_0

    .line 552
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 554
    add-int/lit8 v5, v5, 0x1

    .line 555
    const/4 v6, 0x1

    .line 557
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->d:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 558
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->d:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 559
    add-int/lit8 v5, v5, 0x1

    .line 550
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 561
    :cond_1
    if-nez v6, :cond_2

    .line 562
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->setGroupRank(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 566
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 567
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 568
    const/16 v0, 0x59

    iput v0, v7, Landroid/os/Message;->what:I

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->e:Ljava/util/List;

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$5;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 572
    goto :goto_1

    .line 574
    :cond_3
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processUpdateSelfDatas objData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    :goto_1
    return-void
.end method
