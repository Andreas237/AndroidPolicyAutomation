.class public final Lcom/shopkick/app/gcm/GCMDataSource;
.super Ljava/lang/Object;
.source "GCMDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final GCM_REGISTER_FAILED:Ljava/lang/String; = "gcm_register_failed"

.field public static final GCM_REGISTER_SUCCEEDED:Ljava/lang/String; = "gcm_register_succeeded"

.field public static final GCM_UNREGISTER_FAILED:Ljava/lang/String; = "gcm_unregister_failed"

.field public static final GCM_UNREGISTER_SUCCEEDED:Ljava/lang/String; = "gcm_unregister_succeeded"

.field private static final LOG_TAG:Ljava/lang/String; = "GCMDataSource"

.field private static final RETRY_BACKOFF_MS:I = 0x7d0

.field private static final RETRY_MAX_ATTEMPTS:I = 0x5

.field private static final random:Ljava/util/Random;


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private context:Landroid/content/Context;

.field private handler:Landroid/os/Handler;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private request:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private retryAttempt:I

.field private retryBackoff:I

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/shopkick/app/gcm/GCMDataSource;->random:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 51
    iput-object p2, p0, Lcom/shopkick/app/gcm/GCMDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 52
    iput-object p3, p0, Lcom/shopkick/app/gcm/GCMDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 53
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/gcm/GCMDataSource;Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/gcm/GCMDataSource;)Landroid/content/Context;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->context:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 5

    .line 108
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;

    if-eqz v0, :cond_0

    .line 109
    move-object v1, p1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;->token:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;->token:Ljava/lang/String;

    .line 111
    :goto_0
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/util/encoders/Base64;->decode([B)[B

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([B)V

    .line 112
    iget-boolean p2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v1, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_2

    .line 113
    sget-object p2, Lcom/shopkick/app/gcm/GCMDataSource;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Completed gcm request "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->context:Landroid/content/Context;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/google/android/gcm/GCMRegistrar;->setRegisteredOnServer(Landroid/content/Context;Z)V

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_register_succeeded"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    .line 118
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->context:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/google/android/gcm/GCMRegistrar;->setRegisteredOnServer(Landroid/content/Context;Z)V

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_unregister_succeeded"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 121
    :goto_1
    iput-object v1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    goto :goto_3

    .line 123
    :cond_2
    iget p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryAttempt:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryAttempt:I

    if-eqz p1, :cond_5

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    .line 137
    iget p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryBackoff:I

    mul-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryBackoff:I

    goto :goto_2

    .line 128
    :cond_3
    iput v3, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryBackoff:I

    .line 129
    iput-object v1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_4

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_register_failed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 133
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_unregister_failed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 125
    :cond_5
    sget-object p1, Lcom/shopkick/app/gcm/GCMDataSource;->random:Ljava/util/Random;

    const/16 p2, 0x3e8

    invoke-virtual {p1, p2}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    add-int/lit16 p1, p1, 0x7d0

    iput p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryBackoff:I

    .line 140
    :goto_2
    iget p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryBackoff:I

    if-lez p1, :cond_6

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->handler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/gcm/GCMDataSource$1;

    invoke-direct {p2, p0, v0, v2}, Lcom/shopkick/app/gcm/GCMDataSource$1;-><init>(Lcom/shopkick/app/gcm/GCMDataSource;ZLjava/lang/String;)V

    iget v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->retryBackoff:I

    int-to-long v0, v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_6
    :goto_3
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    .line 58
    iget-object v1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public register(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 69
    sget-object v0, Lcom/shopkick/app/gcm/GCMDataSource;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registering GCM ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for user "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/gcm/GCMDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->context:Landroid/content/Context;

    .line 74
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;-><init>()V

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;->bundleId:Ljava/lang/String;

    const/4 p1, 0x1

    .line 76
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;->environment:Ljava/lang/Integer;

    .line 77
    new-instance p1, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-static {p2}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;->token:Ljava/lang/String;

    const/4 p1, 0x2

    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserSetPushServiceTokenRequest;->tokenType:Ljava/lang/Integer;

    .line 79
    iput-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public unregister(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 88
    sget-object v0, Lcom/shopkick/app/gcm/GCMDataSource;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unregistering GCM ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for user "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/gcm/GCMDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->context:Landroid/content/Context;

    .line 93
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;-><init>()V

    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;->bundleId:Ljava/lang/String;

    const/4 p1, 0x1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;->environment:Ljava/lang/Integer;

    .line 96
    new-instance p1, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-static {p2}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;->token:Ljava/lang/String;

    const/4 p1, 0x2

    .line 97
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserUnsetPushServiceTokenRequest;->tokenType:Ljava/lang/Integer;

    .line 98
    iput-object v0, p0, Lcom/shopkick/app/gcm/GCMDataSource;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_1
    :goto_0
    return-void
.end method
