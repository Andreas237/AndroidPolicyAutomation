.class public interface abstract Lcom/microblink/GmailInboxCallback;
.super Ljava/lang/Object;


# virtual methods
.method public abstract onComplete(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/ScanResults;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onException(Lcom/microblink/GmailInboxException;)V
    .param p1    # Lcom/microblink/GmailInboxException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onSignedIn()V
.end method

.method public abstract onSignedOut()V
.end method
