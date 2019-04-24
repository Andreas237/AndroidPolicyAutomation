.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;
.super Ljava/lang/Object;
.source "AutofillModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FillCard"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AutofillModel$FillCard"


# instance fields
.field private cardCtaIconUrl:Ljava/lang/String;

.field private cardCtaText:Lcom/usebutton/sdk/internal/models/Text;

.field private disableSystemAutofill:Z

.field private emailLabelText:Lcom/usebutton/sdk/internal/models/Text;

.field private nameLabelText:Lcom/usebutton/sdk/internal/models/Text;

.field private primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private primaryColor:Ljava/lang/String;

.field private secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private titleText:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Ljava/lang/String;Z)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->primaryColor:Ljava/lang/String;

    .line 65
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 66
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->nameLabelText:Lcom/usebutton/sdk/internal/models/Text;

    .line 67
    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->emailLabelText:Lcom/usebutton/sdk/internal/models/Text;

    .line 68
    iput-object p5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 69
    iput-object p6, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 70
    iput-object p7, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->cardCtaText:Lcom/usebutton/sdk/internal/models/Text;

    .line 71
    iput-object p8, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->cardCtaIconUrl:Ljava/lang/String;

    .line 72
    iput-boolean p9, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->disableSystemAutofill:Z

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;
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
    :try_start_0
    const-string v1, "fill_card"

    .line 79
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 80
    new-instance v11, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    const-string v1, "primary_color"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "title_text"

    .line 81
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    const-string v1, "name_label_text"

    .line 82
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    const-string v1, "email_label_text"

    .line 83
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    const-string v1, "primary_action_text"

    .line 84
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v6

    const-string v1, "secondary_action_text"

    .line 85
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v7

    const-string v1, "card_cta"

    .line 87
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v8, "title_text"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 86
    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v8

    const-string v1, "card_cta"

    .line 88
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v9, "icon_url"

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v1, "disable_system_autofill"

    const/4 v10, 0x0

    .line 89
    invoke-virtual {p0, v1, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v10

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v11

    :catch_0
    move-exception p0

    .line 91
    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to convert JSON into a AutofillModel.FillCard: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 91
    invoke-static {v1, p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public disableSystemAutofill()Z
    .locals 1

    .line 131
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->disableSystemAutofill:Z

    return v0
.end method

.method public getCardCtaIconUrl()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->cardCtaIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardCtaText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->cardCtaText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getEmailLabelText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->emailLabelText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getNameLabelText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->nameLabelText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPrimaryColor()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->primaryColor:Ljava/lang/String;

    return-object v0
.end method

.method public getSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method
