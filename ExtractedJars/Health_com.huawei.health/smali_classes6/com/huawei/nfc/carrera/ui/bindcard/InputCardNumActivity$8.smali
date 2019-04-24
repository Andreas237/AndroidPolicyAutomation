.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;
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

    .line 888
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 892
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->gotoSetting(Landroid/content/Context;)V

    .line 893
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$8;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->dismiss()V

    .line 894
    return-void
.end method
