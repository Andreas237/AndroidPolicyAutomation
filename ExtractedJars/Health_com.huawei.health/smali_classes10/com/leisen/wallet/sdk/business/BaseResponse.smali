.class public Lcom/leisen/wallet/sdk/business/BaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lcom/leisen/wallet/sdk/business/Business;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private business:Lcom/leisen/wallet/sdk/business/Business;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBusiness()Lcom/leisen/wallet/sdk/business/Business;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseResponse;->business:Lcom/leisen/wallet/sdk/business/Business;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseResponse;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseResponse;->business:Lcom/leisen/wallet/sdk/business/Business;

    .line 28
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseResponse;->version:Ljava/lang/String;

    .line 20
    return-void
.end method
