.class public final synthetic Lcom/ibotta/android/tracking/network/-$$Lambda$i9kiJtG2CQHycz0GKwHVW1yBWNg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BiConsumer;


# instance fields
.field private final synthetic f$0:Lcom/squareup/okhttp/Request$Builder;


# direct methods
.method public synthetic constructor <init>(Lcom/squareup/okhttp/Request$Builder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/tracking/network/-$$Lambda$i9kiJtG2CQHycz0GKwHVW1yBWNg;->f$0:Lcom/squareup/okhttp/Request$Builder;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/tracking/network/-$$Lambda$i9kiJtG2CQHycz0GKwHVW1yBWNg;->f$0:Lcom/squareup/okhttp/Request$Builder;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

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
