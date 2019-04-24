.class public Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;


# static fields
.field private static final FILE_SIZE_LIMIT:I = 0xa00000

.field private static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXVideoFileObject"

.field public static final WXVideoFileShareSceneCommon:I = 0x0

.field public static final WXVideoFileShareSceneFromWX:I = 0x1


# instance fields
.field public filePath:Ljava/lang/String;

.field public shareScene:I

.field public shareTicket:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->shareScene:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->shareScene:I

    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    return-void
.end method

.method private getFileSize(Ljava/lang/String;)I
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public checkArgs()Z
    .locals 2

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "MicroMsg.SDK.WXVideoFileObject"

    const-string v1, "checkArgs fail, filePath is null"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->getFileSize(Ljava/lang/String;)I

    move-result v0

    const/high16 v1, 0xa00000

    if-le v0, v1, :cond_2

    const-string v0, "MicroMsg.SDK.WXVideoFileObject"

    const-string v1, "checkArgs fail, video file size is too large"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public serialize(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "_wxvideofileobject_filePath"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxvideofileobject_shareScene"

    iget v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->shareScene:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "_wxvideofileobject_shareTicketh"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->shareTicket:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public type()I
    .locals 1

    const/16 v0, 0x26

    return v0
.end method

.method public unserialize(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "_wxvideofileobject_filePath"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->filePath:Ljava/lang/String;

    const-string v0, "_wxvideofileobject_shareScene"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->shareScene:I

    const-string v0, "_wxvideofileobject_shareTicketh"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXVideoFileObject;->shareTicket:Ljava/lang/String;

    return-void
.end method
