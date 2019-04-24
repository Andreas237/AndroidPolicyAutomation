.class public Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Login_AccessTokenManager"


# instance fields
.field private client:Lcom/huawei/hms/api/HuaweiApiClient;

.field private mActivity:Landroid/app/Activity;

.field private mExecutorService:Ljava/util/concurrent/ExecutorService;

.field private mainHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mActivity:Landroid/app/Activity;

    .line 42
    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;I)Ljava/lang/String;
    .locals 1

    .line 33
    invoke-static {p0, p1, p2}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signBackendTest(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->saveATToken(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private saveATToken(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 118
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter to saveATToken():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    invoke-static {p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/login/ui/login/LoginInit;->setAccessToken(Ljava/lang/String;)V

    goto :goto_0

    .line 122
    :cond_0
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aToken is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :goto_0
    return-void
.end method

.method private static signBackendTest(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;I)Ljava/lang/String;
    .locals 8

    .line 151
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signBackendTest retryTimes "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    if-gez p2, :cond_0

    .line 153
    const/4 v0, 0x0

    return-object v0

    .line 156
    :cond_0
    sget-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiId;->HuaweiIdApi:Lcom/huawei/hms/support/api/hwid/HuaweiIdApi;

    invoke-interface {v0, p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApi;->signInBackend(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v4

    .line 157
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v4, v1, v2, v0}, Lcom/huawei/hms/support/api/client/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hms/support/api/hwid/SignInResult;

    .line 158
    if-eqz v5, :cond_7

    .line 159
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v6

    .line 160
    if-eqz v6, :cond_6

    .line 161
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v0

    const v1, 0x3611c81c

    if-ne v0, v1, :cond_1

    .line 162
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInHuaweiId StatusCode() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    add-int/lit8 p2, p2, -0x1

    invoke-static {p0, p1, p2}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signBackendTest(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 165
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_3

    .line 166
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v7

    .line 167
    if-eqz v7, :cond_2

    .line 168
    invoke-virtual {v7}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 170
    :cond_2
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInHuaweiId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v0

    const/16 v1, 0x7d2

    if-ne v0, v1, :cond_5

    .line 173
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getData()Landroid/content/Intent;

    move-result-object v7

    .line 174
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInHuaweiId not auth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    if-eqz v7, :cond_4

    .line 176
    invoke-virtual {p0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 179
    :cond_4
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInHuaweiId exception status"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    :goto_0
    goto :goto_1

    .line 182
    :cond_5
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "signIn error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 185
    :cond_6
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signIn status is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_1
    goto :goto_2

    .line 188
    :cond_7
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signIn result is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public hmsConnect(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V
    .locals 5

    .line 54
    new-instance v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;

    sget-object v1, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->DEFAULT_SIGN_IN:Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;-><init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;)V

    .line 55
    invoke-virtual {v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->build()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;

    move-result-object v4

    .line 60
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 61
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsConnect null == context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void

    .line 64
    :cond_0
    new-instance v0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/huawei/hms/support/api/hwid/HuaweiId;->SIGN_IN_API:Lcom/huawei/hms/api/Api;

    invoke-virtual {v0, v1, v4}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addApi(Lcom/huawei/hms/api/Api;Lcom/huawei/hms/api/Api$ApiOptions$HasOptions;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/support/api/hwid/HuaweiId;->HUAEWEIID_BASE_SCOPE:Lcom/huawei/hms/support/api/entity/auth/Scope;

    .line 65
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addScope(Lcom/huawei/hms/support/api/entity/auth/Scope;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    .line 66
    invoke-virtual {v0, p2}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    .line 67
    invoke-virtual {v0, p3}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addOnConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->build()Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 72
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    .line 73
    return-void
.end method

.method public initHandler(Landroid/os/Handler;)V
    .locals 1

    .line 48
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mainHandler:Landroid/os/Handler;

    .line 49
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 50
    return-void
.end method

.method public shutDownThread()V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 200
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->disconnect()V

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 204
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mActivity:Landroid/app/Activity;

    .line 205
    return-void
.end method

.method public signIn(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 76
    iget-object v4, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 77
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 78
    :cond_0
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInHuaweiId_signIn is not connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const-string v0, ""

    return-object v0

    .line 83
    :cond_1
    iget-object v5, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mainHandler:Landroid/os/Handler;

    .line 84
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 85
    const-string v0, ""

    return-object v0

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 89
    :cond_3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 92
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;

    invoke-direct {v1, p0, p1, v4, v5}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;-><init>(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;Landroid/os/Handler;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 109
    const/4 v0, 0x0

    return-object v0
.end method

.method public signInToGetAt(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 127
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter signInToGetAt():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v4, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->client:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 129
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 130
    :cond_0
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInToGetAt is not connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const-string v0, ""

    return-object v0

    .line 135
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 136
    :cond_2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 139
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;

    invoke-direct {v1, p0, p1, v4}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;-><init>(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 147
    const/4 v0, 0x0

    return-object v0
.end method
