.class public Lo/dwv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private a:Lo/duj;

.field private b:Landroid/content/Context;

.field private c:Lo/dwr;

.field private e:Lo/dwe;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const-string v0, "PLGACHIEVE_AchievePersonalDataObserver"

    sput-object v0, Lo/dwv;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwv;->i:Ljava/util/Map;

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwv;->i:Ljava/util/Map;

    .line 57
    iput-object p1, p0, Lo/dwv;->b:Landroid/content/Context;

    .line 58
    invoke-direct {p0}, Lo/dwv;->b()V

    .line 59
    iget-object v0, p0, Lo/dwv;->i:Ljava/util/Map;

    invoke-direct {p0, v0, p1}, Lo/dwv;->c(Ljava/util/Map;Landroid/content/Context;)V

    .line 60
    return-void
.end method

.method private b()V
    .locals 2

    .line 235
    iget-object v0, p0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 236
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dwv;->c:Lo/dwr;

    .line 238
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    .line 67
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c()Lo/dwe;
    .locals 15

    .line 140
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 141
    iget-object v0, p0, Lo/dwv;->c:Lo/dwr;

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dvj;

    .line 142
    iget-object v0, p0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dwj;

    .line 143
    iget-object v0, p0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvh;

    .line 144
    iget-object v0, p0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dwm;

    .line 146
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_0
    const-string v8, ""

    .line 149
    :goto_0
    if-eqz v4, :cond_1

    .line 150
    invoke-virtual {v4}, Lo/dvj;->d()I

    move-result v9

    goto :goto_1

    .line 152
    :cond_1
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lo/dvh;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dzt;->c(D)I

    move-result v9

    goto :goto_1

    :cond_2
    const/4 v9, 0x1

    .line 154
    :goto_1
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lo/dvh;->c()I

    move-result v10

    goto :goto_2

    :cond_3
    const/4 v10, 0x0

    .line 155
    :goto_2
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lo/dwj;->c()I

    move-result v11

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    .line 156
    :goto_3
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lo/dwj;->e()D

    move-result-wide v12

    goto :goto_4

    :cond_5
    const-wide/16 v12, 0x0

    .line 157
    :goto_4
    if-eqz v7, :cond_6

    invoke-virtual {v7}, Lo/dwm;->e()I

    move-result v14

    goto :goto_5

    :cond_6
    const/4 v14, 0x0

    .line 158
    :goto_5
    invoke-static {}, Lo/dwe;->g()Lo/dwe$c;

    move-result-object v0

    .line 159
    invoke-virtual {v0, v8}, Lo/dwe$c;->b(Ljava/lang/String;)Lo/dwe$c;

    move-result-object v0

    .line 160
    invoke-virtual {v0, v9}, Lo/dwe$c;->e(I)Lo/dwe$c;

    move-result-object v0

    iget-object v1, p0, Lo/dwv;->i:Ljava/util/Map;

    .line 161
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dwe$c;->c(Ljava/lang/String;)Lo/dwe$c;

    move-result-object v0

    .line 162
    invoke-virtual {v0, v10}, Lo/dwe$c;->b(I)Lo/dwe$c;

    move-result-object v0

    .line 163
    invoke-virtual {v0, v11}, Lo/dwe$c;->d(I)Lo/dwe$c;

    move-result-object v0

    .line 164
    invoke-virtual {v0, v12, v13}, Lo/dwe$c;->e(D)Lo/dwe$c;

    move-result-object v0

    .line 165
    invoke-virtual {v0, v14}, Lo/dwe$c;->a(I)Lo/dwe$c;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Lo/dwe$c;->e()Lo/dwe;

    move-result-object v0

    .line 158
    return-object v0
.end method

.method private c(Lo/dwm;Lo/dwj;Lo/dvh;)Lo/dwe;
    .locals 20

    .line 170
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwv;->c:Lo/dwr;

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dvj;

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dwj;

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvh;

    .line 174
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dwm;

    .line 176
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 178
    const-string v0, "reportNo"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dwv;->b:Landroid/content/Context;

    const-string v2, "_weekReportNo"

    const-string v3, "0"

    invoke-static {v1, v2, v3}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwv;->c:Lo/dwr;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v9}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dwh;

    .line 182
    if-nez p3, :cond_0

    const-string v11, ""

    goto :goto_0

    :cond_0
    invoke-virtual/range {p3 .. p3}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v11

    .line 183
    :goto_0
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    :cond_1
    const-string v12, ""

    .line 185
    :goto_1
    if-eqz v5, :cond_2

    .line 186
    invoke-virtual {v5}, Lo/dvj;->d()I

    move-result v13

    goto :goto_3

    .line 188
    :cond_2
    if-eqz v7, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lo/dvh;->a()D

    move-result-wide v0

    goto :goto_2

    :cond_3
    const-wide/16 v0, 0x0

    :goto_2
    invoke-static {v0, v1}, Lo/dzt;->c(D)I

    move-result v13

    goto :goto_3

    :cond_4
    const/4 v13, 0x1

    .line 190
    :goto_3
    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lo/dvh;->c()I

    move-result v14

    goto :goto_4

    :cond_5
    const/4 v14, 0x0

    .line 191
    :goto_4
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lo/dwj;->c()I

    move-result v15

    goto :goto_5

    :cond_6
    const/4 v15, 0x0

    .line 192
    :goto_5
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lo/dwj;->e()D

    move-result-wide v16

    goto :goto_6

    :cond_7
    const-wide/16 v16, 0x0

    .line 193
    :goto_6
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lo/dwm;->e()I

    move-result v18

    goto :goto_7

    :cond_8
    const/16 v18, 0x0

    .line 194
    :goto_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dwv;->b:Landroid/content/Context;

    const-string v1, "_uploadMedal"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 195
    invoke-static {}, Lo/dwe;->g()Lo/dwe$c;

    move-result-object v0

    if-eqz p3, :cond_a

    .line 196
    invoke-static/range {v19 .. v19}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    move-object v1, v11

    goto :goto_8

    :cond_9
    move-object v1, v12

    goto :goto_8

    :cond_a
    move-object v1, v12

    :goto_8
    invoke-virtual {v0, v1}, Lo/dwe$c;->b(Ljava/lang/String;)Lo/dwe$c;

    move-result-object v0

    .line 197
    invoke-virtual {v0, v13}, Lo/dwe$c;->e(I)Lo/dwe$c;

    move-result-object v0

    if-eqz v10, :cond_b

    .line 198
    invoke-virtual {v10}, Lo/dwh;->d()D

    move-result-wide v1

    goto :goto_9

    :cond_b
    const-wide/16 v1, 0x0

    :goto_9
    invoke-virtual {v0, v1, v2}, Lo/dwe$c;->d(D)Lo/dwe$c;

    move-result-object v0

    if-eqz p3, :cond_c

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dwv;->i:Ljava/util/Map;

    .line 200
    invoke-virtual/range {p3 .. p3}, Lo/dvh;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_a

    :cond_c
    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dwv;->i:Ljava/util/Map;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 199
    :goto_a
    invoke-virtual {v0, v1}, Lo/dwe$c;->c(Ljava/lang/String;)Lo/dwe$c;

    move-result-object v0

    if-eqz p3, :cond_d

    .line 201
    invoke-virtual/range {p3 .. p3}, Lo/dvh;->c()I

    move-result v1

    goto :goto_b

    :cond_d
    move v1, v14

    :goto_b
    invoke-virtual {v0, v1}, Lo/dwe$c;->b(I)Lo/dwe$c;

    move-result-object v0

    if-eqz p2, :cond_e

    .line 202
    invoke-virtual/range {p2 .. p2}, Lo/dwj;->c()I

    move-result v1

    goto :goto_c

    :cond_e
    move v1, v15

    :goto_c
    invoke-virtual {v0, v1}, Lo/dwe$c;->d(I)Lo/dwe$c;

    move-result-object v0

    if-eqz p2, :cond_f

    .line 203
    invoke-virtual/range {p2 .. p2}, Lo/dwj;->e()D

    move-result-wide v1

    goto :goto_d

    :cond_f
    move-wide/from16 v1, v16

    :goto_d
    invoke-virtual {v0, v1, v2}, Lo/dwe$c;->e(D)Lo/dwe$c;

    move-result-object v0

    if-eqz p1, :cond_10

    .line 204
    invoke-virtual/range {p1 .. p1}, Lo/dwm;->e()I

    move-result v1

    goto :goto_e

    :cond_10
    move/from16 v1, v18

    :goto_e
    invoke-virtual {v0, v1}, Lo/dwe$c;->a(I)Lo/dwe$c;

    move-result-object v0

    .line 205
    invoke-virtual {v0}, Lo/dwe$c;->e()Lo/dwe;

    move-result-object v0

    .line 195
    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 254
    const-string v0, "nps_config"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 255
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 256
    const-string v0, "AchievePersonalDataObserver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setUserType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 258
    return-void
.end method

.method private c(Ljava/util/Map;Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 241
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 242
    return-void

    .line 244
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_1_title_textview:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_2_title_textview:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_3_title_textview:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_4_title_textview:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_5_title_textview:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    return-void
.end method

.method private d(Lo/dwk;)V
    .locals 7

    .line 89
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    const-string v1, "processPersonalInfo enter"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 91
    invoke-virtual {p0, p0}, Lo/dwv;->b(Lo/dwv;)V

    .line 92
    return-void

    .line 94
    :cond_0
    invoke-virtual {p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dwv;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 95
    const-string v0, "50004"

    invoke-virtual {p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lo/dwv;->b:Landroid/content/Context;

    const-string v1, "NEWBIE"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :cond_1
    invoke-direct {p0}, Lo/dwv;->c()Lo/dwe;

    move-result-object v0

    iput-object v0, p0, Lo/dwv;->e:Lo/dwe;

    .line 100
    iget-object v0, p0, Lo/dwv;->a:Lo/duj;

    if-eqz v0, :cond_2

    .line 101
    iget-object v0, p0, Lo/dwv;->a:Lo/duj;

    iget-object v1, p0, Lo/dwv;->e:Lo/dwe;

    invoke-interface {v0, v1}, Lo/duj;->a(Lo/dwe;)V

    .line 102
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPersonalDataChange personalData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwv;->e:Lo/dwe;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dwv;->a:Lo/duj;

    .line 105
    :cond_2
    invoke-virtual {p0, p0}, Lo/dwv;->b(Lo/dwv;)V

    .line 106
    return-void

    .line 109
    :cond_3
    invoke-virtual {p1}, Lo/dwk;->i()Lo/dwm;

    move-result-object v3

    .line 110
    invoke-virtual {p1}, Lo/dwk;->f()Lo/dwj;

    move-result-object v4

    .line 111
    iget-object v0, p0, Lo/dwv;->b:Landroid/content/Context;

    const-string v1, "NEWBIE"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 112
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 113
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 114
    invoke-virtual {v4}, Lo/dwj;->c()I

    move-result v0

    const/16 v1, 0xa

    if-gt v0, v1, :cond_4

    .line 115
    const-string v0, "AchievePersonalDataObserver"

    const-string v1, " set the new user"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lo/dwv;->b:Landroid/content/Context;

    const-string v1, "NEWBIE"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 118
    :cond_4
    const-string v0, "AchievePersonalDataObserver"

    const-string v1, " set the old user"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lo/dwv;->b:Landroid/content/Context;

    const-string v1, "NEWBIE"

    const-string v2, "doing"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    :cond_5
    :goto_0
    invoke-virtual {p1}, Lo/dwk;->d()Lo/dvh;

    move-result-object v6

    .line 127
    invoke-direct {p0, v3, v4, v6}, Lo/dwv;->c(Lo/dwm;Lo/dwj;Lo/dvh;)Lo/dwe;

    move-result-object v0

    iput-object v0, p0, Lo/dwv;->e:Lo/dwe;

    .line 128
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processPersonalInfo() personalDataCloud="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwv;->e:Lo/dwe;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lo/dwv;->a:Lo/duj;

    if-eqz v0, :cond_6

    .line 131
    iget-object v0, p0, Lo/dwv;->a:Lo/duj;

    iget-object v1, p0, Lo/dwv;->e:Lo/dwe;

    invoke-interface {v0, v1}, Lo/duj;->a(Lo/dwe;)V

    .line 132
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPersonalDataChange personalData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dwv;->e:Lo/dwe;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dwv;->a:Lo/duj;

    .line 135
    :cond_6
    invoke-virtual {p0, p0}, Lo/dwv;->b(Lo/dwv;)V

    .line 136
    return-void
.end method


# virtual methods
.method public b(Lo/dwv;)V
    .locals 2

    .line 214
    if-nez p1, :cond_0

    .line 215
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    const-string v1, "unregisterPersonalDataObserver object maybe not create."

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    return-void

    .line 218
    :cond_0
    iget-object v0, p0, Lo/dwv;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->d(Lo/dui;)V

    .line 219
    return-void
.end method

.method public e(ILo/dwk;)V
    .locals 4

    .line 72
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchievePersonalDataObserver|onDataChanged  error= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 74
    invoke-virtual {p0, p0}, Lo/dwv;->b(Lo/dwv;)V

    .line 75
    return-void

    .line 77
    :cond_0
    if-nez p2, :cond_1

    .line 78
    return-void

    .line 80
    :cond_1
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    .line 81
    sget-object v0, Lo/dwv;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchievePersonalDataObserver|onDataChanged contentType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    if-nez v3, :cond_2

    .line 83
    invoke-direct {p0, p2}, Lo/dwv;->d(Lo/dwk;)V

    .line 84
    return-void

    .line 86
    :cond_2
    return-void
.end method

.method public e(Lo/duj;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/dwv;->a:Lo/duj;

    .line 64
    return-void
.end method
