.class public final enum Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;
.super Ljava/lang/Enum;
.source "TextAnswerFormat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Capitalization"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

.field public static final enum Characters:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

.field public static final enum NoCapitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

.field public static final enum Sentences:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

.field public static final enum Words:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    new-instance v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    const-string v1, "NoCapitalization"

    invoke-direct {v0, v1, v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->NoCapitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .line 22
    new-instance v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    const-string v1, "Sentences"

    invoke-direct {v0, v1, v3}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->Sentences:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .line 23
    new-instance v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    const-string v1, "Words"

    invoke-direct {v0, v1, v4}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->Words:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .line 24
    new-instance v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    const-string v1, "Characters"

    invoke-direct {v0, v1, v5}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->Characters:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .line 20
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    sget-object v1, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->NoCapitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    aput-object v1, v0, v2

    sget-object v1, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->Sentences:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    aput-object v1, v0, v3

    sget-object v1, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->Words:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    aput-object v1, v0, v4

    sget-object v1, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->Characters:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    aput-object v1, v0, v5

    sput-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->$VALUES:[Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

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
    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 20
    const-class v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->$VALUES:[Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    return-object v0
.end method
