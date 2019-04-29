.class public Lcom/rt/mobile/english/data/channels/Channel$Stream;
.super Ljava/lang/Object;
.source "Channel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/channels/Channel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Stream"
.end annotation


# static fields
.field public static bitrateComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/rt/mobile/english/data/channels/Channel$Stream;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field bitrate:Ljava/lang/String;

.field qualityTitle:Ljava/lang/String;

.field url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 70
    new-instance v0, Lcom/rt/mobile/english/data/channels/Channel$Stream$1;

    invoke-direct {v0}, Lcom/rt/mobile/english/data/channels/Channel$Stream$1;-><init>()V

    sput-object v0, Lcom/rt/mobile/english/data/channels/Channel$Stream;->bitrateComparator:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBitrate()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel$Stream;->bitrate:Ljava/lang/String;

    return-object v0
.end method

.method public getBitrateAsInt()I
    .locals 1

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel$Stream;->bitrate:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public getQualityTitle()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel$Stream;->qualityTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel$Stream;->url:Ljava/lang/String;

    return-object v0
.end method
