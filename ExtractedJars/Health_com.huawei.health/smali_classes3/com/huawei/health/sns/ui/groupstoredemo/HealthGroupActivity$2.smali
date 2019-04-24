.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 661
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 664
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0x8006

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 665
    if-nez p1, :cond_3

    .line 666
    if-eqz p2, :cond_2

    .line 667
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    move-object v4, p2

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    .line 669
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 670
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 672
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    const-wide v2, 0x5d471fdcb4e9480L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 673
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getTrackDistanceSum()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDistance(J)V

    .line 674
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getStepSum()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setSteps(J)V

    .line 675
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->getDuration()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDuration(J)V

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    invoke-interface {v0, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 678
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " HealthGroupRank groupRank = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 680
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 681
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/util/List;)V

    .line 682
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 683
    const v0, 0x8007

    iput v0, v5, Landroid/os/Message;->what:I

    .line 684
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->a:Ljava/util/List;

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 685
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 687
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newGroupRanks.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    goto :goto_1

    .line 689
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/util/List;)V

    .line 691
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 692
    const v0, 0x8007

    iput v0, v4, Landroid/os/Message;->what:I

    .line 693
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 696
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupRankList.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 701
    :cond_3
    :goto_1
    return-void
.end method
