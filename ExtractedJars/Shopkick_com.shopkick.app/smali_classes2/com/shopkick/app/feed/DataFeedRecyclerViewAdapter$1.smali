.class synthetic Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$1;
.super Ljava/lang/Object;
.source "DataFeedRecyclerViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$feed$DataFeedRecyclerViewAdapter$DataFetcherType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 162
    invoke-static {}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->values()[Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$1;->$SwitchMap$com$shopkick$app$feed$DataFeedRecyclerViewAdapter$DataFetcherType:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$1;->$SwitchMap$com$shopkick$app$feed$DataFeedRecyclerViewAdapter$DataFetcherType:[I

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->None:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$1;->$SwitchMap$com$shopkick$app$feed$DataFeedRecyclerViewAdapter$DataFetcherType:[I

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$1;->$SwitchMap$com$shopkick$app$feed$DataFeedRecyclerViewAdapter$DataFetcherType:[I

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
