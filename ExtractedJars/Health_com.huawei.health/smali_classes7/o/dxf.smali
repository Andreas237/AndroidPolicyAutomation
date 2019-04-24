.class public Lo/dxf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dui;
.implements Lo/dto;


# static fields
.field private static volatile b:Lo/dxf;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Lo/dwr;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    sput-object v0, Lo/dxf;->b:Lo/dxf;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    .line 61
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    .line 64
    iput-object p1, p0, Lo/dxf;->d:Landroid/content/Context;

    .line 65
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dxf;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 141
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteFile->filePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 145
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteFile->deleteRet:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 131
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 132
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    const-string v0, "languageVersion"

    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    :cond_0
    const-string v0, "resourceLanguage"

    invoke-virtual {v2, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    iget-object v0, p0, Lo/dxf;->e:Lo/dwr;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v2}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 137
    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/dxf;
    .locals 3

    .line 50
    sget-object v0, Lo/dxf;->b:Lo/dxf;

    if-nez v0, :cond_1

    .line 51
    const-class v1, Lo/dxf;

    monitor-enter v1

    .line 52
    :try_start_0
    sget-object v0, Lo/dxf;->b:Lo/dxf;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lo/dxf;

    invoke-direct {v0, p0}, Lo/dxf;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dxf;->b:Lo/dxf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 57
    :cond_1
    :goto_0
    sget-object v0, Lo/dxf;->b:Lo/dxf;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 184
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 185
    iget-object v0, p0, Lo/dxf;->i:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 186
    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    const-string v0, "languagesRes_zh.xml"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 188
    :cond_0
    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    const-string v1, "en"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    const-string v0, "languagesRes_en.xml"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 191
    :cond_1
    const-string v0, "languagesRes_extra.xml"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    :goto_0
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download->sbPath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0}, Lo/dtp;->c(Ljava/lang/String;Ljava/lang/String;Lo/dto;)I

    .line 196
    return-void
.end method

.method private e(Lo/dwb;)V
    .locals 3

    .line 168
    if-eqz p1, :cond_2

    .line 169
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 170
    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    const-string v0, "zh_version"

    invoke-virtual {p1}, Lo/dwb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 172
    :cond_0
    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    const-string v1, "en"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    const-string v0, "en_version"

    invoke-virtual {p1}, Lo/dwb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 175
    :cond_1
    const-string v0, "extra_version"

    invoke-virtual {p1}, Lo/dwb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    :goto_0
    const-string v0, "last_language"

    invoke-virtual {p1}, Lo/dwb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-static {v0, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 179
    invoke-virtual {p1}, Lo/dwb;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dxf;->e(Ljava/lang/String;)V

    .line 181
    :cond_2
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 3

    .line 200
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFinished->resCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return-void
.end method

.method public b()V
    .locals 8

    .line 81
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 82
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 85
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 86
    invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 87
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    .line 89
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    const-string v1, "last_language"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dxf;->a:Ljava/lang/String;

    .line 90
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downLoadRes->mCurrentLanguage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dxf;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mLastLanguage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dxf;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 94
    const-string v0, "zh"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lo/dxf;->a:Ljava/lang/String;

    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    const-string v0, "last_language"

    iget-object v1, p0, Lo/dxf;->c:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 98
    iget-object v0, p0, Lo/dxf;->a:Ljava/lang/String;

    const-string v1, "en"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    const-string v0, "languagesRes_extra.xml"

    invoke-direct {p0, v0}, Lo/dxf;->a(Ljava/lang/String;)V

    .line 103
    :cond_0
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    const-string v1, "zh_version"

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    .line 105
    :cond_1
    const-string v0, "en"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    iget-object v0, p0, Lo/dxf;->a:Ljava/lang/String;

    const-string v1, "en"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 107
    const-string v0, "last_language"

    iget-object v1, p0, Lo/dxf;->c:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 109
    iget-object v0, p0, Lo/dxf;->a:Ljava/lang/String;

    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 110
    const-string v0, "languagesRes_extra.xml"

    invoke-direct {p0, v0}, Lo/dxf;->a(Ljava/lang/String;)V

    .line 114
    :cond_2
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    const-string v1, "en_version"

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 117
    :cond_3
    iget-object v0, p0, Lo/dxf;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 118
    const-string v0, "last_language"

    iget-object v1, p0, Lo/dxf;->c:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 120
    const-string v5, "0"

    goto :goto_0

    .line 122
    :cond_4
    iget-object v0, p0, Lo/dxf;->d:Landroid/content/Context;

    const-string v1, "extra_version"

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 125
    :goto_0
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downLoadRes->version:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lo/dxf;->c:Ljava/lang/String;

    invoke-direct {p0, v5, v0}, Lo/dxf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    return-void
.end method

.method public b(Lo/dwr;)V
    .locals 4

    .line 72
    if-eqz p1, :cond_0

    .line 73
    iput-object p1, p0, Lo/dxf;->e:Lo/dwr;

    .line 74
    const-string v0, "/data/data/%s/language_res/"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/dxf;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dxf;->i:Ljava/lang/String;

    .line 75
    iget-object v0, p0, Lo/dxf;->e:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 77
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    .line 68
    iget-object v0, p0, Lo/dxf;->e:Lo/dwr;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(ILo/dwk;)V
    .locals 5

    .line 151
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  userAchieveWrapper:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " ContentType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 153
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 156
    if-eqz p2, :cond_1

    .line 157
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 158
    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v4

    .line 159
    const-string v0, "PLGACHIEVE_LanguageRes"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    invoke-virtual {p2}, Lo/dwk;->m()Lo/dwb;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dxf;->e(Lo/dwb;)V

    .line 165
    :cond_1
    return-void
.end method
