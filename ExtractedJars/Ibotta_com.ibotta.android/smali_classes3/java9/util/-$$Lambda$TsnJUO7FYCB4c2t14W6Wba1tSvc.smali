.class public final synthetic Ljava9/util/-$$Lambda$TsnJUO7FYCB4c2t14W6Wba1tSvc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/DoubleConsumer;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/-$$Lambda$TsnJUO7FYCB4c2t14W6Wba1tSvc;->f$0:Ljava9/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 1

    iget-object v0, p0, Ljava9/util/-$$Lambda$TsnJUO7FYCB4c2t14W6Wba1tSvc;->f$0:Ljava9/util/function/Consumer;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleConsumer$-CC;->$default$andThen(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;

    move-result-object p1

    return-object p1
.end method
