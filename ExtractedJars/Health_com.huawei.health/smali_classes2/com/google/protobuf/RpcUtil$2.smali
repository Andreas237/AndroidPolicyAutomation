.class final Lcom/google/protobuf/RpcUtil$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/RpcCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/RpcUtil;->newOneTimeCallback(Lcom/google/protobuf/RpcCallback;)Lcom/google/protobuf/RpcCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/google/protobuf/RpcCallback<TParameterType;>;"
    }
.end annotation


# instance fields
.field private alreadyCalled:Z

.field final synthetic val$originalCallback:Lcom/google/protobuf/RpcCallback;


# direct methods
.method constructor <init>(Lcom/google/protobuf/RpcCallback;)V
    .locals 1

    .line 108
    iput-object p1, p0, Lcom/google/protobuf/RpcUtil$2;->val$originalCallback:Lcom/google/protobuf/RpcCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RpcUtil$2;->alreadyCalled:Z

    return-void
.end method


# virtual methods
.method public run(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TParameterType;)V"
        }
    .end annotation

    .line 113
    move-object v1, p0

    monitor-enter v1

    .line 114
    :try_start_0
    iget-boolean v0, p0, Lcom/google/protobuf/RpcUtil$2;->alreadyCalled:Z

    if-eqz v0, :cond_0

    .line 115
    new-instance v0, Lcom/google/protobuf/RpcUtil$AlreadyCalledException;

    invoke-direct {v0}, Lcom/google/protobuf/RpcUtil$AlreadyCalledException;-><init>()V

    throw v0

    .line 117
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/RpcUtil$2;->alreadyCalled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 120
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/RpcUtil$2;->val$originalCallback:Lcom/google/protobuf/RpcCallback;

    invoke-interface {v0, p1}, Lcom/google/protobuf/RpcCallback;->run(Ljava/lang/Object;)V

    .line 121
    return-void
.end method
