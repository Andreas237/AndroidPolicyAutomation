.class interface abstract Lcom/microblink/internal/services/amazon/AmazonPreferences;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# virtual methods
.method public abstract applyCredentials(Lcom/microblink/AmazonCredentials;)Z
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract applyModTime(I)V
.end method

.method public abstract applyStoredOrders(Lcom/microblink/AmazonCredentials;Ljava/util/Map;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/AmazonCredentials;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract clearCredentials()Z
.end method

.method public abstract clearStoredOrders()Z
.end method

.method public abstract credentials()Lcom/microblink/AmazonCredentials;
.end method

.method public abstract hasCredentials()Z
.end method

.method public abstract modTime()I
.end method

.method public abstract storedOrders(Lcom/microblink/AmazonCredentials;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/AmazonCredentials;
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
            "Lcom/microblink/AmazonCredentials;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation
.end method
