.class public Lo/civ;
.super Ljava/lang/Object;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Z

.field private f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Object;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/civ;->f:Ljava/util/HashMap;

    const-string v0, ""

    iput-object v0, p0, Lo/civ;->k:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lo/civ;->g:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lo/civ;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lo/civ;->b:Z

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lo/civ;->b:Z

    return v0
.end method

.method public b()Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Object;Ljava/lang/String;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lo/civ;->f:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-object v1
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lo/civ;->a:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lo/civ;->e:Z

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo/civ;->i:Ljava/lang/String;

    return-void
.end method

.method public d(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Object;Ljava/lang/String;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lo/civ;->f:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/civ;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lo/civ;->d:Z

    return v0
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Lo/civ;->d:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lo/civ;->a:Z

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/civ;->c:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/civ;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/civ;->k:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/civ;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/civ;->g:Ljava/lang/String;

    return-object v0
.end method
