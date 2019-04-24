.class public Lcom/huawei/updatesdk/support/pm/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/io/Serializable;Ljava/util/Comparator<Lcom/huawei/updatesdk/support/pm/b;>;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lcom/huawei/updatesdk/support/pm/c$a;

.field private c:Ljava/lang/Object;

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lcom/huawei/updatesdk/support/pm/c$b;

.field private h:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$a;->a:Lcom/huawei/updatesdk/support/pm/c$a;

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->b:Lcom/huawei/updatesdk/support/pm/c$a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/b;->d:Z

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$b;->a:Lcom/huawei/updatesdk/support/pm/c$b;

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->g:Lcom/huawei/updatesdk/support/pm/c$b;

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/support/pm/b;->h:I

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$a;->a:Lcom/huawei/updatesdk/support/pm/c$a;

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->b:Lcom/huawei/updatesdk/support/pm/c$a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/support/pm/b;->d:Z

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$b;->a:Lcom/huawei/updatesdk/support/pm/c$b;

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->g:Lcom/huawei/updatesdk/support/pm/c$b;

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/support/pm/b;->h:I

    invoke-virtual {p0, p2}, Lcom/huawei/updatesdk/support/pm/b;->b(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/huawei/updatesdk/support/pm/b;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/huawei/updatesdk/support/pm/b;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/updatesdk/support/pm/b;Lcom/huawei/updatesdk/support/pm/b;)I
    .locals 2

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->b()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/support/pm/b;->b()I

    move-result v1

    if-le v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/support/pm/b;->a:I

    return-void
.end method

.method public a(Lcom/huawei/updatesdk/support/pm/c$a;)V
    .locals 1

    invoke-static {p1}, Lcom/huawei/updatesdk/support/f/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/updatesdk/support/pm/c$a;

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->b:Lcom/huawei/updatesdk/support/pm/c$a;

    return-void
.end method

.method public a(Lcom/huawei/updatesdk/support/pm/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/support/pm/b;->g:Lcom/huawei/updatesdk/support/pm/c$b;

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/support/pm/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/support/pm/b;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/updatesdk/support/pm/b;->d:Z

    return-void
.end method

.method protected a()Z
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/support/pm/b;->a:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/support/pm/b;->h:I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/support/pm/b;->f:Ljava/lang/String;

    return-void
.end method

.method public c()Lcom/huawei/updatesdk/support/pm/c$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->b:Lcom/huawei/updatesdk/support/pm/c$a;

    return-object v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/huawei/updatesdk/support/pm/b;

    move-object v1, p2

    check-cast v1, Lcom/huawei/updatesdk/support/pm/b;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/updatesdk/support/pm/b;->a(Lcom/huawei/updatesdk/support/pm/b;Lcom/huawei/updatesdk/support/pm/b;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/huawei/updatesdk/support/pm/c$b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/b;->g:Lcom/huawei/updatesdk/support/pm/c$b;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/support/pm/b;->h:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->d()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {\n\tindex: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tstatus: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->c()Lcom/huawei/updatesdk/support/pm/c$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tparam: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tpackageName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tpath: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tprocessType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/b;->g()Lcom/huawei/updatesdk/support/pm/c$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
