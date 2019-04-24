.class public Lo/wf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wj;


# static fields
.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-string v0, "900086000010001303"

    sput-object v0, Lo/wf;->c:Ljava/lang/String;

    .line 46
    const-string v0, "B1YrTWNVVKAzk0dJMpvXvmh5cMKp8ppQxb7pZDhclv%2BoZQa6nQshkep3%2FpHzHJ%2BwltS7rTk8ehLMyaP5"

    sput-object v0, Lo/wf;->e:Ljava/lang/String;

    .line 47
    const-string v0, "UTF-8"

    sput-object v0, Lo/wf;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    .line 50
    iput-object p1, p0, Lo/wf;->b:Landroid/content/Context;

    .line 51
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xx;->a(Ljava/lang/String;)V

    .line 52
    return-void
.end method

.method static synthetic a(Lo/wf;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 41
    sget-object v0, Lo/wf;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 494
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getHuId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v4

    .line 497
    if-eqz v4, :cond_0

    const-string v0, "default_userid"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 498
    return-object v4

    .line 500
    :cond_0
    sget-object v0, Lo/wf;->c:Ljava/lang/String;

    return-object v0
.end method

.method private static b(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 6

    .line 510
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getAccessToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    invoke-static {p0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->e()Ljava/lang/String;

    move-result-object v4

    .line 515
    if-eqz v4, :cond_1

    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 516
    if-eqz p1, :cond_0

    const-string v0, "UTF-8"

    invoke-static {v4, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 517
    :cond_0
    return-object v4

    .line 519
    :cond_1
    if-eqz p1, :cond_2

    :try_start_1
    sget-object v0, Lo/wf;->e:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    .line 520
    :cond_2
    :try_start_2
    sget-object v0, Lo/wf;->e:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    .line 522
    :catch_0
    move-exception v5

    .line 523
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 528
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getServiceToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const-string v4, ""

    .line 530
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 531
    return-object v4

    .line 533
    :cond_0
    invoke-static {p0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->i()Ljava/lang/String;

    move-result-object v4

    .line 534
    return-object v4
.end method

.method private static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 505
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/wf;->b(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 41
    invoke-static {p0}, Lo/wf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 1

    .line 41
    invoke-static {p0, p1}, Lo/wf;->b(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(JIILo/wo;)V
    .locals 9

    .line 340
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateLikeDetails"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudRankUrl"

    new-instance v2, Lo/wf$3;

    move-object v3, p0

    move-wide v4, p1

    move v6, p3

    move v7, p4

    move-object v8, p5

    invoke-direct/range {v2 .. v8}, Lo/wf$3;-><init>(Lo/wf;JIILo/wo;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 378
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/wf;->b:Landroid/content/Context;

    .line 56
    return-void
.end method

.method public b(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Lo/wo;Landroid/os/Bundle;)V"
        }
    .end annotation

    .line 583
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getRankDetailsBytimeStamp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 586
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter Parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 588
    invoke-interface {p2}, Lo/wo;->a()V

    .line 590
    :cond_0
    return-void

    .line 593
    :cond_1
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudRankUrl"

    new-instance v2, Lo/wf$4;

    invoke-direct {v2, p0, p1, p2, p3}, Lo/wf$4;-><init>(Lo/wf;Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 630
    return-void
.end method

.method public b(Lo/wo;)V
    .locals 4

    .line 420
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getRankListSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudRankUrl"

    new-instance v2, Lo/wf$6;

    invoke-direct {v2, p0, p1}, Lo/wf$6;-><init>(Lo/wf;Lo/wo;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 452
    return-void
.end method

.method public c(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Lo/wo;Landroid/os/Bundle;)V"
        }
    .end annotation

    .line 66
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getUserProfileByHuIds"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 68
    :cond_0
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter Parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 70
    invoke-interface {p2}, Lo/wo;->a()V

    .line 72
    :cond_1
    return-void

    .line 75
    :cond_2
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 76
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserProfileByHuIds don\'t support social function here"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    return-void

    .line 80
    :cond_3
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudProfileUrl"

    new-instance v2, Lo/wf$1;

    invoke-direct {v2, p0, p1, p2, p3}, Lo/wf$1;-><init>(Lo/wf;Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 117
    return-void
.end method

.method public d(ILo/wo;)V
    .locals 4

    .line 382
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter modifyRankListSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudRankUrl"

    new-instance v2, Lo/wf$2;

    invoke-direct {v2, p0, p1, p2}, Lo/wf$2;-><init>(Lo/wf;ILo/wo;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 415
    return-void
.end method

.method public e(Lo/wo;)V
    .locals 4

    .line 459
    const-string v0, "PSocial_HwSocialCloudManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter fetchFriendsLikedetailsAll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Lo/wf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudRankUrl"

    new-instance v2, Lo/wf$5;

    invoke-direct {v2, p0, p1}, Lo/wf$5;-><init>(Lo/wf;Lo/wo;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 491
    return-void
.end method
