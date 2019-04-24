.class Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory$1;
.super Ljava/lang/Object;
.source "BackgroundThreadExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;

.field final synthetic val$runnable:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;Ljava/lang/Runnable;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory$1;->this$0:Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;

    iput-object p2, p0, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory$1;->val$runnable:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 45
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory$1;->this$0:Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;

    invoke-static {v0}, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;->access$000(Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory;)I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :catch_0
    iget-object v0, p0, Lcom/launchdarkly/android/BackgroundThreadExecutor$PriorityThreadFactory$1;->val$runnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
