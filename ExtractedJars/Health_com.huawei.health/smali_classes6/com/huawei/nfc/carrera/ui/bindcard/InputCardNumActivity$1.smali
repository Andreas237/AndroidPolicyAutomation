.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->initViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/ClearEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;)V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "android.permission.CAMERA"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Lo/dsx;->e(Lo/dsx$a;Landroid/app/Activity;[Ljava/lang/String;)V

    .line 218
    :cond_0
    return-void
.end method
