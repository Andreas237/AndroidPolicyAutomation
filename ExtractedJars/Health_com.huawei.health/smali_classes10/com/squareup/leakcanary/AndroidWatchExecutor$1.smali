.class Lcom/squareup/leakcanary/AndroidWatchExecutor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/AndroidWatchExecutor;->postWaitForIdle(Lcom/squareup/leakcanary/Retryable;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/AndroidWatchExecutor;

.field final synthetic val$failedAttempts:I

.field final synthetic val$retryable:Lcom/squareup/leakcanary/Retryable;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/AndroidWatchExecutor;Lcom/squareup/leakcanary/Retryable;I)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/squareup/leakcanary/AndroidWatchExecutor$1;->this$0:Lcom/squareup/leakcanary/AndroidWatchExecutor;

    iput-object p2, p0, Lcom/squareup/leakcanary/AndroidWatchExecutor$1;->val$retryable:Lcom/squareup/leakcanary/Retryable;

    iput p3, p0, Lcom/squareup/leakcanary/AndroidWatchExecutor$1;->val$failedAttempts:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 59
    iget-object v0, p0, Lcom/squareup/leakcanary/AndroidWatchExecutor$1;->this$0:Lcom/squareup/leakcanary/AndroidWatchExecutor;

    iget-object v1, p0, Lcom/squareup/leakcanary/AndroidWatchExecutor$1;->val$retryable:Lcom/squareup/leakcanary/Retryable;

    iget v2, p0, Lcom/squareup/leakcanary/AndroidWatchExecutor$1;->val$failedAttempts:I

    invoke-virtual {v0, v1, v2}, Lcom/squareup/leakcanary/AndroidWatchExecutor;->waitForIdle(Lcom/squareup/leakcanary/Retryable;I)V

    .line 60
    return-void
.end method
