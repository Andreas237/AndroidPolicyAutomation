.class Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1$1;
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
.field final synthetic this$1:Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1$1;->this$1:Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;

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

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/microblink/internal/services/mailboxes/Inbox;

    check-cast p2, Lcom/microblink/internal/services/mailboxes/Inbox;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1$1;->compare(Lcom/microblink/internal/services/mailboxes/Inbox;Lcom/microblink/internal/services/mailboxes/Inbox;)I

    move-result p1

    return p1
.end method
