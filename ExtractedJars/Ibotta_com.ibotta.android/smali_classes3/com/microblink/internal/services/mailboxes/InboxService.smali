.class public interface abstract Lcom/microblink/internal/services/mailboxes/InboxService;
.super Ljava/lang/Object;


# static fields
.field public static final INBOX_MERCHANTS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Instacart"

    const-string v3, "orders@instacart.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Walmart"

    const-string v3, "help@walmart.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Sam\'s Club"

    const-string v3, "transaction@samsclub.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Peapod"

    const-string v3, "yourfriends@peapod.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Jet"

    const-string v3, "orders@jet.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Costco"

    const-string v3, "orderstatus@costco.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Target"

    const-string v3, "orders@oe.target.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Lcom/microblink/internal/services/mailboxes/InboxMerchant;

    const-string v2, "Walmart Grocery"

    const-string v3, "grocery-wmt@walmart.com"

    invoke-direct {v1, v2, v3}, Lcom/microblink/internal/services/mailboxes/InboxMerchant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x7

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/microblink/internal/services/mailboxes/InboxService;->INBOX_MERCHANTS:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract merchants()Ljava/util/List;
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
.end method

.method public abstract merchants(Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract receipt(Ljava/lang/String;Lcom/microblink/internal/services/mailboxes/Inbox;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/services/mailboxes/Inbox;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract scrape(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMessage;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;"
        }
    .end annotation
.end method

.method public abstract scrape(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/microblink/OnCompleteListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMessage;",
            ">;Z",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;>;)V"
        }
    .end annotation
.end method
