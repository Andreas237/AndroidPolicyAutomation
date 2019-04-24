.class public Lcom/shopkick/app/fetchers/certificates/CertificatesManager;
.super Ljava/lang/Object;
.source "CertificatesManager.java"

# interfaces
.implements Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;


# static fields
.field public static final CERTIFICATE_FETCH_FAILED:Ljava/lang/String; = "certificate fetch failed"

.field public static final CERTIFICATE_FETCH_SUCCESSFUL:Ljava/lang/String; = "certificate fetch successful"


# instance fields
.field private apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

.field private flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private request:Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 32
    iput-object p3, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v0, p0}, Lcom/shopkick/app/SKPersistentCache/APICache;->cancelRequestsForTarget(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    .line 40
    iput-object v0, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 41
    iput-object v0, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public fetchFailed(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 0

    const/4 p1, 0x0

    .line 105
    iput-object p1, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->request:Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "certificate fetch failed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public getRequestForCacheKeysAndPartitionType(Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;"
        }
    .end annotation

    .line 79
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->request:Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;

    .line 80
    iget-object p2, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->request:Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;->cacheKeys:Ljava/util/List;

    return-object p2
.end method

.method public parseResponse(Ljava/lang/Object;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 86
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetCertificateResponse;

    .line 87
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_0

    .line 88
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCertificateResponse;->certificates:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 89
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCertificateResponse;->certificates:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/Certificate;

    .line 90
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/Certificate;->certificateToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public receivedObjects(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->request:Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;

    .line 99
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "certificate fetch successful"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method public requestCertificateWithId(Ljava/lang/String;)V
    .locals 1

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->requestCertificatesWithIds(Ljava/util/ArrayList;)V

    return-void
.end method

.method public requestCertificatesWithIds(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->request:Lcom/shopkick/app/fetchers/api/skapi/GetCertificateRequest;

    if-eqz v0, :cond_0

    return-void

    .line 55
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 57
    iget-object v2, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->certificateTokens:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 58
    iget-object v2, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->certificateTokens:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 59
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 60
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    return-void

    .line 70
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {p1, p0, v0, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->fetchObjectsForTokensWithPartition(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method
