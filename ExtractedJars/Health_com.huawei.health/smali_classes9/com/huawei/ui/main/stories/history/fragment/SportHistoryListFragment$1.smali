.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 934
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 10

    .line 938
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 939
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not install google services"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    new-instance v7, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v7, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_show_map_type_no_gms:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1$3;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;)V

    .line 943
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 948
    invoke-virtual {v7}, Lo/egy$b;->a()Lo/egy;

    move-result-object v6

    .line 949
    invoke-virtual {v6}, Lo/egy;->show()V

    .line 950
    const/4 v0, 0x0

    return v0

    .line 954
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, p4}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 955
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, p4}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->n()I

    move-result v6

    .line 956
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/brt;->c(Landroid/content/Context;I)Z

    .line 958
    goto :goto_0

    .line 960
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, p4}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->k()J

    move-result-wide v6

    .line 961
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, p4}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    invoke-virtual {v0}, Lo/fff;->m()J

    move-result-wide v8

    .line 962
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    const-wide/16 v1, 0x12c

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;J)V

    .line 963
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setClickable(Z)V

    .line 964
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x70

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 965
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, v6

    move-wide v3, v8

    iget-object v5, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$1;->b:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v5}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->l(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$c;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 967
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
