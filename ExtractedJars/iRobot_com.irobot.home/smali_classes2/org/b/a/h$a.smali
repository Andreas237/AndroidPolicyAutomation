.class Lorg/b/a/h$a;
.super Lorg/b/a/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1c563f5ae6d3L


# instance fields
.field private final m:B


# direct methods
.method constructor <init>(Ljava/lang/String;B)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/b/a/h;-><init>(Ljava/lang/String;)V

    iput-byte p2, p0, Lorg/b/a/h$a;->m:B

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-byte v0, p0, Lorg/b/a/h$a;->m:B

    packed-switch v0, :pswitch_data_0

    return-object p0

    :pswitch_0
    sget-object v0, Lorg/b/a/h$a;->l:Lorg/b/a/h;

    return-object v0

    :pswitch_1
    sget-object v0, Lorg/b/a/h$a;->k:Lorg/b/a/h;

    return-object v0

    :pswitch_2
    sget-object v0, Lorg/b/a/h$a;->j:Lorg/b/a/h;

    return-object v0

    :pswitch_3
    sget-object v0, Lorg/b/a/h$a;->i:Lorg/b/a/h;

    return-object v0

    :pswitch_4
    sget-object v0, Lorg/b/a/h$a;->h:Lorg/b/a/h;

    return-object v0

    :pswitch_5
    sget-object v0, Lorg/b/a/h$a;->g:Lorg/b/a/h;

    return-object v0

    :pswitch_6
    sget-object v0, Lorg/b/a/h$a;->f:Lorg/b/a/h;

    return-object v0

    :pswitch_7
    sget-object v0, Lorg/b/a/h$a;->e:Lorg/b/a/h;

    return-object v0

    :pswitch_8
    sget-object v0, Lorg/b/a/h$a;->d:Lorg/b/a/h;

    return-object v0

    :pswitch_9
    sget-object v0, Lorg/b/a/h$a;->c:Lorg/b/a/h;

    return-object v0

    :pswitch_a
    sget-object v0, Lorg/b/a/h$a;->b:Lorg/b/a/h;

    return-object v0

    :pswitch_b
    sget-object v0, Lorg/b/a/h$a;->a:Lorg/b/a/h;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
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
.method public a(Lorg/b/a/a;)Lorg/b/a/g;
    .locals 1

    invoke-static {p1}, Lorg/b/a/e;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p1

    iget-byte v0, p0, Lorg/b/a/h$a;->m:B

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/InternalError;

    invoke-direct {p1}, Ljava/lang/InternalError;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lorg/b/a/a;->c()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lorg/b/a/a;->f()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p1}, Lorg/b/a/a;->i()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Lorg/b/a/a;->l()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p1}, Lorg/b/a/a;->o()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p1}, Lorg/b/a/a;->s()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p1}, Lorg/b/a/a;->w()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p1}, Lorg/b/a/a;->B()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p1}, Lorg/b/a/a;->D()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p1}, Lorg/b/a/a;->y()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p1}, Lorg/b/a/a;->H()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p1}, Lorg/b/a/a;->J()Lorg/b/a/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
    instance-of v1, p1, Lorg/b/a/h$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-byte v1, p0, Lorg/b/a/h$a;->m:B

    check-cast p1, Lorg/b/a/h$a;

    iget-byte p1, p1, Lorg/b/a/h$a;->m:B

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

    iget-byte v0, p0, Lorg/b/a/h$a;->m:B

    const/4 v1, 0x1

    shl-int v0, v1, v0

    return v0
.end method
