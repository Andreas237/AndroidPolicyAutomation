.class public Lo/ffr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lo/ffr;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    sput-object v0, Lo/ffr;->b:Lo/ffr;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LightCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    .line 57
    return-void
.end method

.method private a(ZZZ)Ljava/lang/String;
    .locals 10

    .line 170
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 171
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 172
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 174
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 175
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 178
    if-eqz p1, :cond_1

    .line 179
    const-string v0, "fileId"

    const-string v1, "airule_v1"

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 180
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "airule_ver"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 181
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "aiId = airule ver1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set ver1 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const-string v9, "0"

    .line 186
    :cond_0
    const-string v0, "ver"

    invoke-virtual {v4, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    invoke-virtual {v8, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 189
    :cond_1
    if-eqz p2, :cond_3

    .line 190
    const-string v0, "fileId"

    const-string v1, "servicefw_v1"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "servicefw_ver"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 192
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceId = servicefw ver1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set ver1 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const-string v9, "0"

    .line 197
    :cond_2
    const-string v0, "ver"

    invoke-virtual {v5, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    invoke-virtual {v8, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 202
    :cond_3
    if-eqz p3, :cond_5

    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 203
    const-string v0, "fileId"

    const-string v1, "healthconfig"

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "healthconfig_ver"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 205
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceId = healthconfig ver1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 207
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set ver1 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const-string v9, "0"

    .line 211
    :cond_4
    const-string v0, "ver"

    invoke-virtual {v6, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    invoke-virtual {v8, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 215
    :cond_5
    const-string v0, "fileId"

    invoke-virtual {v7, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    const-string v0, "isBatch"

    const-string v1, "1"

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    goto :goto_0

    .line 217
    :catch_0
    move-exception v9

    .line 218
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException :"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/ffr;
    .locals 6

    .line 43
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    sget-object v0, Lo/ffr;->b:Lo/ffr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 45
    const-class v4, Lo/ffr;

    monitor-enter v4

    .line 46
    :try_start_0
    sget-object v0, Lo/ffr;->b:Lo/ffr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    new-instance v0, Lo/ffr;

    invoke-direct {v0, p0}, Lo/ffr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ffr;->b:Lo/ffr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 51
    :cond_1
    :goto_0
    sget-object v0, Lo/ffr;->b:Lo/ffr;

    return-object v0
.end method

.method static synthetic c(Lo/ffr;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    return-object v0
.end method

.method private c(IJJLjava/lang/String;)V
    .locals 6

    .line 266
    const/4 v2, 0x0

    .line 267
    if-nez p1, :cond_0

    .line 268
    const/4 v2, 0x0

    goto :goto_0

    .line 270
    :cond_0
    const/4 v2, 0x1

    .line 272
    :goto_0
    sub-long v3, p4, p2

    .line 273
    if-nez v2, :cond_1

    const-wide/16 v0, 0x1388

    cmp-long v0, v3, v0

    if-ltz v0, :cond_3

    .line 275
    :cond_1
    const-string v0, "servicefw_v1"

    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 277
    const-string v0, "target"

    const-string v1, "2"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    const-string v0, "target_source_type"

    const-string v1, "4"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    const-string v0, "delay_ms"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    const-string v0, "flag"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 282
    goto :goto_1

    :cond_2
    const-string v0, "airule_v1"

    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 283
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 284
    const-string v0, "target"

    const-string v1, "2"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    const-string v0, "target_source_type"

    const-string v1, "3"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "delay_ms"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    const-string v0, "flag"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 291
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/ffr;IJJLjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct/range {p0 .. p6}, Lo/ffr;->c(IJJLjava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/ffr;Ljava/util/List;Lo/ffv;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lo/ffr;->d(Ljava/util/List;Lo/ffv;)V

    return-void
.end method

.method static synthetic d(Lo/ffr;ZZZ)Ljava/lang/String;
    .locals 1

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lo/ffr;->a(ZZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/util/List;Lo/ffv;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ffu;>;Lo/ffv;)V"
        }
    .end annotation

    .line 230
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadBatch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 232
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullRefresh list.size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 234
    const-string v0, ""

    const/16 v1, 0x4e20

    invoke-interface {p2, v0, v1}, Lo/ffv;->d(Ljava/lang/String;I)V

    .line 237
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ffu;

    .line 239
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 240
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ffy;->e(Landroid/content/Context;)Lo/ffy;

    move-result-object v0

    new-instance v1, Lo/ffr$3;

    move-object v2, p0

    move-object v3, v8

    move-object v4, p2

    move-wide v5, v9

    invoke-direct/range {v1 .. v6}, Lo/ffr$3;-><init>(Lo/ffr;Lo/ffu;Lo/ffv;J)V

    invoke-virtual {v0, v8, v1}, Lo/ffy;->a(Lo/ffu;Lo/fft;)V

    .line 259
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 261
    :cond_2
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lo/ffv;)V
    .locals 15

    .line 96
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRefreshBatch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNoCloudVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const-string v0, ""

    move-object/from16 v1, p1

    const v2, 0x12fd1

    invoke-interface {v1, v0, v2}, Lo/ffv;->d(Ljava/lang/String;I)V

    .line 101
    return-void

    .line 104
    :cond_0
    const-wide/32 v5, 0x5265c00

    .line 107
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "airule_file_v1"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 108
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "servicefw_file_v1"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 109
    const-string v0, "1"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 110
    :cond_1
    const-wide/32 v5, 0x493e0

    .line 114
    :cond_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "airule_file_v1"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 116
    const-wide/16 v5, 0x0

    .line 118
    :cond_3
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 119
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "servicefw_file_v1"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 120
    const-wide/16 v5, 0x0

    .line 123
    :cond_4
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "lightcloudbatchtime"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 124
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    invoke-static {v0, v9}, Lo/dbf;->k(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v10

    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 127
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v10

    if-eqz v0, :cond_5

    sub-long v0, v12, v10

    cmp-long v0, v0, v5

    if-gez v0, :cond_5

    .line 128
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRefresh less than interval time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const-string v0, ""

    move-object/from16 v1, p1

    const v2, 0x12fd1

    invoke-interface {v1, v0, v2}, Lo/ffv;->d(Ljava/lang/String;I)V

    .line 130
    return-void

    .line 133
    :cond_5
    const-string v0, "UIDV_LightCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can doRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    new-instance v14, Lo/dcy;

    invoke-direct {v14}, Lo/dcy;-><init>()V

    .line 135
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "lightcloudbatchtime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v14}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 137
    iget-object v0, p0, Lo/ffr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "getLatestVersion"

    new-instance v2, Lo/ffr$4;

    move-object/from16 v3, p1

    invoke-direct {v2, p0, v3}, Lo/ffr$4;-><init>(Lo/ffr;Lo/ffv;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 161
    return-void
.end method
