.class public abstract Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final END_FLAG:Ljava/lang/String; = "_"

.field private static final TAG:Ljava/lang/String; = "JsonBean"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private arrayToJson(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 177
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    .line 178
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 180
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 182
    invoke-static {p1, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueToJson(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 183
    if-eqz v3, :cond_0

    .line 185
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 180
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 188
    :cond_1
    return-object v2
.end method

.method private static getPrivilegedAction([Ljava/lang/reflect/Field;I)Ljava/security/PrivilegedAction;
    .locals 1

    .line 93
    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;-><init>([Ljava/lang/reflect/Field;I)V

    return-object v0
.end method

.method private jsonBeanFromJson(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalArgumentException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 470
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    .line 471
    move-object v0, p2

    check-cast v0, Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->caseFromJson(Lorg/json/JSONObject;)V

    .line 472
    return-object v1
.end method

.method private mapToJson(Ljava/util/Map;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 195
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 197
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 198
    const/4 v4, 0x0

    .line 199
    const/4 v5, 0x0

    .line 202
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 206
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 207
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 209
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueToJson(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 210
    if-eqz v6, :cond_0

    .line 214
    :try_start_0
    invoke-virtual {v2, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    goto :goto_1

    .line 216
    :catch_0
    move-exception v8

    .line 218
    const-string v0, "JsonBean"

    const-string v1, "json exception, put key failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    :cond_0
    :goto_1
    goto :goto_0

    .line 231
    :cond_1
    return-object v2
.end method

.method private processValueError(Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    .locals 4

    .line 327
    if-eqz p2, :cond_0

    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 329
    :cond_0
    return-void

    .line 334
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    .line 335
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_2

    .line 337
    return-void

    .line 340
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 341
    const-string v0, "int"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 343
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 345
    :cond_3
    const-string v0, "float"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 347
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 349
    :cond_4
    const-string v0, "long"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 351
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 353
    :cond_5
    const-string v0, "boolean"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 355
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 357
    :cond_6
    const-string v0, "double"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 359
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 361
    :cond_7
    const-string v0, "short"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 363
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 365
    :cond_8
    const-string v0, "byte"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 367
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 369
    :cond_9
    const-string v0, "char"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 371
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 381
    :cond_a
    :goto_0
    goto :goto_1

    .line 374
    :catch_0
    move-exception v2

    .line 376
    const-string v0, "JsonBean"

    const-string v1, "processValueError Throwable:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    goto :goto_1

    .line 378
    :catch_1
    move-exception v2

    .line 380
    const-string v0, "JsonBean"

    const-string v1, "processValueError Throwable:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    :goto_1
    return-void
.end method

.method private valueFromJson(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/InstantiationException;,
            Ljava/lang/ClassNotFoundException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 400
    const/4 v3, 0x0

    .line 403
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    const-class v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 405
    :cond_0
    const-string v0, "float"

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p3, Ljava/lang/Double;

    if-eqz v0, :cond_1

    .line 407
    move-object v0, p3

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto/16 :goto_0

    .line 411
    :cond_1
    move-object v3, p3

    goto/16 :goto_0

    .line 414
    :cond_2
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 416
    instance-of v0, p3, Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 418
    move-object v3, p3

    goto/16 :goto_0

    .line 420
    :cond_3
    instance-of v0, p3, Ljava/lang/Integer;

    if-eqz v0, :cond_9

    .line 422
    move-object v0, p3

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    .line 426
    :cond_4
    const-class v0, Ljava/util/List;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 429
    invoke-virtual {p0, p2, p3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->listFromJson(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 432
    :cond_5
    const-class v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 435
    const-class v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 437
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "error type, type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 439
    :cond_6
    invoke-direct {p0, p1, p3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->jsonBeanFromJson(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 446
    :cond_7
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 449
    invoke-virtual {p0, p2, p3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->mapFromJson(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 453
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unsupport type, Type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 456
    :cond_9
    :goto_0
    return-object v3
.end method

.method private valueToJson(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 108
    const/4 v1, 0x0

    .line 109
    if-nez p1, :cond_0

    .line 111
    const-string v1, "null"

    goto/16 :goto_0

    .line 114
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    .line 119
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Boolean;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Float;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Byte;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Character;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_3

    .line 122
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 125
    :cond_3
    instance-of v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    if-eqz v0, :cond_4

    .line 127
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->case2Json()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 130
    :cond_4
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_5

    .line 132
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->listToJson(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 135
    :cond_5
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_6

    .line 137
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->mapToJson(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 140
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 142
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->arrayToJson(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 154
    :cond_7
    :goto_0
    return-object v1
.end method


# virtual methods
.method protected final case2Json()Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getDeclaredFields(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 41
    array-length v0, v2

    if-gtz v0, :cond_0

    .line 43
    const-string v0, ""

    return-object v0

    .line 46
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 52
    const/4 v7, 0x0

    :goto_0
    array-length v0, v2

    if-ge v7, v0, :cond_3

    .line 54
    invoke-static {v2, v7}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->getPrivilegedAction([Ljava/lang/reflect/Field;I)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 57
    aget-object v0, v2, v7

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    .line 60
    if-eqz v4, :cond_2

    const-string v0, "_"

    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "_"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 69
    aget-object v0, v2, v7

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 72
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueToJson(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 73
    if-eqz v6, :cond_2

    .line 79
    :try_start_0
    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_1

    .line 81
    :catch_0
    move-exception v8

    .line 83
    const-string v0, "JsonBean"

    const-string v1, "json exception, put name failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_2
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 88
    :cond_3
    return-object v3
.end method

.method public final caseFromJson(Lorg/json/JSONObject;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;,
            Ljava/lang/ClassNotFoundException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 250
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getDeclaredFields(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 252
    const/4 v3, 0x0

    .line 253
    const/4 v4, 0x0

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    :goto_0
    array-length v0, v2

    if-ge v6, v0, :cond_3

    .line 258
    invoke-static {v2, v6}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->getPrivilegedAction([Ljava/lang/reflect/Field;I)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 261
    aget-object v0, v2, v6

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    .line 263
    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    goto/16 :goto_1

    .line 269
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "_"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 272
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 274
    goto/16 :goto_1

    .line 278
    :cond_1
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 280
    goto :goto_1

    .line 283
    :cond_2
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 288
    :try_start_0
    aget-object v0, v2, v6

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    aget-object v1, v2, v6

    invoke-static {v1}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getMapListGenericType(Ljava/lang/reflect/Field;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, v0, v1, v4}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueFromJson(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    .line 289
    aget-object v0, v2, v6

    invoke-virtual {v0, p0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_4

    .line 320
    goto :goto_1

    .line 291
    :catch_0
    move-exception v7

    .line 295
    aget-object v0, v2, v6

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->processValueError(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 320
    goto :goto_1

    .line 297
    :catch_1
    move-exception v7

    .line 301
    aget-object v0, v2, v6

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->processValueError(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 320
    goto :goto_1

    .line 303
    :catch_2
    move-exception v7

    .line 307
    aget-object v0, v2, v6

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->processValueError(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 320
    goto :goto_1

    .line 309
    :catch_3
    move-exception v7

    .line 313
    aget-object v0, v2, v6

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->processValueError(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 320
    goto :goto_1

    .line 315
    :catch_4
    move-exception v7

    .line 319
    aget-object v0, v2, v6

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->processValueError(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 256
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 322
    :cond_3
    return-void
.end method

.method protected listFromJson(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalArgumentException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 487
    if-nez p1, :cond_0

    .line 489
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "generic type is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 493
    :cond_0
    instance-of v0, p2, Lorg/json/JSONArray;

    if-nez v0, :cond_1

    .line 495
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "jsonobject is not JSONArray, jsonValue:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 498
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 499
    move-object v4, p2

    check-cast v4, Lorg/json/JSONArray;

    .line 500
    const/4 v5, 0x0

    .line 501
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 503
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueFromJson(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 504
    if-eqz v5, :cond_2

    .line 506
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 508
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 501
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 512
    :cond_3
    return-object v3
.end method

.method protected listToJson(Ljava/util/List;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 160
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 163
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 165
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueToJson(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 166
    if-eqz v2, :cond_0

    .line 168
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 163
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 172
    :cond_1
    return-object v1
.end method

.method protected mapFromJson(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalArgumentException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 527
    if-nez p1, :cond_0

    .line 529
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "generic type is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 533
    :cond_0
    instance-of v0, p2, Lorg/json/JSONObject;

    if-nez v0, :cond_1

    .line 535
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "jsonobject is not JSONObject, jsonValue:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 538
    :cond_1
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 539
    move-object v4, p2

    check-cast v4, Lorg/json/JSONObject;

    .line 540
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 541
    const/4 v6, 0x0

    .line 543
    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 545
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 546
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->valueFromJson(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 547
    if-eqz v6, :cond_2

    .line 549
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 551
    invoke-interface {v3, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 558
    :cond_3
    return-object v3
.end method
