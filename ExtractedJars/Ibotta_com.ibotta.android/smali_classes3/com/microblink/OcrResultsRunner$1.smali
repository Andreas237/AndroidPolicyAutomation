.class Lcom/microblink/OcrResultsRunner$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/microblink/Product;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/OcrResultsRunner;


# direct methods
.method constructor <init>(Lcom/microblink/OcrResultsRunner;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/OcrResultsRunner$1;->this$0:Lcom/microblink/OcrResultsRunner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/microblink/Product;Lcom/microblink/Product;)I
    .locals 0

    invoke-virtual {p1}, Lcom/microblink/Product;->line()I

    move-result p1

    invoke-virtual {p2}, Lcom/microblink/Product;->line()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/microblink/Product;

    check-cast p2, Lcom/microblink/Product;

    invoke-virtual {p0, p1, p2}, Lcom/microblink/OcrResultsRunner$1;->compare(Lcom/microblink/Product;Lcom/microblink/Product;)I

    move-result p1

    return p1
.end method
