.class Lo/dof$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dof;->e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/dod$b$d;

.field final synthetic d:Lo/dof;


# direct methods
.method constructor <init>(Lo/dof;Lo/dod$b$d;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/dof$1;->d:Lo/dof;

    iput-object p2, p0, Lo/dof$1;->a:Lo/dod$b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 4

    .line 81
    const-string v0, "UpWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserInfoToUp operationResult is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    if-nez p3, :cond_0

    .line 84
    const-string v0, "UpWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfoToUp Fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lo/dof$1;->a:Lo/dod$b$d;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 86
    return-void

    .line 88
    :cond_0
    iget-object v0, p0, Lo/dof$1;->a:Lo/dod$b$d;

    invoke-static {v0}, Lo/doe;->e(Lo/dod$b$d;)V

    .line 90
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 78
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lo/dof$1;->d(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method
