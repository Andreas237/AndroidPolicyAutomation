.class public Lcom/huawei/ui/openservice/OpenServiceUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/OpenServiceUtil$Location;,
        Lcom/huawei/ui/openservice/OpenServiceUtil$Source;,
        Lcom/huawei/ui/openservice/OpenServiceUtil$Boolean;,
        Lcom/huawei/ui/openservice/OpenServiceUtil$InitDBType;,
        Lcom/huawei/ui/openservice/OpenServiceUtil$HmsAuthType;,
        Lcom/huawei/ui/openservice/OpenServiceUtil$ServiceAuthType;
    }
.end annotation


# static fields
.field public static final AUTH_TYPE_SPORT_DATA:Ljava/lang/String; = "SPORT_DATA"

.field public static final AUTH_TYPE_USER_INFO:Ljava/lang/String; = "USER_INFO"

.field private static final LOG_TAG:Ljava/lang/String; = "Opera_OpenServiceUtil"

.field public static final TAG_PRE:Ljava/lang/String; = "Opera_"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBetaFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 159
    const-string v4, ""

    .line 160
    const/4 v5, 0x0

    .line 162
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openservice/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 163
    invoke-virtual {v5}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 164
    new-array v7, v6, [B

    .line 165
    invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    .line 166
    if-lez v8, :cond_0

    .line 167
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v0

    .line 172
    :cond_0
    if-eqz v5, :cond_2

    .line 174
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 177
    goto/16 :goto_1

    .line 175
    :catch_0
    move-exception v6

    .line 176
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    goto :goto_1

    .line 169
    :catch_1
    move-exception v6

    .line 170
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    if-eqz v5, :cond_2

    .line 174
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 177
    goto :goto_1

    .line 175
    :catch_2
    move-exception v6

    .line 176
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    goto :goto_1

    .line 172
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_1

    .line 174
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 177
    goto :goto_0

    .line 175
    :catch_3
    move-exception v10

    .line 176
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :cond_1
    :goto_0
    throw v9

    .line 180
    :cond_2
    :goto_1
    return-object v4
.end method

.method public static getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10

    .line 92
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_1
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 94
    const-string v4, "lightcloud/servicefw/res/"

    .line 95
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 96
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v5

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 97
    new-instance v7, Ljava/util/ArrayList;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "child_bg_shudongli.jpg"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "idatapowerweight.jpg"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 98
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    const/4 v8, 0x0

    .line 101
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openservice/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v9

    .line 102
    invoke-static {v9}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v8, v0

    .line 103
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 105
    :catch_0
    move-exception v9

    .line 106
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_0
    return-object v8

    .line 110
    :cond_2
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 112
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 113
    const/4 v0, 0x0

    if-ne v0, v9, :cond_3

    .line 114
    const/4 v0, 0x0

    return-object v0

    .line 116
    :cond_3
    return-object v9

    .line 119
    :cond_4
    goto :goto_1

    .line 120
    :cond_5
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 122
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 123
    const/4 v0, 0x0

    if-ne v0, v5, :cond_6

    .line 124
    const/4 v0, 0x0

    return-object v0

    .line 126
    :cond_6
    return-object v5

    .line 129
    :cond_7
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getStringFile(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 134
    const-string v4, ""

    .line 135
    const/4 v5, 0x0

    .line 137
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    .line 138
    invoke-virtual {v5}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 139
    new-array v7, v6, [B

    .line 140
    invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    .line 141
    if-lez v8, :cond_0

    .line 142
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v0

    .line 147
    :cond_0
    if-eqz v5, :cond_2

    .line 149
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 152
    goto :goto_1

    .line 150
    :catch_0
    move-exception v6

    .line 151
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    goto :goto_1

    .line 144
    :catch_1
    move-exception v6

    .line 145
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    if-eqz v5, :cond_2

    .line 149
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 152
    goto :goto_1

    .line 150
    :catch_2
    move-exception v6

    .line 151
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_1

    .line 149
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 152
    goto :goto_0

    .line 150
    :catch_3
    move-exception v10

    .line 151
    const-string v0, "Opera_OpenServiceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    :cond_1
    :goto_0
    throw v9

    .line 155
    :cond_2
    :goto_1
    return-object v4
.end method

.method public static initChooseSql(ZLjava/lang/String;Ljava/util/List;Ljava/lang/StringBuffer;[Ljava/lang/String;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/StringBuffer;[Ljava/lang/String;I)V"
        }
    .end annotation

    .line 72
    if-eqz p0, :cond_0

    const-string v2, " in ( "

    goto :goto_0

    :cond_0
    const-string v2, " not in ( "

    .line 73
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    .line 74
    if-nez p5, :cond_1

    .line 75
    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 78
    :cond_1
    const-string v0, " and "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 80
    :goto_1
    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    .line 81
    if-nez v4, :cond_2

    .line 82
    const-string v0, " ? "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 84
    :cond_2
    const-string v0, ",? "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 86
    :goto_3
    add-int v0, p5, v4

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, p4, v0

    .line 80
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 88
    :cond_3
    const-string v0, " )"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 89
    return-void
.end method
