.class public Lo/agc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/Object;

.field private static e:Lo/agc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/agc;->e:Lo/agc;

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/agc;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceAutoTestTools getInstance()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lo/age;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 181
    const/4 v4, 0x0

    .line 182
    const/4 v5, 0x0

    .line 183
    const/4 v6, 0x0

    .line 184
    const-string v0, "random"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 186
    new-instance v8, Ljava/security/SecureRandom;

    invoke-direct {v8}, Ljava/security/SecureRandom;-><init>()V

    .line 187
    const/16 v0, 0x64

    invoke-virtual {v8, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v9

    .line 188
    add-int/lit8 v0, v9, -0x1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v9, -0x1

    :goto_0
    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 189
    const-string v0, "low"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 190
    const-string v0, "high"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 191
    const-string v0, "heart"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 192
    goto :goto_1

    :cond_1
    const-string v0, "insert"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 195
    const-string v0, "low"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v4, v0

    .line 196
    const-string v0, "high"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v5, v0

    .line 197
    const-string v0, "heart"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 200
    goto :goto_1

    .line 198
    :catch_0
    move-exception v7

    .line 199
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :cond_2
    :goto_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "low ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " high="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "heartRate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    int-to-short v0, v5

    invoke-virtual {p3, v0}, Lo/age;->c(S)V

    .line 205
    int-to-short v0, v4

    invoke-virtual {p3, v0}, Lo/age;->a(S)V

    .line 206
    int-to-short v0, v6

    invoke-virtual {p3, v0}, Lo/age;->d(S)V

    .line 207
    return-void
.end method

.method private a(Ljava/lang/String;Lo/afz;)V
    .locals 12

    .line 101
    new-instance v4, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "deviceautotest"

    invoke-direct {v4, v0, v1}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    :try_start_0
    invoke-virtual {v4, p1}, Lo/agj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 104
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 105
    const-string v0, "product_random_insert"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 106
    const-string v8, "deviceautotestdata"

    .line 107
    const-string v0, "random"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    const-string v8, "deviceautotestdata"

    goto :goto_0

    .line 109
    :cond_0
    const-string v0, "insert"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    const-string v8, "deviceautotestinterdata"

    .line 112
    :cond_1
    :goto_0
    new-instance v9, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v9, v0, v8}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 113
    invoke-virtual {v9, p1}, Lo/agj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 114
    instance-of v0, p2, Lo/afy;

    if-eqz v0, :cond_2

    .line 115
    move-object v11, p2

    check-cast v11, Lo/afy;

    .line 116
    invoke-direct {p0, v7, v10, v11}, Lo/agc;->d(Ljava/lang/String;Ljava/lang/String;Lo/afy;)V

    .line 117
    goto :goto_1

    :cond_2
    instance-of v0, p2, Lo/agg;

    if-eqz v0, :cond_3

    .line 118
    move-object v11, p2

    check-cast v11, Lo/agg;

    .line 119
    invoke-direct {p0, v7, v10, v11}, Lo/agc;->b(Ljava/lang/String;Ljava/lang/String;Lo/agg;)V

    .line 120
    goto :goto_1

    :cond_3
    instance-of v0, p2, Lo/age;

    if-eqz v0, :cond_4

    .line 121
    move-object v11, p2

    check-cast v11, Lo/age;

    .line 122
    invoke-direct {p0, v7, v10, v11}, Lo/agc;->a(Ljava/lang/String;Ljava/lang/String;Lo/age;)V

    .line 123
    goto :goto_1

    :cond_4
    instance-of v0, p2, Lo/aga;

    if-eqz v0, :cond_5

    .line 124
    move-object v11, p2

    check-cast v11, Lo/aga;

    .line 125
    invoke-direct {p0, v7, v10, v11}, Lo/agc;->e(Ljava/lang/String;Ljava/lang/String;Lo/aga;)V

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceAutoTestTools HealthData Class is error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :goto_1
    goto :goto_2

    .line 129
    :catch_0
    move-exception v5

    .line 130
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools e2 = "

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

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_2
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Lo/agg;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 158
    const/4 v4, 0x0

    .line 159
    const-string v0, "random"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 161
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    .line 162
    const/16 v0, 0x64

    invoke-virtual {v6, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v7

    .line 163
    add-int/lit8 v0, v7, -0x1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v7, -0x1

    :goto_0
    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 164
    const-string v0, "weight"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v4, v0

    .line 165
    goto :goto_1

    :cond_1
    const-string v0, "insert"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 168
    const-string v0, "weight"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 171
    goto :goto_1

    .line 169
    :catch_0
    move-exception v5

    .line 170
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools setWeightData e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_2
    :goto_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools setWeightData weight ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    invoke-virtual {p3, v4}, Lo/agg;->e(F)V

    .line 175
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-virtual {p3, v0}, Lo/agg;->b(F)V

    .line 176
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lo/agg;->e(J)V

    .line 177
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lo/agg;->d(J)V

    .line 178
    return-void
.end method

.method public static c()Lo/agc;
    .locals 4

    .line 54
    sget-object v2, Lo/agc;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 55
    :try_start_0
    sget-object v0, Lo/agc;->e:Lo/agc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 56
    new-instance v0, Lo/agc;

    invoke-direct {v0}, Lo/agc;-><init>()V

    sput-object v0, Lo/agc;->e:Lo/agc;

    .line 58
    :cond_0
    sget-object v0, Lo/agc;->e:Lo/agc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 59
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Lo/afy;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 135
    const/4 v4, 0x0

    .line 136
    const-string v0, "random"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 138
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    .line 139
    const/16 v0, 0x64

    invoke-virtual {v6, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v7

    .line 140
    add-int/lit8 v0, v7, -0x1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v7, -0x1

    :goto_0
    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 141
    const-string v0, "bloodsugar"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v4, v0

    .line 142
    goto :goto_1

    :cond_1
    const-string v0, "insert"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 145
    const-string v0, "bloodsugar"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 148
    goto :goto_1

    .line 146
    :catch_0
    move-exception v5

    .line 147
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools setBloodSugar e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    :cond_2
    :goto_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools setBloodSugar bloodsugar ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p3, v4}, Lo/afy;->b(F)V

    .line 152
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lo/afy;->e(J)V

    .line 153
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lo/afy;->d(J)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lo/afy;->c(I)V

    .line 155
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Lo/aga;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 210
    const/4 v4, 0x0

    .line 211
    const-string v0, "random"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 213
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    .line 214
    const/16 v0, 0x64

    invoke-virtual {v6, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v7

    .line 215
    add-int/lit8 v0, v7, -0x1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v7, -0x1

    :goto_0
    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 216
    const-string v0, "heart"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 217
    goto :goto_1

    :cond_1
    const-string v0, "insert"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 219
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 220
    const-string v0, "heart"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 223
    goto :goto_1

    .line 221
    :catch_0
    move-exception v5

    .line 222
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools setHeartRateData e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :cond_2
    :goto_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools heart_rate ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lo/aga;->e(Ljava/lang/Integer;)V

    .line 227
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/afz;
    .locals 1

    .line 236
    new-instance v0, Lo/age;

    invoke-direct {v0}, Lo/age;-><init>()V

    .line 237
    invoke-direct {p0, p1, v0}, Lo/agc;->a(Ljava/lang/String;Lo/afz;)V

    .line 238
    return-object v0
.end method

.method public b(Ljava/lang/String;)Lo/acl;
    .locals 9

    .line 85
    new-instance v4, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "deviceautotest"

    invoke-direct {v4, v0, v1}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 86
    invoke-virtual {v4, p1}, Lo/agj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 87
    const-string v6, ""

    .line 88
    const-string v7, ""

    .line 90
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 91
    const-string v0, "product_bluetoothname"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v6, v0

    .line 92
    const-string v0, "product_mac"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    .line 95
    goto :goto_0

    .line 93
    :catch_0
    move-exception v8

    .line 94
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceAutoTestTools buildAutoDevice e ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    :goto_0
    new-instance v8, Lo/ack;

    invoke-direct {v8, v6, v7, v7}, Lo/ack;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    return-object v8
.end method

.method public b()Z
    .locals 4

    .line 67
    const/4 v2, 0x0

    .line 68
    new-instance v3, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "deviceautotest"

    invoke-direct {v3, v0, v1}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    const-string v0, "deviceauto"

    invoke-virtual {v3, v0}, Lo/agj;->b(Ljava/lang/String;)Z

    move-result v2

    .line 70
    return v2
.end method

.method public c(Ljava/lang/String;)Z
    .locals 5

    .line 74
    const/4 v2, 0x0

    .line 75
    new-instance v3, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "deviceautotest"

    invoke-direct {v3, v0, v1}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v3, p1}, Lo/agj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 77
    const-string v0, "0"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 78
    const/4 v2, 0x1

    .line 80
    :cond_0
    return v2
.end method

.method public d(Lo/acl$a;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 21

    .line 254
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 255
    new-instance v5, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "deviceautotest"

    invoke-direct {v5, v0, v1}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 257
    move-object/from16 v0, p2

    :try_start_0
    invoke-virtual {v5, v0}, Lo/agj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 258
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 259
    const-string v0, "product_bluetoothname"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 260
    const-string v0, "product_mac"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 261
    const-string v0, "product_random_insert"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 263
    const-string v0, "product_bluetoothname"

    invoke-virtual {v4, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    const-string v0, "product_mac"

    invoke-virtual {v4, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string v11, "deviceautotestdata"

    .line 267
    const-string v0, "random"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    const-string v11, "deviceautotestdata"

    goto :goto_0

    .line 269
    :cond_0
    const-string v0, "insert"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    const-string v11, "deviceautotestinterdata"

    .line 272
    :cond_1
    :goto_0
    new-instance v12, Lo/agj;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v12, v0, v11}, Lo/agj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 273
    move-object/from16 v0, p2

    invoke-virtual {v12, v0}, Lo/agj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 274
    const-string v14, "0"

    .line 275
    const-string v15, "0"

    .line 276
    const-string v16, "0"

    .line 277
    const/16 v17, 0x0

    .line 278
    const-string v0, "random"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 279
    new-instance v0, Lorg/json/JSONArray;

    move-object v1, v13

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 280
    new-instance v19, Ljava/security/SecureRandom;

    invoke-direct/range {v19 .. v19}, Ljava/security/SecureRandom;-><init>()V

    .line 281
    move-object/from16 v0, v19

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v20

    .line 282
    add-int/lit8 v0, v20, -0x1

    if-gez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v20, -0x1

    :goto_1
    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v17

    .line 283
    goto :goto_2

    :cond_3
    const-string v0, "insert"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 284
    new-instance v0, Lorg/json/JSONObject;

    move-object v1, v13

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v17, v0

    .line 286
    :cond_4
    :goto_2
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_8

    .line 288
    :try_start_1
    sget-object v0, Lo/acl$a;->a:Lo/acl$a;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_5

    .line 289
    const-string v0, "low"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    .line 290
    const-string v0, "high"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    .line 291
    const-string v0, "heart"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    .line 292
    const-string v0, "low"

    invoke-virtual {v4, v0, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v0, "high"

    invoke-virtual {v4, v0, v15}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const-string v0, "heart"

    move-object/from16 v1, v16

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 295
    :cond_5
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_6

    .line 296
    const-string v0, "weight"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    .line 297
    const-string v0, "weight"

    invoke-virtual {v4, v0, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 298
    :cond_6
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_7

    .line 299
    const-string v0, "bloodsugar"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    .line 300
    const-string v0, "bloodsugar"

    invoke-virtual {v4, v0, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 304
    :cond_7
    :goto_3
    goto :goto_4

    .line 302
    :catch_0
    move-exception v18

    .line 303
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    :cond_8
    :goto_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arg1 ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " arg2="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "arg3="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 309
    goto :goto_5

    .line 307
    :catch_1
    move-exception v6

    .line 308
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e2 = "

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

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :goto_5
    return-object v4
.end method

.method public d(Ljava/lang/String;)Lo/afz;
    .locals 1

    .line 230
    new-instance v0, Lo/afy;

    invoke-direct {v0}, Lo/afy;-><init>()V

    .line 231
    invoke-direct {p0, p1, v0}, Lo/agc;->a(Ljava/lang/String;Lo/afz;)V

    .line 232
    return-object v0
.end method

.method public e(Ljava/lang/String;)Lo/afz;
    .locals 1

    .line 242
    new-instance v0, Lo/agg;

    invoke-direct {v0}, Lo/agg;-><init>()V

    .line 243
    invoke-direct {p0, p1, v0}, Lo/agc;->a(Ljava/lang/String;Lo/afz;)V

    .line 244
    return-object v0
.end method

.method public k(Ljava/lang/String;)Lo/afz;
    .locals 1

    .line 248
    new-instance v0, Lo/aga;

    invoke-direct {v0}, Lo/aga;-><init>()V

    .line 249
    invoke-direct {p0, p1, v0}, Lo/agc;->a(Ljava/lang/String;Lo/afz;)V

    .line 250
    return-object v0
.end method
