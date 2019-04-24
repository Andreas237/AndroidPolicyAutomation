.class final Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/GmailInboxManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "MerchantsOnSuccessListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnSuccessListener<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/GmailInboxManager;


# direct methods
.method constructor <init>(Lcom/microblink/GmailInboxManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public final onSuccess(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$300(Lcom/microblink/GmailInboxManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;->this$0:Lcom/microblink/GmailInboxManager;

    invoke-static {v0}, Lcom/microblink/GmailInboxManager;->access$300(Lcom/microblink/GmailInboxManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
