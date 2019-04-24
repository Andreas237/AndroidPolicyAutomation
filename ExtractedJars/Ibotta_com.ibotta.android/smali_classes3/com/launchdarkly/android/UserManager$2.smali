.class Lcom/launchdarkly/android/UserManager$2;
.super Ljava/lang/Object;
.source "UserManager.java"

# interfaces
.implements Lcom/google/common/util/concurrent/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserManager;->updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/util/concurrent/FutureCallback<",
        "Lcom/google/gson/JsonObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/UserManager;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/UserManager;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 126
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v0}, Lcom/launchdarkly/android/UserManager;->access$200(Lcom/launchdarkly/android/UserManager;)Landroid/app/Application;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$300(Lcom/launchdarkly/android/UserManager;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/Util;->isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Error when attempting to set user: [%s] [%s]"

    const/4 v1, 0x2

    .line 127
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v3}, Lcom/launchdarkly/android/UserManager;->access$400(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/LDUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/launchdarkly/android/LDUser;->getAsUrlSafeBase64()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v3}, Lcom/launchdarkly/android/UserManager;->access$400(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/LDUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/launchdarkly/android/LDUser;->getAsUrlSafeBase64()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/launchdarkly/android/UserManager;->access$500(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    :cond_0
    iget-object p1, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {p1}, Lcom/launchdarkly/android/UserManager;->access$600(Lcom/launchdarkly/android/UserManager;)V

    return-void
.end method

.method public onSuccess(Lcom/google/gson/JsonObject;)V
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/UserManager;->access$002(Lcom/launchdarkly/android/UserManager;Z)Z

    .line 121
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$2;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v0, p1}, Lcom/launchdarkly/android/UserManager;->access$100(Lcom/launchdarkly/android/UserManager;Lcom/google/gson/JsonObject;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 117
    check-cast p1, Lcom/google/gson/JsonObject;

    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/UserManager$2;->onSuccess(Lcom/google/gson/JsonObject;)V

    return-void
.end method
