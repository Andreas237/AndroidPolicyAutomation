.class public Lcom/ibotta/tracking/generated/invoker/JSON;
.super Ljava/lang/Object;
.source "JSON.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;,
        Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;,
        Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;,
        Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;,
        Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;
    }
.end annotation


# instance fields
.field private byteArrayAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;

.field private dateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;

.field private gson:Lcom/google/gson/Gson;

.field private isLenientOnJson:Z

.field private localDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;

.field private offsetDateTimeTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;

.field private sqlDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->isLenientOnJson:Z

    .line 47
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;

    invoke-direct {v0}, Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->dateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;

    .line 48
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;

    invoke-direct {v0}, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->sqlDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;

    .line 49
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;

    invoke-direct {v0}, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->offsetDateTimeTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;

    .line 50
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;

    invoke-direct {v0, p0}, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;-><init>(Lcom/ibotta/tracking/generated/invoker/JSON;)V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->localDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;

    .line 51
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;

    invoke-direct {v0, p0}, Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;-><init>(Lcom/ibotta/tracking/generated/invoker/JSON;)V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->byteArrayAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;

    .line 78
    invoke-static {}, Lcom/ibotta/tracking/generated/invoker/JSON;->createGson()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, Ljava/util/Date;

    iget-object v2, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->dateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;

    .line 79
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, Ljava/sql/Date;

    iget-object v2, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->sqlDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;

    .line 80
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, Lorg/threeten/bp/OffsetDateTime;

    iget-object v2, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->offsetDateTimeTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;

    .line 81
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, Lorg/threeten/bp/LocalDate;

    iget-object v2, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->localDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;

    .line 82
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, [B

    iget-object v2, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->byteArrayAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;

    .line 83
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->gson:Lcom/google/gson/Gson;

    return-void
.end method

.method public static createGson()Lcom/google/gson/GsonBuilder;
    .locals 1

    .line 54
    new-instance v0, Lio/gsonfire/GsonFireBuilder;

    invoke-direct {v0}, Lio/gsonfire/GsonFireBuilder;-><init>()V

    .line 57
    invoke-virtual {v0}, Lio/gsonfire/GsonFireBuilder;->createGsonBuilder()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    return-object v0
.end method

.method private static getClassByDiscriminator(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 70
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Class;

    if-eqz p0, :cond_0

    return-object p0

    .line 72
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cannot determine model class of name: <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ">"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getDiscriminatorValue(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 62
    invoke-virtual {p0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 64
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "missing discriminator field: <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ">"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public deserialize(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 133
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->isLenientOnJson:Z

    if-eqz v0, :cond_1

    .line 134
    new-instance v0, Lcom/google/gson/stream/JsonReader;

    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V

    const/4 v1, 0x1

    .line 136
    invoke-virtual {v0, v1}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V

    .line 137
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->gson:Lcom/google/gson/Gson;

    instance-of v2, v1, Lcom/google/gson/Gson;

    if-nez v2, :cond_0

    invoke-virtual {v1, v0, p2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, v0, p2}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->fromJson(Lcom/google/gson/Gson;Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    .line 139
    :cond_1
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->gson:Lcom/google/gson/Gson;

    instance-of v1, v0, Lcom/google/gson/Gson;

    if-nez v1, :cond_2

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, p1, p2}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->fromJson(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/gson/JsonParseException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object p1

    :catch_0
    move-exception v0

    .line 144
    const-class v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-object p1

    .line 146
    :cond_3
    throw v0
.end method

.method public getGson()Lcom/google/gson/Gson;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->gson:Lcom/google/gson/Gson;

    return-object v0
.end method

.method public serialize(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->gson:Lcom/google/gson/Gson;

    instance-of v1, v0, Lcom/google/gson/Gson;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public setDateFormat(Ljava/text/DateFormat;)Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 1

    .line 387
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->dateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$DateTypeAdapter;->setFormat(Ljava/text/DateFormat;)V

    return-object p0
.end method

.method public setGson(Lcom/google/gson/Gson;)Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->gson:Lcom/google/gson/Gson;

    return-object p0
.end method

.method public setLenientOnJson(Z)Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 0

    .line 108
    iput-boolean p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->isLenientOnJson:Z

    return-object p0
.end method

.method public setLocalDateFormat(Lorg/threeten/bp/format/DateTimeFormatter;)Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->localDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->setFormat(Lorg/threeten/bp/format/DateTimeFormatter;)V

    return-object p0
.end method

.method public setOffsetDateTimeFormat(Lorg/threeten/bp/format/DateTimeFormatter;)Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->offsetDateTimeTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->setFormat(Lorg/threeten/bp/format/DateTimeFormatter;)V

    return-object p0
.end method

.method public setSqlDateFormat(Ljava/text/DateFormat;)Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON;->sqlDateTypeAdapter:Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->setFormat(Ljava/text/DateFormat;)V

    return-object p0
.end method
