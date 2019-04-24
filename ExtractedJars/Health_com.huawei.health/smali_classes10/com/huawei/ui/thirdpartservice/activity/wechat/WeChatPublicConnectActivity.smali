.class public Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;
    }
.end annotation


# static fields
.field private static c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field private static g:Ljava/lang/String;


# instance fields
.field private a:Lo/egd;

.field private b:Lo/fit;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 93
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;-><init>(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b:Lo/fit;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 56
    sget-object v0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 56
    sput-object p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->g:Ljava/lang/String;

    return-object p0
.end method

.method private c()V
    .locals 5

    .line 160
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateWeChatConnectStatus device is not null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const-string v4, "test"

    .line 162
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateWeChatConnectStatus deviceMac is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 170
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Landroid/content/Context;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->d:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 70
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 71
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->d:Landroid/content/Context;

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b:Lo/fit;

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b:Lo/fit;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/fit;->a(Landroid/os/Handler;)V

    .line 74
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_wechat_public_access:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->setContentView(I)V

    .line 75
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->wechat_welcome_guide_note2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->e:Landroid/widget/TextView;

    .line 76
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->weChatConnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a:Lo/egd;

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->c()V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wx36bda3d35fbcfd06"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 79
    sget-object v0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const-string v1, "wx36bda3d35fbcfd06"

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a:Lo/egd;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;-><init>(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    const/16 v1, 0xc9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    const/16 v1, 0xca

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    const/16 v1, 0xcb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    const/16 v1, 0xcd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 184
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->f:Landroid/os/Handler;

    .line 186
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 187
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 174
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 175
    return-void
.end method
