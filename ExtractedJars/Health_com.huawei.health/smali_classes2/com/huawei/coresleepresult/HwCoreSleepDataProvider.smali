.class public Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/yo;>;"
        }
    .end annotation
.end field

.field private b:I

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/yl;>;"
        }
    .end annotation
.end field

.field d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/yn;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e:I

    .line 31
    const/16 v0, 0x1e

    iput v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b:I

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c:Ljava/util/ArrayList;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->a:Ljava/util/ArrayList;

    .line 37
    const-string v0, "DetailSleepJni"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 38
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load so success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_0

    .line 39
    :catch_0
    move-exception v4

    .line 40
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load so fail"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    :goto_0
    return-void
.end method

.method private native GetSleepResult([B[BI)Ljava/lang/String;
.end method

.method private native SetUserInfo(II)V
.end method

.method static synthetic a(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b:I

    return v0
.end method

.method private b(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 167
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 168
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 169
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {p1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 168
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 171
    :cond_0
    const-string v0, "HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-object v4
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 8

    .line 104
    const-string v0, "status_in_minute_arr"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has status_in_minute_arr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const-string v0, "status_in_minute_arr"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 107
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 108
    new-instance v6, Lo/yl;

    invoke-direct {v6}, Lo/yl;-><init>()V

    .line 109
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yl;->b(J)V

    .line 110
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yl;->e(J)V

    .line 111
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 112
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    invoke-direct {p0, v7}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/yl;->a(Ljava/util/ArrayList;)V

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 118
    :cond_1
    const-string v0, "status_in_day_arr"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 119
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has status_in_day_arr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const-string v0, "status_in_day_arr"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 121
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 122
    new-instance v6, Lo/yn;

    invoke-direct {v6}, Lo/yn;-><init>()V

    .line 123
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "valid_data"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v7, v0

    .line 124
    invoke-virtual {v6, v7}, Lo/yn;->c(F)V

    .line 125
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v7, v0

    if-nez v0, :cond_2

    .line 127
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->b(J)V

    .line 128
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "fall_asleep_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->d(J)V

    .line 129
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "wake_up_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->e(J)V

    .line 130
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    goto/16 :goto_2

    .line 133
    :cond_2
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->b(J)V

    .line 134
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "fall_asleep_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->d(J)V

    .line 135
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "wake_up_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->e(J)V

    .line 136
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sleep_score"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/yn;->e(I)V

    .line 137
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sleep_latency"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/yn;->c(I)V

    .line 138
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "go_bed_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yn;->c(J)V

    .line 140
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sleep_efficiency"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/yn;->b(I)V

    .line 141
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "snore_freq"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/yn;->a(I)V

    .line 142
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "deep_sleep_part_cnt"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/yn;->d(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 147
    :cond_3
    const-string v0, "err_code_arr"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has err_code_arr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v0, "err_code_arr"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 150
    const/4 v5, 0x0

    :goto_3
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 151
    new-instance v6, Lo/yo;

    invoke-direct {v6}, Lo/yo;-><init>()V

    .line 152
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yo;->c(J)V

    .line 153
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/yo;->a(J)V

    .line 154
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "err_code"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/yo;->c(I)V

    .line 155
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 162
    :cond_4
    goto :goto_4

    .line 160
    :catch_0
    move-exception v4

    .line 161
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procResultData FAIL"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_4
    return-void
.end method

.method static synthetic c(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I
    .locals 0

    .line 27
    iput p1, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e:I

    return p1
.end method

.method private c()V
    .locals 4

    .line 221
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;

    invoke-direct {v1, p0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider$4;-><init>(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)V

    invoke-virtual {v0, v1}, Lo/clq;->a(Lo/clz;)V

    .line 248
    return-void
.end method

.method static synthetic d(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;I)I
    .locals 0

    .line 27
    iput p1, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;)I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e:I

    return v0
.end method

.method private e(Ljava/lang/String;)I
    .locals 6

    .line 206
    move-object v4, p1

    .line 207
    const/4 v5, 0x1

    .line 208
    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "+"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 211
    :cond_0
    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 214
    const/4 v5, -0x1

    .line 216
    :cond_1
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/2addr v0, v5

    return v0
.end method

.method private e(Ljava/util/ArrayList;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;)[B"
        }
    .end annotation

    .line 176
    const/4 v3, 0x0

    .line 177
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 178
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 179
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    add-int/2addr v3, v0

    .line 178
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 182
    :cond_0
    new-array v4, v3, [B

    .line 183
    const/4 v3, 0x0

    .line 184
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 185
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 186
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    add-int/2addr v3, v0

    .line 184
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 188
    :cond_1
    return-object v4
.end method


# virtual methods
.method public b(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 45
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCoreSleepProcessResult()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 47
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 48
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 50
    :cond_1
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave getCoreSleepProcessResult strStatusContent size == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 56
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e(Ljava/lang/String;)I

    move-result v5

    .line 57
    invoke-direct {p0, p2}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e(Ljava/util/ArrayList;)[B

    move-result-object v6

    .line 58
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    array-length v0, v6

    if-gtz v0, :cond_5

    .line 59
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p3, :cond_4

    .line 60
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 62
    :cond_4
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave getCoreSleepProcessResult status size == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void

    .line 66
    :cond_5
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 67
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseByteList 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e(Ljava/util/ArrayList;)[B

    move-result-object v7

    .line 69
    invoke-direct {p0}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c()V

    .line 70
    iget v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b:I

    iget v1, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->e:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->SetUserInfo(II)V

    .line 71
    invoke-direct {p0, v6, v7, v5}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->GetSleepResult([B[BI)Ljava/lang/String;

    move-result-object v4

    .line 72
    goto :goto_0

    .line 73
    :cond_6
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseByteList 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x0

    invoke-direct {p0, v6, v0, v5}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->GetSleepResult([B[BI)Ljava/lang/String;

    move-result-object v4

    .line 76
    :goto_0
    const-string v0, "HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jstr_ret ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 78
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 79
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 81
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 82
    const-string v0, "err_code"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 83
    const/4 v0, 0x0

    if-ne v0, v8, :cond_7

    .line 84
    invoke-direct {p0, v7}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b(Lorg/json/JSONObject;)V

    .line 86
    :cond_7
    new-instance v9, Lo/yj;

    invoke-direct {v9}, Lo/yj;-><init>()V

    .line 87
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->c:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Lo/yj;->d(Ljava/util/ArrayList;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Lo/yj;->e(Ljava/util/ArrayList;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Lo/yj;->b(Ljava/util/ArrayList;)V

    .line 90
    const-string v0, "HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-interface {p3, v8, v9}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_1

    .line 92
    :catch_0
    move-exception v7

    .line 93
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data = null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/4 v0, 0x0

    if-eq v0, p3, :cond_8

    .line 95
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 98
    :cond_8
    :goto_1
    const-string v0, "CORESLEEPMISSON_HwCoreSleepDataProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave getCoreSleepProcessResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 193
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 196
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "Z"

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 201
    :cond_1
    return-object p1
.end method
