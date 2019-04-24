.class Lcom/microblink/GmailInboxManager$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field final synthetic this$1:Lcom/microblink/GmailInboxManager$3;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager$3;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$3$1;->this$1:Lcom/microblink/GmailInboxManager$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 3
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3$1;->this$1:Lcom/microblink/GmailInboxManager$3;

    iget-object p1, p1, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3$1;->this$1:Lcom/microblink/GmailInboxManager$3;

    iget-object p1, p1, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    new-array v0, v1, [Lcom/microblink/ScanResults;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/microblink/GmailInboxCallback;->onComplete(Ljava/util/List;)V

    :cond_0
    return-void
.end method
