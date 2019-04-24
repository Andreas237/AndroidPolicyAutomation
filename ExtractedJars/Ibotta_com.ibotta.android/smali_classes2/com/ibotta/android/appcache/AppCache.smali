.class public interface abstract Lcom/ibotta/android/appcache/AppCache;
.super Ljava/lang/Object;
.source "AppCache.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;
.implements Lcom/ibotta/api/ApiCache;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/ibotta/api/CacheableApiCall;",
        "V:",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/state/user/LogOutListener;",
        "Lcom/ibotta/api/ApiCache<",
        "TC;TV;>;"
    }
.end annotation


# virtual methods
.method public abstract addListener(Lcom/ibotta/api/AppCacheListener;)V
.end method

.method public abstract buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public abstract getCacheDir()Ljava/io/File;
.end method

.method public abstract getDiskIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TV;"
        }
    .end annotation
.end method

.method public abstract getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TV;"
        }
    .end annotation
.end method

.method public abstract getWorkDir()Ljava/io/File;
.end method

.method public abstract isExpiredOrHasNewer(Lcom/ibotta/api/CacheableApiCall;J)Z
.end method

.method public abstract removeListener(Lcom/ibotta/api/AppCacheListener;)V
.end method

.method public abstract removeMemAll()V
.end method

.method public abstract removeOrInvalidate(Lcom/ibotta/api/CacheableApiCall;Z)V
.end method

.method public abstract replaceOfferProductsUpcs(ILjava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract updateBgcTransactionById(ILcom/ibotta/api/call/pwi/BgcTransactionResponse;)V
.end method

.method public abstract updateCustomer(ILcom/ibotta/api/call/customer/CustomerByIdResponse;)V
.end method

.method public abstract updateCustomerPaymentAccounts(ILcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;Z)V
.end method

.method public abstract updateCustomerSettings(ILcom/ibotta/api/call/customer/CustomerSettingsPutResponse;)V
.end method
