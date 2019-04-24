.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 1

    .line 224
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 225
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$d;->e:Ljava/lang/ref/WeakReference;

    .line 226
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 230
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    .line 232
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    :cond_0
    return-void

    .line 235
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 238
    :sswitch_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 239
    const-string v0, "activityId"

    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    const/4 v0, -0x1

    invoke-virtual {v2, v0, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->setResult(ILandroid/content/Intent;)V

    .line 241
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->finish()V

    .line 242
    goto :goto_0

    .line 245
    :sswitch_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    .line 246
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->finish()V

    .line 247
    goto :goto_0

    .line 250
    :sswitch_2
    goto :goto_0

    .line 252
    :sswitch_3
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;Landroid/os/Message;)V

    .line 253
    goto :goto_0

    .line 255
    :sswitch_4
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;Landroid/os/Message;)V

    .line 256
    goto :goto_0

    .line 259
    :sswitch_5
    goto :goto_0

    .line 261
    :sswitch_6
    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->e()V

    .line 262
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 263
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_join_event_succeed:I

    invoke-static {v2, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 265
    :cond_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    .line 266
    goto :goto_0

    .line 268
    :sswitch_7
    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    .line 269
    .line 273
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xd1 -> :sswitch_0
        0xd3 -> :sswitch_1
        0x343 -> :sswitch_5
        0x348 -> :sswitch_2
        0x349 -> :sswitch_3
        0x351 -> :sswitch_4
        0x3e9 -> :sswitch_7
        0x3ea -> :sswitch_6
    .end sparse-switch
.end method
