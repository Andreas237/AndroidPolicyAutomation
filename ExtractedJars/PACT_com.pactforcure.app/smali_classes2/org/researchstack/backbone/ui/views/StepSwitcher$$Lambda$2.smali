.class final synthetic Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/views/StepSwitcher;

.field private final arg$2:Landroid/view/View;

.field private final arg$3:Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/views/StepSwitcher;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->arg$2:Landroid/view/View;

    iput-object p3, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->arg$3:Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;

    invoke-direct {v0, p0, p1, p2}, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;-><init>(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/views/StepSwitcher;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->arg$2:Landroid/view/View;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->arg$3:Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;

    invoke-static {v0, v1, v2}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->lambda$null$14(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V

    return-void
.end method
