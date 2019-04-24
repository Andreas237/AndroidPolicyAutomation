.class Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Landroid/os/Looper;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    .line 203
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 204
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 207
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 208
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg.what =="

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

    .line 209
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 211
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

    move-result-object v1

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    new-instance v1, Lo/egn;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$style;->app_update_dialogActivity:I

    invoke-direct {v1, v2, v3}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Lo/egn;)Lo/egn;

    .line 215
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_activation_lodaing_dialog:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const v1, 0x330d9ffb

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 221
    goto/16 :goto_0

    .line 223
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->g(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const v1, -0xf26005

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 227
    goto/16 :goto_0

    .line 229
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->g(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const v1, -0xf26005

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_activation_failure:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 234
    goto :goto_0

    .line 236
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->g(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;

    move-result-object v0

    const v1, -0xf26005

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_member_not_huawei_phone:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 241
    goto :goto_0

    .line 243
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->e:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_activation_success:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 244
    .line 248
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
