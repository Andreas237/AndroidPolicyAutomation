.class Lcom/microblink/GmailInboxManager$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/GmailInboxManager;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$5;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$5;->this$0:Lcom/microblink/GmailInboxManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/microblink/GmailInboxManager;->access$202(Lcom/microblink/GmailInboxManager;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const-string v0, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$5;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$5;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/GmailInboxCallback;->onSignedOut()V

    :cond_0
    return-void
.end method
