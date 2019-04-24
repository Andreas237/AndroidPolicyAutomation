.class public Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private sign:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getSign()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignRsp;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignRsp;->sign:Ljava/lang/String;

    .line 20
    return-void
.end method
