.class public Lo/ahu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 60
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "a8ba095d-4123-43c4-a30a-0240011c58de"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/ahu;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 443
    const/4 v4, 0x0

    .line 444
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "devUserInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 446
    const/4 v0, 0x0

    return-object v0

    .line 449
    :cond_0
    const-string v0, "\\|"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 450
    const/4 v0, 0x2

    aget-object v4, v5, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 454
    goto :goto_0

    .line 451
    :catch_0
    move-exception v5

    .line 452
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "devUserInfo split error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 453
    const/4 v0, 0x0

    return-object v0

    .line 455
    :goto_0
    return-object v4
.end method

.method public static a()V
    .locals 8

    .line 298
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 299
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 301
    :cond_0
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPressureCalibrateList deviceIdList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 302
    return-void

    .line 304
    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 305
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 306
    invoke-static {v6}, Lo/ajq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 307
    invoke-static {v6, v7}, Lo/ahu;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 310
    :cond_2
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .line 235
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 81
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMetricOrImperialUnit deviceid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void

    .line 85
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v4

    .line 86
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current setting unit is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 87
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;-><init>()V

    .line 88
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 89
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;-><init>()V

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v7, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->data:Ljava/util/Map;

    .line 91
    if-eqz v4, :cond_1

    .line 92
    iget-object v0, v7, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->data:Ljava/util/Map;

    const-string v1, "weightUnit"

    const-string v2, "2"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 94
    :cond_1
    iget-object v0, v7, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->data:Ljava/util/Map;

    const-string v1, "weightUnit"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :goto_0
    const-string v0, "setDevParam"

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    .line 97
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDeviceServiceInfo(Ljava/util/List;)V

    .line 99
    invoke-virtual {v5, p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDevId(Ljava/lang/String;)V

    .line 100
    invoke-static {p0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahu$1;

    invoke-direct {v1, p0, p1}, Lo/ahu$1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v5, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V

    .line 117
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 365
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 366
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 368
    :cond_0
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceIdList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 369
    return-void

    .line 371
    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 372
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lo/ahu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 375
    :cond_2
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 378
    const-string v2, ""

    .line 379
    const-string v0, "huawei"

    invoke-static {p0}, Lo/ahu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    const-string v2, "huawei"

    goto :goto_0

    .line 381
    :cond_0
    const-string v0, "honor"

    invoke-static {p0}, Lo/ahu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    const-string v2, "honor"

    .line 384
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "wifi_devuserinfo_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 385
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;-><init>()V

    .line 386
    invoke-virtual {v4, p0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 387
    const-string v0, "devUserInfo"

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setSid(Ljava/lang/String;)V

    .line 388
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahu$4;

    invoke-direct {v1, p1, v3}, Lo/ahu$4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V

    .line 414
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 529
    invoke-static {p0}, Lo/ajq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 530
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 531
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get productId error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 532
    const/4 v0, 0x0

    return-object v0

    .line 534
    :cond_0
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 536
    const-string v0, "huawei"

    return-object v0

    .line 537
    :cond_1
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 539
    const-string v0, "honor"

    return-object v0

    .line 541
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 316
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPressureCalibrateList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pressure_calibrate_hrv_userinfo_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 318
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 319
    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 318
    invoke-static {v0, v1, v4}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 320
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 321
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPressureCalibrateList hrvUserInfo is not empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 322
    return-void

    .line 324
    :cond_0
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, ""

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 325
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;-><init>()V

    .line 326
    invoke-virtual {v7, p0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 327
    const-string v0, "devResult"

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setSid(Ljava/lang/String;)V

    .line 328
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahu$5;

    invoke-direct {v1, v6, v4}, Lo/ahu$5;-><init>([Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V

    .line 354
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 423
    const-string v2, ""

    .line 424
    const-string v0, "huawei"

    invoke-static {p0}, Lo/ahu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 425
    const-string v2, "huawei"

    goto :goto_0

    .line 426
    :cond_0
    const-string v0, "honor"

    invoke-static {p0}, Lo/ahu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 427
    const-string v2, "honor"

    .line 429
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "wifi_devuserinfo_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 430
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 432
    return-object v4
.end method

.method public static c()V
    .locals 11

    .line 507
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "confirmDevUserinfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 509
    const-string v4, "userInfo1"

    .line 510
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 511
    invoke-static {v4, v5}, Lo/ahu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v6

    .line 514
    const/4 v7, 0x1

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 515
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/acu;

    .line 516
    invoke-virtual {v8}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v9

    .line 517
    invoke-virtual {v8}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v10

    .line 518
    invoke-static {v9, v10}, Lo/ahu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 521
    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 357
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->f(Ljava/lang/String;)Z

    .line 358
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
    .locals 6

    .line 484
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 485
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWiFiDeviceDialog context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 486
    return-void

    .line 488
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 489
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWiFiDeviceDialog deviceid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 490
    invoke-static {p0, p1}, Lo/ahu;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 493
    :cond_1
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 494
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_device_does_not_exist:I

    invoke-virtual {v4, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 495
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v4, v0, p2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 496
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bind_device:I

    invoke-virtual {v4, v0, p3}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 497
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 498
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 499
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 500
    return-void
.end method

.method public static d(Ljava/util/Map;Ljava/lang/String;Landroid/content/Context;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Landroid/content/Context;)V"
        }
    .end annotation

    .line 238
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 239
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo userInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 240
    return-void

    .line 242
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 243
    const-string v0, "uid"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 244
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo main user UUID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/act;->a:Lo/act;

    invoke-virtual {v2}, Lo/act;->d()Lo/acu;

    move-result-object v2

    invoke-virtual {v2}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 245
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    :cond_1
    const-string v0, "uid"

    const-string v1, "0"

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 249
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 250
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0, p1, p2}, Lo/ahu;->e(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 249
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    goto :goto_1

    .line 253
    :cond_4
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo not bind wifi device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :goto_1
    return-void
.end method

.method public static d()Z
    .locals 1

    .line 178
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 465
    const/4 v4, 0x0

    .line 466
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 467
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "devUserInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const/4 v0, 0x0

    return-object v0

    .line 471
    :cond_0
    const-string v0, "\\|"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 472
    const/4 v0, 0x3

    aget-object v4, v5, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 476
    goto :goto_0

    .line 473
    :catch_0
    move-exception v5

    .line 474
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "devUserInfo split error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 475
    const/4 v0, 0x0

    return-object v0

    .line 477
    :goto_0
    return-object v4
.end method

.method public static e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation

    .line 185
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 197
    return-object v0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 6

    .line 68
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 69
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 71
    :cond_0
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMetricOrImperialUnit deviceIdList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 72
    return-void

    .line 74
    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 75
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lo/ahu;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 74
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 78
    :cond_2
    return-void
.end method

.method public static e(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V"
        }
    .end annotation

    .line 259
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 260
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo userInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, " deviceID:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 261
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;-><init>()V

    .line 262
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 263
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;-><init>()V

    .line 264
    invoke-virtual {v6, p0}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setData(Ljava/util/Map;)V

    .line 265
    invoke-virtual {v6, p2}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    .line 266
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    invoke-virtual {v4, v5}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDeviceServiceInfo(Ljava/util/List;)V

    .line 268
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 270
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 271
    return-void

    .line 273
    :cond_0
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDevId(Ljava/lang/String;)V

    .line 275
    invoke-static {p3}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahu$3;

    invoke-direct {v1, p3, p1}, Lo/ahu$3;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V

    .line 292
    return-void
.end method
