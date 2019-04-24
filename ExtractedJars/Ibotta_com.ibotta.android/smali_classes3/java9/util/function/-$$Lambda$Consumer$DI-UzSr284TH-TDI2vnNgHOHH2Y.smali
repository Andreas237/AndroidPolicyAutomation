.class public final synthetic Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/Consumer;

.field private final synthetic f$1:Ljava9/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;->f$0:Ljava9/util/function/Consumer;

    iput-object p2, p0, Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;->f$1:Ljava9/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;->f$0:Ljava9/util/function/Consumer;

    iget-object v1, p0, Ljava9/util/function/-$$Lambda$Consumer$DI-UzSr284TH-TDI2vnNgHOHH2Y;->f$1:Ljava9/util/function/Consumer;

    invoke-static {v0, v1, p1}, Ljava9/util/function/Consumer$-CC;->lambda$andThen$4(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
