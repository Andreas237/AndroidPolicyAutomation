.class public Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final CARD_STATUS_DELETED:Ljava/lang/String; = "6"

.field public static final CARD_STATUS_LOCKED:Ljava/lang/String; = "3"

.field public static final CARD_STATUS_NOT_ACTIVED:Ljava/lang/String; = "7"

.field public static final CARD_STATUS_OPENED:Ljava/lang/String; = "0"


# instance fields
.field private final curAid:Ljava/lang/String;

.field private ifNotify:Z

.field private final mCardName:Ljava/lang/String;

.field private final mCardNumber:Ljava/lang/String;

.field private final mCardStatus:Ljava/lang/String;

.field private mCardType:I

.field private final mDpanid:Ljava/lang/String;

.field private mIssuerID:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;-><init>(Landroid/content/Context;)V

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->ifNotify:Z

    .line 91
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->curAid:Ljava/lang/String;

    .line 92
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardStatus:Ljava/lang/String;

    .line 93
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mDpanid:Ljava/lang/String;

    .line 94
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardName:Ljava/lang/String;

    .line 95
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardNumber:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 114
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;-><init>(Landroid/content/Context;)V

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->ifNotify:Z

    .line 116
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->curAid:Ljava/lang/String;

    .line 117
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardStatus:Ljava/lang/String;

    .line 118
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mDpanid:Ljava/lang/String;

    .line 119
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardName:Ljava/lang/String;

    .line 120
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardNumber:Ljava/lang/String;

    .line 121
    iput-object p7, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mIssuerID:Ljava/lang/String;

    .line 122
    iput p8, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardType:I

    .line 123
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 101
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;-><init>(Landroid/content/Context;)V

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->ifNotify:Z

    .line 103
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->curAid:Ljava/lang/String;

    .line 104
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardStatus:Ljava/lang/String;

    .line 105
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mDpanid:Ljava/lang/String;

    .line 106
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardName:Ljava/lang/String;

    .line 107
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardNumber:Ljava/lang/String;

    .line 108
    iput-boolean p7, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->ifNotify:Z

    .line 109
    return-void
.end method

.method private queryAccountUserId()Ljava/lang/String;
    .locals 5

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v2

    .line 153
    invoke-virtual {v2}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/PluginPayAdapter;

    .line 154
    invoke-interface {v3}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v4

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportCardOpenedAvailableStatus, userid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 156
    return-object v4
.end method

.method private updateDBStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 2

    .line 165
    new-instance v1, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;-><init>()V

    .line 166
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setAid(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardStatus(Ljava/lang/String;)V

    .line 168
    invoke-virtual {v1, p3}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setUserId(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v1, p4}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setDpanId(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v1, p5}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardName(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v1, p6}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardNumber(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v1, p7}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setIssuerID(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v1, p8}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardType(I)V

    .line 174
    invoke-virtual {v1, p9}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setIfNotify(Z)V

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->reportStatusDBManager:Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->insertOrUpdateOneCardReportInfo(Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;)V

    .line 176
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 134
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->queryAccountUserId()Ljava/lang/String;

    move-result-object v10

    .line 135
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->curAid:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardStatus:Ljava/lang/String;

    move-object v3, v10

    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mDpanid:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardName:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardNumber:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mIssuerID:Ljava/lang/String;

    iget v8, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardType:I

    iget-boolean v9, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->ifNotify:Z

    invoke-direct/range {v0 .. v9}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->updateDBStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 138
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->curAid:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardStatus:Ljava/lang/String;

    move-object v3, v10

    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mDpanid:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardName:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardNumber:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mIssuerID:Ljava/lang/String;

    iget v8, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->mCardType:I

    iget-boolean v9, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->ifNotify:Z

    invoke-virtual/range {v0 .. v9}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->reportStatusToServer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->curAid:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;->removeDBStatusItem(Ljava/lang/String;)V

    .line 143
    :cond_0
    return-void
.end method
