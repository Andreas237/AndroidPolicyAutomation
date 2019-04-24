.class public Lcom/huawei/qrcode/contacts/QRCardActivity;
.super Landroid/app/Activity;


# static fields
.field public static final BUNDLE_KEY_MEVCARD:Ljava/lang/String; = "bundleKeyMEVcard"


# instance fields
.field private adapter:Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

.field private card:Lcom/huawei/qrcode/contacts/MEVCard;

.field private listView:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->listView:Landroid/widget/ListView;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->adapter:Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/contacts/QRCardActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->saveToContact()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/contacts/QRCardActivity;)Lcom/huawei/qrcode/contacts/QRResultCardAdapter;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->adapter:Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

    return-object v0
.end method

.method private getIntentData(Landroid/content/Intent;)V
    .locals 3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const-string v0, "bundleKeyMEVcard"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "bundleKeyMEVcard"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/contacts/MEVCard;

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    if-nez v0, :cond_2

    const-string v0, "QRCardActivity getIntentData"

    const-string v1, "card is null."

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->finish()V

    :cond_2
    return-void
.end method

.method private getMailColumn(I)Ljava/lang/String;
    .locals 2

    const-string v1, "email"

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string v1, "secondary_email"

    :cond_0
    return-object v1
.end method

.method private getTelColumn(I)Ljava/lang/String;
    .locals 2

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v1, "phone"

    goto :goto_0

    :pswitch_1
    const-string v1, "secondary_phone"

    goto :goto_0

    :pswitch_2
    const-string v1, "tertiary_phone"

    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private final initVerHor()V
    .locals 1

    invoke-static {p0}, Lcom/huawei/qrcode/util/Util;->isSupportOrientation(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->setRequestedOrientation(I)V

    :goto_0
    return-void
.end method

.method private initViews()V
    .locals 3

    const-string v0, "sqrcode_contacts_listview_content"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->listView:Landroid/widget/ListView;

    new-instance v0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

    new-instance v1, Lcom/huawei/qrcode/contacts/QRListDataProvider;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/contacts/QRListDataProvider;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v1, v2}, Lcom/huawei/qrcode/contacts/QRListDataProvider;->buildQRResultData(Lcom/huawei/qrcode/contacts/MEVCard;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->adapter:Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->listView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->adapter:Lcom/huawei/qrcode/contacts/QRResultCardAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const-string v0, "sqrcode_contacts_btn_add"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/contacts/QRCardActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/contacts/QRCardActivity$1;-><init>(Lcom/huawei/qrcode/contacts/QRCardActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private saveToContact()V
    .locals 9

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.INSERT_OR_EDIT"

    const-string v1, "content://com.android.contacts"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "contacts"

    invoke-static {v1, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v0, "vnd.android.cursor.item/person"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v0}, Lcom/huawei/qrcode/contacts/MEVCard;->getN()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v1}, Lcom/huawei/qrcode/contacts/MEVCard;->getN()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v0}, Lcom/huawei/qrcode/contacts/MEVCard;->getOrg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "company"

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v1}, Lcom/huawei/qrcode/contacts/MEVCard;->getOrg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v0}, Lcom/huawei/qrcode/contacts/MEVCard;->getAdr()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "postal"

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v1}, Lcom/huawei/qrcode/contacts/MEVCard;->getAdr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v0}, Lcom/huawei/qrcode/contacts/MEVCard;->getEmailList()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_5

    const/4 v5, 0x0

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    const/4 v0, 0x1

    if-le v5, v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-direct {p0, v5}, Lcom/huawei/qrcode/contacts/QRCardActivity;->getMailColumn(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v0}, Lcom/huawei/qrcode/contacts/MEVCard;->getTelList()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_7

    const/4 v6, 0x0

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    const/4 v0, 0x2

    if-le v6, v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-direct {p0, v6}, Lcom/huawei/qrcode/contacts/QRCardActivity;->getTelColumn(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    const-string v0, "notes"

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->card:Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-virtual {v1}, Lcom/huawei/qrcode/contacts/MEVCard;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :try_start_0
    invoke-virtual {p0, v3}, Lcom/huawei/qrcode/contacts/QRCardActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v6

    const-string v0, "QRCardActivity ActivityNotFoundException: "

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_4
    return-void
.end method

.method private setListener()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRCardActivity;->listView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/qrcode/contacts/QRCardActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/contacts/QRCardActivity$2;-><init>(Lcom/huawei/qrcode/contacts/QRCardActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method private setTitle()V
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, "scanqrcode_sdk_contacts_title"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const-string v0, "QRCardActivity setTitle actionBar is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->initVerHor()V

    const-string v0, "scanqrcode_sdk_contacts_mecard"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getLayoutId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->setContentView(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->setTitle()V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->getIntentData(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "QRCardActivity Exception: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    invoke-direct {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->initViews()V

    invoke-direct {p0}, Lcom/huawei/qrcode/contacts/QRCardActivity;->setListener()V

    return-void
.end method
