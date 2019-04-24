.class Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$4;->c:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 107
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$4;->c:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)Lo/eqi;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 109
    const-string v0, "FunctionSetCardManagementActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dispatchTouchEvent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$4;->c:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)Lo/eqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqi;->notifyDataSetChanged()V

    .line 113
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
