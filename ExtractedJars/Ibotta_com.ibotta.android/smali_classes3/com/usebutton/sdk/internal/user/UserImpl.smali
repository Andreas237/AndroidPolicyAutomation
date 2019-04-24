.class public Lcom/usebutton/sdk/internal/user/UserImpl;
.super Ljava/lang/Object;
.source "UserImpl.java"

# interfaces
.implements Lcom/usebutton/sdk/user/User;


# static fields
.field static final USER_PROFILE_KEY:Ljava/lang/String; = "btn_default_user_profile"

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

    .line 28
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled:Z

    .line 33
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

    .line 54
    :try_start_0
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    if-nez v1, :cond_0

    .line 55
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserImpl;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;-><init>()V

    sput-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    .line 58
    :cond_0
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-nez v1, :cond_1

    if-eqz p0, :cond_1

    .line 59
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    iput-object p0, v1, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    .line 60
    sget-object p0, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->saveCachedValues()V

    .line 63
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

.method private hasProfileFieldSet(Ljava/lang/String;)Z
    .locals 5

    .line 407
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileData()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 411
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v2, -0x1

    .line 416
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "AddressDetails.PostalAddress.Country"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x9

    goto :goto_1

    :sswitch_1
    const-string v3, "ContactDetails.Emails.Email.Address"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_2
    const-string v3, "PersonalDetails.FirstName"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_3
    const-string v3, "AddressDetails.PostalAddress.Suburb"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_4
    const-string v3, "AddressDetails.PostalAddress.AddressLine2"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_5
    const-string v3, "AddressDetails.PostalAddress.AddressLine1"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_6
    const-string v3, "PersonalDetails.LastName"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :sswitch_7
    const-string v3, "ContactDetails.CellPhones.CellPhone.Number"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_8
    const-string v3, "AddressDetails.PostalAddress.AdministrativeArea"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    goto :goto_1

    :sswitch_9
    const-string v3, "AddressDetails.PostalAddress.PostalCode"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x7

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    return v1

    .line 436
    :pswitch_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1

    .line 434
    :pswitch_1
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    :cond_4
    return v1

    .line 432
    :pswitch_2
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    const/4 v1, 0x1

    :cond_5
    return v1

    .line 430
    :pswitch_3
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    const/4 v1, 0x1

    :cond_6
    return v1

    .line 428
    :pswitch_4
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    const/4 v1, 0x1

    :cond_7
    return v1

    .line 426
    :pswitch_5
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    const/4 v1, 0x1

    :cond_8
    return v1

    .line 424
    :pswitch_6
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPhoneNumber()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    const/4 v1, 0x1

    :cond_9
    return v1

    .line 422
    :pswitch_7
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    const/4 v1, 0x1

    :cond_a
    return v1

    .line 420
    :pswitch_8
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    const/4 v1, 0x1

    :cond_b
    return v1

    .line 418
    :pswitch_9
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    const/4 v1, 0x1

    :cond_c
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b0f45e3 -> :sswitch_9
        -0x63661d60 -> :sswitch_8
        -0x24d4d11a -> :sswitch_7
        0x495230d -> :sswitch_6
        0x1b65f6ae -> :sswitch_5
        0x1b65f6af -> :sswitch_4
        0x1dea826a -> :sswitch_3
        0x1ef1a60f -> :sswitch_2
        0x28976e77 -> :sswitch_1
        0x47cd9cf1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private saveCachedValues()V
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setFirstName(Ljava/lang/String;)V

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setLastName(Ljava/lang/String;)V

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 339
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setEmail(Ljava/lang/String;)V

    .line 343
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 344
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setPhoneNumber(Ljava/lang/String;)V

    .line 348
    :cond_3
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 349
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setAddressLineOne(Ljava/lang/String;)V

    .line 353
    :cond_4
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 354
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setAddressLineTwo(Ljava/lang/String;)V

    .line 358
    :cond_5
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 359
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setCity(Ljava/lang/String;)V

    .line 363
    :cond_6
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 364
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setState(Ljava/lang/String;)V

    .line 368
    :cond_7
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 369
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->setPostalCode(Ljava/lang/String;)V

    :cond_8
    return-void
.end method

.method private setJsonFieldValue(Lcom/usebutton/sdk/internal/user/UserProfile;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/user/UserProfile;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 291
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ContactDetails.Emails.Email.Address"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    goto :goto_1

    :sswitch_1
    const-string v0, "PersonalDetails.FirstName"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :sswitch_2
    const-string v0, "AddressDetails.PostalAddress.Suburb"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x6

    goto :goto_1

    :sswitch_3
    const-string v0, "AddressDetails.PostalAddress.AddressLine2"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x5

    goto :goto_1

    :sswitch_4
    const-string v0, "AddressDetails.PostalAddress.AddressLine1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "PersonalDetails.LastName"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_1

    :sswitch_6
    const-string v0, "ContactDetails.CellPhones.CellPhone.Number"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    goto :goto_1

    :sswitch_7
    const-string v0, "AddressDetails.PostalAddress.AdministrativeArea"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x7

    goto :goto_1

    :sswitch_8
    const-string v0, "AddressDetails.PostalAddress.PostalCode"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0x8

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p2, -0x1

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_2

    .line 317
    :pswitch_0
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPostalCode(Ljava/lang/String;)V

    goto :goto_2

    .line 314
    :pswitch_1
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setState(Ljava/lang/String;)V

    goto :goto_2

    .line 311
    :pswitch_2
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCity(Ljava/lang/String;)V

    goto :goto_2

    .line 308
    :pswitch_3
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineTwo(Ljava/lang/String;)V

    goto :goto_2

    .line 305
    :pswitch_4
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineOne(Ljava/lang/String;)V

    goto :goto_2

    .line 302
    :pswitch_5
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPhoneNumber(Ljava/lang/String;)V

    goto :goto_2

    .line 299
    :pswitch_6
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    goto :goto_2

    .line 296
    :pswitch_7
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    goto :goto_2

    .line 293
    :pswitch_8
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7b0f45e3 -> :sswitch_8
        -0x63661d60 -> :sswitch_7
        -0x24d4d11a -> :sswitch_6
        0x495230d -> :sswitch_5
        0x1b65f6ae -> :sswitch_4
        0x1b65f6af -> :sswitch_3
        0x1dea826a -> :sswitch_2
        0x1ef1a60f -> :sswitch_1
        0x28976e77 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static setTestInstance(Lcom/usebutton/sdk/internal/user/UserImpl;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 68
    sput-object p0, Lcom/usebutton/sdk/internal/user/UserImpl;->instance:Lcom/usebutton/sdk/internal/user/UserImpl;

    return-void
.end method

.method private updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 260
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 262
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-nez v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/user/UserImpl;->setJsonFieldValue(Lcom/usebutton/sdk/internal/user/UserProfile;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "btn_default_user_profile"

    .line 272
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 273
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 276
    :cond_2
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    goto :goto_1

    .line 274
    :cond_3
    :goto_0
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    :goto_1
    if-eqz v0, :cond_4

    move-object v1, v0

    goto :goto_2

    .line 280
    :cond_4
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    :goto_2
    invoke-direct {p0, v1, p1, p2}, Lcom/usebutton/sdk/internal/user/UserImpl;->setJsonFieldValue(Lcom/usebutton/sdk/internal/user/UserProfile;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    iget-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string p2, "btn_default_user_profile"

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->toJson()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/usebutton/sdk/internal/secure/SecureStore;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public clearCachedUserProfile()V
    .locals 1

    .line 403
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    return-void
.end method

.method public getPreConfigurationUserIdentifier()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->preConfigurationUserIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 387
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-nez v0, :cond_0

    .line 388
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    return-object v0

    :cond_0
    const-string v1, "btn_default_user_profile"

    .line 391
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 392
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 393
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    return-object v0

    .line 396
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->cachedUserProfile:Lcom/usebutton/sdk/internal/user/UserProfile;

    return-object v0
.end method

.method public hasProfileData()Z
    .locals 2

    .line 379
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    if-eqz v0, :cond_0

    const-string v1, "btn_default_user_profile"

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

    .line 98
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled:Z

    return v0
.end method

.method public saveProfileData(Ljava/util/Map;)V
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

    .line 194
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    .line 195
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    .line 197
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileData()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 198
    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string v2, "btn_default_user_profile"

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/secure/SecureStore;->retrieve(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    .line 205
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    :cond_1
    const-string v2, "PersonalDetails.FirstName"

    .line 209
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "PersonalDetails.FirstName"

    .line 210
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v2

    .line 209
    :goto_0
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    const-string v2, "PersonalDetails.LastName"

    .line 211
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "PersonalDetails.LastName"

    .line 212
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v2

    .line 211
    :goto_1
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 213
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 214
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v2

    .line 213
    :goto_2
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    const-string v2, "ContactDetails.CellPhones.CellPhone.Number"

    .line 215
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "ContactDetails.CellPhones.CellPhone.Number"

    .line 216
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    .line 215
    :goto_3
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPhoneNumber(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AddressLine1"

    .line 217
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "AddressDetails.PostalAddress.AddressLine1"

    .line 218
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v2

    .line 217
    :goto_4
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineOne(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 219
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 220
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :cond_7
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v2

    .line 219
    :goto_5
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineTwo(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.Suburb"

    .line 221
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "AddressDetails.PostalAddress.Suburb"

    .line 222
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_6

    :cond_8
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v2

    .line 221
    :goto_6
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCity(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 223
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 224
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v2

    .line 223
    :goto_7
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setState(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.PostalCode"

    .line 225
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "AddressDetails.PostalAddress.PostalCode"

    .line 226
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_8

    :cond_a
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    .line 225
    :goto_8
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPostalCode(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.Country"

    .line 227
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "AddressDetails.PostalAddress.Country"

    .line 228
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_9

    :cond_b
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object v2

    .line 227
    :goto_9
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCountry(Ljava/lang/String;)V

    const-string v2, "AddressDetails.BillingAddress.AddressLine1"

    .line 230
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const-string v2, "AddressDetails.BillingAddress.AddressLine1"

    .line 231
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_a

    .line 232
    :cond_c
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingAddressLineOne()Ljava/lang/String;

    move-result-object v2

    .line 229
    :goto_a
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingAddressLineOne(Ljava/lang/String;)V

    const-string v2, "AddressDetails.BillingAddress.AddressLine2"

    .line 234
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const-string v2, "AddressDetails.BillingAddress.AddressLine2"

    .line 235
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_b

    .line 236
    :cond_d
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingAddressLineTwo()Ljava/lang/String;

    move-result-object v2

    .line 233
    :goto_b
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingAddressLineTwo(Ljava/lang/String;)V

    const-string v2, "AddressDetails.BillingAddress.Suburb"

    .line 237
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const-string v2, "AddressDetails.BillingAddress.Suburb"

    .line 238
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_c

    :cond_e
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingCity()Ljava/lang/String;

    move-result-object v2

    .line 237
    :goto_c
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingCity(Ljava/lang/String;)V

    const-string v2, "AddressDetails.BillingAddress.AdministrativeArea"

    .line 239
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "AddressDetails.BillingAddress.AdministrativeArea"

    .line 240
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_d

    :cond_f
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingState()Ljava/lang/String;

    move-result-object v2

    .line 239
    :goto_d
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingState(Ljava/lang/String;)V

    const-string v2, "AddressDetails.BillingAddress.PostalCode"

    .line 241
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    const-string v2, "AddressDetails.BillingAddress.PostalCode"

    .line 242
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_e

    .line 243
    :cond_10
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingPostalCode()Ljava/lang/String;

    move-result-object v2

    .line 241
    :goto_e
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingPostalCode(Ljava/lang/String;)V

    const-string v2, "AddressDetails.BillingAddress.Country"

    .line 244
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    const-string v1, "AddressDetails.BillingAddress.Country"

    .line 245
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_f

    :cond_11
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingCountry()Ljava/lang/String;

    move-result-object p1

    .line 244
    :goto_f
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingCountry(Ljava/lang/String;)V

    .line 248
    iget-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->secureStore:Lcom/usebutton/sdk/internal/secure/SecureStore;

    const-string v1, "btn_default_user_profile"

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->toJson()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/usebutton/sdk/internal/secure/SecureStore;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAddressLineOne(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "AddressDetails.PostalAddress.AddressLine1"

    .line 147
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "AddressDetails.PostalAddress.AddressLine1"

    .line 151
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAddressLineTwo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "AddressDetails.PostalAddress.AddressLine2"

    .line 156
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "AddressDetails.PostalAddress.AddressLine2"

    .line 160
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAutofillEnabled(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled:Z

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "AddressDetails.PostalAddress.Suburb"

    .line 165
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "AddressDetails.PostalAddress.Suburb"

    .line 169
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "ContactDetails.Emails.Email.Address"

    .line 129
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ContactDetails.Emails.Email.Address"

    .line 133
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "PersonalDetails.FirstName"

    .line 111
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "PersonalDetails.FirstName"

    .line 115
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setIdentifier(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 85
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->setUserIdentifier(Ljava/lang/String;)V

    goto :goto_0

    .line 90
    :cond_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->preConfigurationUserIdentifier:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "PersonalDetails.LastName"

    .line 120
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "PersonalDetails.LastName"

    .line 124
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "ContactDetails.CellPhones.CellPhone.Number"

    .line 138
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ContactDetails.CellPhones.CellPhone.Number"

    .line 142
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "AddressDetails.PostalAddress.PostalCode"

    .line 183
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "AddressDetails.PostalAddress.PostalCode"

    .line 187
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setPreConfigurationUserIdentifier(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 72
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserImpl;->preConfigurationUserIdentifier:Ljava/lang/String;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 174
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileFieldSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 178
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/user/UserImpl;->updateUserProfile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
