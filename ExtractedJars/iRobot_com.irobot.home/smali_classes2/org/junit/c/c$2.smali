.class Lorg/junit/c/c$2;
.super Lorg/junit/c/a/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/c/c;->c(Lorg/junit/runner/b/c;)Lorg/junit/c/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/runner/b/c;

.field final synthetic b:Lorg/junit/c/c;


# direct methods
.method constructor <init>(Lorg/junit/c/c;Lorg/junit/runner/b/c;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/c/c$2;->b:Lorg/junit/c/c;

    iput-object p2, p0, Lorg/junit/c/c$2;->a:Lorg/junit/runner/b/c;

    invoke-direct {p0}, Lorg/junit/c/a/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lorg/junit/c/c$2;->b:Lorg/junit/c/c;

    iget-object v1, p0, Lorg/junit/c/c$2;->a:Lorg/junit/runner/b/c;

    invoke-static {v0, v1}, Lorg/junit/c/c;->a(Lorg/junit/c/c;Lorg/junit/runner/b/c;)V

    return-void
.end method
