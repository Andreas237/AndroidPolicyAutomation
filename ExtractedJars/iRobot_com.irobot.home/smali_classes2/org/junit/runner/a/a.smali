.class public abstract Lorg/junit/runner/a/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lorg/junit/runner/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/junit/runner/a/a$1;

    invoke-direct {v0}, Lorg/junit/runner/a/a$1;-><init>()V

    sput-object v0, Lorg/junit/runner/a/a;->a:Lorg/junit/runner/a/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lorg/junit/runner/a/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p1, Lorg/junit/runner/a/b;

    invoke-interface {p1, p0}, Lorg/junit/runner/a/b;->a(Lorg/junit/runner/a/a;)V

    return-void
.end method

.method public abstract a(Lorg/junit/runner/c;)Z
.end method
