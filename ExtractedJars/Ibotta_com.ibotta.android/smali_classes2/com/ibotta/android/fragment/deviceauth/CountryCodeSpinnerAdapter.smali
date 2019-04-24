.class public Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "CountryCodeSpinnerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter<",
        "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c01f2

    .line 21
    invoke-direct {p0, p1, v0, p2}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method private buildDropDownLabel(Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 41
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->instantiateView(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->getItemViewType(I)I

    move-result p3

    invoke-virtual {p0, p3, p2}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;

    move-result-object p3

    .line 43
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 45
    check-cast p3, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;

    .line 46
    invoke-static {p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->access$100(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 47
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    .line 49
    invoke-static {p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->access$100(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->buildDropDownLabel(Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0701e3

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701e8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 53
    invoke-static {p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->access$100(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1, p1, v1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 54
    invoke-static {p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->access$100(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p2
.end method

.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 1

    .line 26
    new-instance p1, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;-><init>(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$1;)V

    .line 27
    check-cast p2, Landroid/widget/TextView;

    invoke-static {p1, p2}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->access$102(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    return-object p1
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)V
    .locals 0

    .line 33
    check-cast p3, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;

    .line 34
    invoke-static {p3}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->access$100(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p4}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;->getCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p4, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)V

    return-void
.end method
