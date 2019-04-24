.class Lnet/toddm/cache/MemoryCacheProvider$1;
.super Ljava/util/HashMap;
.source "MemoryCacheProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/cache/MemoryCacheProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Lnet/toddm/cache/CachePriority;",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(I)V
    .locals 2

    .line 42
    invoke-direct {p0, p1}, Ljava/util/HashMap;-><init>(I)V

    .line 43
    sget-object p1, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/toddm/cache/MemoryCacheProvider$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object p1, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide v0, 0x3fe999999999999aL    # 0.8

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/toddm/cache/MemoryCacheProvider$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object p1, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/toddm/cache/MemoryCacheProvider$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
