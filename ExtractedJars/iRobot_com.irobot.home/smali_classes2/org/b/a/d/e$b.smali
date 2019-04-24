.class Lorg/b/a/d/e$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/d/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final a:Lorg/b/a/f;

.field final b:Ljava/lang/Integer;

.field final c:[Lorg/b/a/d/e$a;

.field final d:I

.field final synthetic e:Lorg/b/a/d/e;


# direct methods
.method constructor <init>(Lorg/b/a/d/e;)V
    .locals 1

    iput-object p1, p0, Lorg/b/a/d/e$b;->e:Lorg/b/a/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lorg/b/a/d/e;->a(Lorg/b/a/d/e;)Lorg/b/a/f;

    move-result-object v0

    iput-object v0, p0, Lorg/b/a/d/e$b;->a:Lorg/b/a/f;

    invoke-static {p1}, Lorg/b/a/d/e;->b(Lorg/b/a/d/e;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/b/a/d/e$b;->b:Ljava/lang/Integer;

    invoke-static {p1}, Lorg/b/a/d/e;->c(Lorg/b/a/d/e;)[Lorg/b/a/d/e$a;

    move-result-object v0

    iput-object v0, p0, Lorg/b/a/d/e$b;->c:[Lorg/b/a/d/e$a;

    invoke-static {p1}, Lorg/b/a/d/e;->d(Lorg/b/a/d/e;)I

    move-result p1

    iput p1, p0, Lorg/b/a/d/e$b;->d:I

    return-void
.end method


# virtual methods
.method a(Lorg/b/a/d/e;)Z
    .locals 3

    iget-object v0, p0, Lorg/b/a/d/e$b;->e:Lorg/b/a/d/e;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lorg/b/a/d/e$b;->a:Lorg/b/a/f;

    invoke-static {p1, v0}, Lorg/b/a/d/e;->a(Lorg/b/a/d/e;Lorg/b/a/f;)Lorg/b/a/f;

    iget-object v0, p0, Lorg/b/a/d/e$b;->b:Ljava/lang/Integer;

    invoke-static {p1, v0}, Lorg/b/a/d/e;->a(Lorg/b/a/d/e;Ljava/lang/Integer;)Ljava/lang/Integer;

    iget-object v0, p0, Lorg/b/a/d/e$b;->c:[Lorg/b/a/d/e$a;

    invoke-static {p1, v0}, Lorg/b/a/d/e;->a(Lorg/b/a/d/e;[Lorg/b/a/d/e$a;)[Lorg/b/a/d/e$a;

    iget v0, p0, Lorg/b/a/d/e$b;->d:I

    invoke-static {p1}, Lorg/b/a/d/e;->d(Lorg/b/a/d/e;)I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    invoke-static {p1, v2}, Lorg/b/a/d/e;->a(Lorg/b/a/d/e;Z)Z

    :cond_1
    iget v0, p0, Lorg/b/a/d/e$b;->d:I

    invoke-static {p1, v0}, Lorg/b/a/d/e;->a(Lorg/b/a/d/e;I)I

    return v2
.end method
