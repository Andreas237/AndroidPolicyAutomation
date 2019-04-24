.class Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showVerifyDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)V
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 388
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 389
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)V

    .line 390
    return-void
.end method
