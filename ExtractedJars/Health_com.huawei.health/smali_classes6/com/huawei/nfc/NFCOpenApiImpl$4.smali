.class Lcom/huawei/nfc/NFCOpenApiImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCOpenApiImpl;->getClearCardResult(ZLandroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    iput-object p2, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 248
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-static {v0}, Lcom/huawei/nfc/NFCOpenApiImpl;->access$100(Lcom/huawei/nfc/NFCOpenApiImpl;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$4$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/NFCOpenApiImpl$4$1;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl$4;)V

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->handleDeviceRepair(ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V

    .line 262
    return-void
.end method
