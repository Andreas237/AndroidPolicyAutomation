.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initPhone()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 936
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 4

    .line 941
    if-nez p2, :cond_1

    .line 945
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)[Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 947
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$700(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 949
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    goto :goto_0

    .line 953
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)[Landroid/widget/EditText;

    move-result-object v1

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setErrorIconDismiss(Landroid/widget/EditText;)V

    .line 957
    :cond_1
    :goto_0
    return-void
.end method
