.class Lme/pushy/sdk/util/PushyAsyncTask$2;
.super Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/pushy/sdk/util/PushyAsyncTask;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable<",
        "TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lme/pushy/sdk/util/PushyAsyncTask;


# direct methods
.method constructor <init>(Lme/pushy/sdk/util/PushyAsyncTask;)V
    .locals 0

    iput-object p1, p0, Lme/pushy/sdk/util/PushyAsyncTask$2;->this$0:Lme/pushy/sdk/util/PushyAsyncTask;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/PushyAsyncTask$WorkerRunnable;-><init>(Lme/pushy/sdk/util/PushyAsyncTask$1;)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask$2;->this$0:Lme/pushy/sdk/util/PushyAsyncTask;

    invoke-static {v0}, Lme/pushy/sdk/util/PushyAsyncTask;->access$200(Lme/pushy/sdk/util/PushyAsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, p0, Lme/pushy/sdk/util/PushyAsyncTask$2;->this$0:Lme/pushy/sdk/util/PushyAsyncTask;

    iget-object v1, p0, Lme/pushy/sdk/util/PushyAsyncTask$2;->this$0:Lme/pushy/sdk/util/PushyAsyncTask;

    iget-object v2, p0, Lme/pushy/sdk/util/PushyAsyncTask$2;->mParams:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lme/pushy/sdk/util/PushyAsyncTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lme/pushy/sdk/util/PushyAsyncTask;->access$300(Lme/pushy/sdk/util/PushyAsyncTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
