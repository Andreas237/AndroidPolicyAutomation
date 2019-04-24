.class public Lorg/researchstack/backbone/utils/ObservableUtils;
.super Ljava/lang/Object;
.source "ObservableUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static applyDefault()Lrx/Observable$Transformer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lrx/Observable$Transformer",
            "<TT;TT;>;"
        }
    .end annotation

    .prologue
    .line 12
    invoke-static {}, Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;->lambdaFactory$()Lrx/Observable$Transformer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$applyDefault$42(Lrx/Observable;)Lrx/Observable;
    .locals 2
    .param p0, "observable"    # Lrx/Observable;

    .prologue
    .line 12
    invoke-static {}, Lrx/schedulers/Schedulers;->io()Lrx/Scheduler;

    move-result-object v0

    invoke-virtual {p0, v0}, Lrx/Observable;->subscribeOn(Lrx/Scheduler;)Lrx/Observable;

    move-result-object v0

    .line 13
    invoke-static {}, Lrx/android/schedulers/AndroidSchedulers;->mainThread()Lrx/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrx/Observable;->observeOn(Lrx/Scheduler;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method
