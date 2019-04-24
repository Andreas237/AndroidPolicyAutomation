.class Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;
.super Ljava/lang/Object;
.source "ChainListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/chains/ChainListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ChainListClickListener"
.end annotation


# instance fields
.field private chainListScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/chains/ChainListScreen;",
            ">;"
        }
    .end annotation
.end field

.field private index:I

.field private location:Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/chains/ChainListScreen;",
            ">;",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            "I)V"
        }
    .end annotation

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    iput-object p1, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->chainListScreenRef:Ljava/lang/ref/WeakReference;

    .line 216
    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->location:Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    .line 217
    iput p3, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->index:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->chainListScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/chains/ChainListScreen;

    if-nez v0, :cond_0

    return-void

    .line 226
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f0900e4

    if-ne v1, v2, :cond_1

    .line 227
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->location:Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/chains/ChainListScreen;->storeDetailsSelected(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)V

    goto :goto_0

    .line 228
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x7f0900e1

    if-ne p1, v1, :cond_2

    .line 229
    iget p1, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->index:I

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->location:Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/chains/ChainListScreen;->logChainDistanceTap(ILjava/lang/String;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;->location:Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/chains/ChainListScreen;->locationMapSelected(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)V

    :cond_2
    :goto_0
    return-void
.end method
