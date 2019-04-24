.class public abstract Lo/edw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TYPE_COMMON:I = 0x0

.field public static final TYPE_CREATE_GROUP:I = 0x6

.field public static final TYPE_DOWNLOAD_IMAGE:I = 0x7

.field public static final TYPE_GROUP:I = 0x2

.field public static final TYPE_GROUP_MEM:I = 0x3

.field public static final TYPE_MSG:I = 0x4

.field public static final TYPE_SHOWUI:I = 0x5

.field public static final TYPE_USER:I = 0x1


# instance fields
.field protected channel:I

.field public handler:Lo/eeh;

.field protected sdkversion:I

.field public transaction:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const/4 v0, 0x1

    iput v0, p0, Lo/edw;->sdkversion:I

    .line 56
    return-void
.end method


# virtual methods
.method public abstract checkArgs()Z
.end method

.method public getChannel()I
    .locals 1

    .line 89
    iget v0, p0, Lo/edw;->channel:I

    return v0
.end method

.method public abstract getType()I
.end method

.method public getVersion()I
    .locals 1

    .line 79
    iget v0, p0, Lo/edw;->sdkversion:I

    return v0
.end method

.method protected isStrEmpty(Ljava/lang/String;)Z
    .locals 1

    .line 111
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 113
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 115
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public setChannel(I)V
    .locals 0

    .line 99
    iput p1, p0, Lo/edw;->channel:I

    .line 100
    return-void
.end method
