.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$10;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/PinCodeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$10;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$10;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$10;-><init>(Lorg/researchstack/backbone/ui/PinCodeActivity;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$10;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->lambda$onDataAuth$9(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/Boolean;)V

    return-void
.end method
