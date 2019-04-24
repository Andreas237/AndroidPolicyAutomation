.class public final synthetic Ljava9/util/stream/-$$Lambda$DistinctOps$1$hFTOlc8Tivj7uKmg4YuOhmRTKxc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final synthetic f$1:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ConcurrentMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/stream/-$$Lambda$DistinctOps$1$hFTOlc8Tivj7uKmg4YuOhmRTKxc;->f$0:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Ljava9/util/stream/-$$Lambda$DistinctOps$1$hFTOlc8Tivj7uKmg4YuOhmRTKxc;->f$1:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ljava9/util/stream/-$$Lambda$DistinctOps$1$hFTOlc8Tivj7uKmg4YuOhmRTKxc;->f$0:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Ljava9/util/stream/-$$Lambda$DistinctOps$1$hFTOlc8Tivj7uKmg4YuOhmRTKxc;->f$1:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v0, v1, p1}, Ljava9/util/stream/DistinctOps$1;->lambda$opEvaluateParallel$71(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;)V

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
