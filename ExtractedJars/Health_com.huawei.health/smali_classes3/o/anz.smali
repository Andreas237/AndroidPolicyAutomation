.class public Lo/anz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(ILjava/lang/String;Lo/aog;)V
    .locals 0

    .line 52
    invoke-static {p0, p1, p2}, Lo/anz;->b(ILjava/lang/String;Lo/aog;)V

    return-void
.end method

.method public static a(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Ljava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 101
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 102
    const-string v0, "activityId"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    const-string v0, "/activity/deleteGroupActivity"

    new-instance v1, Lo/anz$3;

    invoke-direct {v1, p2}, Lo/anz$3;-><init>(Lo/aog;)V

    invoke-static {v3, v0, v1}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 111
    return-void
.end method

.method public static a(Ljava/util/List;Lo/aog;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Long;>;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;>;)V"
        }
    .end annotation

    .line 378
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 380
    :cond_0
    const-string v0, "getGroupInfoByIds ids == null"

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lo/aog;->d(ILjava/lang/String;)V

    .line 381
    return-void

    .line 384
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "socialCloudRankUrl"

    new-instance v2, Lo/anz$5;

    invoke-direct {v2, p0, p1}, Lo/anz$5;-><init>(Ljava/util/List;Lo/aog;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 435
    return-void
.end method

.method static synthetic b(Ljava/lang/String;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;
    .locals 1

    .line 52
    invoke-static {p0}, Lo/anz;->d(Ljava/lang/String;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;

    move-result-object v0

    return-object v0
.end method

.method private static b(ILjava/lang/String;Lo/aog;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 255
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/16 v0, 0xc8

    if-ne p0, v0, :cond_2

    .line 258
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 259
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-static {p1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    .line 260
    if-eqz v4, :cond_0

    const-string v0, "0"

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;->getResultCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    invoke-interface {p2, v4}, Lo/aog;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 263
    :cond_0
    invoke-interface {p2, p0, p1}, Lo/aog;->d(ILjava/lang/String;)V

    .line 265
    :goto_0
    goto :goto_1

    .line 266
    :cond_1
    invoke-interface {p2, p0, p1}, Lo/aog;->d(ILjava/lang/String;)V

    goto :goto_1

    .line 269
    :cond_2
    invoke-interface {p2, p0, p1}, Lo/aog;->d(ILjava/lang/String;)V

    .line 271
    :goto_1
    return-void
.end method

.method public static b(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 232
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 233
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 235
    const-string v0, "groupDesc"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 238
    const-string v0, "groupType"

    invoke-virtual {v3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    :cond_1
    const-string v0, "socialCloudRankUrl"

    const-string v1, "/updateGroupInfo"

    new-instance v2, Lo/anz$9;

    invoke-direct {v2, p3}, Lo/anz$9;-><init>(Lo/aog;)V

    invoke-static {v3, v0, v1, v2}, Lo/aoc;->c(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;Lo/aol;)V

    .line 247
    return-void
.end method

.method public static b(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Ljava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 141
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 142
    const-string v0, "activityId"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    const-string v0, "/activity/exitGroupActivity"

    new-instance v1, Lo/anz$4;

    invoke-direct {v1, p2}, Lo/anz$4;-><init>(Lo/aog;)V

    invoke-static {v3, v0, v1}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 151
    return-void
.end method

.method public static c(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 210
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 211
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    const-string v0, "groupDesc"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const-string v0, "groupType"

    invoke-virtual {v3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    const-string v0, "socialCloudRankUrl"

    const-string v1, "/addGroupInfo"

    new-instance v2, Lo/anz$8;

    invoke-direct {v2, p3}, Lo/anz$8;-><init>(Lo/aog;)V

    invoke-static {v3, v0, v1, v2}, Lo/aoc;->c(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;Lo/aol;)V

    .line 222
    return-void
.end method

.method public static c(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Ljava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;>;)V"
        }
    .end annotation

    .line 62
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 63
    const-string v0, "activityId"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-string v0, "/activity/getGroupActivity"

    new-instance v1, Lo/anz$1;

    invoke-direct {v1, p2}, Lo/anz$1;-><init>(Lo/aog;)V

    invoke-static {v3, v0, v1}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 91
    return-void
.end method

.method private static d(Ljava/lang/String;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;
    .locals 15

    .line 324
    new-instance v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;-><init>()V

    .line 325
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 327
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 329
    const-string v0, "fileTagList"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 330
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 331
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 332
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 333
    new-instance v10, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;

    invoke-direct {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;-><init>()V

    .line 334
    const-string v0, "id"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;->setId(I)V

    .line 335
    const-string v0, "tag"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;->setTag(Ljava/lang/String;)V

    .line 336
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 340
    :cond_0
    const-string v0, "nspGetResponseList"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 341
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 342
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 343
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 344
    new-instance v12, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;

    invoke-direct {v12}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;-><init>()V

    .line 345
    const-string v0, "id"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->setId(I)V

    .line 346
    const-string v0, "method"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->setMethod(Ljava/lang/String;)V

    .line 347
    const-string v0, "url"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->setUrl(Ljava/lang/String;)V

    .line 349
    new-instance v13, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;

    invoke-direct {v13}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;-><init>()V

    .line 350
    const-string v0, "headers"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    .line 351
    const-string v0, "Authorization"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setAuthorization(Ljava/lang/String;)V

    .line 352
    const-string v0, "x-amz-content-sha256"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setXamzcontentsha256(Ljava/lang/String;)V

    .line 353
    const-string v0, "x-amz-date"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setXamzdate(Ljava/lang/String;)V

    .line 354
    const-string v0, "content-type"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setContenttype(Ljava/lang/String;)V

    .line 355
    const-string v0, "Host"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setHost(Ljava/lang/String;)V

    .line 356
    const-string v0, "Content-MD5"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setContentMD5(Ljava/lang/String;)V

    .line 357
    const-string v0, "user-agent"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->setUseragent(Ljava/lang/String;)V

    .line 359
    invoke-virtual {v12, v13}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->setHeaders(Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;)V

    .line 361
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 364
    :cond_1
    invoke-virtual {v4, v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->setFileTagList(Ljava/util/List;)V

    .line 365
    invoke-virtual {v4, v9}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->setNspGetResponseList(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 368
    goto :goto_2

    .line 366
    :catch_0
    move-exception v5

    .line 367
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7fa4\u6d77\u62a5\u6570\u636e\u89e3\u6790\u51fa\u9519\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    :cond_2
    :goto_2
    return-object v4
.end method

.method static synthetic d(Lokhttp3/Response;Lo/aog;)V
    .locals 0

    .line 52
    invoke-static {p0, p1}, Lo/anz;->e(Lokhttp3/Response;Lo/aog;)V

    return-void
.end method

.method public static d(Lorg/json/JSONArray;Ljava/io/File;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;Ljava/io/File;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;>;)V"
        }
    .end annotation

    .line 278
    invoke-static {}, Lo/aod;->b()Lo/aod;

    move-result-object v1

    .line 281
    const-string v2, "https://healthcommon.hicloud.com/commonAbility/getUploadUrl"

    .line 282
    invoke-static {p0}, Lo/aoc;->e(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v3

    .line 283
    new-instance v0, Lo/anz$7;

    invoke-direct {v0, p2, p1}, Lo/anz$7;-><init>(Lo/aog;Ljava/io/File;)V

    invoke-virtual {v1, v2, v3, v0}, Lo/aod;->d(Ljava/lang/String;Lorg/json/JSONObject;Lokhttp3/Callback;)V

    .line 318
    return-void
.end method

.method public static e(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Ljava/lang/String;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 121
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 122
    const-string v0, "activityId"

    invoke-virtual {v3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    const-string v0, "/activity/joinGroupActivity"

    new-instance v1, Lo/anz$2;

    invoke-direct {v1, p2}, Lo/anz$2;-><init>(Lo/aog;)V

    invoke-static {v3, v0, v1}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 131
    return-void
.end method

.method public static e(Ljava/lang/Long;Lo/aog;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Long;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;)V"
        }
    .end annotation

    .line 160
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 161
    const-string v0, "groupId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exitUserGroupActivity groupId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "/activity/exitUserGroupActivity"

    new-instance v1, Lo/anz$10;

    invoke-direct {v1, p1}, Lo/anz$10;-><init>(Lo/aog;)V

    invoke-static {v4, v0, v1}, Lo/aoc;->e(Ljava/util/HashMap;Ljava/lang/String;Lo/aol;)V

    .line 170
    return-void
.end method

.method private static e(Lokhttp3/Response;Lo/aog;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokhttp3/Response;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;>;)V"
        }
    .end annotation

    .line 444
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 446
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v4

    .line 447
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGroupInfoByIdsResponse : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;

    invoke-static {v4, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;

    .line 449
    if-eqz v5, :cond_0

    const-string v0, "0"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getResultCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 450
    invoke-interface {p1, v5}, Lo/aog;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 452
    :cond_0
    const-string v0, "getGroupInfoByIdsResponse: HealthGetGroupInfoByIdsBean = null"

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lo/aog;->d(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 456
    :goto_0
    goto :goto_1

    .line 454
    :catch_0
    move-exception v4

    .line 455
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getGroupInfoByIdsResponse:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lo/aog;->d(ILjava/lang/String;)V

    .line 456
    goto :goto_1

    .line 458
    :cond_1
    const-string v0, "getGroupInfoByIdsResponse ,response == null"

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lo/aog;->d(ILjava/lang/String;)V

    .line 460
    :goto_1
    return-void
.end method

.method public static e(Lorg/json/JSONArray;)V
    .locals 7

    .line 178
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishUploadNotify start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-static {}, Lo/aod;->b()Lo/aod;

    move-result-object v4

    .line 183
    const-string v5, "https://healthcommon.hicloud.com/commonAbility/finishUploadNotify"

    .line 184
    invoke-static {p0}, Lo/aoc;->c(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v6

    .line 185
    new-instance v0, Lo/anz$6;

    invoke-direct {v0}, Lo/anz$6;-><init>()V

    invoke-virtual {v4, v5, v6, v0}, Lo/aod;->d(Ljava/lang/String;Lorg/json/JSONObject;Lokhttp3/Callback;)V

    .line 199
    return-void
.end method
