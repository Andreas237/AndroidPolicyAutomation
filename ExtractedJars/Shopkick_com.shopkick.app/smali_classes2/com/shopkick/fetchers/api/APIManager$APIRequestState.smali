.class Lcom/shopkick/fetchers/api/APIManager$APIRequestState;
.super Ljava/lang/Object;
.source "APIManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/api/APIManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "APIRequestState"
.end annotation


# instance fields
.field private final cachingBehavior:Lnet/toddm/comm/CacheBehavior;

.field private final cachingPriority:Lnet/toddm/cache/CachePriority;

.field public callback:Lcom/shopkick/fetchers/api/IAPICallback;

.field private final domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

.field public isBackgroundRequest:Z

.field private final isIdempotent:Z

.field public networkRequest:Lcom/shopkick/fetchers/network/NetworkRequest;

.field private final networkWork:Lnet/toddm/comm/SubmittableWork;

.field public nextHandlerIndex:I

.field private final requestPriority:Lnet/toddm/comm/Priority$StartingPriority;

.field public response:Lcom/shopkick/fetchers/DataResponse;

.field final synthetic this$0:Lcom/shopkick/fetchers/api/APIManager;


# direct methods
.method constructor <init>(Lcom/shopkick/fetchers/api/APIManager;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/comm/SubmittableWork;Lcom/shopkick/fetchers/api/RequestDomainId;)V
    .locals 0

    .line 1300
    iput-object p1, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1301
    iput-boolean p2, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->isIdempotent:Z

    .line 1302
    iput-object p3, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->requestPriority:Lnet/toddm/comm/Priority$StartingPriority;

    .line 1303
    iput-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->cachingPriority:Lnet/toddm/cache/CachePriority;

    .line 1304
    iput-object p5, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    .line 1305
    iput-object p6, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 1306
    iput-object p7, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    return-void
.end method


# virtual methods
.method getCachingBehavior()Lnet/toddm/comm/CacheBehavior;
    .locals 1

    .line 1312
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    return-object v0
.end method

.method getCachingPriority()Lnet/toddm/cache/CachePriority;
    .locals 1

    .line 1311
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->cachingPriority:Lnet/toddm/cache/CachePriority;

    return-object v0
.end method

.method getNetworkWork()Lnet/toddm/comm/SubmittableWork;
    .locals 1

    .line 1313
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->networkWork:Lnet/toddm/comm/SubmittableWork;

    return-object v0
.end method

.method getRequestDomainId()Lcom/shopkick/fetchers/api/RequestDomainId;
    .locals 1

    .line 1314
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    return-object v0
.end method

.method getRequestPriority()Lnet/toddm/comm/Priority$StartingPriority;
    .locals 1

    .line 1310
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->requestPriority:Lnet/toddm/comm/Priority$StartingPriority;

    return-object v0
.end method

.method isIdempotent()Z
    .locals 1

    .line 1309
    iget-boolean v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIRequestState;->isIdempotent:Z

    return v0
.end method
