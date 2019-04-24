.class public abstract Lorg/researchstack/backbone/ResourcePathManager;
.super Ljava/lang/Object;
.source "ResourcePathManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/ResourcePathManager$Resource;
    }
.end annotation


# static fields
.field private static gson:Lcom/google/gson/Gson;

.field private static instance:Lorg/researchstack/backbone/ResourcePathManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 31
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    const-string v1, "MMM yyyy"

    invoke-virtual {v0, v1}, Lcom/google/gson/GsonBuilder;->setDateFormat(Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ResourcePathManager;->gson:Lcom/google/gson/Gson;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    return-void
.end method

.method public static getInstance()Lorg/researchstack/backbone/ResourcePathManager;
    .locals 2

    .prologue
    .line 53
    sget-object v0, Lorg/researchstack/backbone/ResourcePathManager;->instance:Lorg/researchstack/backbone/ResourcePathManager;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "ResourceManager instance is null. Make sure to init a concrete implementation of ResearchStack in Application.onCreate()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_0
    sget-object v0, Lorg/researchstack/backbone/ResourcePathManager;->instance:Lorg/researchstack/backbone/ResourcePathManager;

    return-object v0
.end method

.method public static getResouceAsInputStream(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "filePath"    # Ljava/lang/String;

    .prologue
    .line 180
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 181
    .local v0, "assetManager":Landroid/content/res/AssetManager;
    const/4 v2, 0x0

    .line 184
    .local v2, "inputStream":Ljava/io/InputStream;
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    return-object v3

    .line 186
    :catch_0
    move-exception v1

    .line 188
    .local v1, "e":Ljava/io/IOException;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static getResourceAsBytes(Landroid/content/Context;Ljava/lang/String;)[B
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "filePath"    # Ljava/lang/String;

    .prologue
    .line 132
    invoke-static {p0, p1}, Lorg/researchstack/backbone/ResourcePathManager;->getResouceAsInputStream(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 133
    .local v2, "is":Ljava/io/InputStream;
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 135
    .local v0, "byteOutput":Ljava/io/ByteArrayOutputStream;
    const/16 v5, 0x1000

    new-array v4, v5, [B

    .line 142
    .local v4, "readBuffer":[B
    :goto_0
    const/4 v5, 0x0

    :try_start_0
    array-length v6, v4

    invoke-virtual {v2, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    .line 143
    .local v3, "read":I
    const/4 v5, -0x1

    if-ne v3, v5, :cond_0

    .line 151
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 161
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 168
    .end local v3    # "read":I
    :goto_1
    return-object v5

    .line 147
    .restart local v3    # "read":I
    :cond_0
    const/4 v5, 0x0

    :try_start_2
    invoke-virtual {v0, v4, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 153
    .end local v3    # "read":I
    :catch_0
    move-exception v1

    .line 155
    .local v1, "e":Ljava/io/IOException;
    :try_start_3
    const-class v5, Lorg/researchstack/backbone/ResourcePathManager;

    invoke-static {v5, v1}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 161
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 168
    :goto_2
    const/4 v5, 0x0

    goto :goto_1

    .line 163
    .end local v1    # "e":Ljava/io/IOException;
    .restart local v3    # "read":I
    :catch_1
    move-exception v1

    .line 165
    .restart local v1    # "e":Ljava/io/IOException;
    const-class v6, Lorg/researchstack/backbone/ResourcePathManager;

    invoke-static {v6, v1}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 163
    .end local v3    # "read":I
    :catch_2
    move-exception v1

    .line 165
    const-class v5, Lorg/researchstack/backbone/ResourcePathManager;

    invoke-static {v5, v1}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 159
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    .line 161
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 166
    :goto_3
    throw v5

    .line 163
    :catch_3
    move-exception v1

    .line 165
    .restart local v1    # "e":Ljava/io/IOException;
    const-class v6, Lorg/researchstack/backbone/ResourcePathManager;

    invoke-static {v6, v1}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/Throwable;)V

    goto :goto_3
.end method

.method public static getResourceAsClass(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p2, "filePath"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 202
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-static {p0, p2}, Lorg/researchstack/backbone/ResourcePathManager;->getResouceAsInputStream(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 203
    .local v2, "stream":Ljava/io/InputStream;
    const/4 v1, 0x0

    .line 206
    .local v1, "reader":Ljava/io/Reader;
    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    .end local v1    # "reader":Ljava/io/Reader;
    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .restart local v1    # "reader":Ljava/io/Reader;
    sget-object v3, Lorg/researchstack/backbone/ResourcePathManager;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v3, v1, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    return-object v3

    .line 208
    .end local v1    # "reader":Ljava/io/Reader;
    :catch_0
    move-exception v0

    .line 210
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static getResourceAsString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "filePath"    # Ljava/lang/String;

    .prologue
    .line 120
    new-instance v0, Ljava/lang/String;

    invoke-static {p0, p1}, Lorg/researchstack/backbone/ResourcePathManager;->getResourceAsBytes(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static init(Lorg/researchstack/backbone/ResourcePathManager;)V
    .locals 0
    .param p0, "manager"    # Lorg/researchstack/backbone/ResourcePathManager;

    .prologue
    .line 43
    sput-object p0, Lorg/researchstack/backbone/ResourcePathManager;->instance:Lorg/researchstack/backbone/ResourcePathManager;

    .line 44
    return-void
.end method


# virtual methods
.method public generateAbsolutePath(ILjava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "type"    # I
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "file:///android_asset/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/ResourcePathManager;->generatePath(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract generatePath(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public getFileExtension(I)Ljava/lang/String;
    .locals 3
    .param p1, "type"    # I

    .prologue
    .line 96
    packed-switch p1, :pswitch_data_0

    .line 107
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :pswitch_0
    const-string v0, "html"

    .line 105
    :goto_0
    return-object v0

    .line 101
    :pswitch_1
    const-string v0, "json"

    goto :goto_0

    .line 103
    :pswitch_2
    const-string v0, "pdf"

    goto :goto_0

    .line 105
    :pswitch_3
    const-string v0, "mp4"

    goto :goto_0

    .line 96
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
