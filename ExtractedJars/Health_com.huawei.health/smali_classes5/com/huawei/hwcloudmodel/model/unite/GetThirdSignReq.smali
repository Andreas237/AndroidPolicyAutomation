.class public Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private signContent:Ljava/lang/String;

.field private thirdAccountType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;->thirdAccountType:Ljava/lang/String;

    .line 16
    return-void
.end method


# virtual methods
.method public getSignContent()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;->signContent:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdAccountType()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;->thirdAccountType:Ljava/lang/String;

    return-object v0
.end method

.method public setSignContent(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;->signContent:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setThirdAccountType(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;->thirdAccountType:Ljava/lang/String;

    .line 24
    return-void
.end method
