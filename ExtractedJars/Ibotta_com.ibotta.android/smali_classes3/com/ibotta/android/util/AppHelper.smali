.class public interface abstract Lcom/ibotta/android/util/AppHelper;
.super Ljava/lang/Object;
.source "AppHelper.java"


# static fields
.field public static final PACKAGE_NAME_TWITTER:Ljava/lang/String; = "com.twitter.android"

.field public static final PACKAGE_NAME_VENMO:Ljava/lang/String; = "com.venmo"


# virtual methods
.method public abstract calcAspectRatio(FF)F
.end method

.method public abstract copyToClipboard(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract getArrayOfInts(Ljava/util/Set;)[I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation
.end method

.method public abstract getBestImgUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
.end method

.method public abstract getColor(I)I
.end method

.method public abstract getColorStateList(Landroid/content/res/Resources;I)Landroid/content/res/ColorStateList;
.end method

.method public abstract getCurrentTime()J
.end method

.method public abstract getDeviceModel()Ljava/lang/String;
.end method

.method public abstract getDrawable(I)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getGooglePlayServicesAvailability()I
.end method

.method public abstract getHtml(Ljava/lang/String;)Landroid/text/Spanned;
.end method

.method public abstract getLargestOfferImageUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
.end method

.method public abstract getOsVersion()I
.end method

.method public varargs abstract getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param
.end method

.method public abstract getTailingDigits(II)I
.end method

.method public abstract hideSoftKeyboard(Landroid/view/View;)V
.end method

.method public abstract isAppInstalled(Ljava/lang/String;)Z
.end method

.method public abstract isComponentEnabled(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract isEmpty(Ljava/lang/String;)Z
    .annotation build Lorg/jetbrains/annotations/Contract;
        value = "null -> true"
    .end annotation
.end method

.method public abstract isGooglePlayServicesAvailable()Z
.end method

.method public abstract isOfferExpiring(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isTwitterInstalled()Z
.end method

.method public abstract isVenmoInstalled()Z
.end method

.method public abstract isWithinDays(Ljava/util/Date;I)Z
.end method

.method public abstract mapItemsToItemRows(Ljava/util/List;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ItemType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TItemType;>;I)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TItemType;>;>;"
        }
    .end annotation
.end method

.method public abstract openUriExternally(Landroid/app/Activity;Landroid/net/Uri;)V
.end method

.method public abstract openUriExternally(Landroid/app/Activity;Landroid/net/Uri;Z)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/NoSuitableIntentException;
        }
    .end annotation
.end method

.method public abstract openUrlExternally(Landroid/app/Activity;Ljava/lang/String;)V
.end method

.method public abstract parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;
.end method

.method public abstract parseUrlForQueryParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V
.end method

.method public abstract setComponentEnabled(Ljava/lang/Class;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;Z)V"
        }
    .end annotation
.end method

.method public abstract showSoftKeyboard(Landroid/view/View;)V
.end method

.method public abstract showSoftKeyboard(Landroid/view/View;I)V
.end method

.method public abstract showSoftKeyboardAsyncFocus(Landroid/view/View;)V
.end method

.method public abstract toHexColor(I)Ljava/lang/String;
.end method
