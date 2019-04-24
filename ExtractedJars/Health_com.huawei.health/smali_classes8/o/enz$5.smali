.class Lo/enz$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/enz;


# direct methods
.method constructor <init>(Lo/enz;)V
    .locals 0

    .line 650
    iput-object p1, p0, Lo/enz$5;->b:Lo/enz;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 653
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 654
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 656
    :sswitch_0
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoConnectedToast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    iget-object v0, p0, Lo/enz$5;->b:Lo/enz;

    invoke-static {v0}, Lo/enz;->c(Lo/enz;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 658
    .line 662
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
