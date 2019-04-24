.class Lorg/c/f/a/k$c;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/a/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/c/f/a/i<",
        "Lorg/c/c/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/c/f/a/k$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/c/f/a/k$c;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lorg/c/c/a/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lorg/c/f/a/k$c;->b(Lorg/c/c/a/i;)Lorg/c/c/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/c/c/a/i;)Lorg/c/c/c;
    .locals 0

    invoke-interface {p1}, Lorg/c/c/a/i;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    return-object p1
.end method
