.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1657
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->b:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->e:Ljava/util/List;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1661
    if-eqz p2, :cond_2

    .line 1662
    move-object v4, p2

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    .line 1663
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "processUpdateSelfDatas objData not null groupRanks size is :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1664
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 1666
    if-eqz v6, :cond_0

    .line 1667
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1668
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getTrackDistanceSum()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDistance(J)V

    .line 1669
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getStepSum()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setSteps(J)V

    .line 1670
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getDuration()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDuration(J)V

    .line 1673
    :cond_0
    goto :goto_0

    .line 1675
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1676
    goto :goto_1

    .line 1678
    :cond_2
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processUpdateSelfDatas objData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1679
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1681
    :goto_1
    return-void
.end method
