.class final Lorg/c/f/b/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/b/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/c/f/b/a$c;
    .locals 0

    return-object p0
.end method

.method public a(Lorg/c/f/b/a$e;)Lorg/c/f/b/a$c;
    .locals 0

    return-object p0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/16 v0, 0x2a

    return v0
.end method
