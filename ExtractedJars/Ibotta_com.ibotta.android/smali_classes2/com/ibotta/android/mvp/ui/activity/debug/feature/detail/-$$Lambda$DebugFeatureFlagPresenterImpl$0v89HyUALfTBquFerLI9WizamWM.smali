.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$0v89HyUALfTBquFerLI9WizamWM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$0v89HyUALfTBquFerLI9WizamWM;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$0v89HyUALfTBquFerLI9WizamWM;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->lambda$onStart$1(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;Ljava/lang/String;)V

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
