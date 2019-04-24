.class Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$5;->a:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 78
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 79
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 81
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity$5;->a:Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/functionSetCardManagement/FunctionSetCardManagementActivity;->c()V

    .line 82
    .line 86
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method
