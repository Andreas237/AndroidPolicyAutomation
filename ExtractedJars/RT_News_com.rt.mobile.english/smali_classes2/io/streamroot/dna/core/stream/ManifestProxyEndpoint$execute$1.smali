.class final Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ManifestProxyEndpoint.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->execute(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $request:Lio/streamroot/dna/core/proxy/server/ProxyRequest;

.field final synthetic this$0:Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;Lio/streamroot/dna/core/proxy/server/ProxyRequest;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;->this$0:Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;

    iput-object p2, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;->$request:Lio/streamroot/dna/core/proxy/server/ProxyRequest;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;->this$0:Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;

    iget-object v1, p0, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;->$request:Lio/streamroot/dna/core/proxy/server/ProxyRequest;

    invoke-static {v0, v1}, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;->access$executeHttpRequest(Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint$execute$1;->invoke()Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object v0

    return-object v0
.end method
