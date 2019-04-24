.class final synthetic Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

.field private final arg$2:Landroid/widget/EditText;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;->arg$2:Landroid/widget/EditText;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;

    invoke-direct {v0, p0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;-><init>(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;->arg$1:Lorg/researchstack/backbone/ui/PinCodeActivity;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;->arg$2:Landroid/widget/EditText;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->lambda$onDataAuth$4(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;Ljava/lang/String;)V

    return-void
.end method
