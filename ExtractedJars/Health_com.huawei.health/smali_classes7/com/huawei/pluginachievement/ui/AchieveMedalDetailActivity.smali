.class public Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$e;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Landroid/widget/LinearLayout;

.field private F:Landroid/os/Handler;

.field private G:I

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/LinearLayout;

.field private J:Landroid/widget/TextView;

.field private K:Landroid/widget/TextView;

.field private L:Landroid/widget/TextView;

.field private M:Landroid/widget/LinearLayout;

.field private N:Landroid/widget/ImageView;

.field private P:Lcom/huawei/hihealth/HiUserInfo;

.field private R:Landroid/os/Handler;

.field private final S:[Ljava/lang/String;

.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/content/Context;

.field private d:Lo/efz;

.field private e:Landroid/widget/FrameLayout;

.field private f:Landroid/widget/TextView;

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Lo/egd;

.field private l:J

.field private m:Landroid/widget/TextView;

.field private n:F

.field private o:F

.field private p:Landroid/widget/RelativeLayout;

.field private q:I

.field private r:F

.field private s:I

.field private t:I

.field private u:I

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Landroid/widget/ImageView;

.field private y:Landroid/widget/ImageView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 100
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 117
    const-wide/16 v0, 0x320

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->l:J

    .line 118
    const/16 v0, 0x10

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->q:I

    .line 119
    const/16 v0, 0x41

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->u:I

    .line 120
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r:F

    .line 121
    const/16 v0, 0xfa

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->t:I

    .line 122
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->s:I

    .line 128
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->v:Ljava/lang/String;

    .line 129
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->w:Ljava/lang/String;

    .line 130
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    .line 136
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    .line 137
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->A:Ljava/lang/String;

    .line 138
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->G:I

    .line 155
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->F:Landroid/os/Handler;

    .line 612
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$e;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->R:Landroid/os/Handler;

    .line 613
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->S:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/widget/FrameLayout;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 521
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 522
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->S:[Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 524
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h()V

    .line 526
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->p:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Lo/efz;)Lo/efz;
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    return-object p1
.end method

.method private b()V
    .locals 18

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    sget v0, Lcom/huawei/pluginachievement/R$id;->title_back_ImageView:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->y:Landroid/widget/ImageView;

    .line 181
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->y:Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_back_white_reverse:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 183
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->detail_view:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->p:Landroid/widget/RelativeLayout;

    .line 184
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_get_time:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->z:Landroid/widget/TextView;

    .line 185
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_detail_share:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->x:Landroid/widget/ImageView;

    .line 187
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v4

    .line 189
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h:I

    .line 192
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 193
    new-instance v6, Landroid/util/DisplayMetrics;

    invoke-direct {v6}, Landroid/util/DisplayMetrics;-><init>()V

    .line 194
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 195
    iget v0, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->g:I

    .line 196
    iget v0, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->i:I

    .line 197
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "width="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sWindowWidth="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sWindowHeight="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    .line 201
    const-string v8, ""

    .line 202
    const-string v9, ""

    .line 204
    const/4 v10, 0x0

    .line 205
    const-string v11, ""

    .line 206
    const-string v12, ""

    .line 207
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 208
    const-string v0, "medal_res_id"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    .line 209
    const-string v0, "medal_des_id"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    .line 210
    const-string v0, "medal_content_id"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    .line 211
    const-string v0, "medal_obtain_id"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 212
    const-string v0, "medal_gain_time"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 213
    const-string v0, "medal_type_level"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 214
    const-string v0, "medal_type"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->A:Ljava/lang/String;

    .line 216
    const-string v0, "promotion_name"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 217
    const-string v0, "promotion_url"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 219
    const-string v0, "click_x"

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43160000    # 150.0f

    sub-float/2addr v1, v2

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->q:I

    int-to-float v2, v2

    invoke-static {v1, v2}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->o:F

    .line 220
    const-string v0, "click_y"

    const/high16 v1, 0x442f0000    # 700.0f

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->u:I

    int-to-float v2, v2

    invoke-static {v1, v2}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->n:F

    .line 223
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v13

    .line 224
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    .line 225
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "userInfomation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    invoke-virtual {v13}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->w:Ljava/lang/String;

    .line 230
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r:F

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r:F

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->t:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->t:I

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->s:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->s:I

    .line 233
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yPosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    sget v0, Lcom/huawei/pluginachievement/R$id;->title_layout:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b:Landroid/widget/LinearLayout;

    .line 236
    sget v0, Lcom/huawei/pluginachievement/R$id;->detail_layout:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e:Landroid/widget/FrameLayout;

    .line 238
    sget v0, Lcom/huawei/pluginachievement/R$id;->promotion_button:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k:Lo/egd;

    .line 239
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_desc:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->f:Landroid/widget/TextView;

    .line 240
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_content:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->m:Landroid/widget/TextView;

    .line 242
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->C:Ljava/lang/String;

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 245
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    const-string v1, "/n"

    const-string v2, "\n"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    .line 246
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->f:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->m:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->C:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 249
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->z:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$3;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 259
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k:Lo/egd;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 261
    :cond_5
    move-object v14, v12

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 263
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k:Lo/egd;

    invoke-virtual {v0, v11}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 264
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k:Lo/egd;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v14}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    :goto_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_pic_imageview:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    .line 292
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 293
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v15

    .line 294
    const-string v0, "false"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 295
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "obtain status is false"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const/4 v0, 0x0

    if-ne v0, v14, :cond_6

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-static {v9, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c(Ljava/lang/String;Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 299
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v14}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 301
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->x:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 302
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->z:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 303
    return-void

    .line 305
    :cond_7
    const/4 v0, 0x1

    invoke-static {v9, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c(Ljava/lang/String;Z)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->G:I

    .line 306
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Lo/dud;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 307
    const-string v0, ""

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dxj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 308
    :cond_8
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "STATIC IMG"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dwr;->e(Ljava/lang/String;)V

    .line 311
    const/4 v0, 0x0

    if-ne v0, v15, :cond_9

    .line 312
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->G:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 314
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v15}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 317
    :cond_a
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "3D medal"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b(Ljava/lang/String;)Z

    move-result v17

    .line 319
    if-nez v17, :cond_c

    .line 320
    const/4 v0, 0x0

    if-ne v0, v15, :cond_b

    .line 321
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->G:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 323
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v15}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 326
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 327
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 328
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$5;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->l:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 338
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d()V

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->x:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 347
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method private b(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 854
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v4

    .line 855
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 856
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it\'s so terrible, as missing the headImage url, we can do nothing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    return-void

    .line 859
    :cond_0
    return-void
.end method

.method private b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Landroid/graphics/Bitmap;)V
    .locals 11

    .line 447
    new-instance v0, Lo/efj;

    invoke-direct {v0}, Lo/efj;-><init>()V

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    new-instance v5, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    move-object v6, p0

    move-object v7, p4

    move-object v8, p1

    move-object v9, p2

    move-object v10, p3

    invoke-direct/range {v5 .. v10}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Landroid/graphics/Bitmap;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    invoke-virtual/range {v0 .. v5}, Lo/efj;->a(Landroid/content/Context;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Lo/efj$a;)V

    .line 494
    return-void
.end method

.method public static c(Ljava/lang/String;Z)I
    .locals 5

    .line 165
    invoke-static {}, Lo/dzl;->b()Lo/dzl;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dzl;->a(Z)Ljava/util/Map;

    move-result-object v3

    .line 166
    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dvx;

    .line 167
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 168
    if-eqz p1, :cond_0

    .line 169
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalInfo getEnableResId is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/dvx;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-virtual {v4}, Lo/dvx;->d()I

    move-result v0

    return v0

    .line 172
    :cond_0
    invoke-virtual {v4}, Lo/dvx;->b()I

    move-result v0

    return v0

    .line 175
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/content/Context;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 862
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 863
    :cond_0
    const-string v0, ""

    return-object v0

    .line 865
    :cond_1
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 866
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/photos/headimage/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v4

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 867
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 868
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 869
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 871
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() no"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/photos/headimage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    .line 873
    if-eqz v7, :cond_4

    array-length v0, v7

    if-lez v0, :cond_4

    .line 874
    const/4 v8, 0x0

    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_3

    .line 875
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal files: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    aget-object v2, v7, v8

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 877
    :cond_3
    array-length v0, v7

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 878
    if-nez v5, :cond_4

    .line 879
    const-string v0, ""

    return-object v0

    .line 884
    :cond_4
    :goto_1
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal localpath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    return-object v5
.end method

.method private c(Lcom/huawei/up/model/UserInfomation;)V
    .locals 7

    .line 792
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 793
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userinfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 794
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v4

    .line 795
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 796
    :cond_0
    new-instance v5, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 797
    invoke-virtual {v5}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v6

    .line 798
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 799
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 801
    :cond_1
    goto :goto_0

    .line 802
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 806
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v5

    .line 807
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 808
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 809
    if-eqz v6, :cond_3

    .line 811
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->N:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 812
    return-void

    .line 815
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b(Lcom/huawei/up/model/UserInfomation;)V

    .line 818
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess() btimap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 819
    goto :goto_1

    .line 821
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->N:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 825
    :goto_1
    goto :goto_2

    .line 826
    :cond_5
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! userinfo is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    :goto_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->P:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a()V

    return-void
.end method

.method private d(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 3

    .line 498
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 499
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 503
    :cond_0
    goto :goto_0

    .line 501
    :catch_0
    move-exception v2

    .line 502
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " InpuStream tst close exception!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 506
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 510
    :cond_1
    goto :goto_1

    .line 508
    :catch_1
    move-exception v2

    .line 509
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " InputStream nxy close exception!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 513
    :try_start_2
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 517
    :cond_2
    goto :goto_2

    .line 515
    :catch_2
    move-exception v2

    .line 516
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " InputStream xyz close exception!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    :goto_2
    return-void
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 351
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 352
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 355
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setGainTime medal_time = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 357
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 358
    const/16 v0, 0x14

    invoke-static {v5, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v6

    .line 359
    iput-object v6, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->v:Ljava/lang/String;

    .line 360
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_people_get_medal_date:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 361
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 362
    return-object v8

    .line 363
    :catch_0
    move-exception v3

    .line 364
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "setGainTime NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->t:I

    return v0
.end method

.method private f()V
    .locals 2

    .line 719
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$6;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 756
    return-void
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->i:I

    return v0
.end method

.method private g()V
    .locals 7

    .line 831
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->P:Lcom/huawei/hihealth/HiUserInfo;

    if-nez v0, :cond_0

    .line 832
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal mHiUserInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 833
    return-void

    .line 835
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->L:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->P:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 837
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->P:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v4

    .line 838
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountfilepath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/photos/headimage"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 840
    invoke-direct {p0, v4}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 841
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 842
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 843
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    if-eqz v6, :cond_1

    .line 845
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->N:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 847
    :cond_1
    goto :goto_0

    .line 848
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->N:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 849
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal() headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->s:I

    return v0
.end method

.method private h()V
    .locals 17

    .line 530
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 531
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 532
    return-void

    .line 534
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v11

    .line 535
    invoke-virtual {v11}, Lo/dth;->d()Lo/dti;

    move-result-object v12

    .line 536
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 537
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 538
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 539
    const-string v0, "name"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    const-string v0, "className"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->A:Ljava/lang/String;

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->E:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lo/dxh;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 543
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    .line 544
    move-object v0, v12

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    move-object v5, v14

    sget-object v2, Lo/dae;->W:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    move-object v10, v13

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 546
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "screenCut is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    :goto_0
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 549
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v15

    .line 550
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 551
    const-string v0, "type"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    sget-object v1, Lo/dae;->W:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v1, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 554
    :cond_3
    goto :goto_1

    .line 555
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "adapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    :goto_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->w:Ljava/lang/String;

    return-object v0
.end method

.method private k()V
    .locals 6

    .line 688
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 689
    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 690
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isthirdlogin == 1 and return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->f()V

    .line 692
    return-void

    .line 694
    :cond_0
    new-instance v5, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$10;

    invoke-direct {v5, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$10;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    .line 714
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dnm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 715
    return-void
.end method

.method static synthetic l(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)F
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->o:F

    return v0
.end method

.method static synthetic m(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->g:I

    return v0
.end method

.method static synthetic n(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->F:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)F
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->n:F

    return v0
.end method

.method static synthetic p(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)F
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r:F

    return v0
.end method

.method static synthetic q(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->g()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->R:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->P:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 402
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 403
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "getBitmapFromPath: file not exists"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    const/4 v0, 0x0

    return-object v0

    .line 406
    :cond_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 408
    if-nez v2, :cond_1

    .line 409
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " bitmap is null"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    :cond_1
    return-object v2
.end method

.method public b(Ljava/lang/String;)Z
    .locals 18

    .line 415
    const/4 v3, 0x1

    .line 416
    new-instance v4, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 417
    new-instance v5, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    new-instance v6, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    new-instance v7, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    const-string v0, "medal.tST"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 421
    const-string v0, "medal.nXYZ"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 422
    const-string v0, "medal.vXYZ"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 423
    const-string v0, "texture.jpg"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 424
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 425
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " tstPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " nxyzPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " vxyzPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "picPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    const/4 v13, 0x0

    .line 427
    const/4 v14, 0x0

    .line 428
    const/4 v15, 0x0

    .line 430
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v8}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v13, v0

    .line 431
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v9}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 432
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v10}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 434
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15, v12}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 441
    goto :goto_0

    .line 436
    :catch_0
    move-exception v16

    .line 437
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " close InputStream is exception"

    :try_start_1
    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 438
    const/4 v3, 0x0

    .line 440
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 441
    goto :goto_0

    .line 440
    :catchall_0
    move-exception v17

    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 441
    throw v17

    .line 442
    :goto_0
    return v3
.end method

.method public c()V
    .locals 1

    .line 677
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 678
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k()V

    .line 680
    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 3

    .line 562
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "checkGalleryPermission"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 564
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h()V

    .line 565
    return-void

    .line 567
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 568
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 569
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "checkGalleryPermission isnotHasPermissions"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 571
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 572
    :goto_0
    if-nez v2, :cond_3

    .line 573
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 574
    return-void

    .line 577
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 578
    goto :goto_1

    .line 579
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "checkGalleryPermission choosePic"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h()V

    .line 583
    :cond_5
    :goto_1
    return-void
.end method

.method public d()V
    .locals 2

    .line 618
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_theme_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->I:Landroid/widget/LinearLayout;

    .line 619
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_information:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->M:Landroid/widget/LinearLayout;

    .line 620
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 621
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 623
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->before_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->E:Landroid/widget/LinearLayout;

    .line 624
    sget v0, Lcom/huawei/pluginachievement/R$id;->head_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->N:Landroid/widget/ImageView;

    .line 625
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_share_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->K:Landroid/widget/TextView;

    .line 626
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_get_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->H:Landroid/widget/TextView;

    .line 627
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_share_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->J:Landroid/widget/TextView;

    .line 629
    sget v0, Lcom/huawei/pluginachievement/R$id;->name_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->L:Landroid/widget/TextView;

    .line 631
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    .line 632
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e()V

    .line 633
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c()V

    .line 634
    return-void
.end method

.method public e()V
    .locals 7

    .line 643
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Lo/dzs;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 644
    const/4 v5, 0x0

    .line 646
    :try_start_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 647
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 651
    :cond_0
    goto :goto_0

    .line 649
    :catch_0
    move-exception v6

    .line 650
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const/16 v0, 0x13

    if-gt v5, v0, :cond_2

    .line 653
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->I:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->share_background:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_1

    .line 655
    :cond_2
    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v0, 0x0

    invoke-direct {v6, v0, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 656
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->I:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 658
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 659
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->K:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 660
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->J:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 661
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->C:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 662
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 664
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->H:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 668
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 669
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 670
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->D:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_3

    .line 672
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a:Landroid/widget/ImageView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->G:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 674
    :goto_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 143
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 145
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 148
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_medal_single_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->setContentView(I)V

    .line 149
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    .line 150
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b()V

    .line 151
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/elx;->d(Landroid/content/Context;)V

    .line 152
    sget v0, Lcom/huawei/pluginachievement/R$anim;->fade_in:I

    sget v1, Lcom/huawei/pluginachievement/R$anim;->fade_out:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->overridePendingTransition(II)V

    .line 153
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 374
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " enter onDestroy"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    invoke-virtual {v0}, Lo/efz;->b()V

    .line 378
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 379
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 393
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " enter onPause"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 395
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    if-eqz v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    invoke-virtual {v0}, Lo/efz;->onPause()V

    .line 398
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 587
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestCode=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 589
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 590
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "choosePicWrite Permission success"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h()V

    goto :goto_0

    .line 593
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "choosePicWrite Permission Failed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 384
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, " enter onResume"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 386
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d:Lo/efz;

    invoke-virtual {v0}, Lo/efz;->onResume()V

    .line 389
    :cond_0
    return-void
.end method
