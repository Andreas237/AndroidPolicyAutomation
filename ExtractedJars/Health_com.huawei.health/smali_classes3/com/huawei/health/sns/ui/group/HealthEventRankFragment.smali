.class public Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$a;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Lo/egb;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/ImageView;

.field private E:Ljava/lang/String;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private I:Z

.field private J:Landroid/os/Handler;

.field private a:Lo/egb;

.field private b:Lo/egb;

.field private c:Landroid/widget/ImageView;

.field private d:Lo/egb;

.field private e:Lo/egb;

.field private f:Landroid/app/Activity;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/support/v7/widget/RecyclerView;

.field private j:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:I

.field private m:Lo/bhi;

.field private n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

.field private o:Ljava/lang/String;

.field private p:Lcom/huawei/health/sns/model/group/Group;

.field private q:Lo/egn;

.field private r:I

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private t:D

.field private u:I

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

.field private x:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->q:Lo/egn;

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->I:Z

    .line 141
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->J:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->z:I

    return p1
.end method

.method private a()V
    .locals 7

    .line 583
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventDetail()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->E:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c:Landroid/widget/ImageView;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 590
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->u:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 592
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_single_walk:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 593
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 594
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_finish_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 595
    goto/16 :goto_0

    .line 597
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_single_run:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 599
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_finish_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 600
    goto/16 :goto_0

    .line 602
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_single_ride:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v5, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 603
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 604
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 605
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_finish_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 606
    goto/16 :goto_0

    .line 610
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 611
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 612
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 613
    goto :goto_0

    .line 615
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 617
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 618
    goto :goto_0

    .line 620
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 621
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 622
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 623
    .line 629
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    iget v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->r:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->r:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 632
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e()V

    .line 634
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_3
        0xcb -> :sswitch_3
        0xcc -> :sswitch_5
        0xcd -> :sswitch_4
    .end sparse-switch
.end method

.method private a(I)V
    .locals 4

    .line 476
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEventRankFromeCloud "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 478
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEventRankFromeCloud  is not Disconnected with Network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    return-void

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->o:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    invoke-static {v0, v1, v2, v3}, Lo/aoc;->c(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aol;)V

    .line 513
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c()V

    return-void
.end method

.method private b()V
    .locals 4

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->v:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->H:Ljava/util/ArrayList;

    new-instance v3, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$1;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/bht;->c(Ljava/util/List;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 327
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 14

    .line 382
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 384
    if-nez v6, :cond_0

    .line 385
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank groupUserRank == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    return-void

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->j:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 389
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    .line 390
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mFragment showShareButton()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-virtual {v7, v6}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 392
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v0

    if-lez v0, :cond_1

    .line 393
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 395
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 397
    goto :goto_1

    .line 399
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 401
    goto :goto_1

    .line 403
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 405
    goto :goto_1

    .line 407
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 409
    goto :goto_1

    .line 412
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    const-string v1, ""

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    :goto_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 415
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->A:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_me:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 417
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 421
    :goto_2
    const-string v8, ""

    .line 423
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->u:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 426
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v9

    .line 427
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    .line 429
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    div-double/2addr v0, v2

    double-to-int v10, v0

    .line 430
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    div-int/lit8 v2, v10, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    rem-int/lit8 v2, v10, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 432
    goto/16 :goto_4

    .line 433
    :cond_3
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 437
    goto/16 :goto_4

    .line 440
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->B:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v10

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 443
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    .line 444
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 447
    :cond_4
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const-string v8, "0"

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 451
    goto/16 :goto_4

    .line 453
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x404e000000000000L    # 60.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 456
    goto :goto_4

    .line 458
    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 459
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 461
    goto :goto_4

    .line 463
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 468
    :goto_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->D:Landroid/widget/ImageView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bbk;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 469
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
        0x67 -> :sswitch_1
        0xcc -> :sswitch_2
        0xcd -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->z:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 333
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    if-nez v0, :cond_0

    .line 335
    return-void

    .line 337
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 338
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 339
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->H:Ljava/util/ArrayList;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;

    invoke-direct {v2, p0, v3}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Ljava/util/List;)V

    invoke-virtual {v0, v3, v1, v2}, Lo/bht;->c(Ljava/util/List;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 353
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 5

    .line 359
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 361
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 362
    :cond_0
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    return-void

    .line 365
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->s:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 369
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank listGroupUserRank size is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->s:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshEventRank listGroupUserRank = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->s:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    if-eqz v0, :cond_2

    .line 372
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bhi;->c(Z)V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    invoke-virtual {v0}, Lo/bhi;->notifyDataSetChanged()V

    .line 375
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;I)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Landroid/os/Message;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->y:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->x:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    return-object p1
.end method

.method private d()V
    .locals 6

    .line 203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 204
    if-eqz v4, :cond_1

    .line 205
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 206
    if-eqz v5, :cond_0

    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->p:Lcom/huawei/health/sns/model/group/Group;

    .line 208
    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->o:Ljava/lang/String;

    .line 210
    :cond_0
    goto :goto_0

    .line 211
    :cond_1
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 213
    return-void

    .line 215
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->H:Ljava/util/ArrayList;

    .line 216
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->s:Ljava/util/List;

    .line 217
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->v:Ljava/util/List;

    .line 218
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a(I)V

    .line 219
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Landroid/os/Message;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->y:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 640
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 641
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->E:Ljava/lang/String;

    .line 642
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    .line 643
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    .line 666
    :cond_0
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 7

    .line 222
    sget v0, Lcom/huawei/android/sns/R$id;->event_rank_recycler_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->i:Landroid/support/v7/widget/RecyclerView;

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->i:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 254
    sget v0, Lcom/huawei/android/sns/R$id;->tv_title_speed_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->B:Lo/egb;

    .line 257
    sget v0, Lcom/huawei/android/sns/R$id;->layout_self_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->j:Landroid/view/View;

    .line 258
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_img_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->D:Landroid/widget/ImageView;

    .line 259
    sget v0, Lcom/huawei/android/sns/R$id;->tv_rank_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->C:Landroid/widget/TextView;

    .line 260
    sget v0, Lcom/huawei/android/sns/R$id;->tv_username_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->A:Landroid/widget/TextView;

    .line 261
    sget v0, Lcom/huawei/android/sns/R$id;->tv_speed_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->G:Landroid/widget/TextView;

    .line 262
    sget v0, Lcom/huawei/android/sns/R$id;->tv_finish_time_self:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->F:Landroid/widget/TextView;

    .line 264
    sget v0, Lcom/huawei/android/sns/R$id;->net_work_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->h:Landroid/view/View;

    .line 265
    sget v0, Lcom/huawei/android/sns/R$id;->rly_act_rank_detail:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->g:Landroid/view/View;

    .line 268
    sget v0, Lcom/huawei/android/sns/R$id;->iv_event_rank_poster:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c:Landroid/widget/ImageView;

    .line 269
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_type_desc:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d:Lo/egb;

    .line 270
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_member_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a:Lo/egb;

    .line 271
    sget v0, Lcom/huawei/android/sns/R$id;->event_detail_block_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->k:Landroid/widget/ImageView;

    .line 274
    sget v0, Lcom/huawei/android/sns/R$id;->tv_title_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b:Lo/egb;

    .line 275
    sget v0, Lcom/huawei/android/sns/R$id;->tv_title_finish_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e:Lo/egb;

    .line 277
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    iget v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->l:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->l:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 279
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Ljava/util/List;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->v:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->n:Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Lo/bhi;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/os/Handler;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->J:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/app/Activity;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->k:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public b(Z)V
    .locals 0

    .line 528
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->I:Z

    .line 529
    return-void
.end method

.method public c(IDILjava/lang/String;)V
    .locals 8

    .line 284
    iput-wide p2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    .line 285
    iput p4, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->r:I

    .line 286
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->u:I

    .line 287
    iput-object p5, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->E:Ljava/lang/String;

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->J:Landroid/os/Handler;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 289
    const-string v0, "Group_HealthEventRankFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshEventDetail() get ImgUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    new-instance v0, Lo/bhi;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->s:Ljava/util/List;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    iget v5, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->u:I

    invoke-direct/range {v0 .. v5}, Lo/bhi;-><init>(Landroid/content/Context;Ljava/util/List;DI)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    .line 293
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 294
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->i:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->i:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->t:D

    invoke-virtual {v0, v1, v2}, Lo/bhi;->a(D)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->m:Lo/bhi;

    invoke-virtual {v0}, Lo/bhi;->notifyDataSetChanged()V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    if-eqz v0, :cond_0

    .line 302
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 303
    const/16 v0, 0x5b

    iput v0, v7, Landroid/os/Message;->what:I

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->w:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->J:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 308
    :cond_0
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->H:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 576
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 195
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_event_rank:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 196
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->f:Landroid/app/Activity;

    .line 197
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d()V

    .line 198
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e(Landroid/view/View;)V

    .line 199
    return-object v2
.end method

.method public onResume()V
    .locals 1

    .line 517
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 518
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->I:Z

    if-eqz v0, :cond_0

    .line 519
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->I:Z

    .line 520
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 521
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 522
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->z:I

    .line 523
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a(I)V

    .line 525
    :cond_0
    return-void
.end method
