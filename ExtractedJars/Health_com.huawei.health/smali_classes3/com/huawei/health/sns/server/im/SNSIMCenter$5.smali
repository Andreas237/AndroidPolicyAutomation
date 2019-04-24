.class Lcom/huawei/health/sns/server/im/SNSIMCenter$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/SNSIMCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V
    .locals 0

    .line 973
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$5;->c:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 978
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$5;->c:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/SNSIMCenter;J)J

    .line 979
    invoke-static {}, Lo/aza;->b()Lo/aza;

    move-result-object v0

    invoke-virtual {v0}, Lo/aza;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 982
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$5;->c:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {}, Lo/ayy;->d()Lo/ayy;

    move-result-object v1

    invoke-virtual {v1}, Lo/ayy;->e()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(Lcom/huawei/health/sns/server/im/SNSIMCenter;I)V

    .line 984
    :cond_0
    return-void
.end method
