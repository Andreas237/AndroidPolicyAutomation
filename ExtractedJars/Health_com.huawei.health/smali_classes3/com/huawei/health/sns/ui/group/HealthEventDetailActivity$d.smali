.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 1

    .line 223
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 224
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$d;->a:Ljava/lang/ref/WeakReference;

    .line 225
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 229
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    .line 231
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    :cond_0
    return-void

    .line 234
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 237
    :sswitch_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 238
    const-string v0, "activityId"

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    const/4 v0, -0x1

    invoke-virtual {v2, v0, v3}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->setResult(ILandroid/content/Intent;)V

    .line 240
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->finish()V

    .line 241
    goto :goto_0

    .line 244
    :sswitch_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 245
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->finish()V

    .line 246
    goto :goto_0

    .line 248
    :sswitch_2
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V

    .line 249
    goto :goto_0

    .line 251
    :sswitch_3
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V

    .line 252
    goto :goto_0

    .line 254
    :sswitch_4
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V

    .line 255
    goto :goto_0

    .line 257
    :sswitch_5
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/os/Message;)V

    .line 258
    goto :goto_0

    .line 260
    :sswitch_6
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c()V

    .line 261
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 262
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_join_event_succeed:I

    invoke-static {v2, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 264
    :cond_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 265
    goto :goto_0

    .line 267
    :sswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;)V

    .line 268
    .line 272
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
