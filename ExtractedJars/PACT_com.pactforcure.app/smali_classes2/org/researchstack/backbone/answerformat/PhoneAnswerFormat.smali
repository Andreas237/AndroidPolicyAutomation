.class public Lorg/researchstack/backbone/answerformat/PhoneAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
.source "PhoneAnswerFormat.java"


# static fields
.field private static final MAX_PHONE_LENGTH:I = 0xf


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    const/16 v0, 0xf

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;-><init>(I)V

    .line 18
    return-void
.end method


# virtual methods
.method public getInputType()I
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x3

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
    .line 23
    .local p2, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    invoke-super {p0, p1, p2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isAnswerValid(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
