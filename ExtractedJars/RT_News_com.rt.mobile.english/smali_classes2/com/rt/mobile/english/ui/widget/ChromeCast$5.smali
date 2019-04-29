.class Lcom/rt/mobile/english/ui/widget/ChromeCast$5;
.super Lcom/google/android/gms/cast/Cast$Listener;
.source "ChromeCast.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-direct {p0}, Lcom/google/android/gms/cast/Cast$Listener;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplicationDisconnected(I)V
    .locals 2

    .line 259
    :try_start_0
    sget-object p1, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const-string v1, "urn:x-cast:com.rt.mobile.english"

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/cast/Cast$CastApi;->removeMessageReceivedCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 263
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Exception while launching application"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 265
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->access$000(Lcom/rt/mobile/english/ui/widget/ChromeCast;Lcom/google/android/gms/cast/CastDevice;)V

    return-void
.end method

.method public onVolumeChanged()V
    .locals 4

    .line 271
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 273
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onVolumeChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object v3, v3, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v2, v3}, Lcom/google/android/gms/cast/Cast$CastApi;->getVolume(Lcom/google/android/gms/common/api/GoogleApiClient;)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
