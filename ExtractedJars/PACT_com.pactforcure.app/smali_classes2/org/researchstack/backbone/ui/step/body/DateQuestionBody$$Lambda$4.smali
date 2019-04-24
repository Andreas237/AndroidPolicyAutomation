.class final synthetic Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

.field private final arg$2:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;->arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;->arg$2:Landroid/widget/TextView;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/app/TimePickerDialog$OnTimeSetListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;

    invoke-direct {v0, p0, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;-><init>(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)V

    return-object v0
.end method


# virtual methods
.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 2

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;->arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;->arg$2:Landroid/widget/TextView;

    invoke-static {v0, v1, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->lambda$showDialog$21(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/widget/TimePicker;II)V

    return-void
.end method
