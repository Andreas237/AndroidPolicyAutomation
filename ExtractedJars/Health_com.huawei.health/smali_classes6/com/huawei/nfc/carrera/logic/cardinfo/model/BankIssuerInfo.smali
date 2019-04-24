.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;"
        }
    .end annotation
.end field

.field private bankAgreementTitle:Ljava/lang/String;

.field private bankAgreementUrl:Ljava/lang/String;

.field private contactNumber:Ljava/lang/String;

.field private crebitContactNumber:Ljava/lang/String;

.field private creditTcUrl:Ljava/lang/String;

.field private creditTermsTitle:Ljava/lang/String;

.field private creditTermsUrl:Ljava/lang/String;

.field private creditWebsite:Ljava/lang/String;

.field private debitContactNumber:Ljava/lang/String;

.field private debitTcUrl:Ljava/lang/String;

.field private debitTermsTitle:Ljava/lang/String;

.field private debitTermsUrl:Ljava/lang/String;

.field private debitWebsite:Ljava/lang/String;

.field private issuerName:Ljava/lang/String;

.field private logoIcon:Landroid/graphics/Bitmap;

.field private mode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->issuerName:Ljava/lang/String;

    .line 107
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->mode:I

    .line 108
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCreditTcUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTcUrl:Ljava/lang/String;

    .line 109
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getDebitTcUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTcUrl:Ljava/lang/String;

    .line 110
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getDebitTermsTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTermsTitle:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getDebitTermsUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTermsUrl:Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCreditTermsTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTermsTitle:Ljava/lang/String;

    .line 113
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCreditTermsUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTermsUrl:Ljava/lang/String;

    .line 114
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getBankAgreementTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->bankAgreementTitle:Ljava/lang/String;

    .line 115
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getBankAgreementUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->bankAgreementUrl:Ljava/lang/String;

    .line 116
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getContactNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->contactNumber:Ljava/lang/String;

    .line 117
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getDebitCallCenterNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitContactNumber:Ljava/lang/String;

    .line 118
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCreditCallCenterNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->crebitContactNumber:Ljava/lang/String;

    .line 119
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAppInfos()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->appInfos:Ljava/util/List;

    .line 120
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getCreditWebsite()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditWebsite:Ljava/lang/String;

    .line 121
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getDebitWebsite()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitWebsite:Ljava/lang/String;

    .line 122
    return-void
.end method


# virtual methods
.method public getAppInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;"
        }
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->appInfos:Ljava/util/List;

    return-object v0
.end method

.method public getBankAgreementTitle()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->bankAgreementTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getBankAgreementUrl()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->bankAgreementUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getContactNumber()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->contactNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCrebitContactNumber()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->crebitContactNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTcUrl()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTcUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTermsTitle()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTermsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTermsUrl()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTermsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditWebsite()Ljava/lang/String;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditWebsite:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitContactNumber()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitContactNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTcUrl()Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTcUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTermsTitle()Ljava/lang/String;
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTermsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTermsUrl()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTermsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitWebsite()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitWebsite:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerName()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->issuerName:Ljava/lang/String;

    return-object v0
.end method

.method public getLogoIcon()Landroid/graphics/Bitmap;
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->logoIcon:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 136
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->mode:I

    return v0
.end method

.method public setAppInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/model/AppInfo;>;)V"
        }
    .end annotation

    .line 241
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->appInfos:Ljava/util/List;

    .line 242
    return-void
.end method

.method public setBankAgreementTitle(Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->bankAgreementTitle:Ljava/lang/String;

    .line 182
    return-void
.end method

.method public setBankAgreementUrl(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->bankAgreementUrl:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public setContactNumber(Ljava/lang/String;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->contactNumber:Ljava/lang/String;

    .line 212
    return-void
.end method

.method public setCrebitContactNumber(Ljava/lang/String;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->crebitContactNumber:Ljava/lang/String;

    .line 232
    return-void
.end method

.method public setCreditTcUrl(Ljava/lang/String;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTcUrl:Ljava/lang/String;

    .line 272
    return-void
.end method

.method public setCreditTermsTitle(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTermsTitle:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setCreditTermsUrl(Ljava/lang/String;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditTermsUrl:Ljava/lang/String;

    .line 172
    return-void
.end method

.method public setCreditWebsite(Ljava/lang/String;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->creditWebsite:Ljava/lang/String;

    .line 262
    return-void
.end method

.method public setDebitContactNumber(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitContactNumber:Ljava/lang/String;

    .line 222
    return-void
.end method

.method public setDebitTcUrl(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTcUrl:Ljava/lang/String;

    .line 282
    return-void
.end method

.method public setDebitTermsTitle(Ljava/lang/String;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTermsTitle:Ljava/lang/String;

    .line 292
    return-void
.end method

.method public setDebitTermsUrl(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitTermsUrl:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setDebitWebsite(Ljava/lang/String;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->debitWebsite:Ljava/lang/String;

    .line 252
    return-void
.end method

.method public setIssuerName(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->issuerName:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setLogoIcon(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->logoIcon:Landroid/graphics/Bitmap;

    .line 202
    return-void
.end method

.method public setMode(I)V
    .locals 0

    .line 141
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->mode:I

    .line 142
    return-void
.end method
