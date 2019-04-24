.class public Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/os/Handler;

.field private g:Lcom/huawei/hihealth/HiUserInfo;

.field private h:Lo/egd;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/LinearLayout;

.field private q:Landroid/support/v7/widget/RecyclerView;

.field private r:Landroid/widget/ScrollView;

.field private s:Ljava/lang/String;

.field private t:Lo/dxx;

.field private u:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dvv;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 88
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$a;-><init>(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->f:Landroid/os/Handler;

    .line 103
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->u:Ljava/lang/String;

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->x:Ljava/lang/String;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->y:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->g:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 508
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 509
    :cond_0
    const-string v0, ""

    return-object v0

    .line 511
    :cond_1
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 512
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

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

    .line 513
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 514
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 515
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 517
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal file.exists() no"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

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

    .line 519
    if-eqz v7, :cond_4

    array-length v0, v7

    if-lez v0, :cond_4

    .line 520
    const/4 v8, 0x0

    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_3

    .line 521
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

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

    .line 520
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 523
    :cond_3
    array-length v0, v7

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 524
    if-nez v5, :cond_4

    .line 525
    const-string v0, ""

    return-object v0

    .line 530
    :cond_4
    :goto_1
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getHeadImageFromLocal localpath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    return-object v5
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c()V

    return-void
.end method

.method private a(Lcom/huawei/up/model/UserInfomation;)V
    .locals 7

    .line 433
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 434
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

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

    .line 435
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v4

    .line 436
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 437
    :cond_0
    new-instance v5, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 438
    invoke-virtual {v5}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v6

    .line 439
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 440
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    :cond_1
    goto :goto_0

    .line 445
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v5

    .line 450
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 451
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 452
    if-eqz v6, :cond_3

    .line 454
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 455
    return-void

    .line 458
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d(Lcom/huawei/up/model/UserInfomation;)V

    .line 461
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess() btimap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    goto :goto_1

    .line 464
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 468
    :goto_1
    goto :goto_2

    .line 469
    :cond_5
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! userinfo is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    :goto_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)Landroid/content/Context;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 325
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 326
    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isthirdlogin == 1 and return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->e()V

    .line 329
    return-void

    .line 331
    :cond_0
    new-instance v5, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$3;

    invoke-direct {v5, p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dnm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 352
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method private c()V
    .locals 17

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 233
    return-void

    .line 235
    :cond_0
    invoke-static/range {p0 .. p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v11

    .line 236
    invoke-virtual {v11}, Lo/dth;->d()Lo/dti;

    move-result-object v12

    .line 237
    const/4 v0, 0x0

    if-eq v0, v12, :cond_6

    .line 238
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 239
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    const-string v0, "name"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->u:Ljava/lang/String;

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    const-string v0, "className"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->x:Ljava/lang/String;

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    :cond_1
    const/4 v14, 0x0

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->s:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "medal_all_share_flags"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 245
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->m:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->r:Landroid/widget/ScrollView;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->p:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2}, Lo/dxh;->b(Landroid/view/View;Landroid/widget/ScrollView;Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 246
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    .line 247
    invoke-static {v14}, Lo/dxh;->a(Landroid/graphics/Bitmap;)I

    move-result v15

    .line 248
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initview all medal share bitmap size ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    div-int/lit16 v0, v15, 0x400

    div-int/lit16 v0, v0, 0x400

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0, v14}, Lo/dxh;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v16

    .line 251
    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    sget-object v2, Lo/dae;->W:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    move-object v10, v13

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->e(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 252
    goto :goto_0

    .line 253
    :cond_2
    move-object v0, v12

    move-object/from16 v1, p0

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

    .line 256
    :cond_3
    :goto_0
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 257
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v15

    .line 258
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 259
    const-string v0, "type"

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    sget-object v1, Lo/dae;->W:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v1, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 261
    goto :goto_1

    .line 263
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->e:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lo/dxh;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 264
    const/4 v0, 0x0

    if-eq v0, v14, :cond_5

    .line 265
    move-object v0, v12

    move-object/from16 v1, p0

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

    .line 267
    :cond_5
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 268
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v15

    .line 269
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 270
    const-string v0, "type"

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    sget-object v1, Lo/dae;->W:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v1, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 275
    :cond_6
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)Landroid/os/Handler;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private d(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 500
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v4

    .line 501
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 502
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it\'s so terrible, as missing the headImage url, we can do nothing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    return-void

    .line 505
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->g:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 356
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 393
    return-void
.end method

.method private g()V
    .locals 7

    .line 474
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->g:Lcom/huawei/hihealth/HiUserInfo;

    if-nez v0, :cond_0

    .line 475
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal mHiUserInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    return-void

    .line 478
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->g:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->g:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v4

    .line 483
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountfilepath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

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

    .line 485
    invoke-direct {p0, v4}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 486
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 487
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 489
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal headImgPath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    if-eqz v6, :cond_1

    .line 491
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 493
    :cond_1
    goto :goto_0

    .line 494
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 495
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setUserNameFromLocal() headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 14

    .line 121
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 122
    const/4 v5, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    const/4 v7, 0x0

    .line 125
    const-string v8, ""

    .line 126
    const-string v9, ""

    .line 127
    const/4 v10, 0x0

    .line 129
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_theme_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->l:Landroid/widget/LinearLayout;

    .line 130
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_theme_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d:Landroid/widget/LinearLayout;

    .line 131
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_information:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->p:Landroid/widget/LinearLayout;

    .line 132
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 135
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 136
    const-string v0, "medal_all_share_flags"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->s:Ljava/lang/String;

    .line 137
    const-string v0, "medal_type"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 138
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->s:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "medal_all_share_flags"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 141
    const-string v0, "medal_all_share"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->y:Ljava/util/ArrayList;

    .line 142
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_ll_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->m:Landroid/widget/LinearLayout;

    .line 144
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_rv:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->q:Landroid/support/v7/widget/RecyclerView;

    .line 145
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_all_scrollview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->r:Landroid/widget/ScrollView;

    .line 146
    new-instance v11, Lo/dxz;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v11, v0, v1}, Lo/dxz;-><init>(Landroid/content/Context;I)V

    .line 147
    invoke-virtual {v11}, Lo/dxz;->a()I

    move-result v12

    .line 148
    new-instance v13, Landroid/support/v7/widget/GridLayoutManager;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {v13, p0, v12, v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 149
    new-instance v0, Lo/dxx;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->y:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/dxx;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->t:Lo/dxx;

    .line 150
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->q:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v13}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->q:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v11}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->q:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 153
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->q:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 154
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->q:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->t:Lo/dxx;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 157
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medal share width ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " height="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->l:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 161
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 163
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 164
    const-string v0, "medal_des_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 165
    const-string v0, "medal_content_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 166
    const-string v0, "medal_name"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 167
    const-string v0, "medal_type_level"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v10

    .line 168
    const-string v0, "medal_gain_time"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 169
    const-string v0, "medal_type"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 173
    :cond_3
    :goto_0
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalText="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "medalContent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    sget v0, Lcom/huawei/pluginachievement/R$id;->before_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->e:Landroid/widget/LinearLayout;

    .line 176
    sget v0, Lcom/huawei/pluginachievement/R$id;->head_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b:Landroid/widget/ImageView;

    .line 177
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->k:Landroid/widget/TextView;

    .line 178
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_get_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->n:Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->o:Landroid/widget/TextView;

    .line 180
    invoke-static {v7}, Lo/dzs;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 181
    const/4 v12, 0x0

    .line 183
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 184
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v12, v0

    .line 188
    :cond_4
    goto :goto_1

    .line 186
    :catch_0
    move-exception v13

    .line 187
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v11, :cond_5

    const/16 v0, 0x13

    if-gt v12, v0, :cond_6

    .line 190
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->share_background:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_2

    .line 192
    :cond_6
    new-instance v13, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v0, 0x0

    invoke-direct {v13, v0, v11}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 195
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    const/4 v0, 0x0

    if-eq v0, v6, :cond_8

    .line 196
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    const/4 v0, 0x0

    if-eq v0, v8, :cond_7

    .line 199
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 201
    :cond_7
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 204
    :cond_8
    :goto_3
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_pic_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->i:Landroid/widget/ImageView;

    .line 205
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v7, v0, v1}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 206
    const/4 v0, 0x0

    if-eq v0, v13, :cond_9

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->i:Landroid/widget/ImageView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v7, v1, v2}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_4

    .line 209
    :cond_9
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 212
    :goto_4
    iput-object v6, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->u:Ljava/lang/String;

    .line 213
    iput-object v9, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->x:Ljava/lang/String;

    .line 215
    sget v0, Lcom/huawei/pluginachievement/R$id;->name_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a:Landroid/widget/TextView;

    .line 216
    sget v0, Lcom/huawei/pluginachievement/R$id;->share_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->h:Lo/egd;

    .line 217
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->h:Lo/egd;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    return-void
.end method

.method public d()V
    .locals 1

    .line 314
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 315
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b()V

    .line 317
    :cond_0
    return-void
.end method

.method public e(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 3

    .line 277
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const-string v1, "checkGalleryPermission"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 279
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c()V

    .line 280
    return-void

    .line 282
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 283
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 284
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const-string v1, "checkGalleryPermission isnotHasPermissions"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 286
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 287
    :goto_0
    if-nez v2, :cond_3

    .line 288
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 289
    return-void

    .line 292
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 293
    goto :goto_1

    .line 294
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const-string v1, "checkGalleryPermission choosePic"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c()V

    .line 298
    :cond_5
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 111
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 112
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c:Landroid/content/Context;

    .line 113
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_medal_share_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->setContentView(I)V

    .line 114
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a()V

    .line 115
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->d()V

    .line 117
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 423
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 424
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 302
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

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

    .line 303
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 304
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 305
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const-string v1, "choosePicWrite Permission success"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->c()V

    goto :goto_0

    .line 308
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveSignalMedalActivity"

    const-string v1, "choosePicWrite Permission Failed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    :cond_1
    :goto_0
    return-void
.end method
