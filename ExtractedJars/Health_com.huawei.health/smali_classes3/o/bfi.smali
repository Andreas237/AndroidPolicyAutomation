.class public Lo/bfi;
.super Lo/bfd;
.source "SourceFile"


# instance fields
.field private e:Lo/bfj;

.field private i:Lo/bfj;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/bfd;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 44
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 46
    const-string v0, "margin_left"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfi;->d:Ljava/lang/String;

    goto :goto_1

    .line 50
    :cond_0
    const-string v0, "margin_top"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfi;->c:Ljava/lang/String;

    goto :goto_1

    .line 54
    :cond_1
    const-string v0, "margin_right"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfi;->a:Ljava/lang/String;

    goto :goto_1

    .line 58
    :cond_2
    const-string v0, "margin_bottom"

    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 60
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bfi;->b:Ljava/lang/String;

    .line 44
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 63
    :cond_4
    return-void
.end method

.method public c(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 135
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 136
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 137
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 138
    invoke-virtual {p0, p1, v3}, Lo/bfi;->a(Landroid/content/Context;Landroid/widget/LinearLayout$LayoutParams;)V

    .line 139
    invoke-virtual {p2, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    iget-object v0, p0, Lo/bfi;->e:Lo/bfj;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lo/bfi;->e:Lo/bfj;

    invoke-virtual {v0, p1, v2}, Lo/bfj;->c(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 145
    :cond_0
    iget-object v0, p0, Lo/bfi;->i:Lo/bfj;

    if-eqz v0, :cond_1

    .line 147
    iget-object v0, p0, Lo/bfi;->i:Lo/bfj;

    invoke-virtual {v0, p1, v2}, Lo/bfj;->c(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 149
    :cond_1
    return-object v2
.end method

.method public d(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 77
    invoke-virtual {p0, p1}, Lo/bfi;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 78
    const/4 v1, 0x1

    .line 79
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 80
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    :goto_0
    if-eqz v1, :cond_3

    .line 82
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 83
    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 87
    :pswitch_0
    const-string v0, "text_key"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    new-instance v0, Lo/bfj;

    invoke-direct {v0}, Lo/bfj;-><init>()V

    iput-object v0, p0, Lo/bfi;->e:Lo/bfj;

    .line 90
    iget-object v0, p0, Lo/bfi;->e:Lo/bfj;

    invoke-virtual {v0, p1}, Lo/bfj;->d(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 92
    :cond_0
    const-string v0, "text_value"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    new-instance v0, Lo/bfj;

    invoke-direct {v0}, Lo/bfj;-><init>()V

    iput-object v0, p0, Lo/bfi;->i:Lo/bfj;

    .line 95
    iget-object v0, p0, Lo/bfi;->i:Lo/bfj;

    invoke-virtual {v0, p1}, Lo/bfj;->d(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 101
    :pswitch_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "text_pair"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    const/4 v1, 0x0

    goto :goto_1

    .line 109
    :pswitch_2
    const/4 v1, 0x0

    .line 110
    .line 117
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 119
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    .line 121
    :cond_2
    goto/16 :goto_0

    .line 123
    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
