.class public Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "PostCaptureIntentCreator.java"


# instance fields
.field private captureCount:I

.field private receiptPath:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V
    .locals 0
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->receiptPath:Ljava/lang/String;

    .line 31
    iput p4, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->captureCount:I

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 36
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer"

    .line 37
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v1, "receipt_path"

    .line 38
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->receiptPath:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "capture_count"

    .line 39
    iget v2, p0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->captureCount:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object v0
.end method
