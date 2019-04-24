.class Lcom/huawei/nfc/NFCOpenApiImpl$3;
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


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$3;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$3;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-static {v0}, Lcom/huawei/nfc/NFCOpenApiImpl;->access$100(Lcom/huawei/nfc/NFCOpenApiImpl;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->handleDeviceRepair(ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V

    .line 176
    const-string v0, "start change server status ..."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 177
    return-void
.end method
