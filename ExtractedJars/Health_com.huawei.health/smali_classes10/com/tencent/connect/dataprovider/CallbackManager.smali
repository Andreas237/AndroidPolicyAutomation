.class public final Lcom/tencent/connect/dataprovider/CallbackManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z

    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->a:Ljava/lang/ref/WeakReference;

    .line 31
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->b:Landroid/net/Uri;

    .line 34
    const-string v0, "srcPackageName"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->c:Ljava/lang/String;

    .line 35
    const-string v0, "srcClassName"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->d:Ljava/lang/String;

    .line 36
    const-string v0, "srcAction"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->e:Ljava/lang/String;

    .line 37
    const-string v0, "requestDataTypeFlag"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->h:I

    .line 38
    const-string v0, "params_appid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->f:Ljava/lang/String;

    .line 39
    iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->b:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z

    .line 43
    :cond_0
    return-void
.end method

.method private a(Landroid/os/Bundle;)I
    .locals 3

    .line 50
    iget-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z

    if-nez v0, :cond_0

    .line 51
    const/4 v0, -0x2

    return v0

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    .line 54
    const/4 v0, -0x3

    return v0

    .line 56
    :cond_1
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 57
    iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->e:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    const-string v0, "params_appid"

    iget-object v1, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 61
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 62
    iget-object v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 64
    const/4 v0, 0x0

    return v0
.end method

.method private a(Ljava/lang/String;)I
    .locals 9

    .line 131
    if-nez p1, :cond_0

    .line 132
    const/4 v0, -0x7

    return v0

    .line 135
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 137
    const-string v0, "http://"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    const/4 v0, 0x0

    return v0

    .line 141
    :cond_1
    const/4 v3, 0x0

    .line 142
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 143
    if-eqz v4, :cond_2

    .line 144
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    goto :goto_0

    .line 146
    :cond_2
    const/16 v0, -0xa

    return v0

    .line 149
    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 150
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 151
    const/4 v0, -0x5

    return v0

    .line 154
    :cond_3
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 156
    :cond_4
    const/4 v0, -0x8

    return v0

    .line 159
    :cond_5
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v7

    .line 160
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-nez v0, :cond_6

    .line 161
    const/16 v0, -0x9

    return v0

    .line 162
    :cond_6
    const-wide/32 v0, 0x40000000

    cmp-long v0, v7, v0

    if-lez v0, :cond_7

    .line 163
    const/4 v0, -0x6

    return v0

    .line 166
    :cond_7
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getRequestDateTypeFlag()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->h:I

    return v0
.end method

.method public isCallFromTencentApp()Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/tencent/connect/dataprovider/CallbackManager;->g:Z

    return v0
.end method

.method public isSupportType(I)Z
    .locals 1

    .line 78
    invoke-virtual {p0}, Lcom/tencent/connect/dataprovider/CallbackManager;->getRequestDateTypeFlag()I

    move-result v0

    and-int/2addr v0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public sendTextAndImagePath(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 82
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/connect/dataprovider/CallbackManager;->isSupportType(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    const/4 v0, -0x1

    return v0

    .line 86
    :cond_0
    invoke-direct {p0, p2}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Ljava/lang/String;)I

    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    return v2

    .line 91
    :cond_1
    new-instance v3, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;

    invoke-direct {v3, p1, p2}, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 93
    const-string v0, "contentDataType"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 94
    const-string v0, "contentData"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 96
    invoke-direct {p0, v4}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Landroid/os/Bundle;)I

    move-result v0

    return v0
.end method

.method public sendTextAndVideoPath(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 100
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/tencent/connect/dataprovider/CallbackManager;->isSupportType(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    const/4 v0, -0x1

    return v0

    .line 104
    :cond_0
    invoke-direct {p0, p2}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Ljava/lang/String;)I

    move-result v2

    .line 105
    if-eqz v2, :cond_1

    .line 106
    return v2

    .line 109
    :cond_1
    new-instance v3, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;

    invoke-direct {v3, p1, p2}, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 111
    const-string v0, "contentDataType"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 112
    const-string v0, "contentData"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 114
    invoke-direct {p0, v4}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Landroid/os/Bundle;)I

    move-result v0

    return v0
.end method

.method public sendTextOnly(Ljava/lang/String;)I
    .locals 4

    .line 118
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/tencent/connect/dataprovider/CallbackManager;->isSupportType(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    const/4 v0, -0x1

    return v0

    .line 122
    :cond_0
    new-instance v2, Lcom/tencent/connect/dataprovider/DataType$TextOnly;

    invoke-direct {v2, p1}, Lcom/tencent/connect/dataprovider/DataType$TextOnly;-><init>(Ljava/lang/String;)V

    .line 123
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 124
    const-string v0, "contentDataType"

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 125
    const-string v0, "contentData"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 127
    invoke-direct {p0, v3}, Lcom/tencent/connect/dataprovider/CallbackManager;->a(Landroid/os/Bundle;)I

    move-result v0

    return v0
.end method