.class Lo/eaa$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eaa;->e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/eaa;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/eaa;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/eaa$5;->b:Lo/eaa;

    iput-object p2, p0, Lo/eaa$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/eaa$5;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/eaa$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 141
    iget-object v0, p0, Lo/eaa$5;->b:Lo/eaa;

    invoke-static {v0}, Lo/eaa;->b(Lo/eaa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->getInstance(Landroid/content/Context;)Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    move-result-object v0

    iget-object v1, p0, Lo/eaa$5;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/eaa$5;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->requestMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 142
    iget-object v0, p0, Lo/eaa$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 143
    iget-object v0, p0, Lo/eaa$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 145
    :cond_0
    return-void
.end method
