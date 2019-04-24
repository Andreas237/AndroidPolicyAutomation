.class final Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/amazon/AmazonPreferences;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final AMAZON_SHARED_PREFERENCES:Ljava/lang/String; = "com.microblink.AMAZON"

.field private static final EMAIL_KEY:Ljava/lang/String; = "EMAIL"

.field private static final PASSWORD_KEY:Ljava/lang/String; = "PASSWORD"

.field private static final REMOTE_JS_MOD_TIME_KEY:Ljava/lang/String; = "REMOTE_JS_MOD_TIME"

.field static final STORED_ORDERS_KEY:Ljava/lang/String; = "STORED_ORDERS"

.field private static final TAG:Ljava/lang/String; = "AmazonPreferencesImpl"


# instance fields
.field private applyStoredOrdersTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Void;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private storedOrdersTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Lcom/microblink/AmazonCredentials;",
            "Ljava/lang/Void;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    return-void
.end method

.method static sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "com.microblink.AMAZON"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final applyCredentials(Lcom/microblink/AmazonCredentials;)Z
    .locals 5
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/AmazonCredentials;->has()Z

    move-result v1

    if-nez v1, :cond_0

    const-string p1, "AmazonPreferencesImpl"

    const-string v1, "Amazon credentials are missing!!!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_0
    invoke-static {}, Lcom/microblink/internal/services/amazon/AmazonUtils;->token()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "EMAIL"

    invoke-virtual {p1}, Lcom/microblink/AmazonCredentials;->email()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/microblink/internal/AESCrypt;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "PASSWORD"

    invoke-virtual {p1}, Lcom/microblink/AmazonCredentials;->password()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/microblink/internal/AESCrypt;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "AmazonPreferencesImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method public final applyModTime(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "REMOTE_JS_MOD_TIME"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AmazonPreferencesImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final applyStoredOrders(Lcom/microblink/AmazonCredentials;Ljava/util/Map;Lcom/microblink/OnCompleteListener;)V
    .locals 4
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/AmazonCredentials;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/AmazonCredentials;->has()Z

    move-result v1

    if-nez v1, :cond_0

    const-string p1, "AmazonPreferencesImpl"

    const-string p2, "amazon credentials are invalid and stored orders can\'t be looked up!!!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    new-array v2, v1, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->applyStoredOrdersTask:Landroid/os/AsyncTask;

    aput-object v3, v2, v0

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    new-instance v2, Lcom/microblink/internal/services/amazon/AmazonApplyOrdersTask;

    iget-object v3, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-direct {v2, v3, p1, p3}, Lcom/microblink/internal/services/amazon/AmazonApplyOrdersTask;-><init>(Landroid/content/Context;Lcom/microblink/AmazonCredentials;Lcom/microblink/OnCompleteListener;)V

    new-array p1, v1, [Ljava/util/Map;

    aput-object p2, p1, v0

    instance-of p2, v2, Landroid/os/AsyncTask;

    if-nez p2, :cond_1

    invoke-virtual {v2, p1}, Lcom/microblink/internal/services/amazon/AmazonApplyOrdersTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_1
    check-cast v2, Landroid/os/AsyncTask;

    invoke-static {v2, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->applyStoredOrdersTask:Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "AmazonPreferencesImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final cancel()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Landroid/os/AsyncTask;

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->storedOrdersTask:Landroid/os/AsyncTask;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->applyStoredOrdersTask:Landroid/os/AsyncTask;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    return-void
.end method

.method public final clearCredentials()Z
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "EMAIL"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PASSWORD"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const-string v1, "AmazonPreferencesImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method

.method public final clearStoredOrders()Z
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "STORED_ORDERS"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const-string v1, "AmazonPreferencesImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method

.method public final credentials()Lcom/microblink/AmazonCredentials;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "EMAIL"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PASSWORD"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, Lcom/microblink/internal/services/amazon/AmazonUtils;->token()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/microblink/AmazonCredentials;

    invoke-static {v2, v1}, Lcom/microblink/internal/AESCrypt;->decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0}, Lcom/microblink/internal/AESCrypt;->decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lcom/microblink/AmazonCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_0
    new-instance v2, Lcom/microblink/AmazonCredentials;

    invoke-direct {v2, v1, v0}, Lcom/microblink/AmazonCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    const-string v1, "AmazonPreferencesImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/AmazonCredentials;

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/microblink/AmazonCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final hasCredentials()Z
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/AmazonCredentials;->has()Z

    move-result v0

    return v0
.end method

.method public final modTime()I
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "REMOTE_JS_MOD_TIME"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    const-string v2, "AmazonPreferencesImpl"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method public final storedOrders(Lcom/microblink/AmazonCredentials;Lcom/microblink/OnCompleteListener;)V
    .locals 4
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/AmazonCredentials;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/AmazonCredentials;->has()Z

    move-result v1

    if-nez v1, :cond_0

    const-string p1, "AmazonPreferencesImpl"

    const-string v1, "amazon credentials are invalid and stored orders can\'t be looked up!!!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "STORED_ORDERS"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 v1, 0x1

    new-array v2, v1, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->storedOrdersTask:Landroid/os/AsyncTask;

    aput-object v3, v2, v0

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    new-instance v2, Lcom/microblink/internal/services/amazon/AmazonOrdersTask;

    iget-object v3, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->context:Landroid/content/Context;

    invoke-direct {v2, v3, p2}, Lcom/microblink/internal/services/amazon/AmazonOrdersTask;-><init>(Landroid/content/Context;Lcom/microblink/OnCompleteListener;)V

    new-array v1, v1, [Lcom/microblink/AmazonCredentials;

    aput-object p1, v1, v0

    instance-of p1, v2, Landroid/os/AsyncTask;

    if-nez p1, :cond_2

    invoke-virtual {v2, v1}, Lcom/microblink/internal/services/amazon/AmazonOrdersTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_2
    check-cast v2, Landroid/os/AsyncTask;

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;->storedOrdersTask:Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "AmazonPreferencesImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
