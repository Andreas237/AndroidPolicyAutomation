.class Lcom/launchdarkly/android/UserManager$4;
.super Ljava/lang/Object;
.source "UserManager.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserManager;->deleteCurrentUserFlag(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/UserManager;

.field final synthetic val$json:Ljava/lang/String;

.field final synthetic val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/response/FlagResponseStore;Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager$4;->this$0:Lcom/launchdarkly/android/UserManager;

    iput-object p2, p0, Lcom/launchdarkly/android/UserManager$4;->val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;

    iput-object p3, p0, Lcom/launchdarkly/android/UserManager$4;->val$json:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 199
    invoke-virtual {p0}, Lcom/launchdarkly/android/UserManager$4;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$4;->this$0:Lcom/launchdarkly/android/UserManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/UserManager;->access$002(Lcom/launchdarkly/android/UserManager;Z)Z

    .line 203
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$4;->val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;

    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponseStore;->getFlagResponse()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/launchdarkly/android/response/FlagResponse;

    if-eqz v0, :cond_0

    .line 205
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$4;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->isVersionValid(Lcom/launchdarkly/android/response/FlagResponse;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 206
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$4;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->deleteStoredFlagResponse(Lcom/launchdarkly/android/response/FlagResponse;)V

    .line 208
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$4;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$800(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/UserLocalSharedPreferences;

    move-result-object v1

    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->deleteCurrentUserFlag(Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$4;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v0}, Lcom/launchdarkly/android/UserManager;->access$600(Lcom/launchdarkly/android/UserManager;)V

    goto :goto_0

    :cond_0
    const-string v0, "Invalid DELETE payload: %s"

    .line 212
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/launchdarkly/android/UserManager$4;->val$json:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
