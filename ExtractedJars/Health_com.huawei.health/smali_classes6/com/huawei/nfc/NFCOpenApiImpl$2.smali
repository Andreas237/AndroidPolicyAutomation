.class Lcom/huawei/nfc/NFCOpenApiImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCOpenApiImpl;->showRepairDeviceDlgJudgeByUser(Landroid/app/Activity;)V
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

    .line 178
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$2;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    iput-object p2, p0, Lcom/huawei/nfc/NFCOpenApiImpl$2;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$2;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-static {v0}, Lcom/huawei/nfc/NFCOpenApiImpl;->access$100(Lcom/huawei/nfc/NFCOpenApiImpl;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$2$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/NFCOpenApiImpl$2$1;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl$2;)V

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->handleDeviceRepair(ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V

    .line 192
    const-string v0, "start delete cards ..."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$2;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    iget-object v1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$2;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/nfc/NFCOpenApiImpl$2;->val$activity:Landroid/app/Activity;

    .line 195
    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/wallet/R$string;->nfc_device_status_repair_wait_progress_content:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 193
    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/NFCOpenApiImpl;->access$200(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;Ljava/lang/String;)V

    .line 198
    return-void
.end method
