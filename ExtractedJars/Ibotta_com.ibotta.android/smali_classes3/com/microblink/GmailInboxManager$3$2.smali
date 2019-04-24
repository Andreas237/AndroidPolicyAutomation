.class Lcom/microblink/GmailInboxManager$3$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Ljava/util/List<",
        "Lcom/microblink/ScanResults;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/microblink/GmailInboxManager$3;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager$3;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$3$2;->this$1:Lcom/microblink/GmailInboxManager$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/GmailInboxManager$3$2;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public onSuccess(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/ScanResults;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$3$2;->this$1:Lcom/microblink/GmailInboxManager$3;

    iget-object v0, v0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$100(Lcom/microblink/GmailInboxManager;)Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->lastCheckedTime(J)V

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$3$2;->this$1:Lcom/microblink/GmailInboxManager$3;

    iget-object v0, v0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$3$2;->this$1:Lcom/microblink/GmailInboxManager$3;

    iget-object v0, v0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/microblink/GmailInboxCallback;->onComplete(Ljava/util/List;)V

    :cond_0
    return-void
.end method
