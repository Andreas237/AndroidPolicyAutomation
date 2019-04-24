.class Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->c(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Lo/enz;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/enz;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 259
    :cond_0
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadDataWhenContactDBNOThasData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    goto :goto_0

    .line 262
    :cond_1
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadDataWhenContactDBhasData, mContactTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->i(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    .line 266
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 267
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;->c:Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 269
    return-void
.end method
