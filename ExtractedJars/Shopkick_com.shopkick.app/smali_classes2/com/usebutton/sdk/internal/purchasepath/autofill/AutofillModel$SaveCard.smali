.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;
.super Ljava/lang/Object;
.source "AutofillModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SaveCard"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AutofillModel$SaveCard"


# instance fields
.field private addressLabelText:Lcom/usebutton/sdk/internal/models/Text;

.field private cardCtaIconUrl:Ljava/lang/String;

.field private cardCtaText:Lcom/usebutton/sdk/internal/models/Text;

.field private emailLabelText:Lcom/usebutton/sdk/internal/models/Text;

.field private nameLabelText:Lcom/usebutton/sdk/internal/models/Text;

.field private phoneLabelText:Lcom/usebutton/sdk/internal/models/Text;

.field private primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private primaryColor:Ljava/lang/String;

.field private secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private subtitleText:Lcom/usebutton/sdk/internal/models/Text;

.field private titleText:Lcom/usebutton/sdk/internal/models/Text;

.field private updatePrimaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private updateSecondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private updateSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

.field private updateTitleText:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Ljava/lang/String;)V
    .locals 0

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->primaryColor:Ljava/lang/String;

    .line 162
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 163
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->subtitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 164
    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->nameLabelText:Lcom/usebutton/sdk/internal/models/Text;

    .line 165
    iput-object p5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->emailLabelText:Lcom/usebutton/sdk/internal/models/Text;

    .line 166
    iput-object p6, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->phoneLabelText:Lcom/usebutton/sdk/internal/models/Text;

    .line 167
    iput-object p7, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->addressLabelText:Lcom/usebutton/sdk/internal/models/Text;

    .line 168
    iput-object p8, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 169
    iput-object p9, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 170
    iput-object p10, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->cardCtaText:Lcom/usebutton/sdk/internal/models/Text;

    .line 171
    iput-object p11, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updateTitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 172
    iput-object p12, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updateSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 173
    iput-object p13, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updatePrimaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 174
    iput-object p14, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updateSecondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 175
    iput-object p15, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->cardCtaIconUrl:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;
    .locals 19
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v2, "save_card"

    .line 182
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 183
    new-instance v18, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    const-string v2, "primary_color"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v2, "title_text"

    .line 184
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    const-string/jumbo v2, "subtitle_text"

    .line 185
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    const-string v2, "name_label_text"

    .line 186
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v6

    const-string v2, "email_label_text"

    .line 187
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v7

    const-string v2, "phone_number_label_text"

    .line 188
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v8

    const-string v2, "address_label_text"

    .line 189
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v9

    const-string v2, "primary_action_text"

    .line 190
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v10

    const-string v2, "secondary_action_text"

    .line 191
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v11

    const-string v2, "card_cta"

    .line 193
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string/jumbo v12, "title_text"

    invoke-virtual {v2, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 192
    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v12

    const-string/jumbo v2, "update_title_text"

    .line 194
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v13

    const-string/jumbo v2, "update_subtitle_text"

    .line 195
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v14

    const-string/jumbo v2, "update_primary_action_text"

    .line 197
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    .line 196
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v15

    const-string/jumbo v2, "update_secondary_action_text"

    .line 199
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 198
    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v16

    const-string v2, "card_cta"

    .line 200
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "icon_url"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v2, v18

    invoke-direct/range {v2 .. v17}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v18

    :catch_0
    move-exception v0

    .line 202
    sget-object v2, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to convert JSON into a AutofillModel.SaveCard: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 202
    invoke-static {v2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public getAddressLabelText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->addressLabelText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getCardCtaIconUrl()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->cardCtaIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardCtaText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->cardCtaText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getEmailLabelText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->emailLabelText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getNameLabelText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->nameLabelText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPhoneLabelText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->phoneLabelText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPrimaryColor()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->primaryColor:Ljava/lang/String;

    return-object v0
.end method

.method public getSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getSubtitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->subtitleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getUpdatePrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updatePrimaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getUpdateSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updateSecondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getUpdateSubtitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updateSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getUpdateTitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->updateTitleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method
