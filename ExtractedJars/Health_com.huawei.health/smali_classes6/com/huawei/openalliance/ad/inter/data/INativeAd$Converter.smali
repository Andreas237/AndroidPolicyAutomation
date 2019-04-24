.class public Lcom/huawei/openalliance/ad/inter/data/INativeAd$Converter;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/inter/data/INativeAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Converter"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deserialization(Ljava/lang/String;)Lcom/huawei/openalliance/ad/inter/data/INativeAd;
    .locals 3

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/z;->b(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    instance-of v0, v1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/inter/data/INativeAd$Converter;->reset(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static reset(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/inter/data/NativeAd;
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setPlayProgress(I)V

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoAutoPlayWithSound()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setSoundSwitch(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setVideoInfo(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    return-object p0
.end method

.method public static serialization(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/z;->a(Ljava/io/Serializable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
