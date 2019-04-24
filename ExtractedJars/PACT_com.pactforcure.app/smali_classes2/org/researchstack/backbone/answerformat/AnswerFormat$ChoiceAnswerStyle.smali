.class public final enum Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;
.super Ljava/lang/Enum;
.source "AnswerFormat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/answerformat/AnswerFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ChoiceAnswerStyle"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

.field public static final enum MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

.field public static final enum SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 102
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    const-string v1, "SingleChoice"

    invoke-direct {v0, v1, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    .line 103
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    const-string v1, "MultipleChoice"

    invoke-direct {v0, v1, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    .line 100
    const/4 v0, 0x2

    new-array v0, v0, [Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    aput-object v1, v0, v2

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    aput-object v1, v0, v3

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->$VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 100
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 100
    const-class v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;
    .locals 1

    .prologue
    .line 100
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->$VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    return-object v0
.end method
