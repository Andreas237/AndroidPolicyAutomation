.class final Lcom/google/c/b/d;
.super Lcom/google/c/b/x;
.source "IMASDK"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/x<",
        "TF;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/c/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/a/c<",
            "TF;+TT;>;"
        }
    .end annotation
.end field

.field final b:Lcom/google/c/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/c/a/c;Lcom/google/c/b/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/c/a/c<",
            "TF;+TT;>;",
            "Lcom/google/c/b/x<",
            "TT;>;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Lcom/google/c/b/x;-><init>()V

    .line 37
    invoke-static {p1}, Lcom/google/c/a/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/c/a/c;

    iput-object p1, p0, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    .line 38
    invoke-static {p2}, Lcom/google/c/a/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/c/b/x;

    iput-object p1, p0, Lcom/google/c/b/d;->b:Lcom/google/c/b/x;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;TF;)I"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/google/c/b/d;->b:Lcom/google/c/b/x;

    iget-object v1, p0, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    invoke-interface {v1, p1}, Lcom/google/c/a/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    invoke-interface {v1, p2}, Lcom/google/c/a/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/c/b/x;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 51
    :cond_0
    instance-of v1, p1, Lcom/google/c/b/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 52
    check-cast p1, Lcom/google/c/b/d;

    .line 53
    iget-object v1, p0, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    iget-object v3, p1, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    invoke-interface {v1, v3}, Lcom/google/c/a/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/c/b/d;->b:Lcom/google/c/b/x;

    iget-object p1, p1, Lcom/google/c/b/d;->b:Lcom/google/c/b/x;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    .line 60
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/c/b/d;->b:Lcom/google/c/b/x;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/c/a/e;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 65
    iget-object v0, p0, Lcom/google/c/b/d;->b:Lcom/google/c/b/x;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/c/b/d;->a:Lcom/google/c/a/c;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xd

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".onResultOf("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
