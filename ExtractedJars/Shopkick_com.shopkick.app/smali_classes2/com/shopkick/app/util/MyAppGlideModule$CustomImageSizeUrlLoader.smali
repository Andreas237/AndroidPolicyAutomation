.class Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;
.super Lcom/bumptech/glide/load/model/stream/BaseGlideUrlLoader;
.source "MyAppGlideModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/MyAppGlideModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CustomImageSizeUrlLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/load/model/stream/BaseGlideUrlLoader<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final INDICATOR_1_5x:Ljava/lang/String; = "1_5x"

.field private static final INDICATOR_2x:Ljava/lang/String; = "2x"

.field private static final SCALING_FACTOR_1_5x:Ljava/lang/String; = "@1_5x"

.field private static final SCALING_FACTOR_2x:Ljava/lang/String; = "@2x"

.field private static shouldUse1_5xImages:Ljava/lang/Boolean;

.field private static shouldUse2xImages:Ljava/lang/Boolean;


# direct methods
.method protected constructor <init>(Lcom/bumptech/glide/load/model/ModelLoader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/model/ModelLoader<",
            "Lcom/bumptech/glide/load/model/GlideUrl;",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/load/model/stream/BaseGlideUrlLoader;-><init>(Lcom/bumptech/glide/load/model/ModelLoader;Lcom/bumptech/glide/load/model/ModelCache;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic getUrl(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Ljava/lang/String;
    .locals 0

    .line 96
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->getUrl(Ljava/lang/String;IILcom/bumptech/glide/load/Options;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getUrl(Ljava/lang/String;IILcom/bumptech/glide/load/Options;)Ljava/lang/String;
    .locals 8

    const/16 p2, 0x23

    .line 110
    invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p2

    const/16 p3, 0x2e

    .line 111
    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->lastIndexOf(II)I

    move-result p3

    if-gez p3, :cond_0

    return-object p1

    :cond_0
    add-int/lit8 p4, p2, 0x1

    .line 116
    invoke-virtual {p1, p4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p4

    const-string v0, "&"

    invoke-virtual {p4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p4

    .line 117
    array-length v0, p4

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v2, v0, :cond_3

    aget-object v6, p4, v2

    const-string v7, "1_5x"

    .line 118
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    const-string v7, "2x"

    .line 120
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v3, v5

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 125
    :cond_3
    sget-object p4, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse1_5xImages:Ljava/lang/Boolean;

    if-eqz p4, :cond_4

    sget-object p4, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse2xImages:Ljava/lang/Boolean;

    if-nez p4, :cond_9

    .line 126
    :cond_4
    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object p4

    iget-object p4, p4, Lcom/shopkick/app/application/SKApp;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const/4 v0, 0x3

    .line 127
    invoke-virtual {p4}, Lcom/shopkick/app/application/DeviceInfo;->getScreenLayout()I

    move-result v2

    if-eq v0, v2, :cond_6

    const/16 v0, 0xf0

    .line 128
    invoke-virtual {p4}, Lcom/shopkick/app/application/DeviceInfo;->getScreenDensity()I

    move-result v2

    if-ne v0, v2, :cond_5

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_3

    :cond_6
    :goto_2
    move v0, v5

    .line 127
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse1_5xImages:Ljava/lang/Boolean;

    const/4 v0, 0x4

    .line 129
    invoke-virtual {p4}, Lcom/shopkick/app/application/DeviceInfo;->getScreenLayout()I

    move-result v2

    if-eq v0, v2, :cond_8

    const/16 v0, 0x140

    .line 130
    invoke-virtual {p4}, Lcom/shopkick/app/application/DeviceInfo;->getScreenDensity()I

    move-result p4

    if-gt v0, p4, :cond_7

    goto :goto_4

    :cond_7
    move v5, v1

    .line 129
    :cond_8
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    sput-object p4, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse2xImages:Ljava/lang/Boolean;

    :cond_9
    if-eqz v3, :cond_a

    .line 133
    sget-object p4, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse2xImages:Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object p4

    iget-object p4, p4, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p4, p4, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p4, p4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->allow2XImageFetching:Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_a

    .line 134
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@2x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    if-eqz v4, :cond_c

    .line 135
    sget-object p4, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse1_5xImages:Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_b

    sget-object p4, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->shouldUse2xImages:Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_c

    .line 136
    :cond_b
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@1_5x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 138
    :cond_c
    invoke-virtual {p1, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;)Z
    .locals 0

    .line 96
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;->handles(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public handles(Ljava/lang/String;)Z
    .locals 1

    const/16 v0, 0x23

    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
