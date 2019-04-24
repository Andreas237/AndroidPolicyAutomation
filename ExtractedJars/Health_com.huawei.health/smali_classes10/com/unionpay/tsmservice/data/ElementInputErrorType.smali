.class public Lcom/unionpay/tsmservice/data/ElementInputErrorType;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mElementName:Ljava/lang/String;

.field private mErrorInfo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/ElementInputErrorType;->mErrorInfo:Ljava/lang/String;

    .line 5
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/ElementInputErrorType;->mElementName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/ElementInputErrorType;->mElementName:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorInfo()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/ElementInputErrorType;->mErrorInfo:Ljava/lang/String;

    return-object v0
.end method

.method public setElementName(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/ElementInputErrorType;->mElementName:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public setErrorInfo(Ljava/lang/String;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/ElementInputErrorType;->mErrorInfo:Ljava/lang/String;

    .line 9
    return-void
.end method
