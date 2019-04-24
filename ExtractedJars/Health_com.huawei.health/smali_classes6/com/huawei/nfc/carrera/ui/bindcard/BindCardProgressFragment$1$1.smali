.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;

.field final synthetic val$errorInfo:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;->val$errorInfo:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 163
    const-string v0, "error operate type, jump to card list"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1$1;->val$errorInfo:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    iget v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;->bindSuccess(I)V

    .line 165
    return-void
.end method
