.class public Lo/ddm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private k:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lo/ddm;->d:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lo/ddm;->a:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lo/ddm;->b:Ljava/lang/String;

    .line 20
    const/4 v0, -0x1

    iput v0, p0, Lo/ddm;->c:I

    .line 22
    const/4 v0, 0x3

    iput v0, p0, Lo/ddm;->e:I

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddm;->f:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddm;->g:Z

    .line 28
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    iput-object v0, p0, Lo/ddm;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/ddm;->n:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/ddm;->d:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/ddm;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 1

    .line 83
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ddm;->c:I

    .line 84
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 75
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ddm;->b:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/ddm;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/ddm;->p:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 100
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/ddm;->f:Z

    .line 101
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/ddm;->p:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/ddm;->n:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public d(Z)V
    .locals 1

    .line 108
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/ddm;->g:Z

    .line 109
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/ddm;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 1

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ddm;->e:I

    .line 93
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 116
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    iput-object v0, p0, Lo/ddm;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 117
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 67
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ddm;->a:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public f()Z
    .locals 1

    .line 96
    iget-boolean v0, p0, Lo/ddm;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    .line 79
    iget v0, p0, Lo/ddm;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    .line 124
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ddm;->h:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public h()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Lo/ddm;->g:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public i()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 1

    .line 112
    iget-object v0, p0, Lo/ddm;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 88
    iget v0, p0, Lo/ddm;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    .line 132
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ddm;->k:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lo/ddm;->k:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lo/ddm;->h:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
