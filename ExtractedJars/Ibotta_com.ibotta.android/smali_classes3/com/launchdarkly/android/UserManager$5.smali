.class Lcom/launchdarkly/android/UserManager$5;
.super Ljava/lang/Object;
.source "UserManager.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserManager;->putCurrentUserFlags(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
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

    .line 226
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    iput-object p2, p0, Lcom/launchdarkly/android/UserManager$5;->val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;

    iput-object p3, p0, Lcom/launchdarkly/android/UserManager$5;->val$json:Ljava/lang/String;

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

    .line 226
    invoke-virtual {p0}, Lcom/launchdarkly/android/UserManager$5;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/UserManager;->access$002(Lcom/launchdarkly/android/UserManager;Z)Z

    const-string v0, "PUT for user key: %s"

    .line 230
    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v3}, Lcom/launchdarkly/android/UserManager;->access$400(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/LDUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/launchdarkly/android/LDUser;->getKey()Lcom/google/gson/JsonPrimitive;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$5;->val$responseStore:Lcom/launchdarkly/android/response/FlagResponseStore;

    invoke-interface {v0}, Lcom/launchdarkly/android/response/FlagResponseStore;->getFlagResponse()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 234
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->clear()V

    .line 235
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$700(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->saveAll(Ljava/util/List;)V

    .line 237
    iget-object v1, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v1}, Lcom/launchdarkly/android/UserManager;->access$800(Lcom/launchdarkly/android/UserManager;)Lcom/launchdarkly/android/UserLocalSharedPreferences;

    move-result-object v1

    iget-object v2, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v2, v0}, Lcom/launchdarkly/android/UserManager;->access$900(Lcom/launchdarkly/android/UserManager;Ljava/util/List;)Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->saveCurrentUserFlags(Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;)V

    .line 238
    iget-object v0, p0, Lcom/launchdarkly/android/UserManager$5;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-static {v0}, Lcom/launchdarkly/android/UserManager;->access$600(Lcom/launchdarkly/android/UserManager;)V

    goto :goto_0

    :cond_0
    const-string v0, "Invalid PUT payload: %s"

    .line 240
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/launchdarkly/android/UserManager$5;->val$json:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
