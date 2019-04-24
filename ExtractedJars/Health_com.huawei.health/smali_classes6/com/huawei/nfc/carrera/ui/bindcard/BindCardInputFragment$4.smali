.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initPWD()V
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

    .line 877
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 882
    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    .line 884
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)[Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    .line 885
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->showSafeKeyboard(Landroid/view/View;)V

    .line 887
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
