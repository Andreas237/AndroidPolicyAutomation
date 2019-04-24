.class public Lorg/c/c/k;
.super Lorg/c/c/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/c/c/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final b:Lorg/c/c/i;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lorg/c/e/g;Lorg/c/c/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lorg/c/c/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lorg/c/c/b;-><init>(Ljava/lang/Object;Lorg/c/e/g;)V

    iput-object p3, p0, Lorg/c/c/k;->b:Lorg/c/c/i;

    return-void
.end method

.method public constructor <init>(Lorg/c/e/g;Lorg/c/c/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lorg/c/c/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/c/c/b;-><init>(Lorg/c/e/g;)V

    iput-object p2, p0, Lorg/c/c/k;->b:Lorg/c/c/i;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/c/c/k;->b:Lorg/c/c/i;

    invoke-virtual {v1}, Lorg/c/c/i;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/c/c/k;->b:Lorg/c/c/i;

    invoke-virtual {v1}, Lorg/c/c/i;->getReasonPhrase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/c/c/k;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, Lorg/c/c/k;->a()Lorg/c/c/c;

    move-result-object v3

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
