.class Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference$1;
.super Ljava/lang/Object;
.source "LocalCache.java"

# interfaces
.implements Lcom/nytimes/android/external/cache/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->loadFuture(Ljava/lang/Object;Lcom/nytimes/android/external/cache/CacheLoader;)Lcom/nytimes/android/external/cache/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/nytimes/android/external/cache/Function<",
        "TV;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;)V
    .locals 0

    .line 3564
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference$1;->this$0:Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .line 3567
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference$1;->this$0:Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;

    invoke-virtual {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->set(Ljava/lang/Object;)Z

    return-object p1
.end method
