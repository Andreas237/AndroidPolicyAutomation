.class Lcom/microblink/GmailInboxManager$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/GmailInboxManager;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$2;->this$0:Lcom/microblink/GmailInboxManager;

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

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$2;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$2;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object v0

    new-instance v1, Lcom/microblink/GmailInboxException;

    invoke-direct {v1, p1}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_0
    return-void
.end method
