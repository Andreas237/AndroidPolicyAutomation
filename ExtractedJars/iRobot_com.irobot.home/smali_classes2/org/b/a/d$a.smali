.class Lorg/b/a/d$a;
.super Lorg/b/a/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x909dc78ac7aL


# instance fields
.field private final a:B

.field private final transient b:Lorg/b/a/h;

.field private final transient c:Lorg/b/a/h;


# direct methods
.method constructor <init>(Ljava/lang/String;BLorg/b/a/h;Lorg/b/a/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/b/a/d;-><init>(Ljava/lang/String;)V

    iput-byte p2, p0, Lorg/b/a/d$a;->a:B

    iput-object p3, p0, Lorg/b/a/d$a;->b:Lorg/b/a/h;

    iput-object p4, p0, Lorg/b/a/d$a;->c:Lorg/b/a/h;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-byte v0, p0, Lorg/b/a/d$a;->a:B

    packed-switch v0, :pswitch_data_0

    return-object p0

    :pswitch_0
    invoke-static {}, Lorg/b/a/d;->V()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lorg/b/a/d;->U()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lorg/b/a/d;->T()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lorg/b/a/d;->S()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lorg/b/a/d;->R()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lorg/b/a/d;->Q()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lorg/b/a/d;->P()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lorg/b/a/d;->O()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lorg/b/a/d;->N()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lorg/b/a/d;->M()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lorg/b/a/d;->L()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lorg/b/a/d;->K()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lorg/b/a/d;->J()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lorg/b/a/d;->I()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lorg/b/a/d;->H()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lorg/b/a/d;->G()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lorg/b/a/d;->F()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lorg/b/a/d;->E()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lorg/b/a/d;->D()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lorg/b/a/d;->C()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lorg/b/a/d;->B()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lorg/b/a/d;->A()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lorg/b/a/d;->z()Lorg/b/a/d;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lorg/b/a/a;)Lorg/b/a/c;
    .locals 1

    invoke-static {p1}, Lorg/b/a/e;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p1

    iget-byte v0, p0, Lorg/b/a/d$a;->a:B

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/InternalError;

    invoke-direct {p1}, Ljava/lang/InternalError;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lorg/b/a/a;->d()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lorg/b/a/a;->e()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p1}, Lorg/b/a/a;->g()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Lorg/b/a/a;->h()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p1}, Lorg/b/a/a;->j()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p1}, Lorg/b/a/a;->k()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p1}, Lorg/b/a/a;->m()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p1}, Lorg/b/a/a;->n()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p1}, Lorg/b/a/a;->q()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p1}, Lorg/b/a/a;->p()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p1}, Lorg/b/a/a;->r()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p1}, Lorg/b/a/a;->t()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p1}, Lorg/b/a/a;->x()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p1}, Lorg/b/a/a;->z()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p1}, Lorg/b/a/a;->A()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p1}, Lorg/b/a/a;->u()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p1}, Lorg/b/a/a;->C()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p1}, Lorg/b/a/a;->v()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-virtual {p1}, Lorg/b/a/a;->E()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-virtual {p1}, Lorg/b/a/a;->G()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-virtual {p1}, Lorg/b/a/a;->I()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-virtual {p1}, Lorg/b/a/a;->F()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-virtual {p1}, Lorg/b/a/a;->K()Lorg/b/a/c;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/d$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-byte v1, p0, Lorg/b/a/d$a;->a:B

    check-cast p1, Lorg/b/a/d$a;

    iget-byte p1, p1, Lorg/b/a/d$a;->a:B

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lorg/b/a/d$a;->a:B

    const/4 v1, 0x1

    shl-int v0, v1, v0

    return v0
.end method

.method public y()Lorg/b/a/h;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d$a;->b:Lorg/b/a/h;

    return-object v0
.end method
