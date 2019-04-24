.class public Lorg/junit/a/c/c/b;
.super Lorg/junit/c/a/i;


# instance fields
.field private final a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/c/a/i;-><init>()V

    iput-object p1, p0, Lorg/junit/a/c/c/b;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lorg/junit/a/c/c/b;->a:Ljava/lang/Throwable;

    throw v0
.end method
