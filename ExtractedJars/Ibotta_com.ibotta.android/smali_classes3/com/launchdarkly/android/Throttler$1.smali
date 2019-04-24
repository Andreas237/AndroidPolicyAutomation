.class Lcom/launchdarkly/android/Throttler$1;
.super Ljava/lang/Object;
.source "Throttler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/Throttler;-><init>(Ljava/lang/Runnable;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/Throttler;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/Throttler;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/launchdarkly/android/Throttler$1;->this$0:Lcom/launchdarkly/android/Throttler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler$1;->this$0:Lcom/launchdarkly/android/Throttler;

    invoke-static {v0}, Lcom/launchdarkly/android/Throttler;->access$000(Lcom/launchdarkly/android/Throttler;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 46
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler$1;->this$0:Lcom/launchdarkly/android/Throttler;

    invoke-static {v0}, Lcom/launchdarkly/android/Throttler;->access$100(Lcom/launchdarkly/android/Throttler;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 47
    iget-object v0, p0, Lcom/launchdarkly/android/Throttler$1;->this$0:Lcom/launchdarkly/android/Throttler;

    invoke-static {v0}, Lcom/launchdarkly/android/Throttler;->access$200(Lcom/launchdarkly/android/Throttler;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
