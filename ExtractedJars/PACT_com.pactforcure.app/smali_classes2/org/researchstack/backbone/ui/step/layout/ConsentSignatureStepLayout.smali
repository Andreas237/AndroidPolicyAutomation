.class public Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;
.super Landroid/widget/RelativeLayout;
.source "ConsentSignatureStepLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/layout/StepLayout;


# static fields
.field public static final KEY_SIGNATURE:Ljava/lang/String; = "ConsentSignatureStep.Signature"

.field public static final KEY_SIGNATURE_DATE:Ljava/lang/String; = "ConsentSignatureStep.Signature.Date"


# instance fields
.field private callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

.field private step:Lorg/researchstack/backbone/step/Step;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 46
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    return-void
.end method

.method private getBase64EncodedImage()Ljava/lang/String;
    .locals 5

    .prologue
    .line 170
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    invoke-virtual {v3}, Lorg/researchstack/backbone/ui/views/SignatureView;->createSignatureBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 172
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    .line 174
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 175
    .local v2, "stream":Ljava/io/ByteArrayOutputStream;
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {v0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 176
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 177
    .local v1, "byteArray":[B
    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 181
    .end local v1    # "byteArray":[B
    .end local v2    # "stream":Ljava/io/ByteArrayOutputStream;
    :goto_0
    return-object v3

    :cond_0
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private initializeStep()V
    .locals 9

    .prologue
    .line 98
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    sget v7, Lorg/researchstack/backbone/R$layout;->rsb_step_layout_consent_signature:I

    const/4 v8, 0x1

    .line 99
    invoke-virtual {v6, v7, p0, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 102
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/support/v7/app/AppCompatActivity;

    .line 103
    .local v1, "activity":Landroid/support/v7/app/AppCompatActivity;
    invoke-virtual {v1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 104
    .local v0, "actionBar":Landroid/support/v7/app/ActionBar;
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v6

    invoke-static {v0, v6}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->toggleBackNavigation(Landroid/support/v7/app/ActionBar;Z)V

    .line 106
    sget v6, Lorg/researchstack/backbone/R$id;->title:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 107
    .local v5, "title":Landroid/widget/TextView;
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    sget v6, Lorg/researchstack/backbone/R$id;->summary:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 110
    .local v4, "text":Landroid/widget/TextView;
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    sget v6, Lorg/researchstack/backbone/R$id;->layout_consent_review_signature_clear:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 114
    .local v2, "clear":Landroid/view/View;
    sget v6, Lorg/researchstack/backbone/R$id;->layout_consent_review_signature:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lorg/researchstack/backbone/ui/views/SignatureView;

    iput-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    .line 115
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    new-instance v7, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;

    invoke-direct {v7, p0, v2}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$1;-><init>(Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;Landroid/view/View;)V

    invoke-virtual {v6, v7}, Lorg/researchstack/backbone/ui/views/SignatureView;->setCallbacks(Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;)V

    .line 132
    invoke-static {v2}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v6

    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;)Lrx/functions/Action1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    .line 136
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    invoke-virtual {v6}, Lorg/researchstack/backbone/ui/views/SignatureView;->isSignatureDrawn()Z

    move-result v6

    invoke-virtual {v2, v6}, Landroid/view/View;->setClickable(Z)V

    .line 139
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    invoke-virtual {v6}, Lorg/researchstack/backbone/ui/views/SignatureView;->isSignatureDrawn()Z

    move-result v6

    if-eqz v6, :cond_0

    const/high16 v6, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {v7, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 141
    sget v6, Lorg/researchstack/backbone/R$id;->submit_bar:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/ui/views/SubmitBar;

    .line 142
    .local v3, "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    invoke-virtual {v3}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getNegativeActionView()Landroid/view/View;

    move-result-object v6

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 143
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;)Lrx/functions/Action1;

    move-result-object v6

    invoke-virtual {v3, v6}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveAction(Lrx/functions/Action1;)V

    .line 154
    return-void

    .line 139
    .end local v3    # "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    :cond_0
    const/4 v6, 0x0

    goto :goto_0
.end method

.method static synthetic lambda$initializeStep$33(Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;Ljava/lang/Object;)V
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 133
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/SignatureView;->clearSignature()V

    .line 134
    return-void
.end method

.method static synthetic lambda$initializeStep$34(Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;Ljava/lang/Object;)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 144
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->signatureView:Lorg/researchstack/backbone/ui/views/SignatureView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/SignatureView;->isSignatureDrawn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->setDataToResult()V

    .line 147
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 153
    :goto_0
    return-void

    .line 151
    :cond_0
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_error_invalid_signature:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method private setDataToResult()V
    .locals 6

    .prologue
    .line 158
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    check-cast v3, Lorg/researchstack/backbone/step/ConsentSignatureStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/ConsentSignatureStep;->getSignatureDateFormat()Ljava/lang/String;

    move-result-object v0

    .line 159
    .local v0, "format":Ljava/lang/String;
    invoke-static {v0}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 162
    .local v2, "signatureDateFormat":Ljava/text/DateFormat;
    :goto_0
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 164
    .local v1, "formattedSignDate":Ljava/lang/String;
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->result:Lorg/researchstack/backbone/result/StepResult;

    const-string v4, "ConsentSignatureStep.Signature"

    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->getBase64EncodedImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/researchstack/backbone/result/StepResult;->setResultForIdentifier(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->result:Lorg/researchstack/backbone/result/StepResult;

    const-string v4, "ConsentSignatureStep.Signature.Date"

    invoke-virtual {v3, v4, v1}, Lorg/researchstack/backbone/result/StepResult;->setResultForIdentifier(Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    return-void

    .line 161
    .end local v1    # "formattedSignDate":Ljava/lang/String;
    .end local v2    # "signatureDateFormat":Ljava/text/DateFormat;
    :cond_0
    invoke-static {}, Lorg/researchstack/backbone/utils/FormatHelper;->getSignatureFormat()Ljava/text/DateFormat;

    move-result-object v2

    goto :goto_0
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 193
    return-void
.end method

.method public getLayout()Landroid/view/View;
    .locals 0

    .prologue
    .line 71
    return-object p0
.end method

.method public initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 62
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    .line 63
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 65
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->initializeStep()V

    .line 66
    return-void
.end method

.method public isBackEventConsumed()Z
    .locals 4

    .prologue
    .line 77
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->setDataToResult()V

    .line 78
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, -0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 79
    const/4 v0, 0x0

    return v0
.end method

.method public onRestoreStep(Lorg/researchstack/backbone/step/Step;Ljava/lang/String;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "answer"    # Ljava/lang/String;

    .prologue
    .line 188
    return-void
.end method

.method public onViewChange(Lorg/researchstack/backbone/step/Step;)V
    .locals 3
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 91
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/support/v7/app/AppCompatActivity;

    .line 92
    .local v1, "activity":Landroid/support/v7/app/AppCompatActivity;
    invoke-virtual {v1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 93
    .local v0, "actionBar":Landroid/support/v7/app/ActionBar;
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v2

    invoke-static {v0, v2}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->toggleBackNavigation(Landroid/support/v7/app/ActionBar;Z)V

    .line 94
    return-void
.end method

.method public setCallbacks(Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .prologue
    .line 85
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentSignatureStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .line 86
    return-void
.end method
