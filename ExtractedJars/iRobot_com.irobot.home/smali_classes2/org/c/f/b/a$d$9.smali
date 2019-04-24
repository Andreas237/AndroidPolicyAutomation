.class final enum Lorg/c/f/b/a$d$9;
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
    .locals 1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d$9;->isPchar(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x2f

    if-eq v0, p1, :cond_1

    const/16 v0, 0x3f

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
