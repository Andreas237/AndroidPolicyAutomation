.class public final Lcom/microblink/AccessTokenManager;
.super Ljava/lang/Object;


# static fields
.field private static final ACTION_CURRENT_ACCESS_TOKEN_CHANGED:Ljava/lang/String; = "com.microblink.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

.field private static volatile instance:Lcom/microblink/AccessTokenManager;

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private final accessTokenCache:Lcom/microblink/AccessTokenCache;

.field private currentAccessToken:Lcom/microblink/AccessToken;

.field private final localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/AccessTokenManager;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/support/v4/content/LocalBroadcastManager;Lcom/microblink/AccessTokenCache;)V
    .locals 1
    .param p1    # Landroid/support/v4/content/LocalBroadcastManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/AccessTokenCache;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessTokenCache"

    invoke-static {p2, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/microblink/AccessTokenManager;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iput-object p2, p0, Lcom/microblink/AccessTokenManager;->accessTokenCache:Lcom/microblink/AccessTokenCache;

    return-void
.end method

.method private currentAccessToken(Lcom/microblink/AccessToken;Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/AccessTokenManager;->currentAccessToken:Lcom/microblink/AccessToken;

    iput-object p1, p0, Lcom/microblink/AccessTokenManager;->currentAccessToken:Lcom/microblink/AccessToken;

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/microblink/AccessTokenManager;->currentAccessToken:Lcom/microblink/AccessToken;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/microblink/AccessTokenManager;->accessTokenCache:Lcom/microblink/AccessTokenCache;

    invoke-virtual {p2, p1}, Lcom/microblink/AccessTokenCache;->save(Lcom/microblink/AccessToken;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/microblink/AccessTokenManager;->accessTokenCache:Lcom/microblink/AccessTokenCache;

    invoke-virtual {p1}, Lcom/microblink/AccessTokenCache;->clear()V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/microblink/AccessTokenManager;->currentAccessToken:Lcom/microblink/AccessToken;

    invoke-static {v0, p1}, Lcom/microblink/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/microblink/AccessTokenManager;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    new-instance p2, Landroid/content/Intent;

    const-string v0, "com.microblink.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    :cond_2
    return-void
.end method

.method public static getInstance()Lcom/microblink/AccessTokenManager;
    .locals 7

    sget-object v0, Lcom/microblink/AccessTokenManager;->instance:Lcom/microblink/AccessTokenManager;

    if-nez v0, :cond_1

    sget-object v1, Lcom/microblink/AccessTokenManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/microblink/AccessTokenManager;->instance:Lcom/microblink/AccessTokenManager;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/microblink/ReceiptSdk;->applicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lcom/microblink/AccessTokenManager;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v3

    new-instance v4, Lcom/microblink/AccessTokenCache;

    const-string v5, "com.microblink.access.token.LICENSE_ACCESS_TOKEN"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/microblink/AccessTokenCache;-><init>(Landroid/content/SharedPreferences;)V

    invoke-direct {v2, v3, v4}, Lcom/microblink/AccessTokenManager;-><init>(Landroid/support/v4/content/LocalBroadcastManager;Lcom/microblink/AccessTokenCache;)V

    sput-object v2, Lcom/microblink/AccessTokenManager;->instance:Lcom/microblink/AccessTokenManager;

    move-object v0, v2

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final currentAccessToken()Lcom/microblink/AccessToken;
    .locals 1

    iget-object v0, p0, Lcom/microblink/AccessTokenManager;->currentAccessToken:Lcom/microblink/AccessToken;

    return-object v0
.end method

.method public final currentAccessToken(Lcom/microblink/AccessToken;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/microblink/AccessTokenManager;->currentAccessToken(Lcom/microblink/AccessToken;Z)V

    return-void
.end method

.method final hasAccessToken()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/AccessTokenManager;->currentAccessToken:Lcom/microblink/AccessToken;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final loadAccessToken()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/AccessTokenManager;->accessTokenCache:Lcom/microblink/AccessTokenCache;

    invoke-virtual {v0}, Lcom/microblink/AccessTokenCache;->load()Lcom/microblink/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/microblink/AccessTokenManager;->currentAccessToken(Lcom/microblink/AccessToken;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
