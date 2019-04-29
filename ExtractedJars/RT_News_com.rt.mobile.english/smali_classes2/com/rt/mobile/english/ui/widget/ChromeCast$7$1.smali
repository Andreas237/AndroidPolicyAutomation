.class Lcom/rt/mobile/english/ui/widget/ChromeCast$7$1;
.super Ljava/lang/Object;
.source "ChromeCast.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->onResult(Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/ui/widget/ChromeCast$7;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast$7;)V
    .locals 0

    .line 320
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7$1;->this$1:Lcom/rt/mobile/english/ui/widget/ChromeCast$7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;)V
    .locals 1

    .line 323
    invoke-interface {p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 324
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Media loaded successfully"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 320
    check-cast p1, Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast$7$1;->onResult(Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;)V

    return-void
.end method
