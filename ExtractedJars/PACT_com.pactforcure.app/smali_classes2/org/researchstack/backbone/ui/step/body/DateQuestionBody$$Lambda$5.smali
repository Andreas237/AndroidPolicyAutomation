.class final synthetic Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

.field private final arg$2:Landroid/support/v7/view/ContextThemeWrapper;

.field private final arg$3:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/support/v7/view/ContextThemeWrapper;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->arg$2:Landroid/support/v7/view/ContextThemeWrapper;

    iput-object p3, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->arg$3:Landroid/widget/TextView;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/support/v7/view/ContextThemeWrapper;Landroid/widget/TextView;)Landroid/app/DatePickerDialog$OnDateSetListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;

    invoke-direct {v0, p0, p1, p2}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;-><init>(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/support/v7/view/ContextThemeWrapper;Landroid/widget/TextView;)V

    return-object v0
.end method


# virtual methods
.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 7

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->arg$1:Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->arg$2:Landroid/support/v7/view/ContextThemeWrapper;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->arg$3:Landroid/widget/TextView;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v0 .. v6}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->lambda$showDialog$23(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/support/v7/view/ContextThemeWrapper;Landroid/widget/TextView;Landroid/widget/DatePicker;III)V

    return-void
.end method
