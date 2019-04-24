.class Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 146
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 147
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 149
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->d(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    .line 150
    goto :goto_0

    .line 152
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->g(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    .line 153
    goto :goto_0

    .line 155
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;->i(Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;)V

    .line 156
    .line 160
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
