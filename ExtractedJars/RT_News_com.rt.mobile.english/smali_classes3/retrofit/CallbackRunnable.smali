.class abstract Lretrofit/CallbackRunnable;
.super Ljava/lang/Object;
.source "CallbackRunnable.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private final callback:Lretrofit/Callback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit/Callback<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final callbackExecutor:Ljava/util/concurrent/Executor;

.field private final errorHandler:Lretrofit/ErrorHandler;


# direct methods
.method constructor <init>(Lretrofit/Callback;Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit/Callback<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            "Lretrofit/ErrorHandler;",
            ")V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lretrofit/CallbackRunnable;->callback:Lretrofit/Callback;

    .line 35
    iput-object p2, p0, Lretrofit/CallbackRunnable;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 36
    iput-object p3, p0, Lretrofit/CallbackRunnable;->errorHandler:Lretrofit/ErrorHandler;

    return-void
.end method

.method static synthetic access$000(Lretrofit/CallbackRunnable;)Lretrofit/Callback;
    .locals 0

    .line 28
    iget-object p0, p0, Lretrofit/CallbackRunnable;->callback:Lretrofit/Callback;

    return-object p0
.end method


# virtual methods
.method public abstract obtainResponse()Lretrofit/ResponseWrapper;
.end method

.method public final run()V
    .locals 3

    .line 42
    :try_start_0
    invoke-virtual {p0}, Lretrofit/CallbackRunnable;->obtainResponse()Lretrofit/ResponseWrapper;

    move-result-object v0

    .line 43
    iget-object v1, p0, Lretrofit/CallbackRunnable;->callbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v2, Lretrofit/CallbackRunnable$1;

    invoke-direct {v2, p0, v0}, Lretrofit/CallbackRunnable$1;-><init>(Lretrofit/CallbackRunnable;Lretrofit/ResponseWrapper;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lretrofit/RetrofitError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 49
    iget-object v1, p0, Lretrofit/CallbackRunnable;->errorHandler:Lretrofit/ErrorHandler;

    invoke-interface {v1, v0}, Lretrofit/ErrorHandler;->handleError(Lretrofit/RetrofitError;)Ljava/lang/Throwable;

    move-result-object v1

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, Lretrofit/RetrofitError;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lretrofit/RetrofitError;->unexpectedError(Ljava/lang/String;Ljava/lang/Throwable;)Lretrofit/RetrofitError;

    move-result-object v0

    .line 51
    :goto_0
    iget-object v1, p0, Lretrofit/CallbackRunnable;->callbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v2, Lretrofit/CallbackRunnable$2;

    invoke-direct {v2, p0, v0}, Lretrofit/CallbackRunnable$2;-><init>(Lretrofit/CallbackRunnable;Lretrofit/RetrofitError;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method
