.class final Lorg/threeten/bp/format/DateTimeParseContext;
.super Ljava/lang/Object;
.source "DateTimeParseContext.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/threeten/bp/format/DateTimeParseContext$Parsed;
    }
.end annotation


# instance fields
.field private caseSensitive:Z

.field private locale:Ljava/util/Locale;

.field private overrideChronology:Lorg/threeten/bp/chrono/Chronology;

.field private overrideZone:Lorg/threeten/bp/ZoneId;

.field private final parsed:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/threeten/bp/format/DateTimeParseContext$Parsed;",
            ">;"
        }
    .end annotation
.end field

.field private strict:Z

.field private symbols:Lorg/threeten/bp/format/DecimalStyle;


# direct methods
.method constructor <init>(Lorg/threeten/bp/format/DateTimeFormatter;)V
    .locals 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->caseSensitive:Z

    .line 92
    iput-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->strict:Z

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    .line 105
    invoke-virtual {p1}, Lorg/threeten/bp/format/DateTimeFormatter;->getLocale()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->locale:Ljava/util/Locale;

    .line 106
    invoke-virtual {p1}, Lorg/threeten/bp/format/DateTimeFormatter;->getDecimalStyle()Lorg/threeten/bp/format/DecimalStyle;

    move-result-object v0

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->symbols:Lorg/threeten/bp/format/DecimalStyle;

    .line 107
    invoke-virtual {p1}, Lorg/threeten/bp/format/DateTimeFormatter;->getChronology()Lorg/threeten/bp/chrono/Chronology;

    move-result-object v0

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->overrideChronology:Lorg/threeten/bp/chrono/Chronology;

    .line 108
    invoke-virtual {p1}, Lorg/threeten/bp/format/DateTimeFormatter;->getZone()Lorg/threeten/bp/ZoneId;

    move-result-object p1

    iput-object p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->overrideZone:Lorg/threeten/bp/ZoneId;

    .line 109
    iget-object p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    new-instance v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;-><init>(Lorg/threeten/bp/format/DateTimeParseContext;Lorg/threeten/bp/format/DateTimeParseContext$1;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method constructor <init>(Lorg/threeten/bp/format/DateTimeParseContext;)V
    .locals 2

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->caseSensitive:Z

    .line 92
    iput-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->strict:Z

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    .line 124
    iget-object v0, p1, Lorg/threeten/bp/format/DateTimeParseContext;->locale:Ljava/util/Locale;

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->locale:Ljava/util/Locale;

    .line 125
    iget-object v0, p1, Lorg/threeten/bp/format/DateTimeParseContext;->symbols:Lorg/threeten/bp/format/DecimalStyle;

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->symbols:Lorg/threeten/bp/format/DecimalStyle;

    .line 126
    iget-object v0, p1, Lorg/threeten/bp/format/DateTimeParseContext;->overrideChronology:Lorg/threeten/bp/chrono/Chronology;

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->overrideChronology:Lorg/threeten/bp/chrono/Chronology;

    .line 127
    iget-object v0, p1, Lorg/threeten/bp/format/DateTimeParseContext;->overrideZone:Lorg/threeten/bp/ZoneId;

    iput-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->overrideZone:Lorg/threeten/bp/ZoneId;

    .line 128
    iget-boolean v0, p1, Lorg/threeten/bp/format/DateTimeParseContext;->caseSensitive:Z

    iput-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->caseSensitive:Z

    .line 129
    iget-boolean p1, p1, Lorg/threeten/bp/format/DateTimeParseContext;->strict:Z

    iput-boolean p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->strict:Z

    .line 130
    iget-object p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    new-instance v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;-><init>(Lorg/threeten/bp/format/DateTimeParseContext;Lorg/threeten/bp/format/DateTimeParseContext$1;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic access$100(Lorg/threeten/bp/format/DateTimeParseContext;)Lorg/threeten/bp/ZoneId;
    .locals 0

    .line 67
    iget-object p0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->overrideZone:Lorg/threeten/bp/ZoneId;

    return-object p0
.end method

.method static charEqualsIgnoreCase(CC)Z
    .locals 2

    if-eq p0, p1, :cond_1

    .line 259
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    if-eq v0, v1, :cond_1

    .line 260
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;
    .locals 2

    .line 312
    iget-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    return-object v0
.end method


# virtual methods
.method charEquals(CC)Z
    .locals 1

    .line 244
    invoke-virtual {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->isCaseSensitive()Z

    move-result v0

    if-eqz v0, :cond_1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    .line 247
    :cond_1
    invoke-static {p1, p2}, Lorg/threeten/bp/format/DateTimeParseContext;->charEqualsIgnoreCase(CC)Z

    move-result p1

    return p1
.end method

.method copy()Lorg/threeten/bp/format/DateTimeParseContext;
    .locals 1

    .line 137
    new-instance v0, Lorg/threeten/bp/format/DateTimeParseContext;

    invoke-direct {v0, p0}, Lorg/threeten/bp/format/DateTimeParseContext;-><init>(Lorg/threeten/bp/format/DateTimeParseContext;)V

    return-object v0
.end method

.method endOptional(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 299
    iget-object p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 301
    :cond_0
    iget-object p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method getEffectiveChronology()Lorg/threeten/bp/chrono/Chronology;
    .locals 1

    .line 170
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    iget-object v0, v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->chrono:Lorg/threeten/bp/chrono/Chronology;

    if-nez v0, :cond_0

    .line 172
    iget-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->overrideChronology:Lorg/threeten/bp/chrono/Chronology;

    if-nez v0, :cond_0

    .line 174
    sget-object v0, Lorg/threeten/bp/chrono/IsoChronology;->INSTANCE:Lorg/threeten/bp/chrono/IsoChronology;

    :cond_0
    return-object v0
.end method

.method getLocale()Ljava/util/Locale;
    .locals 1

    .line 150
    iget-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method getParsed(Lorg/threeten/bp/temporal/TemporalField;)Ljava/lang/Long;
    .locals 1

    .line 328
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    iget-object v0, v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->fieldValues:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method getSymbols()Lorg/threeten/bp/format/DecimalStyle;
    .locals 1

    .line 161
    iget-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->symbols:Lorg/threeten/bp/format/DecimalStyle;

    return-object v0
.end method

.method isCaseSensitive()Z
    .locals 1

    .line 187
    iget-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->caseSensitive:Z

    return v0
.end method

.method isStrict()Z
    .locals 1

    .line 272
    iget-boolean v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->strict:Z

    return v0
.end method

.method setCaseSensitive(Z)V
    .locals 0

    .line 196
    iput-boolean p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->caseSensitive:Z

    return-void
.end method

.method setParsed(Lorg/threeten/bp/ZoneId;)V
    .locals 1

    const-string v0, "zone"

    .line 388
    invoke-static {p1, v0}, Lorg/threeten/bp/jdk8/Jdk8Methods;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 389
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    iput-object p1, v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->zone:Lorg/threeten/bp/ZoneId;

    return-void
.end method

.method setParsedField(Lorg/threeten/bp/temporal/TemporalField;JII)I
    .locals 2

    const-string v0, "field"

    .line 344
    invoke-static {p1, v0}, Lorg/threeten/bp/jdk8/Jdk8Methods;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 345
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    iget-object v0, v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->fieldValues:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    .line 346
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-eqz p1, :cond_0

    not-int p5, p4

    :cond_0
    return p5
.end method

.method setParsedLeapSecond()V
    .locals 2

    .line 396
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->leapSecond:Z

    return-void
.end method

.method setStrict(Z)V
    .locals 0

    .line 281
    iput-boolean p1, p0, Lorg/threeten/bp/format/DateTimeParseContext;->strict:Z

    return-void
.end method

.method startOptional()V
    .locals 2

    .line 289
    iget-object v0, p0, Lorg/threeten/bp/format/DateTimeParseContext;->parsed:Ljava/util/ArrayList;

    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v1

    invoke-virtual {v1}, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->copy()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method subSequenceEquals(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z
    .locals 6

    add-int v0, p2, p5

    .line 211
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-gt v0, v1, :cond_5

    add-int v0, p4, p5

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_2

    .line 214
    :cond_0
    invoke-virtual {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->isCaseSensitive()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p5, :cond_4

    add-int v1, p2, v0

    .line 216
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int v3, p4, v0

    .line 217
    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p5, :cond_4

    add-int v1, p2, v0

    .line 224
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int v3, p4, v0

    .line 225
    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_3

    .line 226
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v5

    if-eq v4, v5, :cond_3

    .line 227
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v1

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    return v2
.end method

.method toParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;
    .locals 1

    .line 407
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 418
    invoke-direct {p0}, Lorg/threeten/bp/format/DateTimeParseContext;->currentParsed()Lorg/threeten/bp/format/DateTimeParseContext$Parsed;

    move-result-object v0

    invoke-virtual {v0}, Lorg/threeten/bp/format/DateTimeParseContext$Parsed;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
