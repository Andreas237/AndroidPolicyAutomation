.class public Lo/aod;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/aod;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokhttp3/Call;>;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/Object;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lokhttp3/Call;>;"
        }
    .end annotation
.end field

.field private final e:Lokhttp3/OkHttpClient;

.field private final f:Lokhttp3/OkHttpClient;

.field private final h:Lokhttp3/MediaType;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lo/aod;->e:Lokhttp3/OkHttpClient;

    .line 50
    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    iput-object v0, p0, Lo/aod;->h:Lokhttp3/MediaType;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/aod;->c:Ljava/util/Map;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/aod;->a:Ljava/util/List;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/aod;->b:Ljava/lang/Object;

    .line 56
    iget-object v0, p0, Lo/aod;->e:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 59
    iget-object v0, p0, Lo/aod;->e:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    new-instance v1, Lokhttp3/Dispatcher;

    invoke-direct {v1}, Lokhttp3/Dispatcher;-><init>()V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->dispatcher(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, Lo/aod;->f:Lokhttp3/OkHttpClient;

    .line 61
    iget-object v0, p0, Lo/aod;->e:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->setMaxRequests(I)V

    .line 62
    iget-object v0, p0, Lo/aod;->f:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->setMaxRequests(I)V

    .line 63
    return-void
.end method

.method public static b()Lo/aod;
    .locals 3

    .line 67
    sget-object v0, Lo/aod;->d:Lo/aod;

    if-nez v0, :cond_1

    .line 68
    const-class v1, Lo/aod;

    monitor-enter v1

    .line 69
    :try_start_0
    sget-object v0, Lo/aod;->d:Lo/aod;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lo/aod;

    invoke-direct {v0}, Lo/aod;-><init>()V

    sput-object v0, Lo/aod;->d:Lo/aod;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 74
    :cond_1
    :goto_0
    sget-object v0, Lo/aod;->d:Lo/aod;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;Ljava/io/File;)Lokhttp3/Request$Builder;
    .locals 7

    .line 183
    new-instance v4, Lokhttp3/Request$Builder;

    invoke-direct {v4}, Lokhttp3/Request$Builder;-><init>()V

    .line 184
    if-eqz p1, :cond_0

    .line 185
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->getHeaders()Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;

    move-result-object v5

    .line 186
    if-eqz v5, :cond_0

    .line 187
    const-string v0, "Authorization"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getAuthorization()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 188
    const-string v0, "x-amz-content-sha256"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getXamzcontentsha256()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 189
    const-string v0, "x-amz-date"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getXamzdate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 190
    const-string v0, "content-type"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getContenttype()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 191
    const-string v0, "Host"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 192
    const-string v0, "Content-MD5"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getContentMD5()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 193
    const-string v0, "user-agent"

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getUseragent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 194
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 197
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;->getContenttype()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    invoke-static {v0, p2}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;

    move-result-object v6

    .line 204
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestBody\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    invoke-virtual {v4, v6}, Lokhttp3/Request$Builder;->put(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 209
    :cond_0
    return-object v4
.end method

.method public c()Lokhttp3/Request$Builder;
    .locals 3

    .line 78
    new-instance v2, Lokhttp3/Request$Builder;

    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    .line 80
    const-string v0, "x-huid"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 82
    const-string v0, "x-version"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 84
    return-object v2
.end method

.method public d(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;Ljava/io/File;Lo/aog;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;Ljava/io/File;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;>;)V"
        }
    .end annotation

    .line 145
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->getNspGetResponseList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 146
    :cond_0
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadFile -- HealthGetUploadUrlBean == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "uploadFile -- HealthGetUploadUrlBean == null"

    const/4 v1, -0x1

    invoke-interface {p3, v1, v0}, Lo/aog;->d(ILjava/lang/String;)V

    .line 148
    return-void

    .line 150
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->getNspGetResponseList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;

    invoke-virtual {p0, v0, p2}, Lo/aod;->b(Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;Ljava/io/File;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 151
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v4

    .line 152
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0a\u4f20\u6d77\u62a5\u8bf7\u6c42\u53c2\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lokhttp3/Request;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0a\u4f20\u6d77\u62a5\u8bf7\u6c42\u53c2\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/Headers;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lo/aod;->e:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v4}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    new-instance v1, Lo/aod$1;

    invoke-direct {v1, p0, p3, p1}, Lo/aod$1;-><init>(Lo/aod;Lo/aog;Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;)V

    invoke-interface {v0, v1}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 175
    return-void
.end method

.method public d(Ljava/lang/String;Lorg/json/JSONObject;Lokhttp3/Callback;)V
    .locals 7

    .line 127
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 128
    :cond_0
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URL == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v0, Ljava/io/IOException;

    const-string v1, "URL == null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-interface {p3, v1, v0}, Lokhttp3/Callback;->onFailure(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 130
    return-void

    .line 132
    :cond_1
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v0, p0, Lo/aod;->h:Lokhttp3/MediaType;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v4

    .line 134
    invoke-virtual {p0}, Lo/aod;->c()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v5

    .line 135
    iget-object v0, p0, Lo/aod;->e:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v5}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v6

    .line 136
    invoke-interface {v6, p3}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 137
    return-void
.end method
