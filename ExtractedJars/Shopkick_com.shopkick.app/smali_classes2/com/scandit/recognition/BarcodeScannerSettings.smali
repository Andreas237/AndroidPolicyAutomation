.class public Lcom/scandit/recognition/BarcodeScannerSettings;
.super Lcom/scandit/recognition/NativeHandle;
.source "BarcodeScannerSettings.java"


# static fields
.field public static final CAMERA_FOCUS_MODE_AUTO:I

.field public static final CAMERA_FOCUS_MODE_FIXED:I

.field public static final CAMERA_FOCUS_MODE_MANUAL:I

.field public static final CAMERA_FOCUS_MODE_UNKNOWN:I

.field public static final CODE_LOCATION_HINT:I

.field public static final CODE_LOCATION_RESTRICT:I

.field public static final PRESET_ENABLE_RETAIL_SYMBOLOGIES:I

.field public static final PRESET_ENABLE_SSCC_DECODING:I

.field public static final PRESET_ENABLE_VIN_DECODING:I

.field public static final PRESET_NONE:I


# instance fields
.field private mSymbologySettings:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/scandit/recognition/SymbologySettings;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 98
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PRESET_NONE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->PRESET_NONE:I

    .line 106
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PRESET_ENABLE_RETAIL_SYMBOLOGIES_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->PRESET_ENABLE_RETAIL_SYMBOLOGIES:I

    .line 113
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PRESET_ENABLE_VIN_DECODING_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->PRESET_ENABLE_VIN_DECODING:I

    .line 120
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PRESET_ENABLE_SSCC_DECODING_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->PRESET_ENABLE_SSCC_DECODING:I

    .line 123
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_UNKNOWN_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CAMERA_FOCUS_MODE_UNKNOWN:I

    .line 124
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_FIXED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CAMERA_FOCUS_MODE_FIXED:I

    .line 125
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_AUTO_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CAMERA_FOCUS_MODE_AUTO:I

    .line 126
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_MANUAL_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CAMERA_FOCUS_MODE_MANUAL:I

    .line 139
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_LOCATION_RESTRICT_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_RESTRICT:I

    .line 148
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_LOCATION_HINT_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_HINT:I

    return-void
.end method

.method constructor <init>(I)V
    .locals 2

    .line 227
    invoke-static {p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_new_with_preset(I)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    .line 94
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mSymbologySettings:Landroid/util/SparseArray;

    return-void
.end method

.method constructor <init>(J)V
    .locals 0

    .line 235
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    .line 94
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mSymbologySettings:Landroid/util/SparseArray;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 231
    invoke-static {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->settingsFromJson(Ljava/lang/String;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    .line 94
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mSymbologySettings:Landroid/util/SparseArray;

    return-void
.end method

.method public static createWithJson(Ljava/lang/String;)Lcom/scandit/recognition/BarcodeScannerSettings;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 179
    new-instance v0, Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-direct {v0, p0}, Lcom/scandit/recognition/BarcodeScannerSettings;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static createWithPreset(I)Lcom/scandit/recognition/BarcodeScannerSettings;
    .locals 1

    .line 164
    new-instance v0, Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-direct {v0, p0}, Lcom/scandit/recognition/BarcodeScannerSettings;-><init>(I)V

    return-object v0
.end method

.method private nativeRectToRectF(J)Landroid/graphics/RectF;
    .locals 3

    .line 488
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScRectangleF_position_get(J)J

    move-result-wide v0

    .line 489
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScRectangleF_size_get(J)J

    move-result-wide p1

    .line 490
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScPointF_x_get(J)F

    move-result v2

    .line 491
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScPointF_y_get(J)F

    move-result v0

    .line 492
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScSizeF_width_get(J)F

    move-result v1

    .line 493
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScSizeF_height_get(J)F

    move-result p1

    .line 494
    new-instance p2, Landroid/graphics/RectF;

    add-float/2addr v1, v2

    add-float/2addr p1, v0

    invoke-direct {p2, v2, v0, v1, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p2
.end method

.method private rectFToNativeRect(Landroid/graphics/RectF;)J
    .locals 3

    .line 498
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/scandit/recognition/Native;->sc_rectangle_f_make(FFFF)J

    move-result-wide v0

    return-wide v0
.end method

.method static settingsFromJson(Ljava/lang/String;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 239
    invoke-static {}, Lcom/scandit/recognition/Native;->new_ScError()J

    move-result-wide v0

    .line 240
    invoke-static {p0, v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_new_from_json(Ljava/lang/String;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_0

    .line 244
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScError_message_get(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 246
    :goto_0
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScError(J)V

    if-nez p0, :cond_1

    return-wide v2

    .line 249
    :cond_1
    throw p0
.end method


# virtual methods
.method public clone()Lcom/scandit/recognition/BarcodeScannerSettings;
    .locals 3

    .line 264
    new-instance v0, Lcom/scandit/recognition/BarcodeScannerSettings;

    iget-wide v1, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v1, v2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_clone(J)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/scandit/recognition/BarcodeScannerSettings;-><init>(J)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 92
    invoke-virtual {p0}, Lcom/scandit/recognition/BarcodeScannerSettings;->clone()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v0

    return-object v0
.end method

.method public enableSymbology(IZ)V
    .locals 2

    .line 201
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_symbology_enabled(JII)V

    return-void
.end method

.method public getCodeCachingDuration()I
    .locals 2

    .line 372
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_caching_duration(J)I

    move-result v0

    return v0
.end method

.method public getCodeDirectionHint()I
    .locals 2

    .line 292
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_direction_hint(J)I

    move-result v0

    return v0
.end method

.method public getCodeDuplicateFilter()I
    .locals 2

    .line 354
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_duplicate_filter(J)I

    move-result v0

    return v0
.end method

.method public getCodeLocationArea1d()Landroid/graphics/RectF;
    .locals 2

    .line 450
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_location_area_1d(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->nativeRectToRectF(J)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public getCodeLocationArea2d()Landroid/graphics/RectF;
    .locals 2

    .line 472
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_location_area_2d(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->nativeRectToRectF(J)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public getCodeLocationConstraint1d()I
    .locals 2

    .line 549
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_location_constraint_1d(J)I

    move-result v0

    return v0
.end method

.method public getCodeLocationConstraint2d()I
    .locals 2

    .line 559
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_code_location_constraint_2d(J)I

    move-result v0

    return v0
.end method

.method public getFocusMode()I
    .locals 2

    .line 519
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_focus_mode(J)I

    move-result v0

    return v0
.end method

.method public getMaxNumberOfCodesPerFrame()I
    .locals 2

    .line 410
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_max_number_of_codes_per_frame(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getProperty(Ljava/lang/String;)I
    .locals 2

    .line 311
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_property(JLjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getSearchArea()Landroid/graphics/RectF;
    .locals 2

    .line 426
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_search_area(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->nativeRectToRectF(J)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;
    .locals 3

    .line 214
    iget-object v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mSymbologySettings:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/recognition/SymbologySettings;

    if-eqz v0, :cond_0

    return-object v0

    .line 218
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_get_symbology_settings(JI)J

    move-result-wide v0

    .line 220
    new-instance v2, Lcom/scandit/recognition/SymbologySettings;

    invoke-direct {v2, v0, v1}, Lcom/scandit/recognition/SymbologySettings;-><init>(J)V

    .line 221
    iget-object v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mSymbologySettings:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method protected release(J)V
    .locals 0

    .line 564
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_release(J)V

    return-void
.end method

.method public setCodeCachingDuration(I)V
    .locals 2

    .line 383
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_caching_duration(JI)V

    return-void
.end method

.method public setCodeDirectionHint(I)V
    .locals 2

    .line 276
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_direction_hint(JI)V

    return-void
.end method

.method public setCodeDuplicateFilter(I)V
    .locals 2

    .line 335
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_duplicate_filter(JI)V

    return-void
.end method

.method public setCodeLocationArea1d(Landroid/graphics/RectF;)V
    .locals 4

    .line 460
    invoke-direct {p0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->rectFToNativeRect(Landroid/graphics/RectF;)J

    move-result-wide v0

    .line 461
    iget-wide v2, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v2, v3, v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_location_area_1d(JJ)V

    .line 462
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScRectangleF(J)V

    return-void
.end method

.method public setCodeLocationArea2d(Landroid/graphics/RectF;)V
    .locals 4

    .line 482
    invoke-direct {p0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->rectFToNativeRect(Landroid/graphics/RectF;)J

    move-result-wide v0

    .line 483
    iget-wide v2, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v2, v3, v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_location_area_2d(JJ)V

    .line 484
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScRectangleF(J)V

    return-void
.end method

.method public setCodeLocationConstraint1d(I)V
    .locals 2

    .line 529
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_location_constraint_1d(JI)V

    return-void
.end method

.method public setCodeLocationConstraint2d(I)V
    .locals 2

    .line 539
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_code_location_constraint_2d(JI)V

    return-void
.end method

.method public setFocusMode(I)V
    .locals 2

    .line 508
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_focus_mode(JI)V

    return-void
.end method

.method public setMaxNumberOfCodesPerFrame(I)V
    .locals 4

    .line 399
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_max_number_of_codes_per_frame(JJ)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;I)V
    .locals 2

    .line 323
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v0, v1, p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_property(JLjava/lang/String;I)V

    return-void
.end method

.method public setSearchArea(Landroid/graphics/RectF;)V
    .locals 4

    .line 438
    invoke-direct {p0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->rectFToNativeRect(Landroid/graphics/RectF;)J

    move-result-wide v0

    .line 439
    iget-wide v2, p0, Lcom/scandit/recognition/BarcodeScannerSettings;->mNative:J

    invoke-static {v2, v3, v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_search_area(JJ)V

    .line 440
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScRectangleF(J)V

    return-void
.end method
