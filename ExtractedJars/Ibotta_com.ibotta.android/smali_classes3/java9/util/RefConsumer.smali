.class final Ljava9/util/RefConsumer;
.super Ljava/lang/Object;
.source "RefConsumer.java"


# direct methods
.method static toDoubleConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/DoubleConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/function/DoubleConsumer;"
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/-$$Lambda$TsnJUO7FYCB4c2t14W6Wba1tSvc;

    invoke-direct {v0, p0}, Ljava9/util/-$$Lambda$TsnJUO7FYCB4c2t14W6Wba1tSvc;-><init>(Ljava9/util/function/Consumer;)V

    return-object v0
.end method

.method static toIntConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/IntConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava9/util/function/IntConsumer;"
        }
    .end annotation

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/-$$Lambda$mX1BEUMzE9TAxgWT5yJmuLvdJdM;

    invoke-direct {v0, p0}, Ljava9/util/-$$Lambda$mX1BEUMzE9TAxgWT5yJmuLvdJdM;-><init>(Ljava9/util/function/Consumer;)V

    return-object v0
.end method

.method static toLongConsumer(Ljava9/util/function/Consumer;)Ljava9/util/function/LongConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava9/util/function/LongConsumer;"
        }
    .end annotation

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;

    invoke-direct {v0, p0}, Ljava9/util/-$$Lambda$-NOJdSS25trU5yEcjhJp1MDoRuI;-><init>(Ljava9/util/function/Consumer;)V

    return-object v0
.end method
