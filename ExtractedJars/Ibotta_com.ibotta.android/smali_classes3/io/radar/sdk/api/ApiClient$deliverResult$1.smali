.class final Lio/radar/sdk/api/ApiClient$deliverResult$1;
.super Ljava/lang/Object;
.source "ApiClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiClient;->deliverResult$sdk_release(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient$deliverResult$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,268:1\n1491#2,2:269\n*E\n*S KotlinDebug\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient$deliverResult$1\n*L\n226#1,2:269\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic $events:[Lio/radar/sdk/model/RadarEvent;

.field final synthetic $location:Landroid/location/Location;

.field final synthetic $status:Lio/radar/sdk/Radar$RadarStatus;

.field final synthetic $user:Lio/radar/sdk/model/RadarUser;

.field final synthetic this$0:Lio/radar/sdk/api/ApiClient;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiClient;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->this$0:Lio/radar/sdk/api/ApiClient;

    iput-object p2, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$status:Lio/radar/sdk/Radar$RadarStatus;

    iput-object p3, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$location:Landroid/location/Location;

    iput-object p4, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$events:[Lio/radar/sdk/model/RadarEvent;

    iput-object p5, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$user:Lio/radar/sdk/model/RadarUser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 226
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->this$0:Lio/radar/sdk/api/ApiClient;

    monitor-enter v0

    .line 227
    :try_start_0
    iget-object v1, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v1}, Lio/radar/sdk/api/ApiClient;->access$getHandler$p(Lio/radar/sdk/api/ApiClient;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 228
    iget-object v1, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v1}, Lio/radar/sdk/api/ApiClient;->access$getCallbacks$p(Lio/radar/sdk/api/ApiClient;)Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 269
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/radar/sdk/Radar$RadarCallback;

    .line 229
    iget-object v3, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$status:Lio/radar/sdk/Radar$RadarStatus;

    iget-object v4, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$location:Landroid/location/Location;

    iget-object v5, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$events:[Lio/radar/sdk/model/RadarEvent;

    iget-object v6, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->$user:Lio/radar/sdk/model/RadarUser;

    invoke-interface {v2, v3, v4, v5, v6}, Lio/radar/sdk/Radar$RadarCallback;->onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    goto :goto_0

    .line 231
    :cond_0
    iget-object v1, p0, Lio/radar/sdk/api/ApiClient$deliverResult$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v1}, Lio/radar/sdk/api/ApiClient;->access$getCallbacks$p(Lio/radar/sdk/api/ApiClient;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 232
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
