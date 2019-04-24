.class public Lcom/stripe/android/view/ShippingInfoWidget;
.super Landroid/widget/LinearLayout;
.source "ShippingInfoWidget.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;
    }
.end annotation


# instance fields
.field private mAddressEditText:Lcom/stripe/android/view/StripeEditText;

.field private mAddressEditText2:Lcom/stripe/android/view/StripeEditText;

.field private mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mCityEditText:Lcom/stripe/android/view/StripeEditText;

.field private mCityTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

.field private mHiddenShippingInfoFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mNameEditText:Lcom/stripe/android/view/StripeEditText;

.field private mNameTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mOptionalShippingInfoFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

.field private mPhoneNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

.field private mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mStateEditText:Lcom/stripe/android/view/StripeEditText;

.field private mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    .line 45
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    .line 70
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->initView()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/ShippingInfoWidget;)Lcom/stripe/android/view/CountryAutoCompleteTextView;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/stripe/android/view/ShippingInfoWidget;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/stripe/android/view/ShippingInfoWidget;->renderCountrySpecificLabels(Ljava/lang/String;)V

    return-void
.end method

.method private hideHiddenFields()V
    .locals 3

    .line 262
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v1, "address_line_one"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v2, "address_line_two"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    .line 268
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v2, "state"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 269
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    .line 271
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v2, "city"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    .line 274
    :cond_3
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v2, "postal_code"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 275
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    .line 277
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v2, "phone"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 278
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    :cond_5
    return-void
.end method

.method private initView()V
    .locals 2

    const/4 v0, 0x1

    .line 197
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->setOrientation(I)V

    .line 198
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$layout;->add_address_widget:I

    invoke-static {v0, v1, p0}, Lcom/stripe/android/view/ShippingInfoWidget;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 199
    sget v0, Lcom/stripe/android/R$id;->country_autocomplete_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CountryAutoCompleteTextView;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    .line 200
    sget v0, Lcom/stripe/android/R$id;->tl_address_line1_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 201
    sget v0, Lcom/stripe/android/R$id;->tl_address_line2_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 202
    sget v0, Lcom/stripe/android/R$id;->tl_city_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 203
    sget v0, Lcom/stripe/android/R$id;->tl_name_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 204
    sget v0, Lcom/stripe/android/R$id;->tl_postal_code_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 205
    sget v0, Lcom/stripe/android/R$id;->tl_state_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 206
    sget v0, Lcom/stripe/android/R$id;->et_address_line_one_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    .line 207
    sget v0, Lcom/stripe/android/R$id;->et_address_line_two_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText2:Lcom/stripe/android/view/StripeEditText;

    .line 208
    sget v0, Lcom/stripe/android/R$id;->et_city_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    .line 209
    sget v0, Lcom/stripe/android/R$id;->et_name_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    .line 210
    sget v0, Lcom/stripe/android/R$id;->et_postal_code_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    .line 211
    sget v0, Lcom/stripe/android/R$id;->et_state_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    .line 212
    sget v0, Lcom/stripe/android/R$id;->et_phone_number_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    .line 213
    sget v0, Lcom/stripe/android/R$id;->tl_phone_number_aaw:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 214
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    new-instance v1, Lcom/stripe/android/view/ShippingInfoWidget$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/ShippingInfoWidget$1;-><init>(Lcom/stripe/android/view/ShippingInfoWidget;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->setCountryChangeListener(Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;)V

    .line 221
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Landroid/telephony/PhoneNumberFormattingTextWatcher;

    invoke-direct {v1}, Landroid/telephony/PhoneNumberFormattingTextWatcher;-><init>()V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 222
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->setupErrorHandling()V

    .line 223
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderLabels()V

    .line 224
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderCountrySpecificLabels(Ljava/lang/String;)V

    return-void
.end method

.method private renderCanadianForm()V
    .locals 3

    .line 357
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "address_line_one"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 361
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 364
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_apt_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 366
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "postal_code"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 367
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_postal_code_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 370
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_postal_code:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 373
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "state"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 374
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_province_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 377
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_province:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 381
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_postal_code_invalid:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 383
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_province_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method

.method private renderCountrySpecificLabels(Ljava/lang/String;)V
    .locals 1

    .line 283
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 284
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderUSForm()V

    goto :goto_0

    .line 285
    :cond_0
    sget-object v0, Ljava/util/Locale;->UK:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderGreatBritainForm()V

    goto :goto_0

    .line 287
    :cond_1
    sget-object v0, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 288
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderCanadianForm()V

    goto :goto_0

    .line 290
    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderInternationalForm()V

    .line 293
    :goto_0
    invoke-static {p1}, Lcom/stripe/android/view/CountryUtils;->doesCountryUsePostalCode(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v0, "postal_code"

    .line 294
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 295
    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    goto :goto_1

    .line 297
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private renderGreatBritainForm()V
    .locals 3

    .line 329
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "address_line_one"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_line1_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_line1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 336
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_line2_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 338
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "postal_code"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_postcode_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 342
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_postcode:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 345
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "state"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 346
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_county_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 349
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_county:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 351
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_postcode_invalid:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_county_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method

.method private renderInternationalForm()V
    .locals 3

    .line 388
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "address_line_one"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_line1_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_line1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 395
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_line2_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 397
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "postal_code"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 398
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_zip_postal_code_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 401
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_zip_postal_code:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 404
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "state"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 405
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_region_generic_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 408
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_region_generic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 412
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_zip_postal_invalid:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_region_generic_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method

.method private renderLabels()V
    .locals 3

    .line 244
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_name:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 245
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "city"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_city_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_city:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 251
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "phone"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_phone_number_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 255
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_phone_number:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 258
    :goto_1
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->hideHiddenFields()V

    return-void
.end method

.method private renderUSForm()V
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "address_line_one"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_address:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 309
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine2TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_apt_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 311
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "postal_code"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 312
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_zip_code_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 315
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_zip_code:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 318
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v1, "state"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 319
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_state_optional:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 322
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_label_state:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 324
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_zip_invalid:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 325
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_state_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method

.method private setupErrorHandling()V
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressLine1TextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 230
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 231
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 232
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 233
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 234
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 236
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_city_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_name_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 239
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->address_phone_number_required:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getShippingInformation()Lcom/stripe/android/model/ShippingInformation;
    .locals 4

    .line 106
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->validateAllFields()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 110
    :cond_0
    new-instance v0, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v0}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Address$Builder;->setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    .line 111
    invoke-virtual {v1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Address$Builder;->setCountry(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    .line 112
    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Address$Builder;->setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText2:Lcom/stripe/android/view/StripeEditText;

    .line 113
    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Address$Builder;->setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    .line 114
    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    .line 115
    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Address$Builder;->setState(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v0

    .line 116
    new-instance v1, Lcom/stripe/android/model/ShippingInformation;

    iget-object v2, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    .line 117
    invoke-virtual {v2}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v3}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/model/ShippingInformation;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public populateShippingInfo(Lcom/stripe/android/model/ShippingInformation;)V
    .locals 3
    .param p1    # Lcom/stripe/android/model/ShippingInformation;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    .line 128
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingInformation;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 130
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 131
    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 132
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->setCountrySelected(Ljava/lang/String;)V

    .line 134
    :cond_1
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText2:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 136
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 139
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingInformation;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 140
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/ShippingInformation;->getPhone()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setHiddenFields(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 97
    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    goto :goto_0

    .line 99
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    .line 101
    :goto_0
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderLabels()V

    .line 102
    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/ShippingInfoWidget;->renderCountrySpecificLabels(Ljava/lang/String;)V

    return-void
.end method

.method public setOptionalFields(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 83
    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    goto :goto_0

    .line 85
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    .line 87
    :goto_0
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingInfoWidget;->renderLabels()V

    .line 88
    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/ShippingInfoWidget;->renderCountrySpecificLabels(Ljava/lang/String;)V

    return-void
.end method

.method public validateAllFields()Z
    .locals 9

    .line 150
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCountryAutoCompleteTextView:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object v0

    .line 151
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v3, "postal_code"

    .line 152
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v3, "postal_code"

    .line 153
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 155
    :cond_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 156
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v0}, Lcom/stripe/android/view/CountryUtils;->isUSZipCodeValid(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 158
    :cond_2
    sget-object v1, Ljava/util/Locale;->UK:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 159
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 159
    invoke-static {v0}, Lcom/stripe/android/view/CountryUtils;->isUSZipCodeValid(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 161
    :cond_3
    sget-object v1, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 162
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 162
    invoke-static {v0}, Lcom/stripe/android/view/CountryUtils;->isUSZipCodeValid(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 164
    :cond_4
    invoke-static {v0}, Lcom/stripe/android/view/CountryUtils;->doesCountryUsePostalCode(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 165
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    .line 167
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    const/4 v3, 0x0

    if-nez v0, :cond_6

    const/4 v4, 0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v1, v4}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 169
    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v4, "address_line_one"

    .line 170
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v4, "address_line_one"

    .line 171
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    .line 172
    :goto_2
    iget-object v4, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mAddressEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v4, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 174
    iget-object v4, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v4}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v5, "city"

    .line 175
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v5, "city"

    .line 176
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const/4 v4, 0x1

    goto :goto_3

    :cond_8
    const/4 v4, 0x0

    .line 177
    :goto_3
    iget-object v5, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mCityEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v5, v4}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 179
    iget-object v5, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v5}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    .line 180
    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mNameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v6, v5}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 182
    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v6}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v7, "state"

    .line 183
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    iget-object v6, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v7, "state"

    .line 184
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    const/4 v6, 0x1

    goto :goto_4

    :cond_9
    const/4 v6, 0x0

    .line 185
    :goto_4
    iget-object v7, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mStateEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v7, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 187
    iget-object v7, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_a

    iget-object v7, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mOptionalShippingInfoFields:Ljava/util/List;

    const-string v8, "phone"

    .line 188
    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    iget-object v7, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mHiddenShippingInfoFields:Ljava/util/List;

    const-string v8, "phone"

    .line 189
    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    const/4 v7, 0x1

    goto :goto_5

    :cond_a
    const/4 v7, 0x0

    .line 190
    :goto_5
    iget-object v8, p0, Lcom/stripe/android/view/ShippingInfoWidget;->mPhoneNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v8, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    if-eqz v0, :cond_b

    if-nez v1, :cond_b

    if-nez v4, :cond_b

    if-nez v6, :cond_b

    if-nez v5, :cond_b

    if-nez v7, :cond_b

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    return v2
.end method
