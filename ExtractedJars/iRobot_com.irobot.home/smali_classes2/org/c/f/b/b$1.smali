.class final Lorg/c/f/b/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/b/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/b/b;
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
.method public a()Lorg/c/f/b/a$c;
    .locals 1

    sget-object v0, Lorg/c/f/b/a;->a:Lorg/c/f/b/a$c;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/c/f/b/b$b;
    .locals 2

    new-instance v0, Lorg/c/f/b/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/c/f/b/b$a;-><init>(Ljava/lang/String;Lorg/c/f/b/b$1;)V

    return-object v0
.end method
