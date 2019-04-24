.class public interface abstract Lcom/ibotta/android/appcache/CacheClearRunnableFactory;
.super Ljava/lang/Object;
.source "CacheClearRunnableFactory.java"


# virtual methods
.method public abstract createFor(Lcom/ibotta/android/appcache/CacheMask;)Ljava/lang/Runnable;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract createFor(Ljava/util/List;)Ljava/lang/Runnable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;)",
            "Ljava/lang/Runnable;"
        }
    .end annotation
.end method
