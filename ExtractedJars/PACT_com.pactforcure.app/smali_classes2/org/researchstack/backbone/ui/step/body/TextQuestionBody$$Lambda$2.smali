.class final synthetic Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)Landroid/widget/TextView$OnEditorActionListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$2;-><init>(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)V

    return-object v0
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;

    invoke-static {v0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->lambda$getBodyView$28(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
