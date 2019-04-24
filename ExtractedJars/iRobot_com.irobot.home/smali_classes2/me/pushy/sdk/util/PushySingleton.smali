.class public Lme/pushy/sdk/util/PushySingleton;
.super Ljava/lang/Object;


# static fields
.field static mMapper:Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

.field static mSettings:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;
    .locals 3

    sget-object v0, Lme/pushy/sdk/util/PushySingleton;->mMapper:Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    if-nez v0, :cond_0

    new-instance v0, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    invoke-direct {v0}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;-><init>()V

    sput-object v0, Lme/pushy/sdk/util/PushySingleton;->mMapper:Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    sget-object v0, Lme/pushy/sdk/util/PushySingleton;->mMapper:Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    sget-object v1, Lme/pushy/sdk/lib/jackson/databind/DeserializationFeature;->FAIL_ON_UNKNOWN_PROPERTIES:Lme/pushy/sdk/lib/jackson/databind/DeserializationFeature;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->configure(Lme/pushy/sdk/lib/jackson/databind/DeserializationFeature;Z)Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    :cond_0
    sget-object v0, Lme/pushy/sdk/util/PushySingleton;->mMapper:Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    return-object v0
.end method

.method public static getSettings(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 1

    sget-object v0, Lme/pushy/sdk/util/PushySingleton;->mSettings:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    sput-object p0, Lme/pushy/sdk/util/PushySingleton;->mSettings:Landroid/content/SharedPreferences;

    :cond_0
    sget-object p0, Lme/pushy/sdk/util/PushySingleton;->mSettings:Landroid/content/SharedPreferences;

    return-object p0
.end method
