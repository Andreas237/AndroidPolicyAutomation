.class public final Lorg/b/a/b/s;
.super Lorg/b/a/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/b/a/b/s$a;,
        Lorg/b/a/b/s$b;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0xefa4c340f86ef80L


# direct methods
.method private constructor <init>(Lorg/b/a/a;Lorg/b/a/f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/b/a/b/a;-><init>(Lorg/b/a/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static a(Lorg/b/a/a;Lorg/b/a/f;)Lorg/b/a/b/s;
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Must supply a chronology"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object p0

    if-nez p0, :cond_1

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "UTC chronology must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-nez p1, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "DateTimeZone must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v0, Lorg/b/a/b/s;

    invoke-direct {v0, p0, p1}, Lorg/b/a/b/s;-><init>(Lorg/b/a/a;Lorg/b/a/f;)V

    return-object v0
.end method

.method private a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/b/a/c;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Lorg/b/a/c;"
        }
    .end annotation

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/b/a/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/b/a/c;

    return-object p1

    :cond_1
    new-instance v6, Lorg/b/a/b/s$a;

    invoke-virtual {p0}, Lorg/b/a/b/s;->a()Lorg/b/a/f;

    move-result-object v2

    invoke-virtual {p1}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v3

    invoke-virtual {p1}, Lorg/b/a/c;->e()Lorg/b/a/g;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v4

    invoke-virtual {p1}, Lorg/b/a/c;->f()Lorg/b/a/g;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v5

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lorg/b/a/b/s$a;-><init>(Lorg/b/a/c;Lorg/b/a/f;Lorg/b/a/g;Lorg/b/a/g;Lorg/b/a/g;)V

    invoke-virtual {p2, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v6

    :cond_2
    return-object p1
.end method

.method private a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/b/a/g;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Lorg/b/a/g;"
        }
    .end annotation

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/b/a/g;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/b/a/g;

    return-object p1

    :cond_1
    new-instance v0, Lorg/b/a/b/s$b;

    invoke-virtual {p0}, Lorg/b/a/b/s;->a()Lorg/b/a/f;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lorg/b/a/b/s$b;-><init>(Lorg/b/a/g;Lorg/b/a/f;)V

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_2
    return-object p1
.end method

.method static a(Lorg/b/a/g;)Z
    .locals 4

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/b/a/g;->d()J

    move-result-wide v0

    const-wide/32 v2, 0x2932e00

    cmp-long p0, v0, v2

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Lorg/b/a/f;)Lorg/b/a/a;
    .locals 2

    if-nez p1, :cond_0

    invoke-static {}, Lorg/b/a/f;->a()Lorg/b/a/f;

    move-result-object p1

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/b/s;->M()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p0

    :cond_1
    sget-object v0, Lorg/b/a/f;->a:Lorg/b/a/f;

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Lorg/b/a/b/s;

    invoke-virtual {p0}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/b/a/b/s;-><init>(Lorg/b/a/a;Lorg/b/a/f;)V

    return-object v0
.end method

.method public a()Lorg/b/a/f;
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/s;->M()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/f;

    return-object v0
.end method

.method protected a(Lorg/b/a/b/a$a;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p1, Lorg/b/a/b/a$a;->l:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->l:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->k:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->k:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->j:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->j:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->i:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->i:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->h:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->h:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->g:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->g:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->f:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->f:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->e:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->e:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->d:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->d:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->c:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->c:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->b:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->b:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->a:Lorg/b/a/g;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/g;Ljava/util/HashMap;)Lorg/b/a/g;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->a:Lorg/b/a/g;

    iget-object v1, p1, Lorg/b/a/b/a$a;->E:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->E:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->F:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->F:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->G:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->G:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->H:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->H:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->I:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->I:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->x:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->x:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->y:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->y:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->z:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->z:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->D:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->D:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->A:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->A:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->B:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->B:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->C:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->C:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->m:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->m:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->n:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->n:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->o:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->o:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->p:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->p:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->q:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->q:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->r:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->r:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->s:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->s:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->u:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->u:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->t:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->t:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->v:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v1

    iput-object v1, p1, Lorg/b/a/b/a$a;->v:Lorg/b/a/c;

    iget-object v1, p1, Lorg/b/a/b/a$a;->w:Lorg/b/a/c;

    invoke-direct {p0, v1, v0}, Lorg/b/a/b/s;->a(Lorg/b/a/c;Ljava/util/HashMap;)Lorg/b/a/c;

    move-result-object v0

    iput-object v0, p1, Lorg/b/a/b/a$a;->w:Lorg/b/a/c;

    return-void
.end method

.method public b()Lorg/b/a/a;
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/b/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/b/a/b/s;

    invoke-virtual {p0}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object v1

    invoke-virtual {p1}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lorg/b/a/b/s;->a()Lorg/b/a/f;

    move-result-object v1

    invoke-virtual {p1}, Lorg/b/a/b/s;->a()Lorg/b/a/f;

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/b/a/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/b/s;->a()Lorg/b/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/f;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0xb

    const v1, 0x4fba5

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x7

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ZonedChronology["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/b/a/b/s;->L()Lorg/b/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/b/a/b/s;->a()Lorg/b/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lorg/b/a/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
