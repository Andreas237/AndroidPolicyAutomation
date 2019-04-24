.class public Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "GenericCardEnrollmentScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/view/animation/Animation$AnimationListener;
.implements Landroid/view/View$OnFocusChangeListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;,
        Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;
    }
.end annotation


# static fields
.field private static final ANIMATE_PERCENTAGE:D = 0.56

.field private static final DATE_ZIP_HEIGHT:I = 0x37

.field private static final LINK_DESC_WIDTH:I = 0x122


# instance fields
.field acceptedTerms:Z

.field alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field animateAfterFetch:Z

.field animationEndCardOffset:I

.field animationEndDateZipOffset:I

.field animationFullWidth:I

.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

.field billingZip:Landroid/widget/EditText;

.field billingZipWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

.field blueDrawable:Landroid/graphics/drawable/Drawable;

.field buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field canProceed:Z

.field cardDescWithLock:Landroid/widget/RelativeLayout;

.field cardEntryField:Landroid/widget/RelativeLayout;

.field cardErrorText:Landroid/widget/TextView;

.field cardHolderConsentText:Landroid/widget/TextView;

.field cardNum:Landroid/widget/EditText;

.field cardWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

.field certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

.field checkMarkImage:Landroid/widget/ImageView;

.field clickListener:Landroid/view/View$OnClickListener;

.field clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field dateZipSection:Landroid/widget/RelativeLayout;

.field descTextSection:Landroid/widget/RelativeLayout;

.field errorVisible:Z

.field expMonth:Landroid/widget/EditText;

.field expMonthWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

.field expSeparator:Landroid/widget/TextView;

.field expYear:Landroid/widget/EditText;

.field expYearWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

.field grayDrawable:Landroid/graphics/drawable/Drawable;

.field handler:Landroid/os/Handler;

.field inFromLeft:Landroid/view/animation/TranslateAnimation;

.field inFromLeftText:Landroid/view/animation/TranslateAnimation;

.field inFromRight:Landroid/view/animation/TranslateAnimation;

.field inFromRightText:Landroid/view/animation/TranslateAnimation;

.field private isLoadingCertificates:Z

.field keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

.field linkButton:Landroid/widget/Button;

.field linkDescView:Landroid/widget/ScrollView;

.field nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

.field needToShiftCardLeft:Z

.field needToShiftDateRight:Z

.field notifCenter:Lcom/shopkick/app/util/NotificationCenter;

.field outOnLeft:Landroid/view/animation/TranslateAnimation;

.field outOnLeftText:Landroid/view/animation/TranslateAnimation;

.field outOnRight:Landroid/view/animation/TranslateAnimation;

.field outOnRightText:Landroid/view/animation/TranslateAnimation;

.field private programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

.field private programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

.field progress:Landroid/widget/ProgressBar;

.field private shiftDateZipSectionIn:Ljava/lang/Runnable;

.field private shiftDateZipSectionOut:Ljava/lang/Runnable;

.field termsText:Landroid/widget/TextView;

.field touchListener:Landroid/view/View$OnTouchListener;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field userAcct:Lcom/shopkick/app/account/UserAccount;

.field private waitingOnCertificates:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 111
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->errorVisible:Z

    .line 112
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->acceptedTerms:Z

    const/4 v1, 0x1

    .line 138
    iput-boolean v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftCardLeft:Z

    .line 139
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftDateRight:Z

    .line 140
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->canProceed:Z

    .line 141
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animateAfterFetch:Z

    .line 143
    iput v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    .line 144
    iput v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndDateZipOffset:I

    .line 145
    iput v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    .line 286
    new-instance v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->touchListener:Landroid/view/View$OnTouchListener;

    .line 299
    new-instance v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clickListener:Landroid/view/View$OnClickListener;

    .line 444
    new-instance v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$3;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->shiftDateZipSectionOut:Ljava/lang/Runnable;

    .line 456
    new-instance v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$4;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->shiftDateZipSectionIn:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)Z
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->formIsValid(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)Z
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkCardValidity(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->maybeMoveFocusToExpMonthAfterFetch()V

    return-void
.end method

.method static synthetic access$1300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Z
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->enableLinkButtonIfFormValid()Z

    move-result p0

    return p0
.end method

.method static synthetic access$1400(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$1500(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Z)Z
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->waitingOnCertificates:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->loadCertificates()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)I
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getProgramIdFromPan(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result p0

    return p0
.end method

.method private buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;
    .locals 1

    .line 255
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const/4 p1, 0x0

    .line 256
    invoke-virtual {v0, p1}, Landroid/view/animation/TranslateAnimation;->setFillEnabled(Z)V

    const-wide/16 p1, 0x1f4

    .line 257
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 258
    invoke-virtual {v0, p0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method private checkCardValidity(Ljava/lang/String;)Z
    .locals 3

    .line 532
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x10

    if-eq v0, v2, :cond_0

    return v1

    .line 535
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->isLuhnValidPan(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getProgramIdFromPan(Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private checkDateAndZipValidity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 539
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    const/4 v0, 0x5

    if-eq p3, v0, :cond_0

    goto :goto_1

    .line 543
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 544
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 545
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p3

    const/4 v0, 0x1

    .line 546
    invoke-virtual {p3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/lit16 v3, v3, -0x7d0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 547
    invoke-virtual {p3, v2}, Ljava/util/Calendar;->get(I)I

    move-result p3

    add-int/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 552
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v2, v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v4, 0xc

    if-gt v2, v4, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lt v2, v4, :cond_1

    if-ne p2, v3, :cond_2

    .line 553
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-lt p1, p2, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    :cond_2
    :goto_0
    return v0

    :catch_0
    return v1

    :cond_3
    :goto_1
    return v1
.end method

.method private enableLinkButtonIfFormValid()Z
    .locals 3

    .line 755
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 756
    invoke-direct {p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->formIsValid(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 757
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 758
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 759
    iget-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->acceptedTerms:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 760
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 761
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->blueDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 762
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    const v2, 0x7f06015d

    invoke-virtual {p0, v2}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResourceColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method private encryptForMasterCard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 410
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-static {p1}, Lorg/bouncycastle/util/encoders/Base64;->decode([B)[B

    move-result-object p1

    const-string v0, "X.509"

    .line 411
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    .line 416
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 417
    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 418
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    const-string v0, "RSA/ECB/OAEPWithSHA1AndMGF1Padding"

    .line 421
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x1

    .line 422
    invoke-virtual {v0, v1, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 423
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 424
    new-instance p2, Ljava/lang/String;

    invoke-static {p1}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 438
    const-class p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 436
    const-class p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception p1

    .line 434
    const-class p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_3
    move-exception p1

    .line 432
    const-class p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_4
    move-exception p1

    .line 430
    const-class p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_5
    move-exception p1

    .line 428
    const-class p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private encryptPan(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    .line 403
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->encryptForMasterCard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private enrollPan(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    if-eqz v0, :cond_0

    return-void

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 356
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    .line 357
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getProgramIdFromPan(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->loyaltyProgramId:Ljava/lang/Integer;

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, p4, p1, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->encryptPan(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p4

    iput-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->encryptedPan:Ljava/lang/String;

    .line 359
    iget-object p4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p4, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->panLastFour:Ljava/lang/String;

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->expirationDate:Ljava/lang/String;

    .line 361
    iput-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->zipCode:Ljava/lang/String;

    .line 363
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2, p1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private formIsValid(Ljava/lang/String;)Z
    .locals 2

    if-eqz p1, :cond_1

    .line 475
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 478
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkCardValidity(Ljava/lang/String;)Z

    .line 481
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    .line 482
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    .line 483
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 481
    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkDateAndZipValidity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private getMasterCardCertCacheKey()Ljava/lang/String;
    .locals 5

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->mastercardCertificateChain:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 377
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 378
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->certificateTokens:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const/4 v3, 0x0

    .line 379
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 380
    iget-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private getMasterCardCertId()Ljava/lang/String;
    .locals 2

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->mastercardCertificateChain:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 369
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 370
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private getProgramIdFromPan(Ljava/lang/String;)I
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 511
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x10

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "4"

    .line 514
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p1, 0x8

    return p1

    :cond_1
    const/4 v1, 0x2

    const/4 v2, 0x1

    .line 519
    :try_start_0
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const-string v3, "5"

    .line 520
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    if-lt v1, v2, :cond_2

    const/4 p1, 0x5

    if-gt v1, p1, :cond_2

    const/16 p1, 0xa

    return p1

    :cond_2
    return v0

    :catch_0
    return v0

    :cond_3
    :goto_0
    return v0
.end method

.method private isLuhnValidPan(Ljava/lang/String;)Z
    .locals 8

    .line 493
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v5, v1

    move v3, v2

    move v4, v3

    :goto_0
    if-ltz v0, :cond_1

    .line 494
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    add-int/lit8 v6, v0, 0x1

    .line 496
    :try_start_0
    invoke-virtual {p1, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_0

    .line 501
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v3, v6

    goto :goto_1

    .line 503
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    div-int/lit8 v7, v7, 0x5

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    rem-int/lit8 v6, v6, 0xa

    add-int/2addr v7, v6

    add-int/2addr v4, v7

    :goto_1
    xor-int/lit8 v5, v5, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :catch_0
    return v2

    :cond_1
    add-int/2addr v3, v4

    .line 507
    rem-int/lit8 v3, v3, 0xa

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1
.end method

.method private loadCertificates()V
    .locals 3

    .line 388
    iget-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->isLoadingCertificates:Z

    if-eqz v0, :cond_0

    return-void

    .line 393
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getMasterCardCertId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 395
    iput-boolean v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->isLoadingCertificates:Z

    .line 396
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "certificate fetch successful"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 397
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "certificate fetch failed"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 398
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/certificates/CertificatesManager;->requestCertificateWithId(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private maybeMoveFocusToExpMonthAfterFetch()V
    .locals 5

    .line 560
    iget-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->canProceed:Z

    if-eqz v0, :cond_2

    .line 561
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 562
    invoke-direct {p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getProgramIdFromPan(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 563
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollInMastercardProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 565
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherMastercardCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 566
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0x37

    iget-object v3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardEntryField:Landroid/widget/RelativeLayout;

    .line 567
    invoke-static {v2, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    const/4 v3, -0x2

    invoke-direct {v0, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 568
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 569
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardEntryField:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v4, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 570
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0x122

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->descTextSection:Landroid/widget/RelativeLayout;

    .line 571
    invoke-static {v2, v4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 573
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 574
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->descTextSection:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 575
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->setCardholderConsentString()V

    .line 576
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 577
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    goto :goto_0

    .line 579
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    const v1, 0x7f11008b

    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    goto :goto_0

    .line 582
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    const v1, 0x7f110142

    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    .line 584
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    .line 586
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animateAfterFetch:Z

    .line 587
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private setCardholderConsentString()V
    .locals 3

    .line 896
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-eqz v0, :cond_0

    .line 897
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 898
    invoke-direct {p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getProgramIdFromPan(Ljava/lang/String;)I

    move-result v0

    .line 899
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardHolderConsentText:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    invoke-static {v2, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->getCardholderConsent(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 9

    .line 780
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    .line 781
    iput-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz p2, :cond_0

    .line 782
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 783
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 784
    iput-boolean v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->canProceed:Z

    .line 785
    iget-boolean p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animateAfterFetch:Z

    if-eqz p1, :cond_5

    .line 786
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->maybeMoveFocusToExpMonthAfterFetch()V

    const/4 p1, 0x0

    .line 787
    iput-boolean p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animateAfterFetch:Z

    goto/16 :goto_1

    .line 790
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->getMessageForResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p1

    .line 791
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 793
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    if-ne p1, v0, :cond_5

    .line 794
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 795
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_4

    .line 796
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollResponse;

    .line 797
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_3

    .line 798
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/account/UserAccount;->setBuyAndCollectEnrolled(Z)V

    .line 799
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccount;->setLoyaltyProgramEnrolled(I)Z

    .line 800
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 801
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "loyalty_program_id"

    .line 802
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;->loyaltyProgramId:Ljava/lang/Integer;

    .line 803
    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->toString(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v0

    .line 802
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-eqz p2, :cond_2

    const-string v0, "debit_card_url"

    .line 805
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->debitCardHelpWebviewUrl:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "num_previous_cards"

    .line 807
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 808
    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->numMastercardCards(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 807
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v3

    sget-object p2, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v6

    const/16 p2, 0xfa5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 812
    const-class p2, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 814
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 817
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 819
    :goto_0
    iput-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    :cond_5
    :goto_1
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const p3, 0x7f0c0058

    const/4 v0, 0x0

    .line 177
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x0

    const v0, 0x7f0c0055

    .line 178
    invoke-virtual {p1, v0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    const v0, 0x7f0c0054

    .line 179
    invoke-virtual {p1, v0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->touchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 181
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    const v0, 0x7f090195

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardHolderConsentText:Landroid/widget/TextView;

    .line 182
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    const v0, 0x7f090101

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkMarkImage:Landroid/widget/ImageView;

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkMarkImage:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    const v0, 0x7f090734

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->termsText:Landroid/widget/TextView;

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->termsText:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    const v0, 0x7f09041b

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    .line 187
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f09054a

    .line 189
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const p1, 0x7f0900cb

    .line 191
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardEntryField:Landroid/widget/RelativeLayout;

    const p1, 0x7f0901e5

    .line 192
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->descTextSection:Landroid/widget/RelativeLayout;

    .line 193
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->descTextSection:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->touchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const p1, 0x7f0900ce

    .line 194
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    .line 195
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    const v0, 0x7f090260

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    .line 196
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    const v0, 0x7f090261

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expSeparator:Landroid/widget/TextView;

    .line 197
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    const v0, 0x7f090262

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    const v0, 0x7f090082

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    const p1, 0x7f0900c9

    .line 199
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    const p1, 0x7f0900cc

    .line 200
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardErrorText:Landroid/widget/TextView;

    .line 203
    new-instance p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Landroid/widget/EditText;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 205
    new-instance p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Landroid/widget/EditText;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonthWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonthWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 207
    new-instance p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Landroid/widget/EditText;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYearWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYearWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 209
    new-instance p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Landroid/widget/EditText;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZipWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZipWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 214
    new-instance p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-direct {p1, p0, p3}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    .line 216
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    .line 217
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    int-to-double v0, p1

    const-wide v2, 0x3fe1eb851eb851ecL    # 0.56

    mul-double/2addr v0, v2

    double-to-int p3, v0

    iput p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    .line 218
    iget p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    sub-int p3, p1, p3

    iput p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndDateZipOffset:I

    int-to-float p1, p1

    .line 219
    iget p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndDateZipOffset:I

    int-to-float p3, p3

    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromRight:Landroid/view/animation/TranslateAnimation;

    .line 220
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    neg-int p1, p1

    int-to-float p1, p1

    invoke-direct {p0, v0, p1, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnLeft:Landroid/view/animation/TranslateAnimation;

    .line 221
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    int-to-float p1, p1

    invoke-direct {p0, v0, p1, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromLeft:Landroid/view/animation/TranslateAnimation;

    .line 222
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    int-to-float p1, p1

    invoke-direct {p0, v0, p1, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnRight:Landroid/view/animation/TranslateAnimation;

    .line 224
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    int-to-float p1, p1

    invoke-direct {p0, p1, v0, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromRightText:Landroid/view/animation/TranslateAnimation;

    .line 225
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    neg-int p1, p1

    int-to-float p1, p1

    invoke-direct {p0, v0, p1, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnLeftText:Landroid/view/animation/TranslateAnimation;

    .line 226
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    neg-int p1, p1

    int-to-float p1, p1

    invoke-direct {p0, p1, v0, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromLeftText:Landroid/view/animation/TranslateAnimation;

    .line 227
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationFullWidth:I

    int-to-float p1, p1

    invoke-direct {p0, v0, p1, v0, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buildAnimation(FFFF)Landroid/view/animation/TranslateAnimation;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnRightText:Landroid/view/animation/TranslateAnimation;

    .line 229
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f080188

    invoke-static {p1, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 230
    iget-object p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->createButtonDrawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->grayDrawable:Landroid/graphics/drawable/Drawable;

    .line 231
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f080096

    invoke-static {p1, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 232
    iget-object p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->createButtonDrawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->blueDrawable:Landroid/graphics/drawable/Drawable;

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object p3, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->grayDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 238
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->loadCertificates()V

    return-object p2
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
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

    .line 159
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 160
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 161
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 162
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 163
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->certificatesManager:Lcom/shopkick/app/fetchers/certificates/CertificatesManager;

    .line 164
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 165
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 166
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 167
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    .line 168
    new-instance p2, Lcom/shopkick/app/bnc/BCDialogsController;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    invoke-direct {p2, p0, v0, v1, p1}, Lcom/shopkick/app/bnc/BCDialogsController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/controllers/PhoneVerificationController;)V

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 825
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromRight:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 826
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->clearAnimation()V

    .line 827
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 828
    iget v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndDateZipOffset:I

    invoke-virtual {v0, v2, v1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 829
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 830
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 832
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnLeft:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_1

    .line 833
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearAnimation()V

    .line 834
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 835
    iget v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->animationEndCardOffset:I

    neg-int v2, v2

    invoke-virtual {v0, v2, v1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 836
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 838
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromLeft:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_2

    .line 839
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearAnimation()V

    .line 840
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 841
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 842
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 844
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnRight:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_3

    .line 845
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->clearAnimation()V

    .line 846
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardEntryField:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->dateZipSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 848
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromRightText:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_4

    .line 849
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->clearAnimation()V

    .line 850
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 851
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 852
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {v2, v0}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 854
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnLeftText:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_5

    .line 855
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->clearAnimation()V

    .line 856
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 858
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->inFromLeftText:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_6

    .line 859
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->clearAnimation()V

    .line 860
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 861
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 862
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 864
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->outOnRightText:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_7

    .line 865
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {p1}, Landroid/widget/ScrollView;->clearAnimation()V

    .line 866
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->descTextSection:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_7
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz v0, :cond_0

    .line 265
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 267
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    .line 268
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    if-eqz v1, :cond_1

    .line 269
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 271
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->nativeEnrollReq:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectNativeEnrollRequest;

    .line 272
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 273
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonthWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYearWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 275
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZipWatcher:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->shiftDateZipSectionIn:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 277
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->shiftDateZipSectionOut:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 278
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v1, :cond_2

    .line 279
    invoke-virtual {v1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 280
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 282
    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 283
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
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

    const-string v0, "certificate fetch successful"

    const v1, 0x7f110087

    const/4 v2, 0x0

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_1

    .line 907
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getMasterCardCertCacheKey()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 909
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/Certificate;

    .line 910
    iget-boolean p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->waitingOnCertificates:Z

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    .line 911
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/Certificate;->b64Certificate:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 912
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 913
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 914
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 916
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Certificate;->b64Certificate:Ljava/lang/String;

    invoke-direct {p0, p2, v0, v1, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->enrollPan(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 917
    iput-boolean v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->waitingOnCertificates:Z

    goto :goto_0

    .line 919
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 924
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "certificate fetch successful"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 925
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "certificate fetch failed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 926
    iput-boolean v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->isLoadingCertificates:Z

    goto :goto_1

    :cond_2
    const-string p2, "certificate fetch failed"

    if-ne p1, p2, :cond_3

    .line 928
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "certificate fetch successful"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 929
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "certificate fetch failed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 930
    iput-boolean v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->isLoadingCertificates:Z

    .line 932
    iget-boolean p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->waitingOnCertificates:Z

    if-eqz p1, :cond_3

    .line 933
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_3
    :goto_1
    return-void
.end method

.method public onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .line 880
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_1

    .line 881
    iget-boolean p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftCardLeft:Z

    if-eqz p1, :cond_1

    .line 882
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->shiftDateZipSectionIn:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 883
    iput-boolean v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftDateRight:Z

    .line 884
    iput-boolean v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftCardLeft:Z

    goto :goto_0

    .line 886
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    .line 887
    iget-boolean p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftDateRight:Z

    if-eqz p1, :cond_1

    .line 888
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->shiftDateZipSectionOut:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 889
    iput-boolean v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftCardLeft:Z

    .line 890
    iput-boolean v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftDateRight:Z

    :cond_1
    :goto_0
    return-void
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    invoke-virtual {v0}, Lcom/shopkick/app/bnc/BCDialogsController;->handlingRegistrationOrVerification()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-nez v0, :cond_1

    .line 248
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->programsListRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 250
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->showKeyboard()V

    :cond_1
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
