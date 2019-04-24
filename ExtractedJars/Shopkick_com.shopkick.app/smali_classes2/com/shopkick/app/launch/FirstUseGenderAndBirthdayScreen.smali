.class public Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseGenderAndBirthdayScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;,
        Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;
    }
.end annotation


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private birthdateText:Lcom/shopkick/app/widget/SKTextView;

.field private birthdayContainer:Landroid/view/View;

.field private birthdayHasBeenset:Z

.field private buttonUrl:Ljava/lang/String;

.field private c:Ljava/util/Calendar;

.field private datePicker:Landroid/widget/DatePicker;

.field private datePickerContainer:Landroid/view/View;

.field private datePickerDone:Lcom/shopkick/app/widget/UserEventTextView;

.field private femalIconImg:Landroid/widget/ImageView;

.field private femaleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

.field private flowId:Ljava/lang/String;

.field private illegalAge:Z

.field private loadingSpinner:Landroid/widget/ProgressBar;

.field private maleIconImg:Landroid/widget/ImageView;

.field private maleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

.field private nestedScrollView:Landroid/support/v4/widget/NestedScrollView;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

.field private submitButton:Lcom/shopkick/app/widget/SKButton;

.field private updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

.field private userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->scrollToDatePicker(Z)V

    return-void
.end method

.method private commitIt()V
    .locals 5

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v0}, Landroid/widget/DatePicker;->getYear()I

    move-result v0

    .line 332
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v1}, Landroid/widget/DatePicker;->getMonth()I

    move-result v1

    .line 333
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v2

    .line 334
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    const/4 v4, 0x1

    .line 335
    invoke-virtual {v3, v4, v0}, Ljava/util/Calendar;->set(II)V

    const/4 v0, 0x2

    .line 336
    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/4 v0, 0x5

    .line 337
    invoke-virtual {v3, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 338
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maybeShowUnderageMessage(Ljava/util/Date;)V

    .line 339
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->illegalAge:Z

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 341
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayContainer:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayContainer:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 344
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->saveIt()V

    :goto_0
    return-void
.end method

.method private formatDateForDisplay(III)Ljava/lang/String;
    .locals 2

    .line 353
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getLongDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    .line 355
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v1, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    .line 357
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private gotoNextScreen()V
    .locals 2

    .line 317
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 318
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->buttonUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method public static synthetic lambda$onClick$116(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;)V
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->nestedScrollView:Landroid/support/v4/widget/NestedScrollView;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/NestedScrollView;->fullScroll(I)Z

    .line 254
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayHasBeenset:Z

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$scrollToDatePicker$117(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;)V
    .locals 2

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->nestedScrollView:Landroid/support/v4/widget/NestedScrollView;

    const/16 v1, 0x82

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/NestedScrollView;->fullScroll(I)Z

    return-void
.end method

.method public static synthetic lambda$scrollToDatePicker$118(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;)V
    .locals 2

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->nestedScrollView:Landroid/support/v4/widget/NestedScrollView;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/NestedScrollView;->fullScroll(I)Z

    .line 298
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayHasBeenset:Z

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private maybeShowUnderageMessage(Ljava/util/Date;)V
    .locals 1

    .line 361
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->validateBirthday(Ljava/util/Date;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 363
    const-class p1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayUnderAgeScreen;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    const/4 p1, 0x1

    .line 364
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->illegalAge:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 366
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->illegalAge:Z

    :goto_0
    return-void
.end method

.method private saveIt()V
    .locals 4

    .line 267
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 268
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v1}, Landroid/widget/DatePicker;->getYear()I

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getMonth()I

    move-result v2

    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v3}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Calendar;->set(III)V

    .line 269
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    .line 270
    invoke-static {v0}, Lcom/shopkick/app/util/DateUtils;->dateToString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 272
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    goto :goto_0

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    .line 276
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    if-ne v0, v1, :cond_1

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    goto :goto_1

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    if-ne v0, v1, :cond_2

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    .line 281
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 282
    invoke-virtual {p0, v1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->enableSubmitButton(Z)V

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->loadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private scrollToDatePicker(Z)V
    .locals 3

    .line 288
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayHasBeenset:Z

    const-wide/16 v1, 0xc8

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_2

    .line 294
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    .line 295
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 296
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/shopkick/app/launch/-$$Lambda$FirstUseGenderAndBirthdayScreen$KYZIKFf5OloMEWdZBotYks9oQyk;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/-$$Lambda$FirstUseGenderAndBirthdayScreen$KYZIKFf5OloMEWdZBotYks9oQyk;-><init>(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;)V

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 289
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayContainer:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 290
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 291
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 p1, 0x1

    .line 292
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayHasBeenset:Z

    .line 293
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/shopkick/app/launch/-$$Lambda$FirstUseGenderAndBirthdayScreen$7dbLPHyCJbjWJn6YTE8NjplelIM;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/-$$Lambda$FirstUseGenderAndBirthdayScreen$7dbLPHyCJbjWJn6YTE8NjplelIM;-><init>(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;)V

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_1
    return-void
.end method

.method private setBirthday()V
    .locals 3

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v0}, Landroid/widget/DatePicker;->getYear()I

    move-result v0

    .line 324
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v1}, Landroid/widget/DatePicker;->getMonth()I

    move-result v1

    .line 325
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v2

    .line 326
    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->formatDateForDisplay(III)Ljava/lang/String;

    move-result-object v0

    .line 327
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdateText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private validateBirthday(Ljava/util/Date;)Z
    .locals 6

    .line 372
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 373
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 374
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 p1, 0x1

    .line 375
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x2

    .line 376
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-gt v4, v5, :cond_0

    .line 377
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

    .line 383
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

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
    .locals 9

    .line 401
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-ne p1, v0, :cond_5

    .line 402
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->loadingSpinner:Landroid/widget/ProgressBar;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 403
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    .line 404
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;

    .line 405
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v0, :cond_2

    .line 406
    invoke-virtual {p0, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->enableSubmitButton(Z)V

    const/4 p2, 0x0

    .line 409
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->birthdateMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 410
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->birthdateMessage:Ljava/lang/String;

    move-object v5, p2

    goto :goto_0

    .line 411
    :cond_0
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->genderMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 412
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->genderMessage:Ljava/lang/String;

    move-object v5, p2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    const-string v1, "Error message for saving birth date and gender."

    .line 414
    invoke-static {p1, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    move-object v5, p2

    .line 418
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const p1, 0x7f11014f

    .line 421
    invoke-virtual {p0, p1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/launch/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v8, 0x0

    .line 418
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 424
    invoke-virtual {p0, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->enableSubmitButton(Z)V

    goto :goto_2

    .line 427
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p1, :cond_3

    .line 429
    sget-object p1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$1;->$SwitchMap$com$shopkick$app$launch$FirstUseGenderAndBirthdayScreen$SelectedGender:[I

    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    invoke-virtual {p2}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 434
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->gender:Ljava/lang/Integer;

    goto :goto_1

    .line 431
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->gender:Ljava/lang/Integer;

    .line 441
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {p1}, Landroid/widget/DatePicker;->getYear()I

    move-result p1

    .line 442
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v1}, Landroid/widget/DatePicker;->getMonth()I

    move-result v1

    .line 443
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v2

    .line 444
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 445
    invoke-virtual {v3, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 446
    invoke-virtual {v3, p2, v1}, Ljava/util/Calendar;->set(II)V

    const/4 p1, 0x5

    .line 447
    invoke-virtual {v3, p1, v2}, Ljava/util/Calendar;->set(II)V

    .line 448
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/DateUtils;->dateToString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    .line 450
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    .line 452
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->gotoNextScreen()V

    goto :goto_2

    .line 455
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 456
    invoke-virtual {p0, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->enableSubmitButton(Z)V

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c00b8

    .line 102
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09027a

    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/UserEventLinearLayout;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femaleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

    .line 104
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femaleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/UserEventLinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090463

    .line 105
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/UserEventLinearLayout;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/UserEventLinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090083

    .line 107
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0901c8

    .line 108
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventTextView;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerDone:Lcom/shopkick/app/widget/UserEventTextView;

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerDone:Lcom/shopkick/app/widget/UserEventTextView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/UserEventTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090084

    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayContainer:Landroid/view/View;

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayContainer:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdateText:Lcom/shopkick/app/widget/SKTextView;

    .line 113
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdateText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090196

    .line 114
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090700

    .line 115
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    .line 116
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0904a5

    .line 117
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/v4/widget/NestedScrollView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->nestedScrollView:Landroid/support/v4/widget/NestedScrollView;

    const p2, 0x7f090279

    .line 118
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femalIconImg:Landroid/widget/ImageView;

    const p2, 0x7f090462

    .line 119
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleIconImg:Landroid/widget/ImageView;

    const p2, 0x7f0901ca

    .line 120
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/DatePicker;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    const p2, 0x7f0901cc

    .line 121
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    const p2, 0x7f090432

    .line 122
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->loadingSpinner:Landroid/widget/ProgressBar;

    .line 123
    iput-boolean p3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdayHasBeenset:Z

    .line 124
    iput-boolean p3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->illegalAge:Z

    .line 127
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    .line 128
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Ljava/util/Calendar;->get(I)I

    move-result p2

    .line 129
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    const/4 v0, 0x2

    invoke-virtual {p3, v0}, Ljava/util/Calendar;->get(I)I

    move-result p3

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 133
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 135
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePicker:Landroid/widget/DatePicker;

    add-int/lit8 p2, p2, -0x15

    invoke-virtual {v1, p2, p3, v0}, Landroid/widget/DatePicker;->updateDate(III)V

    .line 136
    invoke-direct {p0, p2, p3, v0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->formatDateForDisplay(III)Ljava/lang/String;

    move-result-object p2

    .line 137
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->birthdateText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 140
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->setupLogging()V

    return-object p1
.end method

.method protected enableSubmitButton(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 308
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 309
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 311
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 312
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_0
    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    const-string v0, "button_url"

    .line 84
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->buttonUrl:Ljava/lang/String;

    .line 85
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 86
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 87
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 88
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 203
    sget-object v0, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    const/4 v1, 0x1

    new-array v2, v1, [F

    const v3, 0x3f95d97f    # 1.1707f

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-static {v0, v2}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v0

    .line 204
    sget-object v2, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    new-array v5, v1, [F

    aput v3, v5, v4

    invoke-static {v2, v5}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v3, 0x0

    const v5, 0x7f08033b

    const/high16 v6, 0x3f800000    # 1.0f

    const-wide/16 v7, 0x64

    const/4 v9, 0x2

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 207
    :sswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->commitIt()V

    goto/16 :goto_0

    .line 226
    :sswitch_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v10, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    if-ne p1, v10, :cond_0

    goto/16 :goto_0

    .line 228
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v10, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    if-ne p1, v10, :cond_1

    .line 229
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femalIconImg:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femalIconImg:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 232
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleIconImg:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleIconImg:Landroid/widget/ImageView;

    new-array v3, v9, [Landroid/animation/PropertyValuesHolder;

    aput-object v0, v3, v4

    aput-object v2, v3, v1

    invoke-static {p1, v3}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 234
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;

    invoke-direct {v0, p0, v4}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;-><init>(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;Z)V

    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 235
    invoke-virtual {p1, v9}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 236
    invoke-virtual {p1, v9}, Landroid/animation/ObjectAnimator;->setRepeatMode(I)V

    .line 237
    invoke-virtual {p1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 238
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 239
    sget-object p1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    goto/16 :goto_0

    .line 210
    :sswitch_2
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v10, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    if-ne p1, v10, :cond_2

    goto/16 :goto_0

    .line 212
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v10, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    if-ne p1, v10, :cond_3

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleIconImg:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleIconImg:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 216
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femalIconImg:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 217
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femalIconImg:Landroid/widget/ImageView;

    new-array v3, v9, [Landroid/animation/PropertyValuesHolder;

    aput-object v0, v3, v4

    aput-object v2, v3, v1

    invoke-static {p1, v3}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 218
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;

    invoke-direct {v0, p0, v4}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$GenderAnimationListener;-><init>(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;Z)V

    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 219
    invoke-virtual {p1, v9}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 220
    invoke-virtual {p1, v9}, Landroid/animation/ObjectAnimator;->setRepeatMode(I)V

    .line 221
    invoke-virtual {p1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 222
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 223
    sget-object p1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->selectedGender:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    goto :goto_0

    .line 246
    :sswitch_3
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->setBirthday()V

    .line 247
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->commitIt()V

    goto :goto_0

    .line 250
    :sswitch_4
    iget-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->illegalAge:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_4

    .line 251
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerContainer:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 252
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/shopkick/app/launch/-$$Lambda$FirstUseGenderAndBirthdayScreen$rHU3lrPKPVboNRzyJL3ZXarwprI;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/-$$Lambda$FirstUseGenderAndBirthdayScreen$rHU3lrPKPVboNRzyJL3ZXarwprI;-><init>(Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 258
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->setBirthday()V

    goto :goto_0

    .line 243
    :sswitch_5
    invoke-direct {p0, v1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->scrollToDatePicker(Z)V

    :cond_4
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f090083 -> :sswitch_5
        0x7f090084 -> :sswitch_5
        0x7f090196 -> :sswitch_4
        0x7f0901c8 -> :sswitch_3
        0x7f09027a -> :sswitch_2
        0x7f090463 -> :sswitch_1
        0x7f090700 -> :sswitch_0
    .end sparse-switch
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method protected setupLogging()V
    .locals 5

    .line 157
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x147

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 158
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->maleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v4, 0x0

    invoke-virtual {v1, v0, v3, v4}, Lcom/shopkick/app/widget/UserEventLinearLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 161
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x146

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->femaleView:Lcom/shopkick/app/widget/UserEventLinearLayout;

    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v3, v4}, Lcom/shopkick/app/widget/UserEventLinearLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 165
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 166
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->datePickerDone:Lcom/shopkick/app/widget/UserEventTextView;

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v2, v4}, Lcom/shopkick/app/widget/UserEventTextView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 167
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v2, v4}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 93
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->flowId:Ljava/lang/String;

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->flowId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;->flowId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
