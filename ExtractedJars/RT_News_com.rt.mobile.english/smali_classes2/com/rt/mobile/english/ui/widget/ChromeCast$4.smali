.class Lcom/rt/mobile/english/ui/widget/ChromeCast$4;
.super Ljava/lang/Object;
.source "ChromeCast.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;)V
    .locals 1

    .line 220
    invoke-interface {p1}, Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    .line 221
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 223
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    .line 225
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer;

    invoke-direct {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;-><init>()V

    iput-object v0, p1, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    .line 226
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$4$1;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast$4;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->setOnStatusUpdatedListener(Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;)V

    .line 234
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4$2;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$4$2;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast$4;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->setOnMetadataUpdatedListener(Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;)V

    .line 242
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->access$200(Lcom/rt/mobile/english/ui/widget/ChromeCast;)Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    move-result-object p1

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;->onChromecastConnected()V

    :cond_0
    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 216
    check-cast p1, Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->onResult(Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;)V

    return-void
.end method
