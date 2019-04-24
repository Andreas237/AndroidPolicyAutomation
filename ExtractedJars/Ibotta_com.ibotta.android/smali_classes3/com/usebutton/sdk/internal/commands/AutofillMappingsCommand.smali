.class public Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "AutofillMappingsCommand.java"


# instance fields
.field private final autofillJson:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p4}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 15
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;->autofillJson:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 25
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 26
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;->autofillJson:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getAutofillMappings(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "object"

    .line 27
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "autofill"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 20
    const-class v0, Lcom/usebutton/sdk/internal/commands/AutofillMappingsCommand;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
