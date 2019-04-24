.class public Lo/eay;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lo/eaz;

.field b:Ljava/lang/String;

.field c:I

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:I

.field k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/eay;->k:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lo/eay;->e:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public a(Lo/eaz;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/eay;->a:Lo/eaz;

    .line 59
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/eay;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 38
    iput p1, p0, Lo/eay;->c:I

    .line 39
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/eay;->f:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/eay;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/eay;->k:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public d()I
    .locals 1

    .line 50
    iget v0, p0, Lo/eay;->i:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 46
    iput p1, p0, Lo/eay;->i:I

    .line 47
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lo/eay;->d:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/eay;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/eay;->b:Ljava/lang/String;

    .line 55
    return-void
.end method

.method protected e(Lo/eba;)V
    .locals 2

    .line 78
    iget-object v0, p0, Lo/eay;->a:Lo/eaz;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lo/eay;->a:Lo/eaz;

    invoke-interface {v0, p0, p1}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 83
    :cond_0
    iget v0, p1, Lo/eba;->c:I

    if-eqz v0, :cond_1

    iget v0, p1, Lo/eba;->c:I

    const/4 v1, -0x8

    if-eq v0, v1, :cond_1

    .line 84
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/ebb;->e(Lo/eay;)Lo/eba;

    .line 86
    :cond_1
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/eay;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/eay;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/eay;->g:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/eay;->g:Ljava/lang/String;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/eay;->h:Ljava/lang/String;

    .line 110
    return-void
.end method
