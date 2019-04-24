.class Lorg/junit/c/a$1;
.super Lorg/junit/a/c/a/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/c/a;->d(Lorg/junit/c/a/d;)Lorg/junit/c/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/c/a;


# direct methods
.method constructor <init>(Lorg/junit/c/a;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/c/a$1;->a:Lorg/junit/c/a;

    invoke-direct {p0}, Lorg/junit/a/c/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/junit/c/a$1;->a:Lorg/junit/c/a;

    invoke-virtual {v0}, Lorg/junit/c/a;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
