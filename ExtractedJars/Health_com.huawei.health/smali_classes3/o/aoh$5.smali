.class Lo/aoh$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aoh;->handleMessage(Landroid/os/Message;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aoh;


# direct methods
.method constructor <init>(Lo/aoh;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 99
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 100
    :try_start_0
    iget-object v0, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->d(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x6f

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 101
    iget-object v0, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->d(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 102
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteGroupInfoToCloud resCode OK! groupId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v2}, Lo/aoh;->e(Lo/aoh;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    goto :goto_0

    .line 105
    :cond_0
    iget-object v0, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->c(Lo/aoh;)I

    move-result v0

    iget-object v1, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v1}, Lo/aoh;->b(Lo/aoh;)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 106
    iget-object v0, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->a(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x6e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 107
    iget-object v0, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->a(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 108
    iget-object v0, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->i(Lo/aoh;)I

    .line 109
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteGroupInfoToCloud failed, retry time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aoh$5;->c:Lo/aoh;

    invoke-static {v2}, Lo/aoh;->c(Lo/aoh;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    :cond_1
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteGroupInfoToCloud resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :goto_0
    goto :goto_1

    .line 114
    :catch_0
    move-exception v4

    .line 115
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    :goto_1
    return-void
.end method
