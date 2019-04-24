.class public Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final LOST_PUSH_MSG_KEY_AID:Ljava/lang/String; = "aid"

.field static final LOST_PUSH_MSG_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final LOST_PUSH_MSG_KEY_DPANID:Ljava/lang/String; = "dpanid"

.field static final LOST_PUSH_MSG_KEY_STATUS:Ljava/lang/String; = "status"

.field static final LOST_PUSH_MSG_TYPE:Ljava/lang/String; = "reportloss"


# instance fields
.field private aid:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private dpanid:Ljava/lang/String;

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDpanid()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->dpanid:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->status:Ljava/lang/String;

    return-object v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->aid:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->cplc:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setDpanid(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->dpanid:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->status:Ljava/lang/String;

    .line 91
    return-void
.end method
