.class Lcom/microblink/GmailInboxManager$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/GmailInboxManager;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$6;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/microblink/GmailInboxManager$6;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$6;->this$0:Lcom/microblink/GmailInboxManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/microblink/GmailInboxManager;->access$202(Lcom/microblink/GmailInboxManager;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$6;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$6;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/GmailInboxCallback;->onSignedOut()V

    :cond_0
    return-void
.end method
