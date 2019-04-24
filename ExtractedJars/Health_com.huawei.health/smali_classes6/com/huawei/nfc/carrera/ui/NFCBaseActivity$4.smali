.class Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V
    .locals 0

    .line 786
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .line 789
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 790
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->isNetworkConnected(Landroid/content/Context;)V

    .line 791
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->refreshView(Z)V

    .line 792
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->access$000(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 794
    :cond_0
    return-void
.end method
