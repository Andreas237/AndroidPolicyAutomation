.class public Lcom/shopkick/app/registration/SelectCountryController;
.super Ljava/lang/Object;
.source "SelectCountryController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;,
        Lcom/shopkick/app/registration/SelectCountryController$SelectCountryNextButtonClick;,
        Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;
    }
.end annotation


# static fields
.field public static final USER_SELECTED_COUNTRY_EVENT:Ljava/lang/String; = "USER_SELECTED_COUNTRY_EVENT"


# instance fields
.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

.field private selectableCountries:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private selectedCountry:Ljava/lang/Integer;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

.field private userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/activities/BaseActivity;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/shopkick/app/registration/SelectCountryController;->context:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lcom/shopkick/app/registration/SelectCountryController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 39
    iput-object p3, p0, Lcom/shopkick/app/registration/SelectCountryController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 40
    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 41
    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iput-object p1, p0, Lcom/shopkick/app/registration/SelectCountryController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/SelectCountryController;Ljava/lang/Integer;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/SelectCountryController;->setSelectedCountry(Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/registration/SelectCountryController;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryContinuePressed()V

    return-void
.end method

.method private logSelectCountryContinuePressed()V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x76

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 100
    iget-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectedCountry:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCountryCode(Ljava/lang/Integer;)V

    .line 101
    iget-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private selectCountryContinuePressed()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectedCountry:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object v0, v1, Lcom/shopkick/app/account/UserAccountDataSource;->userSelectedCountry:Ljava/lang/Integer;

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "USER_SELECTED_COUNTRY_EVENT"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 90
    invoke-direct {p0}, Lcom/shopkick/app/registration/SelectCountryController;->logSelectCountryContinuePressed()V

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private setSelectedCountry(Ljava/lang/Integer;)V
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectableCountries:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectableCountries:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eq v1, p1, :cond_0

    const/4 v1, 0x0

    .line 77
    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move-object v1, p1

    :goto_1
    iput-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectedCountry:Ljava/lang/Integer;

    .line 81
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public setDialogDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public showSelectCountryDialog()V
    .locals 7

    .line 46
    new-instance v0, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    iget-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;->setCancelable(Z)V

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01a8

    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 51
    iget-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;->setContentView(Landroid/view/View;)V

    const v1, 0x7f0902a3

    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0907e6

    .line 55
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0902a4

    .line 57
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0907e7

    .line 58
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 60
    new-instance v5, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;

    const/16 v6, 0x3a

    invoke-direct {v5, p0, v6}, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;-><init>(Lcom/shopkick/app/registration/SelectCountryController;I)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    new-instance v3, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;

    const/4 v5, 0x1

    invoke-direct {v3, p0, v5}, Lcom/shopkick/app/registration/SelectCountryController$CountryCheckboxClick;-><init>(Lcom/shopkick/app/registration/SelectCountryController;I)V

    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectableCountries:Ljava/util/HashMap;

    .line 63
    iget-object v3, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectableCountries:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object v1, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectableCountries:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7f0904a8

    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryNextButtonClick;

    invoke-direct {v1, p0}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryNextButtonClick;-><init>(Lcom/shopkick/app/registration/SelectCountryController;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/registration/SelectCountryController;->selectCountryDialog:Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/registration/SelectCountryController$SelectCountryDialog;->show()V

    return-void
.end method
