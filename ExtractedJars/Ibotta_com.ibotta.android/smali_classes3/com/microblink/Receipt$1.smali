.class Lcom/microblink/Receipt$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/microblink/internal/OcrProduct;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/Receipt;


# direct methods
.method constructor <init>(Lcom/microblink/Receipt;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Receipt$1;->this$0:Lcom/microblink/Receipt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/microblink/internal/OcrProduct;Lcom/microblink/internal/OcrProduct;)I
    .locals 0

    iget p1, p1, Lcom/microblink/internal/OcrProduct;->line:I

    iget p2, p2, Lcom/microblink/internal/OcrProduct;->line:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/microblink/internal/OcrProduct;

    check-cast p2, Lcom/microblink/internal/OcrProduct;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/Receipt$1;->compare(Lcom/microblink/internal/OcrProduct;Lcom/microblink/internal/OcrProduct;)I

    move-result p1

    return p1
.end method
