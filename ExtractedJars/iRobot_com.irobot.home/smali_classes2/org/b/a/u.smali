.class final Lorg/b/a/u;
.super Lorg/b/a/f;


# static fields
.field static final b:Lorg/b/a/f;

.field private static final serialVersionUID:J = -0x30c0b99837523604L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/b/a/u;

    invoke-direct {v0}, Lorg/b/a/u;-><init>()V

    sput-object v0, Lorg/b/a/u;->b:Lorg/b/a/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "UTC"

    invoke-direct {p0, v0}, Lorg/b/a/f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 0

    const-string p1, "UTC"

    return-object p1
.end method

.method public b(J)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public c(J)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public e(J)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lorg/b/a/u;

    return p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)J
    .locals 0

    return-wide p1
.end method

.method public h(J)J
    .locals 0

    return-wide p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/u;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
