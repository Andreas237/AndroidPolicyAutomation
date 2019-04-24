.class public Lcom/usebutton/sdk/internal/api/models/BrowserDTO;
.super Ljava/lang/Object;
.source "BrowserDTO.java"


# static fields
.field private static final ACTION_TEXT:Ljava/lang/String; = "action_text"

.field private static final AUTOFILL:Ljava/lang/String; = "autofill"

.field private static final CARDS:Ljava/lang/String; = "cards"

.field private static final INSTALL_SHEET:Ljava/lang/String; = "install_sheet"

.field private static final PRIMARY_COLOR:Ljava/lang/String; = "primary_color"

.field private static final TITLE_TEXT:Ljava/lang/String; = "title_text"


# instance fields
.field public final actionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final browserCardMapDTO:Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;

.field public final installSheet:Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;

.field public final primaryColor:Ljava/lang/String;

.field public final titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->primaryColor:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 32
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->actionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 33
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->installSheet:Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;

    .line 34
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->browserCardMapDTO:Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BrowserDTO;
    .locals 8
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "autofill"

    .line 44
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "autofill"

    .line 45
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 46
    invoke-static {}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v1

    invoke-static {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAutofillFillCardModel(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;)V

    .line 47
    invoke-static {}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v1

    invoke-static {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAutofillSaveCardModel(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;)V

    .line 50
    :cond_1
    new-instance v0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    const-string v1, "primary_color"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v1, "title_text"

    .line 51
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v4

    const-string v1, "action_text"

    .line 52
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v5

    const-string v1, "install_sheet"

    .line 53
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;

    move-result-object v6

    const-string v1, "cards"

    .line 54
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;

    move-result-object v7

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;-><init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;)V

    return-object v0
.end method
