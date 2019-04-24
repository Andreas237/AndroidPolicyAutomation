.class public Lo/fhc;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fhc$d;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/regex/Pattern;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 48
    iput-object p2, p0, Lo/fhc;->a:Ljava/util/List;

    .line 49
    iput-object p1, p0, Lo/fhc;->e:Landroid/content/Context;

    .line 50
    const-string v0, "assets://(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lo/fhc;->d:Ljava/util/regex/Pattern;

    .line 51
    return-void
.end method

.method private a(Ljava/io/Closeable;)V
    .locals 5

    .line 165
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 166
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    :cond_0
    goto :goto_0

    .line 168
    :catch_0
    move-exception v4

    .line 169
    const-string v0, "MessageCenterListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeStream:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 54
    iput-object p1, p0, Lo/fhc;->a:Ljava/util/List;

    .line 55
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 59
    iget-object v0, p0, Lo/fhc;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 4

    .line 64
    iget-object v0, p0, Lo/fhc;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 65
    :cond_0
    const-string v0, "MessageCenterListAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getItem = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_1
    iget-object v0, p0, Lo/fhc;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 74
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 15

    .line 81
    if-nez p2, :cond_0

    .line 82
    iget-object v0, p0, Lo/fhc;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    .line 83
    sget v0, Lcom/huawei/ui/main/R$layout;->message_center_item:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 84
    new-instance v4, Lo/fhc$d;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/fhc$d;-><init>(Lo/fhc$2;)V

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->MessageCenter_titleleft_tv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, v4, Lo/fhc$d;->b:Lo/egb;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->MessageCenter_content_tv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, v4, Lo/fhc$d;->a:Lo/egb;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->MessageCenter_head_40iv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/fhc$d;->d:Landroid/widget/ImageView;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->MessageCenter_content_underline:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/fhc$d;->e:Landroid/widget/ImageView;

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->MessageCenter_titleright_redpoint:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/fhc$d;->c:Landroid/widget/ImageView;

    .line 90
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fhc$d;

    .line 94
    :goto_0
    iget-object v0, p0, Lo/fhc;->a:Ljava/util/List;

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 95
    iget-object v0, v4, Lo/fhc$d;->b:Lo/egb;

    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 96
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgContent()Ljava/lang/String;

    move-result-object v6

    .line 97
    iget-object v0, v4, Lo/fhc$d;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fhc;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move/from16 v2, p1

    if-ne v2, v1, :cond_1

    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 98
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    iget-object v0, v4, Lo/fhc$d;->a:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_2

    .line 101
    :cond_2
    iget-object v0, v4, Lo/fhc$d;->a:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 102
    iget-object v0, v4, Lo/fhc$d;->a:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 104
    :goto_2
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v7

    .line 105
    const-string v0, "MessageCenterListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "imgUri:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    if-nez v7, :cond_3

    .line 108
    iget-object v0, v4, Lo/fhc$d;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fhc;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_default_message_icon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    return-object p2

    .line 111
    :cond_3
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 112
    invoke-virtual {v8}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v9

    .line 114
    const-string v0, "http"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 115
    :cond_4
    iget-object v0, p0, Lo/fhc;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lo/fhc;->e:Landroid/content/Context;

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lo/fhc;->e:Landroid/content/Context;

    .line 116
    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    .line 115
    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_default_message_icon:I

    .line 117
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->placeholder(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, v4, Lo/fhc$d;->d:Landroid/widget/ImageView;

    .line 118
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 119
    return-object p2

    .line 121
    :cond_5
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    const-string v1, "messagecenter://nps_question"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 122
    iget-object v0, v4, Lo/fhc$d;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 124
    :cond_6
    iget-object v0, v4, Lo/fhc$d;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 126
    :goto_3
    const-string v0, "assets"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 127
    iget-object v0, p0, Lo/fhc;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    .line 128
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :cond_7
    const-string v11, ""

    .line 129
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v11, :cond_a

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 130
    const/4 v12, 0x0

    .line 132
    :try_start_0
    iget-object v0, p0, Lo/fhc;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v12, v0

    .line 133
    const/4 v0, 0x0

    if-ne v0, v12, :cond_8

    .line 134
    const-string v0, "MessageCenterListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getView inputStream = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    move-object/from16 v13, p2

    .line 143
    invoke-direct {p0, v12}, Lo/fhc;->a(Ljava/io/Closeable;)V

    .line 135
    return-object v13

    .line 137
    :cond_8
    :try_start_1
    invoke-static {v12}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 138
    iget-object v0, v4, Lo/fhc$d;->d:Landroid/widget/ImageView;

    if-eqz v13, :cond_9

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v13}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    goto :goto_5

    :cond_9
    const/4 v1, 0x0

    :goto_5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    invoke-direct {p0, v12}, Lo/fhc;->a(Ljava/io/Closeable;)V

    .line 144
    goto :goto_6

    .line 140
    :catch_0
    move-exception v13

    .line 141
    const-string v0, "MessageCenterListAdapter"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    invoke-direct {p0, v12}, Lo/fhc;->a(Ljava/io/Closeable;)V

    .line 144
    goto :goto_6

    .line 143
    :catchall_0
    move-exception v14

    invoke-direct {p0, v12}, Lo/fhc;->a(Ljava/io/Closeable;)V

    .line 144
    throw v14

    .line 145
    :goto_6
    goto :goto_7

    .line 147
    :cond_a
    iget-object v0, v4, Lo/fhc$d;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fhc;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_default_message_icon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 149
    :goto_7
    return-object p2

    .line 152
    :cond_b
    iget-object v0, v4, Lo/fhc$d;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/fhc;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_default_message_icon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    return-object p2
.end method
