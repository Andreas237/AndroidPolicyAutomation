.class Lcom/huawei/pay/ui/PermissionsActivity$1;
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

.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$mPendingRequestCode:I


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/PermissionsActivity;Landroid/app/Activity;I)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/pay/ui/PermissionsActivity$1;->this$0:Lcom/huawei/pay/ui/PermissionsActivity;

    iput-object p2, p0, Lcom/huawei/pay/ui/PermissionsActivity$1;->val$activity:Landroid/app/Activity;

    iput p3, p0, Lcom/huawei/pay/ui/PermissionsActivity$1;->val$mPendingRequestCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 218
    iget-object v0, p0, Lcom/huawei/pay/ui/PermissionsActivity$1;->this$0:Lcom/huawei/pay/ui/PermissionsActivity;

    iget-object v1, p0, Lcom/huawei/pay/ui/PermissionsActivity$1;->val$activity:Landroid/app/Activity;

    iget v2, p0, Lcom/huawei/pay/ui/PermissionsActivity$1;->val$mPendingRequestCode:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pay/ui/PermissionsActivity;->openManangePermissionUI(Landroid/app/Activity;I)V

    .line 219
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 220
    return-void
.end method
