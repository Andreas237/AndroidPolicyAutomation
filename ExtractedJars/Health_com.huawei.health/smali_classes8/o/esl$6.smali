.class Lo/esl$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esl;->d(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/esl;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/esl;ILjava/lang/String;)V
    .locals 0

    .line 650
    iput-object p1, p0, Lo/esl$6;->d:Lo/esl;

    iput p2, p0, Lo/esl$6;->e:I

    iput-object p3, p0, Lo/esl$6;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 653
    iget v0, p0, Lo/esl$6;->e:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 654
    return-void

    .line 657
    :cond_0
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    iget-object v1, p0, Lo/esl$6;->b:Ljava/lang/String;

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    .line 658
    if-nez v3, :cond_1

    .line 659
    return-void

    .line 661
    :cond_1
    iget-object v0, p0, Lo/esl$6;->d:Lo/esl;

    invoke-static {v0}, Lo/esl;->c(Lo/esl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->getNotificationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaa;->e(Ljava/lang/String;)Z

    .line 662
    return-void
.end method
