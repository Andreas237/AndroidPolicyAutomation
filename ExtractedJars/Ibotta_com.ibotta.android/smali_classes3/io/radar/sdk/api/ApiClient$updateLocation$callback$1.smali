.class final Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ApiClient.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiClient;->updateLocation(Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/radar/sdk/api/RadarResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient$updateLocation$callback$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,268:1\n18#2:269\n25#3,2:270\n*E\n*S KotlinDebug\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient$updateLocation$callback$1\n*L\n154#1:269\n154#1,2:270\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "response",
        "Lio/radar/sdk/api/RadarResponse;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic $completionCallback:Lkotlin/jvm/functions/Function0;

.field final synthetic $foreground:Z

.field final synthetic $location:Landroid/location/Location;

.field final synthetic $replayed:Z

.field final synthetic $stopped:Z

.field final synthetic this$0:Lio/radar/sdk/api/ApiClient;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiClient;ZZLandroid/location/Location;ZLkotlin/jvm/functions/Function0;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    iput-boolean p2, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$stopped:Z

    iput-boolean p3, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$foreground:Z

    iput-object p4, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$location:Landroid/location/Location;

    iput-boolean p5, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$replayed:Z

    iput-object p6, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$completionCallback:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 49
    check-cast p1, Lio/radar/sdk/api/RadarResponse;

    invoke-virtual {p0, p1}, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->invoke(Lio/radar/sdk/api/RadarResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/radar/sdk/api/RadarResponse;)V
    .locals 6
    .param p1    # Lio/radar/sdk/api/RadarResponse;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    instance-of v0, p1, Lio/radar/sdk/api/Success;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 149
    sget-object v0, Lio/radar/sdk/api/LocationWorker;->Companion:Lio/radar/sdk/api/LocationWorker$Companion;

    invoke-virtual {v0}, Lio/radar/sdk/api/LocationWorker$Companion;->cancelWork$sdk_release()V

    .line 150
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClient;->access$getRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v0

    check-cast v1, Landroid/location/Location;

    invoke-virtual {v0, v1}, Lio/radar/sdk/api/ApiClientRepository;->setLastFailedStop$sdk_release(Landroid/location/Location;)V

    .line 152
    check-cast p1, Lio/radar/sdk/api/Success;

    invoke-virtual {p1}, Lio/radar/sdk/api/Success;->getUser()Lio/radar/sdk/model/RadarUser;

    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUser;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 154
    :goto_0
    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUser;->getGeofences()[Lio/radar/sdk/model/RadarGeofence;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 271
    :cond_1
    new-array v4, v3, [Lio/radar/sdk/model/RadarGeofence;

    .line 154
    :goto_1
    array-length v4, v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    xor-int/2addr v4, v2

    .line 155
    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUser;->getInsights()Lio/radar/sdk/model/RadarUserInsights;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUserInsights;->getState()Lio/radar/sdk/model/RadarUserInsightsState;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUserInsightsState;->getHome()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUserInsightsState;->getOffice()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    .line 157
    :goto_3
    iget-object v5, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v5}, Lio/radar/sdk/api/ApiClient;->access$getRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v5

    invoke-virtual {v5, v1}, Lio/radar/sdk/api/ApiClientRepository;->setAtPlace$sdk_release(Z)V

    .line 158
    iget-object v5, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v5}, Lio/radar/sdk/api/ApiClient;->access$getRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v5

    if-nez v1, :cond_6

    if-nez v4, :cond_6

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :cond_6
    :goto_4
    invoke-virtual {v5, v2}, Lio/radar/sdk/api/ApiClientRepository;->setCanExit$sdk_release(Z)V

    .line 160
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    sget-object v1, Lio/radar/sdk/Radar$RadarStatus;->SUCCESS:Lio/radar/sdk/Radar$RadarStatus;

    invoke-virtual {p1}, Lio/radar/sdk/api/Success;->getLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {p1}, Lio/radar/sdk/api/Success;->getEvents()[Lio/radar/sdk/model/RadarEvent;

    move-result-object v3

    invoke-virtual {p1}, Lio/radar/sdk/api/Success;->getUser()Lio/radar/sdk/model/RadarUser;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lio/radar/sdk/api/ApiClient;->deliverResult$sdk_release(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    .line 161
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-virtual {p1}, Lio/radar/sdk/api/Success;->getPayload()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p1}, Lio/radar/sdk/api/Success;->getLocation()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/radar/sdk/api/ApiClient;->broadcastSuccess$sdk_release(Lorg/json/JSONObject;Landroid/location/Location;)V

    goto :goto_5

    .line 163
    :cond_7
    instance-of v0, p1, Lio/radar/sdk/api/Error;

    if-eqz v0, :cond_a

    .line 165
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClient;->access$getOptionsRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/internal/repository/OptionsRepository;

    move-result-object v0

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getOfflineMode$sdk_release()Lio/radar/sdk/Radar$RadarTrackingOffline;

    move-result-object v0

    sget-object v2, Lio/radar/sdk/Radar$RadarTrackingOffline;->REPLAY_STOPPED:Lio/radar/sdk/Radar$RadarTrackingOffline;

    if-ne v0, v2, :cond_8

    iget-boolean v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$stopped:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$foreground:Z

    if-nez v0, :cond_8

    move-object v0, p1

    check-cast v0, Lio/radar/sdk/api/Error;

    invoke-virtual {v0}, Lio/radar/sdk/api/Error;->getStatus()Lio/radar/sdk/Radar$RadarStatus;

    move-result-object v0

    sget-object v2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_NETWORK:Lio/radar/sdk/Radar$RadarStatus;

    if-ne v0, v2, :cond_8

    .line 166
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClient;->access$getRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v0

    iget-object v2, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$location:Landroid/location/Location;

    invoke-virtual {v0, v2}, Lio/radar/sdk/api/ApiClientRepository;->setLastFailedStop$sdk_release(Landroid/location/Location;)V

    .line 167
    sget-object v0, Lio/radar/sdk/api/LocationWorker;->Companion:Lio/radar/sdk/api/LocationWorker$Companion;

    invoke-virtual {v0}, Lio/radar/sdk/api/LocationWorker$Companion;->scheduleWork$sdk_release()V

    .line 170
    :cond_8
    iget-boolean v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$replayed:Z

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, Lio/radar/sdk/api/Error;

    invoke-virtual {v0}, Lio/radar/sdk/api/Error;->getStatus()Lio/radar/sdk/Radar$RadarStatus;

    move-result-object v0

    sget-object v2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    if-ne v0, v2, :cond_9

    .line 171
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClient;->access$getRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v0

    move-object v2, v1

    check-cast v2, Landroid/location/Location;

    invoke-virtual {v0, v2}, Lio/radar/sdk/api/ApiClientRepository;->setLastFailedStop$sdk_release(Landroid/location/Location;)V

    .line 172
    sget-object v0, Lio/radar/sdk/api/LocationWorker;->Companion:Lio/radar/sdk/api/LocationWorker$Companion;

    invoke-virtual {v0}, Lio/radar/sdk/api/LocationWorker$Companion;->cancelWork$sdk_release()V

    .line 175
    :cond_9
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    check-cast p1, Lio/radar/sdk/api/Error;

    invoke-virtual {p1}, Lio/radar/sdk/api/Error;->getStatus()Lio/radar/sdk/Radar$RadarStatus;

    move-result-object v2

    invoke-virtual {v0, v2, v1, v1, v1}, Lio/radar/sdk/api/ApiClient;->deliverResult$sdk_release(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    .line 176
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-virtual {p1}, Lio/radar/sdk/api/Error;->getStatus()Lio/radar/sdk/Radar$RadarStatus;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/radar/sdk/api/ApiClient;->broadcastError$sdk_release(Lio/radar/sdk/Radar$RadarStatus;)V

    .line 179
    :cond_a
    :goto_5
    iget-object p1, p0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;->$completionCallback:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method
