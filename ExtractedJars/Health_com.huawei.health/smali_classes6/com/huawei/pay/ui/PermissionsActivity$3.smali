.class Lcom/huawei/pay/ui/PermissionsActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/PermissionsActivity;->showPermissionDialog(Landroid/app/Activity;I[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pay/ui/PermissionsActivity;

.field final synthetic val$mPendingRequestCode:I


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/PermissionsActivity;I)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/huawei/pay/ui/PermissionsActivity$3;->this$0:Lcom/huawei/pay/ui/PermissionsActivity;

    iput p2, p0, Lcom/huawei/pay/ui/PermissionsActivity$3;->val$mPendingRequestCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 239
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 240
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 242
    iget-object v0, p0, Lcom/huawei/pay/ui/PermissionsActivity$3;->this$0:Lcom/huawei/pay/ui/PermissionsActivity;

    iget v1, p0, Lcom/huawei/pay/ui/PermissionsActivity$3;->val$mPendingRequestCode:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    new-array v3, v3, [I

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/pay/ui/PermissionsActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 244
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
