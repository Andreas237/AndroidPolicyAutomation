.class public Lcom/scandit/barcodepicker/ScanAreaSettings;
.super Ljava/lang/Object;
.source "ScanAreaSettings.java"


# static fields
.field public static final DIRECTION_HORIZONTAL:I = 0x2

.field public static final DIRECTION_VERTICAL:I = 0x1


# instance fields
.field public primaryDirection:I

.field public searchArea:Landroid/graphics/RectF;

.field public squareCodeLocationArea:Landroid/graphics/RectF;

.field public squareCodeLocationConstraint:I

.field public wideCodeLocationArea:Landroid/graphics/RectF;

.field public wideCodeLocationConstraint:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    sget v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_HINT:I

    iput v0, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    .line 68
    sget v0, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_HINT:I

    iput v0, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    .line 77
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    .line 86
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v2, v2, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    .line 97
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v2, v2, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    const/4 v0, 0x2

    .line 110
    iput v0, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->primaryDirection:I

    return-void
.end method

.method private static constraintFromString(Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    const-string v0, "restrict"

    .line 150
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    sget p0, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_RESTRICT:I

    return p0

    :cond_0
    const-string v0, "hint"

    .line 153
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    sget p0, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_HINT:I

    return p0

    .line 156
    :cond_1
    new-instance v0, Lcom/scandit/base/util/JSONParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid constraint \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'. Must be hint or restrict"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createDefaultLandscapeSettings()Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 6

    .line 133
    new-instance v0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    .line 134
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    const/4 v2, 0x0

    const v3, 0x3ecccccd    # 0.4f

    const/high16 v4, 0x3f800000    # 1.0f

    const v5, 0x3f19999a    # 0.6f

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    return-object v0
.end method

.method public static createDefaultPortraitSettings()Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 6

    .line 122
    new-instance v0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    .line 123
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    const/4 v2, 0x0

    const/high16 v3, 0x3ec00000    # 0.375f

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f200000    # 0.625f

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    return-object v0
.end method

.method public static createWithJson(Lorg/json/JSONObject;)Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 187
    new-instance v0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    const-string v1, "wideCodeLocationArea"

    const/4 v2, 0x0

    .line 188
    invoke-static {p0, v1, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "wideCodeLocationArea"

    .line 189
    invoke-static {p0, v1, v2}, Lcom/scandit/base/util/JSONHelpers;->getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;

    move-result-object v1

    iput-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    :cond_0
    const-string v1, "wideCodeLocationConstraint"

    const-string v3, "hint"

    .line 193
    invoke-static {p0, v1, v3}, Lcom/scandit/base/util/JSONHelpers;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/scandit/barcodepicker/ScanAreaSettings;->constraintFromString(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    const-string v1, "squareCodeLocationArea"

    .line 194
    invoke-static {p0, v1, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "squareCodeLocationArea"

    .line 195
    invoke-static {p0, v1, v2}, Lcom/scandit/base/util/JSONHelpers;->getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;

    move-result-object v1

    iput-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    :cond_1
    const-string v1, "squareCodeLocationConstraint"

    const-string v2, "hint"

    .line 198
    invoke-static {p0, v1, v2}, Lcom/scandit/base/util/JSONHelpers;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/scandit/barcodepicker/ScanAreaSettings;->constraintFromString(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    const-string v1, "primaryDirection"

    const-string v2, "horizontal"

    .line 199
    invoke-static {p0, v1, v2}, Lcom/scandit/base/util/JSONHelpers;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 200
    invoke-static {p0}, Lcom/scandit/barcodepicker/ScanAreaSettings;->directionFromString(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->primaryDirection:I

    return-object v0
.end method

.method private static directionFromString(Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    const-string v0, "vertical"

    .line 160
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "horizontal"

    .line 163
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    .line 166
    :cond_1
    new-instance v0, Lcom/scandit/base/util/JSONParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid direction \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'. Must be vertical or horizontal"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public clone()Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 3

    .line 139
    new-instance v0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    .line 140
    iget v1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    iput v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    .line 141
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 142
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 143
    iget v1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    iput v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    .line 144
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 145
    iget v1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->primaryDirection:I

    iput v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->primaryDirection:I

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 41
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/ScanAreaSettings;->clone()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    return-object v0
.end method
