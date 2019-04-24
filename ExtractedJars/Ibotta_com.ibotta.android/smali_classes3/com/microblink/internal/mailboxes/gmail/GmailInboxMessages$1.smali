.class Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;


# direct methods
.method constructor <init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages$1;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;)I
    .locals 0

    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->date()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;->date()Ljava/util/Date;

    move-result-object p2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    check-cast p2, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages$1;->compare(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;)I

    move-result p1

    return p1
.end method
