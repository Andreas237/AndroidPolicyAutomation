.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


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

    .line 620
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 2

    .line 624
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$9;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/bvj;

    invoke-virtual {v1}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 625
    const/4 v0, 0x1

    return v0
.end method
