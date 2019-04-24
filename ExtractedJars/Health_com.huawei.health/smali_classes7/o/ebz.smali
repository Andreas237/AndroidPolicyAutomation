.class public Lo/ebz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/dav;

.field private c:Ljava/lang/String;

.field private d:Landroid/net/Uri;

.field private e:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/dav;)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ebz;->g:Z

    .line 45
    iput-object p1, p0, Lo/ebz;->a:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lo/ebz;->b:Lo/dav;

    .line 47
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lo/ebz;->d:Landroid/net/Uri;

    .line 50
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/ebz;->e:Z

    .line 51
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 10

    .line 144
    invoke-direct {p0}, Lo/ebz;->e()V

    .line 147
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "imgPath is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void

    .line 151
    :cond_0
    iput-object p1, p0, Lo/ebz;->c:Ljava/lang/String;

    .line 154
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 155
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SystemShare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "share() file not exists()"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    return-void

    .line 163
    :cond_1
    iget-boolean v0, p0, Lo/ebz;->e:Z

    if-eqz v0, :cond_2

    .line 168
    :try_start_0
    iget-object v0, p0, Lo/ebz;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_system_share_tmp.jpg"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/provider/MediaStore$Images$Media;->insertImage(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 173
    goto :goto_0

    .line 170
    :catch_0
    move-exception v7

    .line 171
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cache image failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-void

    .line 176
    :cond_2
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    .line 178
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 179
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get imgUri failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    return-void

    .line 182
    :cond_3
    iput-object v6, p0, Lo/ebz;->d:Landroid/net/Uri;

    .line 183
    new-instance v7, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 184
    const-string v0, "image/*"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    const-string v0, "android.intent.extra.STREAM"

    iget-object v1, p0, Lo/ebz;->d:Landroid/net/Uri;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 187
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_share:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 188
    invoke-static {v7, v8}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v9

    .line 189
    const/high16 v0, 0x10000000

    invoke-virtual {v9, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 190
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 191
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 192
    iget-object v0, p0, Lo/ebz;->a:Landroid/content/Context;

    invoke-virtual {v0, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 193
    return-void
.end method

.method private c()V
    .locals 7

    .line 78
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 79
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShareContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->h()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 84
    :pswitch_0
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_TEXT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ebz;->d(Ljava/lang/String;)V

    .line 86
    goto/16 :goto_1

    .line 89
    :pswitch_1
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_WEBPAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v4

    .line 91
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->i()Ljava/lang/String;

    move-result-object v5

    .line 92
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ebz;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 98
    :pswitch_2
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_PIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v6

    .line 100
    iget-object v0, p0, Lo/ebz;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/ece;->b(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ebz;->a(Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ebz;->g:Z

    .line 102
    goto :goto_1

    .line 107
    :pswitch_3
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_IMG_PATH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lo/ebz;->b:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ebz;->a(Ljava/lang/String;)V

    .line 109
    goto :goto_1

    .line 112
    :goto_0
    :pswitch_4
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNKNOWN ShareWay!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method private d(Ljava/lang/String;)V
    .locals 7

    .line 122
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 123
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 124
    const-string v0, "android.intent.action.SEND"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    const-string v0, "android.intent.extra.TEXT"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    const-string v0, "text/plain"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_share:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 128
    invoke-static {v4, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v6

    .line 129
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 130
    iget-object v0, p0, Lo/ebz;->a:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 132
    goto :goto_0

    .line 133
    :cond_0
    const-string v0, "SystemShareInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "systemShareText"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mShareText is null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/ebz;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/ebz;->c()V

    return-void
.end method

.method private e()V
    .locals 2

    .line 199
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iget-object v1, p0, Lo/ebz;->d:Landroid/net/Uri;

    if-eq v0, v1, :cond_1

    .line 200
    iget-boolean v0, p0, Lo/ebz;->e:Z

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Lo/ebz;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/ebz;->d:Landroid/net/Uri;

    invoke-static {v0, v1}, Lo/ece;->d(Landroid/content/Context;Landroid/net/Uri;)V

    .line 203
    :cond_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lo/ebz;->d:Landroid/net/Uri;

    .line 205
    :cond_1
    iget-boolean v0, p0, Lo/ebz;->g:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ebz;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 206
    iget-object v0, p0, Lo/ebz;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/ebz;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/ece;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 207
    const-string v0, ""

    iput-object v0, p0, Lo/ebz;->c:Ljava/lang/String;

    .line 210
    :cond_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 216
    invoke-direct {p0}, Lo/ebz;->e()V

    .line 217
    return-void
.end method

.method public b()V
    .locals 2

    .line 57
    new-instance v0, Lo/ebz$2;

    invoke-direct {v0, p0}, Lo/ebz$2;-><init>(Lo/ebz;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 71
    invoke-virtual {v0, v1}, Lo/ebz$2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 72
    return-void
.end method

.method protected finalize()V
    .locals 3

    .line 224
    invoke-direct {p0}, Lo/ebz;->e()V

    .line 226
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    goto :goto_0

    .line 227
    :catch_0
    move-exception v2

    .line 228
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    :goto_0
    return-void
.end method
