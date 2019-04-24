.class Lcom/huawei/health/sns/ui/chat/ChatActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 0

    .line 754
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$1;->b:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 758
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 759
    const-string v0, "action_show_bind_phone_dlg"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 761
    const-string v0, "ChatActivity"

    const-string v1, "_sns_ receive show dlg action"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$1;->b:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->x()V

    .line 764
    :cond_0
    return-void
.end method
