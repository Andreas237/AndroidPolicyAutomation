.class Lokhttp3/internal/framed/FramedConnection$Reader$1;
.super Lokhttp3/internal/NamedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/framed/FramedConnection$Reader;->headers(ZZIILjava/util/List;Lokhttp3/internal/framed/HeadersMode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lokhttp3/internal/framed/FramedConnection$Reader;

.field final synthetic val$newStream:Lokhttp3/internal/framed/FramedStream;


# direct methods
.method varargs constructor <init>(Lokhttp3/internal/framed/FramedConnection$Reader;Ljava/lang/String;[Ljava/lang/Object;Lokhttp3/internal/framed/FramedStream;)V
    .locals 0

    .line 666
    iput-object p1, p0, Lokhttp3/internal/framed/FramedConnection$Reader$1;->this$1:Lokhttp3/internal/framed/FramedConnection$Reader;

    iput-object p4, p0, Lokhttp3/internal/framed/FramedConnection$Reader$1;->val$newStream:Lokhttp3/internal/framed/FramedStream;

    invoke-direct {p0, p2, p3}, Lokhttp3/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 6

    .line 669
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$Reader$1;->this$1:Lokhttp3/internal/framed/FramedConnection$Reader;

    iget-object v0, v0, Lokhttp3/internal/framed/FramedConnection$Reader;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2000(Lokhttp3/internal/framed/FramedConnection;)Lokhttp3/internal/framed/FramedConnection$Listener;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection$Reader$1;->val$newStream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/FramedConnection$Listener;->onStream(Lokhttp3/internal/framed/FramedStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 676
    goto :goto_0

    .line 670
    :catch_0
    move-exception v4

    .line 671
    sget-object v0, Lokhttp3/internal/Internal;->logger:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FramedConnection.Listener failure for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/internal/framed/FramedConnection$Reader$1;->this$1:Lokhttp3/internal/framed/FramedConnection$Reader;

    iget-object v3, v3, Lokhttp3/internal/framed/FramedConnection$Reader;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v3}, Lokhttp3/internal/framed/FramedConnection;->access$1100(Lokhttp3/internal/framed/FramedConnection;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 673
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$Reader$1;->val$newStream:Lokhttp3/internal/framed/FramedStream;

    sget-object v1, Lokhttp3/internal/framed/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/framed/ErrorCode;

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/FramedStream;->close(Lokhttp3/internal/framed/ErrorCode;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 675
    goto :goto_0

    .line 674
    :catch_1
    move-exception v5

    .line 677
    :goto_0
    return-void
.end method
