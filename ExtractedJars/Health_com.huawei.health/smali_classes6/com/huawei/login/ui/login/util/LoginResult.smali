.class public Lcom/huawei/login/ui/login/util/LoginResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private errorCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/login/ui/login/util/LoginResult;->errorCode:I

    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/login/ui/login/util/LoginResult;->errorCode:I

    .line 14
    iput p1, p0, Lcom/huawei/login/ui/login/util/LoginResult;->errorCode:I

    .line 15
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/huawei/login/ui/login/util/LoginResult;->errorCode:I

    return v0
.end method

.method public setErrorCode(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/huawei/login/ui/login/util/LoginResult;->errorCode:I

    .line 26
    return-void
.end method
