.class public Lo/cul;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/hihealth/HiAggregateOption;
    .locals 9

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 28
    const/4 v6, 0x2

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 29
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "step"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "calorie"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 30
    new-instance v8, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 31
    invoke-static {v4, v5}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-static {v4, v5}, Lo/cnk;->i(J)J

    move-result-wide v2

    invoke-virtual {v8, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 32
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 33
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 34
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 35
    invoke-virtual {v8, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 36
    return-object v8

    :array_0
    .array-data 4
        0x2
        0x4
    .end array-data
.end method

.method private static b(Lo/cuk;)Lcom/amap/api/maps/model/LatLng;
    .locals 5

    .line 43
    iget-wide v1, p0, Lo/cuk;->c:D

    .line 44
    iget-wide v3, p0, Lo/cuk;->d:D

    .line 45
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;[D)[D
    .locals 7

    .line 52
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 53
    :cond_0
    return-object p1

    .line 56
    :cond_1
    const/4 v5, 0x0

    .line 57
    new-instance v6, Lcom/amap/api/maps/CoordinateConverter;

    invoke-direct {v6, p0}, Lcom/amap/api/maps/CoordinateConverter;-><init>(Landroid/content/Context;)V

    .line 58
    sget-object v0, Lcom/amap/api/maps/CoordinateConverter$CoordType;->GPS:Lcom/amap/api/maps/CoordinateConverter$CoordType;

    invoke-virtual {v6, v0}, Lcom/amap/api/maps/CoordinateConverter;->from(Lcom/amap/api/maps/CoordinateConverter$CoordType;)Lcom/amap/api/maps/CoordinateConverter;

    .line 59
    new-instance v0, Lo/cuk;

    const/4 v1, 0x0

    aget-wide v1, p1, v1

    const/4 v3, 0x1

    aget-wide v3, p1, v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cuk;-><init>(DD)V

    invoke-static {v0}, Lo/cul;->b(Lo/cuk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/amap/api/maps/CoordinateConverter;->coord(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CoordinateConverter;

    .line 60
    invoke-virtual {v6}, Lcom/amap/api/maps/CoordinateConverter;->convert()Lcom/amap/api/maps/model/LatLng;

    move-result-object v5

    .line 62
    if-eqz v5, :cond_2

    .line 63
    iget-wide v0, v5, Lcom/amap/api/maps/model/LatLng;->latitude:D

    const/4 v2, 0x0

    aput-wide v0, p1, v2

    .line 64
    iget-wide v0, v5, Lcom/amap/api/maps/model/LatLng;->longitude:D

    const/4 v2, 0x1

    aput-wide v0, p1, v2

    .line 67
    :cond_2
    return-object p1
.end method

.method public static c(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;>;"
        }
    .end annotation

    .line 71
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 73
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 75
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v5

    .line 76
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v8

    .line 77
    if-nez v8, :cond_0

    .line 78
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createDelMap,nothing need to del ,no healthContext,clientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v8}, Lo/crd;->i()J

    move-result-wide v9

    .line 83
    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-gtz v0, :cond_1

    .line 84
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createDelMap,nothing need to del ,no deviceCode,clientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    goto :goto_0

    .line 89
    :cond_1
    const/4 v11, 0x0

    .line 90
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v12

    .line 91
    invoke-static {v12}, Lo/cue;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    invoke-static {v12}, Lo/cue;->a(I)I

    move-result v11

    .line 93
    if-gtz v11, :cond_2

    .line 94
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createDelMap , error type no such type can delete ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    goto/16 :goto_0

    .line 98
    :cond_2
    new-instance v13, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;

    invoke-direct {v13}, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;-><init>()V

    .line 99
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->setDeviceCode(Ljava/lang/Long;)V

    .line 100
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->setStartTime(Ljava/lang/Long;)V

    .line 101
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->setEndTime(Ljava/lang/Long;)V

    .line 102
    const/4 v0, 0x0

    if-ne v0, v11, :cond_3

    .line 103
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->setType(Ljava/lang/Integer;)V

    goto :goto_1

    .line 105
    :cond_3
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;->setType(Ljava/lang/Integer;)V

    .line 107
    :goto_1
    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    goto/16 :goto_0

    .line 109
    :cond_4
    return-object v4
.end method
