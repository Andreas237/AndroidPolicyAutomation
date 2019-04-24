.class public Lorg/researchstack/backbone/answerformat/EmailAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
.source "EmailAnswerFormat.java"


# static fields
.field private static final MAX_EMAIL_LENGTH:I = 0xff


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    const/16 v0, 0xff

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;-><init>(I)V

    .line 19
    return-void
.end method


# virtual methods
.method public getInputType()I
    .locals 1

    .prologue
    .line 29
    const/16 v0, 0x21

    return v0
.end method

.method public isAnswerValid(Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/step/body/StepBody;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 24
    .local p2, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    invoke-super {p0, p1, p2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isAnswerValid(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/researchstack/backbone/utils/TextUtils;->isValidEmail(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
