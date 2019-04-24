.class Lorg/junit/runner/a/a$1;
.super Lorg/junit/runner/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runner/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/junit/runner/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "all tests"

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public a(Lorg/junit/runner/c;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
