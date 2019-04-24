.class Lcom/huawei/pay/ui/PermissionsActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

    .line 224
    iput-object p1, p0, Lcom/huawei/pay/ui/PermissionsActivity$2;->this$0:Lcom/huawei/pay/ui/PermissionsActivity;

    iput p2, p0, Lcom/huawei/pay/ui/PermissionsActivity$2;->val$mPendingRequestCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 228
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 230
    iget-object v0, p0, Lcom/huawei/pay/ui/PermissionsActivity$2;->this$0:Lcom/huawei/pay/ui/PermissionsActivity;

    iget v1, p0, Lcom/huawei/pay/ui/PermissionsActivity$2;->val$mPendingRequestCode:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    new-array v3, v3, [I

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/pay/ui/PermissionsActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 231
    return-void
.end method
