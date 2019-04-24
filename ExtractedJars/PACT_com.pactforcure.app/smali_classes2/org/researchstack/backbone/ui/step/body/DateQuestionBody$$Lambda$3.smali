.class final synthetic Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

.field private final arg$2:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;->arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;->arg$2:Landroid/widget/TextView;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/app/DatePickerDialog$OnDateSetListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;

    invoke-direct {v0, p0, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;-><init>(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)V

    return-object v0
.end method


# virtual methods
.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 6

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;->arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;->arg$2:Landroid/widget/TextView;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->lambda$showDialog$20(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/widget/DatePicker;III)V

    return-void
.end method
