.class public final synthetic Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BiFunction;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/BiFunction;

.field private final synthetic f$1:Ljava9/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;->f$0:Ljava9/util/function/BiFunction;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;->f$1:Ljava9/util/function/Function;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/BiFunction<",
            "TT;TU;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiFunction$-CC;->$default$andThen(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;->f$0:Ljava9/util/function/BiFunction;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$BiFunction$zH81Qn4HwVKXA2UvaFVA8KSDJKA;->f$1:Ljava9/util/function/Function;

    invoke-static {v0, v1, p1, p2}, Ljava9/util/function/BiFunction$-CC;->lambda$andThen$19(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
