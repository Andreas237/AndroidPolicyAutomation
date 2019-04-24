.class public final synthetic Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Z

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;->f$0:Z

    iput-boolean p2, p0, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;->f$1:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;->f$0:Z

    iget-boolean v1, p0, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;->f$1:Z

    check-cast p1, Lcom/ibotta/android/api/critical/CriticalDependency;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;->lambda$onAppLaunched$0(ZZLcom/ibotta/android/api/critical/CriticalDependency;)V

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
