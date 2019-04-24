.class Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;
.super Ljava/lang/Object;
.source "BarcodeImageView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BarcodeInfo"
.end annotation


# instance fields
.field private data:Ljava/lang/String;

.field private format:Lcom/ibotta/android/barcode/Format;

.field private height:I

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

.field private width:I


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;Ljava/lang/String;Lcom/ibotta/android/barcode/Format;II)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->this$0:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->data:Ljava/lang/String;

    .line 192
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->format:Lcom/ibotta/android/barcode/Format;

    .line 193
    iput p4, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->width:I

    .line 194
    iput p5, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->height:I

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getFormat()Lcom/ibotta/android/barcode/Format;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->format:Lcom/ibotta/android/barcode/Format;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 210
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->height:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 206
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->width:I

    return v0
.end method

.method public isSame(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 218
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getData()Ljava/lang/String;

    move-result-object v1

    .line 219
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getFormat()Lcom/ibotta/android/barcode/Format;

    move-result-object v2

    .line 220
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getWidth()I

    move-result v3

    .line 221
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getHeight()I

    move-result p1

    const/4 v4, 0x1

    if-nez v1, :cond_1

    .line 223
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->data:Ljava/lang/String;

    if-eqz v5, :cond_2

    :cond_1
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->data:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    .line 224
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->format:Lcom/ibotta/android/barcode/Format;

    if-ne v2, v1, :cond_4

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->width:I

    if-ne v3, v1, :cond_4

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->height:I

    if-ne p1, v1, :cond_4

    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method public isValid()Z
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->data:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->format:Lcom/ibotta/android/barcode/Format;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->width:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->height:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Barcode: data=%1$s, format=%2$s, width=%3$d, height=%4$d"

    const/4 v1, 0x4

    .line 232
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->data:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->format:Lcom/ibotta/android/barcode/Format;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->height:I

    .line 233
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 232
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
