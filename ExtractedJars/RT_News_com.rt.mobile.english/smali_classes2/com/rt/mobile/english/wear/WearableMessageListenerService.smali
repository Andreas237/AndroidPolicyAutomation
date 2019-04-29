.class public Lcom/rt/mobile/english/wear/WearableMessageListenerService;
.super Lcom/google/android/gms/wearable/WearableListenerService;
.source "WearableMessageListenerService.java"

# interfaces
.implements Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;
    }
.end annotation


# static fields
.field private static final GET_NEWS_ACTIVITY_PATH:Ljava/lang/String; = "/get-news"

.field private static final IMAGE_LOADER:Ljava/lang/String; = "/WearImageLoader/"

.field private static final START_ACTIVITY_PATH:Ljava/lang/String; = "/start-main-activity"


# instance fields
.field mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field sendWearArticles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/google/android/gms/wearable/WearableListenerService;-><init>()V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->sendWearArticles:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method

.method public onCreate()V
    .locals 2

    .line 58
    invoke-super {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->onCreate()V

    .line 60
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/wearable/Wearable;->API:Lcom/google/android/gms/common/api/Api;

    .line 61
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 62
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 64
    iget-object v0, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V
    .locals 4

    .line 79
    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x6621f217

    if-eq v1, v2, :cond_2

    const v2, -0x54615be7

    if-eq v1, v2, :cond_1

    const v2, -0x7c5b7f1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "/WearImageLoader/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    goto :goto_1

    :cond_1
    const-string v1, "/get-news"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const-string v1, "/start-main-activity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 92
    new-instance v0, Lcom/rt/mobile/english/data/EditionManager;

    invoke-direct {v0}, Lcom/rt/mobile/english/data/EditionManager;-><init>()V

    .line 93
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/rt/mobile/english/ui/MainActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x34000000

    .line 94
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/EditionManager;->getCurrentEdition()Lcom/rt/mobile/english/data/EditionManager$Edition;

    move-result-object v3

    invoke-virtual {v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/rt/mobile/english/data/EditionManager;->findSchemeByEdition(Ljava/lang/String;)Lcom/rt/mobile/english/data/EditionManager$Edition;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "://articles/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 96
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->startActivity(Landroid/content/Intent;)V

    goto :goto_2

    .line 89
    :pswitch_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->with(Landroid/content/Context;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    move-result-object v0

    invoke-virtual {v0, p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->handleMessage(Lcom/google/android/gms/wearable/MessageEvent;)V

    goto :goto_2

    .line 86
    :pswitch_1
    new-instance p1, Lcom/rt/mobile/english/wear/GetNewsTask;

    invoke-virtual {p0}, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/rt/mobile/english/wear/GetNewsTask;-><init>(Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/rt/mobile/english/wear/GetNewsTask;->execute()V

    goto :goto_2

    .line 81
    :pswitch_2
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/rt/mobile/english/ui/MainActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    .line 82
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 83
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->startActivity(Landroid/content/Intent;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onNetworkError()V
    .locals 3

    .line 146
    new-instance v0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;

    const-string v1, "/error_path"

    const-string v2, "error_internet"

    invoke-direct {v0, p0, v1, v2}, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;-><init>(Lcom/rt/mobile/english/wear/WearableMessageListenerService;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->start()V

    return-void
.end method

.method public onNewsReceived(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 108
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/articles/Article;

    .line 109
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-ge v2, v3, :cond_0

    .line 110
    iget-object v2, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->sendWearArticles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 114
    :cond_1
    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    .line 116
    new-instance v0, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;

    const-string v1, "/message_path"

    iget-object v2, p0, Lcom/rt/mobile/english/wear/WearableMessageListenerService;->sendWearArticles:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, v1, p1}, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;-><init>(Lcom/rt/mobile/english/wear/WearableMessageListenerService;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/rt/mobile/english/wear/WearableMessageListenerService$SendToDataLayerThread;->start()V

    return-void
.end method
