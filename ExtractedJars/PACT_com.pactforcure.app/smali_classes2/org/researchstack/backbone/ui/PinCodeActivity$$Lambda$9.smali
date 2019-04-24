.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Func1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

.field private final arg$2:Landroid/widget/TextView;

.field private final arg$3:I


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->arg$2:Landroid/widget/TextView;

    iput p3, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->arg$3:I

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;I)Lrx/functions/Func1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;

    invoke-direct {v0, p0, p1, p2}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;-><init>(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;I)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->arg$2:Landroid/widget/TextView;

    iget v2, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->arg$3:I

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->lambda$onDataAuth$8(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;ILjava/lang/String;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method
