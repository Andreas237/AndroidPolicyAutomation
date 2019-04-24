.class Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;->b:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 83
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeChatConnect onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 85
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v0, "type"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;->b:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->eb:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;->b:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$2;->b:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fit;->c(Landroid/content/Context;)V

    .line 89
    return-void
.end method
