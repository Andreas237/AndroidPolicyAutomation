.class public Lcom/stripe/android/model/Token;
.super Ljava/lang/Object;
.source "Token.java"

# interfaces
.implements Lcom/stripe/android/model/StripePaymentSource;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/Token$TokenType;
    }
.end annotation


# instance fields
.field private final mBankAccount:Lcom/stripe/android/model/BankAccount;

.field private final mCard:Lcom/stripe/android/model/Card;

.field private final mCreated:Ljava/util/Date;

.field private final mId:Ljava/lang/String;

.field private final mLivemode:Z

.field private final mType:Ljava/lang/String;

.field private final mUsed:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/Boolean;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mId:Ljava/lang/String;

    .line 97
    iput-object p2, p0, Lcom/stripe/android/model/Token;->mType:Ljava/lang/String;

    .line 98
    iput-object p4, p0, Lcom/stripe/android/model/Token;->mCreated:Ljava/util/Date;

    const/4 p1, 0x0

    .line 99
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mCard:Lcom/stripe/android/model/Card;

    .line 100
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mBankAccount:Lcom/stripe/android/model/BankAccount;

    .line 101
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/model/Token;->mUsed:Z

    .line 102
    iput-boolean p3, p0, Lcom/stripe/android/model/Token;->mLivemode:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/util/Date;Ljava/lang/Boolean;Lcom/stripe/android/model/BankAccount;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mId:Ljava/lang/String;

    const-string p1, "bank_account"

    .line 77
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mType:Ljava/lang/String;

    .line 78
    iput-object p3, p0, Lcom/stripe/android/model/Token;->mCreated:Ljava/util/Date;

    .line 79
    iput-boolean p2, p0, Lcom/stripe/android/model/Token;->mLivemode:Z

    const/4 p1, 0x0

    .line 80
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mCard:Lcom/stripe/android/model/Card;

    .line 81
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/model/Token;->mUsed:Z

    .line 82
    iput-object p5, p0, Lcom/stripe/android/model/Token;->mBankAccount:Lcom/stripe/android/model/BankAccount;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/util/Date;Ljava/lang/Boolean;Lcom/stripe/android/model/Card;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mId:Ljava/lang/String;

    const-string p1, "card"

    .line 58
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mType:Ljava/lang/String;

    .line 59
    iput-object p3, p0, Lcom/stripe/android/model/Token;->mCreated:Ljava/util/Date;

    .line 60
    iput-boolean p2, p0, Lcom/stripe/android/model/Token;->mLivemode:Z

    .line 61
    iput-object p5, p0, Lcom/stripe/android/model/Token;->mCard:Lcom/stripe/android/model/Card;

    .line 62
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/model/Token;->mUsed:Z

    const/4 p1, 0x0

    .line 63
    iput-object p1, p0, Lcom/stripe/android/model/Token;->mBankAccount:Lcom/stripe/android/model/BankAccount;

    return-void
.end method

.method static asTokenType(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 215
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "card"

    .line 219
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p0, "card"

    return-object p0

    :cond_1
    const-string v1, "bank_account"

    .line 221
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p0, "bank_account"

    return-object p0

    :cond_2
    const-string v1, "pii"

    .line 223
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p0, "pii"

    return-object p0

    :cond_3
    const-string v1, "account"

    .line 225
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "account"

    return-object p0

    :cond_4
    return-object v0

    :cond_5
    :goto_0
    return-object v0
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Token;
    .locals 12
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "id"

    .line 172
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "created"

    .line 173
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optLong(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "livemode"

    .line 174
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    const-string v4, "type"

    .line 176
    invoke-static {p0, v4}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/model/Token;->asTokenType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "used"

    .line 177
    invoke-static {p0, v5}, Lcom/stripe/android/model/StripeJsonUtils;->optBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v7

    if-eqz v3, :cond_8

    if-eqz v1, :cond_8

    if-nez v2, :cond_1

    goto/16 :goto_1

    .line 182
    :cond_1
    new-instance v6, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    mul-long v8, v8, v10

    invoke-direct {v6, v8, v9}, Ljava/util/Date;-><init>(J)V

    const-string v1, "bank_account"

    .line 185
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "bank_account"

    .line 186
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v0

    .line 190
    :cond_2
    invoke-static {p0}, Lcom/stripe/android/model/BankAccount;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/BankAccount;

    move-result-object p0

    .line 191
    new-instance v0, Lcom/stripe/android/model/Token;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v2, v0

    move-object v5, v6

    move-object v6, v7

    move-object v7, p0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/model/Token;-><init>(Ljava/lang/String;ZLjava/util/Date;Ljava/lang/Boolean;Lcom/stripe/android/model/BankAccount;)V

    goto :goto_0

    :cond_3
    const-string v1, "card"

    .line 192
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "card"

    .line 193
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_4

    return-object v0

    .line 197
    :cond_4
    invoke-static {p0}, Lcom/stripe/android/model/Card;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Card;

    move-result-object p0

    .line 198
    new-instance v0, Lcom/stripe/android/model/Token;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v2, v0

    move-object v5, v6

    move-object v6, v7

    move-object v7, p0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/model/Token;-><init>(Ljava/lang/String;ZLjava/util/Date;Ljava/lang/Boolean;Lcom/stripe/android/model/Card;)V

    goto :goto_0

    :cond_5
    const-string p0, "pii"

    .line 199
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "account"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 200
    :cond_6
    new-instance p0, Lcom/stripe/android/model/Token;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/model/Token;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/Boolean;)V

    move-object v0, p0

    :cond_7
    :goto_0
    return-object v0

    :cond_8
    :goto_1
    return-object v0
.end method

.method public static fromString(Ljava/lang/String;)Lcom/stripe/android/model/Token;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 160
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 161
    invoke-static {p0}, Lcom/stripe/android/model/Token;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Token;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getCard()Lcom/stripe/android/model/Card;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/stripe/android/model/Token;->mCard:Lcom/stripe/android/model/Card;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/stripe/android/model/Token;->mId:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/stripe/android/model/Token;->mType:Ljava/lang/String;

    return-object v0
.end method
