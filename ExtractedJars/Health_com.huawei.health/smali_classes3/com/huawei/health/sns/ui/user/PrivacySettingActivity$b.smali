.class Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 1

    .line 187
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 188
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;->a:Ljava/lang/ref/WeakReference;

    .line 189
    return-void
.end method

.method private b(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Landroid/os/Bundle;)V
    .locals 2

    .line 207
    if-eqz p2, :cond_0

    .line 209
    const-string v0, "bundleKeyUserPrivacyFlags"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    const-string v0, "bundleKeyUserPrivacyFlags"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 212
    invoke-static {p1, v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Ljava/lang/String;)V

    .line 215
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Landroid/os/Bundle;)V
    .locals 2

    .line 194
    if-eqz p2, :cond_0

    .line 196
    const-string v0, "bundleKeyUserInfo"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    const-string v0, "bundleKeyUserInfo"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 199
    invoke-static {p1, v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    .line 202
    :cond_0
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 220
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;

    .line 222
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    :cond_0
    return-void

    .line 227
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 231
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;->c(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Landroid/os/Bundle;)V

    .line 232
    goto :goto_0

    .line 236
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->a(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 237
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;->b(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Landroid/os/Bundle;)V

    .line 238
    goto :goto_0

    .line 242
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->a(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 243
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 244
    const/16 v0, 0x3f8

    if-eq v2, v0, :cond_2

    .line 246
    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;I)V

    goto :goto_0

    .line 252
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->a(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 253
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 254
    if-eqz v2, :cond_2

    .line 256
    const-string v0, "bundleKeyUserPrivacyFlags"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 258
    const-string v0, "bundleKeyUserPrivacyFlags"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 259
    invoke-static {v1, v3}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->c(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Ljava/lang/String;)V

    .line 260
    goto :goto_0

    .line 266
    :sswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->a(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 267
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 268
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;I)V

    .line 269
    goto :goto_0

    .line 273
    :sswitch_5
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->a(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 274
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 275
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    .line 276
    .line 282
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x140 -> :sswitch_3
        0x141 -> :sswitch_5
        0x142 -> :sswitch_4
        0x206 -> :sswitch_0
        0x207 -> :sswitch_1
        0x208 -> :sswitch_2
    .end sparse-switch
.end method
