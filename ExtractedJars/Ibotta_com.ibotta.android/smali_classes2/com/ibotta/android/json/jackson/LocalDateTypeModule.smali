.class public Lcom/ibotta/android/json/jackson/LocalDateTypeModule;
.super Lcom/fasterxml/jackson/databind/module/SimpleModule;
.source "LocalDateTypeModule.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;,
        Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;
    }
.end annotation


# instance fields
.field private final enUsFormat:Ljava/text/DateFormat;

.field private final iso8601Format:Ljava/text/DateFormat;

.field private final localFormat:Ljava/text/DateFormat;

.field private final ymdFormat:Ljava/text/DateFormat;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 30
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    invoke-static {v1, v1, v0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v0

    .line 31
    invoke-static {v1, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v1

    .line 30
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 41
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1, v0}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-static {p1}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 46
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1, p2, v0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 36
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, p1, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, p1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;-><init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V

    return-void
.end method

.method public constructor <init>(Ljava/text/DateFormat;Ljava/text/DateFormat;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/module/SimpleModule;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->enUsFormat:Ljava/text/DateFormat;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->localFormat:Ljava/text/DateFormat;

    .line 54
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p1, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->iso8601Format:Ljava/text/DateFormat;

    .line 55
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->iso8601Format:Ljava/text/DateFormat;

    const-string p2, "UTC"

    invoke-static {p2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 56
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyy-MM-dd"

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p1, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->ymdFormat:Ljava/text/DateFormat;

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->ymdFormat:Ljava/text/DateFormat;

    const-string p2, "UTC"

    invoke-static {p2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 58
    const-class p1, Ljava/util/Date;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;

    const-class v0, Ljava/util/Date;

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;-><init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->addSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    .line 59
    const-class p1, Ljava/sql/Timestamp;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;

    const-class v0, Ljava/sql/Timestamp;

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;-><init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->addSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    .line 60
    const-class p1, Ljava/sql/Date;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;

    const-class v0, Ljava/sql/Date;

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;-><init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->addSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    .line 61
    const-class p1, Ljava/util/Date;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;

    const-class v0, Ljava/util/Date;

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;-><init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->addDeserializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    .line 62
    const-class p1, Ljava/sql/Timestamp;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;

    const-class v0, Ljava/sql/Timestamp;

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;-><init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->addDeserializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    .line 63
    const-class p1, Ljava/sql/Date;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;

    const-class v0, Ljava/sql/Date;

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateDeserializer;-><init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->addDeserializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;)Ljava/text/DateFormat;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->localFormat:Ljava/text/DateFormat;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;)Ljava/text/DateFormat;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->enUsFormat:Ljava/text/DateFormat;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;)Ljava/text/DateFormat;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->iso8601Format:Ljava/text/DateFormat;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;)Ljava/text/DateFormat;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->ymdFormat:Ljava/text/DateFormat;

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    const-class v1, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->localFormat:Ljava/text/DateFormat;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
