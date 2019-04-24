.class Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;
.super Ljava/lang/Object;
.source "ReceiptScanActivity.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/ReceiptScanActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReceiptUploadTaskCallback"
.end annotation


# instance fields
.field private weakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/ReceiptScanActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/activities/ReceiptScanActivity;)V
    .locals 1

    .line 242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 243
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;->weakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;->weakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 254
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/ReceiptScanActivity;

    if-eqz v0, :cond_0

    .line 256
    new-instance v1, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;-><init>(Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;Lcom/shopkick/app/activities/ReceiptScanActivity;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/ReceiptScanActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
