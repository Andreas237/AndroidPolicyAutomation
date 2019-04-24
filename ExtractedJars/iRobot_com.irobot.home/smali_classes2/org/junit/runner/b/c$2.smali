.class Lorg/junit/runner/b/c$2;
.super Lorg/junit/runner/b/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/runner/b/c;->a(Lorg/junit/runner/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/runner/i;

.field final synthetic b:Lorg/junit/runner/b/c;


# direct methods
.method constructor <init>(Lorg/junit/runner/b/c;Lorg/junit/runner/i;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/runner/b/c$2;->b:Lorg/junit/runner/b/c;

    iput-object p2, p0, Lorg/junit/runner/b/c$2;->a:Lorg/junit/runner/i;

    invoke-direct {p0, p1}, Lorg/junit/runner/b/c$a;-><init>(Lorg/junit/runner/b/c;)V

    return-void
.end method


# virtual methods
.method protected a(Lorg/junit/runner/b/b;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/b/c$2;->a:Lorg/junit/runner/i;

    invoke-virtual {p1, v0}, Lorg/junit/runner/b/b;->a(Lorg/junit/runner/i;)V

    return-void
.end method
