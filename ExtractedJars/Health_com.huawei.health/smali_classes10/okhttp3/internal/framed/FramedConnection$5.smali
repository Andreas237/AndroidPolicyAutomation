.class Lokhttp3/internal/framed/FramedConnection$5;
.super Lokhttp3/internal/NamedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/framed/FramedConnection;->pushHeadersLater(ILjava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/framed/FramedConnection;

.field final synthetic val$inFinished:Z

.field final synthetic val$requestHeaders:Ljava/util/List;

.field final synthetic val$streamId:I


# direct methods
.method varargs constructor <init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V
    .locals 0

    .line 855
    iput-object p1, p0, Lokhttp3/internal/framed/FramedConnection$5;->this$0:Lokhttp3/internal/framed/FramedConnection;

    iput p4, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$streamId:I

    iput-object p5, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$requestHeaders:Ljava/util/List;

    iput-boolean p6, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$inFinished:Z

    invoke-direct {p0, p2, p3}, Lokhttp3/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 7

    .line 857
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$5;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2700(Lokhttp3/internal/framed/FramedConnection;)Lokhttp3/internal/framed/PushObserver;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$streamId:I

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$requestHeaders:Ljava/util/List;

    iget-boolean v3, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$inFinished:Z

    invoke-interface {v0, v1, v2, v3}, Lokhttp3/internal/framed/PushObserver;->onHeaders(ILjava/util/List;Z)Z

    move-result v4

    .line 859
    if-eqz v4, :cond_0

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$5;->this$0:Lokhttp3/internal/framed/FramedConnection;

    iget-object v0, v0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$streamId:I

    sget-object v2, Lokhttp3/internal/framed/ErrorCode;->CANCEL:Lokhttp3/internal/framed/ErrorCode;

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/framed/FrameWriter;->rstStream(ILokhttp3/internal/framed/ErrorCode;)V

    .line 860
    :cond_0
    if-nez v4, :cond_1

    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$inFinished:Z

    if-eqz v0, :cond_2

    .line 861
    :cond_1
    iget-object v5, p0, Lokhttp3/internal/framed/FramedConnection$5;->this$0:Lokhttp3/internal/framed/FramedConnection;

    monitor-enter v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 862
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$5;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2800(Lokhttp3/internal/framed/FramedConnection;)Ljava/util/Set;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$5;->val$streamId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 863
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    :try_start_2
    throw v6
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 866
    :cond_2
    :goto_0
    goto :goto_1

    .line 865
    :catch_0
    move-exception v5

    .line 867
    :goto_1
    return-void
.end method
