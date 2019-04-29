.class public final Lio/streamroot/dna/core/utils/ConnectivityManagerExtensionKt;
.super Ljava/lang/Object;
.source "ConnectivityManagerExtension.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "currentNetworkType",
        "Lio/streamroot/dna/core/transfer/NetworkType;",
        "Landroid/net/ConnectivityManager;",
        "currentNetworkTypeApi20AndBelow",
        "currentNetworkTypeApi21AndHigher",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final currentNetworkType(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;
    .locals 2
    .param p0    # Landroid/net/ConnectivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 11
    invoke-static {p0}, Lio/streamroot/dna/core/utils/ConnectivityManagerExtensionKt;->currentNetworkTypeApi21AndHigher(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;

    move-result-object p0

    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p0}, Lio/streamroot/dna/core/utils/ConnectivityManagerExtensionKt;->currentNetworkTypeApi20AndBelow(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final currentNetworkTypeApi20AndBelow(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;
    .locals 1
    .param p0    # Landroid/net/ConnectivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 37
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 38
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result p0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_0

    .line 48
    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->NONE:Lio/streamroot/dna/core/transfer/NetworkType;

    goto :goto_0

    .line 47
    :pswitch_0
    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->CELLULAR:Lio/streamroot/dna/core/transfer/NetworkType;

    goto :goto_0

    .line 46
    :cond_1
    :pswitch_1
    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;

    :goto_0
    return-object p0

    .line 39
    :cond_2
    :goto_1
    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->NONE:Lio/streamroot/dna/core/transfer/NetworkType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static final currentNetworkTypeApi21AndHigher(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;
    .locals 6
    .param p0    # Landroid/net/ConnectivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 19
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, v0, v3

    .line 20
    invoke-virtual {p0, v4}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 21
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p0, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v4

    const/4 v5, 0x3

    .line 27
    invoke-virtual {v4, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;

    return-object p0

    :cond_1
    const/4 v5, 0x1

    .line 28
    invoke-virtual {v4, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;

    return-object p0

    .line 29
    :cond_2
    invoke-virtual {v4, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->CELLULAR:Lio/streamroot/dna/core/transfer/NetworkType;

    return-object p0

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 33
    :cond_4
    sget-object p0, Lio/streamroot/dna/core/transfer/NetworkType;->NONE:Lio/streamroot/dna/core/transfer/NetworkType;

    return-object p0
.end method
