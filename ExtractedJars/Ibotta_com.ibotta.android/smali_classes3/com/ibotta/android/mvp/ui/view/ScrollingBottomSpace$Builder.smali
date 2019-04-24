.class public final Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;
.super Ljava/lang/Object;
.source "ScrollingBottomSpace.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private bottomNavDisappears:Z

.field private isGalleryPage:Z

.field private isQuest:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;)Z
    .locals 0

    .line 54
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->bottomNavDisappears:Z

    return p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;)Z
    .locals 0

    .line 54
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->isGalleryPage:Z

    return p0
.end method


# virtual methods
.method public bottomNavDisappears(Z)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->bottomNavDisappears:Z

    return-object p0
.end method

.method public build()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 2

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;-><init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$1;)V

    return-object v0
.end method

.method public isGalleryPage(Z)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;
    .locals 0

    .line 73
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->isGalleryPage:Z

    return-object p0
.end method
