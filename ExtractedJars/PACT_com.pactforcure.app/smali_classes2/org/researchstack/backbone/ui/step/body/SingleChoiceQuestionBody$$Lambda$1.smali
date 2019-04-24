.class final synthetic Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;)Landroid/widget/RadioGroup$OnCheckedChangeListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;)V

    return-object v0
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;

    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->lambda$initViewDefault$26(Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;Landroid/widget/RadioGroup;I)V

    return-void
.end method
