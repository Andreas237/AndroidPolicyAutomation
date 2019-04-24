.class Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;
.super Ljava/lang/Object;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/network/NetworkManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "NetworkRequestCallbacks"
.end annotation


# instance fields
.field private final finishedCallback:Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;

.field private final parseCallback:Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

.field final synthetic this$0:Lcom/shopkick/fetchers/network/NetworkManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;)V
    .locals 0

    .line 754
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 755
    iput-object p2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->parseCallback:Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

    .line 756
    iput-object p3, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->finishedCallback:Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;

    return-void
.end method


# virtual methods
.method public getFinishedCallback()Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;
    .locals 1

    .line 761
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->finishedCallback:Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;

    return-object v0
.end method

.method public getParseCallback()Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;
    .locals 1

    .line 759
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->parseCallback:Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

    return-object v0
.end method
