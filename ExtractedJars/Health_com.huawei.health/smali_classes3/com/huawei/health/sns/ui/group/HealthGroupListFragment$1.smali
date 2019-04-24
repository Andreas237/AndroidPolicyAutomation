.class Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 0

    .line 561
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;)V
    .locals 12

    .line 564
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthGetGroupInfoByIdsBean = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    const-string v0, "0"

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getResultCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 567
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getGroupInfoList()Ljava/util/List;

    move-result-object v4

    .line 568
    invoke-static {}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 569
    if-eqz v4, :cond_4

    :try_start_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 570
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;

    .line 571
    if-eqz v7, :cond_3

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/group/Group;

    .line 573
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 574
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupAddress(Ljava/lang/String;)V

    .line 575
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupDesc(Ljava/lang/String;)V

    .line 576
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupType(Ljava/lang/String;)V

    .line 578
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    goto :goto_2

    .line 581
    :cond_1
    goto :goto_1

    .line 582
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 583
    goto :goto_3

    .line 586
    :cond_3
    goto/16 :goto_0

    .line 588
    :cond_4
    :goto_3
    monitor-exit v5

    goto :goto_4

    :catchall_0
    move-exception v10

    monitor-exit v5

    throw v10

    .line 589
    :goto_4
    goto :goto_5

    .line 590
    :cond_5
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGroupInfoByIds getResultCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getResultCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    :goto_5
    invoke-static {}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 593
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 594
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->o(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 596
    :cond_6
    monitor-exit v4

    goto :goto_6

    :catchall_1
    move-exception v11

    monitor-exit v4

    throw v11

    .line 597
    :goto_6
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 6

    .line 601
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    invoke-static {}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 603
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->d:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->o(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 606
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 607
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 561
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;->b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;)V

    return-void
.end method
