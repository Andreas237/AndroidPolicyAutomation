.class public abstract Lcom/twitter/sdk/android/core/Callback;
.super Ljava/lang/Object;
.source "Callback.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lretrofit/Callback<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract failure(Lcom/twitter/sdk/android/core/TwitterException;)V
.end method

.method public final failure(Lretrofit/RetrofitError;)V
    .locals 0

    .line 45
    invoke-static {p1}, Lcom/twitter/sdk/android/core/TwitterApiException;->convert(Lretrofit/RetrofitError;)Lcom/twitter/sdk/android/core/TwitterApiException;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/Callback;->failure(Lcom/twitter/sdk/android/core/TwitterException;)V

    return-void
.end method

.method public abstract success(Lcom/twitter/sdk/android/core/Result;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Result<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public final success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/twitter/sdk/android/core/Result;

    invoke-direct {v0, p1, p2}, Lcom/twitter/sdk/android/core/Result;-><init>(Ljava/lang/Object;Lretrofit/client/Response;)V

    invoke-virtual {p0, v0}, Lcom/twitter/sdk/android/core/Callback;->success(Lcom/twitter/sdk/android/core/Result;)V

    return-void
.end method
