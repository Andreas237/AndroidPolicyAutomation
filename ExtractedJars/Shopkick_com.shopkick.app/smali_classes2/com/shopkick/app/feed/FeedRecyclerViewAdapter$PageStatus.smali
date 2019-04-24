.class public final enum Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;
.super Ljava/lang/Enum;
.source "FeedRecyclerViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PageStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum FAIL_AUTOFETCH:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public static final enum SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1743
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1744
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "SUCCESS_CLEAR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1745
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "FAIL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1746
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "FAIL_AUTOFETCH"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_AUTOFETCH:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1747
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "FAIL_RELOAD"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1748
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "FAIL_OFFLINE_EDUCATION"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 1749
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const-string v1, "NO_CONTENT"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    const/4 v0, 0x7

    .line 1742
    new-array v0, v0, [Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS_CLEAR:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_AUTOFETCH:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_OFFLINE_EDUCATION:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->NO_CONTENT:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    aput-object v1, v0, v8

    sput-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->$VALUES:[Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1742
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;
    .locals 1

    .line 1742
    const-class v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;
    .locals 1

    .line 1742
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->$VALUES:[Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    invoke-virtual {v0}, [Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    return-object v0
.end method
