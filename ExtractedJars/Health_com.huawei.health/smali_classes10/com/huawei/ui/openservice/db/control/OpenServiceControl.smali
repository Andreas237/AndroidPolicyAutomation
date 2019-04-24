.class public Lcom/huawei/ui/openservice/db/control/OpenServiceControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/db/control/OpenServiceControl$Instance;
    }
.end annotation


# static fields
.field private static final IS_USER_HOMEPAGE_EDITED:Ljava/lang/String; = "IfUserHomepageEdited"

.field private static final LOG_TAG:Ljava/lang/String; = "Opera_OpenServiceControl"

.field private static final SP:Ljava/lang/String; = "OpenServiceControl"

.field private static final WHITE_SERVICE_ID:Ljava/lang/String; = "white_service"

.field private static mContext:Landroid/content/Context; = null

.field private static final urlWhiteList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private childServiceDBManager:Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;

.field private filePath:Ljava/lang/String;

.field private iconPath:Ljava/lang/String;

.field private securityUrlManager:Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

.field private serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

.field private serviceTypeManager:Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

.field private userHomePageServiceManager:Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;

.field private userServiceAuthManager:Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    .line 55
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    const-string v1, "https://healthactivity.hicloud.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    const-string v1, "https://healthrecommend.hicloud.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    const-string v1, "https://achievement.hicloud.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    const-string v1, "https://health.vmall.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    const-string v1, "https://resourcephs1.vmall.com/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    const-string v1, "http://hwlf.hwcloudtest.cn:10180/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_0
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    .line 69
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceTypeManager:Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

    .line 70
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userHomePageServiceManager:Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;

    .line 71
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->securityUrlManager:Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

    .line 72
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userServiceAuthManager:Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;

    .line 73
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->childServiceDBManager:Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

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

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->filePath:Ljava/lang/String;

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "res"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->iconPath:Ljava/lang/String;

    .line 76
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/openservice/db/control/OpenServiceControl$1;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;-><init>()V

    return-void
.end method

.method private addIconPathPreToList(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 452
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addIconPathPreToList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 454
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 455
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/OpenService;->getHomePageIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceMidIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 458
    invoke-virtual {v5, v6}, Lcom/huawei/ui/openservice/db/model/OpenService;->setServiceIcon(Ljava/lang/String;)V

    .line 459
    invoke-virtual {v5, v7}, Lcom/huawei/ui/openservice/db/model/OpenService;->setHomePageIcon(Ljava/lang/String;)V

    .line 460
    invoke-virtual {v5, v8}, Lcom/huawei/ui/openservice/db/model/OpenService;->setServiceMidIcon(Ljava/lang/String;)V

    .line 461
    goto :goto_0

    .line 462
    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    return-void

    .line 463
    :cond_4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/openservice/db/model/ChildService;

    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/ChildService;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 465
    invoke-virtual {v5, v6}, Lcom/huawei/ui/openservice/db/model/ChildService;->setImageUrl(Ljava/lang/String;)V

    .line 466
    goto :goto_1

    .line 467
    :cond_5
    return-void
.end method

.method private checkServiceData(Ljava/util/List;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)Z"
        }
    .end annotation

    .line 409
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 410
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 412
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 413
    if-nez v2, :cond_2

    const/4 v0, 0x0

    return v0

    .line 414
    :cond_2
    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->checkData()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    return v0

    .line 415
    :cond_3
    goto :goto_0

    .line 416
    :cond_4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    .line 417
    if-nez v2, :cond_5

    const/4 v0, 0x0

    return v0

    .line 418
    :cond_5
    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    return v0

    .line 419
    :cond_6
    goto :goto_1

    .line 420
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method private checkServiceIDExist(Ljava/lang/String;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)Z"
        }
    .end annotation

    .line 444
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 445
    if-nez v2, :cond_0

    goto :goto_0

    .line 446
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 447
    :cond_1
    goto :goto_0

    .line 448
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;
    .locals 1

    .line 86
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    .line 87
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl$Instance;->instance:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    return-object v0
.end method

.method private getLegalCloudService(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation

    .line 424
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 425
    :cond_0
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewServiceComes empty cloud service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    const/4 v0, 0x0

    return-object v0

    .line 428
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 429
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 430
    if-nez v6, :cond_2

    goto :goto_0

    .line 431
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/ui/openservice/db/model/OpenService;->isDateLegal()Z

    move-result v0

    if-nez v0, :cond_3

    .line 432
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLegalCloudService cloud service is not right date ! date is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 433
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " start day is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 434
    invoke-virtual {v6}, Lcom/huawei/ui/openservice/db/model/OpenService;->getStartDate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " end day is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 435
    invoke-virtual {v6}, Lcom/huawei/ui/openservice/db/model/OpenService;->getEndDate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 432
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    goto :goto_0

    .line 438
    :cond_3
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    goto :goto_0

    .line 440
    :cond_4
    return-object v4
.end method

.method private declared-synchronized initHomePageOrder(Ljava/lang/String;)V
    .locals 6

    monitor-enter p0

    .line 394
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->isUserHomepageEdited(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 395
    :cond_0
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHomePageOrder new homePage comes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initServiceListConfig()Lcom/huawei/ui/openservice/db/model/ServiceListConfig;

    move-result-object v4

    .line 397
    if-nez v4, :cond_1

    monitor-exit p0

    return-void

    .line 398
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getServiceHomePageCard()Ljava/util/List;

    move-result-object v5

    .line 399
    if-nez v5, :cond_2

    .line 400
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHomePageOrder error homePage data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    monitor-exit p0

    return-void

    .line 403
    :cond_2
    invoke-static {v5, p1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setHuidToList(Ljava/util/List;Ljava/lang/String;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userHomePageServiceManager:Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;

    invoke-virtual {v0, p1, v5}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->refreshOrders(Ljava/lang/String;Ljava/util/List;)Z

    .line 405
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->setIsUserHomepageEdited(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 406
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private initOpenServiceDBDefault()V
    .locals 10

    .line 159
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/SpUtil;->isUpgrade(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 160
    return-void

    .line 162
    :cond_0
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start initOpenServiceDBDefault"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/db/SpUtil;->setUpgrade(Landroid/content/Context;Z)V

    .line 164
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initSecurityURLConfig()Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;

    move-result-object v4

    .line 165
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initServiceListConfig()Lcom/huawei/ui/openservice/db/model/ServiceListConfig;

    move-result-object v5

    .line 166
    if-eqz v5, :cond_1

    if-nez v4, :cond_2

    .line 167
    :cond_1
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOpenServiceDBDefault data error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void

    .line 170
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getServiceList()Ljava/util/List;

    move-result-object v6

    .line 171
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->getSecurityURL()Ljava/util/List;

    move-result-object v7

    .line 172
    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getChildServiceList()Ljava/util/List;

    move-result-object v8

    .line 173
    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getServiceTypeList()Ljava/util/List;

    move-result-object v9

    .line 174
    invoke-direct {p0, v6, v9}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->checkServiceData(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 175
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOpenServiceDBDefault check data error !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    return-void

    .line 178
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->iconPath:Ljava/lang/String;

    invoke-direct {p0, v6, v8, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->addIconPathPreToList(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceTypeManager:Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

    invoke-virtual {v0, v9}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->refreshAllTypes(Ljava/util/List;)Z

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->refreshAllService(Ljava/util/List;)Z

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->securityUrlManager:Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

    invoke-virtual {v0, v7}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->refreshUrls(Ljava/util/List;)Z

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->childServiceDBManager:Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;

    invoke-virtual {v0, v8}, Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;->refreshAllService(Ljava/util/List;)Z

    .line 183
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->refreshVersion(Lcom/huawei/ui/openservice/db/model/ServiceListConfig;)V

    .line 184
    return-void
.end method

.method private initSecurityURLConfig()Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;
    .locals 7

    .line 369
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecurityURLConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    const-string v4, ""

    .line 371
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecurityURLConfig beta \u6d4b\u8bd5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    const-string v1, "SecurityURLConfig.txt"

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getBetaFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 376
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SecurityURLConfig.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getStringFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 378
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 379
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecurityURLConfig str is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    const/4 v0, 0x0

    return-object v0

    .line 382
    :cond_1
    const/4 v5, 0x0

    .line 384
    :try_start_0
    const-class v0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;

    invoke-static {v4, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v5, v0

    .line 389
    goto :goto_1

    .line 385
    :catch_0
    move-exception v6

    .line 386
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecurityURLConfig JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    goto :goto_1

    .line 387
    :catch_1
    move-exception v6

    .line 388
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecurityURLConfig error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :goto_1
    return-object v5
.end method

.method private initServiceListConfig()Lcom/huawei/ui/openservice/db/model/ServiceListConfig;
    .locals 7

    .line 344
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initServiceListConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const-string v4, ""

    .line 346
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 348
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initServiceListConfig beta \u6d4b\u8bd5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    const-string v1, "ServiceListConfig.txt"

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getBetaFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 351
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ServiceListConfig.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getStringFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 353
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initServiceListConfig str is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x0

    return-object v0

    .line 357
    :cond_1
    const/4 v5, 0x0

    .line 359
    :try_start_0
    const-class v0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;

    invoke-static {v4, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v5, v0

    .line 364
    goto :goto_1

    .line 360
    :catch_0
    move-exception v6

    .line 361
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initServiceListConfig JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    goto :goto_1

    .line 362
    :catch_1
    move-exception v6

    .line 363
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initServiceListConfig error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    :goto_1
    return-object v5
.end method

.method private isNewServiceComes(Ljava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)Z"
        }
    .end annotation

    .line 321
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewServiceComes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getLegalCloudService(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 323
    invoke-static {v4}, Lcom/huawei/ui/openservice/db/model/OpenService;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewServiceComes no legal date cloud service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    const/4 v0, 0x0

    return v0

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->queryUserLegalService()Ljava/util/List;

    move-result-object v5

    .line 328
    invoke-static {v5}, Lcom/huawei/ui/openservice/db/model/OpenService;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 329
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewServiceComes no legal date local service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    const/4 v0, 0x1

    return v0

    .line 332
    :cond_1
    const/4 v6, 0x0

    .line 333
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 334
    invoke-virtual {v8}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->checkServiceIDExist(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 335
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewServiceComes new service comes , service is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    const/4 v6, 0x1

    .line 337
    goto :goto_1

    .line 339
    :cond_2
    goto :goto_0

    .line 340
    :cond_3
    :goto_1
    return v6
.end method

.method private isUserHomepageEdited(Ljava/lang/String;)Z
    .locals 4

    .line 470
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IfUserHomepageEdited"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 471
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    const-string v1, "OpenServiceControl"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private setIsUserHomepageEdited(Ljava/lang/String;Z)V
    .locals 4

    .line 475
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IfUserHomepageEdited"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 476
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    const-string v1, "OpenServiceControl"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v3, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 477
    return-void
.end method


# virtual methods
.method public checkUrlAuth(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 267
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    :cond_0
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlAuth error input"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    const/4 v0, 0x0

    return v0

    .line 272
    :cond_1
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 273
    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 274
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlAuth white list url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    const/4 v0, 0x1

    return v0

    .line 277
    :cond_2
    goto :goto_0

    .line 278
    :cond_3
    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 279
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 280
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlAuth error serviceID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    const/4 v0, 0x0

    return v0

    .line 283
    :cond_4
    const-string v0, "white_service"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 284
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlAuth white list url serviceID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const/4 v0, 0x1

    return v0

    .line 287
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userServiceAuthManager:Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;

    invoke-virtual {v0, p2, v4}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->queryAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v5

    .line 288
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    if-nez v0, :cond_7

    .line 289
    :cond_6
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlAuth the url has not auth! url is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", serviceID is"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    const/4 v0, 0x0

    return v0

    .line 292
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public checkWhiteUrl(Ljava/lang/String;)Z
    .locals 6

    .line 302
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWhiteUrl error input"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const/4 v0, 0x0

    return v0

    .line 306
    :cond_0
    sget-object v0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->urlWhiteList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 307
    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWhiteUrl white list url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v0, 0x1

    return v0

    .line 311
    :cond_1
    goto :goto_0

    .line 312
    :cond_2
    const-string v0, "white_service"

    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 313
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWhiteUrl white list url serviceID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    const/4 v0, 0x1

    return v0

    .line 316
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 242
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceIdByUrl error url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const/4 v0, 0x0

    return-object v0

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->securityUrlManager:Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->queryAllUrl()Ljava/util/List;

    move-result-object v4

    .line 247
    invoke-static {v4}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 248
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceIdByUrl empty SecurityURL list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const/4 v0, 0x0

    return-object v0

    .line 251
    :cond_1
    const/4 v5, 0x0

    .line 252
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/openservice/db/model/SecurityURL;

    .line 253
    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getUrl()Ljava/lang/String;

    move-result-object v8

    .line 254
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 255
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceIdByUrl empty url, error is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getServiceID()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    goto :goto_0

    .line 258
    :cond_2
    invoke-virtual {p1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 259
    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getServiceID()Ljava/lang/String;

    move-result-object v5

    .line 260
    goto :goto_1

    .line 262
    :cond_3
    goto :goto_0

    .line 263
    :cond_4
    :goto_1
    return-object v5
.end method

.method public getServiceList(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceTypeManager:Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->queryAllTypes()Ljava/util/List;

    move-result-object v4

    .line 93
    invoke-static {v4}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceList no types get !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 97
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->orderGroupService(Ljava/util/List;)V

    .line 98
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 100
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->queryUserLegalServiceByTypeWithoutSomeIDs(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 102
    invoke-static {v8}, Lcom/huawei/ui/openservice/db/model/OpenService;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceList this type get no service ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeID()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    goto :goto_1

    .line 106
    :cond_1
    invoke-virtual {v7, v8}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setOpenServiceList(Ljava/util/List;)V

    .line 107
    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->orderSubService()V

    .line 108
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 110
    :cond_2
    return-object v5
.end method

.method public initHomePageService(Ljava/lang/String;)V
    .locals 1

    .line 120
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initOpenServiceDBDefault()V

    .line 121
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 122
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initHomePageOrder(Ljava/lang/String;)V

    .line 123
    return-void
.end method

.method public initOpenServiceDB(Ljava/lang/String;)I
    .locals 11

    .line 127
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOpenServiceDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 129
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initServiceListConfig()Lcom/huawei/ui/openservice/db/model/ServiceListConfig;

    move-result-object v4

    .line 130
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initSecurityURLConfig()Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;

    move-result-object v5

    .line 131
    if-eqz v4, :cond_1

    if-nez v5, :cond_2

    .line 132
    :cond_1
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOpenServiceDB data error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->getSecurityURL()Ljava/util/List;

    move-result-object v6

    .line 136
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getServiceList()Ljava/util/List;

    move-result-object v7

    .line 137
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getServiceTypeList()Ljava/util/List;

    move-result-object v8

    .line 138
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getChildServiceList()Ljava/util/List;

    move-result-object v9

    .line 139
    invoke-direct {p0, v7, v8}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->checkServiceData(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 140
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check data error !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/4 v0, 0x0

    return v0

    .line 143
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->iconPath:Ljava/lang/String;

    invoke-direct {p0, v7, v9, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->addIconPathPreToList(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 144
    const/4 v10, 0x1

    .line 145
    invoke-direct {p0, v7}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->isNewServiceComes(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 146
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOpenServiceDB new service comes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v10, 0x2

    .line 149
    :cond_4
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initHomePageOrder(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceTypeManager:Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

    invoke-virtual {v0, v8}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->refreshAllTypes(Ljava/util/List;)Z

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v0, v7}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->refreshAllService(Ljava/util/List;)Z

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->childServiceDBManager:Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;

    invoke-virtual {v0, v9}, Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;->refreshAllService(Ljava/util/List;)Z

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->securityUrlManager:Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->refreshUrls(Ljava/util/List;)Z

    .line 154
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;

    sget-object v1, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->refreshVersion(Lcom/huawei/ui/openservice/db/model/ServiceListConfig;)V

    .line 155
    return v10
.end method

.method public insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userServiceAuthManager:Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->insertOrUpdate(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    move-result v0

    return v0
.end method

.method public queryAllService()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->queryUserLegalService()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryGroupTypes()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;"
        }
    .end annotation

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceTypeManager:Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->queryAllTypes()Ljava/util/List;

    move-result-object v1

    .line 297
    if-nez v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 298
    :cond_0
    return-object v1
.end method

.method public queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;
    .locals 4

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userServiceAuthManager:Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->queryAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v2

    .line 225
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 226
    return-object v2

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v0, p2}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->queryUserLegalServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;

    move-result-object v3

    .line 230
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceSource()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceSource()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HUAWEI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    new-instance v2, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    const/4 v0, 0x1

    invoke-direct {v2, p1, p2, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userServiceAuthManager:Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->insertOrUpdate(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 234
    :cond_1
    return-object v2
.end method

.method public queryServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->serviceManager:Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceDBManager;->queryUserLegalServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;

    move-result-object v0

    return-object v0
.end method

.method public queryServiceByLocation(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->childServiceDBManager:Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/manager/ChildServiceDBManager;->queryUserLegalLocation(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryUrlList(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->securityUrlManager:Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->queryUrlList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 206
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 207
    invoke-static {v1}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v2

    .line 208
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/openservice/db/model/SecurityURL;

    .line 209
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 210
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    goto :goto_0

    .line 212
    :cond_2
    return-object v2
.end method

.method public refreshHomePageOrders(Ljava/lang/String;Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;)V
    .locals 9

    .line 188
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    return-void

    .line 189
    :cond_1
    const-string v0, "Opera_OpenServiceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshHomePageOrders"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 191
    const/4 v5, 0x0

    .line 192
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getOpenServiceList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 193
    invoke-virtual {p2}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getOpenServiceList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 194
    if-nez v7, :cond_2

    goto :goto_1

    .line 195
    :cond_2
    new-instance v8, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    invoke-direct {v8}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;-><init>()V

    .line 196
    invoke-virtual {v8, p1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setHuid(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v7}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setServiceID(Ljava/lang/String;)V

    .line 198
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setPosition(I)V

    .line 199
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 201
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->userHomePageServiceManager:Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;

    invoke-virtual {v0, p1, v4}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->refreshOrders(Ljava/lang/String;Ljava/util/List;)Z

    .line 202
    return-void
.end method
