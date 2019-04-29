.class public final Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;
.super Lokio/ForwardingSource;
.source "BandwidthNetworkInterceptor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->source(Lokio/Source;)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "io/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1",
        "Lokio/ForwardingSource;",
        "close",
        "",
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
.field final synthetic $source:Lokio/Source;

.field final synthetic this$0:Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;Lokio/Source;Lokio/Source;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Source;",
            "Lokio/Source;",
            ")V"
        }
    .end annotation

    .line 59
    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;->this$0:Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;

    iput-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;->$source:Lokio/Source;

    invoke-direct {p0, p3}, Lokio/ForwardingSource;-><init>(Lokio/Source;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 63
    invoke-super {p0}, Lokio/ForwardingSource;->close()V

    .line 64
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;->this$0:Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;

    invoke-static {v0}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->access$getTransferListener$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;)Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    move-result-object v0

    iget-object v1, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;->this$0:Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;

    invoke-static {v1}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->access$getResponseBody$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;)Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody$source$1;->this$0:Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;

    invoke-static {v5}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;->access$getStartTime$p(Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor$TransferNotifierResponseBody;)J

    move-result-wide v5

    sub-long v7, v3, v5

    invoke-interface {v0, v1, v2, v7, v8}, Lio/streamroot/dna/core/http/bandwidth/TransferListener;->onTransferEnd(JJ)V

    return-void
.end method
