.class public final Lorg/b/a/m;
.super Lorg/b/a/a/e;

# interfaces
.implements Ljava/io/Serializable;
.implements Lorg/b/a/t;


# static fields
.field private static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/b/a/h;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x7fb2c1b144bL


# instance fields
.field private final b:J

.field private final c:Lorg/b/a/a;

.field private transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->f()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->g()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->i()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->h()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->j()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->k()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-static {}, Lorg/b/a/h;->l()Lorg/b/a/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-static {}, Lorg/b/a/e;->a()J

    move-result-wide v0

    invoke-static {}, Lorg/b/a/b/q;->O()Lorg/b/a/b/q;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lorg/b/a/m;-><init>(JLorg/b/a/a;)V

    return-void
.end method

.method public constructor <init>(JLorg/b/a/a;)V
    .locals 2

    invoke-direct {p0}, Lorg/b/a/a/e;-><init>()V

    invoke-static {p3}, Lorg/b/a/e;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p3

    invoke-virtual {p3}, Lorg/b/a/a;->a()Lorg/b/a/f;

    move-result-object v0

    sget-object v1, Lorg/b/a/f;->a:Lorg/b/a/f;

    invoke-virtual {v0, v1, p1, p2}, Lorg/b/a/f;->a(Lorg/b/a/f;J)J

    move-result-wide p1

    invoke-virtual {p3}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object p3

    invoke-virtual {p3}, Lorg/b/a/a;->u()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/b/a/m;->b:J

    iput-object p3, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lorg/b/a/m;

    iget-wide v1, p0, Lorg/b/a/m;->b:J

    invoke-static {}, Lorg/b/a/b/q;->N()Lorg/b/a/b/q;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/b/a/m;-><init>(JLorg/b/a/a;)V

    return-object v0

    :cond_0
    sget-object v0, Lorg/b/a/f;->a:Lorg/b/a/f;

    iget-object v1, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    invoke-virtual {v1}, Lorg/b/a/a;->a()Lorg/b/a/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/b/a/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/b/a/m;

    iget-wide v1, p0, Lorg/b/a/m;->b:J

    iget-object v3, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    invoke-virtual {v3}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/b/a/m;-><init>(JLorg/b/a/a;)V

    return-object v0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public a(I)I
    .locals 3

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/a;->u()Lorg/b/a/c;

    move-result-object p1

    :goto_0
    invoke-virtual {p0}, Lorg/b/a/m;->b()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lorg/b/a/c;->a(J)I

    move-result p1

    return p1

    :pswitch_1
    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/a;->C()Lorg/b/a/c;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/a;->E()Lorg/b/a/c;

    move-result-object p1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lorg/b/a/d;)I
    .locals 3

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The DateTimeFieldType must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/b/a/m;->b(Lorg/b/a/d;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Field \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is not supported"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p1

    invoke-virtual {p0}, Lorg/b/a/m;->b()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lorg/b/a/c;->a(J)I

    move-result p1

    return p1
.end method

.method public a(Lorg/b/a/t;)I
    .locals 6

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/m;

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, Lorg/b/a/m;

    iget-object v2, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    iget-object v3, v1, Lorg/b/a/m;->c:Lorg/b/a/a;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lorg/b/a/m;->b:J

    iget-wide v4, v1, Lorg/b/a/m;->b:J

    cmp-long p1, v2, v4

    if-gez p1, :cond_1

    const/4 v0, -0x1

    return v0

    :cond_1
    iget-wide v2, p0, Lorg/b/a/m;->b:J

    iget-wide v4, v1, Lorg/b/a/m;->b:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    invoke-super {p0, p1}, Lorg/b/a/a/e;->a(Lorg/b/a/t;)I

    move-result p1

    return p1
.end method

.method protected a(ILorg/b/a/a;)Lorg/b/a/c;
    .locals 2

    packed-switch p1, :pswitch_data_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    invoke-virtual {p2}, Lorg/b/a/a;->u()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Lorg/b/a/a;->C()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Lorg/b/a/a;->E()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected b()J
    .locals 2

    iget-wide v0, p0, Lorg/b/a/m;->b:J

    return-wide v0
.end method

.method public b(Lorg/b/a/d;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lorg/b/a/d;->y()Lorg/b/a/h;

    move-result-object v1

    sget-object v2, Lorg/b/a/m;->a:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/b/a/h;->a(Lorg/b/a/a;)Lorg/b/a/g;

    move-result-object v1

    invoke-virtual {v1}, Lorg/b/a/g;->d()J

    move-result-wide v1

    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object v3

    invoke-virtual {v3}, Lorg/b/a/a;->s()Lorg/b/a/g;

    move-result-object v3

    invoke-virtual {v3}, Lorg/b/a/g;->d()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-ltz v1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lorg/b/a/m;->c()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/c;->c()Z

    move-result p1

    return p1
.end method

.method public c()Lorg/b/a/a;
    .locals 1

    iget-object v0, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/b/a/t;

    invoke-virtual {p0, p1}, Lorg/b/a/m;->a(Lorg/b/a/t;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/m;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Lorg/b/a/m;

    iget-object v2, p0, Lorg/b/a/m;->c:Lorg/b/a/a;

    iget-object v3, v1, Lorg/b/a/m;->c:Lorg/b/a/a;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lorg/b/a/m;->b:J

    iget-wide v4, v1, Lorg/b/a/m;->b:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-super {p0, p1}, Lorg/b/a/a/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lorg/b/a/m;->d:I

    if-nez v0, :cond_0

    invoke-super {p0}, Lorg/b/a/a/e;->hashCode()I

    move-result v0

    iput v0, p0, Lorg/b/a/m;->d:I

    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/joda/convert/ToString;
    .end annotation

    invoke-static {}, Lorg/b/a/d/j;->a()Lorg/b/a/d/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/b/a/d/b;->a(Lorg/b/a/t;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
