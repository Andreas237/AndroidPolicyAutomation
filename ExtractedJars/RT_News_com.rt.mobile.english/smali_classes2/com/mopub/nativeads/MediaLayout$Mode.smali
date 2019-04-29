.class public final enum Lcom/mopub/nativeads/MediaLayout$Mode;
.super Ljava/lang/Enum;
.source "MediaLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/MediaLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/nativeads/MediaLayout$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/nativeads/MediaLayout$Mode;

.field public static final enum BUFFERING:Lcom/mopub/nativeads/MediaLayout$Mode;

.field public static final enum FINISHED:Lcom/mopub/nativeads/MediaLayout$Mode;

.field public static final enum IMAGE:Lcom/mopub/nativeads/MediaLayout$Mode;

.field public static final enum LOADING:Lcom/mopub/nativeads/MediaLayout$Mode;

.field public static final enum PAUSED:Lcom/mopub/nativeads/MediaLayout$Mode;

.field public static final enum PLAYING:Lcom/mopub/nativeads/MediaLayout$Mode;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 29
    new-instance v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/nativeads/MediaLayout$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->IMAGE:Lcom/mopub/nativeads/MediaLayout$Mode;

    new-instance v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    const-string v1, "PLAYING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/nativeads/MediaLayout$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->PLAYING:Lcom/mopub/nativeads/MediaLayout$Mode;

    new-instance v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    const-string v1, "LOADING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/mopub/nativeads/MediaLayout$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->LOADING:Lcom/mopub/nativeads/MediaLayout$Mode;

    new-instance v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    const-string v1, "BUFFERING"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/mopub/nativeads/MediaLayout$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->BUFFERING:Lcom/mopub/nativeads/MediaLayout$Mode;

    new-instance v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    const-string v1, "PAUSED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/mopub/nativeads/MediaLayout$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->PAUSED:Lcom/mopub/nativeads/MediaLayout$Mode;

    new-instance v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    const-string v1, "FINISHED"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/mopub/nativeads/MediaLayout$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->FINISHED:Lcom/mopub/nativeads/MediaLayout$Mode;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/mopub/nativeads/MediaLayout$Mode;

    sget-object v1, Lcom/mopub/nativeads/MediaLayout$Mode;->IMAGE:Lcom/mopub/nativeads/MediaLayout$Mode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/nativeads/MediaLayout$Mode;->PLAYING:Lcom/mopub/nativeads/MediaLayout$Mode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/nativeads/MediaLayout$Mode;->LOADING:Lcom/mopub/nativeads/MediaLayout$Mode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/nativeads/MediaLayout$Mode;->BUFFERING:Lcom/mopub/nativeads/MediaLayout$Mode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/nativeads/MediaLayout$Mode;->PAUSED:Lcom/mopub/nativeads/MediaLayout$Mode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/nativeads/MediaLayout$Mode;->FINISHED:Lcom/mopub/nativeads/MediaLayout$Mode;

    aput-object v1, v0, v7

    sput-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->$VALUES:[Lcom/mopub/nativeads/MediaLayout$Mode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/MediaLayout$Mode;
    .locals 1

    .line 29
    const-class v0, Lcom/mopub/nativeads/MediaLayout$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/nativeads/MediaLayout$Mode;

    return-object p0
.end method

.method public static values()[Lcom/mopub/nativeads/MediaLayout$Mode;
    .locals 1

    .line 29
    sget-object v0, Lcom/mopub/nativeads/MediaLayout$Mode;->$VALUES:[Lcom/mopub/nativeads/MediaLayout$Mode;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/MediaLayout$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/MediaLayout$Mode;

    return-object v0
.end method
