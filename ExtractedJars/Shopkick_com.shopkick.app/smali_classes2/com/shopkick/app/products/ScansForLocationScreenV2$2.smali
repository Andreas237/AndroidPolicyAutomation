.class Lcom/shopkick/app/products/ScansForLocationScreenV2$2;
.super Ljava/lang/Object;
.source "ScansForLocationScreenV2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScansForLocationScreenV2;->processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScansForLocationScreenV2;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2$2;->this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/products/ScansForLocationScreenV2$2;->this$0:Lcom/shopkick/app/products/ScansForLocationScreenV2;

    invoke-virtual {v0}, Lcom/shopkick/app/products/ScansForLocationScreenV2;->maybeScrollToProductFamilySection()V

    return-void
.end method
