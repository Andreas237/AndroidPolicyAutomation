.class final synthetic Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/Observable$Transformer;


# static fields
.field private static final instance:Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;

    invoke-direct {v0}, Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;->instance:Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static lambdaFactory$()Lrx/Observable$Transformer;
    .locals 1

    sget-object v0, Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;->instance:Lorg/researchstack/backbone/utils/ObservableUtils$$Lambda$1;

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lrx/Observable;

    invoke-static {p1}, Lorg/researchstack/backbone/utils/ObservableUtils;->lambda$applyDefault$42(Lrx/Observable;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method
