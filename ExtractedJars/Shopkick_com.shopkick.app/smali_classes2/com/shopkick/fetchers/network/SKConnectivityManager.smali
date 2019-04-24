.class public Lcom/shopkick/fetchers/network/SKConnectivityManager;
.super Ljava/lang/Object;
.source "SKConnectivityManager.java"


# instance fields
.field private connectivityManager:Landroid/net/ConnectivityManager;


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/shopkick/fetchers/network/SKConnectivityManager;->connectivityManager:Landroid/net/ConnectivityManager;

    return-void
.end method


# virtual methods
.method public isBackgroundEnabled()Z
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/shopkick/fetchers/network/SKConnectivityManager;->connectivityManager:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isNetworkConnected()Z
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/shopkick/fetchers/network/SKConnectivityManager;->connectivityManager:Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 27
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method
