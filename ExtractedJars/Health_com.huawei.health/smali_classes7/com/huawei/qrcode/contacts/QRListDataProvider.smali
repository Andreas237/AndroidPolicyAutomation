.class public Lcom/huawei/qrcode/contacts/QRListDataProvider;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/contacts/QRListDataProvider$PhoneSpan;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    return-void
.end method

.method private addListData(Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/qrcode/contacts/QRResultData;>;Ljava/util/ArrayList<Ljava/lang/String;>;IILjava/lang/String;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    new-instance v2, Lcom/huawei/qrcode/contacts/QRResultData;

    invoke-direct {v2, v3, p5}, Lcom/huawei/qrcode/contacts/QRResultData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p4}, Lcom/huawei/qrcode/contacts/QRResultData;->setType(I)V

    const/4 v0, 0x2

    if-ne p4, v0, :cond_3

    invoke-direct {p0, v3, v2}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->setPhoneSpanString(Ljava/lang/String;Lcom/huawei/qrcode/contacts/QRResultData;)V

    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_4
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    add-int/lit8 v0, p3, -0x1

    if-le v3, v0, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v2, Lcom/huawei/qrcode/contacts/QRResultData;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lcom/huawei/qrcode/contacts/QRResultData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p4}, Lcom/huawei/qrcode/contacts/QRResultData;->setType(I)V

    const/4 v0, 0x2

    if-ne p4, v0, :cond_6

    invoke-direct {p0, v4, v2}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->setPhoneSpanString(Ljava/lang/String;Lcom/huawei/qrcode/contacts/QRResultData;)V

    :cond_6
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_8
    :goto_1
    return-void
.end method

.method private addNormalData(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/qrcode/contacts/QRResultData;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Lcom/huawei/qrcode/contacts/QRResultData;

    invoke-direct {v1, p2, p3}, Lcom/huawei/qrcode/contacts/QRResultData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private setPhoneSpanString(Ljava/lang/String;Lcom/huawei/qrcode/contacts/QRResultData;)V
    .locals 5

    invoke-static {p1}, Lcom/huawei/qrcode/util/Util;->isPhoneNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v0, Lcom/huawei/qrcode/contacts/QRListDataProvider$PhoneSpan;

    invoke-direct {v0}, Lcom/huawei/qrcode/contacts/QRListDataProvider$PhoneSpan;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p2, v4}, Lcom/huawei/qrcode/contacts/QRResultData;->setPhoneSpannableString(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/qrcode/contacts/QRResultData;->setType(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public buildQRResultData(Lcom/huawei/qrcode/contacts/MEVCard;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/qrcode/contacts/MEVCard;)Ljava/util/ArrayList<Lcom/huawei/qrcode/contacts/QRResultData;>;"
        }
    .end annotation

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v6

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getN()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v3, "scanqrcode_sdk_contacts_name"

    invoke-static {v2, v3}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addNormalData(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getOrg()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v3, "scanqrcode_sdk_contacts_company"

    invoke-static {v2, v3}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addNormalData(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getAdr()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v3, "scanqrcode_sdk_contacts_address"

    invoke-static {v2, v3}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addNormalData(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, v6

    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getTelList()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v4, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v5, "scanqrcode_sdk_contacts_telephone"

    invoke-static {v4, v5}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v3, 0x3

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addListData(Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/lang/String;)V

    move-object v0, p0

    move-object v1, v6

    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getEmailList()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v4, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v5, "scanqrcode_sdk_contacts_email"

    invoke-static {v4, v5}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v3, 0x2

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addListData(Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v3, "scanqrcode_sdk_contacts_website"

    invoke-static {v2, v3}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addNormalData(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/qrcode/contacts/MEVCard;->getNote()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/contacts/QRListDataProvider;->context:Landroid/content/Context;

    const-string v3, "scanqrcode_sdk_contacts_intro"

    invoke-static {v2, v3}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->addNormalData(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public buildQRResultData(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Z)Ljava/util/ArrayList<Lcom/huawei/qrcode/contacts/QRResultData;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Lcom/huawei/qrcode/contacts/QRResultData;

    const/4 v0, 0x0

    invoke-direct {v2, p1, v0}, Lcom/huawei/qrcode/contacts/QRResultData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/contacts/QRResultData;->setType(I)V

    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method
