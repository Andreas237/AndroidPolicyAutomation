.class public Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
.super Ljava/lang/Object;
.source "DateQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private calendar:Ljava/util/Calendar;

.field private dateformatter:Ljava/text/DateFormat;

.field private format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

.field private hasChosenDate:Z

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private step:Lorg/researchstack/backbone/step/QuestionStep;


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 6
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    const/4 v5, 0x1

    const/4 v4, -0x1

    const/4 v3, 0x2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 46
    check-cast v1, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 47
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 48
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v1}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    .line 49
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 51
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v1}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v1, v2, :cond_2

    .line 52
    invoke-static {v3, v3}, Lorg/researchstack/backbone/utils/FormatHelper;->getFormat(II)Ljava/text/DateFormat;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->dateformatter:Ljava/text/DateFormat;

    .line 60
    :cond_1
    :goto_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v1}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 61
    .local v0, "savedTimeInMillis":Ljava/lang/Long;
    if-eqz v0, :cond_4

    .line 63
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 64
    iput-boolean v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    .line 79
    :goto_1
    return-void

    .line 53
    .end local v0    # "savedTimeInMillis":Ljava/lang/Long;
    :cond_2
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v1}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v1, v2, :cond_3

    .line 54
    invoke-static {v3, v4}, Lorg/researchstack/backbone/utils/FormatHelper;->getFormat(II)Ljava/text/DateFormat;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->dateformatter:Ljava/text/DateFormat;

    goto :goto_0

    .line 55
    :cond_3
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v1}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v1, v2, :cond_1

    .line 56
    invoke-static {v4, v3}, Lorg/researchstack/backbone/utils/FormatHelper;->getFormat(II)Ljava/text/DateFormat;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->dateformatter:Ljava/text/DateFormat;

    goto :goto_0

    .line 68
    .restart local v0    # "savedTimeInMillis":Ljava/lang/Long;
    :cond_4
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v1}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getDefaultDate()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 70
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getDefaultDate()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 71
    iput-boolean v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    goto :goto_1

    .line 77
    :cond_5
    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    goto :goto_1
.end method

.method private createFormattedResult()Ljava/lang/String;
    .locals 2

    .prologue
    .line 247
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->dateformatter:Ljava/text/DateFormat;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$getBodyView$18(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/view/View;Z)V
    .locals 0
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "hasFocus"    # Z

    .prologue
    .line 119
    if-eqz p3, :cond_0

    .line 121
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->showDialog(Landroid/widget/TextView;)V

    .line 123
    :cond_0
    return-void
.end method

.method static synthetic lambda$getBodyView$19(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
    .param p2, "v"    # Landroid/view/View;

    .prologue
    .line 126
    invoke-virtual {p2}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->showDialog(Landroid/widget/TextView;)V

    .line 130
    :cond_0
    return-void
.end method

.method static synthetic lambda$null$22(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/widget/TimePicker;II)V
    .locals 3
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
    .param p2, "tview"    # Landroid/widget/TimePicker;
    .param p3, "hourOfDay"    # I
    .param p4, "minute"    # I

    .prologue
    .line 226
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xb

    invoke-virtual {v1, v2, p3}, Ljava/util/Calendar;->set(II)V

    .line 227
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xc

    invoke-virtual {v1, v2, p4}, Ljava/util/Calendar;->set(II)V

    .line 228
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    .line 230
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->createFormattedResult()Ljava/lang/String;

    move-result-object v0

    .line 231
    .local v0, "formattedResult":Ljava/lang/String;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    return-void
.end method

.method static synthetic lambda$showDialog$20(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/widget/DatePicker;III)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
    .param p2, "view"    # Landroid/widget/DatePicker;
    .param p3, "year"    # I
    .param p4, "monthOfYear"    # I
    .param p5, "dayOfMonth"    # I

    .prologue
    .line 195
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1, p3, p4, p5}, Ljava/util/Calendar;->set(III)V

    .line 196
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    .line 199
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->createFormattedResult()Ljava/lang/String;

    move-result-object v0

    .line 200
    .local v0, "formattedResult":Ljava/lang/String;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    return-void
.end method

.method static synthetic lambda$showDialog$21(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;Landroid/widget/TimePicker;II)V
    .locals 3
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
    .param p2, "view"    # Landroid/widget/TimePicker;
    .param p3, "hourOfDay"    # I
    .param p4, "minute"    # I

    .prologue
    .line 208
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xb

    invoke-virtual {v1, v2, p3}, Ljava/util/Calendar;->set(II)V

    .line 209
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v2, 0xc

    invoke-virtual {v1, v2, p4}, Ljava/util/Calendar;->set(II)V

    .line 210
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    .line 213
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->createFormattedResult()Ljava/lang/String;

    move-result-object v0

    .line 214
    .local v0, "formattedResult":Ljava/lang/String;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    return-void
.end method

.method static synthetic lambda$showDialog$23(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/support/v7/view/ContextThemeWrapper;Landroid/widget/TextView;Landroid/widget/DatePicker;III)V
    .locals 6
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;
    .param p3, "dview"    # Landroid/widget/DatePicker;
    .param p4, "year"    # I
    .param p5, "monthOfYear"    # I
    .param p6, "dayOfMonth"    # I

    .prologue
    .line 223
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    invoke-virtual {v0, p4, p5, p6}, Ljava/util/Calendar;->set(III)V

    .line 224
    new-instance v0, Landroid/app/TimePickerDialog;

    invoke-static {p0, p2}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$6;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/app/TimePickerDialog$OnTimeSetListener;

    move-result-object v2

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v3, 0xb

    .line 233
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v4, 0xc

    .line 234
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x1

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 235
    invoke-virtual {v0}, Landroid/app/TimePickerDialog;->show()V

    .line 236
    return-void
.end method

.method private showDialog(Landroid/widget/TextView;)V
    .locals 8
    .param p1, "tv"    # Landroid/widget/TextView;

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x2

    const/4 v5, 0x1

    .line 190
    new-instance v1, Landroid/support/v7/view/ContextThemeWrapper;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lorg/researchstack/backbone/R$style;->Theme_Backbone:I

    invoke-direct {v1, v0, v2}, Landroid/support/v7/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 192
    .local v1, "contextWrapper":Landroid/support/v7/view/ContextThemeWrapper;
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v0}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v0

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v0, v2, :cond_0

    .line 193
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-static {p0, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$3;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/app/DatePickerDialog$OnDateSetListener;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 202
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 203
    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    move-result v4

    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 204
    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    .line 243
    :goto_0
    return-void

    .line 205
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v0}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v0

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v0, v2, :cond_1

    .line 206
    new-instance v0, Landroid/app/TimePickerDialog;

    invoke-static {p0, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$4;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/app/TimePickerDialog$OnTimeSetListener;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v4, 0xb

    .line 216
    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    const/16 v6, 0xc

    .line 217
    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 218
    invoke-virtual {v0}, Landroid/app/TimePickerDialog;->show()V

    goto :goto_0

    .line 220
    :cond_1
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v0}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v0

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v0, v2, :cond_2

    .line 221
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-static {p0, v1, p1}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$5;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/support/v7/view/ContextThemeWrapper;Landroid/widget/TextView;)Landroid/app/DatePickerDialog$OnDateSetListener;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 237
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 238
    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    move-result v4

    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    .line 239
    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    goto :goto_0

    .line 241
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DateAnswerStyle "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v3}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not recognised"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 180
    return-void
.end method

.method public getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/step/body/StepBody;",
            ">;)",
            "Lorg/researchstack/backbone/ui/step/body/BodyAnswer;"
        }
    .end annotation

    .prologue
    .local p1, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    const/4 v3, 0x0

    .line 164
    iget-boolean v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->hasChosenDate:Z

    if-nez v0, :cond_0

    .line 166
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_date_none:I

    new-array v2, v3, [Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    .line 169
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->validateAnswer(Ljava/util/Date;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    move-result-object v0

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v7, 0x1

    .line 84
    sget v5, Lorg/researchstack/backbone/R$layout;->rsb_item_date_view:I

    const/4 v6, 0x0

    invoke-virtual {p2, v5, p3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 86
    .local v4, "view":Landroid/view/View;
    sget v5, Lorg/researchstack/backbone/R$id;->label:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 87
    .local v3, "title":Landroid/widget/TextView;
    if-ne p1, v7, :cond_2

    .line 89
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v5}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    :goto_0
    sget v5, Lorg/researchstack/backbone/R$id;->value:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 97
    .local v2, "textView":Landroid/widget/TextView;
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 98
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v5}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 100
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v5}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 113
    :cond_0
    :goto_1
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v5}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 115
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->createFormattedResult()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    :cond_1
    invoke-static {p0, v2}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/view/View$OnFocusChangeListener;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 125
    invoke-static {p0, v2}, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;Landroid/widget/TextView;)Landroid/view/View$OnClickListener;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 133
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v0, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 135
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v5, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    iput v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 136
    sget v5, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    iput v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 137
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    return-object v4

    .line 93
    .end local v0    # "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    .end local v1    # "res":Landroid/content/res/Resources;
    .end local v2    # "textView":Landroid/widget/TextView;
    :cond_2
    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 104
    .restart local v2    # "textView":Landroid/widget/TextView;
    :cond_3
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v5

    sget-object v6, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v5, v6, :cond_4

    .line 105
    sget v5, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_date:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setHint(I)V

    goto :goto_1

    .line 106
    :cond_4
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v5

    sget-object v6, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v5, v6, :cond_5

    .line 107
    sget v5, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_time:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setHint(I)V

    goto :goto_1

    .line 108
    :cond_5
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DateAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    move-result-object v5

    sget-object v6, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v5, v6, :cond_0

    .line 109
    sget v5, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_datetime:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setHint(I)V

    goto :goto_1
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 4
    .param p1, "skipped"    # Z

    .prologue
    .line 145
    if-eqz p1, :cond_0

    .line 147
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 154
    :goto_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v0

    .line 151
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;->calendar:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 175
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 185
    return-void
.end method
