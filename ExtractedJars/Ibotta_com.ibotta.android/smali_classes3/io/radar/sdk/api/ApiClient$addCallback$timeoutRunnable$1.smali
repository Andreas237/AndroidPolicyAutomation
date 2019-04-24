.class final Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;
.super Ljava/lang/Object;
.source "ApiClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiClient;->addCallback$sdk_release(Lio/radar/sdk/Radar$RadarCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1\n*L\n1#1,268:1\n*E\n"
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
.field final synthetic $callback:Lio/radar/sdk/Radar$RadarCallback;

.field final synthetic this$0:Lio/radar/sdk/api/ApiClient;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiClient;Lio/radar/sdk/Radar$RadarCallback;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;->this$0:Lio/radar/sdk/api/ApiClient;

    iput-object p2, p0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;->$callback:Lio/radar/sdk/Radar$RadarCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 109
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;->this$0:Lio/radar/sdk/api/ApiClient;

    monitor-enter v0

    .line 110
    :try_start_0
    iget-object v1, p0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;->$callback:Lio/radar/sdk/Radar$RadarCallback;

    sget-object v2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lio/radar/sdk/Radar$RadarCallback$DefaultImpls;->onComplete$default(Lio/radar/sdk/Radar$RadarCallback;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;ILjava/lang/Object;)V

    .line 111
    iget-object v1, p0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v1}, Lio/radar/sdk/api/ApiClient;->access$getCallbacks$p(Lio/radar/sdk/api/ApiClient;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;->$callback:Lio/radar/sdk/Radar$RadarCallback;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
