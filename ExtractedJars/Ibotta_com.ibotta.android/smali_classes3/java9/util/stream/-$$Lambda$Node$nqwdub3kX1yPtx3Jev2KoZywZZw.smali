.class public final synthetic Ljava9/util/stream/-$$Lambda$Node$nqwdub3kX1yPtx3Jev2KoZywZZw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$Node$nqwdub3kX1yPtx3Jev2KoZywZZw;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$Node$nqwdub3kX1yPtx3Jev2KoZywZZw;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$Node$nqwdub3kX1yPtx3Jev2KoZywZZw;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$Node$nqwdub3kX1yPtx3Jev2KoZywZZw;->INSTANCE:Ljava9/util/stream/-$$Lambda$Node$nqwdub3kX1yPtx3Jev2KoZywZZw;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Ljava9/util/stream/Node$-CC;->lambda$truncate$57(Ljava/lang/Object;)V

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
