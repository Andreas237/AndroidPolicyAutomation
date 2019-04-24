.class public final synthetic Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$z6iuBQ2m6ePbUL2KMlp9CbQlMkA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BiConsumer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$z6iuBQ2m6ePbUL2KMlp9CbQlMkA;->f$0:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$z6iuBQ2m6ePbUL2KMlp9CbQlMkA;->f$0:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    check-cast p1, Lcom/ibotta/api/model/ContentModel;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

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
