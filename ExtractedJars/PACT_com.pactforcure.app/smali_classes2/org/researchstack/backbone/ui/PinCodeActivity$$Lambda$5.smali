.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Func1;


# static fields
.field private static final instance:Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;

    invoke-direct {v0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;->instance:Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static lambdaFactory$()Lrx/functions/Func1;
    .locals 1

    sget-object v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;->instance:Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
