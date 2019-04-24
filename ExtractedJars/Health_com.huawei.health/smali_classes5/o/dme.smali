.class public Lo/dme;
.super Lo/dmj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmj<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lo/dmj;-><init>(I)V

    .line 38
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
        }
    .end annotation

    .line 42
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 46
    const-wide/16 v7, 0x0

    .line 48
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dme;->d:Ljava/lang/String;

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 49
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse jsonObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const-string v0, "Date"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 51
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11, v10}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    move-wide v7, v0

    .line 53
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const-string v0, "Result"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 55
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse resultStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 57
    const-string v0, "commodities"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v14

    .line 58
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse array = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    if-eqz v14, :cond_1

    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 61
    const/4 v15, 0x0

    :goto_0
    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v15, v0, :cond_1

    .line 62
    new-instance v5, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-direct {v5}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;-><init>()V

    .line 63
    invoke-virtual {v14, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v16

    .line 64
    const-string v0, "name"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setName(Ljava/lang/String;)V

    .line 65
    const-string v0, "imageUrl"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setImageUrl(Ljava/lang/String;)V

    .line 66
    const-string v0, "purchaseUrl"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setPurchaseUrl(Ljava/lang/String;)V

    .line 67
    const-string v0, "originalPrice"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setOriginalPrice(Ljava/lang/String;)V

    .line 68
    const-string v0, "discountPrice"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setDiscountPrice(Ljava/lang/String;)V

    .line 69
    const-string v0, "discountStartTime"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setDicountStartTime(J)V

    .line 70
    const-string v0, "discountEndTime"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->setDiscountEndTime(J)V

    .line 71
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-interface {v4}, Ljava/util/List;->size()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 73
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 85
    :cond_1
    :goto_1
    goto :goto_2

    .line 77
    :catch_0
    move-exception v9

    .line 78
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse json error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    move-object/from16 v0, p1

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseCode(I)V

    .line 80
    const-string v0, "parse json failed"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseDesc(Ljava/lang/String;)V

    .line 85
    goto :goto_2

    .line 81
    :catch_1
    move-exception v9

    .line 82
    const-string v0, "CommodityInfoParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IllegalArgumentException error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    move-object/from16 v0, p1

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseCode(I)V

    .line 84
    const-string v0, "parse json failed"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseDesc(Ljava/lang/String;)V

    .line 86
    :goto_2
    const-string v0, "commodityTime"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    const-string v0, "commodityList"

    invoke-interface {v6, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponse(Ljava/lang/Object;)V

    .line 89
    return-object p1
.end method
