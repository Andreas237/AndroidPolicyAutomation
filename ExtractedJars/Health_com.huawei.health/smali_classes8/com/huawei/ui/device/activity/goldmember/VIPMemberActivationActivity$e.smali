.class Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;)V
    .locals 0

    .line 251
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Lo/egn;)Lo/egn;

    .line 259
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const v1, -0xf26005

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;->b:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_activation_failure:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 264
    :cond_1
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCommonDialog.closeProgressDialog  timeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    return-void
.end method
