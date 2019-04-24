.class public Lcom/huawei/hms/update/provider/UpdateProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field public static final AUTHORITIES_SUFFIX:Ljava/lang/String; = ".hms.update.provider"

.field private static final a:[Ljava/lang/String;

.field private static b:Lcom/huawei/hms/update/provider/a; = null


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_display_name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "_size"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->a:[Ljava/lang/String;

    .line 35
    new-instance v0, Lcom/huawei/hms/update/provider/a;

    invoke-direct {v0}, Lcom/huawei/hms/update/provider/a;-><init>()V

    sput-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)I
    .locals 4

    .line 214
    const-string v0, "r"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    const/high16 v3, 0x10000000

    goto :goto_0

    .line 216
    :cond_0
    const-string v0, "w"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "wt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    :cond_1
    const/high16 v3, 0x2c000000

    goto :goto_0

    .line 219
    :cond_2
    const-string v0, "wa"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 220
    const/high16 v3, 0x2a000000

    goto :goto_0

    .line 222
    :cond_3
    const-string v0, "rw"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 223
    const/high16 v3, 0x38000000

    goto :goto_0

    .line 224
    :cond_4
    const-string v0, "rwt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 225
    const/high16 v3, 0x3c000000    # 0.0078125f

    goto :goto_0

    .line 228
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :goto_0
    return v3
.end method

.method private static a([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 3

    .line 240
    new-array v2, p1, [Ljava/lang/Object;

    .line 241
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 242
    return-object v2
.end method

.method private static a([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 3

    .line 234
    new-array v2, p1, [Ljava/lang/String;

    .line 235
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 236
    return-object v2
.end method

.method public static getLocalFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 64
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/update/provider/a;->a(Landroid/content/Context;)V

    .line 65
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/provider/a;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
    .locals 1

    .line 53
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/update/provider/a;->a(Landroid/content/Context;)V

    .line 54
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p2, p1}, Lcom/huawei/hms/update/provider/a;->a(Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    .line 81
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 83
    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Provider must not be exported"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    if-nez v0, :cond_1

    .line 87
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Provider must grant uri permissions"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_1
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/provider/a;->a(Landroid/content/Context;)V

    .line 91
    return-void
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 188
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/provider/a;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v1

    .line 189
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 6

    .line 118
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/provider/a;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    .line 120
    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 122
    if-ltz v3, :cond_0

    .line 123
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 124
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 125
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    return-object v5

    .line 130
    :cond_0
    const-string v0, "application/octet-stream"

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2

    .line 98
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "No external inserts"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCreate()Z
    .locals 1

    .line 73
    const/4 v0, 0x1

    return v0
.end method

.method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 202
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/provider/a;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v1

    .line 203
    invoke-static {p2}, Lcom/huawei/hms/update/provider/UpdateProvider;->a(Ljava/lang/String;)I

    move-result v2

    .line 204
    invoke-static {v1, v2}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 11

    .line 150
    sget-object v0, Lcom/huawei/hms/update/provider/UpdateProvider;->b:Lcom/huawei/hms/update/provider/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/provider/a;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v3

    .line 152
    if-nez p2, :cond_0

    .line 153
    sget-object p2, Lcom/huawei/hms/update/provider/UpdateProvider;->a:[Ljava/lang/String;

    .line 156
    :cond_0
    array-length v0, p2

    new-array v4, v0, [Ljava/lang/String;

    .line 157
    array-length v0, p2

    new-array v5, v0, [Ljava/lang/Object;

    .line 158
    const/4 v6, 0x0

    .line 159
    move-object v7, p2

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    .line 160
    const-string v0, "_display_name"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    const-string v0, "_display_name"

    aput-object v0, v4, v6

    .line 162
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v0

    goto :goto_1

    .line 163
    :cond_1
    const-string v0, "_size"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    const-string v0, "_size"

    aput-object v0, v4, v6

    .line 165
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v0

    .line 159
    :cond_2
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 169
    :cond_3
    invoke-static {v4, v6}, Lcom/huawei/hms/update/provider/UpdateProvider;->a([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 170
    invoke-static {v5, v6}, Lcom/huawei/hms/update/provider/UpdateProvider;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    .line 172
    new-instance v7, Landroid/database/MatrixCursor;

    const/4 v0, 0x1

    invoke-direct {v7, v4, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 173
    invoke-virtual {v7, v5}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 174
    return-object v7
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 106
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "No external updates"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
