.class Lcom/twitter/sdk/android/core/internal/AuthRequestQueue$1;
.super Lcom/twitter/sdk/android/core/Callback;
.source "AuthRequestQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->requestAuth()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/twitter/sdk/android/core/Callback<",
        "Lcom/twitter/sdk/android/core/Session;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue$1;->this$0:Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lcom/twitter/sdk/android/core/TwitterException;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue$1;->this$0:Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;

    invoke-virtual {v0, p1}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->flushQueueOnError(Lcom/twitter/sdk/android/core/TwitterException;)V

    return-void
.end method

.method public success(Lcom/twitter/sdk/android/core/Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Result<",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;)V"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue$1;->this$0:Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;

    iget-object p1, p1, Lcom/twitter/sdk/android/core/Result;->data:Ljava/lang/Object;

    check-cast p1, Lcom/twitter/sdk/android/core/Session;

    invoke-virtual {v0, p1}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->flushQueueOnSuccess(Lcom/twitter/sdk/android/core/Session;)V

    return-void
.end method
