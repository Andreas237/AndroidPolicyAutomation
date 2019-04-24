.class public Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;
.super Ljava/lang/Object;
.source "TileItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private domainObject:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TD;"
        }
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDomainObject()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->domainObject:Ljava/lang/Object;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setDomainObject(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->domainObject:Ljava/lang/Object;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->imageUrl:Ljava/lang/String;

    return-void
.end method
