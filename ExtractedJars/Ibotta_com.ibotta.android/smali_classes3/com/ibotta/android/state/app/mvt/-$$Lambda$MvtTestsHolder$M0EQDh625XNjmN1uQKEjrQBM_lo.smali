.class public final synthetic Lcom/ibotta/android/state/app/mvt/-$$Lambda$MvtTestsHolder$M0EQDh625XNjmN1uQKEjrQBM_lo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/app/mvt/-$$Lambda$MvtTestsHolder$M0EQDh625XNjmN1uQKEjrQBM_lo;->f$0:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/-$$Lambda$MvtTestsHolder$M0EQDh625XNjmN1uQKEjrQBM_lo;->f$0:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    check-cast p1, Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;

    invoke-static {v0, p1}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->lambda$notifyListeners$0(Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;)V

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
