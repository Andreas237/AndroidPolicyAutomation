.class public abstract Lorg/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lorg/a/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Iterator<",
            "TT;>;)",
            "Lorg/a/b;"
        }
    .end annotation

    new-instance v0, Lorg/a/a/c;

    invoke-direct {v0, p4}, Lorg/a/a/c;-><init>(Ljava/util/Iterator;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/a/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lorg/a/b;

    move-result-object p1

    return-object p1
.end method

.method private b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lorg/a/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Iterator<",
            "+",
            "Lorg/a/d;",
            ">;)",
            "Lorg/a/b;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/a/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/a/d;

    invoke-virtual {p0, p1}, Lorg/a/a;->a(Lorg/a/d;)Lorg/a/b;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p3}, Lorg/a/a;->b(Ljava/lang/String;)V

    return-object p0
.end method

.method private b(C)V
    .locals 1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    invoke-virtual {p0, p1}, Lorg/a/a;->a(C)V

    return-void

    :pswitch_0
    const-string p1, "\\n"

    goto :goto_0

    :pswitch_1
    const-string p1, "\\t"

    :goto_0
    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "\\\""

    goto :goto_0

    :cond_1
    const-string p1, "\\r"

    goto :goto_0

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Lorg/a/a;->a(C)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-direct {p0, v2}, Lorg/a/a;->b(C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lorg/a/a;->a(C)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lorg/a/b;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "null"

    :goto_0
    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    return-object p0

    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lorg/a/a;->c(Ljava/lang/String;)V

    return-object p0

    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_2

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Lorg/a/a;->a(C)V

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-direct {p0, p1}, Lorg/a/a;->b(C)V

    invoke-virtual {p0, v0}, Lorg/a/a;->a(C)V

    return-object p0

    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    const/16 v1, 0x3c

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1}, Lorg/a/a;->a(C)V

    invoke-direct {p0, p1}, Lorg/a/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    const-string p1, "s>"

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v1}, Lorg/a/a;->a(C)V

    invoke-direct {p0, p1}, Lorg/a/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    const-string p1, "L>"

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    invoke-virtual {p0, v1}, Lorg/a/a;->a(C)V

    invoke-direct {p0, p1}, Lorg/a/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    const-string p1, "F>"

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "["

    const-string v1, ", "

    const-string v2, "]"

    new-instance v3, Lorg/a/a/a;

    invoke-direct {v3, p1}, Lorg/a/a/a;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0, v1, v2, v3}, Lorg/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Lorg/a/b;

    return-object p0

    :cond_6
    invoke-virtual {p0, v1}, Lorg/a/a;->a(C)V

    invoke-direct {p0, p1}, Lorg/a/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    const/16 p1, 0x3e

    invoke-virtual {p0, p1}, Lorg/a/a;->a(C)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lorg/a/b;
    .locals 0

    invoke-virtual {p0, p1}, Lorg/a/a;->b(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Lorg/a/d;)Lorg/a/b;
    .locals 0

    invoke-interface {p1, p0}, Lorg/a/d;->a(Lorg/a/b;)V

    return-object p0
.end method

.method protected abstract a(C)V
.end method

.method protected b(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Lorg/a/a;->a(C)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
