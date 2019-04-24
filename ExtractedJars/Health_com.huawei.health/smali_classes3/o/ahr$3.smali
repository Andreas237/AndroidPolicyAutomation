.class Lo/ahr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahr;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/ahr;


# direct methods
.method constructor <init>(Lo/ahr;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/ahr$3;->b:Lo/ahr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;Ljava/lang/String;Z)V
    .locals 7

    .line 145
    if-eqz p3, :cond_0

    .line 146
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncWiFiDevice reg device success :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 148
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getDeviceDetailInfoList()Ljava/util/List;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 149
    const/16 v0, 0x102

    iput v0, v4, Landroid/os/Message;->what:I

    .line 150
    iget-object v0, p0, Lo/ahr$3;->b:Lo/ahr;

    invoke-static {v0}, Lo/ahr;->i(Lo/ahr;)Lo/ahr$e;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahr$e;->sendMessage(Landroid/os/Message;)Z

    .line 151
    goto :goto_1

    .line 153
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 154
    if-eqz v4, :cond_1

    .line 155
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 156
    iget-object v0, p0, Lo/ahr$3;->b:Lo/ahr;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/ahr;->d(Lo/ahr;Ljava/lang/String;)V

    .line 155
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 159
    :cond_1
    const/16 v5, 0x7cf

    .line 160
    const-string v6, "unknown error"

    .line 161
    if-eqz p1, :cond_2

    .line 162
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 163
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v6

    .line 165
    :cond_2
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncWiFiDevice() errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 167
    :goto_1
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 143
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/ahr$3;->a(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;Ljava/lang/String;Z)V

    return-void
.end method
