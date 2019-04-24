.class public Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ReceiptViewerIntentCreator.java"


# instance fields
.field private receiptId:I

.field private receiptImageUrls:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 17
    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->receiptImageUrls:[Ljava/lang/String;

    .line 26
    iput p2, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->receiptId:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 17
    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->receiptImageUrls:[Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->receiptImageUrls:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 31
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    iget v1, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->receiptId:I

    if-eqz v1, :cond_0

    const-string v2, "receipt_id"

    .line 34
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 35
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->receiptImageUrls:[Ljava/lang/String;

    array-length v2, v1

    if-lez v2, :cond_1

    const-string v2, "receipt_img_urls"

    .line 36
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    return-object v0

    .line 38
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Either a valid receipt ID, or a non-empty list of image URLs must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
