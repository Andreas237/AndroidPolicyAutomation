.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->initDate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

.field final synthetic val$clearEditText:Lcom/huawei/pay/ui/widget/ClearEditText;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;Lcom/huawei/pay/ui/widget/ClearEditText;)V
    .locals 0

    .line 1052
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;->val$clearEditText:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1056
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$12;->val$clearEditText:Lcom/huawei/pay/ui/widget/ClearEditText;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;Lcom/huawei/pay/ui/widget/ClearEditText;)V

    .line 1057
    return-void
.end method
