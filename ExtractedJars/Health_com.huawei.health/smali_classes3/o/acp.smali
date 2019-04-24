.class public abstract Lo/acp;
.super Lo/acl;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Lo/acl$a;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lo/acl;-><init>()V

    .line 9
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acp;->b:Ljava/lang/String;

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acp;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 61
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/acp;->b:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public abstract a(Lo/aby;)Z
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/acp;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 51
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/acp;->e:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public abstract b(I)Z
.end method

.method public c(Z)V
    .locals 1

    .line 29
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/acp;->a:Z

    .line 30
    return-void
.end method

.method public abstract c()Z
.end method

.method public d(Lo/acl$a;)V
    .locals 1

    .line 20
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acl$a;

    iput-object v0, p0, Lo/acp;->c:Lo/acl$a;

    .line 21
    return-void
.end method

.method public e(Lo/acp;)V
    .locals 1

    .line 38
    instance-of v0, p1, Lo/acj;

    if-eqz v0, :cond_0

    .line 39
    move-object v0, p1

    check-cast v0, Lo/acj;

    invoke-virtual {v0}, Lo/acj;->g()V

    .line 41
    :cond_0
    return-void
.end method

.method public h()Lo/acl$a;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/acp;->c:Lo/acl$a;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acl$a;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lo/acp;->a:Z

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/acp;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
