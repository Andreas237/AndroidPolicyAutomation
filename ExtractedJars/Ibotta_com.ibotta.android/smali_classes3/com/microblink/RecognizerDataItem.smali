.class public final Lcom/microblink/RecognizerDataItem;
.super Ljava/lang/Object;


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private blinkReceiptId:Ljava/lang/String;

.field private countryCode:Ljava/lang/String;

.field private csv:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private frameIndex:I

.field private ocrCorrections:Z

.field private retailerId:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/RecognizerDataItem;->ocrCorrections:Z

    iput-object p1, p0, Lcom/microblink/RecognizerDataItem;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final bitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/RecognizerDataItem;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final blinkReceiptId(Ljava/lang/String;)Lcom/microblink/RecognizerDataItem;
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerDataItem;->blinkReceiptId:Ljava/lang/String;

    return-object p0
.end method

.method public final blinkReceiptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerDataItem;->blinkReceiptId:Ljava/lang/String;

    return-object v0
.end method

.method public final countryCode(Ljava/lang/String;)Lcom/microblink/RecognizerDataItem;
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerDataItem;->countryCode:Ljava/lang/String;

    return-object p0
.end method

.method public final countryCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerDataItem;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public final csv(Ljava/util/ArrayList;)Lcom/microblink/RecognizerDataItem;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/microblink/RecognizerDataItem;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/RecognizerDataItem;->csv:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final csv()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/RecognizerDataItem;->csv:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final frameIndex()I
    .locals 1

    iget v0, p0, Lcom/microblink/RecognizerDataItem;->frameIndex:I

    return v0
.end method

.method public final frameIndex(I)Lcom/microblink/RecognizerDataItem;
    .locals 0

    iput p1, p0, Lcom/microblink/RecognizerDataItem;->frameIndex:I

    return-object p0
.end method

.method public final ocrCorrections(Z)Lcom/microblink/RecognizerDataItem;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/RecognizerDataItem;->ocrCorrections:Z

    return-object p0
.end method

.method final ocrCorrections()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/RecognizerDataItem;->ocrCorrections:Z

    return v0
.end method

.method public final retailerId()I
    .locals 1

    iget v0, p0, Lcom/microblink/RecognizerDataItem;->retailerId:I

    return v0
.end method

.method public final retailerId(I)Lcom/microblink/RecognizerDataItem;
    .locals 0

    iput p1, p0, Lcom/microblink/RecognizerDataItem;->retailerId:I

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecognizerDataItem{retailerId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/RecognizerDataItem;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ocrCorrections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/RecognizerDataItem;->ocrCorrections:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bitmap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/RecognizerDataItem;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countryCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/RecognizerDataItem;->countryCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", blinkReceiptId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/RecognizerDataItem;->blinkReceiptId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", frameIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/RecognizerDataItem;->frameIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", csv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/RecognizerDataItem;->csv:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
