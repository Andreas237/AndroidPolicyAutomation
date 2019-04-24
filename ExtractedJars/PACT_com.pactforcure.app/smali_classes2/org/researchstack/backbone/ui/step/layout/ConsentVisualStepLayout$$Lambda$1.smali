.class final synthetic Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;

.field private final arg$2:Ljava/lang/String;

.field private final arg$3:Lorg/researchstack/backbone/model/ConsentSection;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/String;Lorg/researchstack/backbone/model/ConsentSection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->arg$2:Ljava/lang/String;

    iput-object p3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->arg$3:Lorg/researchstack/backbone/model/ConsentSection;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/String;Lorg/researchstack/backbone/model/ConsentSection;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;

    invoke-direct {v0, p0, p1, p2}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/String;Lorg/researchstack/backbone/model/ConsentSection;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->arg$2:Ljava/lang/String;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->arg$3:Lorg/researchstack/backbone/model/ConsentSection;

    invoke-static {v0, v1, v2, p1}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->lambda$initializeStep$35(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/String;Lorg/researchstack/backbone/model/ConsentSection;Ljava/lang/Object;)V

    return-void
.end method
