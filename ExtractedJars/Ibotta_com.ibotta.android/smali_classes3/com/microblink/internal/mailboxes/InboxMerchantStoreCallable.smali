.class public final Lcom/microblink/internal/mailboxes/InboxMerchantStoreCallable;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
        ">;",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "InboxMerchantStoreCallable"


# instance fields
.field private service:Lcom/microblink/internal/mailboxes/InboxMerchantService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;

    invoke-direct {v0, p1}, Lcom/microblink/internal/mailboxes/InboxMerchantServiceImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/internal/mailboxes/InboxMerchantStoreCallable;->service:Lcom/microblink/internal/mailboxes/InboxMerchantService;

    return-void
.end method


# virtual methods
.method public final bridge synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/microblink/internal/mailboxes/InboxMerchantStoreCallable;->then(Lcom/google/android/gms/tasks/Task;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/util/List;
    .locals 2
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/InboxMerchantStoreCallable;->service:Lcom/microblink/internal/mailboxes/InboxMerchantService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/mailboxes/InboxMerchantService;->apply(Ljava/util/List;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "InboxMerchantStoreCallable"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/mailboxes/InboxService;->INBOX_MERCHANTS:Ljava/util/List;

    return-object p1
.end method
