.class Lorg/greenrobot/eventbus/util/AsyncExecutor$1;
.super Ljava/lang/Object;
.source "AsyncExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/greenrobot/eventbus/util/AsyncExecutor;->execute(Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/greenrobot/eventbus/util/AsyncExecutor;

.field final synthetic val$runnable:Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;


# direct methods
.method constructor <init>(Lorg/greenrobot/eventbus/util/AsyncExecutor;Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;)V
    .locals 0
    .param p1, "this$0"    # Lorg/greenrobot/eventbus/util/AsyncExecutor;

    .prologue
    .line 112
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;->this$0:Lorg/greenrobot/eventbus/util/AsyncExecutor;

    iput-object p2, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;->val$runnable:Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 116
    :try_start_0
    iget-object v3, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;->val$runnable:Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;

    invoke-interface {v3}, Lorg/greenrobot/eventbus/util/AsyncExecutor$RunnableEx;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :goto_0
    return-void

    .line 117
    :catch_0
    move-exception v0

    .line 120
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    iget-object v3, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;->this$0:Lorg/greenrobot/eventbus/util/AsyncExecutor;

    invoke-static {v3}, Lorg/greenrobot/eventbus/util/AsyncExecutor;->access$200(Lorg/greenrobot/eventbus/util/AsyncExecutor;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 125
    .local v2, "event":Ljava/lang/Object;
    instance-of v3, v2, Lorg/greenrobot/eventbus/util/HasExecutionScope;

    if-eqz v3, :cond_0

    move-object v3, v2

    .line 126
    check-cast v3, Lorg/greenrobot/eventbus/util/HasExecutionScope;

    iget-object v4, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;->this$0:Lorg/greenrobot/eventbus/util/AsyncExecutor;

    invoke-static {v4}, Lorg/greenrobot/eventbus/util/AsyncExecutor;->access$300(Lorg/greenrobot/eventbus/util/AsyncExecutor;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lorg/greenrobot/eventbus/util/HasExecutionScope;->setExecutionScope(Ljava/lang/Object;)V

    .line 128
    :cond_0
    iget-object v3, p0, Lorg/greenrobot/eventbus/util/AsyncExecutor$1;->this$0:Lorg/greenrobot/eventbus/util/AsyncExecutor;

    invoke-static {v3}, Lorg/greenrobot/eventbus/util/AsyncExecutor;->access$400(Lorg/greenrobot/eventbus/util/AsyncExecutor;)Lorg/greenrobot/eventbus/EventBus;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/greenrobot/eventbus/EventBus;->post(Ljava/lang/Object;)V

    goto :goto_0

    .line 121
    .end local v2    # "event":Ljava/lang/Object;
    :catch_1
    move-exception v1

    .line 122
    .local v1, "e1":Ljava/lang/Exception;
    sget-object v3, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    const-string v4, "Original exception:"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 123
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Could not create failure event"

    invoke-direct {v3, v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method
