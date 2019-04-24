.class Lcom/ibotta/android/appcache/AppCacheImpl$1;
.super Ljava/lang/Object;
.source "AppCacheImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/appcache/AppCacheImpl;->notifyCachedResponseSaved(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

.field final synthetic val$cacheable:Lcom/ibotta/api/CacheableApiCall;

.field final synthetic val$cachedResponse:Lcom/ibotta/api/CacheableApiResponse;

.field final synthetic val$replace:Z


# direct methods
.method constructor <init>(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    .locals 0

    .line 862
    iput-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iput-object p2, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->val$cacheable:Lcom/ibotta/api/CacheableApiCall;

    iput-object p3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->val$cachedResponse:Lcom/ibotta/api/CacheableApiResponse;

    iput-boolean p4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->val$replace:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 864
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$100(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/AppCacheListener;

    .line 866
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->val$cacheable:Lcom/ibotta/api/CacheableApiCall;

    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->val$cachedResponse:Lcom/ibotta/api/CacheableApiResponse;

    iget-boolean v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$1;->val$replace:Z

    invoke-interface {v1, v2, v3, v4}, Lcom/ibotta/api/AppCacheListener;->onSaveCachedResponse(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Listener failed to handle onSaveCachedResponse: %1$s"

    const/4 v4, 0x1

    .line 868
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    .line 868
    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method
