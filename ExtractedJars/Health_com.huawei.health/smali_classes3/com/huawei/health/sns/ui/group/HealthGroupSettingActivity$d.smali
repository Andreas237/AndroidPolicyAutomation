.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 1

    .line 189
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 190
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 191
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 195
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    .line 197
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    :cond_0
    return-void

    .line 200
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 202
    :sswitch_0
    invoke-static {v4, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V

    .line 203
    goto/16 :goto_0

    .line 205
    :sswitch_1
    invoke-static {v4, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V

    .line 206
    goto/16 :goto_0

    .line 208
    :sswitch_2
    invoke-static {v4, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V

    .line 209
    goto/16 :goto_0

    .line 211
    :sswitch_3
    const/16 v0, 0x353

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V

    .line 212
    goto/16 :goto_0

    .line 215
    :sswitch_4
    invoke-static {v4, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V

    .line 216
    goto :goto_0

    .line 220
    :sswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_ali_sport_net_error:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 221
    goto :goto_0

    .line 230
    :sswitch_6
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 231
    goto :goto_0

    .line 234
    :sswitch_7
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthGroupUIHandler handleMessage: MSG_ADD_GROUP_OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    goto :goto_0

    .line 239
    :sswitch_8
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthGroupUIHandler handleMessage: MSG_SOME_RESTRICTED_NAME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 241
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 243
    goto :goto_0

    .line 245
    :sswitch_9
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthGroupUIHandler handleMessage: MSG_FAILED_CREATE_GROUP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 247
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_server_exception:I

    invoke-static {v4, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 249
    goto :goto_0

    .line 251
    :sswitch_a
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_desc_failed_keywords:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 252
    goto :goto_0

    .line 254
    :sswitch_b
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_info_modify_failed:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 255
    .line 259
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_7
        0x70 -> :sswitch_9
        0x72 -> :sswitch_8
        0x81 -> :sswitch_3
        0xc4 -> :sswitch_6
        0x345 -> :sswitch_4
        0x348 -> :sswitch_0
        0x349 -> :sswitch_1
        0x351 -> :sswitch_2
        0x354 -> :sswitch_a
        0x355 -> :sswitch_b
        0xaaa -> :sswitch_5
    .end sparse-switch
.end method
