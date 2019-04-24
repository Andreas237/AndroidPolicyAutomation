.class final Lcom/nytimes/android/external/cache/LocalCache$ValueIterator;
.super Lcom/nytimes/android/external/cache/LocalCache$HashIterator;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ValueIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/LocalCache<",
        "TK;TV;>.HashIterator<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;)V
    .locals 0

    .line 4421
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$ValueIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;-><init>(Lcom/nytimes/android/external/cache/LocalCache;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 4425
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$ValueIterator;->nextEntry()Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
