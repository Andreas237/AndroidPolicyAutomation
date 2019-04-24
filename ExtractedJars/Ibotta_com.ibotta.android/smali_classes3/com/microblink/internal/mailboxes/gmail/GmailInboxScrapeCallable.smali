.class final Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/Inbox;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GmailInboxScrapeCallable"


# instance fields
.field private messages:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;"
        }
    .end annotation
.end field

.field private options:Lcom/microblink/ScanOptions;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private service:Lcom/microblink/internal/services/mailboxes/InboxService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/microblink/ScanOptions;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/ScanOptions;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->options:Lcom/microblink/ScanOptions;

    iput-object p2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->messages:Ljava/util/List;

    new-instance p1, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;

    invoke-direct {p1}, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->service:Lcom/microblink/internal/services/mailboxes/InboxService;

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final call()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/microblink/internal/services/mailboxes/Inbox;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->messages:Ljava/util/List;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessageMapper;

    invoke-direct {v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessageMapper;-><init>()V

    iget-object v3, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->messages:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    iget-object v5, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->service:Lcom/microblink/internal/services/mailboxes/InboxService;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v7}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    new-array v9, v8, [Lcom/microblink/internal/services/mailboxes/InboxMessage;

    invoke-virtual {v2, v4}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessageMapper;->transform(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;)Lcom/microblink/internal/services/mailboxes/InboxMessage;

    move-result-object v10

    aput-object v10, v9, v0

    invoke-static {v9}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v5, v6, v7, v9, v8}, Lcom/microblink/internal/services/mailboxes/InboxService;->scrape(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/microblink/internal/Utility;->getFirst(Ljava/util/Collection;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/microblink/internal/services/mailboxes/Inbox;

    if-nez v5, :cond_0

    new-instance v5, Lcom/microblink/internal/services/mailboxes/Inbox;

    invoke-direct {v5}, Lcom/microblink/internal/services/mailboxes/Inbox;-><init>()V

    :cond_0
    invoke-virtual {v4}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->htmlBody()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/microblink/internal/services/mailboxes/Inbox;->html(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "GmailInboxScrapeCallable"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v3, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-object v1
.end method
