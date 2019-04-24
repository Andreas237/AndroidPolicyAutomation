.class public Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$e;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/Runnable;

.field private B:Landroid/os/Handler;

.field private D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private a:Landroid/widget/TextView;

.field private b:Landroid/app/Activity;

.field c:Z

.field private d:Landroid/support/v7/widget/RecyclerView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/os/Handler;

.field private k:Landroid/widget/TextView;

.field private l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private m:Ljava/lang/String;

.field private n:Lcom/huawei/health/sns/model/group/Group;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;>;"
        }
    .end annotation
.end field

.field private r:I

.field private s:I

.field private t:Ljava/lang/String;

.field private u:D

.field private v:[Ljava/lang/String;

.field private w:Landroid/widget/TextView;

.field private x:Lo/egn;

.field private y:Landroid/widget/ImageView;

.field private z:Lo/bhj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->x:Lo/egn;

    .line 140
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$e;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->j:Landroid/os/Handler;

    .line 484
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->B:Landroid/os/Handler;

    .line 494
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->A:Ljava/lang/Runnable;

    return-void
.end method

.method private a()V
    .locals 18

    .line 226
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->e:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-virtual {v0, v8, v1, v2, v3}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 232
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->r:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 234
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    .line 235
    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 234
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_walk_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    goto/16 :goto_0

    .line 239
    :sswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    .line 240
    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 239
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_run_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    goto/16 :goto_0

    .line 244
    :sswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_bike:I

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    .line 245
    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_riding_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    goto/16 :goto_0

    .line 249
    :sswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walk:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 250
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 253
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_walk_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    goto/16 :goto_0

    .line 257
    :sswitch_4
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_run:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 258
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 261
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_run_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    goto/16 :goto_0

    .line 265
    :sswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_ride:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 266
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 269
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_riding_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    goto/16 :goto_0

    .line 273
    :sswitch_6
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swim:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 274
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 277
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_swimming_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    goto :goto_0

    .line 281
    :sswitch_7
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 282
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_5

    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_target:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 285
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_rule_description_fitness_new:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    .line 291
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->g:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    invoke-direct/range {p0 .. p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b()V

    .line 295
    const/16 v0, 0x272b

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "HEALTH_EVENT_CURRENT_TIME"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 297
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 298
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 299
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 300
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 302
    const-string v14, ""

    .line 303
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v9, v10, v12}, Lo/bht;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 304
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_activity_social_coming_soon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    goto :goto_1

    .line 305
    :cond_6
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v9, v10, v12}, Lo/bht;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 306
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_activity_social_in_progress:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    goto :goto_1

    .line 307
    :cond_7
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v9, v10, v12}, Lo/bht;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_8

    .line 308
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_activity_social_is_over:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 311
    :cond_8
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getStatus()I

    move-result v0

    if-nez v0, :cond_9

    .line 312
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_examine:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 314
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 317
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getLastTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 318
    invoke-static {v8}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v15}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->i:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->s:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    move-object/from16 v4, p0

    iget v4, v4, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->s:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 323
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->f:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    invoke-direct/range {p0 .. p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->f()V

    .line 326
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->m:Ljava/lang/String;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getNumberOfPeople()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/boa;->b(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;I)V

    .line 327
    return-void

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

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)[Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->v:[Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v2

    .line 194
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 195
    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 196
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V

    .line 197
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    .line 220
    :cond_0
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 1

    .line 341
    sget v0, Lcom/huawei/android/sns/R$id;->event_member_recycler:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d:Landroid/support/v7/widget/RecyclerView;

    .line 342
    sget v0, Lcom/huawei/android/sns/R$id;->iv_event_poster:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->e:Landroid/widget/ImageView;

    .line 343
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->k:Landroid/widget/TextView;

    .line 344
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->a:Landroid/widget/TextView;

    .line 345
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->h:Landroid/widget/TextView;

    .line 346
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->g:Landroid/widget/TextView;

    .line 347
    sget v0, Lcom/huawei/android/sns/R$id;->tv_member_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->f:Landroid/widget/TextView;

    .line 348
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_rule_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->w:Landroid/widget/TextView;

    .line 349
    sget v0, Lcom/huawei/android/sns/R$id;->event_name_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->y:Landroid/widget/ImageView;

    .line 350
    sget v0, Lcom/huawei/android/sns/R$id;->tv_event_deadline:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->i:Landroid/widget/TextView;

    .line 351
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->e()V

    .line 353
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->a()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->y:Landroid/widget/ImageView;

    return-object v0
.end method

.method private c(Landroid/os/Message;)V
    .locals 2

    .line 507
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->q:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 510
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->z:Lo/bhj;

    if-eqz v0, :cond_0

    .line 511
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->z:Lo/bhj;

    invoke-virtual {v0}, Lo/bhj;->notifyDataSetChanged()V

    .line 512
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V
    .locals 5

    .line 395
    if-eqz p1, :cond_0

    .line 396
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getHuidList()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->v:[Ljava/lang/String;

    .line 397
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->o:Ljava/lang/String;

    .line 398
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_EVENT_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->o:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 401
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getGroupActivity()Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 402
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->p:Ljava/lang/String;

    .line 403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getActivityType()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->r:I

    .line 404
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getGoalValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getDetails()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->t:Ljava/lang/String;

    .line 406
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getNumberOfPeople()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->s:I

    .line 410
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/app/Activity;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 434
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleEventMemberImage start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->j:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 458
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;Landroid/os/Message;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c(Landroid/os/Message;)V

    return-void
.end method

.method private e()V
    .locals 6

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 357
    if-eqz v4, :cond_1

    .line 358
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 359
    if-eqz v5, :cond_0

    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/model/group/Group;

    .line 361
    const-string v0, "activityId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->m:Ljava/lang/String;

    .line 363
    :cond_0
    goto :goto_0

    .line 364
    :cond_1
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 366
    return-void

    .line 368
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->q:Ljava/util/List;

    .line 369
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->D:Ljava/util/ArrayList;

    .line 371
    new-instance v0, Lo/bhj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->q:Ljava/util/List;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->m:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lo/bhj;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->z:Lo/bhj;

    .line 372
    new-instance v5, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    const/4 v1, 0x6

    invoke-direct {v5, v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 374
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->z:Lo/bhj;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 376
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c:Z

    if-eqz v0, :cond_2

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->j:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 379
    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->r:I

    return v0
.end method

.method private f()V
    .locals 2

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->B:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->A:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 491
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->D:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)D
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->u:D

    return-wide v0
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->s:I

    return v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->j:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->l:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V
    .locals 2

    .line 382
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;J)V

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->n:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->j:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 387
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c:Z

    .line 389
    :goto_0
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 567
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->D:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 571
    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->s:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4

    .line 462
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 463
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityCreated: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 517
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 331
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_event_detail:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 333
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b:Landroid/app/Activity;

    .line 334
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c:Z

    .line 335
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b(Landroid/view/View;)V

    .line 336
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->e()V

    .line 337
    return-object v4
.end method

.method public onResume()V
    .locals 0

    .line 522
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 523
    return-void
.end method
