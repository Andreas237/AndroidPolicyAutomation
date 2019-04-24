.class Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 202
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg.what =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 205
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->a(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;

    move-result-object v0

    const v1, -0xf26005

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    goto :goto_0

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;

    move-result-object v0

    const v1, 0x330d9ffb

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 214
    goto :goto_0

    .line 216
    :sswitch_1
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GETDB_USER_MEMLEVEL_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;->b:Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V

    .line 218
    .line 222
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 223
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
