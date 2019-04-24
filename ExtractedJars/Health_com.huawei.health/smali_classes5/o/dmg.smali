.class public Lo/dmg;
.super Lo/dmj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmj<Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/dmj;-><init>(I)V

    .line 43
    return-void
.end method

.method private d(Lorg/json/JSONObject;)Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;
    .locals 6

    .line 97
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 98
    const-string v0, "SMART_ActivitiesParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonActivity is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    return-object v0

    .line 102
    :cond_0
    new-instance v4, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;

    invoke-direct {v4}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;-><init>()V

    .line 104
    const-string v0, "activityName"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setActivityName(Ljava/lang/String;)V

    .line 105
    const-string v0, "wordDesc"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setWordDesc(Ljava/lang/String;)V

    .line 106
    const-string v0, "activityId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setActivityId(Ljava/lang/String;)V

    .line 107
    const-string v0, "imgUrl"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setActivityImgUrl(Ljava/lang/String;)V

    .line 108
    const-string v0, "beginDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setStartDate(Ljava/lang/String;)V

    .line 109
    const-string v0, "endDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setEndDate(Ljava/lang/String;)V

    .line 110
    const-string v0, "numberOfPeople"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setJoinNum(Ljava/lang/String;)V

    .line 111
    const-string v0, "activityStatus"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setActivityStatus(I)V

    .line 112
    const-string v0, "activityType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setActivityType(I)V

    .line 113
    const-string v0, "targetValue"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    const-string v0, "targetValue"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v5, v0

    .line 115
    invoke-virtual {v4, v5}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setTargetValue(I)V

    .line 117
    :cond_1
    const-string v0, "description"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setDescription(Ljava/lang/String;)V

    .line 118
    const-string v0, "lastModifyTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setLastModifyTime(Ljava/lang/String;)V

    .line 119
    const-string v0, "activityPosition"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->setActivityPosition(I)V

    .line 120
    const-string v0, "SMART_ActivitiesParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSingleActivity:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    goto :goto_0

    .line 121
    :catch_0
    move-exception v5

    .line 122
    const-string v0, "SMART_ActivitiesParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! parse singel activity:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v4, 0x0

    .line 126
    :goto_0
    return-object v4
.end method

.method private d(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;"
        }
    .end annotation

    .line 71
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 72
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 73
    const-string v0, "SMART_ActivitiesParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArray is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-object v4

    .line 77
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 78
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 79
    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 80
    invoke-direct {p0, v7}, Lo/dmg;->d(Lorg/json/JSONObject;)Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;

    move-result-object v8

    .line 81
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 82
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 86
    :cond_2
    return-object v4
.end method


# virtual methods
.method protected b(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;>;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;>;"
        }
    .end annotation

    .line 47
    const-string v0, "SMART_ActivitiesParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    iget-object v0, p0, Lo/dmg;->d:Ljava/lang/String;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 52
    const-string v0, "activities"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dmg;->d(Lorg/json/JSONArray;)Ljava/util/List;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 58
    goto :goto_0

    .line 53
    :catch_0
    move-exception v6

    .line 54
    const-string v0, "SMART_ActivitiesParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! parse activities json:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/16 v0, 0x65

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseCode(I)V

    .line 56
    const-string v0, "parse json failed"

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseDesc(Ljava/lang/String;)V

    .line 57
    return-object p1

    .line 60
    :goto_0
    invoke-virtual {p1, v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponse(Ljava/lang/Object;)V

    .line 61
    return-object p1
.end method
