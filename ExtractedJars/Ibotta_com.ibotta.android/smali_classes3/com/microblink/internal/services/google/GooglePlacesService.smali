.class public interface abstract Lcom/microblink/internal/services/google/GooglePlacesService;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# virtual methods
.method public abstract enqueue(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/GooglePlaceResponse;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract execute(Ljava/lang/String;Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlaceResponse;
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
