.class Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;
.super Ljava/lang/Object;
.source "GPlayServicesClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectToGoogleOnMain()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;


# direct methods
.method constructor <init>(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "Requesting Google connection on MAIN thread."

    const/4 v1, 0x0

    .line 173
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-static {v0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->access$000(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 176
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    iget-object v0, v0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    iget-object v0, v0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Already connected to google."

    .line 177
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->onConnected(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-static {v0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->access$000(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    .line 182
    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v2, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-static {v2}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->access$100(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    .line 183
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    .line 184
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 186
    iget-object v2, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-static {v2}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->access$200(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/api/Api;

    const-string v4, "Using API: %1$s"

    const/4 v5, 0x1

    .line 187
    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    goto :goto_0

    .line 191
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, v1, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    iget-object v0, v0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-static {v0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->access$000(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;->this$0:Lcom/ibotta/android/gplayservices/GPlayServicesClient;

    invoke-static {v1}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->access$000(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
