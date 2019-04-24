.class public Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessageMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/services/mailboxes/InboxMessage;",
        "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transform(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;)Lcom/microblink/internal/services/mailboxes/InboxMessage;
    .locals 8
    .param p1    # Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    new-instance v7, Lcom/microblink/internal/services/mailboxes/InboxMessage;

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->sender()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->htmlBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->messageId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->provider()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->date()Ljava/util/Date;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/microblink/internal/services/mailboxes/InboxMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    return-object v7
.end method

.method public bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessageMapper;->transform(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;)Lcom/microblink/internal/services/mailboxes/InboxMessage;

    move-result-object p1

    return-object p1
.end method
