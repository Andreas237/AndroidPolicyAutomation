.class public final Lorg/b/a/b/q;
.super Lorg/b/a/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/b/a/b/q$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/b/a/b/q;

.field private static final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lorg/b/a/f;",
            "Lorg/b/a/b/q;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x5637ee998ec8afd9L


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/b/a/b/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lorg/b/a/b/q;

    invoke-static {}, Lorg/b/a/b/p;->Z()Lorg/b/a/b/p;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/b/a/b/q;-><init>(Lorg/b/a/a;)V

    sput-object v0, Lorg/b/a/b/q;->a:Lorg/b/a/b/q;

    sget-object v0, Lorg/b/a/b/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v1, Lorg/b/a/f;->a:Lorg/b/a/f;

    sget-object v2, Lorg/b/a/b/q;->a:Lorg/b/a/b/q;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lorg/b/a/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/b/a/b/a;-><init>(Lorg/b/a/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static N()Lorg/b/a/b/q;
    .locals 1

    sget-object v0, Lorg/b/a/b/q;->a:Lorg/b/a/b/q;

    return-object v0
.end method

.method public static O()Lorg/b/a/b/q;
    .locals 1

    invoke-static {}, Lorg/b/a/f;->a()Lorg/b/a/f;

    move-result-object v0

    invoke-static {v0}, Lorg/b/a/b/q;->b(Lorg/b/a/f;)Lorg/b/a/b/q;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lorg/b/a/f;)Lorg/b/a/b/q;
    .locals 2

    if-nez p0, :cond_0

    invoke-static {}, Lorg/b/a/f;->a()Lorg/b/a/f;

    move-result-object p0

    :cond_0
    sget-object v0, Lorg/b/a/b/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/b/q;

    if-nez v0, :cond_1

    new-instance v0, Lorg/b/a/b/q;

    sget-object v1, Lorg/b/a/b/q;->a:Lorg/b/a/b/q;

    invoke-static {v1, p0}, Lorg/b/a/b/s;->a(Lorg/b/a/a;Lorg/b/a/f;)Lorg/b/a/b/s;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/b/a/b/q;-><init>(Lorg/b/a/a;)V

    sget-object v1, Lorg/b/a/b/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/b/a/b/q;

    if-eqz p0, :cond_1

    move-object v0, p0

    :cond_1
    return-object v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/b/a/b/q$a;

    invoke-virtual {p0}, Lorg/b/a/b/q;->a()Lorg/b/a/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/b/a/b/q$a;-><init>(Lorg/b/a/f;)V

    return-object v0
.end method


# virtual methods
.method public a(Lorg/b/a/f;)Lorg/b/a/a;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lorg/b/a/f;->a()Lorg/b/a/f;

    move-result-object p1

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/b/q;->a()Lorg/b/a/f;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p1}, Lorg/b/a/b/q;->b(Lorg/b/a/f;)Lorg/b/a/b/q;

    move-result-object p1

    return-object p1
.end method

.method protected a(Lorg/b/a/b/a$a;)V
    .locals 4

    invoke-virtual {p0}, Lorg/b/a/b/q;->L()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/a;->a()Lorg/b/a/f;

    move-result-object v0

    sget-object v1, Lorg/b/a/f;->a:Lorg/b/a/f;

    if-ne v0, v1, :cond_0

    new-instance v0, Lorg/b/a/c/f;

    sget-object v1, Lorg/b/a/b/r;->a:Lorg/b/a/c;

    invoke-static {}, Lorg/b/a/d;->v()Lorg/b/a/d;

    move-result-object v2

    const/16 v3, 0x64

    invoke-direct {v0, v1, v2, v3}, Lorg/b/a/c/f;-><init>(Lorg/b/a/c;Lorg/b/a/d;I)V

    iput-object v0, p1, Lorg/b/a/b/a$a;->H:Lorg/b/a/c;

    iget-object v0, p1, Lorg/b/a/b/a$a;->H:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object v0

    iput-object v0, p1, Lorg/b/a/b/a$a;->k:Lorg/b/a/g;

    new-instance v0, Lorg/b/a/c/n;

    iget-object v1, p1, Lorg/b/a/b/a$a;->H:Lorg/b/a/c;

    check-cast v1, Lorg/b/a/c/f;

    invoke-static {}, Lorg/b/a/d;->u()Lorg/b/a/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/b/a/c/n;-><init>(Lorg/b/a/c/f;Lorg/b/a/d;)V

    iput-object v0, p1, Lorg/b/a/b/a$a;->G:Lorg/b/a/c;

    new-instance v0, Lorg/b/a/c/n;

    iget-object v1, p1, Lorg/b/a/b/a$a;->H:Lorg/b/a/c;

    check-cast v1, Lorg/b/a/c/f;

    iget-object v2, p1, Lorg/b/a/b/a$a;->h:Lorg/b/a/g;

    invoke-static {}, Lorg/b/a/d;->q()Lorg/b/a/d;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/b/a/c/n;-><init>(Lorg/b/a/c/f;Lorg/b/a/g;Lorg/b/a/d;)V

    iput-object v0, p1, Lorg/b/a/b/a$a;->C:Lorg/b/a/c;

    :cond_0
    return-void
.end method

.method public b()Lorg/b/a/a;
    .locals 1

    sget-object v0, Lorg/b/a/b/q;->a:Lorg/b/a/b/q;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/b/a/b/q;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/b/a/b/q;

    invoke-virtual {p0}, Lorg/b/a/b/q;->a()Lorg/b/a/f;

    move-result-object v0

    invoke-virtual {p1}, Lorg/b/a/b/q;->a()Lorg/b/a/f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/b/a/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    const-string v0, "ISO"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0xb

    invoke-virtual {p0}, Lorg/b/a/b/q;->a()Lorg/b/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lorg/b/a/f;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "ISOChronology"

    invoke-virtual {p0}, Lorg/b/a/b/q;->a()Lorg/b/a/f;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/b/a/f;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
