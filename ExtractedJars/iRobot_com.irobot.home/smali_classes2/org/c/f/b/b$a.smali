.class Lorg/c/f/b/b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/b/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/StringBuilder;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/c/f/b/b$a;->a:Ljava/lang/StringBuilder;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lorg/c/f/b/b$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/c/f/b/b$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/c/f/b/a$c;
    .locals 2

    new-instance v0, Lorg/c/f/b/a$a;

    iget-object v1, p0, Lorg/c/f/b/b$a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/c/f/b/a$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/c/f/b/b$b;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/b$a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method
