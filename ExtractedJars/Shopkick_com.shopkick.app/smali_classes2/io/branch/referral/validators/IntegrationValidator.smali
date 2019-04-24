.class public Lio/branch/referral/validators/IntegrationValidator;
.super Ljava/lang/Object;
.source "IntegrationValidator.java"

# interfaces
.implements Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;


# static fields
.field private static instance:Lio/branch/referral/validators/IntegrationValidator;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BranchSDK_Doctor"

    .line 25
    iput-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->TAG:Ljava/lang/String;

    .line 28
    new-instance v0, Lio/branch/referral/validators/BranchIntegrationModel;

    invoke-direct {v0, p1}, Lio/branch/referral/validators/BranchIntegrationModel;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    return-void
.end method

.method private checkIfIntentAddedForLinkDomain(Ljava/lang/String;)Z
    .locals 2

    .line 219
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->applinkScheme:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 220
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->applinkScheme:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 221
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private checkIfIntentAddedForURIScheme(Ljava/lang/String;)Z
    .locals 8

    .line 190
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 191
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 192
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    .line 193
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "open"

    .line 195
    :cond_0
    iget-object v1, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v1, v1, Lio/branch/referral/validators/BranchIntegrationModel;->deeplinkUriScheme:Lorg/json/JSONObject;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    .line 196
    iget-object v1, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v1, v1, Lio/branch/referral/validators/BranchIntegrationModel;->deeplinkUriScheme:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    move v4, v2

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 198
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 199
    iget-object v6, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v6, v6, Lio/branch/referral/validators/BranchIntegrationModel;->deeplinkUriScheme:Lorg/json/JSONObject;

    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 200
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-lez v6, :cond_3

    move v6, v2

    .line 201
    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v6, v7, :cond_1

    .line 202
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v4, v3

    goto :goto_0

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move v2, v3

    goto :goto_2

    :cond_4
    move v2, v4

    :cond_5
    :goto_2
    return v2
.end method

.method private doValidateWithAppConfig(Lorg/json/JSONObject;)V
    .locals 4

    const-string v0, "3. Verifying application package name"

    .line 64
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->packageName:Ljava/lang/String;

    const-string v1, "android_package_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> link Settings page."

    const-string v0, "https://docs.branch.io/pages/dashboard/integrate/#android"

    .line 66
    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 70
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    const-string v0, "4. Checking Android Manifest for URI based deep link config"

    .line 74
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->deeplinkUriScheme:Lorg/json/JSONObject;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->deeplinkUriScheme:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 85
    :cond_1
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    goto :goto_1

    .line 76
    :cond_2
    :goto_0
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-boolean v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->appSettingsAvailable:Z

    if-nez v0, :cond_e

    const-string v0, "- Skipping. Unable to verify the deep link config. Failed to read the Android Manifest"

    .line 77
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    :goto_1
    const-string v0, "5. Verifying URI based deep link config with Branch dash board."

    .line 89
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    const-string v0, "android_uri_scheme"

    .line 90
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string p1, "Uri Scheme to open your app is not specified in Branch dashboard. Please add URI scheme in Branch dashboard."

    const-string v0, "https://docs.branch.io/pages/dashboard/integrate/#android"

    .line 92
    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 96
    :cond_3
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    const-string v3, "6. Verifying intent for receiving URI scheme."

    .line 99
    invoke-direct {p0, v3}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    .line 100
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->checkIfIntentAddedForURIScheme(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 101
    iget-object v3, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-boolean v3, v3, Lio/branch/referral/validators/BranchIntegrationModel;->appSettingsAvailable:Z

    if-nez v3, :cond_4

    const-string v0, "- Skipping. Unable to verify intent for receiving URI scheme. Failed to read the Android Manifest"

    .line 102
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const-string p1, "Uri scheme \'%s\' specified in Branch dashboard doesn\'t match with the deep link intent in manifest file"

    .line 104
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "https://docs.branch.io/pages/dashboard/integrate/#android"

    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 109
    :cond_5
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    :goto_2
    const-string v0, "7. Checking AndroidManifest for AppLink config."

    .line 113
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-object v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->applinkScheme:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 115
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-boolean v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->appSettingsAvailable:Z

    if-nez v0, :cond_6

    const-string v0, "- Skipping. Unable to verify intent for receiving URI scheme. Failed to read the Android Manifest"

    .line 116
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    const-string p1, "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file"

    const-string v0, "https://docs.branch.io/pages/deep-linking/android-app-links/#add-intent-filter-to-manifest"

    .line 118
    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 123
    :cond_7
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    :goto_3
    const-string v0, "8. Verifying any supported custom link domains."

    .line 128
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    const-string/jumbo v0, "short_url_domain"

    .line 129
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->checkIfIntentAddedForLinkDomain(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 131
    iget-object v3, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-boolean v3, v3, Lio/branch/referral/validators/BranchIntegrationModel;->appSettingsAvailable:Z

    if-nez v3, :cond_8

    const-string v0, "- Skipping. Unable to verify supported custom link domains. Failed to read the Android Manifest"

    .line 132
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    const-string p1, "Could not find intent filter to support custom link domain \'%s\'. Please add intent filter for handling custom link domain in your Android Manifest file "

    .line 134
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "https://docs.branch.io/pages/apps/android/#configure-app"

    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 140
    :cond_9
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    :goto_4
    const-string v0, "9. Verifying default link domains integrations."

    .line 147
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    const-string v0, "default_short_url_domain"

    .line 148
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->checkIfIntentAddedForLinkDomain(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_b

    .line 150
    iget-object v3, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-boolean v3, v3, Lio/branch/referral/validators/BranchIntegrationModel;->appSettingsAvailable:Z

    if-nez v3, :cond_a

    const-string v0, "- Skipping. Unable to verify default link domains. Failed to read the Android Manifest"

    .line 151
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    const-string p1, "Could not find intent filter to support Branch default link domain \'%s\'. Please add intent filter for handling custom link domain in your Android Manifest file "

    .line 153
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "https://docs.branch.io/pages/apps/android/#configure-app"

    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 158
    :cond_b
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    :goto_5
    const-string v0, "10. Verifying alternate link domains integrations."

    .line 165
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    const-string v0, "alternate_short_url_domain"

    .line 166
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 167
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-direct {p0, p1}, Lio/branch/referral/validators/IntegrationValidator;->checkIfIntentAddedForLinkDomain(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 168
    iget-object v0, p0, Lio/branch/referral/validators/IntegrationValidator;->integrationModel:Lio/branch/referral/validators/BranchIntegrationModel;

    iget-boolean v0, v0, Lio/branch/referral/validators/BranchIntegrationModel;->appSettingsAvailable:Z

    if-nez v0, :cond_c

    const-string p1, "- Skipping.Unable to verify alternate link domains. Failed to read the Android Manifest"

    .line 169
    invoke-direct {p0, p1}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    goto :goto_6

    :cond_c
    const-string v0, "Could not find intent filter to support alternate link domain \'%s\'. Please add intent filter for handling custom link domain in your Android Manifest file "

    .line 171
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "https://docs.branch.io/pages/apps/android/#configure-app"

    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 176
    :cond_d
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    .line 179
    :goto_6
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    const-string p1, "BranchSDK_Doctor"

    const-string v0, "--------------------------------------------\nSuccessfully completed Branch integration validation. Everything looks good!"

    .line 180
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "BranchSDK_Doctor"

    const-string v0, "\n         Great! Comment out the \'validateSDKIntegration\' line in your app. Next check your deep link routing.\n         Append \'?bnc_validate=true\' to any of your app\'s Branch links and click it on your mobile device (not the Simulator!) to start the test.\n         For instance, to validate a link like:\n         https://<yourapp>.app.link/NdJ6nFzRbK\n         click on:\n         https://<yourapp>.app.link/NdJ6nFzRbK?bnc_validate=true"

    .line 181
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_e
    const-string v0, "No intent found for opening the app through uri Scheme \'%s\'.Please add the intent with URI scheme to your Android manifest."

    .line 79
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "android_uri_scheme"

    .line 80
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    .line 79
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "https://docs.branch.io/pages/apps/android/#configure-app"

    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "BranchSDK_Doctor"

    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "** ERROR ** : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\nPlease follow the link for more info "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private logValidationPassed()V
    .locals 2

    const-string v0, "BranchSDK_Doctor"

    const-string v1, "Passed"

    .line 249
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private logValidationProgress(Ljava/lang/String;)V
    .locals 2

    const-string v0, "BranchSDK_Doctor"

    .line 245
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ... "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static validate(Landroid/content/Context;)V
    .locals 1

    .line 32
    sget-object v0, Lio/branch/referral/validators/IntegrationValidator;->instance:Lio/branch/referral/validators/IntegrationValidator;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lio/branch/referral/validators/IntegrationValidator;

    invoke-direct {v0, p0}, Lio/branch/referral/validators/IntegrationValidator;-><init>(Landroid/content/Context;)V

    sput-object v0, Lio/branch/referral/validators/IntegrationValidator;->instance:Lio/branch/referral/validators/IntegrationValidator;

    .line 35
    :cond_0
    sget-object v0, Lio/branch/referral/validators/IntegrationValidator;->instance:Lio/branch/referral/validators/IntegrationValidator;

    invoke-direct {v0, p0}, Lio/branch/referral/validators/IntegrationValidator;->validateSDKIntegration(Landroid/content/Context;)V

    return-void
.end method

.method private validateSDKIntegration(Landroid/content/Context;)V
    .locals 2

    const-string v0, "\n\n------------------- Initiating Branch integration verification ---------------------------"

    .line 39
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    const-string v0, "1. Verifying Branch instance creation"

    .line 41
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    .line 42
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method."

    const-string v0, "https://docs.branch.io/pages/apps/android/#load-branch"

    .line 43
    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 47
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    const-string v0, "2. Checking Branch keys"

    .line 50
    invoke-direct {p0, v0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationProgress(Ljava/lang/String;)V

    .line 51
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object v0

    invoke-static {p1}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->readBranchKey(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?."

    const-string v0, "https://docs.branch.io/pages/apps/android/#configure-app"

    .line 52
    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 56
    :cond_1
    invoke-direct {p0}, Lio/branch/referral/validators/IntegrationValidator;->logValidationPassed()V

    .line 58
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    new-instance v1, Lio/branch/referral/validators/ServerRequestGetAppConfig;

    invoke-direct {v1, p1, p0}, Lio/branch/referral/validators/ServerRequestGetAppConfig;-><init>(Landroid/content/Context;Lio/branch/referral/validators/ServerRequestGetAppConfig$IGetAppConfigEvents;)V

    invoke-virtual {v0, v1}, Lio/branch/referral/Branch;->handleNewRequest(Lio/branch/referral/ServerRequest;)V

    return-void
.end method


# virtual methods
.method public onAppConfigAvailable(Lorg/json/JSONObject;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 233
    invoke-direct {p0, p1}, Lio/branch/referral/validators/IntegrationValidator;->doValidateWithAppConfig(Lorg/json/JSONObject;)V

    goto :goto_0

    :cond_0
    const-string p1, "Unable to read Dashboard config. Please confirm that your Branch key is properly added to the manifest. Please fix your Dashboard settings."

    const-string v0, "https://branch.app.link/link-settings-page"

    .line 235
    invoke-direct {p0, p1, v0}, Lio/branch/referral/validators/IntegrationValidator;->logIntegrationError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
