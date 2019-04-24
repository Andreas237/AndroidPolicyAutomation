.class public final Lorg/junit/runner/f;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lorg/junit/runner/c;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/junit/runner/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lorg/junit/runner/f;->a:Lorg/junit/runner/c;

    iput-object p2, p0, Lorg/junit/runner/f;->b:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1
.end method
