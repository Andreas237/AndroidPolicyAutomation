.class public abstract Lo/bfd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 107
    const/4 v2, 0x0

    .line 108
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    const-string v0, "dp"

    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lo/bfd;->e(Landroid/content/Context;F)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 117
    goto :goto_0

    .line 114
    :catch_0
    move-exception v3

    .line 116
    const-string v0, "BaseItem"

    const-string v1, "getMargin NumberFormatException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :cond_0
    :goto_0
    return v2
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 1

    .line 93
    iget-object v0, p0, Lo/bfd;->d:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bfd;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 94
    iget-object v0, p0, Lo/bfd;->c:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bfd;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 95
    iget-object v0, p0, Lo/bfd;->a:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bfd;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 96
    iget-object v0, p0, Lo/bfd;->b:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bfd;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 97
    return-void
.end method

.method protected abstract a(Lorg/xmlpull/v1/XmlPullParser;)V
.end method

.method public abstract d(Lorg/xmlpull/v1/XmlPullParser;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected e(Landroid/content/Context;F)I
    .locals 3

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 82
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
