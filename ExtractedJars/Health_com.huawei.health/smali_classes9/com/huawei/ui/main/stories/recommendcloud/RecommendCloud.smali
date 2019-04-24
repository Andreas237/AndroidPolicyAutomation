.class public Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "UIDV_RecommendCloud"

.field private static volatile instance:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud; = null


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->instance:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecommendCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    .line 52
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;Ljava/util/List;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->downloadBatch(Ljava/util/List;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private downloadBatch(Ljava/util/List;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;>;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V"
        }
    .end annotation

    .line 146
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadBatch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 148
    const-string v0, "UIDV_RecommendCloud"

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

    .line 149
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 150
    const-string v0, ""

    const/16 v1, 0x4e20

    invoke-interface {p2, v0, v1}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 153
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;

    invoke-direct {v1, p0, v5, p2}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;-><init>(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    invoke-virtual {v0, v5, v1}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->doDownload(Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    .line 169
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 171
    :cond_2
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :goto_1
    return-void
.end method

.method private getBody()Ljava/lang/String;
    .locals 8

    .line 115
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 117
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 118
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 121
    const-string v0, "fileId"

    const-string v1, "sleepServiceConfig"

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sleepServiceConfig_ver"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 124
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceId = sleepServiceConfig ver1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set ver1 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const-string v7, "0"

    .line 129
    :cond_0
    const-string v0, "ver"

    invoke-virtual {v4, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    invoke-virtual {v6, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 132
    const-string v0, "fileId"

    invoke-virtual {v5, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    const-string v0, "isBatch"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    goto :goto_0

    .line 134
    :catch_0
    move-exception v7

    .line 135
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException :"

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

    .line 138
    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;
    .locals 6

    .line 38
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->instance:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 40
    const-class v4, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    monitor-enter v4

    .line 41
    :try_start_0
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->instance:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 42
    new-instance v0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->instance:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 46
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->instance:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    return-object v0
.end method


# virtual methods
.method public doRefreshBatch(Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 14

    .line 57
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRefreshBatch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNoCloudVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const-string v0, ""

    const v1, 0x12fd1

    invoke-interface {p1, v0, v1}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 62
    return-void

    .line 65
    :cond_0
    const-wide/32 v5, 0x5265c00

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "service_recommend_file"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 71
    const-string v0, "1"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 72
    const-wide/32 v5, 0x493e0

    .line 77
    :cond_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "service_recommend_file"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 79
    const-wide/16 v5, 0x0

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "recommendcloudbatchtime"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbf;->k(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v9

    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 86
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v9

    if-eqz v0, :cond_3

    sub-long v0, v11, v9

    cmp-long v0, v0, v5

    if-gez v0, :cond_3

    .line 87
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doRefresh less than interval time,lastTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const-string v0, ""

    const v1, 0x12fd1

    invoke-interface {p1, v0, v1}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 89
    return-void

    .line 91
    :cond_3
    new-instance v13, Lo/dcy;

    invoke-direct {v13}, Lo/dcy;-><init>()V

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->mContext:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "recommendcloudbatchtime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v13}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 93
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can doRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const-string v0, "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion"

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->getBody()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;-><init>(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->doRefresh(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    .line 107
    return-void
.end method
