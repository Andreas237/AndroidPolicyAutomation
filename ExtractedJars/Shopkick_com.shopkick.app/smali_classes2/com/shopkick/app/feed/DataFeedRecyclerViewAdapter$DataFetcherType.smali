.class public final enum Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;
.super Ljava/lang/Enum;
.source "DataFeedRecyclerViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DataFetcherType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

.field public static final enum GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

.field public static final enum None:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

.field public static final enum Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 32
    new-instance v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->None:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    .line 33
    new-instance v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    const-string v1, "Simple"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    .line 34
    new-instance v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    const-string v1, "GPSFailback"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    const/4 v0, 0x3

    .line 31
    new-array v0, v0, [Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->None:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->Simple:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->GPSFailback:Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->$VALUES:[Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;
    .locals 1

    .line 31
    const-class v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;
    .locals 1

    .line 31
    sget-object v0, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->$VALUES:[Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    invoke-virtual {v0}, [Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$DataFetcherType;

    return-object v0
.end method
