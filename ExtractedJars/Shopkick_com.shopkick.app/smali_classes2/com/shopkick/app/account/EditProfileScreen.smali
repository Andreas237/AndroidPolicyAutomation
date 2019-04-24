.class public Lcom/shopkick/app/account/EditProfileScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "EditProfileScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final FEMALE:I = 0x2

.field public static final MALE:I = 0x1

.field private static final PHOTO_SIZE_DIP:I = 0x1e

.field public static final RATHER_NOT_SAY:I


# instance fields
.field alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field birthdateChanged:Z

.field birthdateText:Landroid/widget/EditText;

.field private bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

.field buttonTapped:Z

.field c:Ljava/util/Calendar;

.field clickListener:Landroid/view/View$OnClickListener;

.field datePickerDialog:Landroid/app/DatePickerDialog;

.field dateSetListener:Landroid/app/DatePickerDialog$OnDateSetListener;

.field dismissListener:Landroid/content/DialogInterface$OnDismissListener;

.field editingName:Z

.field firstNameText:Landroid/widget/EditText;

.field genderSpinner:Landroid/widget/Spinner;

.field private genderStringArray:[Ljava/lang/String;

.field lastNameText:Landroid/widget/EditText;

.field notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field profilePhoto:Landroid/widget/ImageView;

.field private profilePhotoTarget:Lcom/bumptech/glide/request/FutureTarget;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/request/FutureTarget<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

.field saveButton:Lcom/shopkick/app/widget/SKButton;

.field savingProfileDialog:Landroid/app/ProgressDialog;

.field selectionListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private textWatcher:Landroid/text/TextWatcher;

.field underLegalAge:Z

.field updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

.field userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 101
    iput-boolean v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateChanged:Z

    .line 102
    iput-boolean v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->underLegalAge:Z

    .line 263
    new-instance v0, Lcom/shopkick/app/account/EditProfileScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/EditProfileScreen$3;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->textWatcher:Landroid/text/TextWatcher;

    .line 290
    new-instance v0, Lcom/shopkick/app/account/EditProfileScreen$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/EditProfileScreen$4;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->clickListener:Landroid/view/View$OnClickListener;

    .line 334
    new-instance v0, Lcom/shopkick/app/account/EditProfileScreen$5;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/EditProfileScreen$5;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->dismissListener:Landroid/content/DialogInterface$OnDismissListener;

    .line 344
    new-instance v0, Lcom/shopkick/app/account/EditProfileScreen$6;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/EditProfileScreen$6;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->dateSetListener:Landroid/app/DatePickerDialog$OnDateSetListener;

    .line 367
    new-instance v0, Lcom/shopkick/app/account/EditProfileScreen$7;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/EditProfileScreen$7;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->selectionListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/application/dialog/DialogsManager;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/shopkick/app/account/EditProfileScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/EditProfileScreen;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/shopkick/app/account/EditProfileScreen;->updateSaveButton()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/EditProfileScreen;III)Ljava/lang/String;
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/account/EditProfileScreen;->formatDateForDisplay(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/account/EditProfileScreen;Ljava/util/Date;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/EditProfileScreen;->maybeShowUnderageMessage(Ljava/util/Date;)V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/graphics/BitmapHelpers;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/shopkick/app/account/EditProfileScreen;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    return-object p0
.end method

.method private didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 561
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 562
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v2, 0x1

    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    .line 569
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method private fillView()V
    .locals 6

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 439
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 440
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 442
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 443
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setFocusable(Z)V

    .line 444
    iget-boolean v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->underLegalAge:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 446
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 447
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setClickable(Z)V

    goto :goto_0

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 454
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->thumbnailPhotoUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->thumbnailPhotoUrl:Ljava/lang/String;

    .line 455
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0x1e

    .line 457
    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhoto:Landroid/widget/ImageView;

    invoke-static {v0, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    .line 458
    new-instance v3, Lcom/shopkick/app/account/EditProfileScreen$8;

    invoke-direct {v3, p0}, Lcom/shopkick/app/account/EditProfileScreen$8;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    .line 469
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/support/v4/app/Fragment;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v5, v5, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->thumbnailPhotoUrl:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    invoke-virtual {v3, v0, v0}, Lcom/shopkick/app/util/GlideRequest;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhotoTarget:Lcom/bumptech/glide/request/FutureTarget;

    .line 473
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/account/EditProfileScreen;->setNameButtonFromProfileResponse()V

    .line 477
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_2

    .line 478
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->gender:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v1, 0x2

    goto :goto_2

    :pswitch_1
    move v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v2

    .line 492
    :goto_2
    :pswitch_2
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 495
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    .line 496
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 497
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 500
    invoke-static {}, Ljava/text/SimpleDateFormat;->getDateInstance()Ljava/text/DateFormat;

    move-result-object v1

    .line 501
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 502
    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 505
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f11027d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private formatDateForDisplay(III)Ljava/lang/String;
    .locals 2

    .line 577
    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getLongDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    .line 579
    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v1, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    .line 581
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private hasValidChanges()Z
    .locals 5

    .line 525
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 533
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->firstName:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v2, v2, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    invoke-direct {p0, v0, v2}, Lcom/shopkick/app/account/EditProfileScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->lastName:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v3, v3, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    .line 534
    invoke-direct {p0, v0, v3}, Lcom/shopkick/app/account/EditProfileScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    .line 538
    :goto_1
    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    if-eqz v3, :cond_3

    .line 539
    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v4, v4, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->gender:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v3, v4, :cond_3

    move v0, v2

    .line 544
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 545
    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v4, v4, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/shopkick/app/account/EditProfileScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 546
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 547
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/EditProfileScreen;->validateBirthday(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 549
    iput-boolean v2, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateChanged:Z

    move v0, v2

    goto :goto_2

    .line 552
    :cond_4
    iput-boolean v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateChanged:Z

    move v0, v1

    :cond_5
    :goto_2
    return v0
.end method

.method public static synthetic lambda$setupProfilePhotoContextMenu$11(Lcom/shopkick/app/account/EditProfileScreen;Landroid/view/MenuItem$OnMenuItemClickListener;Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .line 166
    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/support/v4/app/FragmentActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p3

    const p4, 0x7f0d0001

    .line 167
    invoke-virtual {p3, p4, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 168
    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getContext()Landroid/content/Context;

    move-result-object p3

    const p4, 0x7f110512

    invoke-virtual {p3, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    const/4 p3, 0x0

    .line 169
    :goto_0
    invoke-interface {p2}, Landroid/view/ContextMenu;->size()I

    move-result p4

    if-ge p3, p4, :cond_0

    .line 170
    invoke-interface {p2, p3}, Landroid/view/ContextMenu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p4

    .line 171
    invoke-interface {p4, p1}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic lambda$setupProfilePhotoContextMenu$12(Landroid/view/View;)V
    .locals 0

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->showContextMenu()Z

    return-void
.end method

.method private maybeShowUnderageMessage(Ljava/util/Date;)V
    .locals 3

    .line 406
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/EditProfileScreen;->validateBirthday(Ljava/util/Date;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 408
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const-string v0, ""

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f110326

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    const/4 p1, 0x1

    .line 411
    iput-boolean p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->underLegalAge:Z

    .line 412
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setClickable(Z)V

    .line 413
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 414
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 415
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    :cond_0
    return-void
.end method

.method private setNameButtonFromProfileResponse()V
    .locals 3

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    const v1, 0x7f110184

    const v2, 0x7f110182

    if-eqz v0, :cond_2

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v2, v2, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setHint(I)V

    .line 426
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 427
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, v1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 429
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    goto :goto_1

    .line 432
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setHint(I)V

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    :goto_1
    return-void
.end method

.method private setupProfilePhotoContextMenu(Landroid/widget/ImageView;)V
    .locals 2

    .line 127
    new-instance v0, Lcom/shopkick/app/account/EditProfileScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/EditProfileScreen$1;-><init>(Lcom/shopkick/app/account/EditProfileScreen;)V

    .line 148
    new-instance v1, Lcom/shopkick/app/account/EditProfileScreen$2;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/account/EditProfileScreen$2;-><init>(Lcom/shopkick/app/account/EditProfileScreen;Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;)V

    .line 165
    new-instance v0, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;-><init>(Lcom/shopkick/app/account/EditProfileScreen;Landroid/view/MenuItem$OnMenuItemClickListener;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 174
    sget-object v0, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$Thisug_Qh4vHo7BIpZREcqF0iKQ;->INSTANCE:Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$Thisug_Qh4vHo7BIpZREcqF0iKQ;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private updateSaveButton()V
    .locals 3

    .line 511
    invoke-direct {p0}, Lcom/shopkick/app/account/EditProfileScreen;->hasValidChanges()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 513
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080096

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 515
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 516
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080097

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method private validateBirthday(Ljava/util/Date;)Z
    .locals 6

    .line 387
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 388
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 389
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 p1, 0x1

    .line 390
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x2

    .line 391
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-gt v4, v5, :cond_0

    .line 392
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v4, v3, :cond_1

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    :cond_1
    const/16 v0, 0x10

    .line 398
    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_2

    const/16 v0, 0xd

    :cond_2
    if-lt v2, v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 8

    .line 632
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-ne p1, v0, :cond_7

    .line 633
    iget-boolean p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 634
    iput-boolean v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    .line 636
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->savingProfileDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 637
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_6

    .line 638
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;

    .line 639
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_1

    .line 641
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->firstName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccount;->setFirstName(Ljava/lang/String;)V

    .line 642
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->lastName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccount;->setLastName(Ljava/lang/String;)V

    .line 643
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 644
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    .line 645
    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->popScreen()V

    goto :goto_1

    .line 646
    :cond_1
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_7

    const/4 p2, 0x0

    .line 649
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->birthdateMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 650
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->birthdateMessage:Ljava/lang/String;

    move-object v4, p2

    goto :goto_0

    .line 651
    :cond_2
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->genderMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 652
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->genderMessage:Ljava/lang/String;

    move-object v4, p2

    goto :goto_0

    .line 653
    :cond_3
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->firstNameMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 654
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->firstNameMessage:Ljava/lang/String;

    move-object v4, p2

    goto :goto_0

    .line 655
    :cond_4
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->lastNameMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 656
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->lastNameMessage:Ljava/lang/String;

    move-object v4, p2

    goto :goto_0

    :cond_5
    const-string p1, "There is error message for first name, last name, birthday or gender."

    .line 658
    invoke-static {v0, p1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    move-object v4, p2

    .line 662
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const p1, 0x7f11014f

    .line 665
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/shopkick/app/account/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/account/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v7, 0x0

    .line 662
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_1

    .line 670
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const/4 p3, 0x0

    const v0, 0x7f0c00a9

    .line 180
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const p2, 0x7f11027e

    .line 181
    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/EditProfileScreen;->setAppScreenTitle(I)V

    .line 182
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x103012b

    invoke-virtual {p2, v0}, Landroid/content/Context;->setTheme(I)V

    const p2, 0x7f090231

    .line 183
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhoto:Landroid/widget/ImageView;

    .line 184
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhoto:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080245

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    const/16 v2, 0x1e

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/graphics/BitmapHelpers;->getRoundBitmapWithBorder(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 186
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhoto:Landroid/widget/ImageView;

    invoke-direct {p0, p2}, Lcom/shopkick/app/account/EditProfileScreen;->setupProfilePhotoContextMenu(Landroid/widget/ImageView;)V

    const p2, 0x7f09022e

    .line 188
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    .line 189
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->textWatcher:Landroid/text/TextWatcher;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 190
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setEnabled(Z)V

    const p2, 0x7f090230

    .line 192
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    .line 193
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->textWatcher:Landroid/text/TextWatcher;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 194
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setEnabled(Z)V

    const p2, 0x7f09022c

    .line 196
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    .line 197
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 199
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setFocusable(Z)V

    const p2, 0x7f09022f

    .line 201
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Spinner;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    .line 202
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->selectionListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {p2, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 203
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    invoke-virtual {p2, p3}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 204
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    invoke-virtual {p2, p3}, Landroid/widget/Spinner;->setFocusable(Z)V

    const/4 p2, 0x3

    .line 205
    new-array p2, p2, [Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderStringArray:[Ljava/lang/String;

    .line 206
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderStringArray:[Ljava/lang/String;

    const v0, 0x7f11027b

    invoke-virtual {p0, v0}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p2, p3

    .line 207
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderStringArray:[Ljava/lang/String;

    const v0, 0x7f110279

    invoke-virtual {p0, v0}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p2, v1

    .line 208
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderStringArray:[Ljava/lang/String;

    const v0, 0x7f110278

    invoke-virtual {p0, v0}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, p2, v2

    .line 209
    new-instance p2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderStringArray:[Ljava/lang/String;

    const v4, 0x7f0c00a8

    invoke-direct {p2, v0, v4, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const v0, 0x1090009

    .line 212
    invoke-virtual {p2, v0}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->genderSpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, p2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 215
    iput-boolean p3, p0, Lcom/shopkick/app/account/EditProfileScreen;->underLegalAge:Z

    const p2, 0x7f090232

    .line 216
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    .line 217
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/account/EditProfileScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 220
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0xa9

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 221
    new-instance p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 222
    iput-boolean v1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 223
    iput-boolean v1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressActionUntilManuallyTriggered:Z

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p2, v3, p3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 227
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    .line 228
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    add-int/lit8 p2, p2, -0x15

    .line 229
    iget-object p3, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p3, v2}, Ljava/util/Calendar;->get(I)I

    move-result p3

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 232
    iget-object v4, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v4, v4, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v4, v4, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v4, v4, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    .line 233
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 234
    iget-object v4, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v4, v4, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {v4}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 236
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide p2

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v0, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 238
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    .line 239
    iget-object p3, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p3, v2}, Ljava/util/Calendar;->get(I)I

    move-result p3

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    move v4, p2

    move v5, p3

    move v6, v0

    goto :goto_0

    :cond_0
    move v4, p2

    move v5, p3

    move v6, v0

    .line 244
    :goto_0
    new-instance p2, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen;->dateSetListener:Landroid/app/DatePickerDialog$OnDateSetListener;

    move-object v1, p2

    invoke-direct/range {v1 .. v6}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    .line 245
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lcom/shopkick/app/account/EditProfileScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/app/DatePickerDialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 246
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    iget-object p3, p0, Lcom/shopkick/app/account/EditProfileScreen;->dismissListener:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p2, p3}, Landroid/app/DatePickerDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 249
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    .line 250
    iget-object p3, p0, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {p3}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object p3

    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 253
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 255
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p2, p2, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-nez p2, :cond_1

    .line 256
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    goto :goto_1

    .line 258
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/account/EditProfileScreen;->fillView()V

    :goto_1
    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 112
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 113
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 114
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 115
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 116
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    .line 117
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 118
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePictureHelperFactory:Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    .line 119
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfileInfoUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfilePhotoUpdateSuccessEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountInfoUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 586
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-eqz v0, :cond_0

    .line 587
    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 589
    iput-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 590
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 591
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhotoTarget:Lcom/bumptech/glide/request/FutureTarget;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 592
    invoke-interface {v0, v1}, Lcom/bumptech/glide/request/FutureTarget;->cancel(Z)Z

    .line 594
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "ProfileInfoUpdatedEvent"

    if-ne p1, p2, :cond_0

    .line 680
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {p1}, Landroid/app/DatePickerDialog;->hide()V

    .line 681
    invoke-direct {p0}, Lcom/shopkick/app/account/EditProfileScreen;->fillView()V

    goto :goto_0

    :cond_0
    const-string p2, "ProfilePhotoUpdateSuccessEvent"

    if-ne p1, p2, :cond_1

    .line 684
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/ProfileInfo;->getCachedThumbnailPhoto()Landroid/graphics/Bitmap;

    move-result-object p1

    .line 685
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p2, p2, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    .line 686
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen;->profilePhoto:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->bitmapHelpers:Lcom/shopkick/app/graphics/BitmapHelpers;

    const/16 v1, 0x1e

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/graphics/BitmapHelpers;->getRoundBitmapWithBorder(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_1
    const-string p2, "UserAccountIdChangedEvent"

    :cond_2
    :goto_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 599
    iget-boolean v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 600
    iput-boolean v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    .line 602
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->editingName:Z

    if-eqz v0, :cond_7

    .line 603
    iput-boolean v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->editingName:Z

    .line 605
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-nez v0, :cond_1

    goto :goto_2

    .line 608
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->firstName:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->firstName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 609
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 610
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 611
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, v1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 613
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->lastName:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->lastName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 614
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 615
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 616
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, v1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 618
    :cond_5
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/account/EditProfileScreen;->updateSaveButton()V

    goto :goto_3

    :cond_6
    :goto_2
    return-void

    :cond_7
    :goto_3
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
