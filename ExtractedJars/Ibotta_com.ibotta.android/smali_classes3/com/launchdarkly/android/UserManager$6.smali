.class Lcom/launchdarkly/android/UserManager$6;
.super Ljava/lang/Object;
.source "UserManager.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserManager;->patchCurrentUserFlags(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
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

    .line 254
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    iput-object p2, p0, Lcom/launchdarkly/android/UserManager$6;->val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;

    iput-object p3, p0, Lcom/launchdarkly/android/UserManager$6;->val$json:Ljava/lang/String;

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

    .line 254
    invoke-virtual {p0}, Lcom/launchdarkly/android/UserManager$6;->call()Ljava/lang/Void;

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

    .line 257
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/UserManager;->access$002(Lcom/launchdarkly/android/UserManager;Z)Z

    .line 258
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$6;->val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;

    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponseStore;->getFlagResponse()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/launchdarkly/android/response/FlagResponse;

    if-eqz v0, :cond_1

    .line 260
    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponse;->isVersionMissing()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->isVersionValid(Lcom/launchdarkly/android/response/FlagResponse;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 261
    :cond_0
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->updateStoredFlagResponse(Lcom/launchdarkly/android/response/FlagResponse;)V

    .line 263
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1, v0}, Lcom/launchdarkly/android/UserManager;->access$1000(Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/response/FlagResponse;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    move-result-object v0

    .line 264
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$800(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/UserLocalSharedPreferences;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->patchCurrentUserFlags(Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;)V

    .line 265
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$6;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v0}, Lcom/launchdarkly/android/UserManager;->access$600(Lcom/launchdarkly/android/UserManager;)V

    goto :goto_0

    :cond_1
    const-string v0, "Invalid PATCH payload: %s"

    .line 268
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/launchdarkly/android/UserManager$6;->val$json:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
