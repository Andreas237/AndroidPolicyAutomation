.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 593
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 4

    .line 596
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 597
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clickGroupPosition is true,waiting data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    const/4 v0, 0x1

    return v0

    .line 600
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 601
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fatherList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    const/4 v0, 0x1

    return v0

    .line 604
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 605
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fatherList groupPosition is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    const/4 v0, 0x1

    return v0

    .line 608
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 609
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    goto :goto_0

    .line 611
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 613
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
