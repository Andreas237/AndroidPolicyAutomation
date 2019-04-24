.class Lcom/launchdarkly/android/Debounce$1;
.super Ljava/lang/Object;
.source "Debounce.java"

# interfaces
.implements Lcom/google/common/util/concurrent/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/Debounce;->schedulePending()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/util/concurrent/FutureCallback<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/Debounce;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/Debounce;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/launchdarkly/android/Debounce$1;->this$0:Lcom/launchdarkly/android/Debounce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 41
    iget-object p1, p0, Lcom/launchdarkly/android/Debounce$1;->this$0:Lcom/launchdarkly/android/Debounce;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/launchdarkly/android/Debounce;->access$002(Lcom/launchdarkly/android/Debounce;Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 42
    iget-object p1, p0, Lcom/launchdarkly/android/Debounce$1;->this$0:Lcom/launchdarkly/android/Debounce;

    invoke-static {p1}, Lcom/launchdarkly/android/Debounce;->access$100(Lcom/launchdarkly/android/Debounce;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 33
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/Debounce$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 1

    .line 36
    iget-object p1, p0, Lcom/launchdarkly/android/Debounce$1;->this$0:Lcom/launchdarkly/android/Debounce;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/launchdarkly/android/Debounce;->access$002(Lcom/launchdarkly/android/Debounce;Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 37
    iget-object p1, p0, Lcom/launchdarkly/android/Debounce$1;->this$0:Lcom/launchdarkly/android/Debounce;

    invoke-static {p1}, Lcom/launchdarkly/android/Debounce;->access$100(Lcom/launchdarkly/android/Debounce;)V

    return-void
.end method
