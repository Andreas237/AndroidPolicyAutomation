.class public Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HTTPS_OK:I = 0xc8

.field public static final ONE_DAY_TIME:J = 0x5265c00L

.field public static final SURVEY_TIME_ONE:I = 0x1

.field public static final SURVEY_TIME_THREE:I = 0x3

.field public static final SURVEY_TIME_TWO:I = 0x2

.field private static final TAG:Ljava/lang/String; = "NpsUserShowController"

.field private static npsUserShowController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController; = null


# instance fields
.field private context:Landroid/content/Context;

.field private surveyTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->npsUserShowController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    .line 59
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->executeNpsModule()V

    return-void
.end method

.method private executeNpsModule()V
    .locals 7

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    .line 614
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeNpsModule huidStr: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 615
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 616
    :cond_0
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isTheNewUserHadConfigInfo(Ljava/lang/String;)Z

    move-result v4

    .line 617
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NpsUserShowController isTheNewUserHadConfigInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    if-nez v4, :cond_3

    .line 619
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NEWBIE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->getUserType(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 620
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NpsUserShowController get the user type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 622
    return-void

    .line 623
    :cond_1
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->checkIsNewUserOrNot(Ljava/lang/String;)Z

    move-result v6

    .line 624
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeNpsModule new or old user: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    if-nez v6, :cond_2

    .line 626
    const-string v0, "NpsUserShowController"

    const-string v1, "executeNpsModule gotoTheOldUserConfig"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->gotoTheOldUserConfig(Ljava/lang/String;)V

    .line 628
    return-void

    .line 630
    :cond_2
    const-string v0, "NpsUserShowController"

    const-string v1, "executeNpsModule generateNewUserConfigInfo"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 631
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->generateNewUserConfigInfo(Ljava/lang/String;)V

    .line 633
    :cond_3
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNeedSurveyBatchs(Ljava/lang/String;)I

    move-result v5

    .line 634
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeNpsModule get the new user batch: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 635
    if-nez v5, :cond_4

    .line 636
    const-string v0, "NpsUserShowController"

    const-string v1, "executeNpsModule queryBatch == 0 gotoTheOldUserConfig"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->gotoTheOldUserConfig(Ljava/lang/String;)V

    .line 638
    return-void

    .line 640
    :cond_4
    invoke-virtual {p0, v3, v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isTheBatchsNeedSurvey(Ljava/lang/String;I)Z

    move-result v6

    .line 641
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeNpsModule needDownload: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    if-eqz v6, :cond_5

    .line 643
    const-string v0, ""

    const/4 v1, 0x1

    invoke-virtual {p0, v3, v5, v1, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->querySurveyByHuidFromCloud(Ljava/lang/String;IZLjava/lang/String;)V

    .line 645
    :cond_5
    return-void
.end method

.method private generateNumberFromHuid(Ljava/lang/String;)I
    .locals 6

    .line 346
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 347
    array-length v0, v2

    add-int/lit8 v3, v0, -0x1

    :goto_0
    if-ltz v3, :cond_1

    .line 348
    aget-char v0, v2, v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v4

    .line 349
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->regular(Ljava/lang/String;)Z

    move-result v5

    .line 350
    if-eqz v5, :cond_0

    .line 351
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 347
    :cond_0
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 354
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;
    .locals 3

    const-class v2, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    monitor-enter v2

    .line 64
    :try_start_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->npsUserShowController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->npsUserShowController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    .line 67
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->npsUserShowController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method private gotoTheOldUserConfig(Ljava/lang/String;)V
    .locals 7

    .line 648
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->readNpsConfig()Lcom/huawei/ui/main/stories/nps/component/NPSConfig;

    move-result-object v3

    .line 649
    if-eqz v3, :cond_1

    .line 650
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 651
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isTheOldUserHadConfigInfo(Ljava/lang/String;)Z

    move-result v5

    .line 652
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gotoTheOldUserConfig isHasConfig: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    if-nez v5, :cond_0

    .line 654
    const-string v0, "NpsUserShowController"

    const-string v1, "gotoTheOldUserConfig generateOldUserConfigInfo"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    invoke-virtual {p0, v3, v4, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->generateOldUserConfigInfo(Lcom/huawei/ui/main/stories/nps/component/NPSConfig;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 657
    :cond_0
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isTheOldUserNeedDownload(Ljava/lang/String;)Z

    move-result v6

    .line 658
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gotoTheOldUserConfig needDownload: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 659
    if-eqz v6, :cond_1

    .line 660
    const-string v0, "NpsUserShowController"

    const-string v1, "gotoTheOldUserConfig querySurveyByHuidFromCloud"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getBatch()I

    move-result v0

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getVersion()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v2, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->querySurveyByHuidFromCloud(Ljava/lang/String;IZLjava/lang/String;)V

    .line 666
    :cond_1
    :goto_0
    return-void
.end method

.method private regular(Ljava/lang/String;)Z
    .locals 4

    .line 358
    const-string v1, "^\\d$"

    .line 359
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 360
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 361
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private setTheNpsEnterUnSee(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V
    .locals 1

    .line 504
    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 505
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->saveNewUserConfigInfo(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    goto :goto_0

    .line 507
    :cond_1
    invoke-static {p3}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->saveOldUserConfigInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    :goto_0
    return-void
.end method


# virtual methods
.method public checkIsBindedDevice()Z
    .locals 7

    .line 413
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->readNpsConfig()Lcom/huawei/ui/main/stories/nps/component/NPSConfig;

    move-result-object v3

    .line 414
    if-nez v3, :cond_0

    .line 415
    const/4 v0, 0x1

    return v0

    .line 418
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getConnectedOrPairedDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 419
    if-eqz v4, :cond_1

    .line 420
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v5

    .line 421
    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getDeviceList()Ljava/util/List;

    move-result-object v6

    .line 422
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkIsBindedDevice deviceList: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    const/4 v0, 0x0

    return v0

    .line 427
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public checkIsNewUserOrNot(Ljava/lang/String;)Z
    .locals 1

    .line 287
    const-string v0, "done"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    const/4 v0, 0x1

    return v0

    .line 289
    :cond_0
    const-string v0, "doing"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 290
    const/4 v0, 0x0

    return v0

    .line 292
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public generateExpireTime()J
    .locals 6

    .line 406
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long v4, v0, v2

    .line 407
    return-wide v4
.end method

.method public generateNewUserConfigInfo(Ljava/lang/String;)V
    .locals 13

    .line 202
    new-instance v4, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;

    invoke-direct {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;-><init>()V

    .line 203
    new-instance v5, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    invoke-direct {v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;-><init>()V

    .line 204
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x4d3f6400

    add-long v6, v0, v2

    .line 205
    invoke-virtual {v5, v6, v7}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setShowTime(J)V

    .line 206
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 207
    new-instance v8, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    invoke-direct {v8}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;-><init>()V

    .line 209
    const-wide v0, 0x1823cf400L

    add-long v9, v6, v0

    .line 210
    invoke-virtual {v8, v9, v10}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setShowTime(J)V

    .line 211
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 212
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd hh-mm-ss"

    invoke-direct {v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 213
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " new user first survey time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " second survey time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 214
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 213
    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 216
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v12, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v12, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    invoke-virtual {v4, v12}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;->setNewUserConfig(Ljava/util/Map;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->setNewUserNativeConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    return-void
.end method

.method public generateOldUserConfigInfo(Lcom/huawei/ui/main/stories/nps/component/NPSConfig;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19

    .line 306
    new-instance v6, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    invoke-direct {v6}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;-><init>()V

    .line 307
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->generateNumberFromHuid(Ljava/lang/String;)I

    move-result v7

    .line 308
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getNeedInvestigate()Ljava/util/Map;

    move-result-object v8

    .line 309
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, [I

    .line 310
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->e(Landroid/content/Context;)I

    move-result v10

    .line 311
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getHealthVersion()Ljava/lang/String;

    move-result-object v11

    .line 312
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateOldUserConfigInfo HealthVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 314
    const-string v11, "0"

    .line 316
    :cond_0
    if-eqz v9, :cond_2

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lt v10, v0, :cond_2

    .line 317
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 320
    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object v12

    .line 321
    const/4 v0, 0x1

    aget v0, v9, v0

    const/4 v1, 0x0

    aget v1, v9, v1

    sub-int/2addr v0, v1

    invoke-virtual {v12, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    add-int/lit8 v13, v0, -0x1

    .line 322
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    aget v2, v9, v2

    add-int/2addr v2, v13

    int-to-long v2, v2

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    add-long v14, v0, v2

    .line 323
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-virtual {v1, v0, v2}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isNewBecomeOld(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v16

    .line 324
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "is new turn to old user? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    if-eqz v16, :cond_1

    .line 327
    const-wide v0, 0x1cf7c5800L

    add-long/2addr v14, v0

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setNewBecomeOld(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 330
    :cond_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd hh-mm-ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 331
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 332
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the old user config survey time is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    invoke-virtual {v6, v14, v15}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setShowTime(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    goto :goto_0

    .line 334
    :catch_0
    move-exception v12

    .line 335
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 336
    const-string v0, "NpsUserShowController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readNpsConfig JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    goto :goto_0

    .line 339
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 341
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setHasNativeConfig(Z)V

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v6}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-static {v0, v2, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->setOldUserNativeConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    return-void
.end method

.method public getConnectedOrPairedDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 435
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->d()Ljava/util/List;

    move-result-object v3

    .line 436
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 437
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getCurrentDeviceInfo() deviceInfoList.size() = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 439
    if-eqz v5, :cond_1

    .line 440
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 441
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 442
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 443
    :cond_0
    return-object v5

    .line 447
    :cond_1
    const-string v0, "NpsUserShowController"

    const-string v1, "deviceInfo is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    :cond_2
    goto :goto_0

    .line 450
    :cond_3
    const-string v0, "NpsUserShowController"

    const-string v1, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    const/4 v0, 0x0

    return-object v0

    .line 453
    :cond_4
    const-string v0, "NpsUserShowController"

    const-string v1, "getCurrentDeviceInfo() deviceInfoList is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHuidStr()Ljava/lang/String;
    .locals 2

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    .line 597
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 598
    const-string v0, ""

    return-object v0

    .line 599
    :cond_0
    return-object v1
.end method

.method public getNeedSurveyBatchs(Ljava/lang/String;)I
    .locals 5

    .line 243
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 244
    const/4 v4, 0x0

    .line 245
    if-eqz v3, :cond_1

    .line 246
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 247
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getNeedSurveyBatchs() return 1 bean.isNeedSurvey: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const/4 v0, 0x1

    return v0

    .line 251
    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 252
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getNeedSurveyBatchs() return 2 bean.isNeedSurvey: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x2

    return v0

    .line 257
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/Integer;Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;>;"
        }
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->getNewUserNativeConfig(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;

    move-result-object v1

    .line 226
    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;->getNewUserConfig()Ljava/util/Map;

    move-result-object v2

    .line 227
    return-object v2
.end method

.method public getOldUserConfigInfo(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;
    .locals 2

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->getOldUserNativeConfig(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v1

    .line 369
    return-object v1
.end method

.method public getSurveyTime()I
    .locals 1

    .line 462
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->surveyTime:I

    return v0
.end method

.method public isCheckShowNps(Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;Ljava/lang/String;I)Z
    .locals 5

    .line 466
    if-nez p1, :cond_0

    .line 467
    const-string v0, "NpsUserShowController"

    const-string v1, "isCheckShowNps configBean == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    const/4 v0, 0x0

    return v0

    .line 470
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v0

    if-nez v0, :cond_1

    .line 471
    const-string v0, "NpsUserShowController"

    const-string v1, "isCheckShowNps the survey is not need surveyed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    const/4 v0, 0x0

    return v0

    .line 474
    :cond_1
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isCheckShowNps getQuestionContent(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getQuestionContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getQuestionContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 476
    const-string v0, "NpsUserShowController"

    const-string v1, "isCheckShowNps the survey content is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    const/4 v0, 0x0

    return v0

    .line 479
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getExpireTime()J

    move-result-wide v3

    .line 480
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-nez v0, :cond_3

    .line 481
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->generateExpireTime()J

    move-result-wide v3

    .line 482
    invoke-virtual {p1, v3, v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setExpireTime(J)V

    .line 483
    invoke-direct {p0, p2, p3, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setTheNpsEnterUnSee(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    .line 485
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-gtz v0, :cond_4

    .line 487
    const-string v0, "NpsUserShowController"

    const-string v1, "isCheckShow show the nps enter: true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    const/4 v0, 0x1

    return v0

    .line 491
    :cond_4
    const-string v0, "NpsUserShowController"

    const-string v1, "isCheckShow is expired"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 495
    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setQuestionContent(Ljava/lang/String;)V

    .line 496
    const-string v0, "NpsUserShowController"

    const-string v1, "isCheckShow is expired and set the survey content to null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    invoke-direct {p0, p2, p3, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setTheNpsEnterUnSee(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    .line 499
    const/4 v0, 0x0

    return v0
.end method

.method public isNewBecomeOld(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 165
    invoke-static {p1, p2}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->getIsNewBecomeOld(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isShowNps()Z
    .locals 7

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v2

    .line 545
    if-nez v2, :cond_0

    .line 546
    const-string v0, "NpsUserShowController"

    const-string v1, "isShowNps chineseSimplifiedLocal: false"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    const/4 v0, 0x0

    return v0

    .line 549
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 550
    const-string v0, "NpsUserShowController"

    const-string v1, "isShowNps isOversea: true"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    const/4 v0, 0x0

    return v0

    .line 553
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->checkIsBindedDevice()Z

    move-result v0

    if-nez v0, :cond_2

    .line 554
    const-string v0, "NpsUserShowController"

    const-string v1, "isShowNps checkIsBindedDevice: false"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    const/4 v0, 0x0

    return v0

    .line 558
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    .line 559
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 560
    const-string v0, "NpsUserShowController"

    const-string v1, "isShowNps huidStr is no char: false"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    const/4 v0, 0x0

    return v0

    .line 564
    :cond_3
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 565
    if-eqz v4, :cond_5

    .line 566
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 567
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v3, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isCheckShowNps(Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 568
    const-string v0, "NpsUserShowController"

    const-string v1, " NpsUserShowController isShow nps time 1 return true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->surveyTime:I

    .line 570
    const/4 v0, 0x1

    return v0

    .line 572
    :cond_4
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 573
    const/4 v0, 0x2

    invoke-virtual {p0, v6, v3, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isCheckShowNps(Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 574
    const-string v0, "NpsUserShowController"

    const-string v1, " NpsUserShowController isShow nps time 2 return true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->surveyTime:I

    .line 576
    const/4 v0, 0x1

    return v0

    .line 579
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->readNpsConfig()Lcom/huawei/ui/main/stories/nps/component/NPSConfig;

    move-result-object v5

    .line 580
    if-nez v5, :cond_6

    .line 581
    const-string v0, "NpsUserShowController"

    const-string v1, "isShowNps the config == null "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    const/4 v0, 0x0

    return v0

    .line 584
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getOldUserConfigInfo(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v6

    .line 585
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v6, v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isCheckShowNps(Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 586
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->surveyTime:I

    .line 587
    const-string v0, "NpsUserShowController"

    const-string v1, "isShowNps NpsUserShowController isShow nps time 3 return true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    const/4 v0, 0x1

    return v0

    .line 590
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method public isTheBatchsNeedSurvey(Ljava/lang/String;I)Z
    .locals 9

    .line 262
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 263
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 264
    if-nez v4, :cond_0

    .line 265
    const-string v0, "NpsUserShowController"

    const-string v1, "isTheBatchsNeedSurvey configBean == null "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const/4 v0, 0x0

    return v0

    .line 268
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v0

    if-nez v0, :cond_2

    .line 269
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isTheBatchsNeedSurvey: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const/4 v0, 0x0

    return v0

    .line 272
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getQuestionContent()Ljava/lang/String;

    move-result-object v5

    .line 273
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 274
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isTheBatchsNeedSurvey content is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    const/4 v0, 0x0

    return v0

    .line 277
    :cond_4
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getShowTime()J

    move-result-wide v6

    .line 278
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-ltz v0, :cond_5

    const/4 v8, 0x1

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    .line 279
    :goto_2
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isTheBatchsNeedSurvey result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    return v8
.end method

.method public isTheNewUserHadConfigInfo(Ljava/lang/String;)Z
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->getNewUserNativeConfigStr(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 194
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isTheOldUserHadConfigInfo(Ljava/lang/String;)Z
    .locals 2

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->getOldUserNativeConfig(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v1

    .line 301
    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isHasNativeConfig()Z

    move-result v0

    return v0
.end method

.method public isTheOldUserNeedDownload(Ljava/lang/String;)Z
    .locals 9

    .line 374
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getOldUserConfigInfo(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v3

    .line 375
    if-nez v3, :cond_0

    .line 376
    const-string v0, "NpsUserShowController"

    const-string v1, "isTheOldUserNeedDownload configInfo == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    const/4 v0, 0x0

    return v0

    .line 379
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v0

    if-nez v0, :cond_1

    .line 380
    const-string v0, "NpsUserShowController"

    const-string v1, "isTheOldUserNeedDownload !configInfo.isNeedSurvey(): true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    const/4 v0, 0x0

    return v0

    .line 383
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getQuestionContent()Ljava/lang/String;

    move-result-object v4

    .line 384
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 385
    const-string v0, "NpsUserShowController"

    const-string v1, "isTheOldUserNeedDownload the content is not null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    const/4 v0, 0x0

    return v0

    .line 388
    :cond_2
    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getShowTime()J

    move-result-wide v5

    .line 389
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 390
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isTheOldUserNeedDownload needDownload: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    cmp-long v2, v7, v5

    if-ltz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    cmp-long v0, v7, v5

    if-ltz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public querySurveyByHuidFromCloud(Ljava/lang/String;IZLjava/lang/String;)V
    .locals 10

    .line 73
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "querySurveyByHuidFromCloud huidStr: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " times: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " newOrOld: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " version: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    .line 77
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 78
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 80
    const-string v0, "cVer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Lo/dbf;->e(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    const-string v0, "channel"

    const-string v1, "100001"

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    const-string v0, "keyword"

    const-string v1, "PHONE"

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    const-string v0, "sn"

    invoke-virtual {v8, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    const-string v0, "appID"

    const-string v1, "20"

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    const-string v0, "language"

    const-string v1, "zh-cn"

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v0, "times"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "querySurveyByHuidFromCloud params: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v8}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "emuiVersion"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getEMUIVerion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const-string v0, "countryCode"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    const-string v0, "firmware"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getFirmRomVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    const-string v0, "cVer"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getClientVersionCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    const-string v0, "model"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getInternalModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const-string v0, "os"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getAndroidVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    const-string v9, "http://ccpc.test.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/getSurveyV2/1"

    goto :goto_0

    .line 100
    :cond_0
    const-string v9, "https://ccpce-cn.consumer.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/getSurveyV2/1"

    .line 102
    :goto_0
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "querySurveyByHuidFromCloud query url string: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    new-instance v0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;

    move-object v1, p0

    move v2, p2

    move v3, p3

    move-object v4, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;-><init>(Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;IZLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v6, v9, v8, v7, v0}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I

    .line 160
    return-void
.end method

.method public readNpsConfig()Lcom/huawei/ui/main/stories/nps/component/NPSConfig;
    .locals 8

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "lightcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "servicefw"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "NPSConfig.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getStringFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 176
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "readNpsConfig npsStr: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 v6, 0x0

    .line 179
    :try_start_0
    const-class v0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v6, v0

    .line 184
    goto :goto_0

    .line 180
    :catch_0
    move-exception v7

    .line 181
    const-string v0, "NpsUserShowController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readNpsConfig JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    goto :goto_0

    .line 182
    :catch_1
    move-exception v7

    .line 183
    const-string v0, "NpsUserShowController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readNpsConfig error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :goto_0
    return-object v6
.end method

.method public saveNewUserConfigInfo(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V
    .locals 4

    .line 232
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 233
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    new-instance v3, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;

    invoke-direct {v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;-><init>()V

    .line 236
    invoke-virtual {v3, v2}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigMap;->setNewUserConfig(Ljava/util/Map;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v3}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->setNewUserNativeConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    return-void
.end method

.method public saveOldUserConfigInfo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->setOldUserNativeConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    return-void
.end method

.method public setNewBecomeOld(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    .line 169
    invoke-static {p1, p2, p3}, Lcom/huawei/ui/main/stories/nps/component/NpsSharePreferenceUtils;->setIsNewBecomeOld(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 170
    return-void
.end method

.method public setTheSurveyUnNeeded(I)V
    .locals 7

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    .line 515
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setTheSurveyUnNeeded surveyTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 518
    :cond_0
    const/4 v0, 0x2

    if-gt p1, v0, :cond_2

    if-lez p1, :cond_2

    .line 519
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 520
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setTheSurveyUnNeeded() newBean.isNeedSurvey: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 523
    const-string v0, "NpsUserShowController"

    const-string v1, " surveyTime == 2, new user turn to old user"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->context:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v3, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setNewBecomeOld(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 526
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 527
    invoke-direct {p0, v3, p1, v4}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setTheNpsEnterUnSee(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    .line 530
    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    .line 531
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->readNpsConfig()Lcom/huawei/ui/main/stories/nps/component/NPSConfig;

    move-result-object v4

    .line 532
    if-nez v4, :cond_3

    return-void

    .line 533
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 534
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getOldUserConfigInfo(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v6

    .line 535
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 536
    invoke-direct {p0, v5, p1, v6}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setTheNpsEnterUnSee(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    .line 538
    :cond_4
    return-void
.end method

.method public threadExecuteNpsModule()V
    .locals 2

    .line 603
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$2;-><init>(Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 608
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 609
    return-void
.end method
