.class Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 796
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 799
    if-nez p1, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x186a0

    if-ne v0, v1, :cond_0

    .line 800
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_ADD_SUCCESS_COMMAND()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 803
    :cond_0
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_ADD_FAIL_COMMAND()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$2;->e:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 806
    :goto_0
    return-void
.end method
