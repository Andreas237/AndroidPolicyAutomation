.class public Lcom/usebutton/sdk/internal/ActionPerformer;
.super Ljava/lang/Object;
.source "ActionPerformer.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ActionPerformer"


# instance fields
.field private final mAction:Lcom/usebutton/sdk/models/Link;

.field private final mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mEventPropertyPairs:[Ljava/lang/String;

.field private final mIntentFlags:I

.field private mInvokeEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/MetaInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/models/Link;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/high16 v0, 0x10000000

    const/4 v1, 0x0

    .line 42
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;ILcom/usebutton/sdk/internal/models/AuthChallenge;)V

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;I)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/models/MetaInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/models/Link;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;ILcom/usebutton/sdk/internal/models/AuthChallenge;)V

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;ILcom/usebutton/sdk/internal/models/AuthChallenge;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/models/MetaInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/models/Link;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/models/AuthChallenge;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    .line 52
    iput-object p2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    .line 53
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 54
    iput p3, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mIntentFlags:I

    .line 55
    iput-object p4, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/ActionPerformer;Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->doExecute(Landroid/content/Context;)V

    return-void
.end method

.method private addExtraProperties(Lorg/json/JSONObject;)V
    .locals 4

    .line 213
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mEventPropertyPairs:[Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 216
    :goto_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mEventPropertyPairs:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 218
    :try_start_0
    aget-object v2, v1, v0

    add-int/lit8 v3, v0, 0x1

    aget-object v1, v1, v3

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    return-void
.end method

.method private doExecute(Landroid/content/Context;)V
    .locals 12

    .line 114
    invoke-static {p1}, Lcom/usebutton/sdk/internal/NotificationFactory;->getInstance(Landroid/content/Context;)Lcom/usebutton/sdk/internal/NotificationFactory;

    move-result-object v0

    .line 115
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v1

    .line 118
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->isTargetWebviewOnly()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v2, "webview-only"

    .line 120
    iget-object v6, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v6}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v6

    .line 121
    iget-object v7, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-static {p1, v7, v8}, Lcom/usebutton/sdk/internal/WebViewActivity;->createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)Landroid/content/Intent;

    move-result-object v7

    .line 122
    iget v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mIntentFlags:I

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 123
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    const-string v9, "btn:webview-open"

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    sget-object v8, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v9, "Webview-only requested for action: %s"

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v6, v10, v4

    invoke-static {v8, v9, v10}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 127
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->isInstalled(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v2, "app"

    .line 129
    iget-object v6, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v6}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v6

    .line 130
    new-instance v7, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-direct {v7, v8, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 131
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v8}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    iget v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mIntentFlags:I

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 133
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-eqz v8, :cond_1

    const-string v9, "auth_challenge"

    .line 134
    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 136
    :cond_1
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    const-string v9, "btn:app-deeplink"

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    sget-object v8, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v9, "App installed, open action: %s"

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v6, v10, v4

    invoke-static {v8, v9, v10}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-static {}, Lcom/usebutton/sdk/internal/util/TestUtils;->isNotTesting()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 139
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v8

    invoke-virtual {v8}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v8

    invoke-virtual {v8}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isAppToAppNotificationEnabled()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 140
    invoke-virtual {v0, v7}, Lcom/usebutton/sdk/internal/NotificationFactory;->displayAppToAppNotification(Landroid/content/Intent;)V

    const-string v8, "btn:notified-tracking-active"

    .line 141
    new-array v9, v3, [Ljava/lang/String;

    const-string v10, "promotion_source_token"

    aput-object v10, v9, v4

    iget-object v10, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 142
    invoke-virtual {v10}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v5

    .line 141
    invoke-virtual {v1, v8, v9}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    goto/16 :goto_0

    .line 147
    :cond_2
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->isTargetBrowser()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 148
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v6

    const-string v2, "browser"

    .line 150
    new-instance v7, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-direct {v7, v8, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 151
    iget v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mIntentFlags:I

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 152
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->findDefaultBrowser(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    const-string v9, "btn:app-deeplink"

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    sget-object v8, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v9, "Browser requested for action: %s"

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v6, v10, v4

    invoke-static {v8, v9, v10}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 157
    :cond_3
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->isTargetWebview()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v2, "webview"

    .line 159
    iget-object v6, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v6}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v6

    .line 160
    iget-object v7, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-static {p1, v7, v8}, Lcom/usebutton/sdk/internal/WebViewActivity;->createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)Landroid/content/Intent;

    move-result-object v7

    .line 161
    iget v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mIntentFlags:I

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 162
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    const-string v9, "btn:webview-open"

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    sget-object v8, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v9, "Webview requested for action: %s"

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v6, v10, v4

    invoke-static {v8, v9, v10}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 166
    :cond_4
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_8

    const-string v2, "app"

    .line 169
    iget-object v6, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v6}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v6

    .line 170
    iget-object v7, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    const/high16 v9, 0x4000000

    .line 171
    invoke-static {p1, v7, v8, v9}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/internal/models/MetaInfo;I)Landroid/content/Intent;

    move-result-object v7

    .line 173
    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget v9, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mIntentFlags:I

    invoke-static {p1, v8, v6, v9, v7}, Lcom/usebutton/sdk/internal/InstallCardActivity;->intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/net/Uri;ILandroid/content/Intent;)Landroid/content/Intent;

    move-result-object v7

    .line 175
    sget-object v8, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v9, "App not installed, let\'s install for action: %s"

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v6, v10, v4

    invoke-static {v8, v9, v10}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :cond_5
    :goto_0
    invoke-static {p1, v7}, Lcom/usebutton/sdk/internal/ButtonPrivate;->safelyOpenIntent(Landroid/content/Context;Landroid/content/Intent;)V

    .line 185
    sget-object p1, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v8, "Opening action: %s in: %s with intent %s"

    const/4 v9, 0x3

    new-array v10, v9, [Ljava/lang/Object;

    aput-object v6, v10, v4

    aput-object v2, v10, v5

    aput-object v7, v10, v3

    invoke-static {p1, v8, v10}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Deep link executed (Action ID: %s, Link: %s)"

    .line 187
    new-array v7, v3, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v8}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v4

    aput-object v6, v7, v5

    invoke-static {p1, v7}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/4 v8, 0x6

    .line 191
    new-array v8, v8, [Ljava/lang/Object;

    const-string v10, "promotion_source_token"

    aput-object v10, v8, v4

    iget-object v10, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 192
    invoke-virtual {v10}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v5

    const-string v10, "action"

    aput-object v10, v8, v3

    .line 193
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v10, 0x4

    const-string v11, "target"

    aput-object v11, v8, v10

    const/4 v10, 0x5

    aput-object v2, v8, v10

    .line 191
    invoke-static {v8}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v8

    .line 196
    invoke-direct {p0, v8}, Lcom/usebutton/sdk/internal/ActionPerformer;->addExtraProperties(Lorg/json/JSONObject;)V

    const-string v10, "btn:app-deeplink"

    .line 198
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    :try_start_0
    const-string v10, "notifications_enabled"

    .line 201
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/NotificationFactory;->areNotificationsEnabled()Z

    move-result v11

    .line 200
    invoke-virtual {v8, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    :catch_0
    :cond_6
    invoke-virtual {v1, v7, v8}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_1

    :cond_7
    return-void

    .line 180
    :cond_8
    sget-object p1, Lcom/usebutton/sdk/internal/ActionPerformer;->TAG:Ljava/lang/String;

    const-string v0, "Don\'t know how to open link: %s"

    new-array v1, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mAction:Lcom/usebutton/sdk/models/Link;

    aput-object v2, v1, v4

    invoke-static {p1, v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private findDefaultBrowser(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 225
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "http://"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 226
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/high16 v1, 0x10000

    .line 227
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 229
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->resolvePackageName:Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private isInstalled(Landroid/content/Context;)Z
    .locals 1

    .line 235
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/util/PackageObserver;->isInstalled(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public execute(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 69
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method

.method public execute(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 4
    .param p2    # Lcom/usebutton/sdk/internal/models/AppAction$Listener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButtonRepository()Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/usebutton/sdk/internal/ActionPerformer$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/usebutton/sdk/internal/ActionPerformer$1;-><init>(Lcom/usebutton/sdk/internal/ActionPerformer;Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    .line 86
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getTapSignal()Ljava/lang/String;

    move-result-object p1

    const-string v2, "require-ack"

    .line 87
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 88
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 91
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 92
    iget-object v2, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/usebutton/sdk/internal/ActionPerformer$2;

    invoke-direct {v3, p0, p1, v1, p2}, Lcom/usebutton/sdk/internal/ActionPerformer$2;-><init>(Lcom/usebutton/sdk/internal/ActionPerformer;Ljava/lang/String;Ljava/lang/Runnable;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    invoke-virtual {v0, v2, v3}, Lcom/usebutton/sdk/internal/ButtonRepository;->postTap(Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    :cond_1
    return-void
.end method

.method public withEvent(Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 59
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mInvokeEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public varargs withEventProperties([Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer;->mEventPropertyPairs:[Ljava/lang/String;

    return-object p0
.end method
