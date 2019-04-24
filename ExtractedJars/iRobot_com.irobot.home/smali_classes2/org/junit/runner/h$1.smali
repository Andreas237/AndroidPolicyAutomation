.class Lorg/junit/runner/h$1;
.super Lorg/junit/runner/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/runner/h;->a(Lorg/junit/runner/k;)Lorg/junit/runner/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/runner/k;


# direct methods
.method constructor <init>(Lorg/junit/runner/k;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/runner/h$1;->a:Lorg/junit/runner/k;

    invoke-direct {p0}, Lorg/junit/runner/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/junit/runner/k;
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/h$1;->a:Lorg/junit/runner/k;

    return-object v0
.end method
