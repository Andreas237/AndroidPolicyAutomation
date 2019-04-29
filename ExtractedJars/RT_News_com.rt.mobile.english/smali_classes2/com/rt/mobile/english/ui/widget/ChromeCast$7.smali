.class Lcom/rt/mobile/english/ui/widget/ChromeCast$7;
.super Ljava/lang/Object;
.source "ChromeCast.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast;->playVideo(Ljava/lang/String;Ljava/lang/String;I)V
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
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

.field final synthetic val$streemType:I

.field final synthetic val$title:Ljava/lang/String;

.field final synthetic val$videoURI:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->val$videoURI:Ljava/lang/String;

    iput p4, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->val$streemType:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;)V
    .locals 3

    .line 308
    invoke-interface {p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result p1

    if-nez p1, :cond_0

    .line 309
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to request status."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 311
    :cond_0
    new-instance p1, Lcom/google/android/gms/cast/MediaMetadata;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/google/android/gms/cast/MediaMetadata;-><init>(I)V

    const-string v1, "com.google.android.gms.cast.metadata.TITLE"

    .line 312
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->val$title:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/cast/MediaMetadata;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    new-instance v1, Lcom/google/android/gms/cast/MediaInfo$Builder;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->val$videoURI:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/cast/MediaInfo$Builder;-><init>(Ljava/lang/String;)V

    const-string v2, "video/mp4"

    .line 314
    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/MediaInfo$Builder;->setContentType(Ljava/lang/String;)Lcom/google/android/gms/cast/MediaInfo$Builder;

    move-result-object v1

    iget v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->val$streemType:I

    .line 315
    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/MediaInfo$Builder;->setStreamType(I)Lcom/google/android/gms/cast/MediaInfo$Builder;

    move-result-object v1

    .line 316
    invoke-virtual {v1, p1}, Lcom/google/android/gms/cast/MediaInfo$Builder;->setMetadata(Lcom/google/android/gms/cast/MediaMetadata;)Lcom/google/android/gms/cast/MediaInfo$Builder;

    move-result-object p1

    .line 317
    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaInfo$Builder;->build()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object p1

    .line 319
    :try_start_0
    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;Z)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$7$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$7$1;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast$7;)V

    .line 320
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 331
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Problem opening media during loading"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 329
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Problem occurred with media during loading"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 305
    check-cast p1, Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;->onResult(Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;)V

    return-void
.end method
