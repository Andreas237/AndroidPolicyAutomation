.class public Lcom/ibotta/api/ApiException;
.super Ljava/lang/Exception;
.source "ApiException.java"


# static fields
.field private static final serialVersionUID:J = -0x65fe3c4f1269061bL


# instance fields
.field private apiCode:I

.field private details:Lcom/ibotta/api/ApiErrorDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method private parseApiErrorDetails(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 48
    :cond_0
    invoke-static {p1}, Lcom/ibotta/api/ApiErrorDetails;->fromJson(Ljava/lang/String;)Lcom/ibotta/api/ApiErrorDetails;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/ApiException;->details:Lcom/ibotta/api/ApiErrorDetails;

    return-void
.end method


# virtual methods
.method public getApiCode()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/ibotta/api/ApiException;->apiCode:I

    return v0
.end method

.method public getDetails()Lcom/ibotta/api/ApiErrorDetails;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/ApiException;->details:Lcom/ibotta/api/ApiErrorDetails;

    if-nez v0, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/ApiException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/api/ApiException;->parseApiErrorDetails(Ljava/lang/String;)V

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/ApiException;->details:Lcom/ibotta/api/ApiErrorDetails;

    return-object v0
.end method

.method public setApiCode(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/ibotta/api/ApiException;->apiCode:I

    return-void
.end method

.method public setDetails(Lcom/ibotta/api/ApiErrorDetails;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/ApiException;->details:Lcom/ibotta/api/ApiErrorDetails;

    return-void
.end method
