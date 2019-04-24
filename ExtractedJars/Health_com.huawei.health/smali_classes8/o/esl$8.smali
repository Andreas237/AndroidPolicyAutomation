.class Lo/esl$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esl;->e(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esl;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/esl;Ljava/lang/String;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lo/esl$8;->b:Lo/esl;

    iput-object p2, p0, Lo/esl$8;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 707
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    iget-object v1, p0, Lo/esl$8;->c:Ljava/lang/String;

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    .line 708
    if-nez v3, :cond_0

    .line 709
    return-void

    .line 711
    :cond_0
    iget-object v0, p0, Lo/esl$8;->b:Lo/esl;

    invoke-static {v0}, Lo/esl;->c(Lo/esl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->getNotificationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaa;->d(Ljava/lang/String;)Z

    .line 712
    return-void
.end method
