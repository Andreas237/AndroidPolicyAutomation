.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$11;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/PinCodeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$11;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$11;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$11;-><init>(Lorg/researchstack/backbone/ui/PinCodeActivity;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$11;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->lambda$onDataAuth$10(Lorg/researchstack/backbone/ui/PinCodeActivity;)V

    return-void
.end method
