.class public Lo/bfe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bfd;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Lo/bfe;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bfe;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bfe;->e:Z

    .line 66
    iput-object p1, p0, Lo/bfe;->d:Ljava/lang/String;

    .line 68
    invoke-direct {p0, p1}, Lo/bfe;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-direct {p0}, Lo/bfe;->d()V

    .line 72
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 117
    const/4 v1, 0x0

    .line 119
    const/4 v2, 0x0

    .line 120
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 122
    iget-object v0, p0, Lo/bfe;->c:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 124
    iget-object v0, p0, Lo/bfe;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bfd;

    .line 126
    instance-of v0, v5, Lo/bfj;

    if-eqz v0, :cond_0

    .line 128
    move-object v1, v5

    check-cast v1, Lo/bfj;

    .line 129
    invoke-virtual {v1, p1, v3}, Lo/bfj;->c(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    goto :goto_1

    .line 131
    :cond_0
    instance-of v0, v5, Lo/bfi;

    if-eqz v0, :cond_1

    .line 133
    move-object v2, v5

    check-cast v2, Lo/bfi;

    .line 134
    invoke-virtual {v2, p1, v3}, Lo/bfi;->c(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 136
    :cond_1
    :goto_1
    goto :goto_0

    .line 138
    :cond_2
    return-object v3
.end method

.method private d()V
    .locals 10

    .line 146
    const/4 v3, 0x0

    .line 147
    const/4 v4, 0x0

    .line 148
    const/4 v5, 0x0

    .line 151
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v6

    .line 152
    invoke-virtual {v6}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v3

    .line 153
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lo/bfe;->d:Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v5, v0

    .line 154
    const-string v0, "UTF-8"

    invoke-interface {v3, v5, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 156
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v7

    :goto_0
    const/4 v0, 0x1

    if-eq v0, v7, :cond_2

    .line 159
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    .line 161
    const/4 v0, 0x2

    if-ne v7, v0, :cond_1

    .line 163
    const-string v0, "hw_sns_notice"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bfe;->c:Ljava/util/List;

    .line 167
    :cond_0
    invoke-direct {p0, v3, v8}, Lo/bfe;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/bfd;

    move-result-object v4

    .line 168
    iget-object v0, p0, Lo/bfe;->c:Ljava/util/List;

    if-eqz v0, :cond_1

    if-eqz v4, :cond_1

    .line 170
    iget-object v0, p0, Lo/bfe;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    :cond_1
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v7

    goto :goto_0

    .line 187
    :cond_2
    if-eqz v5, :cond_4

    .line 189
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    goto :goto_1

    .line 175
    :catch_0
    move-exception v6

    .line 177
    :try_start_1
    sget-object v0, Lo/bfe;->a:Ljava/lang/String;

    const-string v1, "parseXml XmlPullParserException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfe;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    if-eqz v5, :cond_4

    .line 189
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    goto :goto_1

    .line 180
    :catch_1
    move-exception v6

    .line 182
    :try_start_2
    sget-object v0, Lo/bfe;->a:Ljava/lang/String;

    const-string v1, "parseXml IOException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfe;->e:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    if-eqz v5, :cond_4

    .line 189
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    goto :goto_1

    .line 187
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_3

    .line 189
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 191
    :cond_3
    throw v9

    .line 192
    :cond_4
    :goto_1
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 1

    .line 224
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "<hw_sns_notice>"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/bfd;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 204
    const/4 v1, 0x0

    .line 205
    const-string v0, "text_item"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    new-instance v1, Lo/bfj;

    invoke-direct {v1}, Lo/bfj;-><init>()V

    .line 208
    invoke-virtual {v1, p1}, Lo/bfd;->d(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 210
    :cond_0
    const-string v0, "text_pair"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    new-instance v1, Lo/bfi;

    invoke-direct {v1}, Lo/bfi;-><init>()V

    .line 213
    invoke-virtual {v1, p1}, Lo/bfd;->d(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 216
    :cond_1
    :goto_0
    return-object v1
.end method


# virtual methods
.method public b(Landroid/content/Context;)Landroid/view/View;
    .locals 4

    .line 90
    const/4 v2, 0x0

    .line 91
    iget-object v0, p0, Lo/bfe;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 93
    iget-object v0, p0, Lo/bfe;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/bfe;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/bfe;->e:Z

    if-eqz v0, :cond_0

    .line 95
    invoke-direct {p0, p1}, Lo/bfe;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    .line 99
    :cond_0
    new-instance v3, Lo/bmy;

    invoke-direct {v3, p1}, Lo/bmy;-><init>(Landroid/content/Context;)V

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_assist_chat_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v0}, Lo/bmy;->setTextSize(IF)V

    .line 101
    iget-object v0, p0, Lo/bfe;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/bmy;->setText(Ljava/lang/CharSequence;)V

    .line 102
    move-object v2, v3

    .line 105
    :cond_1
    :goto_0
    return-object v2
.end method

.method public b()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lo/bfe;->e:Z

    return v0
.end method
