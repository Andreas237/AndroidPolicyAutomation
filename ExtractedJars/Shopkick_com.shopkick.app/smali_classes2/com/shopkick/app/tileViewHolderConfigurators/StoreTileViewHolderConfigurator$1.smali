.class synthetic Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "StoreTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$tileViewHolderConfigurators$StoreTileViewHolderConfigurator$StoreType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 166
    invoke-static {}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->values()[Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$StoreTileViewHolderConfigurator$StoreType:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$StoreTileViewHolderConfigurator$StoreType:[I

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$StoreTileViewHolderConfigurator$StoreType:[I

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->NEARBY:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
