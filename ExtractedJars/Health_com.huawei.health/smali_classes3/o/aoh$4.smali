.class Lo/aoh$4;
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
.field final synthetic d:Lo/aoh;


# direct methods
.method constructor <init>(Lo/aoh;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 67
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 68
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGroupInfoToCloud resCode OK! groupId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v2}, Lo/aoh;->e(Lo/aoh;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->d(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 70
    iget-object v0, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->d(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-object v0, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->c(Lo/aoh;)I

    move-result v0

    iget-object v1, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v1}, Lo/aoh;->b(Lo/aoh;)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 74
    iget-object v0, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->a(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 75
    iget-object v0, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->a(Lo/aoh;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 76
    iget-object v0, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v0}, Lo/aoh;->i(Lo/aoh;)I

    .line 77
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGroupInfoToCloud failed, retry time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aoh$4;->d:Lo/aoh;

    invoke-static {v2}, Lo/aoh;->c(Lo/aoh;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :cond_1
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGroupInfoToCloud resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :goto_0
    goto :goto_1

    .line 82
    :catch_0
    move-exception v4

    .line 83
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :goto_1
    return-void
.end method
