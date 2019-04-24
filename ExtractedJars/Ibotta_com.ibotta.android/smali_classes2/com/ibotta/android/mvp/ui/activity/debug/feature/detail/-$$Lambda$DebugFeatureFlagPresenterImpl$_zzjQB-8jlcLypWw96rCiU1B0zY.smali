.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$_zzjQB-8jlcLypWw96rCiU1B0zY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Predicate;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$_zzjQB-8jlcLypWw96rCiU1B0zY;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$and(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava9/util/function/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/function/Predicate$-CC;->$default$negate(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$or(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$_zzjQB-8jlcLypWw96rCiU1B0zY;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;

    check-cast p1, Lcom/ibotta/android/features/TestConfig;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->lambda$onStart$0(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;Lcom/ibotta/android/features/TestConfig;)Z

    move-result p1

    return p1
.end method
