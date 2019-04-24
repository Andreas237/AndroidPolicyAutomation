.class Lorg/junit/runner/a$1;
.super Lorg/junit/c/a/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/runner/a;->a(Lorg/junit/c/a/g;[Ljava/lang/Class;)Lorg/junit/runner/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/c/a/g;

.field final synthetic b:Lorg/junit/runner/a;


# direct methods
.method constructor <init>(Lorg/junit/runner/a;Lorg/junit/c/a/g;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/runner/a$1;->b:Lorg/junit/runner/a;

    iput-object p2, p0, Lorg/junit/runner/a$1;->a:Lorg/junit/c/a/g;

    invoke-direct {p0}, Lorg/junit/c/a/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    iget-object v0, p0, Lorg/junit/runner/a$1;->b:Lorg/junit/runner/a;

    iget-object v1, p0, Lorg/junit/runner/a$1;->a:Lorg/junit/c/a/g;

    invoke-virtual {v0, v1, p1}, Lorg/junit/runner/a;->a(Lorg/junit/c/a/g;Ljava/lang/Class;)Lorg/junit/runner/k;

    move-result-object p1

    return-object p1
.end method
