.class final synthetic Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;

.field private final arg$2:Lorg/researchstack/backbone/model/Choice;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;Lorg/researchstack/backbone/model/Choice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;->arg$2:Lorg/researchstack/backbone/model/Choice;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;Lorg/researchstack/backbone/model/Choice;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;

    invoke-direct {v0, p0, p1}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;Lorg/researchstack/backbone/model/Choice;)V

    return-object v0
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;->arg$2:Lorg/researchstack/backbone/model/Choice;

    invoke-static {v0, v1, p1, p2}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->lambda$initViewDefault$25(Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;Lorg/researchstack/backbone/model/Choice;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
