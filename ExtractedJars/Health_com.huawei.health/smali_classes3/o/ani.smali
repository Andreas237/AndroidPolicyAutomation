.class public Lo/ani;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Z

.field private c:Landroid/content/Context;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ani;->e:Z

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ani;->b:Z

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ani;->d:Z

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ani;->c:Landroid/content/Context;

    .line 22
    iput-object p1, p0, Lo/ani;->c:Landroid/content/Context;

    .line 23
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 36
    iput-boolean p1, p0, Lo/ani;->e:Z

    .line 37
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makePromptSense:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    return-void
.end method

.method public a()Z
    .locals 5

    .line 56
    iget-object v0, p0, Lo/ani;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->e(Landroid/content/Context;)Z

    move-result v4

    .line 57
    if-nez v4, :cond_0

    .line 58
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support step counter,isPromptHasSense return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    iget-boolean v0, p0, Lo/ani;->b:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 63
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Has Received BootComplete,isPromptHasSense return false,Avoid misJudgment!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const/4 v0, 0x0

    return v0

    .line 66
    :cond_1
    iget-boolean v0, p0, Lo/ani;->d:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 68
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Has Received ShutDown,isPromptHasSense return false,Avoid misJudgment!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/4 v0, 0x0

    return v0

    .line 71
    :cond_2
    iget-boolean v0, p0, Lo/ani;->e:Z

    return v0
.end method

.method public c()V
    .locals 4

    .line 31
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleShutDownMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ani;->d:Z

    .line 33
    return-void
.end method

.method public d()V
    .locals 4

    .line 46
    iget-boolean v0, p0, Lo/ani;->e:Z

    if-nez v0, :cond_0

    .line 47
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makePromptNoSense invoke,but find itself has no sense,warnning!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    return-void

    .line 50
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ani;->e:Z

    .line 51
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makePromptNoSense,success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    return-void
.end method

.method public e()V
    .locals 4

    .line 26
    const-string v0, "Step_PromptRecord"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBootCompleteMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ani;->b:Z

    .line 28
    return-void
.end method
