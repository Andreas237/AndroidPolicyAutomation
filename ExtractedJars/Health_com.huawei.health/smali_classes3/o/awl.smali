.class public Lo/awl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/awl;->a:I

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lo/awl;->b:I

    .line 37
    return-void
.end method

.method private a(I)V
    .locals 0

    .line 47
    iput p1, p0, Lo/awl;->a:I

    .line 48
    return-void
.end method

.method private c(Ljava/lang/String;)I
    .locals 4

    .line 86
    const/4 v2, -0x1

    .line 90
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v2, v0

    .line 99
    goto :goto_0

    .line 92
    :catch_0
    move-exception v3

    .line 94
    const-string v0, "SiteInfo"

    const-string v1, "stringConvertToInt NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    goto :goto_0

    .line 96
    :catch_1
    move-exception v3

    .line 98
    const-string v0, "SiteInfo"

    const-string v1, "stringConvertToInt Exception"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    :goto_0
    return v2
.end method

.method private d(I)V
    .locals 0

    .line 58
    iput p1, p0, Lo/awl;->b:I

    .line 59
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 41
    iget v0, p0, Lo/awl;->a:I

    .line 42
    return v0
.end method

.method public c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 66
    const-string v0, "site"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 70
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "id"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awl;->c(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/awl;->a(I)V

    goto :goto_1

    .line 74
    :cond_0
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sns"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awl;->c(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/awl;->d(I)V

    .line 68
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 82
    :cond_2
    return-void
.end method
