.class final enum Lorg/c/f/b/a$d$10;
.super Lorg/c/f/b/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/b/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/c/f/b/a$d;-><init>(Ljava/lang/String;ILorg/c/f/b/a$1;)V

    return-void
.end method


# virtual methods
.method public isAllowed(I)Z
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x3d

    if-eq v1, p1, :cond_2

    const/16 v1, 0x2b

    if-eq v1, p1, :cond_2

    const/16 v1, 0x26

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d$10;->isPchar(I)Z

    move-result v1

    if-nez v1, :cond_1

    const/16 v1, 0x2f

    if-eq v1, p1, :cond_1

    const/16 v1, 0x3f

    if-ne v1, p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method
