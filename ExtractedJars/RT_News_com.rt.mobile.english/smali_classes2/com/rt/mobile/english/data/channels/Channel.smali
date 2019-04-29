.class public Lcom/rt/mobile/english/data/channels/Channel;
.super Ljava/lang/Object;
.source "Channel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/channels/Channel$Stream;
    }
.end annotation


# static fields
.field public static final HLS:Ljava/lang/String; = "hls"

.field public static final OCTOSHAPE:Ljava/lang/String; = "octoshape"


# instance fields
.field private closedCaptioning:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "closed_captioning"
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private schedule:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private video:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/Channel$Stream;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findAutoQualityStream(Ljava/lang/String;)Lcom/rt/mobile/english/data/channels/Channel$Stream;
    .locals 4

    .line 49
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/channels/Channel;->getVideo()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/rt/mobile/english/data/channels/Channel;->getVideo()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/channels/Channel;->getVideo()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/channels/Channel$Stream;

    .line 53
    invoke-virtual {v0}, Lcom/rt/mobile/english/data/channels/Channel$Stream;->getBitrate()Ljava/lang/String;

    move-result-object v2

    const-string v3, "auto"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v0

    :cond_2
    return-object v1

    :cond_3
    :goto_0
    return-object v1
.end method

.method public findBestQualityStream(Ljava/lang/String;)Lcom/rt/mobile/english/data/channels/Channel$Stream;
    .locals 1

    .line 62
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/channels/Channel;->getVideo()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/rt/mobile/english/data/channels/Channel;->getVideo()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/channels/Channel;->getVideo()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    sget-object v0, Lcom/rt/mobile/english/data/channels/Channel$Stream;->bitrateComparator:Ljava/util/Comparator;

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/channels/Channel$Stream;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getClosedCaptioning()Ljava/lang/Boolean;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel;->closedCaptioning:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getSchedule()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel;->schedule:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVideo()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/Channel$Stream;",
            ">;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/Channel;->video:Ljava/util/HashMap;

    return-object v0
.end method
