.class final synthetic Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->lambda$initStepLayout$39(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;Ljava/lang/Object;)V

    return-void
.end method
