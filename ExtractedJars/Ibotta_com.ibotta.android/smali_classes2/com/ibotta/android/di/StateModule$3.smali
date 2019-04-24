.class Lcom/ibotta/android/di/StateModule$3;
.super Ljava/lang/Object;
.source "StateModule.java"

# interfaces
.implements Lcom/ibotta/android/state/app/AppCacheCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/di/StateModule;->provideAppCacheCallback(Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/state/app/AppCacheCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$appCache:Lcom/ibotta/android/appcache/AppCache;


# direct methods
.method constructor <init>(Lcom/ibotta/android/appcache/AppCache;)V
    .locals 0

    .line 300
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule$3;->val$appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/api/AppCacheListener;)V
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$3;->val$appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v0, p1}, Lcom/ibotta/android/appcache/AppCache;->addListener(Lcom/ibotta/api/AppCacheListener;)V

    return-void
.end method

.method public getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$3;->val$appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v0, p1}, Lcom/ibotta/android/appcache/AppCache;->getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    return-object p1
.end method
