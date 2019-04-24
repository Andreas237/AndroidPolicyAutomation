.class Lcom/launchdarkly/android/StreamUpdateProcessor$3;
.super Ljava/lang/Object;
.source "StreamUpdateProcessor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/StreamUpdateProcessor;->restart()Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

.field final synthetic val$returnFuture:Lcom/google/common/util/concurrent/SettableFuture;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/StreamUpdateProcessor;Lcom/google/common/util/concurrent/SettableFuture;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$3;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    iput-object p2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$3;->val$returnFuture:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$3;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v0}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$900(Lcom/launchdarkly/android/StreamUpdateProcessor;)V

    .line 216
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$3;->val$returnFuture:Lcom/google/common/util/concurrent/SettableFuture;

    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$3;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-virtual {v1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->start()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/SettableFuture;->setFuture(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    return-void
.end method
