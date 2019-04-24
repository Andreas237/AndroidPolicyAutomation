.class public abstract Lorg/researchstack/backbone/answerformat/AnswerFormat;
.super Ljava/lang/Object;
.source "AnswerFormat.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;,
        Lorg/researchstack/backbone/answerformat/AnswerFormat$NumberFormattingStyle;,
        Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;,
        Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;,
        Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method


# virtual methods
.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->None:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method
