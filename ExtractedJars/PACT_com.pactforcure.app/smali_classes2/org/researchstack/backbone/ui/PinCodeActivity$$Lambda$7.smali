.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$7;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Func1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/storage/file/PinCodeConfig;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/storage/file/PinCodeConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$7;->arg$1:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/storage/file/PinCodeConfig;)Lrx/functions/Func1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$7;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$7;-><init>(Lorg/researchstack/backbone/storage/file/PinCodeConfig;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$7;->arg$1:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->lambda$onDataAuth$3(Lorg/researchstack/backbone/storage/file/PinCodeConfig;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
