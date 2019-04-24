.class Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;
.super Lnet/toddm/cache/CacheEntry;
.source "MemoryCacheProvider.java"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/cache/MemoryCacheProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CacheEntryWithEvictionScore"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/toddm/cache/CacheEntry;",
        "Ljava/lang/Comparable<",
        "Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;",
        ">;",
        "Ljava/util/Comparator<",
        "Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;",
        ">;"
    }
.end annotation


# instance fields
.field private _evictionScore:D

.field final synthetic this$0:Lnet/toddm/cache/MemoryCacheProvider;


# direct methods
.method public constructor <init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V
    .locals 19

    move-object/from16 v3, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    move-wide/from16 v14, p14

    move-object/from16 v16, p16

    move-object/from16 v17, v0

    move-object/from16 v0, p1

    .line 319
    iput-object v0, v3, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->this$0:Lnet/toddm/cache/MemoryCacheProvider;

    const/16 v18, 0x0

    move-object/from16 v3, v18

    move-object/from16 v0, v17

    .line 320
    invoke-direct/range {v0 .. v16}, Lnet/toddm/cache/CacheEntry;-><init>(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V

    .line 323
    invoke-virtual/range {p0 .. p0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static/range {p1 .. p1}, Lnet/toddm/cache/MemoryCacheProvider;->access$0(Lnet/toddm/cache/MemoryCacheProvider;)J

    move-result-wide v2

    move-object/from16 v4, p0

    invoke-virtual {v4, v0, v1, v2, v3}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->updateEvictionScore(JJ)V

    return-void
.end method

.method public constructor <init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V
    .locals 12

    move-object v10, p0

    move-object v11, p1

    .line 294
    iput-object v11, v10, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->this$0:Lnet/toddm/cache/MemoryCacheProvider;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p4

    move-wide/from16 v5, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    .line 295
    invoke-direct/range {v0 .. v9}, Lnet/toddm/cache/CacheEntry;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V

    .line 298
    invoke-virtual {p0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {p1}, Lnet/toddm/cache/MemoryCacheProvider;->access$0(Lnet/toddm/cache/MemoryCacheProvider;)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->updateEvictionScore(JJ)V

    return-void
.end method

.method public constructor <init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V
    .locals 19

    move-object/from16 v2, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    move-wide/from16 v14, p14

    move-object/from16 v16, p16

    move-object/from16 v17, v0

    move-object/from16 v0, p1

    .line 337
    iput-object v0, v2, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->this$0:Lnet/toddm/cache/MemoryCacheProvider;

    const/16 v18, 0x0

    move-object/from16 v2, v18

    move-object/from16 v0, v17

    .line 338
    invoke-direct/range {v0 .. v16}, Lnet/toddm/cache/CacheEntry;-><init>(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V

    .line 341
    invoke-virtual/range {p0 .. p0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static/range {p1 .. p1}, Lnet/toddm/cache/MemoryCacheProvider;->access$0(Lnet/toddm/cache/MemoryCacheProvider;)J

    move-result-wide v2

    move-object/from16 v4, p0

    invoke-virtual {v4, v0, v1, v2, v3}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->updateEvictionScore(JJ)V

    return-void
.end method

.method public constructor <init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V
    .locals 12

    move-object v10, p0

    move-object v11, p1

    .line 301
    iput-object v11, v10, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->this$0:Lnet/toddm/cache/MemoryCacheProvider;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p4

    move-wide/from16 v5, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    .line 302
    invoke-direct/range {v0 .. v9}, Lnet/toddm/cache/CacheEntry;-><init>(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V

    .line 305
    invoke-virtual {p0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {p1}, Lnet/toddm/cache/MemoryCacheProvider;->access$0(Lnet/toddm/cache/MemoryCacheProvider;)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->updateEvictionScore(JJ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    check-cast p2, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    invoke-virtual {p0, p1, p2}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->compare(Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;)I

    move-result p1

    return p1
.end method

.method public compare(Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;)I
    .locals 3

    .line 380
    invoke-virtual {p2}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getEvictionScore()D

    move-result-wide v0

    invoke-virtual {p1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getEvictionScore()D

    move-result-wide p1

    sub-double/2addr v0, p1

    const-wide/16 p1, 0x0

    cmpg-double v2, v0, p1

    if-gez v2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    cmpl-double p1, v0, p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    invoke-virtual {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->compareTo(Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;)I
    .locals 0

    .line 373
    invoke-virtual {p0, p0, p1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->compare(Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;)I

    move-result p1

    return p1
.end method

.method getEvictionScore()D
    .locals 2

    .line 344
    iget-wide v0, p0, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->_evictionScore:D

    return-wide v0
.end method

.method updateEvictionScore(JJ)V
    .locals 5

    cmp-long v0, p1, p3

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    if-eqz v0, :cond_0

    .line 362
    invoke-virtual {p0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v3, p3

    long-to-double v3, v3

    sub-long/2addr p1, p3

    long-to-double p1, p1

    div-double p1, v3, p1

    goto :goto_0

    :cond_0
    move-wide p1, v1

    .line 366
    :goto_0
    invoke-static {}, Lnet/toddm/cache/MemoryCacheProvider;->access$1()Ljava/util/Map;

    move-result-object p3

    invoke-virtual {p0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p3

    add-double/2addr p1, v1

    mul-double/2addr p3, p1

    iput-wide p3, p0, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->_evictionScore:D

    return-void
.end method
