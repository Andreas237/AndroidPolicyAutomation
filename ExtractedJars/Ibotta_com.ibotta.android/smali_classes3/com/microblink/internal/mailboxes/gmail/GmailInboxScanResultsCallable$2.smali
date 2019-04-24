.class Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;


# direct methods
.method constructor <init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$2;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$2;->onComplete(Ljava/lang/String;)V

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "GmailInboxScanResultsCallable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
