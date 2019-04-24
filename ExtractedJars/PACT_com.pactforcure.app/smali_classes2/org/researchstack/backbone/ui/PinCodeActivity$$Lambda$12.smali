.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

.field private final arg$2:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;->arg$2:Ljava/lang/String;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/String;)Ljava/util/concurrent/Callable;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;

    invoke-direct {v0, p0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;-><init>(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;->arg$2:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->lambda$null$5(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
