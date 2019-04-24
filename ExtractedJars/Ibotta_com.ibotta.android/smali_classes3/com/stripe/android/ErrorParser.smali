.class Lcom/stripe/android/ErrorParser;
.super Ljava/lang/Object;
.source "ErrorParser.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ErrorParser$StripeError;
    }
.end annotation


# direct methods
.method static parseError(Ljava/lang/String;)Lcom/stripe/android/ErrorParser$StripeError;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 28
    new-instance v0, Lcom/stripe/android/ErrorParser$StripeError;

    invoke-direct {v0}, Lcom/stripe/android/ErrorParser$StripeError;-><init>()V

    .line 30
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "error"

    .line 31
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "charge"

    .line 32
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ErrorParser$StripeError;->charge:Ljava/lang/String;

    const-string v1, "code"

    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ErrorParser$StripeError;->code:Ljava/lang/String;

    const-string v1, "decline_code"

    .line 34
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ErrorParser$StripeError;->decline_code:Ljava/lang/String;

    const-string v1, "message"

    .line 35
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    const-string v1, "param"

    .line 36
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ErrorParser$StripeError;->param:Ljava/lang/String;

    const-string v1, "type"

    .line 37
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/stripe/android/ErrorParser$StripeError;->type:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "An improperly formatted error response was found."

    .line 39
    iput-object p0, v0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    :goto_0
    return-object v0
.end method
