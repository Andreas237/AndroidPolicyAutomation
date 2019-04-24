.class Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/microblink/internal/services/mailboxes/Inbox;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;


# direct methods
.method constructor <init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$1;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/microblink/internal/services/mailboxes/Inbox;Lcom/microblink/internal/services/mailboxes/Inbox;)I
    .locals 0

    invoke-virtual {p1}, Lcom/microblink/internal/services/mailboxes/Inbox;->index()I

    move-result p1

    invoke-virtual {p2}, Lcom/microblink/internal/services/mailboxes/Inbox;->index()I

    move-result p2

    if-ge p1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/microblink/internal/services/mailboxes/Inbox;

    check-cast p2, Lcom/microblink/internal/services/mailboxes/Inbox;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$1;->compare(Lcom/microblink/internal/services/mailboxes/Inbox;Lcom/microblink/internal/services/mailboxes/Inbox;)I

    move-result p1

    return p1
.end method
