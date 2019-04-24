.class public Lo/bik;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bik$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bik$b;>;"
    }
.end annotation


# static fields
.field private static c:I


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field

.field private b:Lo/elp;

.field private d:Landroid/content/Context;

.field private e:Landroid/view/LayoutInflater;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 226
    const/4 v0, 0x0

    sput v0, Lo/bik;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 57
    iput-object p1, p0, Lo/bik;->a:Ljava/util/List;

    .line 58
    iput-object p2, p0, Lo/bik;->d:Landroid/content/Context;

    .line 59
    iget-object v0, p0, Lo/bik;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bik;->e:Landroid/view/LayoutInflater;

    .line 60
    return-void
.end method

.method static synthetic a(Lo/bik;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/bik;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lo/bik;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/bik;->c(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method private b(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 137
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 138
    invoke-static {p1}, Lo/bik$b;->e(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_been_removed_group:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    iget-object v0, p1, Lo/bik$b;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 141
    :cond_0
    invoke-static {p1}, Lo/bik$b;->b(Lo/bik$b;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 142
    invoke-static {p1}, Lo/bik$b;->e(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 143
    invoke-static {p1}, Lo/bik$b;->e(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_i_am_group_manager:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v0, p1, Lo/bik$b;->itemView:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 146
    :goto_0
    return-void
.end method

.method private c(Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 234
    iget-object v0, p0, Lo/bik;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_list:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 235
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lo/bik;->b:Lo/elp;

    .line 236
    sget v0, Lcom/huawei/android/sns/R$id;->line_stick:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 237
    new-instance v0, Lo/bik$2;

    invoke-direct {v0, p0}, Lo/bik$2;-><init>(Lo/bik;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v0, p0, Lo/bik;->b:Lo/elp;

    const/16 v1, 0x9

    invoke-virtual {v0, p1, v1}, Lo/elp;->c(Landroid/view/View;I)V

    .line 245
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 206
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lo/bik;->d:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 207
    iget-object v0, p0, Lo/bik;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_i_am_group_member_delete_or_not:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_contact_delete:I

    .line 208
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bik$5;

    invoke-direct {v2, p0, p1}, Lo/bik$5;-><init>(Lo/bik;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 215
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bik$3;

    invoke-direct {v2, p0}, Lo/bik$3;-><init>(Lo/bik;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 221
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 222
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 223
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 224
    return-void
.end method

.method private c(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 129
    iget-object v0, p0, Lo/bik;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 130
    invoke-static {p1}, Lo/bik$b;->i(Lo/bik$b;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 132
    :cond_0
    invoke-static {p1}, Lo/bik$b;->i(Lo/bik$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/bik;Lcom/huawei/health/sns/model/group/Group;Z)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lo/bik;->d(Lcom/huawei/health/sns/model/group/Group;Z)V

    return-void
.end method

.method static synthetic d(Lo/bik;)Lo/elp;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/bik;->b:Lo/elp;

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;Z)V
    .locals 2

    .line 254
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    new-instance v1, Lo/bik$10;

    invoke-direct {v1, p0}, Lo/bik$10;-><init>(Lo/bik;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/ant;->a(Lcom/huawei/health/sns/model/group/Group;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 261
    return-void
.end method

.method private d(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 6

    .line 88
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v3

    .line 89
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 90
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 91
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

    .line 93
    :pswitch_0
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_walking:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    goto :goto_2

    .line 96
    :pswitch_1
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_run:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    goto :goto_2

    .line 99
    :pswitch_2
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    goto :goto_2

    .line 102
    :pswitch_3
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_type_group_type_workout:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    goto :goto_2

    .line 105
    :pswitch_4
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id10:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    goto :goto_2

    .line 108
    :pswitch_5
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_device_setting_other:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    goto :goto_2

    .line 111
    :goto_1
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 112
    :goto_2
    goto :goto_3

    .line 115
    :cond_1
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    :goto_3
    invoke-static {p1}, Lo/bik$b;->e(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 120
    invoke-static {p1}, Lo/bik$b;->c(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 121
    invoke-static {p1}, Lo/bik$b;->b(Lo/bik$b;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_4

    .line 123
    :cond_2
    invoke-static {p1}, Lo/bik$b;->b(Lo/bik$b;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 125
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

.method private e(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 149
    invoke-static {p1}, Lo/bik$b;->f(Lo/bik$b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lo/bik$4;

    invoke-direct {v1, p0, p3}, Lo/bik$4;-><init>(Lo/bik;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 157
    invoke-static {p1}, Lo/bik$b;->f(Lo/bik$b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lo/bik$1;

    invoke-direct {v1, p0, p3}, Lo/bik$1;-><init>(Lo/bik;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    return-void
.end method

.method static synthetic e(Lo/bik;Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lo/bik;->c(Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/bik$b;
    .locals 4

    .line 64
    new-instance v0, Lo/bik$b;

    iget-object v1, p0, Lo/bik;->e:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bik$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public e(Lo/bik$b;I)V
    .locals 6

    .line 69
    move-object v4, p1

    .line 70
    iget-object v0, p0, Lo/bik;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bik;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object v0, p0, Lo/bik;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 71
    :cond_0
    const-string v0, "HealthGroupListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBindViewHolder, mGroupList == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    return-void

    .line 74
    :cond_1
    iget-object v0, p0, Lo/bik;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 75
    invoke-static {v4}, Lo/bik$b;->a(Lo/bik$b;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/bik;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v1

    const-string v2, "pic_round_group_default"

    invoke-virtual {v1, v2}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 76
    invoke-static {v4}, Lo/bik$b;->a(Lo/bik$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 77
    invoke-static {v4}, Lo/bik$b;->d(Lo/bik$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    invoke-direct {p0, v4, p2, v5}, Lo/bik;->e(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V

    .line 80
    invoke-direct {p0, v4, p2, v5}, Lo/bik;->b(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V

    .line 82
    invoke-direct {p0, v4, p2, v5}, Lo/bik;->c(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V

    .line 84
    invoke-direct {p0, v4, p2, v5}, Lo/bik;->d(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V

    .line 85
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 176
    iget-object v0, p0, Lo/bik;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 44
    move-object v0, p1

    check-cast v0, Lo/bik$b;

    invoke-virtual {p0, v0, p2}, Lo/bik;->e(Lo/bik$b;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 44
    invoke-virtual {p0, p1, p2}, Lo/bik;->a(Landroid/view/ViewGroup;I)Lo/bik$b;

    move-result-object v0

    return-object v0
.end method
