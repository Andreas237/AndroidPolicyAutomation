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

    .line 510
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/WebViewPresenter$1;)V
    .locals 0

    .line 510
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

    .line 510
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->onResult(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onResult(Lorg/json/JSONObject;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 515
    :try_start_0
    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$200(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v2

    const-string v3, "fields"

    .line 516
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 517
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    .line 522
    :cond_0
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v4

    .line 523
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v5

    .line 524
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFullName()Ljava/lang/String;

    move-result-object v6

    .line 525
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v7

    .line 526
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPhoneNumber()Ljava/lang/String;

    move-result-object v8

    .line 527
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v9

    .line 528
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v10

    .line 529
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v11

    .line 530
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v12

    .line 531
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v13

    .line 532
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object v14

    .line 533
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingAddressLineOne()Ljava/lang/String;

    move-result-object v15

    .line 534
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingAddressLineTwo()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 535
    :try_start_1
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingCity()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    .line 536
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingState()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    .line 537
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingPostalCode()Ljava/lang/String;

    move-result-object v0

    .line 538
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingCountry()Ljava/lang/String;

    move-result-object v2

    const/16 v18, 0x0

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    const/4 v2, 0x0

    .line 540
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_12

    .line 541
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v20, v3

    const-string v3, "param"

    .line 543
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move/from16 v21, v2

    const-string v2, "PersonalDetails.FirstName"

    .line 545
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v4, :cond_1

    const-string v2, "value"

    .line 546
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_1
    const-string v2, "PersonalDetails.LastName"

    .line 547
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v5, :cond_2

    const-string v2, "value"

    .line 548
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_2
    const-string v2, "PersonalDetails.FullName"

    .line 549
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v6, :cond_3

    const-string v2, "value"

    .line 550
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_3
    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 551
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v7, :cond_4

    const-string v2, "value"

    .line 552
    invoke-virtual {v0, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_4
    const-string v2, "ContactDetails.CellPhones.CellPhone.Number"

    .line 553
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    if-eqz v8, :cond_5

    const-string v2, "value"

    .line 554
    invoke-virtual {v0, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_5
    const-string v2, "AddressDetails.PostalAddress.AddressLine1"

    .line 555
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-eqz v9, :cond_6

    const-string v2, "value"

    .line 557
    invoke-virtual {v0, v2, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_6
    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 558
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v10, :cond_7

    const-string v2, "value"

    .line 560
    invoke-virtual {v0, v2, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_7
    const-string v2, "AddressDetails.PostalAddress.Suburb"

    .line 561
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-eqz v11, :cond_8

    const-string v2, "value"

    .line 562
    invoke-virtual {v0, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_8
    const-string v2, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 563
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    if-eqz v12, :cond_9

    const-string v2, "value"

    .line 564
    invoke-virtual {v0, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_9
    const-string v2, "AddressDetails.PostalAddress.PostalCode"

    .line 565
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    if-eqz v13, :cond_a

    const-string v2, "value"

    .line 566
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_a
    const-string v2, "AddressDetails.PostalAddress.Country"

    .line 567
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v14, :cond_b

    const-string v2, "value"

    .line 568
    invoke-virtual {v0, v2, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_b
    const-string v2, "AddressDetails.BillingAddress.AddressLine1"

    .line 569
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    if-eqz v15, :cond_c

    const-string v2, "value"

    .line 571
    invoke-virtual {v0, v2, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto/16 :goto_1

    :cond_c
    const-string v2, "AddressDetails.BillingAddress.AddressLine2"

    .line 572
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    if-eqz v1, :cond_d

    const-string v2, "value"

    .line 574
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v2, v16

    move-object/from16 v3, v19

    move-object/from16 v16, v1

    goto :goto_1

    :cond_d
    const-string v2, "AddressDetails.BillingAddress.Suburb"

    .line 575
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz v16, :cond_e

    const-string v2, "value"

    move-object/from16 v3, v16

    .line 576
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v16, v1

    move-object v2, v3

    move-object/from16 v3, v19

    goto :goto_1

    :cond_e
    move-object/from16 v2, v16

    move-object/from16 v16, v1

    const-string v1, "AddressDetails.BillingAddress.AdministrativeArea"

    .line 577
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz v17, :cond_f

    const-string v1, "value"

    move-object/from16 v3, v17

    .line 578
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v17, v3

    move-object/from16 v3, v19

    goto :goto_1

    :cond_f
    const-string v1, "AddressDetails.BillingAddress.PostalCode"

    .line 579
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    if-eqz v18, :cond_10

    const-string v1, "value"

    move-object/from16 v3, v18

    .line 581
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v18, v3

    move-object/from16 v3, v19

    goto :goto_1

    :cond_10
    const-string v1, "AddressDetails.BillingAddress.Country"

    .line 582
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v19, :cond_11

    const-string v1, "value"

    move-object/from16 v3, v19

    .line 584
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_11
    move-object/from16 v3, v19

    :goto_1
    add-int/lit8 v0, v21, 0x1

    move-object/from16 v19, v3

    move-object/from16 v1, v16

    move-object/from16 v3, v20

    move-object/from16 v16, v2

    move v2, v0

    goto/16 :goto_0

    :cond_12
    move-object/from16 v20, v3

    .line 588
    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONArray;->length()I

    move-result v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_14

    move-object/from16 v0, p0

    .line 590
    :try_start_2
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->hasAutofillExtension()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 591
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getAutofillExtension()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->cacheFillFields(Lorg/json/JSONObject;)V

    goto :goto_2

    :cond_13
    move-object/from16 v2, p1

    .line 594
    :goto_2
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$400(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/WebViewController;

    if-eqz v1, :cond_15

    .line 596
    invoke-interface {v1, v2}, Lcom/usebutton/sdk/internal/WebViewController;->observeFields(Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :cond_14
    move-object/from16 v0, p0

    goto :goto_3

    :catch_0
    move-object/from16 v0, p0

    :catch_1
    :cond_15
    :goto_3
    return-void
.end method
