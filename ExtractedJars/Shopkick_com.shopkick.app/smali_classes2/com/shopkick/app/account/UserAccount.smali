.class public Lcom/shopkick/app/account/UserAccount;
.super Lcom/shopkick/app/application/Account;
.source "UserAccount.java"


# static fields
.field private static final AES_ALGORITHM:Ljava/lang/String; = "AES/CBC/PKCS7Padding"

.field private static final AES_KEY_TYPE:Ljava/lang/String; = "AES"

.field private static final COUNTRY:Ljava/lang/String; = "country"

.field private static final EMAIL:Ljava/lang/String; = "email"

.field private static final ENROLLED_LOYALTY_PROGRAM_IDS:Ljava/lang/String; = "enrolledLoyaltyProgramIds"

.field private static final FAILED_CHG_PWD_COUNT:Ljava/lang/String; = "failedChangePasswordCount"

.field private static final FB_ACCESS_TOKEN:Ljava/lang/String; = "facebookAccessToken"

.field private static final FIRST_NAME:Ljava/lang/String; = "firstName"

.field private static final HAS_SEEN_RECEIPT_INSTRUCTIONS:Ljava/lang/String; = "hasSeenReceiptInstructions"

.field private static final IS_BUY_AND_COLLECT_ENROLLED:Ljava/lang/String; = "isBuyAndCollectEnrolled"

.field private static final IS_EMAIL_VERIFIED:Ljava/lang/String; = "isEmailVerified"

.field private static final IS_FB_CONNECTED:Ljava/lang/String; = "isFacebookConnected"

.field private static final IS_PHONE_VERIFIED:Ljava/lang/String; = "isPhoneVerified"

.field private static final IS_REGISTERED:Ljava/lang/String; = "isRegistered"

.field private static final IV_SIZE:I = 0x10

.field private static final KEY_SIZE:I = 0x10

.field private static final LAST_NAME:Ljava/lang/String; = "lastName"

.field private static final PHONE_NUM:Ljava/lang/String; = "phoneNumber"

.field private static final SESSION_KEY:Ljava/lang/String; = "sessionKey"

.field public static final USER_ACCOUNT_ID_CHANGED_EVENT:Ljava/lang/String; = "UserAccountIdChangedEvent"

.field public static final USER_ACCOUNT_INFO_UPDATED_EVENT:Ljava/lang/String; = "UserAccountInfoUpdatedEvent"

.field public static final USER_ACCOUNT_SESSION_KEY_CHANGED_EVENT:Ljava/lang/String; = "UserAccountSessionKeyChangedEvent"

.field private static final USER_ID:Ljava/lang/String; = "userId"

.field private static final ZIP_CODE:Ljava/lang/String; = "zipCode"


# instance fields
.field private appInfo:Lcom/shopkick/app/application/AppInfo;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private country:Ljava/lang/Integer;

.field private createdTsUTC:J

.field private email:Ljava/lang/String;

.field private enrolledLoyaltyProgramIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private facebookAccessToken:Ljava/lang/String;

.field private failedChangePasswordCount:I

.field private firstName:Ljava/lang/String;

.field private forcedExperimentId:Ljava/lang/String;

.field private hasSeenReceiptScanInstructions:Z

.field private isBuyAndCollectEnrolled:Z

.field private isEmailVerified:Z

.field private isFacebookConnected:Z

.field private isGooglePlusConnected:Z

.field private isNewUser:Z

.field private isPhoneVerified:Z

.field private isRegistered:Z

.field private lastName:Ljava/lang/String;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private phoneNumber:Ljava/lang/String;

.field protected sessionKey:[B

.field private sessionKeyHasChanged:Z

.field protected userId:Ljava/lang/String;

.field private userIdHasChanged:Z

.field private userInfoSet:Z

.field private zipCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Lcom/shopkick/app/application/Account;-><init>()V

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->appInfo:Lcom/shopkick/app/application/AppInfo;

    .line 112
    iput-object p2, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 113
    iput-object p3, p0, Lcom/shopkick/app/account/UserAccount;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p1, :cond_0

    .line 115
    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getUserAccountJSON()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/account/UserAccount;->fromJSONString(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 116
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->userIdHasChanged:Z

    .line 117
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKeyHasChanged:Z

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BLcom/shopkick/app/application/AppPreferences;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/shopkick/app/application/Account;-><init>()V

    .line 105
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    .line 106
    iput-object p2, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    .line 107
    iput-object p3, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method

.method private clear()V
    .locals 2

    const/4 v0, 0x0

    .line 417
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    .line 418
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    const/4 v1, 0x0

    .line 419
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isRegistered:Z

    .line 420
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->email:Ljava/lang/String;

    .line 421
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isEmailVerified:Z

    .line 422
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    .line 423
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    .line 424
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    .line 425
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    .line 426
    iput v1, p0, Lcom/shopkick/app/account/UserAccount;->failedChangePasswordCount:I

    .line 427
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    .line 428
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    .line 429
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    .line 430
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->country:Ljava/lang/Integer;

    .line 431
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->firstName:Ljava/lang/String;

    .line 432
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;

    .line 433
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isNewUser:Z

    .line 434
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->hasSeenReceiptScanInstructions:Z

    return-void
.end method

.method private clearWithReason(ILjava/lang/String;)V
    .locals 2

    .line 408
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x38a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 409
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSwitchAccountReason(Ljava/lang/Integer;)V

    .line 410
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNewUserId(Ljava/lang/String;)V

    .line 411
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOldUserId(Ljava/lang/String;)V

    .line 412
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccount;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 413
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccount;->clear()V

    return-void
.end method

.method private fromJSONString(Ljava/lang/String;)V
    .locals 5

    if-eqz p1, :cond_4

    .line 507
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 512
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 516
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccount;->clear()V

    const-string/jumbo p1, "userId"

    const/4 v1, 0x0

    .line 517
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    const-string p1, "sessionKey"

    .line 518
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    .line 519
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 520
    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    goto :goto_0

    .line 522
    :cond_1
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    :goto_0
    const-string p1, "isRegistered"

    .line 524
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isRegistered:Z

    const-string p1, "email"

    .line 525
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->email:Ljava/lang/String;

    const-string p1, "isEmailVerified"

    .line 526
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isEmailVerified:Z

    const-string p1, "phoneNumber"

    .line 527
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    const-string p1, "isPhoneVerified"

    .line 528
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    const-string/jumbo p1, "zipCode"

    .line 529
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    const-string p1, "isFacebookConnected"

    .line 530
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    const-string p1, "failedChangePasswordCount"

    .line 531
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/account/UserAccount;->failedChangePasswordCount:I

    const-string p1, "hasSeenReceiptInstructions"

    .line 532
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->hasSeenReceiptScanInstructions:Z

    const-string p1, "facebookAccessToken"

    .line 533
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 534
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2

    .line 535
    new-instance v3, Ljava/lang/String;

    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/String;-><init>([B)V

    iput-object v3, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    goto :goto_1

    .line 537
    :cond_2
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    :goto_1
    const-string p1, "isBuyAndCollectEnrolled"

    .line 539
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    const-string p1, "enrolledLoyaltyProgramIds"

    .line 540
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 542
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    .line 543
    :goto_2
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 544
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 545
    iget-object v4, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const-string p1, "country"

    .line 548
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->country:Ljava/lang/Integer;

    const-string p1, "firstName"

    .line 549
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->firstName:Ljava/lang/String;

    const-string p1, "lastName"

    .line 550
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 553
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSONException inflating the UserAccount from json: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-void

    :cond_4
    :goto_4
    return-void
.end method

.method private getSessionKeyFromEncryptedValue(Ljava/lang/String;)[B
    .locals 6

    const/16 v0, 0x10

    .line 370
    new-array v1, v0, [B

    .line 371
    iget-object v2, p0, Lcom/shopkick/app/account/UserAccount;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppInfo;->getInfo()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 372
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v4, "AES"

    invoke-direct {v2, v1, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 375
    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 376
    new-array v1, v0, [B

    .line 377
    invoke-static {p1, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 378
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 380
    array-length v1, p1

    sub-int/2addr v1, v0

    .line 381
    new-array v5, v1, [B

    .line 382
    invoke-static {p1, v0, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :try_start_0
    const-string p1, "AES/CBC/PKCS7Padding"

    .line 387
    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    const/4 v0, 0x2

    .line 388
    invoke-virtual {p1, v0, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 389
    invoke-virtual {p1, v5}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 402
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 400
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception p1

    .line 398
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_3
    move-exception p1

    .line 396
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_4
    move-exception p1

    .line 394
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_5
    move-exception p1

    .line 392
    const-class v0, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private toJSONString()Ljava/lang/String;
    .locals 6

    .line 461
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    const-string/jumbo v2, "userId"

    .line 463
    iget-object v3, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 465
    iget-object v2, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    array-length v2, v2

    if-lez v2, :cond_0

    .line 466
    new-instance v2, Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    invoke-static {v4, v3}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v4

    const-string v5, "ASCII"

    invoke-direct {v2, v4, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const-string v4, "sessionKey"

    .line 468
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "isRegistered"

    .line 469
    iget-boolean v4, p0, Lcom/shopkick/app/account/UserAccount;->isRegistered:Z

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "email"

    .line 470
    iget-object v4, p0, Lcom/shopkick/app/account/UserAccount;->email:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "isEmailVerified"

    .line 471
    iget-boolean v4, p0, Lcom/shopkick/app/account/UserAccount;->isEmailVerified:Z

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "phoneNumber"

    .line 472
    iget-object v4, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "isPhoneVerified"

    .line 473
    iget-boolean v4, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string/jumbo v2, "zipCode"

    .line 474
    iget-object v4, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "isFacebookConnected"

    .line 475
    iget-boolean v4, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "failedChangePasswordCount"

    .line 476
    iget v4, p0, Lcom/shopkick/app/account/UserAccount;->failedChangePasswordCount:I

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "isBuyAndCollectEnrolled"

    .line 477
    iget-boolean v4, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "hasSeenReceiptInstructions"

    .line 478
    iget-boolean v4, p0, Lcom/shopkick/app/account/UserAccount;->hasSeenReceiptScanInstructions:Z

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 480
    iget-object v2, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 481
    new-instance v2, Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-static {v4, v3}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v3

    const-string v4, "ASCII"

    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    const-string v3, "facebookAccessToken"

    .line 483
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 484
    iget-object v2, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    if-eqz v2, :cond_3

    .line 485
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 486
    iget-object v3, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 487
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_2
    const-string v3, "enrolledLoyaltyProgramIds"

    .line 489
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v2, "country"

    .line 491
    iget-object v3, p0, Lcom/shopkick/app/account/UserAccount;->country:Ljava/lang/Integer;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "firstName"

    .line 492
    iget-object v3, p0, Lcom/shopkick/app/account/UserAccount;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "lastName"

    .line 493
    iget-object v3, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 495
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 501
    const-class v2, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :catch_1
    move-exception v0

    .line 498
    const-class v2, Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method


# virtual methods
.method public accountExists()Z
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getCountry()Ljava/lang/Integer;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->country:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCreatedTsUTC()J
    .locals 2

    .line 225
    iget-wide v0, p0, Lcom/shopkick/app/account/UserAccount;->createdTsUTC:J

    return-wide v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 2

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->firstName:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " "

    .line 253
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string/jumbo v1, "shopkicker"

    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getExperimentId()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->forcedExperimentId:Ljava/lang/String;

    return-object v0
.end method

.method public getFacebookAccessToken()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getFailedChangePasswordCount()I
    .locals 1

    .line 192
    iget v0, p0, Lcom/shopkick/app/account/UserAccount;->failedChangePasswordCount:I

    return v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionKey()[B
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public getZipCode()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    return-object v0
.end method

.method public hasSeenReceiptInstructions()Z
    .locals 1

    .line 572
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->hasSeenReceiptScanInstructions:Z

    return v0
.end method

.method public isBuyAndCollectEnabled()Z
    .locals 2

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->country:Ljava/lang/Integer;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isBuyAndCollectEnrolled()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    return v0
.end method

.method public isCurrentUser(Ljava/lang/String;)Z
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isEmailVerified()Z
    .locals 1

    .line 148
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isEmailVerified:Z

    return v0
.end method

.method public isFacebookConnected()Z
    .locals 1

    .line 176
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    return v0
.end method

.method public isGooglePlusConnected()Z
    .locals 1

    .line 184
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isGooglePlusConnected:Z

    return v0
.end method

.method public isLoyaltyProgramEnrolled(I)Z
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isNewUser()Z
    .locals 1

    .line 262
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isNewUser:Z

    return v0
.end method

.method public isPhoneVerified()Z
    .locals 1

    .line 160
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    return v0
.end method

.method public isRegistered()Z
    .locals 1

    .line 140
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isRegistered:Z

    return v0
.end method

.method public isUserInfoSet()Z
    .locals 1

    .line 302
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->userInfoSet:Z

    return v0
.end method

.method public matchesEncryptedSessionKey(Ljava/lang/String;)Z
    .locals 1

    if-nez p1, :cond_1

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    .line 363
    :cond_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/UserAccount;->getSessionKeyFromEncryptedValue(Ljava/lang/String;)[B

    move-result-object p1

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public receiptScanInstructionsViewed()V
    .locals 1

    const/4 v0, 0x1

    .line 576
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->hasSeenReceiptScanInstructions:Z

    .line 577
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccount;->save()V

    return-void
.end method

.method public resetUserIdAndSessionKeyWithReason(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 336
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/logging/DiagnosticLogger;->setUserId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->userIdHasChanged:Z

    .line 347
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->userIdHasChanged:Z

    if-eqz v0, :cond_1

    .line 350
    invoke-direct {p0, p3, p1}, Lcom/shopkick/app/account/UserAccount;->clearWithReason(ILjava/lang/String;)V

    .line 351
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    .line 354
    :cond_1
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccount;->getSessionKeyFromEncryptedValue(Ljava/lang/String;)[B

    move-result-object p1

    .line 355
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    invoke-static {p2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    iput-boolean p2, p0, Lcom/shopkick/app/account/UserAccount;->sessionKeyHasChanged:Z

    .line 356
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    return-void

    .line 343
    :cond_2
    :goto_0
    invoke-direct {p0, p3, p1}, Lcom/shopkick/app/account/UserAccount;->clearWithReason(ILjava/lang/String;)V

    return-void
.end method

.method public save()V
    .locals 3

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz v0, :cond_3

    .line 439
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccount;->toJSONString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setUserAccountJSON(Ljava/lang/String;)V

    .line 440
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setDeviceHasRegistered(Z)V

    .line 443
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->userIdHasChanged:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 444
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "UserAccountIdChangedEvent"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 445
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->resetAppPrefDefaults()V

    .line 446
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->userIdHasChanged:Z

    .line 447
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKeyHasChanged:Z

    .line 448
    invoke-static {}, Lcom/usebutton/sdk/Button;->clearAllData()V

    .line 449
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object v0

    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/user/User;->setIdentifier(Ljava/lang/String;)V

    goto :goto_0

    .line 450
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->sessionKeyHasChanged:Z

    if-eqz v0, :cond_2

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "UserAccountSessionKeyChangedEvent"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 452
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "UserAccountInfoUpdatedEvent"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 453
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKeyHasChanged:Z

    goto :goto_0

    .line 455
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountInfoUpdatedEvent"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_3
    :goto_0
    return-void
.end method

.method public setAllLoyaltyProgramsEnrolled(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 282
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    return-void
.end method

.method public setBuyAndCollectEnrolled(Z)V
    .locals 0

    .line 221
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    return-void
.end method

.method public setCountry(Ljava/lang/Integer;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->country:Ljava/lang/Integer;

    return-void
.end method

.method public setCreatedTsUTC(J)V
    .locals 0

    .line 233
    iput-wide p1, p0, Lcom/shopkick/app/account/UserAccount;->createdTsUTC:J

    return-void
.end method

.method public setExperimentId(Ljava/lang/String;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->forcedExperimentId:Ljava/lang/String;

    return-void
.end method

.method public setFacebookAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    return-void
.end method

.method public setFacebookConnected(Z)V
    .locals 0

    .line 180
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    return-void
.end method

.method public setFailedChangePasswordCount(I)V
    .locals 0

    .line 196
    iput p1, p0, Lcom/shopkick/app/account/UserAccount;->failedChangePasswordCount:I

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setIsGooglePlusConnected(Z)V
    .locals 0

    .line 188
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isGooglePlusConnected:Z

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setLogger(Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->logger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method

.method public setLoyaltyProgramEnrolled(I)Z
    .locals 2

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    if-nez v0, :cond_0

    .line 287
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public setNewUser(Z)V
    .locals 0

    .line 266
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isNewUser:Z

    .line 267
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->setFTUEsDone()V

    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    return-void
.end method

.method public setPhoneVerified(Z)V
    .locals 0

    .line 164
    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    return-void
.end method

.method public setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V
    .locals 2

    const/4 v0, 0x1

    .line 306
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->userInfoSet:Z

    .line 307
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isRegistered:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isRegistered:Z

    .line 308
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->email:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->email:Ljava/lang/String;

    .line 309
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isEmailVerified:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isEmailVerified:Z

    .line 310
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->phoneNumber:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    .line 311
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isPhoneNumberVerified:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    .line 312
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->zipCode:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    .line 313
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isFacebookConnected:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    .line 314
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isBuyAndCollectEnrolled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    .line 315
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->enrolledLoyaltyProgramIds:Ljava/util/List;

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    .line 316
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isGooglePlusConnected:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccount;->isGooglePlusConnected:Z

    .line 317
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->createdTsUtc:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/account/UserAccount;->createdTsUTC:J

    .line 318
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->firstName:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->firstName:Ljava/lang/String;

    .line 319
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->lastName:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccount;->lastName:Ljava/lang/String;

    .line 320
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->country:Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/UserAccount;->setCountry(Ljava/lang/Integer;)V

    return-void
.end method

.method public setZipCode(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 560
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserAccount [userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->userId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKey:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isRegistered="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isRegistered:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->email:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEmailVerified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isEmailVerified:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", phoneNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isPhoneVerified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", zipCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->zipCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isFacebookConnected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", failedChangePasswordCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/app/account/UserAccount;->failedChangePasswordCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", userIdHasChanged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->userIdHasChanged:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sessionKeyHasChanged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->sessionKeyHasChanged:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", facebookAccessToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->facebookAccessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isBuyAndCollectEnrolled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnrolled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enrolledLoyaltyProgramIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->enrolledLoyaltyProgramIds:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", forcedExperimentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->forcedExperimentId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appPrefs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationCenter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccount;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userInfoSet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/account/UserAccount;->userInfoSet:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
