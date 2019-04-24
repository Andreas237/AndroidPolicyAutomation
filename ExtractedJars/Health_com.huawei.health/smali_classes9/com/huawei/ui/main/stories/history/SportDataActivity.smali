.class public Lcom/huawei/ui/main/stories/history/SportDataActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/ui/commonui/base/BaseActivity;"
    }
.end annotation


# instance fields
.field private C:Ljava/lang/String;

.field private D:Landroid/content/res/Resources;

.field protected a:Lo/eyl;

.field protected b:Lo/eyc;

.field c:Lo/dav;

.field protected d:Lo/eyk;

.field protected e:Lo/faa;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/widget/TextView;

.field k:Landroid/widget/ImageView;

.field private l:I

.field private m:Landroid/widget/PopupWindow;

.field private n:[Ljava/lang/String;

.field private o:I

.field private p:Landroid/view/View;

.field private q:[[J

.field private r:Lo/ffi;

.field private s:I

.field private t:Z

.field private u:J

.field private v:Landroid/view/View;

.field private w:Ljava/lang/String;

.field private x:Landroid/content/Context;

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->l:I

    .line 81
    const/4 v0, 0x4

    const/4 v1, 0x4

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->q:[[J

    .line 91
    new-instance v0, Lo/ffi;

    invoke-direct {v0, p0}, Lo/ffi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->z:Z

    .line 96
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->y:I

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c:Lo/dav;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 182
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->h()V

    .line 183
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->classified_button_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyl;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a:Lo/eyl;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->classified_view_place:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/faa;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e:Lo/faa;

    .line 186
    new-instance v0, Lo/eyk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a:Lo/eyl;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e:Lo/faa;

    invoke-direct {v0, p0, v1, v2}, Lo/eyk;-><init>(Landroid/content/Context;Lo/eyl;Lo/faa;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d:Lo/eyk;

    .line 187
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->k(I)V

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_ll:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->v:Landroid/view/View;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_detail_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->k:Landroid/widget/ImageView;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->track_detail_map_sport_formal_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->j:Landroid/widget/TextView;

    .line 191
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->D:Landroid/content/res/Resources;

    .line 192
    return-void
.end method

.method private b(I)Ljava/lang/String;
    .locals 2

    .line 366
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 368
    :sswitch_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_workout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 369
    goto :goto_1

    .line 371
    :sswitch_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_cycle:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 372
    goto :goto_1

    .line 374
    :sswitch_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 375
    goto :goto_1

    .line 378
    :goto_0
    :sswitch_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 381
    :goto_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_2
        0x102 -> :sswitch_3
        0x103 -> :sswitch_1
        0x2711 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)Ljava/lang/String;
    .locals 1

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 11

    .line 195
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 196
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 197
    const/4 v6, 0x0

    .line 198
    const/4 v7, 0x0

    .line 199
    sget v0, Lcom/huawei/ui/main/R$id;->track_share_detail_title_usrname:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 200
    if-eqz v5, :cond_0

    .line 201
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v6

    .line 202
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v7

    .line 204
    :cond_0
    if-eqz v6, :cond_1

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 205
    :cond_1
    new-instance v9, Lcom/huawei/up/api/UpApi;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 206
    invoke-virtual {v9}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v10

    .line 207
    move-object v6, v10

    .line 208
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 211
    :cond_2
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    :goto_0
    goto :goto_1

    .line 214
    :cond_3
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->track_share_short_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    .line 218
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 219
    invoke-static {p0, v7}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 220
    if-eqz v10, :cond_4

    .line 221
    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 223
    :cond_4
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()bmp != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :goto_2
    goto :goto_3

    .line 226
    :cond_5
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :goto_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 230
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 231
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 233
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$id;->track_short_qrcode:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 235
    :cond_7
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g()V

    return-void
.end method

.method private c()I
    .locals 4

    .line 159
    const/16 v2, 0x102

    .line 160
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 161
    if-eqz v3, :cond_0

    .line 162
    const-string v0, "type_int"

    const/16 v1, 0x102

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 164
    :cond_0
    const/16 v0, 0x102

    if-eq v2, v0, :cond_1

    const/16 v0, 0x101

    if-eq v2, v0, :cond_1

    const/16 v0, 0x103

    if-eq v2, v0, :cond_1

    const/16 v0, 0x2711

    if-eq v2, v0, :cond_1

    .line 166
    const/16 v2, 0x102

    .line 168
    :cond_1
    return v2
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/SportDataActivity;)I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/SportDataActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->C:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->k(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 172
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestWeekData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/ffk;->e(J)J

    move-result-wide v1

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/ffk;->d(J)J

    move-result-wide v3

    .line 173
    const/4 v5, 0x4

    invoke-virtual/range {v0 .. v5}, Lo/ffi;->a(JJI)V

    .line 178
    return-void
.end method

.method private d(Lo/eyc;)V
    .locals 3

    .line 136
    new-instance v0, Lcom/huawei/ui/main/stories/history/SportDataActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$5;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->w:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lo/eyc;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 145
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 147
    new-instance v0, Lcom/huawei/ui/main/stories/history/SportDataActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$4;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    invoke-virtual {p1, v0, v2}, Lo/eyc;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 156
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/SportDataActivity;Z)Z
    .locals 0

    .line 73
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->z:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/SportDataActivity;)I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->l:I

    return p1
.end method

.method private e()V
    .locals 4

    .line 238
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_run:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_walk:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_cycle:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_workout:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->n:[Ljava/lang/String;

    goto :goto_0

    .line 241
    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_run:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_walk:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_cycle:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->n:[Ljava/lang/String;

    .line 243
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->n:[Ljava/lang/String;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    mul-int/lit8 v1, v1, 0x2

    new-instance v2, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    const/4 v3, 0x1

    invoke-static {p0, v0, v1, v3, v2}, Lo/ffg;->d(Landroid/content/Context;[Ljava/lang/String;IZLandroid/widget/RadioGroup$OnCheckedChangeListener;)Landroid/widget/PopupWindow;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$10;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 304
    return-void
.end method

.method private f()V
    .locals 7

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->z:Z

    if-eqz v0, :cond_1

    .line 387
    :cond_0
    return-void

    .line 389
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d:Lo/eyk;

    invoke-virtual {v0}, Lo/eyk;->e()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 390
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 391
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareBitmap is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->k:Landroid/widget/ImageView;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->D:Landroid/content/res/Resources;

    invoke-direct {v1, v2, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 394
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->k()V

    .line 415
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 416
    sget-object v0, Lo/dae;->hZ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 417
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    const-string v0, "tabType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->x:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 421
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->f()V

    return-void
.end method

.method private g(I)I
    .locals 2

    .line 536
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 538
    :pswitch_0
    const/16 v1, 0x101

    .line 539
    goto :goto_1

    .line 541
    :pswitch_1
    const/16 v1, 0x103

    .line 542
    goto :goto_1

    .line 545
    :goto_0
    :pswitch_2
    const/16 v1, 0x102

    .line 548
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/view/View;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->p:Landroid/view/View;

    return-object v0
.end method

.method private g()V
    .locals 8

    .line 567
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 568
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->u:J

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->q:[[J

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    aget-object v0, v0, v1

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->l:I

    aget-wide v2, v0, v1

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->u:J

    sub-long v4, v6, v4

    add-long/2addr v2, v4

    aput-wide v2, v0, v1

    .line 571
    :cond_0
    iput-wide v6, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->u:J

    .line 572
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Lo/ffi;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 307
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTitleBar,mType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_left_my_health_data:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g:Landroid/widget/TextView;

    .line 309
    sget v0, Lcom/huawei/ui/main/R$id;->btn_spinner_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->p:Landroid/view/View;

    .line 310
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_spinner:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->f:Landroid/view/View;

    .line 311
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    .line 312
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    goto :goto_0

    .line 313
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    const/16 v1, 0x101

    if-ne v0, v1, :cond_1

    .line 314
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    goto :goto_0

    .line 315
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    const/16 v1, 0x2711

    if-ne v0, v1, :cond_2

    .line 316
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    .line 318
    :cond_2
    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 320
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_walking_statistics:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    goto :goto_2

    .line 323
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_cycling_statistics:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    goto :goto_2

    .line 326
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_fitness_statistics:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    goto :goto_2

    .line 330
    :goto_1
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_running_statistics:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    :goto_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e()V

    .line 334
    new-instance v4, Lcom/huawei/ui/main/stories/history/SportDataActivity$8;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$8;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->f:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 341
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_left_iconbtn1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i:Landroid/view/View;

    .line 342
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_right_iconbtn1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->h:Landroid/view/View;

    .line 343
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_back_rtl:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 346
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$9;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->h:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$7;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 358
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/history/SportDataActivity;)I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->y:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->y:I

    return p1
.end method

.method private i(I)Lo/ehy;
    .locals 1

    .line 665
    const/16 v0, 0x103

    if-ne p1, v0, :cond_0

    .line 666
    sget-object v0, Lo/ehy;->i:Lo/ehy;

    return-object v0

    .line 667
    :cond_0
    const/16 v0, 0x101

    if-ne p1, v0, :cond_1

    .line 668
    sget-object v0, Lo/ehy;->f:Lo/ehy;

    return-object v0

    .line 669
    :cond_1
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_2

    .line 670
    sget-object v0, Lo/ehy;->p:Lo/ehy;

    return-object v0

    .line 672
    :cond_2
    sget-object v0, Lo/ehy;->k:Lo/ehy;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 499
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPopSportType == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    return-void

    .line 502
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    .line 506
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int v4, v0, v1

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->m:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->p:Landroid/view/View;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->p:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v4, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 511
    :goto_0
    return-void
.end method

.method private k()V
    .locals 7

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->v:Landroid/view/View;

    invoke-static {v0}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 426
    if-nez v4, :cond_0

    .line 427
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "screenCut is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {p0, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 429
    return-void

    .line 433
    :cond_0
    :try_start_0
    invoke-static {v4}, Lo/ffl;->b(Landroid/graphics/Bitmap;)Lo/dav;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c:Lo/dav;

    .line 434
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 435
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0, p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 437
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 439
    :goto_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 440
    sget-object v0, Lo/dae;->hY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 441
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    const-string v0, "tabType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v6, v5, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 448
    goto :goto_1

    .line 445
    :catch_0
    move-exception v5

    .line 446
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {p0, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 447
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareTrackData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    :goto_1
    return-void
.end method

.method private k(I)V
    .locals 5

    .line 585
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initClassifiedViewList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 588
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(I)Lo/ezh;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 590
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e(I)Lo/ezh;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 592
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(I)Lo/ezh;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(I)Lo/ezh;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d:Lo/eyk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b:Lo/eyc;

    const/4 v2, 0x0

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/eyk$e;

    invoke-virtual {v0, v4, v1, v2}, Lo/eyk;->b(Ljava/util/List;Lo/ejf;Lo/eyk$e;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    invoke-virtual {v0, p1}, Lo/ffi;->b(I)V

    .line 600
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o()V

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->e()V

    .line 603
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 2

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 712
    return-void
.end method


# virtual methods
.method protected a(I)Lo/ezh;
    .locals 4

    .line 635
    new-instance v2, Lcom/huawei/ui/main/stories/history/SportDataActivity$1;

    invoke-direct {v2, p0, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$1;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;Landroid/app/Activity;)V

    .line 642
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(I)Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->e:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 643
    invoke-virtual {v2, v3}, Lo/ezs;->setStepDatatype(Lo/eic;)V

    .line 646
    return-object v2
.end method

.method public b(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 5

    .line 452
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWritePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 455
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 456
    return-void

    .line 458
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 459
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 460
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWritePermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 462
    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 463
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 464
    :goto_0
    if-nez v4, :cond_3

    .line 465
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 466
    return-void

    .line 469
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 470
    goto :goto_1

    .line 471
    :cond_4
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWritePermission choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 475
    :cond_5
    :goto_1
    return-void
.end method

.method protected c(I)Lo/ezh;
    .locals 4

    .line 650
    new-instance v2, Lcom/huawei/ui/main/stories/history/SportDataActivity$3;

    invoke-direct {v2, p0, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$3;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;Landroid/app/Activity;)V

    .line 657
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(I)Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->k:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 658
    invoke-virtual {v2, v3}, Lo/eyj;->setStepDatatype(Lo/eic;)V

    .line 660
    return-object v2
.end method

.method protected d(I)Lo/ezh;
    .locals 4

    .line 607
    new-instance v2, Lcom/huawei/ui/main/stories/history/SportDataActivity$12;

    invoke-direct {v2, p0, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$12;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;Landroid/app/Activity;)V

    .line 614
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(I)Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->a:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 615
    invoke-virtual {v2, v3}, Lo/ezq;->setStepDatatype(Lo/eic;)V

    .line 617
    return-object v2
.end method

.method protected e(I)Lo/ezh;
    .locals 4

    .line 621
    new-instance v2, Lcom/huawei/ui/main/stories/history/SportDataActivity$15;

    invoke-direct {v2, p0, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$15;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;Landroid/app/Activity;)V

    .line 628
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(I)Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->c:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    .line 629
    invoke-virtual {v2, v3}, Lo/eza;->setStepDatatype(Lo/eic;)V

    .line 631
    return-object v2
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 109
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 111
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_sport_data:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->setContentView(I)V

    .line 114
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->w:Ljava/lang/String;

    goto :goto_0

    .line 117
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->w:Ljava/lang/String;

    .line 120
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    .line 121
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->C:Ljava/lang/String;

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->s:I

    invoke-virtual {v0, v1}, Lo/ffi;->b(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->r:Lo/ffi;

    invoke-virtual {v0, p0}, Lo/ffi;->e(Landroid/app/Activity;)V

    .line 124
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d()V

    .line 126
    new-instance v0, Lo/eyc;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b:Lo/eyc;

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b:Lo/eyc;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lo/eyc;)V

    .line 128
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->t:Z

    .line 129
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a()V

    .line 130
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b()V

    .line 131
    iput-object p0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->x:Landroid/content/Context;

    .line 133
    return-void
.end method

.method public onDestroy()V
    .locals 11

    .line 516
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 518
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v5

    .line 519
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v6, v0, :cond_1

    .line 520
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g(I)I

    move-result v7

    .line 521
    const/4 v8, 0x0

    :goto_1
    const/4 v0, 0x4

    if-ge v8, v0, :cond_0

    .line 522
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 523
    sget-object v0, Lo/dae;->ia:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v10

    .line 524
    const-string v0, "tabType"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    const-string v0, "sportType"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    const-string v0, "duration"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->q:[[J

    aget-object v1, v1, v6

    aget-wide v1, v1, v8

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    const/4 v0, 0x0

    invoke-virtual {v5, p0, v10, v9, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 521
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 519
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 532
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 562
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 563
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g()V

    .line 564
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 479
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 481
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 482
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 485
    :cond_0
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 556
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 557
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity;->u:J

    .line 558
    return-void
.end method
