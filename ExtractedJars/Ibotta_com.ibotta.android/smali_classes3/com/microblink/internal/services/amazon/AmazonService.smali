.class interface abstract Lcom/microblink/internal/services/amazon/AmazonService;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# virtual methods
.method public abstract html(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract js(ILcom/microblink/OnCompleteListener;)V
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/amazon/AmazonJavaScript;",
            ">;)V"
        }
    .end annotation
.end method
