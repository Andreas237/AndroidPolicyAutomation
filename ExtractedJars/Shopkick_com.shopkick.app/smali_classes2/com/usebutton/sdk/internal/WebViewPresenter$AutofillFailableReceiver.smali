.class Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;
.super Ljava/lang/Object;
.source "WebViewPresenter.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/WebViewPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AutofillFailableReceiver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;)V
    .locals 0

    .line 559
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/WebViewPresenter$1;)V
    .locals 0

    .line 559
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;)V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 0

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 559
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->onResult(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onResult(Lorg/json/JSONObject;)V
    .locals 14

    .line 564
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$200(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasPersonalData()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$200(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    .line 565
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasPublisherData()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "fields"

    .line 569
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 570
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$200(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v1

    .line 572
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v2

    .line 573
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v3

    .line 574
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v4

    .line 575
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v5

    .line 576
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v6

    .line 577
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v7

    .line 578
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v8

    .line 579
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v9

    .line 580
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    .line 582
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-ge v10, v11, :cond_a

    .line 583
    invoke-virtual {v0, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    const-string v12, "param"

    .line 585
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "PersonalDetails.FirstName"

    .line 587
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    if-eqz v2, :cond_1

    const-string/jumbo v13, "value"

    .line 588
    invoke-virtual {v11, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v13, "PersonalDetails.LastName"

    .line 591
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    if-eqz v3, :cond_2

    const-string/jumbo v13, "value"

    .line 592
    invoke-virtual {v11, v13, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v13, "ContactDetails.Emails.Email.Address"

    .line 595
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    if-eqz v4, :cond_3

    const-string/jumbo v13, "value"

    .line 596
    invoke-virtual {v11, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v13, "AddressDetails.PostalAddress.AddressLine1"

    .line 599
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    if-eqz v5, :cond_4

    const-string/jumbo v13, "value"

    .line 600
    invoke-virtual {v11, v13, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    const-string v13, "AddressDetails.PostalAddress.AddressLine2"

    .line 603
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    if-eqz v6, :cond_5

    const-string/jumbo v13, "value"

    .line 604
    invoke-virtual {v11, v13, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    const-string v13, "AddressDetails.PostalAddress.Suburb"

    .line 607
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    if-eqz v7, :cond_6

    const-string/jumbo v13, "value"

    .line 608
    invoke-virtual {v11, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    const-string v13, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 611
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    if-eqz v8, :cond_7

    const-string/jumbo v13, "value"

    .line 612
    invoke-virtual {v11, v13, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    const-string v13, "AddressDetails.PostalAddress.PostalCode"

    .line 615
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    if-eqz v9, :cond_8

    const-string/jumbo v13, "value"

    .line 616
    invoke-virtual {v11, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    const-string v13, "AddressDetails.PostalAddress.Country"

    .line 619
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    if-eqz v1, :cond_9

    const-string/jumbo v12, "value"

    .line 620
    invoke-virtual {v11, v12, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 624
    :cond_a
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-eqz v0, :cond_c

    .line 626
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->hasAutofillExtension()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 627
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getAutofillExtension()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->cacheFillFields(Lorg/json/JSONObject;)V

    .line 630
    :cond_b
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$400(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-eqz v0, :cond_c

    .line 632
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/WebViewController;->observeFields(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    return-void
.end method
