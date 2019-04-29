.class Lcom/rt/mobile/english/ui/widget/ChromeCast$3;
.super Ljava/lang/Object;
.source "ChromeCast.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


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

    .line 156
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$3;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 3

    .line 162
    :try_start_0
    sget-object p1, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$3;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const-string v1, "CC1AD845"

    const/4 v2, 0x0

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/cast/Cast$CastApi;->launchApplication(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$3;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->access$100(Lcom/rt/mobile/english/ui/widget/ChromeCast;)Lcom/google/android/gms/common/api/ResultCallback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 166
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to launch application"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
