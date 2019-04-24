.class Lokhttp3/internal/framed/NameValueBlockReader$1;
.super Lokio/ForwardingSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/framed/NameValueBlockReader;-><init>(Lokio/BufferedSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/framed/NameValueBlockReader;


# direct methods
.method constructor <init>(Lokhttp3/internal/framed/NameValueBlockReader;Lokio/Source;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lokhttp3/internal/framed/NameValueBlockReader$1;->this$0:Lokhttp3/internal/framed/NameValueBlockReader;

    invoke-direct {p0, p2}, Lokio/ForwardingSource;-><init>(Lokio/Source;)V

    return-void
.end method


# virtual methods
.method public read(Lokio/Buffer;J)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/NameValueBlockReader$1;->this$0:Lokhttp3/internal/framed/NameValueBlockReader;

    invoke-static {v0}, Lokhttp3/internal/framed/NameValueBlockReader;->access$000(Lokhttp3/internal/framed/NameValueBlockReader;)I

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 56
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/NameValueBlockReader$1;->this$0:Lokhttp3/internal/framed/NameValueBlockReader;

    invoke-static {v0}, Lokhttp3/internal/framed/NameValueBlockReader;->access$000(Lokhttp3/internal/framed/NameValueBlockReader;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-super {p0, p1, v0, v1}, Lokio/ForwardingSource;->read(Lokio/Buffer;J)J

    move-result-wide v3

    .line 57
    const-wide/16 v0, -0x1

    cmp-long v0, v3, v0

    if-nez v0, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    .line 58
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/framed/NameValueBlockReader$1;->this$0:Lokhttp3/internal/framed/NameValueBlockReader;

    iget-object v1, p0, Lokhttp3/internal/framed/NameValueBlockReader$1;->this$0:Lokhttp3/internal/framed/NameValueBlockReader;

    invoke-static {v1}, Lokhttp3/internal/framed/NameValueBlockReader;->access$000(Lokhttp3/internal/framed/NameValueBlockReader;)I

    move-result v1

    int-to-long v1, v1

    sub-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v0, v1}, Lokhttp3/internal/framed/NameValueBlockReader;->access$002(Lokhttp3/internal/framed/NameValueBlockReader;I)I

    .line 59
    return-wide v3
.end method
