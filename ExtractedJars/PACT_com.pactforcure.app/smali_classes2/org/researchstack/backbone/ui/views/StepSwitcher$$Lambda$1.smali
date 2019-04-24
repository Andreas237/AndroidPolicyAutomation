.class final synthetic Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/views/StepSwitcher;

.field private final arg$2:Landroid/view/View;

.field private final arg$3:Lorg/researchstack/backbone/ui/step/layout/StepLayout;

.field private final arg$4:I

.field private final arg$5:Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/views/StepSwitcher;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$2:Landroid/view/View;

    iput-object p3, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$3:Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    iput p4, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$4:I

    iput-object p5, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$5:Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)Ljava/lang/Runnable;
    .locals 6

    new-instance v0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/views/StepSwitcher;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$2:Landroid/view/View;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$3:Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    iget v3, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$4:I

    iget-object v4, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->arg$5:Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;

    invoke-static {v0, v1, v2, v3, v4}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->lambda$show$15(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V

    return-void
.end method
