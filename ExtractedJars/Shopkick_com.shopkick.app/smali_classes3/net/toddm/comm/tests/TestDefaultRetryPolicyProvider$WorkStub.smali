.class Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;
.super Ljava/lang/Object;
.source "TestDefaultRetryPolicyProvider.java"

# interfaces
.implements Lnet/toddm/comm/Work;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WorkStub"
.end annotation


# instance fields
.field private final request:Lnet/toddm/comm/Request;

.field private final response:Lnet/toddm/comm/Response;

.field final synthetic this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;


# direct methods
.method constructor <init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 136
    invoke-direct {p0, p1, v0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;Z)V

    return-void
.end method

.method constructor <init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 138
    iput-object p1, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->this$0:Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    new-instance v0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;

    const/16 v1, 0x12e

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;ILjava/lang/Long;)V

    iput-object v0, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->response:Lnet/toddm/comm/Response;

    .line 139
    new-instance v0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$RequestStub;

    invoke-direct {v0, p1, p2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$RequestStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;Z)V

    iput-object v0, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->request:Lnet/toddm/comm/Request;

    return-void
.end method


# virtual methods
.method public get()Lnet/toddm/comm/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->response:Lnet/toddm/comm/Response;

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 149
    iget-object p1, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->response:Lnet/toddm/comm/Response;

    return-object p1
.end method

.method public getCachingBehavior()Lnet/toddm/comm/CacheBehavior;
    .locals 1

    .line 157
    sget-object v0, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    return-object v0
.end method

.method public getCachingPriority()Lnet/toddm/cache/CachePriority;
    .locals 1

    .line 155
    sget-object v0, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 145
    iget-object v0, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->request:Lnet/toddm/comm/Request;

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getId()I

    move-result v0

    return v0
.end method

.method public getRequest()Lnet/toddm/comm/Request;
    .locals 1

    .line 151
    iget-object v0, p0, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;->request:Lnet/toddm/comm/Request;

    return-object v0
.end method

.method public getRequestPriority()Lnet/toddm/comm/Priority;
    .locals 2

    .line 153
    new-instance v0, Lnet/toddm/comm/Priority;

    sget-object v1, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-direct {v0, p0, v1}, Lnet/toddm/comm/Priority;-><init>(Lnet/toddm/comm/Work;Lnet/toddm/comm/Priority$StartingPriority;)V

    return-object v0
.end method

.method public getState()Lnet/toddm/comm/Work$Status;
    .locals 1

    .line 143
    sget-object v0, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V
    .locals 0

    return-void
.end method
