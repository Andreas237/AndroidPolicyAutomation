.class public Lcom/scandit/barcodepicker/ocr/RecognizedText;
.super Ljava/lang/Object;
.source "RecognizedText.java"


# instance fields
.field private mRejected:Z

.field private mText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/RecognizedText;->mText:Ljava/lang/String;

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ocr/RecognizedText;->mRejected:Z

    .line 16
    iput-object p1, p0, Lcom/scandit/barcodepicker/ocr/RecognizedText;->mText:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getText()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/scandit/barcodepicker/ocr/RecognizedText;->mText:Ljava/lang/String;

    return-object v0
.end method

.method public isRejected()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/ocr/RecognizedText;->mRejected:Z

    return v0
.end method

.method public setRejected(Z)V
    .locals 0

    .line 56
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/ocr/RecognizedText;->mRejected:Z

    return-void
.end method
