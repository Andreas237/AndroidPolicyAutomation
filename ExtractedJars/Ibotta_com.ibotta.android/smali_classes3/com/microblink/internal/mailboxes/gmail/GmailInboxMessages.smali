.class public final Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;
.super Ljava/lang/Object;


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

.field private recoverable:Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;-><init>(Ljava/util/List;Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;)V

    return-void
.end method

.method constructor <init>(Ljava/util/List;Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;",
            "Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    iput-object p2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->recoverable:Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;

    return-void
.end method


# virtual methods
.method public final messages()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final messagesInPastDay()Ljava/util/List;
    .locals 8
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-virtual {v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->date()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    const-wide/32 v5, 0x5265c00

    cmp-long v7, v3, v5

    if-gez v7, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final recoverable()Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->recoverable:Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;

    return-object v0
.end method

.method public final sortedMessages()Ljava/util/List;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    new-instance v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages$1;

    invoke-direct {v1, p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages$1;-><init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GmailInboxMessages{messages="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messages:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recoverable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->recoverable:Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
