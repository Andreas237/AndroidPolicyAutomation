.class public final enum Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;
.super Ljava/lang/Enum;
.source "AnswerFormat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/answerformat/AnswerFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DateAnswerStyle"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

.field public static final enum Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

.field public static final enum DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

.field public static final enum TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 120
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    const-string v1, "DateAndTime"

    invoke-direct {v0, v1, v2}, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    .line 121
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    const-string v1, "Date"

    invoke-direct {v0, v1, v3}, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    .line 122
    new-instance v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    const-string v1, "TimeOfDay"

    invoke-direct {v0, v1, v4}, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    .line 118
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    aput-object v1, v0, v2

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    aput-object v1, v0, v3

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    aput-object v1, v0, v4

    sput-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->$VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

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
    .line 118
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 118
    const-class v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;
    .locals 1

    .prologue
    .line 118
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->$VALUES:[Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    return-object v0
.end method
