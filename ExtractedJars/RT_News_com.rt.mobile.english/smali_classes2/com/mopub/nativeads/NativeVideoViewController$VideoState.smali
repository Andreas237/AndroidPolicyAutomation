.class final enum Lcom/mopub/nativeads/NativeVideoViewController$VideoState;
.super Ljava/lang/Enum;
.source "NativeVideoViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/NativeVideoViewController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "VideoState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/nativeads/NativeVideoViewController$VideoState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum BUFFERING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum ENDED:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum FAILED_LOAD:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum LOADING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum NONE:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum PAUSED:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

.field public static final enum PLAYING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 35
    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->NONE:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "LOADING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->LOADING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "BUFFERING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->BUFFERING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "PAUSED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->PAUSED:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "PLAYING"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->PLAYING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "ENDED"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->ENDED:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    new-instance v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const-string v1, "FAILED_LOAD"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->FAILED_LOAD:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->NONE:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->LOADING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->BUFFERING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->PAUSED:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->PLAYING:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->ENDED:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->FAILED_LOAD:Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    aput-object v1, v0, v8

    sput-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->$VALUES:[Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/NativeVideoViewController$VideoState;
    .locals 1

    .line 35
    const-class v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    return-object p0
.end method

.method public static values()[Lcom/mopub/nativeads/NativeVideoViewController$VideoState;
    .locals 1

    .line 35
    sget-object v0, Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->$VALUES:[Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/NativeVideoViewController$VideoState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/NativeVideoViewController$VideoState;

    return-object v0
.end method
