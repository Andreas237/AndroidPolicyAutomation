.class public Lo/bhm;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhm$c;,
        Lo/bhm$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;>;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Landroid/view/LayoutInflater;

.field private d:Landroid/app/Activity;

.field private e:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;>;Lcom/huawei/health/sns/model/group/Group;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bhm;->b:Z

    .line 52
    iput-object p1, p0, Lo/bhm;->d:Landroid/app/Activity;

    .line 53
    iput-object p2, p0, Lo/bhm;->a:Ljava/util/List;

    .line 54
    iput-object p3, p0, Lo/bhm;->e:Lcom/huawei/health/sns/model/group/Group;

    .line 55
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bhm;->c:Landroid/view/LayoutInflater;

    .line 56
    return-void
.end method

.method static synthetic c(Lo/bhm;)Landroid/app/Activity;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic d(Lo/bhm;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/bhm;->e:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;Lo/bhm$b;)V
    .locals 9

    .line 140
    if-eqz p1, :cond_2

    .line 141
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 143
    :sswitch_0
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 144
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    goto/16 :goto_0

    .line 147
    :sswitch_1
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 148
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 147
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    goto/16 :goto_0

    .line 151
    :sswitch_2
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_bike:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 152
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    goto :goto_0

    .line 155
    :sswitch_3
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walk:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 156
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    goto :goto_0

    .line 159
    :sswitch_4
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_run:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 160
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    goto :goto_0

    .line 163
    :sswitch_5
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_ride:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 164
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    goto :goto_0

    .line 167
    :sswitch_6
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swim:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 168
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    goto :goto_0

    .line 171
    :sswitch_7
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 172
    invoke-static {p2}, Lo/bhm$b;->i(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    .line 177
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityStatus()I

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 179
    :cond_0
    invoke-static {p2}, Lo/bhm$b;->f(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 181
    :cond_1
    invoke-static {p2}, Lo/bhm$b;->f(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 184
    :cond_2
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_7
        0xcd -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public b(Z)V
    .locals 0

    .line 195
    iput-boolean p1, p0, Lo/bhm;->b:Z

    .line 196
    invoke-virtual {p0}, Lo/bhm;->notifyDataSetChanged()V

    .line 197
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 207
    iget-boolean v0, p0, Lo/bhm;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bhm;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 208
    iget-object v0, p0, Lo/bhm;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 210
    :cond_0
    iget-object v0, p0, Lo/bhm;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 188
    iget-boolean v0, p0, Lo/bhm;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bhm;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lo/bhm;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 189
    const/4 v0, 0x1

    return v0

    .line 191
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 14

    .line 68
    move/from16 v0, p2

    invoke-virtual {p0, v0}, Lo/bhm;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_4

    .line 69
    move-object v5, p1

    check-cast v5, Lo/bhm$b;

    .line 70
    iget-object v0, p0, Lo/bhm;->a:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    .line 71
    invoke-static {v5}, Lo/bhm$b;->c(Lo/bhm$b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lo/bhm$3;

    invoke-direct {v1, p0, v6}, Lo/bhm$3;-><init>(Lo/bhm;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getImgUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5}, Lo/bhm$b;->a(Lo/bhm$b;)Landroid/widget/ImageView;

    move-result-object v3

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 85
    :cond_0
    invoke-static {v5}, Lo/bhm$b;->d(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 88
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 89
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 90
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 94
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lo/bhm;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_ACT_LIST_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 106
    invoke-static {v5}, Lo/bhm$b;->e(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lo/bhm;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_ACT_LIST_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 111
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-virtual {v0, v1, v6, v11}, Lo/bht;->a(Landroid/content/Context;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 113
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Lo/bht;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    .line 114
    if-eqz v13, :cond_1

    .line 115
    iget-object v0, v5, Lo/bhm$b;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 117
    :cond_1
    iget-object v0, v5, Lo/bhm$b;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 119
    :goto_0
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 120
    invoke-static {v5}, Lo/bhm$b;->b(Lo/bhm$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    :cond_2
    invoke-direct {p0, v6, v5}, Lo/bhm;->e(Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;Lo/bhm$b;)V

    .line 125
    iget-object v0, p0, Lo/bhm;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    invoke-static {v5}, Lo/bhm$b;->k(Lo/bhm$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 128
    :cond_3
    invoke-static {v5}, Lo/bhm$b;->k(Lo/bhm$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 130
    :goto_1
    iget-object v0, p0, Lo/bhm;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p2

    if-ge v1, v0, :cond_4

    .line 131
    invoke-static {v5}, Lo/bhm$b;->g(Lo/bhm$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    :cond_4
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 60
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 61
    new-instance v0, Lo/bhm$c;

    iget-object v1, p0, Lo/bhm;->c:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->health_group_loading_more:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhm$c;-><init>(Landroid/view/View;)V

    return-object v0

    .line 63
    :cond_0
    new-instance v0, Lo/bhm$b;

    iget-object v1, p0, Lo/bhm;->c:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_group_activity_list:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhm$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method
