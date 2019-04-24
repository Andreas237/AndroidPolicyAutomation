.class Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->fetchRedPacketInfo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 13

    .line 192
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 193
    :try_start_0
    const-class v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;

    invoke-static {p2, v0}, Lo/ett;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$102(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Z)Z

    .line 195
    if-eqz v4, :cond_0

    .line 196
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->getResultCode()I

    move-result v0

    if-nez v0, :cond_0

    .line 198
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->getRedActivity()Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;

    move-result-object v5

    .line 199
    if-eqz v5, :cond_0

    .line 200
    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getJoinStatus()I

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/redpacket/RedPacketBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$200(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)J

    move-result-wide v6

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getBeginDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$200(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)J

    move-result-wide v8

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getEndDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$200(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)J

    move-result-wide v10

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getIconJumpUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$302(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getRedPacketId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$402(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;I)I

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->getRedPacketName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$502(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    const-wide/16 v0, -0x1

    cmp-long v0, v6, v0

    if-eqz v0, :cond_0

    cmp-long v0, v6, v8

    if-ltz v0, :cond_0

    cmp-long v0, v6, v10

    if-gez v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$102(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Z)Z

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$600(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/app/Activity;

    move-result-object v12

    .line 210
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    .line 211
    new-instance v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;

    invoke-direct {v0, p0, v5}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$1;-><init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;)V

    invoke-virtual {v12, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 228
    :cond_0
    goto :goto_0

    .line 225
    :catch_0
    move-exception v4

    .line 226
    const-string v0, "RedPacketManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$102(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;Z)Z

    .line 229
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$100(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;->this$0:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->access$600(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;)Landroid/app/Activity;

    move-result-object v4

    .line 231
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 232
    new-instance v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2$2;-><init>(Lcom/huawei/ui/homehealth/redpacket/RedPacketManager$2;)V

    invoke-virtual {v4, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 240
    :cond_1
    return-void
.end method
