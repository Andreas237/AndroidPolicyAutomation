.class public final enum Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;
.super Ljava/lang/Enum;
.source "MoPubRecyclerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/MoPubRecyclerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ContentChangeStrategy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

.field public static final enum INSERT_AT_END:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

.field public static final enum KEEP_ADS_FIXED:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

.field public static final enum MOVE_ALL_ADS_WITH_CONTENT:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 29
    new-instance v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    const-string v1, "INSERT_AT_END"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->INSERT_AT_END:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    new-instance v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    const-string v1, "MOVE_ALL_ADS_WITH_CONTENT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->MOVE_ALL_ADS_WITH_CONTENT:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    new-instance v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    const-string v1, "KEEP_ADS_FIXED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->KEEP_ADS_FIXED:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    const/4 v0, 0x3

    .line 28
    new-array v0, v0, [Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    sget-object v1, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->INSERT_AT_END:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->MOVE_ALL_ADS_WITH_CONTENT:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->KEEP_ADS_FIXED:Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->$VALUES:[Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;
    .locals 1

    .line 28
    const-class v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    return-object p0
.end method

.method public static values()[Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;
    .locals 1

    .line 28
    sget-object v0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->$VALUES:[Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/MoPubRecyclerAdapter$ContentChangeStrategy;

    return-object v0
.end method
