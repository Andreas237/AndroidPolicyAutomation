.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showBindFailDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

.field final synthetic val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)V
    .locals 0

    .line 899
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$9;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 903
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$9;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->dismiss()V

    .line 904
    return-void
.end method
