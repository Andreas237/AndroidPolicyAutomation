.class public Lnet/toddm/cache/CacheEntryLastUseComparator;
.super Ljava/lang/Object;
.source "CacheEntryLastUseComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lnet/toddm/cache/CacheEntry;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lnet/toddm/cache/CacheEntry;

    check-cast p2, Lnet/toddm/cache/CacheEntry;

    invoke-virtual {p0, p1, p2}, Lnet/toddm/cache/CacheEntryLastUseComparator;->compare(Lnet/toddm/cache/CacheEntry;Lnet/toddm/cache/CacheEntry;)I

    move-result p1

    return p1
.end method

.method public compare(Lnet/toddm/cache/CacheEntry;Lnet/toddm/cache/CacheEntry;)I
    .locals 4

    .line 31
    invoke-virtual {p2}, Lnet/toddm/cache/CacheEntry;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, Lnet/toddm/cache/CacheEntry;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    if-nez v0, :cond_0

    .line 33
    invoke-virtual {p2}, Lnet/toddm/cache/CacheEntry;->getTimestampModified()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, Lnet/toddm/cache/CacheEntry;->getTimestampModified()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    sub-long/2addr v0, p1

    long-to-int v0, v0

    :cond_0
    return v0
.end method
