.class public abstract Lo/ckc;
.super Ljava/lang/Object;


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field protected e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/ckc;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo/ckc;->b:Ljava/lang/String;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/ckc;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Lo/ckc;)V
    .locals 1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lo/ckc;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/ckc;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Lo/ckc;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/ckc;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Lo/ckc;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/ckc;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lo/ckc;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/ckc;->c(Ljava/lang/String;)V

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/ckc;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo/ckc;->e:Ljava/lang/String;

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo/ckc;->d:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/ckc;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo/ckc;->a:Ljava/lang/String;

    return-void
.end method
