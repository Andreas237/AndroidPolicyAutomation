.class Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->initViews()V
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

    .line 144
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 161
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 167
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 169
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 153
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 148
    return-void
.end method
