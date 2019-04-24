.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 975
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 978
    invoke-static {p4, p5}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 980
    move-object v0, p1

    check-cast v0, Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p3}, Landroid/widget/ExpandableListView;->getExpandableListPosition(I)J

    move-result-wide v4

    .line 981
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v6

    .line 982
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v7

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0, v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)I

    .line 985
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0, v7}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)I

    .line 986
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->u(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    goto/16 :goto_0

    .line 989
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v8

    .line 992
    invoke-virtual {v8}, Lo/fff;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    .line 993
    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 995
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the record going to delete belongs to plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->q(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    goto :goto_0

    .line 998
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$6;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->t(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 1001
    :cond_2
    :goto_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "long click,  groupPosition is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", childPosition is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    const/4 v0, 0x1

    return v0

    .line 1005
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
