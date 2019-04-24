.class public Lcom/myfitnesspal/android/sdk/MfpWebError;
.super Ljava/lang/Throwable;
.source "SourceFile"


# instance fields
.field private mErrorCode:I

.field private mFailingUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 16
    iput p2, p0, Lcom/myfitnesspal/android/sdk/MfpWebError;->mErrorCode:I

    .line 17
    iput-object p3, p0, Lcom/myfitnesspal/android/sdk/MfpWebError;->mFailingUrl:Ljava/lang/String;

    .line 18
    return-void
.end method


# virtual methods
.method getErrorCode()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/myfitnesspal/android/sdk/MfpWebError;->mErrorCode:I

    return v0
.end method

.method getFailingUrl()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpWebError;->mFailingUrl:Ljava/lang/String;

    return-object v0
.end method
