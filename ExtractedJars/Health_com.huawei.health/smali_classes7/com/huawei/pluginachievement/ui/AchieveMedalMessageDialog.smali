.class public Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static N:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private A:J

.field private B:F

.field private C:F

.field private D:Landroid/widget/TextView;

.field private E:I

.field private F:F

.field private G:I

.field private H:I

.field private I:I

.field private J:Landroid/graphics/Bitmap;

.field private K:Lo/dvk;

.field private L:Ljava/lang/Runnable;

.field private M:Landroid/os/Handler;

.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/FrameLayout;

.field private e:Lo/efz;

.field private f:I

.field private g:Lo/egd;

.field private h:I

.field private i:I

.field private j:Landroid/widget/RelativeLayout;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Landroid/widget/TextView;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:I

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Landroid/widget/TextView;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 72
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k:I

    .line 89
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->p:Ljava/lang/String;

    .line 90
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->r:Ljava/lang/String;

    .line 92
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->s:Ljava/lang/String;

    .line 95
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->t:Ljava/lang/String;

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->y:Ljava/lang/String;

    .line 98
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->w:Ljava/lang/String;

    .line 99
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->z:Ljava/lang/String;

    .line 100
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->v:Ljava/lang/String;

    .line 106
    const-wide/16 v0, 0x320

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->A:J

    .line 107
    const/16 v0, 0x10

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->E:I

    .line 108
    const/16 v0, 0x32

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->G:I

    .line 109
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->F:F

    .line 110
    const/16 v0, 0xfa

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->I:I

    .line 111
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->H:I

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    .line 134
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$2;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->M:Landroid/os/Handler;

    .line 371
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->L:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->y:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->p:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->j:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->y:Ljava/lang/String;

    return-object p1
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 451
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 452
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 455
    :cond_1
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 456
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 457
    const/16 v0, 0x14

    invoke-static {v4, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v5

    .line 458
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_people_get_medal_date:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 459
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 460
    return-object v7

    .line 461
    :catch_0
    move-exception v2

    .line 462
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, "setGainTime NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Lo/efz;)Lo/efz;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    return-object p1
.end method

.method private b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 3

    .line 552
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 553
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 557
    :cond_0
    goto :goto_0

    .line 555
    :catch_0
    move-exception v2

    .line 556
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " tst InpuStream close exception!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 560
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 564
    :cond_1
    goto :goto_1

    .line 562
    :catch_1
    move-exception v2

    .line 563
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " nxy InputStream close exception!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 567
    :try_start_2
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 571
    :cond_2
    goto :goto_2

    .line 569
    :catch_2
    move-exception v2

    .line 570
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " xyz InputStream close exception!"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    :goto_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->r:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 15

    .line 152
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/dvk;

    check-cast v0, Lo/dvk;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->K:Lo/dvk;

    .line 153
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->K:Lo/dvk;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 154
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, "mMessage is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->finish()V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    return-void

    .line 160
    :cond_0
    goto :goto_0

    .line 158
    :catch_0
    move-exception v4

    .line 159
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveMessageDialog e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    :goto_0
    invoke-static {}, Lo/dzl;->b()Lo/dzl;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dzl;->a(Z)Ljava/util/Map;

    move-result-object v4

    .line 163
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_dialog_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->j:Landroid/widget/RelativeLayout;

    .line 165
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v5

    .line 167
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f:I

    .line 170
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 171
    new-instance v7, Landroid/util/DisplayMetrics;

    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    .line 172
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 173
    iget v0, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->i:I

    .line 174
    iget v0, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->h:I

    .line 175
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "width="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sWindowWidth="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "sWindowHeight="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_get_this_medals:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->n:Ljava/lang/String;

    .line 178
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->K:Lo/dvk;

    invoke-virtual {v0}, Lo/dvk;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->K:Lo/dvk;

    invoke-virtual {v1}, Lo/dvk;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dty;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 179
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->K:Lo/dvk;

    invoke-virtual {v0}, Lo/dvk;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "0"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 181
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    .line 183
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initView medalGainTime = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    invoke-static {v0}, Lo/dzs;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->v:Ljava/lang/String;

    .line 185
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dvx;

    .line 186
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    .line 187
    invoke-virtual {v9}, Lo/dvx;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    .line 188
    invoke-virtual {v9}, Lo/dvx;->d()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k:I

    .line 190
    invoke-virtual {v9}, Lo/dvx;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->y:Ljava/lang/String;

    .line 191
    invoke-virtual {v9}, Lo/dvx;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->w:Ljava/lang/String;

    .line 194
    :cond_3
    iget v10, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k:I

    .line 195
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->E:I

    int-to-float v2, v2

    invoke-static {v1, v2}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->C:F

    .line 196
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->G:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x442f0000    # 700.0f

    add-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->B:F

    .line 198
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->F:F

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->F:F

    .line 199
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->I:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->I:I

    .line 200
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->H:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->H:I

    .line 201
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yPosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->F:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_message_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b:Landroid/widget/LinearLayout;

    .line 203
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_message_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d:Landroid/widget/FrameLayout;

    .line 205
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->q:Landroid/widget/TextView;

    .line 206
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->q:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 208
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_dialog_share_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->g:Lo/egd;

    .line 209
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_dialog_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->x:Landroid/widget/TextView;

    .line 210
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_dialog_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->D:Landroid/widget/TextView;

    .line 211
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 213
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    const-string v1, "/n"

    const-string v2, "\n"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    .line 214
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 217
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->x:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_dialog_pic_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    .line 227
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->K:Lo/dvk;

    invoke-virtual {v0}, Lo/dvk;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    .line 228
    iget-object v11, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    .line 230
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v12

    .line 231
    const/4 v0, 0x0

    if-eq v0, v12, :cond_5

    .line 232
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "userInfomation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    invoke-virtual {v12}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->z:Ljava/lang/String;

    .line 235
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 236
    const/4 v0, 0x0

    if-ne v0, v9, :cond_6

    .line 237
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->finish()V

    .line 238
    return-void

    .line 241
    :cond_6
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    invoke-static {v0}, Lo/dud;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 243
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_7

    .line 244
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->N:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_7

    .line 245
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->N:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->L:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 248
    :cond_7
    const-string v0, ""

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dxj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 249
    :cond_8
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, "STATIC IMG"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_a

    .line 251
    const/4 v0, 0x0

    if-ne v0, v9, :cond_9

    .line 252
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->finish()V

    .line 253
    return-void

    .line 255
    :cond_9
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 257
    :cond_a
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 260
    :cond_b
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, "3D medal"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-virtual {p0, v13}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c(Ljava/lang/String;)Z

    move-result v14

    .line 262
    if-nez v14, :cond_e

    .line 263
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_d

    .line 264
    const/4 v0, 0x0

    if-ne v0, v9, :cond_c

    .line 265
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->finish()V

    .line 266
    return-void

    .line 268
    :cond_c
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 270
    :cond_d
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 273
    :cond_e
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->j:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 274
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->j:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 275
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$1;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->A:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 287
    :goto_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->g:Lo/egd;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;

    invoke-direct {v1, p0, v10, v11}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->q:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 340
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;I)I
    .locals 0

    .line 72
    iput p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->w:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 7

    .line 352
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 353
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->q:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 354
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    const-string v1, "/n"

    const-string v2, "\n"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    .line 355
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 358
    sget-object v0, Lo/dae;->ab:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 359
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 360
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->y:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    const-string v0, "type"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->s:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    const-string v0, "label"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 366
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v6

    .line 367
    const/4 v0, 0x0

    invoke-virtual {v6, v5, v4, v3, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 369
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 343
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 349
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d()V

    return-void
.end method

.method private e(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Landroid/graphics/Bitmap;)V
    .locals 11

    .line 500
    new-instance v0, Lo/efj;

    invoke-direct {v0}, Lo/efj;-><init>()V

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    new-instance v5, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    move-object v6, p0

    move-object v7, p4

    move-object v8, p1

    move-object v9, p2

    move-object v10, p3

    invoke-direct/range {v5 .. v10}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Landroid/graphics/Bitmap;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    invoke-virtual/range {v0 .. v5}, Lo/efj;->a(Landroid/content/Context;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Lo/efj$a;)V

    .line 548
    return-void
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/content/Context;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->s:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->t:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->w:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->C:F

    return v0
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->t:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic l(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->p:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->B:F

    return v0
.end method

.method static synthetic n(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->s:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/widget/FrameLayout;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/os/Handler;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->M:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->z:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->h:I

    return v0
.end method

.method static synthetic w(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->F:F

    return v0
.end method

.method static synthetic x(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->H:I

    return v0
.end method

.method static synthetic y(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->i:I

    return v0
.end method

.method static synthetic z(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->I:I

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 439
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 440
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, "getBitmapFromPath: file not exists"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    const/4 v0, 0x0

    return-object v0

    .line 443
    :cond_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 445
    if-nez v2, :cond_1

    .line 446
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " bitmap is null"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    :cond_1
    return-object v2
.end method

.method public c(Ljava/lang/String;)Z
    .locals 18

    .line 468
    const/4 v3, 0x1

    .line 469
    new-instance v4, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 470
    new-instance v5, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    new-instance v6, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 472
    new-instance v7, Ljava/lang/StringBuilder;

    move-object/from16 v0, p1

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 473
    const-string v0, "texture.jpg"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 474
    const-string v0, "medal.tST"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 475
    const-string v0, "medal.nXYZ"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 476
    const-string v0, "medal.vXYZ"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 477
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 478
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " tstPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " nxyzPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " vxyzPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "picPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    const/4 v13, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    const/4 v15, 0x0

    .line 484
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v9}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v13, v0

    .line 485
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v10}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 486
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v11}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 488
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15, v12}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 495
    goto :goto_0

    .line 490
    :catch_0
    move-exception v16

    .line 491
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " close InputStream is exception"

    :try_start_1
    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 492
    const/4 v3, 0x0

    .line 494
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 495
    goto :goto_0

    .line 494
    :catchall_0
    move-exception v17

    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14, v15}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 495
    throw v17

    .line 496
    :goto_0
    return v3
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 121
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 124
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 126
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_medal_message_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->setContentView(I)V

    .line 127
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    .line 128
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->N:Ljava/util/concurrent/ExecutorService;

    .line 129
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c()V

    .line 130
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/elx;->d(Landroid/content/Context;)V

    .line 131
    sget v0, Lcom/huawei/pluginachievement/R$anim;->fade_in:I

    sget v1, Lcom/huawei/pluginachievement/R$anim;->fade_out:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->overridePendingTransition(II)V

    .line 132
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 408
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " enter onDestroy"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    invoke-virtual {v0}, Lo/efz;->b()V

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 413
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->J:Landroid/graphics/Bitmap;

    .line 415
    :cond_1
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 416
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 430
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " enter onPause"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 432
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    invoke-virtual {v0}, Lo/efz;->onPause()V

    .line 435
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 421
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " enter onResume"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 423
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    if-eqz v0, :cond_0

    .line 424
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e:Lo/efz;

    invoke-virtual {v0}, Lo/efz;->onResume()V

    .line 426
    :cond_0
    return-void
.end method
