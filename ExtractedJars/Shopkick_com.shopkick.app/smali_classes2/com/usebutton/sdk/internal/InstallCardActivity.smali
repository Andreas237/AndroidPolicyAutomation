.class public Lcom/usebutton/sdk/internal/InstallCardActivity;
.super Lcom/usebutton/sdk/internal/BaseCardActivity;
.source "InstallCardActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;
    }
.end annotation


# static fields
.field public static final EXTRA_AUTH_CHALLENGE_INTENT:Ljava/lang/String; = "auth_challenge_intent"

.field public static final EXTRA_DEEP_LINK:Ljava/lang/String; = "deep_link"

.field private static final TAG:Ljava/lang/String; = "InstallCardActivity"


# instance fields
.field private noStoreDialog:Landroid/app/AlertDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/InstallCardActivity;)Landroid/app/AlertDialog;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity;->noStoreDialog:Landroid/app/AlertDialog;

    return-object p0
.end method

.method private canInstall(Landroid/content/Intent;)Z
    .locals 2

    .line 136
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private getDeepLink()Landroid/net/Uri;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 68
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "deep_link"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method

.method private installRecipientForAction(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 9
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 90
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 93
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->finish()V

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    const-string v1, "market://details"

    .line 101
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "id"

    .line 102
    invoke-virtual {v1, v2, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string/jumbo v2, "url"

    .line 103
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 105
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "com.android.vending"

    .line 106
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/InstallCardActivity;->canInstall(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Store Install began (Action ID: %s)"

    const/4 v3, 0x1

    .line 109
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-static {v1, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p2

    const-string v1, "btn:app-attended-install-began"

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v3

    invoke-static {v3}, Lcom/usebutton/sdk/internal/InstallCardActivity;->eventPropertiesSourceTokenAndAppId(Lcom/usebutton/sdk/internal/models/MetaInfo;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {p2, v1, v3}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 111
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p2

    const-string v1, "btn:app-install-app-store-view"

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v3

    invoke-static {v3}, Lcom/usebutton/sdk/internal/InstallCardActivity;->eventPropertiesSourceTokenAndAppId(Lcom/usebutton/sdk/internal/models/MetaInfo;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {p2, v1, v3}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    const/4 p2, 0x5

    .line 112
    invoke-virtual {p0, v2, p2}, Lcom/usebutton/sdk/internal/InstallCardActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 114
    new-instance p2, Lcom/usebutton/sdk/internal/PostInstaller;

    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v5

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v6

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/InstallCardActivity;->intentFor(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v8

    move-object v3, p2

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/usebutton/sdk/internal/PostInstaller;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/content/Intent;Lcom/usebutton/sdk/internal/events/EventTracker;)V

    .line 115
    new-instance p1, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;

    invoke-direct {p1, v0, p2}, Lcom/usebutton/sdk/internal/InstallCardActivity$OnInstallationHandler;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/PostInstaller;)V

    .line 117
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-result-object p2

    invoke-virtual {p2, v0, p1}, Lcom/usebutton/sdk/internal/util/PackageObserver;->observePackage(Ljava/lang/String;Lcom/usebutton/sdk/internal/util/Receiver;)V

    goto :goto_0

    .line 119
    :cond_2
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->showNoStoreDialog()V

    :goto_0
    return-void
.end method

.method private intentFor(Landroid/net/Uri;)Landroid/content/Intent;
    .locals 2

    .line 124
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "auth_challenge_intent"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 126
    const-class p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    goto :goto_0

    .line 128
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 129
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    .line 130
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :goto_0
    return-object v0
.end method

.method public static intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/net/Uri;ILandroid/content/Intent;)Landroid/content/Intent;
    .locals 2
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/InstallCardActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "meta_info"

    .line 40
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "deep_link"

    .line 41
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "flags"

    .line 42
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p4, :cond_0

    const-string p0, "auth_challenge_intent"

    .line 44
    invoke-virtual {v0, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method private showNoStoreDialog()V
    .locals 5

    .line 140
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/usebutton/sdk/R$string;->btn_no_store_title:I

    .line 141
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$string;->btn_no_store_message:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 142
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 143
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$string;->btn_no_store_close:I

    new-instance v2, Lcom/usebutton/sdk/internal/InstallCardActivity$2;

    invoke-direct {v2, p0}, Lcom/usebutton/sdk/internal/InstallCardActivity$2;-><init>(Lcom/usebutton/sdk/internal/InstallCardActivity;)V

    .line 144
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 151
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity;->noStoreDialog:Landroid/app/AlertDialog;

    .line 152
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity;->noStoreDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method


# virtual methods
.method public bind(Lcom/usebutton/sdk/internal/models/MetaInfo;)V
    .locals 0

    return-void
.end method

.method protected getCardDismissedEvent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getCardSpecificEventProperties()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 82
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getCardViewedEvent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getContentLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 157
    invoke-super {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x5

    if-ne v0, p1, :cond_1

    .line 159
    sget-object p1, Lcom/usebutton/sdk/internal/InstallCardActivity;->TAG:Ljava/lang/String;

    const-string v0, "Back from Play Store, data: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0, p3}, Lcom/usebutton/sdk/internal/InstallCardActivity;->toString(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p3

    aput-object p3, v1, v2

    invoke-static {p1, v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    .line 161
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p1

    const-string p2, "btn:app-install-app-store-canceled"

    .line 162
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getSourceToken()Ljava/lang/String;

    move-result-object p3

    .line 161
    invoke-virtual {p1, p2, p3}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithPromotionSourceToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->finish()V

    :cond_1
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 51
    invoke-super {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onStop()V

    .line 52
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallCardActivity;->noStoreDialog:Landroid/app/AlertDialog;

    new-instance v1, Lcom/usebutton/sdk/internal/InstallCardActivity$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/InstallCardActivity$1;-><init>(Lcom/usebutton/sdk/internal/InstallCardActivity;)V

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/Do;->ifNotNull(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method public shouldBindAndShowContent(Lcom/usebutton/sdk/internal/models/MetaInfo;)Z
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getDeepLink()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->getPromotionId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/InstallCardActivity;->installRecipientForAction(Landroid/net/Uri;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
