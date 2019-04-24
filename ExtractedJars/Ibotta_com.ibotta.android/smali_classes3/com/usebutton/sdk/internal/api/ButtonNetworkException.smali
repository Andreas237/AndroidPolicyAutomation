.class public Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
.super Lcom/usebutton/sdk/internal/ButtonException;
.source "ButtonNetworkException.java"


# instance fields
.field private mRequestId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/ButtonException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p3}, Lcom/usebutton/sdk/internal/ButtonException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;->mRequestId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/ButtonException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/ButtonException;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;->mRequestId:Ljava/lang/String;

    return-object v0
.end method
