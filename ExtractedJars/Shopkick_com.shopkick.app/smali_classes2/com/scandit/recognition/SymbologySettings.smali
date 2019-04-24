.class public Lcom/scandit/recognition/SymbologySettings;
.super Lcom/scandit/recognition/NativeHandle;
.source "SymbologySettings.java"


# static fields
.field public static final CHECKSUM_MOD_10:I

.field public static final CHECKSUM_MOD_1010:I

.field public static final CHECKSUM_MOD_103:I

.field public static final CHECKSUM_MOD_11:I

.field public static final CHECKSUM_MOD_1110:I

.field public static final CHECKSUM_MOD_16:I

.field public static final CHECKSUM_MOD_43:I

.field public static final CHECKSUM_MOD_47:I

.field public static final CHECKSUM_NONE:I

.field public static final EXTENSION_FULL_ASCII:Ljava/lang/String; = "full_ascii"

.field public static final EXTENSION_REMOVE_LEADING_ZERO:Ljava/lang/String; = "remove_leading_zero"

.field public static final EXTENSION_TINY:Ljava/lang/String; = "tiny"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_NONE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_NONE:I

    .line 34
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_10_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_10:I

    .line 38
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_11_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_11:I

    .line 42
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_47_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_47:I

    .line 46
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_43_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_43:I

    .line 50
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_103_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_103:I

    .line 54
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_1010_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_1010:I

    .line 58
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_1110_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_1110:I

    .line 62
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CHECKSUM_MOD_16_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/SymbologySettings;->CHECKSUM_MOD_16:I

    return-void
.end method

.method constructor <init>(J)V
    .locals 0

    .line 97
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    .line 98
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_symbology_settings_retain(J)V

    return-void
.end method


# virtual methods
.method public getActiveSymbolCounts()[S
    .locals 4

    .line 255
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_get_active_symbol_counts_length(J)I

    move-result v0

    .line 257
    new-array v1, v0, [B

    .line 260
    iget-wide v2, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v2, v3, v1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_fill_active_symbol_counts(J[B)V

    .line 261
    new-array v0, v0, [S

    const/4 v2, 0x0

    .line 262
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    .line 263
    aget-byte v3, v1, v2

    int-to-short v3, v3

    aput-short v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getChecksums()I
    .locals 2

    .line 212
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_get_checksums(J)I

    move-result v0

    return v0
.end method

.method public getEnabledExtensions()[Ljava/lang/String;
    .locals 6

    .line 288
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v1, 0x0

    .line 291
    :try_start_0
    iget-wide v3, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v3, v4}, Lcom/scandit/recognition/Native;->sc_symbology_settings_get_enabled_extensions(J)J

    move-result-wide v1

    const/4 v3, 0x0

    .line 294
    invoke-static {v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_string_array_get_at(JI)Ljava/lang/String;

    move-result-object v4

    move v5, v3

    :goto_0
    if-eqz v4, :cond_0

    .line 296
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    .line 298
    invoke-static {v1, v2, v5}, Lcom/scandit/recognition/Native;->sc_string_array_get_at(JI)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 301
    :cond_0
    invoke-static {v1, v2}, Lcom/scandit/recognition/Native;->sc_string_array_free(J)V

    .line 303
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    .line 304
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v3, v2, :cond_1

    .line 305
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object v1

    :catchall_0
    move-exception v0

    .line 301
    invoke-static {v1, v2}, Lcom/scandit/recognition/Native;->sc_string_array_free(J)V

    throw v0
.end method

.method public getSymbology()I
    .locals 2

    .line 234
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_get_symbology(J)I

    move-result v0

    return v0
.end method

.method public isColorInvertedEnabled()Z
    .locals 2

    .line 139
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_is_color_inverted_enabled(J)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEnabled()Z
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_is_enabled(J)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isExtensionEnabled(Ljava/lang/String;)Z
    .locals 2

    .line 194
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_is_extension_enabled(JLjava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected release(J)V
    .locals 0

    .line 103
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_symbology_settings_release(J)V

    return-void
.end method

.method public setActiveSymbolCounts([S)V
    .locals 3

    .line 278
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    array-length v2, p1

    invoke-static {v0, v1, p1, v2}, Lcom/scandit/recognition/Native;->sc_symbology_settings_set_active_symbol_counts2(J[SI)V

    return-void
.end method

.method public setChecksums(I)V
    .locals 2

    .line 226
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_set_checksums(JI)V

    return-void
.end method

.method public setColorInvertedEnabled(Z)V
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_set_color_inverted_enabled(JI)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 152
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_symbology_settings_set_enabled(JI)V

    return-void
.end method

.method public setExtensionEnabled(Ljava/lang/String;Z)V
    .locals 2

    .line 178
    iget-wide v0, p0, Lcom/scandit/recognition/SymbologySettings;->mNative:J

    invoke-static {v0, v1, p1, p2}, Lcom/scandit/recognition/Native;->sc_symbology_settings_set_extension_enabled(JLjava/lang/String;I)V

    return-void
.end method
