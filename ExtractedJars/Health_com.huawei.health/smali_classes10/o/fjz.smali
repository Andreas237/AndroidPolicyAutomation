.class public Lo/fjz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/huawei/up/model/UserInfomation;
    .locals 6

    .line 296
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v5

    .line 297
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 298
    invoke-virtual {v5}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 299
    if-eqz v4, :cond_0

    .line 300
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalUserinfo return  MerryuserInfomation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 302
    :cond_0
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 303
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalUserinfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 306
    :cond_1
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 307
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwUserProfileMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    :goto_0
    return-object v4
.end method

.method public static d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;
    .locals 10

    .line 251
    sget-object v0, Lo/fjz;->c:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    if-nez v0, :cond_4

    .line 252
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-static {}, Lo/fjz;->c()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 254
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf enter ,age: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 257
    const/4 v6, 0x0

    .line 258
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Classify_Method"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 259
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 261
    :try_start_0
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v6, v0

    .line 262
    invoke-virtual {v5, v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    goto :goto_0

    .line 263
    :catch_0
    move-exception v8

    .line 264
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse UserPreference value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 268
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v8

    .line 269
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 271
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 272
    array-length v0, v9

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 273
    const/4 v0, 0x0

    aget-object v0, v9, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRZoneConf(Ljava/lang/String;)V

    .line 274
    const/4 v0, 0x1

    aget-object v0, v9, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setThreshold(Ljava/lang/String;)V

    .line 277
    :cond_1
    goto :goto_1

    .line 278
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HRRHeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v8

    .line 279
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 281
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 282
    array-length v0, v9

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 283
    const/4 v0, 0x0

    aget-object v0, v9, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRHRZoneConf(Ljava/lang/String;)V

    .line 284
    const/4 v0, 0x1

    aget-object v0, v9, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRThreshold(Ljava/lang/String;)V

    .line 288
    :cond_3
    :goto_1
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    sput-object v5, Lo/fjz;->c:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 291
    :cond_4
    sget-object v0, Lo/fjz;->c:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    return-object v0
.end method

.method public static d(Ljava/util/List;)[I
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/HeartRateData;>;)[I"
        }
    .end annotation

    .line 177
    const/4 v4, 0x0

    .line 178
    const/4 v5, -0x1

    .line 179
    const/4 v0, 0x5

    new-array v6, v0, [I

    .line 181
    const/4 v7, 0x0

    .line 182
    const/4 v8, 0x5

    .line 183
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 184
    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/HeartRateData;

    invoke-virtual {v0}, Lcom/huawei/datatype/HeartRateData;->getTime()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/datatype/HeartRateData;

    invoke-virtual {v2}, Lcom/huawei/datatype/HeartRateData;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x9c40

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 186
    const/4 v8, 0x5

    goto :goto_0

    .line 188
    :cond_0
    const/16 v8, 0x3c

    .line 192
    :cond_1
    :goto_0
    invoke-static {}, Lo/fjz;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v9

    .line 194
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v0, "heartzone:"

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    const/4 v11, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_5

    .line 197
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/datatype/HeartRateData;

    .line 198
    mul-int v7, v8, v11

    .line 200
    invoke-virtual {v12}, Lcom/huawei/datatype/HeartRateData;->getHeartRate()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->findRateRegion(I)I

    move-result v13

    .line 201
    invoke-virtual {v12}, Lcom/huawei/datatype/HeartRateData;->getHeartRate()I

    move-result v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 203
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    const/4 v0, -0x1

    if-eq v13, v0, :cond_3

    .line 207
    if-eq v5, v13, :cond_4

    .line 209
    const/4 v0, -0x1

    if-eq v5, v0, :cond_2

    .line 210
    aget v0, v6, v5

    sub-int v1, v7, v4

    add-int/2addr v0, v1

    aput v0, v6, v5

    .line 212
    :cond_2
    move v4, v7

    .line 213
    move v5, v13

    goto :goto_2

    .line 217
    :cond_3
    const/4 v0, -0x1

    if-eq v5, v0, :cond_4

    .line 218
    aget v0, v6, v5

    sub-int v1, v7, v4

    add-int/2addr v0, v1

    aput v0, v6, v5

    .line 219
    const/4 v5, -0x1

    .line 196
    :cond_4
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 225
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/datatype/HeartRateData;

    .line 226
    invoke-virtual {v11}, Lcom/huawei/datatype/HeartRateData;->getHeartRate()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->findRateRegion(I)I

    move-result v12

    .line 228
    const/4 v0, -0x1

    if-eq v12, v0, :cond_6

    if-ne v12, v5, :cond_6

    .line 229
    aget v0, v6, v5

    sub-int v1, v7, v4

    add-int/2addr v0, v1

    aput v0, v6, v5

    .line 230
    invoke-virtual {v11}, Lcom/huawei/datatype/HeartRateData;->getHeartRate()I

    move-result v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 232
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    :cond_6
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return-object v6
.end method
