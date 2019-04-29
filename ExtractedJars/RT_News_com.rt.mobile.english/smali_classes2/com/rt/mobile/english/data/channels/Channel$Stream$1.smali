.class final Lcom/rt/mobile/english/data/channels/Channel$Stream$1;
.super Ljava/lang/Object;
.source "Channel.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/channels/Channel$Stream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/rt/mobile/english/data/channels/Channel$Stream;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/rt/mobile/english/data/channels/Channel$Stream;Lcom/rt/mobile/english/data/channels/Channel$Stream;)I
    .locals 0

    .line 73
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel$Stream;->getBitrateAsInt()I

    move-result p1

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/channels/Channel$Stream;->getBitrateAsInt()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 70
    check-cast p1, Lcom/rt/mobile/english/data/channels/Channel$Stream;

    check-cast p2, Lcom/rt/mobile/english/data/channels/Channel$Stream;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/data/channels/Channel$Stream$1;->compare(Lcom/rt/mobile/english/data/channels/Channel$Stream;Lcom/rt/mobile/english/data/channels/Channel$Stream;)I

    move-result p1

    return p1
.end method
