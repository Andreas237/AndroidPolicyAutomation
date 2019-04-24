.class final enum Lcom/ibotta/android/fragment/offer/GalleryTab$1;
.super Lcom/ibotta/android/fragment/offer/GalleryTab;
.source "GalleryTab.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/offer/GalleryTab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/fragment/offer/GalleryTab;-><init>(Ljava/lang/String;ILcom/ibotta/android/fragment/offer/GalleryTab$1;)V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 2

    .line 17
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1101c7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
