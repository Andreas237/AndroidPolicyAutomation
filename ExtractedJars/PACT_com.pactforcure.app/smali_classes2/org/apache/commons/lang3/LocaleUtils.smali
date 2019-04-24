.class public Lorg/apache/commons/lang3/LocaleUtils;
.super Ljava/lang/Object;
.source "LocaleUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/LocaleUtils$SyncAvoid;
    }
.end annotation


# static fields
.field private static final cCountriesByLanguage:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final cLanguagesByCountry:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/LocaleUtils;->cLanguagesByCountry:Ljava/util/concurrent/ConcurrentMap;

    .line 46
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/LocaleUtils;->cCountriesByLanguage:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    return-void
.end method

.method public static availableLocaleList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 189
    invoke-static {}, Lorg/apache/commons/lang3/LocaleUtils$SyncAvoid;->access$000()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static availableLocaleSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 203
    invoke-static {}, Lorg/apache/commons/lang3/LocaleUtils$SyncAvoid;->access$100()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static countriesByLanguage(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .param p0, "languageCode"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 260
    if-nez p0, :cond_1

    .line 261
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 279
    :cond_0
    :goto_0
    return-object v0

    .line 263
    :cond_1
    sget-object v4, Lorg/apache/commons/lang3/LocaleUtils;->cCountriesByLanguage:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, p0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 264
    .local v0, "countries":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    if-nez v0, :cond_0

    .line 265
    new-instance v0, Ljava/util/ArrayList;

    .end local v0    # "countries":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .restart local v0    # "countries":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    invoke-static {}, Lorg/apache/commons/lang3/LocaleUtils;->availableLocaleList()Ljava/util/List;

    move-result-object v3

    .line 267
    .local v3, "locales":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_3

    .line 268
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Locale;

    .line 269
    .local v2, "locale":Ljava/util/Locale;
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    .line 272
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 275
    .end local v2    # "locale":Ljava/util/Locale;
    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 276
    sget-object v4, Lorg/apache/commons/lang3/LocaleUtils;->cCountriesByLanguage:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, p0, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    sget-object v4, Lorg/apache/commons/lang3/LocaleUtils;->cCountriesByLanguage:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, p0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "countries":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    check-cast v0, Ljava/util/List;

    .restart local v0    # "countries":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    goto :goto_0
.end method

.method public static isAvailableLocale(Ljava/util/Locale;)Z
    .locals 1
    .param p0, "locale"    # Ljava/util/Locale;

    .prologue
    .line 214
    invoke-static {}, Lorg/apache/commons/lang3/LocaleUtils;->availableLocaleList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static languagesByCountry(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .param p0, "countryCode"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 228
    if-nez p0, :cond_1

    .line 229
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 246
    :cond_0
    :goto_0
    return-object v1

    .line 231
    :cond_1
    sget-object v4, Lorg/apache/commons/lang3/LocaleUtils;->cLanguagesByCountry:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, p0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 232
    .local v1, "langs":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    if-nez v1, :cond_0

    .line 233
    new-instance v1, Ljava/util/ArrayList;

    .end local v1    # "langs":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .restart local v1    # "langs":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    invoke-static {}, Lorg/apache/commons/lang3/LocaleUtils;->availableLocaleList()Ljava/util/List;

    move-result-object v3

    .line 235
    .local v3, "locales":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_3

    .line 236
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Locale;

    .line 237
    .local v2, "locale":Ljava/util/Locale;
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    .line 239
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 242
    .end local v2    # "locale":Ljava/util/Locale;
    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 243
    sget-object v4, Lorg/apache/commons/lang3/LocaleUtils;->cLanguagesByCountry:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, p0, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    sget-object v4, Lorg/apache/commons/lang3/LocaleUtils;->cLanguagesByCountry:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, p0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "langs":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    check-cast v1, Ljava/util/List;

    .restart local v1    # "langs":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    goto :goto_0
.end method

.method public static localeLookupList(Ljava/util/Locale;)Ljava/util/List;
    .locals 1
    .param p0, "locale"    # Ljava/util/Locale;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 140
    invoke-static {p0, p0}, Lorg/apache/commons/lang3/LocaleUtils;->localeLookupList(Ljava/util/Locale;Ljava/util/Locale;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static localeLookupList(Ljava/util/Locale;Ljava/util/Locale;)Ljava/util/List;
    .locals 4
    .param p0, "locale"    # Ljava/util/Locale;
    .param p1, "defaultLocale"    # Ljava/util/Locale;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Ljava/util/Locale;>;"
    if-eqz p0, :cond_2

    .line 164
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    invoke-virtual {p0}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 166
    new-instance v1, Ljava/util/Locale;

    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    :cond_0
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 169
    new-instance v1, Ljava/util/Locale;

    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 172
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    :cond_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public static toLocale(Ljava/lang/String;)Ljava/util/Locale;
    .locals 11
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    const/16 v10, 0x5f

    const/4 v9, 0x3

    const/4 v8, 0x0

    const/4 v7, 0x5

    const/4 v6, 0x2

    .line 89
    if-nez p0, :cond_0

    .line 90
    const/4 v5, 0x0

    .line 121
    :goto_0
    return-object v5

    .line 92
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 93
    .local v4, "len":I
    if-eq v4, v6, :cond_1

    if-eq v4, v7, :cond_1

    const/4 v5, 0x7

    if-ge v4, v5, :cond_1

    .line 94
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid locale format: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 96
    :cond_1
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 97
    .local v0, "ch0":C
    const/4 v5, 0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 98
    .local v1, "ch1":C
    const/16 v5, 0x61

    if-lt v0, v5, :cond_2

    const/16 v5, 0x7a

    if-gt v0, v5, :cond_2

    const/16 v5, 0x61

    if-lt v1, v5, :cond_2

    const/16 v5, 0x7a

    if-le v1, v5, :cond_3

    .line 99
    :cond_2
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid locale format: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 101
    :cond_3
    if-ne v4, v6, :cond_4

    .line 102
    new-instance v5, Ljava/util/Locale;

    const-string v6, ""

    invoke-direct {v5, p0, v6}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v10, :cond_5

    .line 105
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid locale format: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 107
    :cond_5
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 108
    .local v2, "ch3":C
    if-ne v2, v10, :cond_6

    .line 109
    new-instance v5, Ljava/util/Locale;

    invoke-virtual {p0, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    const/4 v8, 0x4

    invoke-virtual {p0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v6, v7, v8}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 111
    :cond_6
    const/4 v5, 0x4

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 112
    .local v3, "ch4":C
    const/16 v5, 0x41

    if-lt v2, v5, :cond_7

    const/16 v5, 0x5a

    if-gt v2, v5, :cond_7

    const/16 v5, 0x41

    if-lt v3, v5, :cond_7

    const/16 v5, 0x5a

    if-le v3, v5, :cond_8

    .line 113
    :cond_7
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid locale format: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 115
    :cond_8
    if-ne v4, v7, :cond_9

    .line 116
    new-instance v5, Ljava/util/Locale;

    invoke-virtual {p0, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v9, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 118
    :cond_9
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v10, :cond_a

    .line 119
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid locale format: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 121
    :cond_a
    new-instance v5, Ljava/util/Locale;

    invoke-virtual {p0, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v9, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    invoke-virtual {p0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v6, v7, v8}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
