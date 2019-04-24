.class public Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public switchLogBinToHealthDatas(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)[Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 5

    .line 16
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getDataType()I

    move-result v2

    .line 17
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getReferData()Ljava/lang/String;

    move-result-object v3

    .line 20
    invoke-static {v3}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->isJsonData(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-static {v2, v3}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getObject(ILjava/lang/String;)[Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v4

    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x1

    new-array v4, v0, [Lcom/huawei/hihealthservice/old/model/HealthData;

    .line 29
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getDataClass(I)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v3, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/HealthData;

    const/4 v1, 0x0

    aput-object v0, v4, v1

    goto :goto_0

    .line 34
    :cond_1
    const/16 v0, 0x100

    if-ne v2, v0, :cond_2

    .line 36
    invoke-static {v3}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;->parseArraySportData(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/SportData;

    move-result-object v4

    goto :goto_0

    .line 38
    :cond_2
    const/16 v0, 0x400

    if-ne v2, v0, :cond_3

    .line 40
    invoke-static {v3}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->parseMotionPathArray(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v4

    goto :goto_0

    .line 44
    :cond_3
    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 46
    invoke-static {v2, v3}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getObject(ILjava/lang/String;)[Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v4

    goto :goto_0

    .line 50
    :cond_4
    const/4 v0, 0x1

    new-array v4, v0, [Lcom/huawei/hihealthservice/old/model/HealthData;

    .line 51
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getDataClass(I)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v3, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/HealthData;

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 55
    :goto_0
    return-object v4
.end method
