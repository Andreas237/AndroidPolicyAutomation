.class public Lcom/usebutton/sdk/internal/user/UserImpl;
.super Ljava/lang/Object;
.source "UserImpl.java"

# interfaces
.implements Lcom/usebutton/sdk/user/User;


# static fields
.field static final PERSONAL_USER_PROFILE_KEY:Ljava/lang/String; = "btn_personal_user_profile"

.field static final PUBLISHER_USER_PROFILE_KEY:Ljava/lang/String; = "btn_user_profile"

.field static instance:Lcom/usebutton/sdk/internal/user/UserImpl;


# instance fields
.field private cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private isAutofillEnabled:Z

.field private preConfigurationUserIdentifier:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled:Z

    .line 38
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    return-void
.end method

.method public static declared-synchronized getInstance(Lcom/usebutton/sdk/internal/secure/SecureStore;)Lcom/usebutton/sdk/internal/user/UserImpl;
    .locals 2
    .param p0    # Lcom/usebutton/sdk/internal/secure/SecureStore;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-class v0, Lcom/usebutton/sdk/internal/user/UserImpl;

    monitor-enter v0

    .line 59
    :try_start_0
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    if-nez v1, :cond_0

    .line 60
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserImpl;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;-><init>()V

    sput-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    .line 63
    :cond_0
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-nez v1, :cond_1

    if-eqz p0, :cond_1

    .line 64
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    iput-object p0, v1, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    .line 65
    sget-object p0, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->saveCachedValues()V

    .line 68
    :cond_1
    sget-object p0, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private saveCachedValues()V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setFirstName(Ljava/lang/String;)V

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 274
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setLastName(Ljava/lang/String;)V

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setEmail(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private setJsonFieldValue(Lcom/usebutton/sdk/internal/user/UserProfile;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/user/UserProfile;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 249
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x9987146

    if-eq v0, v1, :cond_2

    const v1, 0x5c24b9c

    if-eq v0, v1, :cond_1

    const v1, 0x77fdce94

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "last_name"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "email"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "first_name"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p2, -0x1

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_2

    .line 257
    :pswitch_0
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    goto :goto_2

    .line 254
    :pswitch_1
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    goto :goto_2

    .line 251
    :pswitch_2
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static setTestInstance(Lcom/usebutton/sdk/internal/user/UserImpl;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 73
    sput-object p0, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    return-void
.end method

.method private updateUserProfile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 220
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-nez v0, :cond_0

    .line 223
    iget-object p2, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {p0, p2, p1, p3}, Lcom/usebutton/sdk/internal/user/UserImpl;->setJsonFieldValue(Lcom/usebutton/sdk/internal/user/UserProfile;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 230
    :cond_0
    invoke-virtual {v0, p2}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 234
    :cond_1
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    goto :goto_1

    .line 232
    :cond_2
    :goto_0
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    :goto_1
    if-eqz v0, :cond_3

    move-object v1, v0

    goto :goto_2

    .line 238
    :cond_3
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    :goto_2
    invoke-direct {p0, v1, p1, p3}, Lcom/usebutton/sdk/internal/user/UserImpl;->setJsonFieldValue(Lcom/usebutton/sdk/internal/user/UserProfile;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    iget-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->toJson()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/usebutton/sdk/internal/secure/SecureStore;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getEmail()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 195
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    if-nez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 200
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 169
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    if-nez v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 174
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 182
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    if-nez v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 187
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPreConfigurationUserIdentifier()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->preConfigurationUserIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 306
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "btn_personal_user_profile"

    .line 311
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 312
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 313
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    return-object v0

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string v2, "btn_user_profile"

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 318
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 319
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v1
.end method

.method public hasPersonalData()Z
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-eqz v0, :cond_0

    const-string v1, "btn_personal_user_profile"

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/secure/SecureStore;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasPublisherData()Z
    .locals 2

    .line 298
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-eqz v0, :cond_0

    const-string v1, "btn_user_profile"

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/secure/SecureStore;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isAutofillEnabled()Z
    .locals 1

    .line 207
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled:Z

    return v0
.end method

.method public savePersonalData(Ljava/util/Map;)V
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 135
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    .line 136
    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string v2, "btn_personal_user_profile"

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/secure/SecureStore;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string v2, "btn_personal_user_profile"

    .line 137
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    :goto_0
    const-string v2, "PersonalDetails.FirstName"

    .line 141
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "PersonalDetails.FirstName"

    .line 142
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v2

    .line 141
    :goto_1
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    const-string v2, "PersonalDetails.LastName"

    .line 143
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "PersonalDetails.LastName"

    .line 144
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v2

    .line 143
    :goto_2
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 145
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 146
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v2

    .line 145
    :goto_3
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AddressLine1"

    .line 147
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "AddressDetails.PostalAddress.AddressLine1"

    .line 148
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v2

    .line 147
    :goto_4
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineOne(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 149
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 150
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v2

    .line 149
    :goto_5
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineTwo(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.Suburb"

    .line 151
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "AddressDetails.PostalAddress.Suburb"

    .line 152
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v2

    .line 151
    :goto_6
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCity(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 153
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 154
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v2

    .line 153
    :goto_7
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setState(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.PostalCode"

    .line 155
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "AddressDetails.PostalAddress.PostalCode"

    .line 156
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    .line 155
    :goto_8
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPostalCode(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.Country"

    .line 157
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v1, "AddressDetails.PostalAddress.Country"

    .line 158
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object p1

    .line 157
    :goto_9
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCountry(Ljava/lang/String;)V

    .line 161
    iget-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string v1, "btn_personal_user_profile"

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->toJson()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/usebutton/sdk/internal/secure/SecureStore;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAutofillEnabled(Z)V
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled:Z

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "email"

    const-string v1, "btn_user_profile"

    .line 128
    invoke-direct {p0, v0, v1, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "first_name"

    const-string v1, "btn_user_profile"

    .line 112
    invoke-direct {p0, v0, v1, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setIdentifier(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 90
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->setUserIdentifier(Ljava/lang/String;)V

    goto :goto_0

    .line 95
    :cond_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->preConfigurationUserIdentifier:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "last_name"

    const-string v1, "btn_user_profile"

    .line 120
    invoke-direct {p0, v0, v1, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setPreConfigurationUserIdentifier(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 77
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->preConfigurationUserIdentifier:Ljava/lang/String;

    return-void
.end method
