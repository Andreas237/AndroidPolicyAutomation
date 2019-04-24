.class public Lo/awo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lo/awo;->d:Ljava/lang/String;

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/awo;->e:I

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lo/awo;->b:I

    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 4

    .line 119
    const/4 v2, -0x1

    .line 123
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v2, v0

    .line 132
    goto :goto_0

    .line 125
    :catch_0
    move-exception v3

    .line 127
    const-string v0, "SiteCountryInfo"

    const-string v1, "stringConvertToInt NumberFormatException."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    goto :goto_0

    .line 129
    :catch_1
    move-exception v3

    .line 131
    const-string v0, "SiteCountryInfo"

    const-string v1, "stringConvertToInt RuntimeException."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    :goto_0
    return v2
.end method

.method private a(I)V
    .locals 0

    .line 41
    iput p1, p0, Lo/awo;->e:I

    .line 42
    return-void
.end method

.method private b(I)V
    .locals 0

    .line 61
    iput p1, p0, Lo/awo;->b:I

    .line 62
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/awo;->d:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public d(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 90
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 92
    const-string v0, "country"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 94
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 96
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "site-id"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awo;->a(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/awo;->a(I)V

    goto :goto_1

    .line 100
    :cond_0
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "iso-2code"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awo;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 104
    :cond_1
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sns"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awo;->a(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/awo;->b(I)V

    .line 94
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 111
    :cond_3
    return-void
.end method
