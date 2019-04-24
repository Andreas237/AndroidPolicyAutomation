.class Lo/esl$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esl;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/esl;

.field final synthetic e:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;


# direct methods
.method constructor <init>(Lo/esl;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 0

    .line 677
    iput-object p1, p0, Lo/esl$9;->a:Lo/esl;

    iput-object p2, p0, Lo/esl$9;->e:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 680
    iget-object v0, p0, Lo/esl$9;->e:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 681
    iget-object v0, p0, Lo/esl$9;->a:Lo/esl;

    invoke-static {v0}, Lo/esl;->c(Lo/esl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iget-object v1, p0, Lo/esl$9;->e:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v1

    iget-object v2, p0, Lo/esl$9;->e:Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0, v1, v2}, Lo/dln;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    .line 682
    return-void
.end method
