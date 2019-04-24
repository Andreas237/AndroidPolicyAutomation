.class public Lcom/myfitnesspal/android/sdk/MfpAuthError;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private mErrorCode:I

.field private mErrorType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    iput v0, p0, Lcom/myfitnesspal/android/sdk/MfpAuthError;->mErrorCode:I

    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 16
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    iput v0, p0, Lcom/myfitnesspal/android/sdk/MfpAuthError;->mErrorCode:I

    .line 17
    iput-object p2, p0, Lcom/myfitnesspal/android/sdk/MfpAuthError;->mErrorType:Ljava/lang/String;

    .line 18
    iput p3, p0, Lcom/myfitnesspal/android/sdk/MfpAuthError;->mErrorCode:I

    .line 19
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/myfitnesspal/android/sdk/MfpAuthError;->mErrorCode:I

    return v0
.end method

.method public getErrorType()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpAuthError;->mErrorType:Ljava/lang/String;

    return-object v0
.end method
