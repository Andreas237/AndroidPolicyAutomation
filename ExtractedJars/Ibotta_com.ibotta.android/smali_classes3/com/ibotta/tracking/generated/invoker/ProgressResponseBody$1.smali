.class Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;
.super Lokio/ForwardingSource;
.source "ProgressResponseBody.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->source(Lokio/Source;)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;

.field totalBytesRead:J


# direct methods
.method constructor <init>(Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;Lokio/Source;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->this$0:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;

    invoke-direct {p0, p2}, Lokio/ForwardingSource;-><init>(Lokio/Source;)V

    const-wide/16 p1, 0x0

    .line 62
    iput-wide p1, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->totalBytesRead:J

    return-void
.end method


# virtual methods
.method public read(Lokio/Buffer;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 66
    invoke-super {p0, p1, p2, p3}, Lokio/ForwardingSource;->read(Lokio/Buffer;J)J

    move-result-wide p1

    .line 68
    iget-wide v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->totalBytesRead:J

    const-wide/16 v2, -0x1

    cmp-long p3, p1, v2

    if-eqz p3, :cond_0

    move-wide v2, p1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->totalBytesRead:J

    .line 69
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->this$0:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;

    invoke-static {v0}, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->access$100(Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;)Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;

    move-result-object v1

    iget-wide v2, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->totalBytesRead:J

    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;->this$0:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;

    invoke-static {v0}, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->access$000(Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v4

    if-nez p3, :cond_1

    const/4 p3, 0x1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    const/4 v6, 0x0

    :goto_1
    invoke-interface/range {v1 .. v6}, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;->update(JJZ)V

    return-wide p1
.end method
