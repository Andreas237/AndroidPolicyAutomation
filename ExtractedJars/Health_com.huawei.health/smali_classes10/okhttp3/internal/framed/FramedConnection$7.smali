.class Lokhttp3/internal/framed/FramedConnection$7;
.super Lokhttp3/internal/NamedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/framed/FramedConnection;->pushResetLater(ILokhttp3/internal/framed/ErrorCode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/framed/FramedConnection;

.field final synthetic val$errorCode:Lokhttp3/internal/framed/ErrorCode;

.field final synthetic val$streamId:I


# direct methods
.method varargs constructor <init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILokhttp3/internal/framed/ErrorCode;)V
    .locals 0

    .line 898
    iput-object p1, p0, Lokhttp3/internal/framed/FramedConnection$7;->this$0:Lokhttp3/internal/framed/FramedConnection;

    iput p4, p0, Lokhttp3/internal/framed/FramedConnection$7;->val$streamId:I

    iput-object p5, p0, Lokhttp3/internal/framed/FramedConnection$7;->val$errorCode:Lokhttp3/internal/framed/ErrorCode;

    invoke-direct {p0, p2, p3}, Lokhttp3/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    .line 900
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$7;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2700(Lokhttp3/internal/framed/FramedConnection;)Lokhttp3/internal/framed/PushObserver;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$7;->val$streamId:I

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection$7;->val$errorCode:Lokhttp3/internal/framed/ErrorCode;

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/framed/PushObserver;->onReset(ILokhttp3/internal/framed/ErrorCode;)V

    .line 901
    iget-object v3, p0, Lokhttp3/internal/framed/FramedConnection$7;->this$0:Lokhttp3/internal/framed/FramedConnection;

    monitor-enter v3

    .line 902
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection$7;->this$0:Lokhttp3/internal/framed/FramedConnection;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedConnection;->access$2800(Lokhttp3/internal/framed/FramedConnection;)Ljava/util/Set;

    move-result-object v0

    iget v1, p0, Lokhttp3/internal/framed/FramedConnection$7;->val$streamId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 903
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 904
    :goto_0
    return-void
.end method
