.class Lcom/microblink/internal/services/io/BitmapServiceImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnNullableCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnNullableCompleteListener<",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/io/BitmapServiceImpl;

.field final synthetic val$listener:Lcom/microblink/OnNullableCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/io/BitmapServiceImpl;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$1;->this$0:Lcom/microblink/internal/services/io/BitmapServiceImpl;

    iput-object p2, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/io/BitmapServiceImpl$1;->onComplete(Ljava/util/List;)V

    return-void
.end method

.method public onComplete(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
