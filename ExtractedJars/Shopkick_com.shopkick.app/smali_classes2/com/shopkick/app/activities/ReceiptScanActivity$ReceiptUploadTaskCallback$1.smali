.class Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;
.super Ljava/lang/Object;
.source "ReceiptScanActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;

.field final synthetic val$activity:Lcom/shopkick/app/activities/ReceiptScanActivity;

.field final synthetic val$request:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field final synthetic val$response:Lcom/shopkick/fetchers/DataResponse;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;Lcom/shopkick/app/activities/ReceiptScanActivity;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->this$0:Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback;

    iput-object p2, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->val$activity:Lcom/shopkick/app/activities/ReceiptScanActivity;

    iput-object p3, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->val$request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    iput-object p4, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->val$response:Lcom/shopkick/fetchers/DataResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 259
    iget-object v0, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->val$activity:Lcom/shopkick/app/activities/ReceiptScanActivity;

    iget-object v1, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->val$request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    iget-object v2, p0, Lcom/shopkick/app/activities/ReceiptScanActivity$ReceiptUploadTaskCallback$1;->val$response:Lcom/shopkick/fetchers/DataResponse;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/activities/ReceiptScanActivity;->access$000(Lcom/shopkick/app/activities/ReceiptScanActivity;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method
