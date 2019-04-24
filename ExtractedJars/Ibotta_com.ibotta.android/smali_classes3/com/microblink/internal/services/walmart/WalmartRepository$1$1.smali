.class Lcom/microblink/internal/services/walmart/WalmartRepository$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnNullableCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnNullableCompleteListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/microblink/internal/services/walmart/WalmartRepository$1;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/walmart/WalmartRepository$1;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1$1;->this$1:Lcom/microblink/internal/services/walmart/WalmartRepository$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1$1;->this$1:Lcom/microblink/internal/services/walmart/WalmartRepository$1;

    iget-object v0, v0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/walmart/WalmartRepository$1$1;->onComplete(Landroid/graphics/Bitmap;)V

    return-void
.end method
