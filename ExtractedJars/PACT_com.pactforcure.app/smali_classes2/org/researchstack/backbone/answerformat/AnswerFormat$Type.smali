.class public final enum Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;
.super Ljava/lang/Enum;
.source "AnswerFormat.java"

# interfaces
.implements Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/answerformat/AnswerFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;",
        ">;",
        "Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Boolean:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Decimal:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Duration:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Eligibility:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Form:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Integer:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Location:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum None:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Scale:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum Text:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum TimeInterval:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

.field public static final enum TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;


# instance fields
.field private stepBodyClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 65
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "None"

    const-class v2, Lorg/researchstack/backbone/ui/step/body/NotImplementedStepBody;

    invoke-direct {v0, v1, v4, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->None:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 66
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Scale"

    const-class v2, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;

    invoke-direct {v0, v1, v5, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Scale:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 67
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "SingleChoice"

    const-class v2, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;

    invoke-direct {v0, v1, v6, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 68
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "MultipleChoice"

    const-class v2, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;

    invoke-direct {v0, v1, v7, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 69
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Decimal"

    const-class v2, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;

    invoke-direct {v0, v1, v8, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Decimal:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 70
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Integer"

    const/4 v2, 0x5

    const-class v3, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Integer:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 71
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Boolean"

    const/4 v2, 0x6

    const-class v3, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Boolean:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 72
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Eligibility"

    const/4 v2, 0x7

    const-class v3, Lorg/researchstack/backbone/ui/step/body/NotImplementedStepBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Eligibility:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 73
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Text"

    const/16 v2, 0x8

    const-class v3, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Text:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 74
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "TimeOfDay"

    const/16 v2, 0x9

    const-class v3, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 75
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "DateAndTime"

    const/16 v2, 0xa

    const-class v3, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 76
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Date"

    const/16 v2, 0xb

    const-class v3, Lorg/researchstack/backbone/ui/step/body/DateQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 77
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "TimeInterval"

    const/16 v2, 0xc

    const-class v3, Lorg/researchstack/backbone/ui/step/body/NotImplementedStepBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->TimeInterval:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 78
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Duration"

    const/16 v2, 0xd

    const-class v3, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Duration:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 79
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Location"

    const/16 v2, 0xe

    const-class v3, Lorg/researchstack/backbone/ui/step/body/NotImplementedStepBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Location:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 80
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    const-string v1, "Form"

    const/16 v2, 0xf

    const-class v3, Lorg/researchstack/backbone/ui/step/body/FormBody;

    invoke-direct {v0, v1, v2, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Form:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 63
    const/16 v0, 0x10

    new-array v0, v0, [Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->None:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v1, v0, v4

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Scale:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v1, v0, v5

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v1, v0, v6

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v1, v0, v7

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Decimal:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Integer:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Boolean:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Eligibility:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Text:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->TimeInterval:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Duration:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Location:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Form:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    aput-object v2, v0, v1

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->$VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 85
    .local p3, "stepBodyClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 86
    iput-object p3, p0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->stepBodyClass:Ljava/lang/Class;

    .line 87
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 63
    const-class v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->$VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method


# virtual methods
.method public getStepBodyClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 92
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->stepBodyClass:Ljava/lang/Class;

    return-object v0
.end method
