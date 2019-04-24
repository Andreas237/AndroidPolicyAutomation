.class public Lo/dxy;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dvz;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/dvz;>;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dxy;->b:Ljava/util/List;

    .line 51
    iput-object p1, p0, Lo/dxy;->e:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lo/dxy;->b:Ljava/util/List;

    .line 54
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .line 159
    const/4 v2, 0x0

    .line 160
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 161
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 163
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 165
    :try_start_0
    invoke-static {p1, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 168
    goto :goto_0

    .line 166
    :catch_0
    move-exception v5

    .line 167
    const-string v0, "PLGACHIEVE_MyMedalGridViewAdapter"

    const-string v1, "loadImage:OutOfMemoryError"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_0
    :goto_0
    return-object v2
.end method

.method public getCount()I
    .locals 1

    .line 58
    iget-object v0, p0, Lo/dxy;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 63
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/dxy;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/dxy;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 66
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 71
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 17

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->medal_miandian_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 80
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->medal_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 82
    :goto_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->gridview_medal_tv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/pluginachievement/R$id;->gridview_medal_iv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 84
    sget v0, Lcom/huawei/pluginachievement/R$id;->gridview_medal_jincheng:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 85
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_item_layout:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 87
    const/4 v8, 0x0

    .line 88
    if-ltz p1, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p1

    if-ge v1, v0, :cond_1

    .line 89
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->b:Ljava/util/List;

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dvz;

    .line 91
    :cond_1
    if-eqz v8, :cond_8

    .line 92
    const-string v9, ""

    .line 93
    const/4 v10, 0x0

    .line 94
    invoke-virtual {v8}, Lo/dvz;->d()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    .line 95
    const/4 v10, 0x1

    .line 96
    invoke-virtual {v8}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 97
    invoke-virtual {v8}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "lightListStyle"

    invoke-static {v0, v1}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 98
    invoke-static {v11}, Lo/dzs;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    const/4 v10, 0x0

    .line 102
    invoke-virtual {v8}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 103
    invoke-virtual {v8}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "grayListStyle"

    invoke-static {v0, v1}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 104
    invoke-static {v11}, Lo/dzs;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 107
    :goto_1
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lo/dxy;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 108
    invoke-virtual {v8}, Lo/dvz;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    invoke-virtual {v8}, Lo/dvz;->h()I

    move-result v0

    if-lez v0, :cond_3

    .line 111
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_new:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 114
    :cond_3
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_new:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    :goto_2
    if-eqz v11, :cond_4

    .line 119
    const-string v0, "PLGACHIEVE_MyMedalGridViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 121
    invoke-virtual {v5, v11}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_3

    .line 124
    :cond_4
    invoke-virtual {v8}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 125
    if-eqz v12, :cond_5

    .line 126
    const-string v0, "PLGACHIEVE_MyMedalGridViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bmp not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 128
    invoke-virtual {v5, v12}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_3

    .line 130
    :cond_5
    invoke-virtual {v8}, Lo/dvz;->i()Ljava/lang/String;

    move-result-object v13

    .line 131
    const-string v0, "PLGACHIEVE_MyMedalGridViewAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "typeLevel is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-static {}, Lo/dzl;->b()Lo/dzl;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dzl;->a(Z)Ljava/util/Map;

    move-result-object v14

    .line 133
    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dvx;

    .line 134
    const/4 v0, 0x0

    if-eq v0, v15, :cond_7

    .line 135
    invoke-virtual {v8}, Lo/dvz;->d()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_6

    .line 136
    const-string v0, "PLGACHIEVE_MyMedalGridViewAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalInfo getEnableResId is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Lo/dvx;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v15}, Lo/dvx;->d()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 139
    :cond_6
    invoke-virtual {v15}, Lo/dvx;->b()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 142
    :cond_7
    new-instance v16, Lo/dvu;

    invoke-direct/range {v16 .. v16}, Lo/dvu;-><init>()V

    .line 143
    invoke-virtual {v8}, Lo/dvz;->a()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/dvu;->b(Ljava/lang/String;)V

    .line 144
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dvu;->c(I)V

    .line 145
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dvu;->h(I)V

    .line 146
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/dwr;->d(Lo/dvf;)Z

    .line 147
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    :goto_3
    goto :goto_4

    .line 152
    :cond_8
    const-string v0, "PLGACHIEVE_MyMedalGridViewAdapter"

    const-string v1, "medalMessage is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 155
    :goto_4
    return-object p2
.end method
