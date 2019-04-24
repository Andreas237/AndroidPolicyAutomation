.class public final synthetic Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Ljava/lang/String;

.field private final synthetic f$1:J

.field private final synthetic f$2:I

.field private final synthetic f$3:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$0:Ljava/lang/String;

    iput-wide p2, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$1:J

    iput p4, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$2:I

    iput-object p5, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$3:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$0:Ljava/lang/String;

    iget-wide v1, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$1:J

    iget v3, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$2:I

    iget-object v4, p0, Lcom/ibotta/android/aop/tracking/-$$Lambda$MultipleTrackingClient$4zDa34-353390hzxZkp7jaS8B7E;->f$3:Ljava/util/Map;

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/tracking/TrackingClient;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/aop/tracking/MultipleTrackingClient;->lambda$logEvent$0(Ljava/lang/String;JILjava/util/Map;Lcom/ibotta/android/tracking/TrackingClient;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
