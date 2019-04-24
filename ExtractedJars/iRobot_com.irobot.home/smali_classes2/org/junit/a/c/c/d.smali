.class public Lorg/junit/a/c/c/d;
.super Lorg/junit/c/a/i;


# instance fields
.field private final a:Lorg/junit/c/a/d;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/junit/c/a/d;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/c/a/i;-><init>()V

    iput-object p1, p0, Lorg/junit/a/c/c/d;->a:Lorg/junit/c/a/d;

    iput-object p2, p0, Lorg/junit/a/c/c/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lorg/junit/a/c/c/d;->a:Lorg/junit/c/a/d;

    iget-object v1, p0, Lorg/junit/a/c/c/d;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lorg/junit/c/a/d;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
