.class public final synthetic Ljava9/util/function/-$$Lambda$IntPredicate$wNUlnsGpxEN68m277fc2V-0UWPA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntPredicate;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/IntPredicate;

.field private final synthetic f$1:Ljava9/util/function/IntPredicate;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/IntPredicate;Ljava9/util/function/IntPredicate;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$IntPredicate$wNUlnsGpxEN68m277fc2V-0UWPA;->f$0:Ljava9/util/function/IntPredicate;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$IntPredicate$wNUlnsGpxEN68m277fc2V-0UWPA;->f$1:Ljava9/util/function/IntPredicate;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava9/util/function/IntPredicate;)Ljava9/util/function/IntPredicate;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/IntPredicate$-CC;->$default$and(Ljava9/util/function/IntPredicate;Ljava9/util/function/IntPredicate;)Ljava9/util/function/IntPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava9/util/function/IntPredicate;
    .locals 1

    invoke-static {p0}, Ljava9/util/function/IntPredicate$-CC;->$default$negate(Ljava9/util/function/IntPredicate;)Ljava9/util/function/IntPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava9/util/function/IntPredicate;)Ljava9/util/function/IntPredicate;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/IntPredicate$-CC;->$default$or(Ljava9/util/function/IntPredicate;Ljava9/util/function/IntPredicate;)Ljava9/util/function/IntPredicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(I)Z
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$IntPredicate$wNUlnsGpxEN68m277fc2V-0UWPA;->f$0:Ljava9/util/function/IntPredicate;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$IntPredicate$wNUlnsGpxEN68m277fc2V-0UWPA;->f$1:Ljava9/util/function/IntPredicate;

    invoke-static {v0, v1, p1}, Ljava9/util/function/IntPredicate$-CC;->lambda$and$6(Ljava9/util/function/IntPredicate;Ljava9/util/function/IntPredicate;I)Z

    move-result p1

    return p1
.end method
