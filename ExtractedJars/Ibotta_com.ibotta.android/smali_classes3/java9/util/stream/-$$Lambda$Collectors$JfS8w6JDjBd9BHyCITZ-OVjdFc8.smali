.class public final synthetic Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BiConsumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/Function;

.field private final synthetic f$1:Ljava9/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/Function;Ljava9/util/function/Function;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;->f$0:Ljava9/util/function/Function;

    iput-object p2, p0, Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;->f$1:Ljava9/util/function/Function;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;->f$0:Ljava9/util/function/Function;

    iget-object v1, p0, Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;->f$1:Ljava9/util/function/Function;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/stream/Collectors;->lambda$uniqKeysMapAccumulator$81(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/BiConsumer;)Ljava9/util/function/BiConsumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiConsumer<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiConsumer<",
            "TT;TU;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiConsumer$-CC;->$default$andThen(Ljava9/util/function/BiConsumer;Ljava9/util/function/BiConsumer;)Ljava9/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
