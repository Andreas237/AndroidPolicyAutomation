.class public Lcom/shopkick/app/fetchers/LocationListManager;
.super Ljava/lang/Object;
.source "LocationListManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/fetchers/network/INetworkCallback;


# static fields
.field private static final CONTEXT_FILENAME:Ljava/lang/String; = "filename"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private application:Landroid/app/Application;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private locationListUpdateEnabled:Z

.field private locationListUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

.field private oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

.field private pendingRequests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/network/NetworkRequest;",
            ">;"
        }
    .end annotation
.end field

.field private presenceController:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateEnabled:Z

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->pendingRequests:Ljava/util/List;

    .line 46
    iput-object p1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->application:Landroid/app/Application;

    .line 47
    iput-object p2, p0, Lcom/shopkick/app/fetchers/LocationListManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 48
    iput-object p4, p0, Lcom/shopkick/app/fetchers/LocationListManager;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 49
    iput-object p3, p0, Lcom/shopkick/app/fetchers/LocationListManager;->oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    .line 50
    iput-object p5, p0, Lcom/shopkick/app/fetchers/LocationListManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method private maybeUpdateLocationList()V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->pendingRequests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->application:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 157
    iget-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/presence/PresenceController;->updateLocationList(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 159
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unable to update the location list."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private sendLocationListUpdateRequest()V
    .locals 2

    .line 61
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateEnabled:Z

    if-nez v0, :cond_0

    return-void

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLocationsInClient:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->updateLocationsInClient:Ljava/lang/Boolean;

    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    return-void

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->getLocationListVersion()I

    move-result v0

    if-lez v0, :cond_3

    .line 71
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

    .line 72
    iget-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;->version:Ljava/lang/Integer;

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_3
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 83
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 84
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateResponse;

    if-eqz p1, :cond_0

    .line 86
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateResponse;->files:Ljava/util/List;

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateResponse;->files:Ljava/util/List;

    .line 87
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 88
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateResponse;->files:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/FullLocationListFile;

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->application:Landroid/app/Application;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/FullLocationListFile;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/Application;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 93
    :catch_0
    :try_start_1
    new-instance v0, Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/FullLocationListFile;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/network/NetworkRequest;-><init>(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/NetworkRequest;->getLocalContext()Ljava/util/Map;

    move-result-object v1

    const-string v2, "filename"

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/FullLocationListFile;->name:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    iget-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->oldNetworkManager:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->fetch(Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;)V

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->pendingRequests:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 99
    :catch_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to make location list url request to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/FullLocationListFile;->url:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 105
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/LocationListManager;->maybeUpdateLocationList()V

    const/4 p1, 0x0

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

    return-void
.end method

.method public installServerUpdates()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->locationListUpdateRequest:Lcom/shopkick/app/fetchers/api/skapi/FullLocationsListUpdateRequest;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/LocationListManager;->pendingRequests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/LocationListManager;->sendLocationListUpdateRequest()V

    :cond_0
    return-void
.end method

.method public parseResponse(Lcom/shopkick/app/fetchers/network/NetworkRequest;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 4

    .line 115
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v0, 0x640

    .line 118
    new-array v0, v0, [B

    .line 121
    :goto_0
    :try_start_0
    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    .line 122
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    .line 126
    invoke-virtual {p2}, Ljava/io/IOException;->printStackTrace()V

    .line 129
    :goto_1
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/DataResponse;)V
    .locals 3

    .line 134
    iget-boolean v0, p2, Lcom/shopkick/app/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/network/NetworkRequest;->getLocalContext()Ljava/util/Map;

    move-result-object v0

    const-string v1, "filename"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 137
    :try_start_0
    iget-object v1, p2, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v1, v1, [B

    if-eqz v1, :cond_0

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/fetchers/LocationListManager;->application:Landroid/app/Application;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/app/Application;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    .line 139
    iget-object p2, p2, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, [B

    check-cast p2, [B

    invoke-virtual {v1, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 140
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 145
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not save location list file "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    iget-object p2, p0, Lcom/shopkick/app/fetchers/LocationListManager;->application:Landroid/app/Application;

    invoke-virtual {p2, v0}, Landroid/app/Application;->deleteFile(Ljava/lang/String;)Z

    goto :goto_0

    .line 143
    :catch_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not create location list file "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    :cond_0
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/fetchers/LocationListManager;->pendingRequests:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 150
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/LocationListManager;->maybeUpdateLocationList()V

    return-void
.end method
