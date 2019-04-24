.class public Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;
.super Ljava/lang/Object;
.source "ButtonSdkCacheRemover.java"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method protected createCustomerButtonTxsCall(IIJLjava/lang/String;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;
    .locals 7

    .line 30
    new-instance v6, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method

.method public getAppCache()Lcom/ibotta/android/appcache/AppCache;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->appCache:Lcom/ibotta/android/appcache/AppCache;

    return-object v0
.end method

.method public getUserState()Lcom/ibotta/android/state/user/UserState;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->userState:Lcom/ibotta/android/state/user/UserState;

    return-object v0
.end method

.method public remove(IJLjava/lang/String;)V
    .locals 7

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    move-object v1, p0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 35
    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->createCustomerButtonTxsCall(IIJLjava/lang/String;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;

    move-result-object p1

    .line 36
    iget-object p2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->appCache:Lcom/ibotta/android/appcache/AppCache;

    const/4 p3, 0x1

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/appcache/AppCache;->removeOrInvalidate(Lcom/ibotta/api/CacheableApiCall;Z)V

    return-void
.end method
