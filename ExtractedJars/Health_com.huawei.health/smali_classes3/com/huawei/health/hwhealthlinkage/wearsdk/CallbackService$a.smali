.class final Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final c:Landroid/os/IBinder;

.field private final d:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;


# direct methods
.method public constructor <init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1157
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->e:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1158
    iput-object p2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->c:Landroid/os/IBinder;

    .line 1159
    iput-object p3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->a:Ljava/lang/String;

    .line 1160
    iput-object p4, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->d:Ljava/lang/String;

    .line 1161
    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 7

    .line 1166
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->e:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    .line 1167
    if-gez v5, :cond_0

    .line 1168
    return-void

    .line 1170
    :cond_0
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "client died mPackageName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " the size of mClients is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->e:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->e:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1172
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->a:Ljava/lang/String;

    const-string v1, "PhoneService"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1173
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Z)Z

    .line 1175
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_CONNECTION_TO_WEAR"

    const-string v3, "1"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v6

    .line 1176
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0e\u7a7f\u6234App\u65ad\u5f00\u7684\u8fde\u63a5\u72b6\u6001\u662f\u5426\u5b58\u5165\u6210\u529f (binderDied)\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;->a:Ljava/lang/String;

    const-string v1, "PhoneServiceInHealth"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1179
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Z)Z

    .line 1181
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 1182
    const-string v0, "com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1183
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1184
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1187
    :cond_2
    :goto_0
    return-void
.end method
