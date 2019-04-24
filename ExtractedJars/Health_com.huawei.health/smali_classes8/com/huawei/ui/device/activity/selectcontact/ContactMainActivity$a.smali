.class Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 1

    .line 123
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 124
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 125
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 129
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    .line 131
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 132
    return-void

    .line 134
    :cond_0
    const-string v0, "ContactMainActivity"

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

    .line 135
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 138
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    .line 139
    goto :goto_0

    .line 143
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    .line 144
    goto :goto_0

    .line 147
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;->d:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    .line 148
    .line 152
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
