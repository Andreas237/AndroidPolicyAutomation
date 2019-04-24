.class Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$2;
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

    .line 111
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 116
    return-void
.end method
