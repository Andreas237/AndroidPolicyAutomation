.class public Lcom/ibotta/android/aop/tracking/MultipleTrackingClient;
.super Ljava/lang/Object;
.source "MultipleTrackingClient.java"

# interfaces
.implements Lcom/ibotta/android/tracking/TrackingClient;


# instance fields
.field private final clients:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/tracking/TrackingClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>([Lcom/ibotta/android/tracking/TrackingClient;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {p1}, Ljava9/util/Sets;->of([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/MultipleTrackingClient;->clients:Ljava/util/Set;

    return-void
.end method

.method static synthetic lambda$logEvent$0(Ljava/lang/String;JILjava/util/Map;Lcom/ibotta/android/tracking/TrackingClient;)V
    .locals 6

    move-object v0, p5

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    .line 22
    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/tracking/TrackingClient;->logEvent(Ljava/lang/String;JILjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public logEvent(Ljava/lang/String;JILjava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/MultipleTrackingClient;->clients:Ljava/util/Set;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/aop/tracking/-$$Lambda$bXQPF2iQiqwgK3VPvhmgEuoicic;->INSTANCE:Lcom/ibotta/android/aop/tracking/-$$Lambda$bXQPF2iQiqwgK3VPvhmgEuoicic;

    .line 21
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v7, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;-><init>(Ljava/lang/String;JILjava/util/Map;)V

    .line 22
    invoke-interface {v0, v7}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method
