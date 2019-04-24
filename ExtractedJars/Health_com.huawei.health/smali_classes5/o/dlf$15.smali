.class Lo/dlf$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlf;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dlf;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lo/dlf$15;->d:Lo/dlf;

    iput-object p2, p0, Lo/dlf$15;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 186
    iget-object v0, p0, Lo/dlf$15;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dlr;->e(Landroid/content/Context;)Lo/dlr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlr;->e()Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v2

    .line 187
    iget-object v0, p0, Lo/dlf$15;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 188
    return-void
.end method
