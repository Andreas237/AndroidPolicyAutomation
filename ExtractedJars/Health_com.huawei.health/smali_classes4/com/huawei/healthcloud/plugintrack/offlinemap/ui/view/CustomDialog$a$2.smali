.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 84
    const/4 v2, 0x0

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 87
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->positive_btn:I

    if-ne v3, v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v2

    goto :goto_0

    .line 89
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->negative_btn:I

    if-ne v3, v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v2

    .line 94
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 95
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 100
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 101
    return-void
.end method
