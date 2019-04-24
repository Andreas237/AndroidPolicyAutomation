.class Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->onCallBackSuccess(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;


# direct methods
.method constructor <init>(Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;->this$1:Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(I)V
    .locals 6

    .line 159
    const-string v0, "UIDV_MessagePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pullMessage() doPostReq onFailed ==> resCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 161
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 162
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;->this$1:Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;

    iget-object v0, v0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$callback:Lo/eak;

    invoke-interface {v0, p1, v4, v5}, Lo/eak;->e(ILjava/util/List;Ljava/util/List;)V

    .line 163
    return-void
.end method

.method public onSucceed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 141
    const-string v0, "UIDV_MessagePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pullMessage() doPostReq onSucceed ==> result == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;->this$1:Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;

    iget-object v0, v0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/pluginmessagecenter/service/MessageParser;->parseMessageArray(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 147
    invoke-static {p2}, Lcom/huawei/pluginmessagecenter/service/MessageParser;->parseRevokeIdArray(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 148
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;->this$1:Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;

    iget-object v0, v0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$callback:Lo/eak;

    const/16 v1, 0xc8

    invoke-interface {v0, v1, v4, v5}, Lo/eak;->e(ILjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    goto :goto_0

    .line 149
    :catch_0
    move-exception v6

    .line 150
    const-string v0, "UIDV_MessagePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pullMessage() doPostReq JsonSyntaxException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 152
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 153
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;->this$1:Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;

    iget-object v0, v0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$callback:Lo/eak;

    const/4 v1, -0x1

    invoke-interface {v0, v1, v7, v8}, Lo/eak;->e(ILjava/util/List;Ljava/util/List;)V

    .line 155
    :goto_0
    return-void
.end method
