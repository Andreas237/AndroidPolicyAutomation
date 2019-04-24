.class Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;->d(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;Ljava/lang/String;Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;->a:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e;

    iput-object p2, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;->e:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 116
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 117
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 118
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 119
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSportType()I

    move-result v0

    const/16 v1, 0xdd

    if-ne v1, v0, :cond_0

    .line 120
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v4

    .line 121
    goto :goto_1

    .line 117
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 125
    :cond_1
    :goto_1
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wechat_total_step = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const-string v5, ""

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 129
    const-string v0, "Main_WeChatPublicConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_ID_GETQRCODETICKET jumpToHwPublic trdTicket "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;->e:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/fit;->a(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity$e$4;->e:Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/wechat/WeChatPublicConnectActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 133
    return-void
.end method
