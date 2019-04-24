.class Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)Lo/egv;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Lo/egv;)V

    .line 123
    return-void
.end method
