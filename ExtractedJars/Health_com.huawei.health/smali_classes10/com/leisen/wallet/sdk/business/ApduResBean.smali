.class public Lcom/leisen/wallet/sdk/business/ApduResBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private apdu:Ljava/lang/String;

.field private index:I

.field private sw:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->apdu:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public getApdu()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->apdu:Ljava/lang/String;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->index:I

    return v0
.end method

.method public getSw()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->sw:Ljava/lang/String;

    return-object v0
.end method

.method public setApdu(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->apdu:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->index:I

    .line 30
    return-void
.end method

.method public setSw(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/ApduResBean;->sw:Ljava/lang/String;

    .line 46
    return-void
.end method
