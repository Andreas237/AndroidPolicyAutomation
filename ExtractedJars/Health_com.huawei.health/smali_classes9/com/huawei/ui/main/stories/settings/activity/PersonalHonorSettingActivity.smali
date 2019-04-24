.class public Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$e;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/fho;

.field private c:Landroid/widget/ListView;

.field private e:Landroid/os/Handler;

.field private f:F

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fhr;>;"
        }
    .end annotation
.end field

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private m:F

.field private o:J

.field private p:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->f:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->p:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->m:F

    .line 66
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->o:J

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 16

    .line 79
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$e;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$e;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_cumulative_number:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->i:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_cumulative_description:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->k:Landroid/widget/TextView;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_set_home_listview:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c:Landroid/widget/ListView;

    .line 83
    const/4 v8, 0x0

    .line 84
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    const-wide/16 v0, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_mile:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v5

    .line 86
    const-wide/16 v0, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_mile:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v6

    .line 87
    const-wide/16 v0, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_mile:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v7

    goto :goto_0

    .line 89
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$plurals;->sug_km:I

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v5

    .line 90
    sget v0, Lcom/huawei/ui/main/R$plurals;->sug_km:I

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v6

    .line 91
    sget v0, Lcom/huawei/ui/main/R$plurals;->sug_km:I

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v7

    .line 93
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$plurals;->IDS_plugin_fitnessadvice_minute:I

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v8

    .line 94
    new-instance v9, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_total_walking_distance:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v9, v5, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 95
    new-instance v10, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_plugin_achievement_report_run:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v10, v6, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 96
    new-instance v11, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_total_cycling_distance:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v11, v7, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 97
    new-instance v12, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_achieve_accumulative_fitness:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v12, v8, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PERSONAL_HONOR_SETTING_POSITION"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 105
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "displayNum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v14, 0x1

    .line 107
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 108
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 112
    :cond_2
    const/4 v0, 0x3

    if-ne v0, v14, :cond_3

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_3

    .line 113
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no show FitnessCourseDisplay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v14, 0x1

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PERSONAL_HONOR_SETTING_POSITION"

    .line 116
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 115
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 120
    :cond_3
    const/4 v0, 0x0

    if-gt v0, v14, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v14, v0, :cond_4

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhr;->b(Z)V

    .line 123
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v15

    .line 124
    const/4 v0, 0x0

    iput v0, v15, Landroid/os/Message;->what:I

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v15, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    invoke-virtual {v0, v15}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 127
    new-instance v0, Lo/fho;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3}, Lo/fho;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/os/Handler;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b:Lo/fho;

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c:Landroid/widget/ListView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b:Lo/fho;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c:Landroid/widget/ListView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 131
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_user_head_img:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->h:Landroid/widget/ImageView;

    .line 132
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b()V

    .line 133
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;F)F
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->m:F

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/os/Handler;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 8

    .line 253
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 255
    return-void

    .line 257
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 258
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 259
    const/4 v6, 0x0

    .line 260
    if-eqz v5, :cond_1

    .line 261
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 263
    :cond_1
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UserInfomation is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 267
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 270
    :cond_2
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bmp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :goto_1
    goto :goto_2

    .line 273
    :cond_3
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "headImgPath is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    :goto_2
    return-void
.end method

.method private c()V
    .locals 8

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 138
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v7, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;

    invoke-direct {v7, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V

    const-wide/16 v2, 0x0

    const/16 v6, 0xe

    invoke-interface/range {v0 .. v7}, Lo/dti;->e(Landroid/content/Context;JJILo/duh;)V

    .line 164
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/brt;->b(ILo/bui;)V

    .line 183
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;F)F
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->f:F

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;J)J
    .locals 0

    .line 49
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->o:J

    return-wide p1
.end method

.method private d(II)Landroid/text/SpannableString;
    .locals 9

    .line 237
    const-string v4, ""

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 241
    :cond_0
    int-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 243
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-virtual {v0, p2, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 244
    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 245
    invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_18:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v8, v0

    .line 247
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v0, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v7

    const/16 v2, 0x12

    invoke-virtual {v6, v0, v7, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 248
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v7

    const/16 v2, 0x12

    invoke-virtual {v6, v0, v7, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 249
    return-object v6
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 18

    .line 186
    sget-object v5, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d:Ljava/lang/Object;

    monitor-enter v5

    .line 187
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v9, 0x0

    .line 189
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->f:F

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_mile:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v6

    .line 191
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->p:F

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_mile:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v7

    .line 192
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->m:F

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_mile:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v8

    goto :goto_0

    .line 194
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->f:F

    float-to-double v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_km:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v6

    .line 195
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->p:F

    float-to-double v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_km:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v7

    .line 196
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->m:F

    float-to-double v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    double-to-int v0, v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->sug_km:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v8

    .line 198
    :goto_0
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->o:J

    invoke-static {v0, v1}, Lo/cxh;->e(J)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/cxh;->e(DIIZ)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_plugin_fitnessadvice_minute:I

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(II)Landroid/text/SpannableString;

    move-result-object v9

    .line 199
    new-instance v10, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_total_walking_distance:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v10, v6, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 200
    new-instance v11, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_plugin_achievement_report_run:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v11, v7, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 201
    new-instance v12, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_total_cycling_distance:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v12, v8, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 202
    new-instance v13, Lo/fhr;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_achieve_accumulative_fitness:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v13, v9, v0, v1}, Lo/fhr;-><init>(Landroid/text/SpannableString;Ljava/lang/String;Z)V

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PERSONAL_HONOR_SETTING_POSITION"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 211
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "displayNum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const/4 v15, 0x1

    .line 213
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 214
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    .line 218
    :cond_2
    const/4 v0, 0x3

    if-ne v0, v15, :cond_3

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_3

    .line 219
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no update FitnessCourseDisplay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/4 v15, 0x1

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PERSONAL_HONOR_SETTING_POSITION"

    .line 222
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 221
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 226
    :cond_3
    const/4 v0, 0x0

    if-gt v0, v15, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v15, v0, :cond_4

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhr;->b(Z)V

    .line 229
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b:Lo/fho;

    invoke-virtual {v0}, Lo/fho;->notifyDataSetChanged()V

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v16

    .line 231
    const/4 v0, 0x0

    move-object/from16 v1, v16

    iput v0, v1, Landroid/os/Message;->what:I

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->g:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e:Landroid/os/Handler;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v17

    monitor-exit v5

    throw v17

    .line 235
    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;F)F
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->p:F

    return p1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 70
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 71
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_personal_honor_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->setContentView(I)V

    .line 73
    iput-object p0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a:Landroid/content/Context;

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->a()V

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c()V

    .line 76
    return-void
.end method
