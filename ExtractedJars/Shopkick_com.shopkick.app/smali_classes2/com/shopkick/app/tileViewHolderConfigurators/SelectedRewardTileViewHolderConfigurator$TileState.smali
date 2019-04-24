.class final enum Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;
.super Ljava/lang/Enum;
.source "SelectedRewardTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "TileState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

.field public static final enum COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

.field public static final enum IN_PROGRESS:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

.field public static final enum NO_REWARD:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 70
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    const-string v1, "NO_REWARD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->NO_REWARD:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    .line 71
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    const-string v1, "IN_PROGRESS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->IN_PROGRESS:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    .line 72
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    const-string v1, "COMPLETED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    const/4 v0, 0x3

    .line 69
    new-array v0, v0, [Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->NO_REWARD:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->IN_PROGRESS:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 69
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;
    .locals 1

    .line 69
    const-class v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;
    .locals 1

    .line 69
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    invoke-virtual {v0}, [Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$TileState;

    return-object v0
.end method
