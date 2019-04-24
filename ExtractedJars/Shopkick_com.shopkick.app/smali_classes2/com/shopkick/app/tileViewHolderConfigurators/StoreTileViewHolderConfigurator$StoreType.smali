.class final enum Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;
.super Ljava/lang/Enum;
.source "StoreTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "StoreType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

.field public static final enum NEARBY:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

.field public static final enum ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 57
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    const-string v1, "NEARBY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->NEARBY:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    .line 58
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    const-string v1, "ONLINE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    const/4 v0, 0x2

    .line 56
    new-array v0, v0, [Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->NEARBY:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;
    .locals 1

    .line 56
    const-class v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;
    .locals 1

    .line 56
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    invoke-virtual {v0}, [Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    return-object v0
.end method
