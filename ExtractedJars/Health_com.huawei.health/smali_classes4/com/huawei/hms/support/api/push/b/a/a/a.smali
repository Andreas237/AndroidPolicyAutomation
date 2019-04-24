.class public abstract Lcom/huawei/hms/support/api/push/b/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 121
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/hms/support/api/push/b/a/a/a;->a:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static a()I
    .locals 8

    .line 200
    const/4 v3, 0x0

    .line 201
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/Class;

    const-class v0, Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v4, v1

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 202
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/Object;

    const-string v0, "ro.build.hw_emui_api_level"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 204
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 205
    const-string v0, "getInt"

    invoke-virtual {v6, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 206
    invoke-virtual {v7, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v3, v0

    .line 207
    const-string v0, "BaseUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getEmuiLevel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_6

    .line 222
    goto :goto_0

    .line 208
    :catch_0
    move-exception v6

    .line 209
    const-string v0, " getEmuiLevel wrong, ClassNotFoundException"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 222
    goto :goto_0

    .line 210
    :catch_1
    move-exception v6

    .line 211
    const-string v0, " getEmuiLevel wrong, ExceptionInInitializerError"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 222
    goto :goto_0

    .line 212
    :catch_2
    move-exception v6

    .line 213
    const-string v0, " getEmuiLevel wrong, LinkageError"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 222
    goto :goto_0

    .line 214
    :catch_3
    move-exception v6

    .line 215
    const-string v0, " getEmuiLevel wrong, NoSuchMethodException"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 222
    goto :goto_0

    .line 216
    :catch_4
    move-exception v6

    .line 217
    const-string v0, " getEmuiLevel wrong, IllegalAccessException"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 222
    goto :goto_0

    .line 218
    :catch_5
    move-exception v6

    .line 219
    const-string v0, " getEmuiLevel wrong, IllegalArgumentException"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 222
    goto :goto_0

    .line 220
    :catch_6
    move-exception v6

    .line 221
    const-string v0, " getEmuiLevel wrong, InvocationTargetException"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 223
    :goto_0
    return v3
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 354
    move-object v4, p1

    .line 357
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 358
    const-string v0, "get"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 359
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_5

    return-object v0

    .line 360
    :catch_0
    move-exception v5

    .line 361
    const-string v0, "An ClassNotFoundException occurred while reading SystemProperties"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 372
    goto :goto_0

    .line 362
    :catch_1
    move-exception v5

    .line 363
    const-string v0, "An NoSuchMethodException occurred while reading SystemProperties"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 372
    goto :goto_0

    .line 364
    :catch_2
    move-exception v5

    .line 365
    const-string v0, "An IllegalAccessException occurred while reading SystemProperties"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 372
    goto :goto_0

    .line 366
    :catch_3
    move-exception v5

    .line 367
    const-string v0, "An IllegalArgumentException occurred while reading SystemProperties"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 372
    goto :goto_0

    .line 368
    :catch_4
    move-exception v5

    .line 369
    const-string v0, "An InvocationTargetException occurred while reading SystemProperties"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 372
    goto :goto_0

    .line 370
    :catch_5
    move-exception v5

    .line 371
    const-string v0, "An ClassCastException occurred while reading SystemProperties"

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->c(Ljava/lang/String;)V

    .line 374
    :goto_0
    return-object v4
.end method

.method public static a([B)Ljava/lang/String;
    .locals 7

    .line 132
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 133
    const/4 v0, 0x0

    return-object v0

    .line 136
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 137
    const-string v0, ""

    return-object v0

    .line 140
    :cond_1
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [C

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x0

    :goto_0
    array-length v0, p0

    if-ge v6, v0, :cond_2

    .line 144
    aget-byte v5, p0, v6

    .line 145
    mul-int/lit8 v0, v6, 0x2

    sget-object v1, Lcom/huawei/hms/support/api/push/b/a/a/a;->a:[C

    and-int/lit16 v2, v5, 0xf0

    shr-int/lit8 v2, v2, 0x4

    aget-char v1, v1, v2

    aput-char v1, v4, v0

    .line 146
    mul-int/lit8 v0, v6, 0x2

    add-int/lit8 v0, v0, 0x1

    sget-object v1, Lcom/huawei/hms/support/api/push/b/a/a/a;->a:[C

    and-int/lit8 v2, v5, 0xf

    aget-char v1, v1, v2

    aput-char v1, v4, v0

    .line 143
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 149
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 3

    .line 108
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    const-string v0, "BaseUtil"

    const-string v1, "jsonString is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const/4 v0, 0x0

    return-object v0

    .line 113
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 114
    :catch_0
    move-exception v2

    .line 115
    const-string v0, "BaseUtil"

    const-string v1, "cast jsonString to jsonArray error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/util/List;Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Landroid/content/Context;)Lorg/json/JSONArray;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 231
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 233
    new-instance v4, Lcom/huawei/hms/support/api/push/b/a/a/c;

    const-string v0, "tags_info"

    invoke-direct {v4, p1, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 234
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 235
    invoke-virtual {v4, v6}, Lcom/huawei/hms/support/api/push/b/a/a/c;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 237
    const-string v0, "tagKey"

    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 238
    const-string v0, "opType"

    const/4 v1, 0x2

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 240
    invoke-virtual {v7}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 241
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 243
    :cond_0
    goto :goto_1

    .line 244
    :cond_1
    const-string v0, "BaseUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not exist, need not to remove"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    :goto_1
    goto :goto_0

    .line 247
    :cond_2
    return-object v3
.end method

.method public static a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V
    .locals 7

    .line 269
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/b/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    return-void

    .line 274
    :cond_0
    if-nez p0, :cond_1

    .line 275
    return-void

    .line 278
    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 281
    const-string v0, "package"

    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    const-string v0, "sdk_ver"

    const v1, 0x13a59d4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    const/4 v4, 0x0

    .line 285
    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getSubAppInfo()Lcom/huawei/hms/support/api/client/SubAppInfo;

    move-result-object v5

    .line 286
    if-eqz v5, :cond_2

    .line 287
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/client/SubAppInfo;->getSubAppID()Ljava/lang/String;

    move-result-object v4

    .line 290
    :cond_2
    if-nez v4, :cond_3

    .line 291
    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getAppID()Ljava/lang/String;

    move-result-object v4

    .line 293
    :cond_3
    const-string v0, "app_id"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 297
    array-length v0, v6

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 298
    const-string v0, "service"

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    const-string v0, "api_name"

    const/4 v1, 0x1

    aget-object v1, v6, v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    :cond_4
    const-string v0, "result"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    const-string v0, "cost_time"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "HMS_SDK_API_CALL"

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 308
    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 316
    const-string v0, "ro.build.version.emui"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 318
    return-object v2
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 11

    .line 159
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    .line 161
    new-array v6, v5, [B

    .line 164
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 166
    const/4 v10, 0x0

    :goto_0
    array-length v0, v6

    if-ge v10, v0, :cond_0

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [B

    mul-int/lit8 v3, v10, 0x2

    aget-byte v3, v7, v3

    const/4 v4, 0x0

    aput-byte v3, v2, v4

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Byte;->decode(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v8

    .line 168
    shl-int/lit8 v0, v8, 0x4

    int-to-byte v8, v0

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [B

    mul-int/lit8 v3, v10, 0x2

    add-int/lit8 v3, v3, 0x1

    aget-byte v3, v7, v3

    const/4 v4, 0x0

    aput-byte v3, v2, v4

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Byte;->decode(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v9

    .line 170
    xor-int v0, v8, v9

    int-to-byte v0, v0

    aput-byte v0, v6, v10
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 175
    :cond_0
    goto :goto_1

    .line 173
    :catch_0
    move-exception v8

    .line 174
    const-string v0, "BaseUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hexString2ByteArray error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :goto_1
    return-object v6
.end method

.method private static c(Ljava/lang/String;)V
    .locals 1

    .line 227
    const-string v0, "BaseUtil"

    invoke-static {v0, p0}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    return-void
.end method

.method public static c()Z
    .locals 2

    .line 328
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/a/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    const-string v0, "BaseUtil"

    const-string v1, "it is not EMUI system."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const/4 v0, 0x0

    return v0

    .line 332
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static d()Z
    .locals 4

    .line 342
    const-string v0, "ro.product.locale.region"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 343
    const-string v0, "BaseUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "regionCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    const-string v0, "cn"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
