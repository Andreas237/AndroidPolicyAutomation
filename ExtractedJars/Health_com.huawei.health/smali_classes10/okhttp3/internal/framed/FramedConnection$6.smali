.class Lokhttp3/internal/framed/FramedConnection$6;
.super Lokhttp3/internal/NamedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/framed/FramedConnection;->pushDataLater(ILokio/BufferedSource;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/framed/FramedConnection;

.field final synthetic val$buffer:Lokio/Buffer;

.field final synthetic val$byteCount:I

.field final synthetic val$inFinished:Z

.field final synthetic val$streamId:I


# direct methods
.method varargs constructor <init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILokio/Buffer;IZ)V
    .locals 0

    .line 881
    iput-object p1, p0, Lokhttp3/internal/framed/FramedConnection$6;->this$0:Lokhttp3/internal/framed/FramedConnection;

    iput p4, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$streamId:I

    iput-object p5, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$buffer:Lokio/Buffer;

    iput p6, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$byteCount:I

    iput-boolean p7, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$inFinished:Z

    invoke-direct {p0, p2, p3}, Lokhttp3/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 8

    .line 884
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$6;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2700(Lokhttp3/internal/framed/FramedConnection;)Lokhttp3/internal/framed/PushObserver;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$streamId:I

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$buffer:Lokio/Buffer;

    iget v3, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$byteCount:I

    iget-boolean v4, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$inFinished:Z

    invoke-interface {v0, v1, v2, v3, v4}, Lokhttp3/internal/framed/PushObserver;->onData(ILokio/BufferedSource;IZ)Z

    move-result v5

    .line 885
    if-eqz v5, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$6;->this$0:Lokhttp3/internal/framed/FramedConnection;

    iget-object v0, v0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$streamId:I

    sget-object v2, Lokhttp3/internal/framed/ErrorCode;->CANCEL:Lokhttp3/internal/framed/ErrorCode;

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/framed/FrameWriter;->rstStream(ILokhttp3/internal/framed/ErrorCode;)V

    .line 886
    :cond_0
    if-nez v5, :cond_1

    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$inFinished:Z

    if-eqz v0, :cond_2

    .line 887
    :cond_1
    iget-object v6, p0, Lokhttp3/internal/framed/FramedConnection$6;->this$0:Lokhttp3/internal/framed/FramedConnection;

    monitor-enter v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 888
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$6;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2800(Lokhttp3/internal/framed/FramedConnection;)Ljava/util/Set;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$6;->val$streamId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 889
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    :try_start_2
    throw v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 892
    :cond_2
    :goto_0
    goto :goto_1

    .line 891
    :catch_0
    move-exception v5

    .line 893
    :goto_1
    return-void
.end method
