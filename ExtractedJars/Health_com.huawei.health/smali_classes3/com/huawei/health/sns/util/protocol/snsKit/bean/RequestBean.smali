.class public abstract Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;
.super Lo/bpu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;
    }
.end annotation


# static fields
.field private static final CONTENT_TYPE:Ljava/lang/String; = "application/octet-stream"

.field private static final END_FLAG:Ljava/lang/String; = "_"

.field private static final TAG:Ljava/lang/String; = "RequestBean"


# instance fields
.field protected contentType:Ljava/lang/String;

.field protected fileKey:Ljava/lang/String;

.field protected filePath:Ljava/lang/String;

.field public isSerial:Z

.field protected method:Ljava/lang/String;

.field protected module:Ljava/lang/String;

.field private target:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

.field protected url:Ljava/lang/String;

.field protected version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lo/bpu;-><init>()V

    .line 49
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    iput-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->target:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    .line 64
    const-string v0, "0111"

    iput-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->version:Ljava/lang/String;

    .line 84
    const-string v0, "application/octet-stream"

    iput-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->contentType:Ljava/lang/String;

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->isSerial:Z

    return-void
.end method

.method private genFileParams()Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 151
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 153
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getAllParam()Ljava/util/Map;

    move-result-object v2

    .line 155
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    .line 156
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 157
    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 159
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 162
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/reflect/Field;

    .line 163
    invoke-virtual {v8, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 164
    if-eqz v9, :cond_0

    .line 166
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 167
    invoke-virtual {v1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 170
    :cond_1
    return-object v1
.end method

.method private getAllParam()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
        }
    .end annotation

    .line 292
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 294
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getDeclaredFields(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v3

    .line 297
    move-object v5, v3

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    .line 299
    invoke-static {v8}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getPrivilegedAction(Ljava/lang/reflect/Field;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 301
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    .line 303
    const-string v0, "_"

    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "_"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 307
    invoke-interface {v2, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 310
    :cond_1
    return-object v2
.end method

.method private static getPrivilegedAction(Ljava/lang/reflect/Field;)Ljava/security/PrivilegedAction;
    .locals 1

    .line 315
    new-instance v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$1;-><init>(Ljava/lang/reflect/Field;)V

    return-object v0
.end method

.method private isJsonArray(Ljava/lang/Object;)Z
    .locals 4

    .line 383
    const/4 v1, 0x0

    .line 384
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 386
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    .line 387
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 389
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 390
    instance-of v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    if-eqz v0, :cond_0

    .line 392
    const/4 v1, 0x1

    .line 396
    :cond_0
    return v1
.end method


# virtual methods
.method public abstract createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
.end method

.method public genBody()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 100
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getAllParam()Ljava/util/Map;

    move-result-object v2

    .line 103
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 105
    const-string v0, ""

    return-object v0

    .line 109
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    .line 110
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 111
    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 114
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 116
    const/4 v5, 0x0

    .line 117
    const/4 v6, 0x0

    .line 121
    :cond_1
    aget-object v0, v3, v6

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getValue(Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v5

    .line 122
    if-eqz v5, :cond_2

    .line 126
    :try_start_0
    aget-object v0, v3, v6

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_0

    .line 128
    :catch_0
    move-exception v7

    .line 130
    const-string v0, "RequestBean"

    const-string v1, "json exception, put key failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    :cond_2
    :goto_0
    add-int/lit8 v6, v6, 0x1

    array-length v0, v3

    if-lt v6, v0, :cond_1

    .line 136
    .line 139
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->contentType:Ljava/lang/String;

    .line 255
    return-object v0
.end method

.method public getFileKey()Ljava/lang/String;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->fileKey:Ljava/lang/String;

    .line 232
    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->filePath:Ljava/lang/String;

    .line 220
    return-object v0
.end method

.method public getFormParams()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 421
    const/4 v2, 0x0

    .line 424
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->genFileParams()Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 429
    goto :goto_0

    .line 426
    :catch_0
    move-exception v3

    .line 428
    const-string v0, "RequestBean"

    const-string v1, "gen file params failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    :goto_0
    return-object v2
.end method

.method public getLog()Ljava/lang/String;
    .locals 1

    .line 414
    const-string v0, ""

    return-object v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->method:Ljava/lang/String;

    .line 182
    return-object v0
.end method

.method public getModule()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->module:Ljava/lang/String;

    .line 191
    return-object v0
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 2

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->version:Ljava/lang/String;

    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&clientversion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 208
    return-object v0
.end method

.method public getTarget()Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->target:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->url:Ljava/lang/String;

    return-object v0
.end method

.method protected getValue(Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 334
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 335
    if-eqz v1, :cond_5

    .line 337
    instance-of v0, v1, Ljava/util/List;

    if-eqz v0, :cond_3

    .line 339
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 340
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->isJsonArray(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 342
    move-object v3, v1

    check-cast v3, Ljava/util/List;

    .line 343
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 344
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 346
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->case2Json()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 344
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 348
    :cond_0
    goto :goto_2

    .line 351
    :cond_1
    move-object v3, v1

    check-cast v3, Ljava/util/List;

    .line 352
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 353
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 355
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 353
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 358
    :cond_2
    :goto_2
    return-object v2

    .line 360
    :cond_3
    instance-of v0, v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    if-eqz v0, :cond_4

    .line 362
    move-object v0, v1

    check-cast v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->case2Json()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 366
    :cond_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 371
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public setContentType(Ljava/lang/String;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->contentType:Ljava/lang/String;

    .line 266
    return-void
.end method

.method public setFilePath(Ljava/lang/String;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->filePath:Ljava/lang/String;

    .line 244
    return-void
.end method

.method public setModule(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->module:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public setTarget(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->target:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    .line 59
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 3

    .line 273
    const-string v0, "RequestBean"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setUrl:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->url:Ljava/lang/String;

    .line 275
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 404
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RequestBean [method_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
