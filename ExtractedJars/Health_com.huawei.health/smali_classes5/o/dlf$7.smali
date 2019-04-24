.class Lo/dlf$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:I

.field final synthetic d:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/dlf$7;->d:Lo/dlf;

    iput p2, p0, Lo/dlf$7;->b:I

    iput-object p3, p0, Lo/dlf$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 162
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 164
    iget-object v0, p0, Lo/dlf$7;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iget-object v1, p0, Lo/dlf$7;->d:Lo/dlf;

    .line 165
    invoke-static {v1}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/dlf$7;->b:I

    invoke-virtual {v0, v1, v2}, Lo/dln;->c(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v6

    .line 167
    iget-object v0, p0, Lo/dlf$7;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dlr;->e(Landroid/content/Context;)Lo/dlr;

    move-result-object v0

    iget v1, p0, Lo/dlf$7;->b:I

    invoke-virtual {v0, v6, v1}, Lo/dlr;->b(Ljava/util/List;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v5

    .line 168
    if-eqz v5, :cond_0

    .line 169
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Smart_card_msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    :cond_0
    iget-object v0, p0, Lo/dlf$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 174
    return-void
.end method
