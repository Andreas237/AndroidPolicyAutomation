.class Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;


# direct methods
.method constructor <init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository$1;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 2

    const-string v0, "GmailInboxRepository"

    const-string v1, "Last Time Checked: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
