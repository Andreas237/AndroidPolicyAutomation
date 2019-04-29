.class public final Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;
.super Lio/streamroot/dna/core/context/bean/BroadcastReceiverBean;
.source "NetworkBroadcastReceiverApi19To23.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x13
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkBroadcastReceiverApi19To23.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkBroadcastReceiverApi19To23.kt\nio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23\n*L\n1#1,52:1\n*E\n"
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
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00080\u00080\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;",
        "Lio/streamroot/dna/core/context/bean/BroadcastReceiverBean;",
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
        "intentFilter",
        "Landroid/content/IntentFilter;",
        "onReceive",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
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

    .line 21
    invoke-direct {p0}, Lio/streamroot/dna/core/context/bean/BroadcastReceiverBean;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    .line 22
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->weakConnectivityManager:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 50
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->weakConnectivityManager:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    return-void
.end method

.method public intentFilter()Landroid/content/IntentFilter;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 31
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->weakConnectivityManager:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    if-eqz p1, :cond_0

    const-string p2, "connectivityManager"

    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/streamroot/dna/core/utils/ConnectivityManagerExtensionKt;->currentNetworkType(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;

    move-result-object p1

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkType;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    .line 42
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkType;->NONE:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    .line 43
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->disableNetwork()V

    goto :goto_0

    .line 38
    :pswitch_0
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkType;->CELLULAR:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    .line 39
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->enableCellularNetwork()V

    goto :goto_0

    .line 34
    :pswitch_1
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeAnalyticsReporter:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    sget-object p2, Lio/streamroot/dna/core/transfer/NetworkType;->WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    .line 35
    iget-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;->networkTypeHandler:Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;->enableWifiOrEthernetNetwork()V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
