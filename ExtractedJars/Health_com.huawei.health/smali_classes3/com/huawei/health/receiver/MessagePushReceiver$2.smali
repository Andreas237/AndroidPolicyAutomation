.class Lcom/huawei/health/receiver/MessagePushReceiver$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/receiver/MessagePushReceiver;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Ljava/lang/String;

.field final synthetic g:Lcom/huawei/health/receiver/MessagePushReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/health/receiver/MessagePushReceiver;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->g:Lcom/huawei/health/receiver/MessagePushReceiver;

    iput-object p2, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->d:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->a:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 83
    const-string v0, "UIDV_MessagePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 5

    .line 61
    const-string v0, "UIDV_MessagePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_CENTER_KEY SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/messageCenter/savePushToken"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 63
    iget-object v0, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->e:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;-><init>(Lcom/huawei/health/receiver/MessagePushReceiver$2;)V

    invoke-static {v0, v4, v1, v2}, Lo/eam;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V

    .line 79
    return-void
.end method
