.class public interface abstract Lcom/microblink/internal/services/walmart/WalmartService;
.super Ljava/lang/Object;


# virtual methods
.method public abstract downloadFromBlink(Landroid/net/Uri;Lcom/microblink/OnNullableCompleteListener;)V
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract downloadFromWalmart(Ljava/lang/String;Lcom/microblink/OnNullableCompleteListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation
.end method
