.class Lorg/junit/runner/b/c$1;
.super Lorg/junit/runner/b/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/runner/b/c;->a(Lorg/junit/runner/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/runner/c;

.field final synthetic b:Lorg/junit/runner/b/c;


# direct methods
.method constructor <init>(Lorg/junit/runner/b/c;Lorg/junit/runner/c;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/runner/b/c$1;->b:Lorg/junit/runner/b/c;

    iput-object p2, p0, Lorg/junit/runner/b/c$1;->a:Lorg/junit/runner/c;

    invoke-direct {p0, p1}, Lorg/junit/runner/b/c$a;-><init>(Lorg/junit/runner/b/c;)V

    return-void
.end method


# virtual methods
.method protected a(Lorg/junit/runner/b/b;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/b/c$1;->a:Lorg/junit/runner/c;

    invoke-virtual {p1, v0}, Lorg/junit/runner/b/b;->c(Lorg/junit/runner/c;)V

    return-void
.end method
