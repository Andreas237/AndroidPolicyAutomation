.class Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 1

    .line 158
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 159
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 160
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 164
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    .line 166
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 167
    return-void

    .line 169
    :cond_0
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter handleMessage():"

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

    .line 170
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_6

    .line 172
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I

    .line 173
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter handleMessage() smartEnable :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 175
    goto/16 :goto_6

    .line 177
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Z)Z

    .line 178
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter handleMessage() status :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 183
    goto/16 :goto_6

    .line 185
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egn;)Lo/egn;

    .line 192
    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;

    .line 193
    if-eqz v5, :cond_7

    .line 194
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Z)Z

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getDevId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getExpiresIn()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getDevice_prodId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->m(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Lo/enz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 201
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage is success startDeviceLinkageRsq "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    goto :goto_2

    .line 203
    :cond_6
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage is fail startDeviceLinkageRsq resultCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "resultDesc "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getResultDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hwh_home_group_server_exception:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 207
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hwh_home_group_server_exception:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 209
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 210
    goto/16 :goto_6

    .line 212
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egn;)Lo/egn;

    .line 216
    :cond_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;

    .line 217
    if-eqz v6, :cond_d

    .line 218
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_c

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    if-nez v1, :cond_9

    const/4 v1, 0x1

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    :goto_3
    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Z)Z

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    if-nez v1, :cond_a

    const/4 v1, 0x1

    goto :goto_4

    :cond_a
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->o(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/dqi;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 244
    :cond_b
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopDeviceLinkage is success stopDeviceLinkageRsq "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    .line 246
    :cond_c
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopDeviceLinkage is fail stopDeviceLinkageRsq resultCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultDesc "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;->getResultDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hwh_home_group_server_exception:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_5

    .line 250
    :cond_d
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopDeviceLinkage is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hwh_home_group_server_exception:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 253
    :goto_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 254
    goto/16 :goto_6

    .line 256
    :pswitch_4
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage is devId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " proId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage is msg.agr1 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;

    .line 259
    iget v8, p1, Landroid/os/Message;->arg1:I

    .line 260
    if-eqz v7, :cond_11

    .line 261
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_f

    .line 262
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getDevId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getExpiresIn()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getDevice_prodId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->m(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lo/enz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    :cond_e
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getDevId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getDevice_prodId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v8, v1, v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;ILjava/lang/String;Ljava/lang/String;)V

    .line 267
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage is success startDeviceLinkageRsq "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    goto/16 :goto_6

    .line 269
    :cond_f
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v8, v1, v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;ILjava/lang/String;Ljava/lang/String;)V

    .line 272
    :cond_10
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage is fail startDeviceLinkageRsq resultCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "resultDesc "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->getResultDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 275
    :cond_11
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v8, v1, v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    .line 281
    :pswitch_5
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg is INTELLIGENT_HOME_TIME_OUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 285
    :cond_12
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egn;)Lo/egn;

    .line 289
    :cond_13
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hwh_home_group_server_exception:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 290
    .line 294
    :cond_14
    :goto_6
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
