.class final synthetic Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$2;-><init>(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->lambda$initializeStep$36(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/Object;)V

    return-void
.end method
