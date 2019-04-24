.class final Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$setSearchKeyword$1;
.super Ljava/lang/Object;
.source "StoresFeedRecyclerViewAdapter.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->setSearchKeyword(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$setSearchKeyword$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$setSearchKeyword$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$setCanLogSearchResult$p(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;Z)V

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter$setSearchKeyword$1;->this$0:Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    invoke-static {v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->access$logSearchResult(Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;)V

    return-void
.end method
