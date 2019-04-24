.class Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V
    .locals 0

    .line 383
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .line 386
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Landroid/content/Context;)V

    .line 389
    :cond_0
    return-void
.end method
