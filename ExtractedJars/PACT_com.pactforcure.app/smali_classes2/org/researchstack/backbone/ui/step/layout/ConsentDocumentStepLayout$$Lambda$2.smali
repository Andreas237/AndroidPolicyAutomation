.class final synthetic Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$2;-><init>(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->lambda$initializeStep$30(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;Ljava/lang/Object;)V

    return-void
.end method
