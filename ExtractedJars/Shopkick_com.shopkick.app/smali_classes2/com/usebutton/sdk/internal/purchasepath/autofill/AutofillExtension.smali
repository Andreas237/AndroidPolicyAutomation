.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
.super Ljava/lang/Object;
.source "AutofillExtension.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
.implements Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;
.implements Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;
    }
.end annotation


# static fields
.field static final AUTOFILL_CARD_KEY:Ljava/lang/String; = "btn_autofill_card_key"
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field static final AUTOFILL_SAVE_CARD_KEY:Ljava/lang/String; = "btn_autofill_save_card_key"
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "AutofillExtension"


# instance fields
.field private final autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

.field private final autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

.field private final buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

.field private final context:Landroid/content/Context;

.field private fillFields:Lorg/json/JSONObject;

.field private final handler:Landroid/os/Handler;

.field private final listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

.field private saveFieldsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;Lcom/usebutton/sdk/internal/ButtonRepository;Landroid/os/Handler;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    .line 81
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->context:Landroid/content/Context;

    .line 82
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 83
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 84
    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    .line 85
    iput-object p5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->handler:Landroid/os/Handler;

    .line 86
    iput-object p6, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    return-object p0
.end method

.method private createShippingAddress()Ljava/lang/String;
    .locals 7
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 371
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v1, "AddressDetails.PostalAddress.AddressLine1"

    .line 372
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v1, "AddressDetails.PostalAddress.AddressLine1"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 374
    :goto_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 375
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string v1, ""

    .line 377
    :goto_1
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v3, "AddressDetails.PostalAddress.Suburb"

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v3, "AddressDetails.PostalAddress.Suburb"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_2

    :cond_2
    const-string v2, ""

    .line 379
    :goto_2
    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v4, "AddressDetails.PostalAddress.AdministrativeArea"

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v4, "AddressDetails.PostalAddress.AdministrativeArea"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_3

    :cond_3
    const-string v3, ""

    .line 381
    :goto_3
    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v5, "AddressDetails.PostalAddress.PostalCode"

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    const-string v5, "AddressDetails.PostalAddress.PostalCode"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_4

    :cond_4
    const-string v4, ""

    :goto_4
    const-string v5, "line.separator"

    .line 385
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 388
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    .line 389
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 392
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_6

    .line 393
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 396
    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_7

    .line 397
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 401
    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v5, ""

    :cond_8
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private displayAutofillSaveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 12

    .line 245
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v6

    if-eqz v6, :cond_8

    const-string v0, "btn_autofill_save_card_key"

    .line 246
    invoke-interface {v6, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v0, "PersonalDetails.FirstName"

    .line 248
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "PersonalDetails.LastName"

    .line 249
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 250
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 252
    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getPrimaryColor()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v3

    .line 253
    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->context:Landroid/content/Context;

    sget v5, Lcom/usebutton/sdk/R$color;->btn_black:I

    invoke-static {v4, v5}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    const-string v5, "%s %s"

    const/4 v7, 0x2

    .line 254
    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, ""

    :goto_0
    aput-object v0, v7, v8

    const/4 v0, 0x1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    aput-object v1, v7, v0

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 256
    new-instance v1, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    .line 257
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, ""

    :goto_2
    invoke-direct {v0, v4, v2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    .line 258
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->createShippingAddress()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    .line 261
    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasPersonalData()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 262
    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 263
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getUpdateTitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    goto :goto_3

    :cond_4
    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 264
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getTitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    :goto_3
    if-eqz v5, :cond_5

    .line 265
    iget-object v7, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 266
    invoke-virtual {v7}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getUpdateSubtitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v7

    goto :goto_4

    :cond_5
    iget-object v7, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 267
    invoke-virtual {v7}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getSubtitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v7

    :goto_4
    if-eqz v5, :cond_6

    .line 268
    iget-object v8, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 269
    invoke-virtual {v8}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getUpdatePrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v8

    goto :goto_5

    :cond_6
    iget-object v8, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 270
    invoke-virtual {v8}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getPrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v8

    :goto_5
    if-eqz v5, :cond_7

    .line 271
    iget-object v9, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 272
    invoke-virtual {v9}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getUpdateSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v9

    goto :goto_6

    :cond_7
    iget-object v9, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 273
    invoke-virtual {v9}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v9

    .line 276
    :goto_6
    new-instance v10, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    iget-object v11, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->context:Landroid/content/Context;

    invoke-direct {v10, v11, v5, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;-><init>(Landroid/content/Context;ZLcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;)V

    .line 277
    invoke-virtual {v10, v3}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setPrimaryColor(I)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v3

    .line 278
    invoke-virtual {v3, v4}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setDisplayTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v3

    .line 279
    invoke-virtual {v3, v7}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setDisplaySubTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v3

    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 280
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getNameLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setNameSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v3

    .line 281
    invoke-virtual {v3, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setName(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v1

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 282
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getEmailLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setEmailSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v1

    .line 283
    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setEmail(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 284
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getAddressLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setShippingAddressSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v0

    .line 285
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setShippingAddress(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    .line 286
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->getCardCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setCtaLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v0

    .line 287
    invoke-virtual {v0, v8}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setSaveButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v0

    .line 288
    invoke-virtual {v0, v9}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->setDeclineButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;

    move-result-object v0

    .line 289
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->build()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

    move-result-object v3

    const-string v0, "btn_autofill_save_card_key"

    .line 291
    invoke-virtual {v3, v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->setKey(Ljava/lang/Object;)V

    .line 292
    new-instance v7, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;

    move-object v0, v7

    move-object v1, p0

    move-object v2, v6

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$4;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Z)V

    invoke-direct {p0, v6, p1, v7}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->insertAutofillCard(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Ljava/lang/Runnable;)V

    return-void

    :cond_8
    :goto_7
    return-void
.end method

.method private getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 341
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private insertAutofillCard(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Ljava/lang/Runnable;)V
    .locals 2

    .line 353
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/CardList;->getCards()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    .line 354
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->handler:Landroid/os/Handler;

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 358
    :cond_0
    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    .line 361
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->handler:Landroid/os/Handler;

    const-wide/16 v0, 0x190

    invoke-virtual {p1, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private isAutofillProfileDataDifferent()Z
    .locals 3

    .line 315
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v0

    .line 318
    new-instance v1, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    const-string v2, "PersonalDetails.FirstName"

    .line 319
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    const-string v2, "PersonalDetails.LastName"

    .line 320
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    const-string v2, "ContactDetails.Emails.Email.Address"

    .line 321
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AddressLine1"

    .line 322
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineOne(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AddressLine2"

    .line 323
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineTwo(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.Suburb"

    .line 324
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCity(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 325
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setState(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.PostalCode"

    .line 326
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPostalCode(Ljava/lang/String;)V

    const-string v2, "AddressDetails.PostalAddress.Country"

    .line 327
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->getFieldsMapValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCountry(Ljava/lang/String;)V

    .line 330
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public cacheFillFields(Lorg/json/JSONObject;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->fillFields:Lorg/json/JSONObject;

    return-void
.end method

.method public cacheSaveFields(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    :try_start_0
    const-string v0, "fields"

    .line 188
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    .line 190
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 191
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "param"

    .line 193
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "value"

    .line 194
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 196
    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 199
    :catch_0
    sget-object p1, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->TAG:Ljava/lang/String;

    const-string v0, "Error parsing saveFields json"

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public displayAutofillFillCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 9

    .line 208
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "btn_autofill_card_key"

    .line 210
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object v1

    if-nez v1, :cond_4

    .line 211
    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v1

    .line 213
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getFirstName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getFirstName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    .line 214
    :goto_0
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getLastName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getLastName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const-string v3, ""

    .line 215
    :goto_1
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getEmail()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getEmail()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const-string v1, ""

    .line 217
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    .line 219
    :cond_3
    new-instance v4, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->context:Landroid/content/Context;

    const-string v6, "%s %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    const/4 v2, 0x1

    aput-object v3, v7, v2

    .line 221
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v5, v2, v1, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;)V

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 224
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getPrimaryColor()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setPrimaryColor(I)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 225
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getTitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 226
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getNameLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setNameSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 227
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getEmailLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setEmailSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 228
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getCardCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setCtaLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 229
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getPrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setAcceptButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 230
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setDeclineButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    .line 231
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->build()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    move-result-object v1

    const-string v2, "btn_autofill_card_key"

    .line 233
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->setKey(Ljava/lang/Object;)V

    .line 234
    new-instance v2, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;

    invoke-direct {v2, p0, v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$3;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)V

    invoke-direct {p0, v0, p1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->insertAutofillCard(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Ljava/lang/Runnable;)V

    :cond_4
    return-void
.end method

.method public hideAutofillCards(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 4

    const-string v0, "btn_autofill_card_key"

    .line 157
    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object v0

    const-wide/16 v1, 0x12c

    if-eqz v0, :cond_0

    .line 158
    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    .line 160
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->handler:Landroid/os/Handler;

    new-instance v3, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$1;

    invoke-direct {v3, p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$1;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    const-string v0, "btn_autofill_save_card_key"

    .line 168
    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 169
    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    .line 171
    iget-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$2;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$2;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;Lcom/usebutton/sdk/purchasepath/CardList;)V

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public onAutofillFillAccepted()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->fillFields:Lorg/json/JSONObject;

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillFillAccepted(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onAutofillFillDeclined()V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillFillDeclined()V

    return-void
.end method

.method public onAutofillSaveAccepted()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillSaveAccepted(Ljava/util/Map;)V

    .line 133
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public onAutofillSaveDeclined()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillSaveDeclined()V

    .line 139
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public onClosed()V
    .locals 0

    return-void
.end method

.method public onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0

    return-void
.end method

.method public onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 0

    return-void
.end method

.method public onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 0

    return-void
.end method

.method public onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 0

    .line 114
    iget-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->saveFieldsMap:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 116
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->isAutofillProfileDataDifferent()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 117
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->displayAutofillSaveCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_1
    return-void
.end method

.method public onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 96
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->hideAutofillCards(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method
