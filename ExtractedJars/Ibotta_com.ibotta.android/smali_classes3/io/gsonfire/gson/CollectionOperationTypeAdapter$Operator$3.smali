.class final enum Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$3;
.super Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;
.source "CollectionOperationTypeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, p2, v0}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;-><init>(Ljava/lang/String;ILio/gsonfire/gson/CollectionOperationTypeAdapter$1;)V

    return-void
.end method


# virtual methods
.method public apply(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 0

    .line 67
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    return-void
.end method
