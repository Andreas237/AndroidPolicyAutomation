.class final Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/mailboxes/InboxMerchantService;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final INBOX_MERCHANTS_SHARED_PREFERENCES:Ljava/lang/String; = "com.microblink.INBOX_MERCHANTS"

.field private static final MERCHANTS:Ljava/lang/String; = "MERCHANTS"

.field private static final TAG:Ljava/lang/String; = "InboxMerchantServiceImpl"


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private gson:Lcom/google/gson/Gson;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->gson:Lcom/google/gson/Gson;

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->context:Landroid/content/Context;

    return-void
.end method

.method private sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "com.microblink.INBOX_MERCHANTS"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final apply(Ljava/util/List;)Z
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->gson:Lcom/google/gson/Gson;

    new-instance v2, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl$2;

    invoke-direct {v2, p0}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl$2;-><init>(Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;)V

    invoke-virtual {v2}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    instance-of v3, v1, Lcom/google/gson/Gson;

    if-nez v3, :cond_0

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, p1, v2}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->context:Landroid/content/Context;

    invoke-direct {p0, v1}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "MERCHANTS"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "InboxMerchantServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return v0
.end method

.method public final merchants()Ljava/util/List;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->context:Landroid/content/Context;

    invoke-direct {p0, v1}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "MERCHANTS"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;->gson:Lcom/google/gson/Gson;

    new-instance v3, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl$1;

    invoke-direct {v3, p0}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl$1;-><init>(Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;)V

    invoke-virtual {v3}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v3

    instance-of v4, v2, Lcom/google/gson/Gson;

    if-nez v4, :cond_0

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    check-cast v2, Lcom/google/gson/Gson;

    invoke-static {v2, v1, v3}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->fromJson(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    const-string v2, "InboxMerchantServiceImpl"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-array v0, v0, [Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
