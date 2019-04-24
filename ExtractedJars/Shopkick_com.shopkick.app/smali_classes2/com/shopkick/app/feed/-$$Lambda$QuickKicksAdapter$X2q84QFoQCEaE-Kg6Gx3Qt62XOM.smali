.class public final synthetic Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/feed/QuickKicksAdapter;

.field private final synthetic f$1:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private final synthetic f$2:I

.field private final synthetic f$3:Ljava/lang/Boolean;

.field private final synthetic f$4:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/feed/QuickKicksAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILjava/lang/Boolean;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$0:Lcom/shopkick/app/feed/QuickKicksAdapter;

    iput-object p2, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$1:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput p3, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$2:I

    iput-object p4, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$3:Ljava/lang/Boolean;

    iput-object p5, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$4:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$0:Lcom/shopkick/app/feed/QuickKicksAdapter;

    iget-object v1, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$1:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget v2, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$2:I

    iget-object v3, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$3:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;->f$4:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/shopkick/app/feed/QuickKicksAdapter;->lambda$processVideoCompletion$76(Lcom/shopkick/app/feed/QuickKicksAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILjava/lang/Boolean;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
