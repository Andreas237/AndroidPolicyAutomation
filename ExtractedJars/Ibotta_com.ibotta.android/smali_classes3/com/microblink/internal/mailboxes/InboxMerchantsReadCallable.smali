.class public Lcom/microblink/internal/mailboxes/InboxMerchantsReadCallable;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "InboxMerchantsReadCallable"


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

    iput-object v0, p0, Lcom/microblink/internal/mailboxes/InboxMerchantsReadCallable;->service:Lcom/microblink/internal/mailboxes/InboxMerchantService;

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

    invoke-virtual {p0}, Lcom/microblink/internal/mailboxes/InboxMerchantsReadCallable;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/mailboxes/InboxMerchantsReadCallable;->service:Lcom/microblink/internal/mailboxes/InboxMerchantService;

    invoke-interface {v0}, Lcom/microblink/internal/mailboxes/InboxMerchantService;->merchants()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "InboxMerchantsReadCallable"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/internal/services/mailboxes/InboxService;->INBOX_MERCHANTS:Ljava/util/List;

    return-object v0
.end method
