.class final Lcom/nytimes/android/external/cache/Futures$ChainingFuture;
.super Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;
.source "Futures.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/Futures;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ChainingFuture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture<",
        "TI;TO;",
        "Lcom/nytimes/android/external/cache/Function<",
        "-TI;+TO;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/ListenableFuture;Lcom/nytimes/android/external/cache/Function;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "+TI;>;",
            "Lcom/nytimes/android/external/cache/Function<",
            "-TI;+TO;>;)V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/Futures$AbstractChainingFuture;-><init>(Lcom/nytimes/android/external/cache/ListenableFuture;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method doTransform(Lcom/nytimes/android/external/cache/Function;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/nytimes/android/external/cache/Function;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/Function<",
            "-TI;+TO;>;TI;)V"
        }
    .end annotation

    .line 64
    invoke-interface {p1, p2}, Lcom/nytimes/android/external/cache/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/Futures$ChainingFuture;->set(Ljava/lang/Object;)Z

    return-void
.end method

.method bridge synthetic doTransform(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 57
    check-cast p1, Lcom/nytimes/android/external/cache/Function;

    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/Futures$ChainingFuture;->doTransform(Lcom/nytimes/android/external/cache/Function;Ljava/lang/Object;)V

    return-void
.end method
