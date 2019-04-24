.class public Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;
.super Ljava/lang/Object;
.source "TextRecognitionSettings.java"


# instance fields
.field public areaLandscape:Landroid/graphics/RectF;

.field public areaPortrait:Landroid/graphics/RectF;

.field public characterWhitelist:Lcom/scandit/barcodepicker/ocr/CharacterSet;

.field private properties:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public regex:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const v3, 0x3ecccccd    # 0.4f

    const v4, 0x3f19999a    # 0.6f

    invoke-direct {v0, v2, v3, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaPortrait:Landroid/graphics/RectF;

    .line 55
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v3, 0x3ec00000    # 0.375f

    const/high16 v4, 0x3f200000    # 0.625f

    invoke-direct {v0, v2, v3, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaLandscape:Landroid/graphics/RectF;

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->regex:Ljava/util/regex/Pattern;

    .line 76
    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->characterWhitelist:Lcom/scandit/barcodepicker/ocr/CharacterSet;

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 5

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const v3, 0x3ecccccd    # 0.4f

    const v4, 0x3f19999a    # 0.6f

    invoke-direct {v0, v2, v3, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaPortrait:Landroid/graphics/RectF;

    .line 55
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v3, 0x3ec00000    # 0.375f

    const/high16 v4, 0x3f200000    # 0.625f

    invoke-direct {v0, v2, v3, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaLandscape:Landroid/graphics/RectF;

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->regex:Ljava/util/regex/Pattern;

    .line 76
    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->characterWhitelist:Lcom/scandit/barcodepicker/ocr/CharacterSet;

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    .line 95
    iput-object p1, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->regex:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 124
    invoke-direct {p0}, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;-><init>()V

    const-string v0, "areaLandscape"

    const/4 v1, 0x0

    .line 126
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "areaPortrait"

    .line 127
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaPortrait:Landroid/graphics/RectF;

    :cond_0
    const-string v0, "areaLandscape"

    .line 129
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "areaLandscape"

    .line 130
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaLandscape:Landroid/graphics/RectF;

    :cond_1
    const-string v0, "regex"

    .line 132
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    const-string v0, "regex"

    const-string v2, ""

    .line 134
    invoke-static {p1, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->regex:Ljava/util/regex/Pattern;
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 136
    :catch_0
    new-instance p1, Lcom/scandit/base/util/JSONParseException;

    const-string v0, "\'regex\' must be a valid regular expression"

    invoke-direct {p1, v0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const-string v0, "characterWhitelist"

    .line 139
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 140
    new-instance v0, Lcom/scandit/barcodepicker/ocr/CharacterSet;

    const-string v2, "characterWhitelist"

    const-string v3, ""

    invoke-static {p1, v2, v3}, Lcom/scandit/base/util/JSONHelpers;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/scandit/barcodepicker/ocr/CharacterSet;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->characterWhitelist:Lcom/scandit/barcodepicker/ocr/CharacterSet;

    :cond_3
    const-string v0, "fonts"

    .line 143
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    :try_start_1
    const-string v0, "fonts"

    .line 145
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 146
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    move v3, v1

    .line 147
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 148
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 149
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_4

    .line 150
    check-cast v4, Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 153
    :cond_5
    iget-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    const-string v3, "fonts"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 155
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_6
    :goto_2
    const-string v0, "blurrinessFilter"

    .line 159
    invoke-static {p1, v0, v1}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    :try_start_2
    const-string v0, "blurrinessFilter"

    .line 161
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 162
    iget-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    const-string v1, "blurrinessFilter"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    .line 164
    :catch_2
    new-instance p1, Lcom/scandit/base/util/JSONParseException;

    const-string v0, "\'blurrinessFilter\' must be a boolean"

    invoke-direct {p1, v0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_3
    return-void
.end method


# virtual methods
.method public clone()Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;
    .locals 3

    .line 174
    new-instance v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;-><init>()V

    .line 175
    iget-object v1, v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaLandscape:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaLandscape:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 176
    iget-object v1, v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaPortrait:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->areaPortrait:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 177
    iget-object v1, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->regex:Ljava/util/regex/Pattern;

    iput-object v1, v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->regex:Ljava/util/regex/Pattern;

    .line 178
    iget-object v1, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->characterWhitelist:Lcom/scandit/barcodepicker/ocr/CharacterSet;

    iput-object v1, v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->characterWhitelist:Lcom/scandit/barcodepicker/ocr/CharacterSet;

    .line 179
    iget-object v1, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    iput-object v1, v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->clone()Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    move-result-object v0

    return-object v0
.end method

.method public getProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    return-object v0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->properties:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
