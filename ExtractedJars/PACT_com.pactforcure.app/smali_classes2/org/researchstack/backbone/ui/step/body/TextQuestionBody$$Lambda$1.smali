.class final synthetic Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Lrx/functions/Action1;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)Lrx/functions/Action1;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->lambda$getBodyView$27(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;Ljava/lang/CharSequence;)V

    return-void
.end method
