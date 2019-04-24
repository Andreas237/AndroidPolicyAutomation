.class public Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appletAid:Ljava/lang/String;

.field private appletVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->appletAid:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->appletVersion:Ljava/lang/String;

    .line 16
    return-void
.end method


# virtual methods
.method public getAppletAid()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->appletAid:Ljava/lang/String;

    return-object v0
.end method

.method public getAppletVersion()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->appletVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setAppletAid(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->appletAid:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setAppletVersion(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->appletVersion:Ljava/lang/String;

    .line 32
    return-void
.end method
