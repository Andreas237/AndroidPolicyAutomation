.class Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;
.super Ljava/lang/Object;
.source "PixelTrackingManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SavingRunnable"
.end annotation


# instance fields
.field private cancel:Z

.field final synthetic this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)V
    .locals 0

    .line 404
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 405
    iput-boolean p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->cancel:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$1;)V
    .locals 0

    .line 404
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;-><init>(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    .line 408
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->cancel:Z

    return-void
.end method

.method public run()V
    .locals 5

    const/4 v0, 0x0

    .line 415
    :try_start_0
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->cancel:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 434
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v1, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$400(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    .line 435
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$500(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)V

    .line 436
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->startIfWorkToDo()V

    return-void

    .line 419
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$100(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "%1$d pixel URLs to save."

    const/4 v2, 0x1

    .line 422
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v4}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$200(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)Ljava/util/concurrent/BlockingDeque;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/BlockingDeque;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$200(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)Ljava/util/concurrent/BlockingDeque;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/BlockingDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 426
    iget-boolean v2, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->cancel:Z

    if-eqz v2, :cond_1

    goto :goto_1

    .line 430
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v2, v0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$300(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 434
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v1, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$400(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    .line 435
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$500(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)V

    .line 436
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->startIfWorkToDo()V

    return-void

    :catchall_0
    move-exception v1

    .line 434
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v2, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$400(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    .line 435
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->access$500(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)V

    .line 436
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->this$0:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->startIfWorkToDo()V

    throw v1
.end method
