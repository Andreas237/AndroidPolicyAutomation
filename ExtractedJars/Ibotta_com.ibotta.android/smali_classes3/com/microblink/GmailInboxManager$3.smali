.class Lcom/microblink/GmailInboxManager$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/GmailInboxManager;

.field final synthetic val$options:Lcom/microblink/ScanOptions;

.field final synthetic val$weak:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager;Ljava/lang/ref/WeakReference;Lcom/microblink/ScanOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    iput-object p2, p0, Lcom/microblink/GmailInboxManager$3;->val$weak:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/microblink/GmailInboxManager$3;->val$options:Lcom/microblink/ScanOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;)V
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$100(Lcom/microblink/GmailInboxManager;)Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->lastCheckedTime(J)V

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    new-array v1, v0, [Lcom/microblink/ScanResults;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/microblink/GmailInboxCallback;->onComplete(Ljava/util/List;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->recoverable()Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->val$weak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    new-instance v1, Lcom/microblink/GmailInboxException;

    const-string v2, "Activity has been destroyed and can\'t recover sign in attempt!"

    invoke-direct {v1, v2}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {v1}, Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x232f

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_4
    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->sortedMessages()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$100(Lcom/microblink/GmailInboxManager;)Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->lastCheckedTime(J)V

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object p1

    new-array v1, v0, [Lcom/microblink/ScanResults;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/microblink/GmailInboxCallback;->onComplete(Ljava/util/List;)V

    :cond_5
    return-void

    :cond_6
    invoke-virtual {p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;->messagesInPastDay()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {p1}, Lcom/microblink/GmailInboxManager;->access$100(Lcom/microblink/GmailInboxManager;)Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    move-result-object p1

    iget-object v2, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v2}, Lcom/microblink/GmailInboxManager;->access$200(Lcom/microblink/GmailInboxManager;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/GmailInboxManager$3;->val$options:Lcom/microblink/ScanOptions;

    invoke-virtual {p1, v2, v3, v1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->readInbox(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/microblink/ScanOptions;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v1, Lcom/microblink/GmailInboxManager$3$2;

    invoke-direct {v1, p0}, Lcom/microblink/GmailInboxManager$3$2;-><init>(Lcom/microblink/GmailInboxManager$3;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v1, Lcom/microblink/GmailInboxManager$3$1;

    invoke-direct {v1, p0}, Lcom/microblink/GmailInboxManager$3$1;-><init>(Lcom/microblink/GmailInboxManager$3;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$3;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;

    move-result-object v0

    new-instance v1, Lcom/microblink/GmailInboxException;

    invoke-direct {v1, p1}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_7
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;

    invoke-virtual {p0, p1}, Lcom/microblink/GmailInboxManager$3;->onSuccess(Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;)V

    return-void
.end method
