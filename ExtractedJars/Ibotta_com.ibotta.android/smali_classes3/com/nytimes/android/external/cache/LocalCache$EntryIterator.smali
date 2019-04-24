.class final Lcom/nytimes/android/external/cache/LocalCache$EntryIterator;
.super Lcom/nytimes/android/external/cache/LocalCache$HashIterator;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "EntryIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/LocalCache<",
        "TK;TV;>.HashIterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;)V
    .locals 0

    .line 4484
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$EntryIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;-><init>(Lcom/nytimes/android/external/cache/LocalCache;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 4484
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$EntryIterator;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 4489
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$EntryIterator;->nextEntry()Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    move-result-object v0

    return-object v0
.end method
