.class public Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;
.super Ljava/lang/Object;
.source "GoogleApiClientOneShotConnectionCallbacks.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# instance fields
.field private final googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final runnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Runnable;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 26
    iput-object p2, p0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;->runnable:Ljava/lang/Runnable;

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'runnable\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'googleApiClient\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 3

    .line 35
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;->runnable:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :try_start_1
    iget-object p1, p0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string/jumbo v0, "shopkick"

    const-string v1, "GoogleApiClient.unregisterConnectionCallbacks() failed"

    .line 43
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_2
    const-string/jumbo v0, "shopkick"

    const-string v1, "GoogleApiClientOneShotConnectionCallbacks.onConnected() failed"

    .line 38
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    :try_start_3
    iget-object p1, p0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :goto_0
    return-void

    :goto_1
    :try_start_4
    iget-object v0, p0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    const-string/jumbo v1, "shopkick"

    const-string v2, "GoogleApiClient.unregisterConnectionCallbacks() failed"

    .line 43
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 44
    :goto_2
    throw p1
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
