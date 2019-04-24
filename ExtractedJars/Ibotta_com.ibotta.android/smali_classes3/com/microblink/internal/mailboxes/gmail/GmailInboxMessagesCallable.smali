.class final Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;",
        ">;"
    }
.end annotation


# static fields
.field private static final MAX_DEPTH:I = 0xa

.field private static final ME:Ljava/lang/String; = "me"

.field private static final TAG:Ljava/lang/String; = "GmailInboxMessagesCallable"


# instance fields
.field private after:Ljava/util/Date;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private allMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;"
        }
    .end annotation
.end field

.field private merchants:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;"
        }
    .end annotation
.end field

.field private service:Lcom/google/api/services/gmail/Gmail;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/api/services/gmail/Gmail;Ljava/util/List;Ljava/util/Date;)V
    .locals 1
    .param p1    # Lcom/google/api/services/gmail/Gmail;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/api/services/gmail/Gmail;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->allMessages:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->service:Lcom/google/api/services/gmail/Gmail;

    iput-object p2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->merchants:Ljava/util/List;

    iput-object p3, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->after:Ljava/util/Date;

    return-void
.end method

.method private body(Lcom/google/api/services/gmail/model/MessagePart;)Ljava/lang/String;
    .locals 3
    .param p1    # Lcom/google/api/services/gmail/model/MessagePart;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p1}, Lcom/google/api/services/gmail/model/MessagePart;->getParts()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/api/services/gmail/model/MessagePart;->getMimeType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/html"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/api/services/gmail/model/MessagePart;->getBody()Lcom/google/api/services/gmail/model/MessagePartBody;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/api/services/gmail/model/MessagePartBody;->getData()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/api/client/util/Base64;->decodeBase64(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/api/services/gmail/model/MessagePart;

    invoke-direct {p0, v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->body(Lcom/google/api/services/gmail/model/MessagePart;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_1

    return-object v0

    :catch_0
    move-exception p1

    const-string v0, "GmailInboxMessagesCallable"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private execute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, p4

    const/4 v4, 0x0

    const/16 v0, 0xa

    if-lt v3, v0, :cond_0

    const-string v0, "GmailInboxMessagesCallable"

    const-string v2, "Max recursion reached"

    new-array v3, v4, [Ljava/lang/Object;

    :goto_0
    invoke-static {v0, v2, v3}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->service:Lcom/google/api/services/gmail/Gmail;

    invoke-virtual {v0}, Lcom/google/api/services/gmail/Gmail;->users()Lcom/google/api/services/gmail/Gmail$Users;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/api/services/gmail/Gmail$Users;->messages()Lcom/google/api/services/gmail/Gmail$Users$Messages;

    move-result-object v0

    const-string v5, "me"

    invoke-virtual {v0, v5}, Lcom/google/api/services/gmail/Gmail$Users$Messages;->list(Ljava/lang/String;)Lcom/google/api/services/gmail/Gmail$Users$Messages$List;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/api/services/gmail/Gmail$Users$Messages$List;->setQ(Ljava/lang/String;)Lcom/google/api/services/gmail/Gmail$Users$Messages$List;

    move-result-object v0

    invoke-static/range {p3 .. p3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    move-object/from16 v5, p3

    invoke-virtual {v0, v5}, Lcom/google/api/services/gmail/Gmail$Users$Messages$List;->setPageToken(Ljava/lang/String;)Lcom/google/api/services/gmail/Gmail$Users$Messages$List;

    :cond_1
    invoke-virtual {v0}, Lcom/google/api/services/gmail/Gmail$Users$Messages$List;->execute()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/api/services/gmail/model/ListMessagesResponse;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/google/api/services/gmail/model/ListMessagesResponse;->getMessages()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/api/services/gmail/model/ListMessagesResponse;->getNextPageToken()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/api/services/gmail/model/Message;

    :try_start_0
    invoke-virtual {v0}, Lcom/google/api/services/gmail/model/Message;->getId()Ljava/lang/String;

    move-result-object v13

    iget-object v0, v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->service:Lcom/google/api/services/gmail/Gmail;

    invoke-virtual {v0}, Lcom/google/api/services/gmail/Gmail;->users()Lcom/google/api/services/gmail/Gmail$Users;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/api/services/gmail/Gmail$Users;->messages()Lcom/google/api/services/gmail/Gmail$Users$Messages;

    move-result-object v0

    const-string v9, "me"

    invoke-virtual {v0, v9, v13}, Lcom/google/api/services/gmail/Gmail$Users$Messages;->get(Ljava/lang/String;Ljava/lang/String;)Lcom/google/api/services/gmail/Gmail$Users$Messages$Get;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/api/services/gmail/Gmail$Users$Messages$Get;->execute()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/api/services/gmail/model/Message;

    invoke-virtual {v0}, Lcom/google/api/services/gmail/model/Message;->getPayload()Lcom/google/api/services/gmail/model/MessagePart;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/google/api/services/gmail/model/MessagePart;->getHeaders()Ljava/util/List;

    move-result-object v0

    const/4 v10, 0x0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v11

    if-nez v11, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/api/services/gmail/model/MessagePartHeader;

    invoke-virtual {v0}, Lcom/google/api/services/gmail/model/MessagePartHeader;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v14, "Date"

    invoke-virtual {v14, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    const-string v14, "("

    invoke-virtual {v12, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_3

    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v14, "E, dd MMM yyyy HH:mm:ss Z (zzz)"

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v12, v14, v15}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    goto :goto_3

    :cond_3
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v14, "E, dd MMM yyyy HH:mm:ss Z"

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v12, v14, v15}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :goto_3
    :try_start_1
    invoke-virtual {v0}, Lcom/google/api/services/gmail/model/MessagePartHeader;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_2
    const-string v12, "GmailInboxMessagesCallable"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v14, v4, [Ljava/lang/Object;

    invoke-static {v12, v0, v14}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object v15, v10

    invoke-direct {v1, v9}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->body(Lcom/google/api/services/gmail/model/MessagePart;)Ljava/lang/String;

    move-result-object v0

    iget-object v14, v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->allMessages:Ljava/util/List;

    new-instance v12, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_4

    :cond_5
    const-string v0, ""

    :goto_4
    const-string v16, "gmail"

    move-object v9, v12

    move-object/from16 v11, p1

    move-object v4, v12

    move-object v12, v0

    move-object v0, v14

    move-object/from16 v14, v16

    invoke-direct/range {v9 .. v15}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v7, :cond_7

    invoke-static {v6}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v0, :cond_6

    add-int/lit8 v0, v3, 0x1

    move-object/from16 v4, p1

    :try_start_3
    invoke-direct {v1, v4, v2, v6, v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->execute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_6

    :cond_6
    move-object/from16 v4, p1

    const-string v0, "GmailInboxMessagesCallable"

    const-string v9, "All Messages Done!"

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v0, v9, v11}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    :catch_1
    move-exception v0

    goto :goto_5

    :cond_7
    move-object/from16 v4, p1

    goto :goto_6

    :catch_2
    move-exception v0

    move-object/from16 v4, p1

    :goto_5
    const-string v9, "GmailInboxMessagesCallable"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Object;

    invoke-static {v9, v0, v11}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_6
    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_8
    return-void

    :cond_9
    const/4 v10, 0x0

    const-string v0, "GmailInboxMessagesCallable"

    const-string v2, "No messages found from this sender."

    :goto_7
    new-array v3, v10, [Ljava/lang/Object;

    goto/16 :goto_0

    :cond_a
    const/4 v10, 0x0

    const-string v0, "GmailInboxMessagesCallable"

    const-string v2, "No response found from this sender."

    goto :goto_7
.end method


# virtual methods
.method public final call()Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;
    .locals 11

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "YYYY/M/d"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->merchants:Ljava/util/List;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->merchants:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    invoke-virtual {v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;->email()Ljava/lang/String;

    move-result-object v3

    const-string v4, " "

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "from:%s"

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v3, v9, v0

    invoke-static {v6, v7, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "after:%s"

    new-array v9, v8, [Ljava/lang/Object;

    iget-object v10, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->after:Ljava/util/Date;

    invoke-virtual {v1, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v0

    invoke-static {v6, v7, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v5}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {p0, v3, v4, v5, v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->execute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;

    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->allMessages:Ljava/util/List;

    invoke-direct {v1, v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;-><init>(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    const-string v1, "GmailInboxMessagesCallable"

    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->service:Lcom/google/api/services/gmail/Gmail;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;

    new-array v0, v0, [Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;-><init>(Ljava/util/List;)V

    return-object v1

    :catch_1
    move-exception v1

    const-string v2, "GmailInboxMessagesCallable"

    iget-object v3, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->service:Lcom/google/api/services/gmail/Gmail;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;

    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->allMessages:Ljava/util/List;

    invoke-direct {v0, v2, v1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;-><init>(Ljava/util/List;Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;)V

    return-object v0
.end method

.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;->call()Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;

    move-result-object v0

    return-object v0
.end method
