.class Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;->a:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 132
    if-nez p1, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x186a0

    if-ne v0, v1, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;->a:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_ORDERBY_SUCCESS_COMMAND()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;->a:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;->a:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->b(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_ORDERBY_FAIL_COMMAND()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$3;->a:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->e(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 139
    :goto_0
    return-void
.end method
