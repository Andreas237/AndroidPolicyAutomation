.class public Lo/bhl;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhl$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bhl$c;>;"
    }
.end annotation


# static fields
.field private static g:I


# instance fields
.field private a:Lo/elp;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Landroid/view/LayoutInflater;

.field private e:Lo/atv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 234
    const/4 v0, 0x0

    sput v0, Lo/bhl;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 59
    iput-object p1, p0, Lo/bhl;->b:Ljava/util/List;

    .line 60
    iput-object p2, p0, Lo/bhl;->c:Landroid/content/Context;

    .line 61
    iget-object v0, p0, Lo/bhl;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bhl;->d:Landroid/view/LayoutInflater;

    .line 62
    return-void
.end method

.method static synthetic a(Lo/bhl;)Lo/elp;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/bhl;->a:Lo/elp;

    return-object v0
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 288
    iget-object v0, p0, Lo/bhl;->e:Lo/atv;

    if-nez v0, :cond_0

    .line 289
    new-instance v0, Lo/atv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/bhl;->e:Lo/atv;

    .line 291
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    .line 292
    invoke-virtual {p1, v2}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 293
    const/4 v0, 0x4

    const/16 v1, 0x155

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 294
    iget-object v0, p0, Lo/bhl;->e:Lo/atv;

    invoke-virtual {v0, p1}, Lo/atv;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 295
    return-void
.end method

.method private a(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 6

    .line 89
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v3

    .line 90
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 92
    move-object v4, v3

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "healthwalk"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "run"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "riding"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "bodybuilding"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "swimming"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "other"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x5

    :cond_0
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 94
    :pswitch_0
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_walking:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    goto :goto_2

    .line 97
    :pswitch_1
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_run:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    goto :goto_2

    .line 100
    :pswitch_2
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    goto :goto_2

    .line 103
    :pswitch_3
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_type_group_type_workout:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    goto :goto_2

    .line 106
    :pswitch_4
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id10:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    goto :goto_2

    .line 109
    :pswitch_5
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_device_setting_other:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    goto :goto_2

    .line 112
    :goto_1
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 113
    :goto_2
    goto :goto_3

    .line 116
    :cond_1
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 120
    :goto_3
    invoke-static {p1}, Lo/bhl$c;->c(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 121
    invoke-static {p1}, Lo/bhl$c;->e(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 122
    invoke-static {p1}, Lo/bhl$c;->b(Lo/bhl$c;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_4

    .line 124
    :cond_2
    invoke-static {p1}, Lo/bhl$c;->b(Lo/bhl$c;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 126
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x531275aa -> :sswitch_3
        -0x3780d84b -> :sswitch_2
        -0x5734d23 -> :sswitch_4
        0x1ba8b -> :sswitch_1
        0x6527f10 -> :sswitch_5
        0x362c0625 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic a(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/bhl;->a(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method static synthetic c(Lo/bhl;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/bhl;->c:Landroid/content/Context;

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;Z)V
    .locals 2

    .line 273
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    new-instance v1, Lo/bhl$8;

    invoke-direct {v1, p0}, Lo/bhl$8;-><init>(Lo/bhl;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/ant;->a(Lcom/huawei/health/sns/model/group/Group;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 280
    return-void
.end method

.method private c(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 138
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 139
    invoke-static {p1}, Lo/bhl$c;->c(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_been_removed_group:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    iget-object v0, p1, Lo/bhl$c;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1

    .line 143
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 144
    invoke-static {p1}, Lo/bhl$c;->b(Lo/bhl$c;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 145
    invoke-static {p1}, Lo/bhl$c;->c(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    invoke-static {p1}, Lo/bhl$c;->c(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_i_am_group_manager:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 149
    :cond_1
    invoke-static {p1}, Lo/bhl$c;->b(Lo/bhl$c;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 150
    invoke-static {p1}, Lo/bhl$c;->c(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    :goto_0
    iget-object v0, p1, Lo/bhl$c;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 154
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/bhl;->d(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method private d(Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 242
    iget-object v0, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_list:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 243
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lo/bhl;->a:Lo/elp;

    .line 255
    sget v0, Lcom/huawei/android/sns/R$id;->line_stick:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 256
    new-instance v0, Lo/bhl$5;

    invoke-direct {v0, p0, p2}, Lo/bhl$5;-><init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    iget-object v0, p0, Lo/bhl;->a:Lo/elp;

    const/16 v1, 0x9

    invoke-virtual {v0, p1, v1}, Lo/elp;->c(Landroid/view/View;I)V

    .line 264
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 214
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lo/bhl;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 215
    iget-object v0, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_i_am_group_member_delete_or_not:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_contact_delete:I

    .line 216
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bhl$4;

    invoke-direct {v2, p0, p1}, Lo/bhl$4;-><init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lo/bhl;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 223
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bhl$3;

    invoke-direct {v2, p0}, Lo/bhl$3;-><init>(Lo/bhl;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 229
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 230
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 231
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 232
    return-void
.end method

.method private d(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 130
    iget-object v0, p0, Lo/bhl;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 131
    invoke-static {p1}, Lo/bhl$c;->f(Lo/bhl$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 133
    :cond_0
    invoke-static {p1}, Lo/bhl$c;->f(Lo/bhl$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/bhl;Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lo/bhl;->d(Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method static synthetic d(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;Z)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lo/bhl;->c(Lcom/huawei/health/sns/model/group/Group;Z)V

    return-void
.end method

.method private e(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 157
    invoke-static {p1}, Lo/bhl$c;->i(Lo/bhl$c;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lo/bhl$1;

    invoke-direct {v1, p0, p3}, Lo/bhl$1;-><init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 165
    invoke-static {p1}, Lo/bhl$c;->i(Lo/bhl$c;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lo/bhl$2;

    invoke-direct {v1, p0, p3}, Lo/bhl$2;-><init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/bhl$c;
    .locals 4

    .line 66
    new-instance v0, Lo/bhl$c;

    iget-object v1, p0, Lo/bhl;->d:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhl$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public d(Lo/bhl$c;I)V
    .locals 6

    .line 71
    move-object v4, p1

    .line 72
    iget-object v0, p0, Lo/bhl;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bhl;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object v0, p0, Lo/bhl;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    const-string v0, "HealthGroupListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBindViewHolder, mGroupList == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lo/bhl;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 77
    invoke-static {v4}, Lo/bhl$c;->a(Lo/bhl$c;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 78
    invoke-static {v4}, Lo/bhl$c;->d(Lo/bhl$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    invoke-direct {p0, v4, p2, v5}, Lo/bhl;->e(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V

    .line 81
    invoke-direct {p0, v4, p2, v5}, Lo/bhl;->c(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V

    .line 83
    invoke-direct {p0, v4, p2, v5}, Lo/bhl;->d(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V

    .line 85
    invoke-direct {p0, v4, p2, v5}, Lo/bhl;->a(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V

    .line 86
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 184
    iget-object v0, p0, Lo/bhl;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 46
    move-object v0, p1

    check-cast v0, Lo/bhl$c;

    invoke-virtual {p0, v0, p2}, Lo/bhl;->d(Lo/bhl$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 46
    invoke-virtual {p0, p1, p2}, Lo/bhl;->a(Landroid/view/ViewGroup;I)Lo/bhl$c;

    move-result-object v0

    return-object v0
.end method
