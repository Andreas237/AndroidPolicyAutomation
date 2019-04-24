.class Lcom/twitter/sdk/android/core/identity/ShareEmailResultReceiver;
.super Landroid/os/ResultReceiver;
.source "ShareEmailResultReceiver.java"


# instance fields
.field private final callback:Lcom/twitter/sdk/android/core/Callback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/twitter/sdk/android/core/Callback<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public onReceiveResult(ILandroid/os/Bundle;)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 59
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid result code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 54
    :pswitch_0
    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/ShareEmailResultReceiver;->callback:Lcom/twitter/sdk/android/core/Callback;

    const-string v0, "error"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Lcom/twitter/sdk/android/core/TwitterException;

    invoke-virtual {p1, p2}, Lcom/twitter/sdk/android/core/Callback;->failure(Lcom/twitter/sdk/android/core/TwitterException;)V

    goto :goto_0

    .line 49
    :pswitch_1
    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/ShareEmailResultReceiver;->callback:Lcom/twitter/sdk/android/core/Callback;

    new-instance v0, Lcom/twitter/sdk/android/core/TwitterException;

    const-string v1, "msg"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/twitter/sdk/android/core/TwitterException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/twitter/sdk/android/core/Callback;->failure(Lcom/twitter/sdk/android/core/TwitterException;)V

    goto :goto_0

    .line 44
    :pswitch_2
    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/ShareEmailResultReceiver;->callback:Lcom/twitter/sdk/android/core/Callback;

    new-instance v0, Lcom/twitter/sdk/android/core/Result;

    const-string v1, "email"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/twitter/sdk/android/core/Result;-><init>(Ljava/lang/Object;Lretrofit/client/Response;)V

    invoke-virtual {p1, v0}, Lcom/twitter/sdk/android/core/Callback;->success(Lcom/twitter/sdk/android/core/Result;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
