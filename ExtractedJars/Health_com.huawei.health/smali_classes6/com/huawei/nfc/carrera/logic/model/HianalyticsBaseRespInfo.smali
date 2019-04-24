.class public Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected respCd:Ljava/lang/String;

.field protected respMsg:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespCd()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;->respCd:Ljava/lang/String;

    return-object v0
.end method

.method public getRespMsg()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;->respMsg:Ljava/lang/String;

    return-object v0
.end method

.method public setRespCd(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;->respCd:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setRespMsg(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;->respMsg:Ljava/lang/String;

    .line 38
    return-void
.end method
