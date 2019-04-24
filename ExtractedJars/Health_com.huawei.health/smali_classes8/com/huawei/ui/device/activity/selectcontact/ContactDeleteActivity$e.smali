.class Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 1

    .line 85
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 86
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->c:Ljava/lang/ref/WeakReference;

    .line 87
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 91
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    .line 93
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 94
    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;

    move-result-object v0

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

    .line 97
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 99
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->b(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    .line 100
    goto :goto_0

    .line 102
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    .line 103
    goto :goto_0

    .line 105
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    .line 106
    .line 110
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
