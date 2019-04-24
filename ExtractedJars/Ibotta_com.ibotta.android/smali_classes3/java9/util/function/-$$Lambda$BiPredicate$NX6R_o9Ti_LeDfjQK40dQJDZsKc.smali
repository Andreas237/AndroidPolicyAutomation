.class public final synthetic Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BiPredicate;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/BiPredicate;

.field private final synthetic f$1:Ljava9/util/function/BiPredicate;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;->f$0:Ljava9/util/function/BiPredicate;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;->f$1:Ljava9/util/function/BiPredicate;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiPredicate<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiPredicate<",
            "TT;TU;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiPredicate$-CC;->$default$and(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava9/util/function/BiPredicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/BiPredicate<",
            "TT;TU;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/function/BiPredicate$-CC;->$default$negate(Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiPredicate<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiPredicate<",
            "TT;TU;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiPredicate$-CC;->$default$or(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;)Ljava9/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;->f$0:Ljava9/util/function/BiPredicate;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$BiPredicate$NX6R_o9Ti_LeDfjQK40dQJDZsKc;->f$1:Ljava9/util/function/BiPredicate;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/function/BiPredicate$-CC;->lambda$and$72(Ljava9/util/function/BiPredicate;Ljava9/util/function/BiPredicate;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
