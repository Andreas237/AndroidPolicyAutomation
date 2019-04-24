.class public Lcom/shopkick/app/application/SKUrlTranslator;
.super Ljava/lang/Object;
.source "SKUrlTranslator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getActivityForSKUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_15

    if-eqz p1, :cond_15

    if-nez p2, :cond_0

    goto/16 :goto_7

    .line 53
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/application/SKUrlTranslator;->getRedirectScreenKeyForDeprecatedScreen(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 56
    invoke-static {}, Lcom/shopkick/app/activities/ActivityInfo;->getInstance()Lcom/shopkick/app/activities/ActivityInfo;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/ActivityInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 61
    :cond_1
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 62
    const-class v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    if-eq p1, v0, :cond_14

    const-class v0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;

    if-ne p1, v0, :cond_2

    goto/16 :goto_6

    .line 64
    :cond_2
    const-class v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    if-eq p1, v0, :cond_13

    const-class v0, Lcom/shopkick/app/rewards/RewardsMallScreen;

    if-ne p1, v0, :cond_3

    goto/16 :goto_5

    .line 66
    :cond_3
    const-class v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    if-eq p1, v0, :cond_12

    const-class v0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    if-eq p1, v0, :cond_12

    const-class v0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    if-ne p1, v0, :cond_4

    goto/16 :goto_4

    .line 69
    :cond_4
    const-class v0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;

    if-eq p1, v0, :cond_11

    const-class v0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;

    if-eq p1, v0, :cond_11

    const-class v0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptDetailsScreen;

    if-ne p1, v0, :cond_5

    goto/16 :goto_3

    .line 72
    :cond_5
    const-class v0, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    if-eq p1, v0, :cond_10

    const-class v0, Lcom/shopkick/app/registration/RegistrationV3Screen;

    if-eq p1, v0, :cond_10

    const-class v0, Lcom/shopkick/app/account/ResetPasswordScreen;

    if-ne p1, v0, :cond_6

    goto :goto_2

    .line 78
    :cond_6
    const-class v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eq p1, v0, :cond_f

    const-class v0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    if-eq p1, v0, :cond_f

    const-class v0, Lcom/shopkick/app/store/EarnScreen;

    if-eq p1, v0, :cond_f

    const-class v0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    if-ne p1, v0, :cond_7

    goto :goto_1

    .line 83
    :cond_7
    invoke-static {p3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isProductSelectorItemCheckHeaderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p3

    if-eqz p3, :cond_8

    const-class p3, Lcom/shopkick/app/webview/WebViewScreen;

    if-ne p1, p3, :cond_8

    const-class p1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    if-ne p2, p1, :cond_8

    return-object p2

    :cond_8
    const/4 p1, -0x1

    .line 89
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p3

    const v0, 0x2dc2cc

    if-eq p3, v0, :cond_a

    const v0, 0x3305b9

    if-eq p3, v0, :cond_9

    goto :goto_0

    :cond_9
    const-string p3, "main"

    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    const/4 p1, 0x1

    goto :goto_0

    :cond_a
    const-string p3, "anon"

    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    const/4 p1, 0x0

    :cond_b
    :goto_0
    packed-switch p1, :pswitch_data_0

    .line 106
    const-class p0, Lcom/shopkick/app/activities/DetailsActivity;

    return-object p0

    .line 101
    :pswitch_0
    const-class p0, Lcom/shopkick/app/activities/HomeActivity;

    if-ne p2, p0, :cond_c

    .line 102
    const-class p0, Lcom/shopkick/app/activities/DetailsActivity;

    return-object p0

    :cond_c
    return-object p2

    .line 91
    :pswitch_1
    const-class p0, Lcom/shopkick/app/activities/BncActivity;

    if-ne p2, p0, :cond_d

    .line 94
    const-class p0, Lcom/shopkick/app/activities/BncActivity;

    return-object p0

    .line 95
    :cond_d
    const-class p0, Lcom/shopkick/app/activities/RewardActivity;

    if-ne p2, p0, :cond_e

    .line 96
    const-class p0, Lcom/shopkick/app/activities/RewardActivity;

    return-object p0

    .line 98
    :cond_e
    const-class p0, Lcom/shopkick/app/activities/DetailsActivity;

    return-object p0

    .line 80
    :cond_f
    :goto_1
    const-class p0, Lcom/shopkick/app/activities/HomeActivity;

    return-object p0

    .line 74
    :cond_10
    :goto_2
    const-class p0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    return-object p0

    .line 71
    :cond_11
    :goto_3
    const-class p0, Lcom/shopkick/app/activities/KicksActivity;

    return-object p0

    .line 68
    :cond_12
    :goto_4
    const-class p0, Lcom/shopkick/app/activities/ReceiptScanActivity;

    return-object p0

    .line 65
    :cond_13
    :goto_5
    const-class p0, Lcom/shopkick/app/activities/RewardActivity;

    return-object p0

    .line 63
    :cond_14
    :goto_6
    const-class p0, Lcom/shopkick/app/activities/BncActivity;

    return-object p0

    :cond_15
    :goto_7
    const/4 p0, 0x0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static getRedirectScreenKeyForDeprecatedScreen(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, -0x1

    .line 142
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x352bdc4e    # -6951385.0f

    if-eq v1, v2, :cond_3

    const v2, 0x6969f41

    if-eq v1, v2, :cond_2

    const v2, 0x36ed0a3c

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string/jumbo v1, "store_feed"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    const-string/jumbo v1, "today"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const-string/jumbo v1, "stores"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x0

    :cond_4
    :goto_0
    packed-switch v0, :pswitch_data_0

    return-object p0

    .line 150
    :pswitch_0
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p0

    const-class v0, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/screens/ScreenInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 146
    :pswitch_1
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p0

    const-class v0, Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/screens/ScreenInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getScreenForSKUrl(Ljava/lang/String;Ljava/util/Map;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation

    .line 123
    invoke-static {p0}, Lcom/shopkick/app/application/SKUrlTranslator;->getRedirectScreenKeyForDeprecatedScreen(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 124
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    .line 125
    const-class p2, Lcom/shopkick/app/lookbooks/LookbookScreen;

    if-ne p0, p2, :cond_0

    const-string/jumbo p2, "use_horizontal_screen"

    .line 126
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 127
    const-class p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;

    return-object p0

    :cond_0
    return-object p0
.end method
