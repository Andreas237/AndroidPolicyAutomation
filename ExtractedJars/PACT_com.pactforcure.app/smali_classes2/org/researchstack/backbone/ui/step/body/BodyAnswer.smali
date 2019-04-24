.class public Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
.super Ljava/lang/Object;
.source "BodyAnswer.java"


# static fields
.field public static final INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

.field public static final VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;


# instance fields
.field private isValid:Z

.field private params:[Ljava/lang/String;

.field private reason:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 9
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    const/4 v1, 0x1

    new-array v2, v3, [Ljava/lang/String;

    invoke-direct {v0, v1, v3, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    sput-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 10
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_default:I

    new-array v2, v3, [Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    sput-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    return-void
.end method

.method public varargs constructor <init>(ZI[Ljava/lang/String;)V
    .locals 0
    .param p1, "isValid"    # Z
    .param p2, "reason"    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param
    .param p3, "params"    # [Ljava/lang/String;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-boolean p1, p0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->isValid:Z

    .line 20
    iput p2, p0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->reason:I

    .line 21
    iput-object p3, p0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->params:[Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public getParams()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->params:[Ljava/lang/String;

    return-object v0
.end method

.method public getReason()I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    .prologue
    .line 32
    iget v0, p0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->reason:I

    return v0
.end method

.method public getString(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 42
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->getParams()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    .line 44
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->getReason()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 48
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->getReason()I

    move-result v0

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->getParams()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public isValid()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->isValid:Z

    return v0
.end method
