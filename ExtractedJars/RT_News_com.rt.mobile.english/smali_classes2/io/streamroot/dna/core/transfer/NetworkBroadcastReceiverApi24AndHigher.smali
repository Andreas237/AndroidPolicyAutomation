.class public final Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "NetworkBroadcastReceiverApi24AndHigher.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x18
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00080\u00080\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Ljava/lang/AutoCloseable;",
        "networkTypeHandler",
        "Lio/streamroot/dna/core/transfer/NetworkTypeHandler;",
        "networkTypeAnalyticsReporter",
        "Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;",
        "connectivityManager",
        "Landroid/net/ConnectivityManager;",
        "(Lio/streamroot/dna/core/transfer/NetworkTypeHandler;Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;Landroid/net/ConnectivityManager;)V",
        "weakConnectivityManager",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "close",
        "",
        "onCapabilitiesChanged",
        "network",
        "Landroid/net/Network;",
        "networkCapabilities",
        "Landroid/net/NetworkCapabilities;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

.field private final networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

.field private final weakConnectivityManager:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/net/ConnectivityManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/transfer/NetworkTypeHandler;Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;Landroid/net/ConnectivityManager;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/transfer/NetworkTypeHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/net/ConnectivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "networkTypeHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkTypeAnalyticsReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    .line 18
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->weakConnectivityManager:Ljava/lang/ref/WeakReference;

    .line 21
    move-object p1, p0

    check-cast p1, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p3, p1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 48
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->weakConnectivityManager:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 49
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->weakConnectivityManager:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 0
    .param p1    # Landroid/net/Network;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/net/NetworkCapabilities;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p2, :cond_0

    .line 26
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->disableNetwork()V

    return-void

    :cond_0
    const/4 p1, 0x3

    .line 31
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    .line 32
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 36
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 37
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkType;->CELLULAR:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    .line 38
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->enableCellularNetwork()V

    goto :goto_1

    .line 41
    :cond_2
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkType;->NONE:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    .line 42
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->disableNetwork()V

    goto :goto_1

    .line 33
    :cond_3
    :goto_0
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkType;->WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    .line 34
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->enableWifiOrEthernetNetwork()V

    :goto_1
    return-void
.end method
