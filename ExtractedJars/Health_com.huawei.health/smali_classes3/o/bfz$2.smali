.class Lo/bfz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfz;->e(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic d:Lo/bfz;


# direct methods
.method constructor <init>(Lo/bfz;J)V
    .locals 0

    .line 379
    iput-object p1, p0, Lo/bfz$2;->d:Lo/bfz;

    iput-wide p2, p0, Lo/bfz$2;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 383
    iget-object v0, p0, Lo/bfz$2;->d:Lo/bfz;

    invoke-static {v0}, Lo/bfz;->c(Lo/bfz;)Lo/bfh;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lo/bfz$2;->d:Lo/bfz;

    invoke-static {v0}, Lo/bfz;->d(Lo/bfz;)Lo/bfh;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 386
    iget-object v0, p0, Lo/bfz$2;->d:Lo/bfz;

    invoke-static {v0}, Lo/bfz;->e(Lo/bfz;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 387
    iget-object v0, p0, Lo/bfz$2;->d:Lo/bfz;

    invoke-static {v0}, Lo/bfz;->f(Lo/bfz;)Landroid/content/Context;

    move-result-object v0

    iget-wide v1, p0, Lo/bfz$2;->a:J

    invoke-static {v0, v3, v1, v2, v4}, Lo/bde;->e(Landroid/content/Context;Lcom/huawei/health/sns/model/user/User;JLjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v5

    .line 388
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 390
    :cond_0
    return-void
.end method
