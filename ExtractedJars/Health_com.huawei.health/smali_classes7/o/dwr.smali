.class public Lo/dwr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;

.field private static m:Ljava/util/concurrent/ExecutorService;

.field private static volatile o:Lo/dwr;


# instance fields
.field private a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

.field private e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

.field private volatile f:I

.field private volatile g:Z

.field private h:I

.field private volatile i:I

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 79
    const-string v0, "PLGACHIEVE_AchieveDataManager"

    sput-object v0, Lo/dwr;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwr;->k:Ljava/util/Map;

    .line 107
    const/4 v0, -0x1

    iput v0, p0, Lo/dwr;->h:I

    .line 652
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwr;->n:Ljava/util/Map;

    .line 127
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    .line 128
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/dwr;->c(Landroid/content/Context;)V

    .line 129
    return-void
.end method

.method private A()V
    .locals 2

    .line 277
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dxf;->d(Landroid/content/Context;)Lo/dxf;

    move-result-object v1

    .line 278
    if-eqz v1, :cond_1

    .line 279
    invoke-virtual {v1}, Lo/dxf;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 280
    invoke-virtual {v1, p0}, Lo/dxf;->b(Lo/dwr;)V

    .line 282
    :cond_0
    invoke-virtual {v1}, Lo/dxf;->b()V

    .line 284
    :cond_1
    return-void
.end method

.method private B()V
    .locals 2

    .line 892
    sget-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dwr$5;

    invoke-direct {v1, p0}, Lo/dwr$5;-><init>(Lo/dwr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 917
    return-void
.end method

.method private C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;
    .locals 7

    .line 520
    new-instance v3, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-direct {v3}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;-><init>()V

    .line 521
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 523
    const/4 v0, 0x5

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "getLoginInfo"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "getUserInfo"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "getAppInfo"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "getPhoneInfo"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "getDeviceInfo"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 525
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/dti;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 526
    const-string v0, "huid"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setHuid(Ljava/lang/String;)V

    .line 527
    const-string v0, "severToken"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setToken(Ljava/lang/String;)V

    .line 528
    const-string v0, "productType"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setBindDeviceType(Ljava/lang/String;)V

    .line 529
    const-string v0, "grayVersion"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setAppVersion(Ljava/lang/String;)V

    .line 530
    invoke-static {}, Lo/dxc;->c()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setTokenType(I)V

    .line 531
    const-string v0, "appId"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setAppId(Ljava/lang/String;)V

    .line 532
    const-string v0, "deviceType"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setDeviceType(Ljava/lang/String;)V

    .line 533
    const-string v0, "deviceId"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 534
    invoke-static {v6}, Lo/dzw;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 535
    const-string v6, "clientnull"

    .line 537
    :cond_0
    invoke-virtual {v3, v6}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setDeviceId(Ljava/lang/String;)V

    .line 538
    const-string v0, "sysVersion"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setSysVersion(Ljava/lang/String;)V

    .line 539
    const-string v0, "appType"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/dxc;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setAppType(I)V

    .line 540
    const-string v0, "iversion"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/dxc;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setiVersion(I)V

    .line 541
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dxc;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setLanguage(Ljava/lang/String;)V

    .line 542
    const-string v0, "environment"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/dxc;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setEnvironment(I)V

    .line 543
    const-string v0, "upDeviceType"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setUpDeviceType(Ljava/lang/String;)V

    .line 545
    :cond_1
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AUserProfile:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    return-object v3
.end method

.method private D()V
    .locals 2

    .line 920
    sget-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dwr$2;

    invoke-direct {v1, p0}, Lo/dwr$2;-><init>(Lo/dwr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 957
    return-void
.end method

.method private G()Z
    .locals 10

    .line 1562
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 1563
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "generateMedalTime"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1564
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1565
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "generateMedalTime"

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1566
    const/4 v0, 0x1

    return v0

    .line 1570
    :cond_1
    :try_start_0
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 1571
    sub-long v0, v4, v7

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 1572
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "generateMedalTime"

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1573
    const/4 v0, 0x1

    return v0

    .line 1575
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 1577
    :catch_0
    move-exception v9

    .line 1578
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "doGenerateMedal parse exception "

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1581
    const/4 v0, 0x1

    return v0
.end method

.method private a(J)Ljava/util/Date;
    .locals 8

    .line 628
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 629
    invoke-virtual {v1}, Ljava/util/Calendar;->clear()V

    .line 630
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 631
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 632
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 633
    const/16 v0, 0xb

    if-ne v3, v0, :cond_0

    .line 634
    add-int/lit8 v2, v2, 0x1

    .line 635
    add-int/lit8 v3, v3, -0xb

    goto :goto_0

    .line 637
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 639
    :goto_0
    const/16 v0, 0xb

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 640
    const/16 v0, 0xc

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 641
    const/16 v0, 0xd

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 642
    const/4 v0, 0x1

    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 643
    const/4 v0, 0x2

    invoke-virtual {v1, v0, v3}, Ljava/util/Calendar;->set(II)V

    .line 644
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v7

    .line 645
    const/4 v0, 0x5

    invoke-virtual {v1, v0, v7}, Ljava/util/Calendar;->set(II)V

    .line 646
    const/16 v0, 0xb

    invoke-virtual {v1, v0, v4}, Ljava/util/Calendar;->set(II)V

    .line 647
    const/16 v0, 0xc

    invoke-virtual {v1, v0, v5}, Ljava/util/Calendar;->set(II)V

    .line 648
    const/16 v0, 0xd

    invoke-virtual {v1, v0, v6}, Ljava/util/Calendar;->set(II)V

    .line 649
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private a(IJ)V
    .locals 9

    .line 1523
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_messagecenter_sport_goal_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1524
    const-string v5, ""

    .line 1525
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1526
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v5

    .line 1528
    :cond_0
    const/4 v6, 0x0

    .line 1529
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1530
    const-string v0, "23:59:59"

    invoke-static {v0}, Lo/dxl;->d(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dxl;->b(J)J

    move-result-wide v7

    .line 1532
    new-instance v6, Lo/dwc;

    invoke-direct {v6}, Lo/dwc;-><init>()V

    .line 1533
    const-string v0, "achievement"

    invoke-virtual {v6, v0}, Lo/dwc;->a(Ljava/lang/String;)V

    .line 1534
    const-string v0, "historyBestMessage"

    invoke-virtual {v6, v0}, Lo/dwc;->c(Ljava/lang/String;)V

    .line 1535
    invoke-virtual {v6, v4}, Lo/dwc;->d(Ljava/lang/String;)V

    .line 1536
    invoke-virtual {v6, v7, v8}, Lo/dwc;->a(J)V

    .line 1537
    const-string v0, "messagecenter://historyBestMessage"

    invoke-virtual {v6, v0}, Lo/dwc;->f(Ljava/lang/String;)V

    .line 1538
    invoke-virtual {v6, v5}, Lo/dwc;->g(Ljava/lang/String;)V

    .line 1539
    invoke-virtual {v6, p2, p3}, Lo/dwc;->c(J)V

    .line 1541
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dwc;->b(I)V

    .line 1542
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dwc;->d(I)V

    .line 1543
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dwc;->e(I)V

    .line 1544
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dwc;->a(I)V

    .line 1545
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lo/dwc;->c(I)V

    .line 1546
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dwc;->i(I)V

    .line 1547
    const-string v0, "assets://localMessageIcon/ic_medal.png"

    invoke-virtual {v6, v0}, Lo/dwc;->k(Ljava/lang/String;)V

    .line 1548
    const/16 v0, 0xb

    invoke-virtual {v6, v0}, Lo/dwc;->f(I)V

    .line 1550
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/dti;->c(Lo/dwc;)Ljava/lang/String;

    .line 1551
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateHistoryBestMsg messageObject="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1553
    :cond_1
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateHistoryBestMsg messageObject "

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1556
    new-instance v0, Ljava/sql/Timestamp;

    invoke-direct {v0, p2, p3}, Ljava/sql/Timestamp;-><init>(J)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1557
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_history_best_data"

    invoke-static {v0, v1, v7}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1558
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x2

    invoke-virtual {p0, v3, v0, v1, v2}, Lo/dwr;->a(ILjava/lang/String;J)V

    .line 1559
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dwr;
    .locals 4

    .line 113
    sget-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    .line 116
    :cond_1
    sget-object v0, Lo/dwr;->o:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 117
    const-class v2, Lo/dwr;

    monitor-enter v2

    .line 118
    :try_start_0
    sget-object v0, Lo/dwr;->o:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 119
    new-instance v0, Lo/dwr;

    invoke-direct {v0, p0}, Lo/dwr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dwr;->o:Lo/dwr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    :cond_2
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 123
    :cond_3
    :goto_0
    sget-object v0, Lo/dwr;->o:Lo/dwr;

    return-object v0
.end method

.method private b(IJ)V
    .locals 14

    .line 1315
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateKakaMessage()\uff0ccurCalorie = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1316
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_message_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 1317
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_message_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1318
    const-string v5, ""

    .line 1319
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1320
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v5

    .line 1323
    :cond_0
    const v0, 0xc350

    if-ge p1, v0, :cond_2

    .line 1326
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1327
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_kaka"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1328
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1329
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/dti;->d(Ljava/lang/String;)V

    .line 1332
    :cond_1
    return-void

    .line 1334
    :cond_2
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_flag"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1335
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    .line 1336
    :goto_0
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " calorie="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "isExchanged="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1337
    if-eqz v7, :cond_4

    .line 1339
    return-void

    .line 1341
    :cond_4
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_calorie"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1342
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1344
    return-void

    .line 1347
    :cond_5
    const/4 v9, 0x0

    .line 1348
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1349
    const-string v0, "23:59:59"

    invoke-static {v0}, Lo/dxl;->d(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dxl;->b(J)J

    move-result-wide v10

    .line 1351
    new-instance v9, Lo/dwc;

    invoke-direct {v9}, Lo/dwc;-><init>()V

    .line 1352
    const-string v0, "achievement"

    invoke-virtual {v9, v0}, Lo/dwc;->a(Ljava/lang/String;)V

    .line 1353
    const-string v0, "kakaMessage"

    invoke-virtual {v9, v0}, Lo/dwc;->c(Ljava/lang/String;)V

    .line 1354
    invoke-virtual {v9, v3}, Lo/dwc;->d(Ljava/lang/String;)V

    .line 1355
    invoke-virtual {v9, v4}, Lo/dwc;->b(Ljava/lang/String;)V

    .line 1356
    invoke-virtual {v9, v10, v11}, Lo/dwc;->a(J)V

    .line 1357
    const-string v0, "messagecenter://kakaMessage"

    invoke-virtual {v9, v0}, Lo/dwc;->f(Ljava/lang/String;)V

    .line 1358
    invoke-virtual {v9, v5}, Lo/dwc;->g(Ljava/lang/String;)V

    .line 1359
    move-wide/from16 v0, p2

    invoke-virtual {v9, v0, v1}, Lo/dwc;->c(J)V

    .line 1361
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/dwc;->b(I)V

    .line 1362
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/dwc;->d(I)V

    .line 1363
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/dwc;->e(I)V

    .line 1364
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/dwc;->a(I)V

    .line 1365
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lo/dwc;->c(I)V

    .line 1366
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/dwc;->i(I)V

    .line 1367
    const-string v0, "assets://localMessageIcon/messagecenter_achieve_ic_kaka.png"

    invoke-virtual {v9, v0}, Lo/dwc;->k(Ljava/lang/String;)V

    .line 1368
    const/16 v0, 0xb

    invoke-virtual {v9, v0}, Lo/dwc;->f(I)V

    .line 1369
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_kaka"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 1370
    invoke-virtual {v9, v12}, Lo/dwc;->e(Ljava/lang/String;)V

    .line 1372
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v9}, Lo/dti;->c(Lo/dwc;)Ljava/lang/String;

    move-result-object v13

    .line 1374
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_kaka"

    invoke-static {v0, v1, v13}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1376
    :cond_6
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateKakaMessage messageObject="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v9, :cond_7

    const-string v2, "null"

    goto :goto_1

    :cond_7
    move-object v2, v9

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1377
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateKakaMessage successful"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1379
    new-instance v0, Ljava/sql/Timestamp;

    move-wide/from16 v1, p2

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 1380
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_datastr"

    invoke-static {v0, v1, v10}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1381
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_calorie"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1382
    return-void
.end method

.method static synthetic c(Lo/dwr;)Landroid/content/Context;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    return-object v0
.end method

.method private c(J)Ljava/util/Date;
    .locals 3

    .line 617
    new-instance v0, Ljava/util/Date;

    const-wide/32 v1, 0x240c8400

    add-long/2addr v1, p1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public static c()V
    .locals 2

    .line 172
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "release()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    sget-object v0, Lo/dwr;->o:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 174
    sget-object v0, Lo/dwr;->o:Lo/dwr;

    invoke-direct {v0}, Lo/dwr;->v()V

    .line 176
    :cond_0
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 132
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "init()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dzu;->d(Landroid/content/Context;)V

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dwr;->g:Z

    .line 136
    invoke-direct {p0, p1}, Lo/dwr;->d(Landroid/content/Context;)V

    .line 137
    return-void
.end method

.method static synthetic c(Lo/dwr;IJ)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lo/dwr;->e(IJ)V

    return-void
.end method

.method private d(Ljava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvk;>;)Ljava/util/List<Lo/dvk;>;"
        }
    .end annotation

    .line 749
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 750
    const/4 v0, 0x0

    return-object v0

    .line 752
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 753
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 754
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 755
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_3

    .line 756
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvk;

    .line 757
    invoke-virtual {v6}, Lo/dvk;->d()Ljava/lang/String;

    move-result-object v7

    .line 758
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 759
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 760
    invoke-virtual {v6}, Lo/dvk;->c()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 761
    invoke-virtual {v6}, Lo/dvk;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvk;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    :cond_1
    goto :goto_1

    .line 764
    :cond_2
    invoke-virtual {v6}, Lo/dvk;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvk;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 767
    :cond_3
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 768
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 769
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 770
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 771
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 772
    const/4 v9, 0x0

    :goto_3
    if-ge v9, v2, :cond_5

    .line 773
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dvk;

    .line 774
    invoke-virtual {v10}, Lo/dvk;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v10}, Lo/dvk;->c()I

    move-result v0

    if-ne v8, v0, :cond_4

    .line 775
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 776
    goto :goto_4

    .line 772
    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 779
    :cond_5
    :goto_4
    goto :goto_2

    .line 780
    :cond_6
    return-object v4
.end method

.method private d(Landroid/content/Context;)V
    .locals 1

    .line 179
    invoke-static {p1}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    .line 180
    invoke-static {p1}, Lo/dtv;->d(Landroid/content/Context;)Lo/dtv;

    .line 181
    invoke-direct {p0}, Lo/dwr;->C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 182
    return-void
.end method

.method static synthetic d(Lo/dwr;IJ)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lo/dwr;->b(IJ)V

    return-void
.end method

.method private e(IJ)V
    .locals 5

    .line 1480
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateHistoryBestMsg() step="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1484
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dwm;

    .line 1485
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/dwm;->e()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1486
    :goto_0
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateHistoryBestMsg() cur best step="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1488
    if-le p1, v4, :cond_1

    if-nez v4, :cond_2

    .line 1489
    :cond_1
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateHistoryBestMsg() not more than history best"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1490
    return-void

    .line 1493
    :cond_2
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "Now generateHistoryBestMsg "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1494
    invoke-direct {p0, p1, p2, p3}, Lo/dwr;->a(IJ)V

    .line 1495
    return-void
.end method

.method private e(Lo/dvu;)V
    .locals 15

    .line 1001
    const-wide/16 v7, 0x0

    .line 1002
    const-wide/16 v9, 0x0

    .line 1003
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1005
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v7, v0

    .line 1006
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v9, v0

    .line 1009
    goto :goto_0

    .line 1007
    :catch_0
    move-exception v11

    .line 1008
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "requestSportData NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1011
    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v0, v7

    if-gez v0, :cond_2

    .line 1012
    :cond_1
    return-void

    .line 1015
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1016
    return-void

    .line 1019
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->B()I

    move-result v11

    .line 1020
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v12

    .line 1021
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v13

    .line 1022
    invoke-static {v13}, Lo/dzs;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1023
    return-void

    .line 1025
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lo/dvu;->C()I

    move-result v14

    .line 1026
    move-object/from16 v0, p1

    iget-object v1, p0, Lo/dwr;->c:Landroid/content/Context;

    move-wide v2, v7

    move-wide v4, v9

    invoke-static/range {v0 .. v5}, Lo/dww;->a(Lo/dvu;Landroid/content/Context;JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1027
    invoke-virtual {p0, v12, v13, v14}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 1029
    :cond_5
    move-object v0, p0

    move-object/from16 v1, p1

    move-wide v2, v7

    move-wide v4, v9

    invoke-virtual/range {v0 .. v5}, Lo/dwr;->e(Lo/dvu;JJ)V

    .line 1030
    const/4 v0, 0x4

    if-eq v11, v0, :cond_6

    const/4 v0, 0x6

    if-eq v11, v0, :cond_6

    .line 1031
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "medalUnit Invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1032
    return-void

    .line 1034
    :cond_6
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    new-instance v1, Lo/dwr$8;

    move-object v2, p0

    move v3, v11

    move v4, v14

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v1 .. v6}, Lo/dwr$8;-><init>(Lo/dwr;IILjava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lo/dwr;->c:Landroid/content/Context;

    .line 1059
    const/4 v3, 0x1

    invoke-static {v7, v8, v3}, Lo/dxc;->c(JZ)J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-static {v9, v10, v5}, Lo/dxc;->c(JZ)J

    move-result-wide v5

    .line 1034
    invoke-interface/range {v0 .. v6}, Lo/dti;->e(Lo/duh;Landroid/content/Context;JJ)V

    .line 1060
    return-void
.end method

.method static synthetic e(Lo/dwr;Lo/dvu;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lo/dwr;->e(Lo/dvu;)V

    return-void
.end method

.method private j()V
    .locals 5

    .line 701
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_uploadMedal"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 702
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 703
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "dealNotUploadMedal medal is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    return-void

    .line 706
    :cond_0
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealNotUploadMedal="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 707
    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 708
    sget-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dwr$1;

    invoke-direct {v1, p0, v4}, Lo/dwr$1;-><init>(Lo/dwr;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 735
    return-void
.end method

.method private v()V
    .locals 2

    .line 166
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "clear()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwn;->b()V

    .line 169
    return-void
.end method

.method private w()V
    .locals 3

    .line 185
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "registerMovementReceiver enter"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lo/dwr;->a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 187
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "new onceMovementReceiver"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    new-instance v0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    invoke-direct {v0}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;-><init>()V

    iput-object v0, p0, Lo/dwr;->a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    .line 191
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    iget-object v1, p0, Lo/dwr;->a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    const-string v2, "com.huawei.healthcloud.action.sendSportTrackDistance"

    invoke-virtual {v0, v1, v2}, Lo/duk;->registerBroadcast(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V

    .line 193
    return-void
.end method

.method static synthetic z()Ljava/lang/String;
    .locals 1

    .line 76
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;
    .locals 1

    .line 156
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 738
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 739
    const-string v0, "medalType"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    const-string v0, "medalLevel"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 742
    const-string v0, "UTC"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 743
    const-string v0, "takeDate"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    return-object v2
.end method

.method public a(ILjava/util/Map;)Lo/dvf;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 204
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData(),params ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 206
    invoke-direct {p0}, Lo/dwr;->C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 208
    :cond_0
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_1

    .line 210
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile.getHuid() ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const-string v0, "huid"

    iget-object v1, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    :cond_1
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 214
    const-string v0, "huid"

    const-string v1, "1"

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    :cond_2
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dwn;->e(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public a(IIJ)Lo/dwc;
    .locals 4

    .line 591
    new-instance v3, Lo/dwc;

    invoke-direct {v3}, Lo/dwc;-><init>()V

    .line 592
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_week_push_msg_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->d(Ljava/lang/String;)V

    .line 593
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_week_push_msg_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->b(Ljava/lang/String;)V

    .line 594
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dwc;->b(I)V

    .line 595
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lo/dwc;->c(I)V

    .line 596
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dwc;->d(I)V

    .line 597
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dwc;->e(I)V

    .line 598
    invoke-direct {p0, p3, p4}, Lo/dwr;->c(J)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwc;->a(J)V

    .line 599
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwc;->c(J)V

    .line 600
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://sportReport?report_stype=1&min_report_no="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&max_report_no="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->f(Ljava/lang/String;)V

    .line 602
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dwc;->a(I)V

    .line 603
    const/16 v0, 0xb

    invoke-virtual {v3, v0}, Lo/dwc;->f(I)V

    .line 605
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->g(Ljava/lang/String;)V

    .line 606
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getReportMsg MessageObject="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/dwc;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    return-object v3
.end method

.method public a(Landroid/content/Context;)Lo/dwe;
    .locals 12

    .line 1417
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1418
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dwj;

    .line 1419
    const/4 v0, 0x5

    invoke-virtual {p0, v0, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dvh;

    .line 1420
    const/16 v0, 0xe

    invoke-virtual {p0, v0, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvj;

    .line 1421
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dwm;

    .line 1422
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 1424
    const-string v0, "reportNo"

    const-string v1, "_weekReportNo"

    const-string v2, "0"

    invoke-static {p1, v1, v2}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1425
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPersonalData() weekParam="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1427
    const/4 v0, 0x3

    invoke-virtual {p0, v0, v8}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dwh;

    .line 1429
    if-eqz v6, :cond_0

    .line 1430
    invoke-virtual {v6}, Lo/dvj;->d()I

    move-result v10

    goto :goto_0

    .line 1432
    :cond_0
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lo/dvh;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dzt;->c(D)I

    move-result v10

    goto :goto_0

    :cond_1
    const/4 v10, 0x1

    .line 1434
    :goto_0
    invoke-static {}, Lo/dwe;->g()Lo/dwe$c;

    move-result-object v0

    if-eqz v5, :cond_2

    .line 1435
    invoke-virtual {v5}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Lo/dwe$c;->b(Ljava/lang/String;)Lo/dwe$c;

    move-result-object v0

    .line 1436
    invoke-virtual {v0, v10}, Lo/dwe$c;->e(I)Lo/dwe$c;

    move-result-object v0

    if-eqz v5, :cond_3

    iget-object v1, p0, Lo/dwr;->k:Ljava/util/Map;

    .line 1437
    invoke-virtual {v5}, Lo/dvh;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lo/dwr;->k:Ljava/util/Map;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :goto_2
    invoke-virtual {v0, v1}, Lo/dwe$c;->c(Ljava/lang/String;)Lo/dwe$c;

    move-result-object v0

    if-eqz v9, :cond_4

    .line 1438
    invoke-virtual {v9}, Lo/dwh;->d()D

    move-result-wide v1

    goto :goto_3

    :cond_4
    const-wide/16 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1, v2}, Lo/dwe$c;->d(D)Lo/dwe$c;

    move-result-object v0

    if-eqz v5, :cond_5

    .line 1439
    invoke-virtual {v5}, Lo/dvh;->c()I

    move-result v1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/dwe$c;->b(I)Lo/dwe$c;

    move-result-object v0

    if-eqz v4, :cond_6

    .line 1440
    invoke-virtual {v4}, Lo/dwj;->c()I

    move-result v1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    invoke-virtual {v0, v1}, Lo/dwe$c;->d(I)Lo/dwe$c;

    move-result-object v0

    if-eqz v4, :cond_7

    .line 1441
    invoke-virtual {v4}, Lo/dwj;->e()D

    move-result-wide v1

    goto :goto_6

    :cond_7
    const-wide/16 v1, 0x0

    :goto_6
    invoke-virtual {v0, v1, v2}, Lo/dwe$c;->e(D)Lo/dwe$c;

    move-result-object v0

    if-eqz v7, :cond_8

    .line 1442
    invoke-virtual {v7}, Lo/dwm;->e()I

    move-result v1

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    :goto_7
    invoke-virtual {v0, v1}, Lo/dwe$c;->a(I)Lo/dwe$c;

    move-result-object v0

    .line 1443
    invoke-virtual {v0}, Lo/dwe$c;->e()Lo/dwe;

    move-result-object v11

    .line 1444
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPersonalData() local personalData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/dwe;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1445
    return-object v11
.end method

.method public a(ILjava/lang/String;J)V
    .locals 3

    .line 1141
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1142
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "com.huawei.pluginachievement.ui.report.AchieveReportDialog"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1143
    const-string v0, "dialogType"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1144
    const-string v0, "dialogValue"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1145
    const-string v0, "dialogDate"

    invoke-virtual {v2, v0, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1146
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1147
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1148
    return-void
.end method

.method public b()Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;
    .locals 1

    .line 140
    iget-object v0, p0, Lo/dwr;->d:Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

    return-object v0
.end method

.method public b(IIJ)Lo/dwc;
    .locals 4

    .line 560
    new-instance v3, Lo/dwc;

    invoke-direct {v3}, Lo/dwc;-><init>()V

    .line 561
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_month_push_msg_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->d(Ljava/lang/String;)V

    .line 562
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_month_push_msg_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->b(Ljava/lang/String;)V

    .line 563
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dwc;->b(I)V

    .line 564
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lo/dwc;->c(I)V

    .line 565
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dwc;->d(I)V

    .line 566
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dwc;->e(I)V

    .line 567
    invoke-direct {p0, p3, p4}, Lo/dwr;->a(J)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwc;->a(J)V

    .line 568
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwc;->c(J)V

    .line 569
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://sportReport?report_stype=0&min_report_no="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&max_report_no="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->f(Ljava/lang/String;)V

    .line 571
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dwc;->a(I)V

    .line 572
    const/16 v0, 0xb

    invoke-virtual {v3, v0}, Lo/dwc;->f(I)V

    .line 573
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getReportMsg mUserProfile.getHuid()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwc;->g(Ljava/lang/String;)V

    .line 576
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getReportMsg MessageObject="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/dwc;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    return-object v3
.end method

.method public b(Lo/duj;Landroid/content/Context;)Lo/dwe;
    .locals 3

    .line 1392
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "getPersonalData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1393
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1394
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "getPersonalData() callback == null || context == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1395
    const/4 v0, 0x0

    return-object v0

    .line 1397
    :cond_0
    invoke-direct {p0}, Lo/dwr;->C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 1398
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1399
    invoke-static {}, Lo/dwe;->g()Lo/dwe$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwe$c;->e()Lo/dwe;

    move-result-object v0

    return-object v0

    .line 1402
    :cond_1
    new-instance v2, Lo/dwv;

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/dwv;-><init>(Landroid/content/Context;)V

    .line 1403
    iget-object v0, p0, Lo/dwr;->k:Ljava/util/Map;

    iget-object v1, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dxc;->b(Ljava/util/Map;Landroid/content/Context;)V

    .line 1404
    invoke-virtual {v2, p1}, Lo/dwv;->e(Lo/duj;)V

    .line 1405
    invoke-virtual {p0, v2}, Lo/dwr;->d(Lo/dwv;)V

    .line 1406
    invoke-virtual {p0}, Lo/dwr;->h()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 1408
    invoke-virtual {p0, p2}, Lo/dwr;->a(Landroid/content/Context;)Lo/dwe;

    move-result-object v0

    return-object v0
.end method

.method public b(JJILo/dvu;)V
    .locals 16

    .line 1080
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter dealSportMedal"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    invoke-virtual/range {p6 .. p6}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v13

    .line 1082
    invoke-virtual/range {p6 .. p6}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v14

    .line 1083
    invoke-virtual/range {p6 .. p6}, Lo/dvu;->C()I

    move-result v15

    .line 1084
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dwr;->c:Landroid/content/Context;

    move-wide/from16 v2, p1

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lo/dxc;->c(JZ)J

    move-result-wide v2

    move-wide/from16 v4, p3

    const/4 v6, 0x0

    invoke-static {v4, v5, v6}, Lo/dxc;->c(JZ)J

    move-result-wide v4

    move/from16 v6, p5

    new-instance v7, Lo/dwr$6;

    move-object/from16 v8, p0

    move/from16 v9, p5

    move v10, v15

    move-object v11, v13

    move-object v12, v14

    invoke-direct/range {v7 .. v12}, Lo/dwr$6;-><init>(Lo/dwr;IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface/range {v0 .. v7}, Lo/dti;->e(Landroid/content/Context;JJILo/duh;)V

    .line 1111
    return-void
.end method

.method public b(Lo/dui;)V
    .locals 2

    .line 458
    if-nez p1, :cond_0

    .line 459
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "registerObserver object maybe not create."

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    return-void

    .line 462
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->e(Lo/dui;)V

    .line 463
    return-void
.end method

.method public b(Lo/dwk;)V
    .locals 9

    .line 661
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter processMessageRemind messages"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    invoke-virtual {p1}, Lo/dwk;->k()Lo/dwa;

    move-result-object v3

    .line 663
    if-eqz v3, :cond_4

    .line 664
    invoke-virtual {v3}, Lo/dwa;->b()Ljava/util/List;

    move-result-object v4

    .line 665
    invoke-direct {p0, v4}, Lo/dwr;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 666
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMessageRemind messages:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    if-eqz v4, :cond_4

    .line 668
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvk;

    .line 669
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lo/dvk;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvk;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvk;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 670
    iget-object v0, p0, Lo/dwr;->n:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v6}, Lo/dvk;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvk;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v6}, Lo/dvk;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 672
    goto :goto_1

    .line 675
    :cond_2
    iget-object v0, p0, Lo/dwr;->n:Ljava/util/Map;

    invoke-interface {v0, v7, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 676
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 677
    invoke-virtual {v6}, Lo/dvk;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 678
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "new Version not deal level msg!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    goto/16 :goto_1

    .line 681
    :cond_3
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "com.huawei.pluginachievement.ui.AchieveMedalMessageDialog"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 683
    const-string v0, "message"

    invoke-virtual {v8, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 684
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 685
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 686
    goto/16 :goto_1

    .line 691
    :cond_4
    invoke-direct {p0}, Lo/dwr;->j()V

    .line 693
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 14

    .line 1208
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1209
    const-string v0, "medalID"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1210
    const/16 v0, 0x9

    invoke-virtual {p0, v0, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v5

    .line 1211
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1212
    const/4 v0, 0x0

    return v0

    .line 1214
    :cond_0
    instance-of v0, v5, Lo/dvu;

    if-eqz v0, :cond_2

    .line 1215
    move-object v6, v5

    check-cast v6, Lo/dvu;

    .line 1216
    invoke-virtual {v6}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v7

    .line 1217
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 1218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xf731400

    sub-long v8, v0, v2

    .line 1219
    invoke-virtual {v6}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v10

    .line 1220
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1221
    const/4 v0, 0x0

    return v0

    .line 1223
    :cond_1
    const-wide/16 v11, 0x0

    .line 1225
    :try_start_0
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v11, v0

    .line 1228
    goto :goto_0

    .line 1226
    :catch_0
    move-exception v13

    .line 1227
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "isNeedShow NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1229
    :goto_0
    cmp-long v0, v8, v11

    if-lez v0, :cond_2

    .line 1230
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "isNeedShow =false"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1231
    const/4 v0, 0x1

    return v0

    .line 1235
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c(ILjava/util/Map;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 265
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData(),params ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_0

    .line 267
    const-string v0, "huid"

    iget-object v1, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile.getHuid() ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 271
    const-string v0, "huid"

    const-string v1, "1"

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    :cond_1
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dwn;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/dvf;)Z
    .locals 3

    .line 245
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "updateData(),params"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 247
    const/4 v0, 0x0

    return v0

    .line 249
    :cond_0
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_1

    .line 251
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile.getHuid() ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 255
    :cond_1
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method public d()Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/dwr;->a:Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    return-object v0
.end method

.method public d(I)V
    .locals 7

    .line 1498
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1499
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_history_best_data"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1500
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1501
    new-instance v0, Ljava/sql/Timestamp;

    invoke-direct {v0, v3, v4}, Ljava/sql/Timestamp;-><init>(J)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1502
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateHistoryBestMsg() dataStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " todayStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1503
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1504
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "today allready send history best msg"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1505
    return-void

    .line 1509
    :cond_0
    iget v0, p0, Lo/dwr;->h:I

    if-gez v0, :cond_2

    .line 1510
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dwm;

    .line 1511
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lo/dwm;->e()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Lo/dwr;->h:I

    .line 1513
    :cond_2
    iget v0, p0, Lo/dwr;->h:I

    if-le p1, v0, :cond_3

    iget v0, p0, Lo/dwr;->h:I

    if-nez v0, :cond_4

    .line 1514
    :cond_3
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateHistoryBestMsg() not more than history best"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1515
    return-void

    .line 1517
    :cond_4
    const/4 v0, -0x1

    iput v0, p0, Lo/dwr;->h:I

    .line 1518
    invoke-direct {p0, p1, v3, v4}, Lo/dwr;->a(IJ)V

    .line 1519
    return-void
.end method

.method public d(ILjava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    invoke-static {p1}, Lo/dth;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    return-void

    .line 417
    :cond_0
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    if-eqz v0, :cond_6

    .line 418
    const/4 v0, 0x3

    if-eq v0, p1, :cond_1

    const/4 v0, 0x2

    if-eq v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const/4 v0, 0x4

    if-ne v0, p1, :cond_2

    .line 419
    :cond_1
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setiVersion(I)V

    goto :goto_0

    .line 420
    :cond_2
    const/16 v0, 0x8

    if-eq v0, p1, :cond_3

    const/16 v0, 0xb

    if-eq v0, p1, :cond_3

    const/16 v0, 0xc

    if-eq v0, p1, :cond_3

    const/16 v0, 0xd

    if-eq v0, p1, :cond_3

    const/16 v0, 0xe

    if-ne v0, p1, :cond_4

    .line 421
    :cond_3
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setiVersion(I)V

    goto :goto_0

    .line 422
    :cond_4
    const/4 v0, 0x1

    if-ne v0, p1, :cond_5

    .line 423
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setiVersion(I)V

    goto :goto_0

    .line 425
    :cond_5
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->setiVersion(I)V

    .line 427
    :goto_0
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dtv;->d(Landroid/content/Context;)Lo/dtv;

    move-result-object v0

    iget-object v1, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0, p1, v1, p2}, Lo/dtv;->c(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;)V

    .line 430
    :cond_6
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1118
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter generateMedalAndShowDialog!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1119
    new-instance v2, Lo/dvy;

    invoke-direct {v2}, Lo/dvy;-><init>()V

    .line 1120
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/dvy;->a(I)V

    .line 1121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1122
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dvy;->d(Ljava/lang/String;)V

    .line 1123
    invoke-virtual {v2, p1}, Lo/dvy;->b(Ljava/lang/String;)V

    .line 1124
    invoke-virtual {p0, v2}, Lo/dwr;->d(Lo/dvf;)Z

    .line 1126
    new-instance v5, Lo/dvk;

    invoke-direct {v5}, Lo/dvk;-><init>()V

    .line 1127
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/dvk;->d(I)V

    .line 1128
    invoke-virtual {v5, p2}, Lo/dvk;->a(Ljava/lang/String;)V

    .line 1129
    invoke-virtual {v5, p3}, Lo/dvk;->c(I)V

    .line 1130
    invoke-virtual {v5, p1}, Lo/dvk;->c(Ljava/lang/String;)V

    .line 1132
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 1133
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "com.huawei.pluginachievement.ui.AchieveMedalMessageDialog"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1134
    const-string v0, "message"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1135
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1136
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1138
    return-void
.end method

.method public d(Lo/dug;)V
    .locals 2

    .line 499
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 500
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "registermedalsObserver object maybe not create."

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    return-void

    .line 503
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->b(Lo/dug;)V

    .line 504
    return-void
.end method

.method public d(Lo/dui;)V
    .locals 2

    .line 471
    if-nez p1, :cond_0

    .line 472
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "unregisterObserver object maybe not create."

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    return-void

    .line 475
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->d(Lo/dui;)V

    .line 476
    return-void
.end method

.method public d(Lo/dwv;)V
    .locals 2

    .line 484
    if-nez p1, :cond_0

    .line 485
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "registerPersonalDataObserver object maybe not create."

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    return-void

    .line 488
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->e(Lo/dui;)V

    .line 489
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 5

    .line 1155
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1156
    const-string v0, "medalID"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1157
    const/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v2

    .line 1158
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 1159
    const/4 v0, 0x1

    return v0

    .line 1161
    :cond_0
    instance-of v0, v2, Lo/dvy;

    if-eqz v0, :cond_2

    .line 1162
    move-object v3, v2

    check-cast v3, Lo/dvy;

    .line 1163
    invoke-virtual {v3}, Lo/dvy;->g()I

    move-result v0

    if-lez v0, :cond_2

    .line 1164
    if-eqz p3, :cond_1

    .line 1165
    const/4 v0, 0x0

    return v0

    .line 1167
    :cond_1
    invoke-virtual {v3}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v4

    .line 1168
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1169
    const/4 v0, 0x0

    return v0

    .line 1174
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public d(Lo/dvf;)Z
    .locals 3

    .line 226
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "updateData(),params"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 228
    const/4 v0, 0x0

    return v0

    .line 230
    :cond_0
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_1

    .line 232
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile.getHuid() ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dvf;->setHuid(Ljava/lang/String;)V

    .line 235
    :cond_1
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->d(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method public e()V
    .locals 1

    .line 159
    invoke-direct {p0}, Lo/dwr;->C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 160
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 3

    .line 303
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter requestTextureRes return"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/due;->c(Landroid/content/Context;)Lo/due;

    move-result-object v2

    .line 308
    if-eqz v2, :cond_2

    .line 309
    invoke-virtual {v2}, Lo/due;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 310
    invoke-virtual {v2, p0}, Lo/due;->d(Lo/dwr;)V

    .line 312
    :cond_1
    invoke-virtual {v2, p1}, Lo/due;->b(Ljava/lang/String;)V

    .line 314
    :cond_2
    return-void
.end method

.method public e(Lo/dvu;JJ)V
    .locals 8

    .line 1065
    invoke-virtual {p1}, Lo/dvu;->j()I

    move-result v7

    .line 1066
    const/16 v0, 0xb

    if-eq v7, v0, :cond_0

    const/16 v0, 0xc

    if-eq v7, v0, :cond_0

    const/16 v0, 0xa

    if-ne v7, v0, :cond_1

    .line 1067
    :cond_0
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move v5, v7

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Lo/dwr;->b(JJILo/dvu;)V

    .line 1069
    :cond_1
    return-void
.end method

.method public f()Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 365
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 366
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 367
    const/16 v0, 0x8

    invoke-virtual {p0, v0, v4}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v5

    .line 368
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 369
    return-object v3

    .line 371
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 372
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 373
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dvf;

    .line 374
    instance-of v0, v8, Lo/dvy;

    if-eqz v0, :cond_1

    .line 375
    move-object v9, v8

    check-cast v9, Lo/dvy;

    .line 376
    invoke-virtual {v9}, Lo/dvy;->g()I

    move-result v0

    if-lez v0, :cond_1

    .line 377
    invoke-virtual {v9}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    const-wide/16 v10, 0x0

    .line 380
    :try_start_0
    invoke-virtual {v9}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v10, v0

    .line 383
    goto :goto_1

    .line 381
    :catch_0
    move-exception v12

    .line 382
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "getData() NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    :goto_1
    invoke-virtual {v9}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 388
    :cond_2
    invoke-static {v3, v6}, Lo/dyh;->a(Ljava/util/ArrayList;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v3

    .line 389
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData() gainList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    return-object v3
.end method

.method public g()V
    .locals 3

    .line 288
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter requestTextureRes return"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    return-void

    .line 292
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/due;->c(Landroid/content/Context;)Lo/due;

    move-result-object v2

    .line 293
    if-eqz v2, :cond_2

    .line 294
    invoke-virtual {v2}, Lo/due;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 295
    invoke-virtual {v2, p0}, Lo/due;->d(Lo/dwr;)V

    .line 297
    :cond_1
    invoke-virtual {v2}, Lo/due;->d()V

    .line 299
    :cond_2
    return-void
.end method

.method public h()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 396
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x5

    invoke-virtual {p0, v1, v0}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 398
    if-nez v3, :cond_0

    .line 399
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0

    .line 401
    :cond_0
    move-object v4, v3

    check-cast v4, Lo/dvh;

    .line 402
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 403
    const-string v0, "timestamp"

    invoke-virtual {v4}, Lo/dvh;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    return-object v5
.end method

.method public i()V
    .locals 3

    .line 319
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter requestTextureRes"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter requestTextureRes return"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    return-void

    .line 324
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duc;->c(Landroid/content/Context;)Lo/duc;

    move-result-object v2

    .line 325
    if-eqz v2, :cond_2

    .line 326
    invoke-virtual {v2}, Lo/duc;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 327
    invoke-virtual {v2, p0}, Lo/duc;->e(Lo/dwr;)V

    .line 329
    :cond_1
    invoke-virtual {v2}, Lo/duc;->b()V

    .line 331
    :cond_2
    return-void
.end method

.method public k()V
    .locals 3

    .line 335
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v2

    .line 336
    if-nez v2, :cond_0

    .line 337
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "getTotalSteps is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    return-void

    .line 340
    :cond_0
    new-instance v0, Lo/dwr$4;

    invoke-direct {v0, p0}, Lo/dwr$4;-><init>(Lo/dwr;)V

    invoke-interface {v2, v0}, Lo/dti;->d(Lo/duh;)V

    .line 356
    return-void
.end method

.method public l()V
    .locals 1

    .line 511
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwn;->c()V

    .line 512
    return-void
.end method

.method public m()V
    .locals 7

    .line 803
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "popAchieveDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 805
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "popAchieveDialog() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    return-void

    .line 808
    :cond_0
    invoke-direct {p0}, Lo/dwr;->C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 809
    new-instance v3, Lo/dwt;

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/dwt;-><init>(Landroid/content/Context;)V

    .line 810
    new-instance v4, Lo/dwz;

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    iget-boolean v1, p0, Lo/dwr;->g:Z

    invoke-direct {v4, v0, v1}, Lo/dwz;-><init>(Landroid/content/Context;Z)V

    .line 811
    new-instance v5, Lo/dws;

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/dws;-><init>(Landroid/content/Context;)V

    .line 812
    invoke-virtual {p0, v4}, Lo/dwr;->b(Lo/dui;)V

    .line 813
    invoke-virtual {p0, v3}, Lo/dwr;->b(Lo/dui;)V

    .line 814
    invoke-virtual {p0, v5}, Lo/dwr;->b(Lo/dui;)V

    .line 816
    invoke-virtual {p0}, Lo/dwr;->n()V

    .line 817
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 818
    invoke-virtual {p0}, Lo/dwr;->h()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 819
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 820
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwu;->e(Landroid/content/Context;)Lo/dwu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwu;->c()V

    .line 821
    const/16 v0, 0xb

    invoke-virtual {p0, v0, v6}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 822
    const/16 v0, 0xd

    invoke-virtual {p0, v0, v6}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 823
    invoke-direct {p0}, Lo/dwr;->B()V

    .line 825
    invoke-direct {p0}, Lo/dwr;->D()V

    .line 827
    invoke-direct {p0}, Lo/dwr;->A()V

    .line 828
    invoke-virtual {p0}, Lo/dwr;->k()V

    .line 830
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->f()V

    .line 831
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_medalPngStatusDownloadDoing"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 832
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "generateMedalTime"

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 834
    return-void
.end method

.method public n()V
    .locals 7

    .line 844
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 846
    return-void

    .line 848
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "clearReportContent"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 849
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 850
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter clearReportData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 851
    new-instance v4, Lo/dwm;

    invoke-direct {v4}, Lo/dwm;-><init>()V

    .line 852
    new-instance v5, Lo/dwj;

    invoke-direct {v5}, Lo/dwj;-><init>()V

    .line 853
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_1

    .line 854
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile.getHuid() ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 855
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dwm;->setHuid(Ljava/lang/String;)V

    .line 856
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dwn;->e(Lo/dvf;)Z

    .line 857
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwn;->e(Lo/dvf;)Z

    .line 858
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "clearReportContent"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 860
    :cond_1
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "clearReportData mUserProfile is null"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 862
    :goto_0
    goto/16 :goto_2

    .line 863
    :cond_2
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "clearReportOverSea"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 864
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 865
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "enter clearReportData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    new-instance v5, Lo/dwm;

    invoke-direct {v5}, Lo/dwm;-><init>()V

    .line 867
    new-instance v6, Lo/dwj;

    invoke-direct {v6}, Lo/dwj;-><init>()V

    .line 868
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    if-eqz v0, :cond_3

    .line 869
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUserProfile.getHuid() ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 870
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->setHuid(Ljava/lang/String;)V

    .line 871
    iget-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dwj;->setHuid(Ljava/lang/String;)V

    .line 872
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwn;->e(Lo/dvf;)Z

    .line 873
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dwn;->e(Lo/dvf;)Z

    .line 874
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "clearReportOverSea"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 876
    :cond_3
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "clearReportData mUserProfile is null"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 878
    :goto_1
    goto :goto_2

    .line 879
    :cond_4
    return-void

    .line 882
    :goto_2
    return-void
.end method

.method public o()V
    .locals 3

    .line 784
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "registerAchieveMentReciever() enter"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 785
    new-instance v0, Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

    invoke-direct {v0}, Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;-><init>()V

    iput-object v0, p0, Lo/dwr;->d:Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

    .line 786
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    iget-object v1, p0, Lo/dwr;->d:Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

    const-string v2, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v0, v1, v2}, Lo/duk;->registerBroadcast(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V

    .line 787
    invoke-direct {p0}, Lo/dwr;->w()V

    .line 788
    return-void
.end method

.method public p()V
    .locals 2

    .line 791
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "noticeAchieveDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 792
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 793
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "popAchieveDialog() Context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 794
    return-void

    .line 796
    :cond_0
    invoke-direct {p0}, Lo/dwr;->C()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dwr;->e:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 797
    return-void
.end method

.method public q()V
    .locals 8

    .line 1244
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateAchieveMessage()\uff1a"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1245
    new-instance v3, Lo/dwz;

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    iget-boolean v1, p0, Lo/dwr;->g:Z

    invoke-direct {v3, v0, v1}, Lo/dwz;-><init>(Landroid/content/Context;Z)V

    .line 1246
    const/4 v0, -0x1

    iput v0, p0, Lo/dwr;->i:I

    .line 1247
    const/4 v0, -0x1

    iput v0, p0, Lo/dwr;->f:I

    .line 1248
    invoke-virtual {p0, v3}, Lo/dwr;->b(Lo/dui;)V

    .line 1250
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1251
    const-string v0, "reportNo"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1252
    const/4 v0, 0x3

    invoke-virtual {p0, v0, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dwh;

    .line 1253
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1254
    const-string v0, "reportNo"

    const-string v1, "0"

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1255
    const/4 v0, 0x4

    invoke-virtual {p0, v0, v6}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dwd;

    .line 1256
    if-eqz v5, :cond_0

    .line 1257
    invoke-virtual {v5}, Lo/dwh;->b()I

    move-result v0

    iput v0, p0, Lo/dwr;->i:I

    .line 1258
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateReportMessage() localWeekReportNo = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dwr;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1260
    :cond_0
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateReportMessage() weekRecord is null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1261
    const/4 v0, 0x0

    iput v0, p0, Lo/dwr;->i:I

    .line 1263
    :goto_0
    if-eqz v7, :cond_1

    .line 1264
    invoke-virtual {v7}, Lo/dwd;->a()I

    move-result v0

    iput v0, p0, Lo/dwr;->f:I

    .line 1265
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateReportMessage() localMonthReportNo = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dwr;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1267
    :cond_1
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "generateReportMessage() monthRecord is null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1268
    const/4 v0, 0x0

    iput v0, p0, Lo/dwr;->f:I

    .line 1271
    :goto_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 1272
    return-void
.end method

.method public r()V
    .locals 3

    .line 885
    new-instance v2, Lo/dwz;

    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Lo/dwz;-><init>(Landroid/content/Context;Z)V

    .line 886
    invoke-virtual {p0, v2}, Lo/dwr;->b(Lo/dui;)V

    .line 888
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 889
    return-void
.end method

.method public s()V
    .locals 9

    .line 967
    invoke-direct {p0}, Lo/dwr;->G()Z

    move-result v0

    if-nez v0, :cond_0

    .line 968
    return-void

    .line 971
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->f()V

    .line 972
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 973
    const/16 v0, 0x9

    invoke-virtual {p0, v0, v2}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 974
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    .line 975
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 976
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    .line 977
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvf;

    .line 978
    instance-of v0, v6, Lo/dvu;

    if-eqz v0, :cond_2

    .line 979
    move-object v7, v6

    check-cast v7, Lo/dvu;

    .line 980
    invoke-virtual {v7}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v8

    .line 981
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 982
    goto :goto_1

    .line 984
    :cond_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 985
    sget-object v0, Lo/dwr;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dwr$3;

    invoke-direct {v1, p0, v7}, Lo/dwr$3;-><init>(Lo/dwr;Lo/dvu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 976
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 994
    :cond_3
    return-void
.end method

.method public t()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1183
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1184
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1185
    const/16 v0, 0x8

    invoke-virtual {p0, v0, v2}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 1186
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 1187
    return-object v1

    .line 1189
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 1190
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    .line 1191
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvf;

    .line 1192
    instance-of v0, v6, Lo/dvy;

    if-eqz v0, :cond_1

    .line 1193
    move-object v7, v6

    check-cast v7, Lo/dvy;

    .line 1194
    invoke-virtual {v7}, Lo/dvy;->g()I

    move-result v0

    if-lez v0, :cond_1

    .line 1195
    invoke-virtual {v7}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1190
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1199
    :cond_2
    return-object v1
.end method

.method public u()V
    .locals 2

    .line 960
    sget-object v0, Lo/dwr;->o:Lo/dwr;

    iget-object v1, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dwq;->a(Lo/dwr;Landroid/content/Context;)V

    .line 961
    return-void
.end method

.method public x()V
    .locals 7

    .line 1280
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1282
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_datastr"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1283
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1284
    new-instance v0, Ljava/sql/Timestamp;

    invoke-direct {v0, v3, v4}, Ljava/sql/Timestamp;-><init>(J)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1285
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateKakaMessage() dataStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " todayStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1286
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1288
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_datastr"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1289
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_flag"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1290
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_calorie"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1291
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_kaka"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1295
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1296
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    new-instance v1, Lo/dwr$9;

    invoke-direct {v1, p0, v3, v4}, Lo/dwr$9;-><init>(Lo/dwr;J)V

    iget-object v2, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-interface {v0, v1, v2}, Lo/dti;->b(Lo/duh;Landroid/content/Context;)V

    .line 1307
    :cond_1
    return-void
.end method

.method public y()V
    .locals 7

    .line 1450
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1453
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    const-string v1, "_achieve_history_best_data"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1454
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1455
    new-instance v0, Ljava/sql/Timestamp;

    invoke-direct {v0, v3, v4}, Ljava/sql/Timestamp;-><init>(J)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1456
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generateHistoryBestMsg() dataStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " todayStr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1457
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1458
    sget-object v0, Lo/dwr;->b:Ljava/lang/String;

    const-string v1, "today allready send history best msg"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1459
    return-void

    .line 1464
    :cond_0
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1465
    iget-object v0, p0, Lo/dwr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    new-instance v1, Lo/dwr$7;

    invoke-direct {v1, p0, v3, v4}, Lo/dwr$7;-><init>(Lo/dwr;J)V

    invoke-interface {v0, v1}, Lo/dti;->d(Lo/duh;)V

    .line 1477
    :cond_1
    return-void
.end method
