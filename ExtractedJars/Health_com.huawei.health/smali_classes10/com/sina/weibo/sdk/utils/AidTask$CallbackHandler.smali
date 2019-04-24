.class Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/utils/AidTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CallbackHandler"
.end annotation


# instance fields
.field private callBackReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 93
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;->callBackReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;

    .line 111
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 113
    :sswitch_0
    if-eqz v1, :cond_0

    .line 114
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->cloneAidInfo()Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;->onAidGenSuccessed(Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)V

    goto :goto_0

    .line 118
    :sswitch_1
    if-eqz v1, :cond_0

    .line 119
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/sina/weibo/sdk/exception/WeiboException;

    invoke-interface {v1, v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;->onAidGenFailed(Ljava/lang/Exception;)V

    .line 125
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_1
    .end sparse-switch
.end method

.method public setCallback(Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;->callBackReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;->callBackReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;

    .line 98
    if-ne v1, p1, :cond_0

    .line 99
    return-void

    .line 101
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;->callBackReference:Ljava/lang/ref/WeakReference;

    .line 103
    goto :goto_0

    .line 104
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;->callBackReference:Ljava/lang/ref/WeakReference;

    .line 106
    :goto_0
    return-void
.end method
