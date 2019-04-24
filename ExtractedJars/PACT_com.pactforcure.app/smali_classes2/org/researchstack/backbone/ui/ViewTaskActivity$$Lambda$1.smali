.class final synthetic Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/ViewTaskActivity;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/ViewTaskActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/ViewTaskActivity;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/ViewTaskActivity;)Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/ViewTaskActivity;)V

    return-object v0
.end method


# virtual methods
.method public onTransitionEnded()V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/ViewTaskActivity;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->lambda$showStep$11(Lorg/researchstack/backbone/ui/ViewTaskActivity;)V

    return-void
.end method
