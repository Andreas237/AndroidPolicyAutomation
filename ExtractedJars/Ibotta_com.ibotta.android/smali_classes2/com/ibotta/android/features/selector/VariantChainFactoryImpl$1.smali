.class synthetic Lcom/ibotta/android/features/selector/VariantChainFactoryImpl$1;
.super Ljava/lang/Object;
.source "VariantChainFactoryImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$features$chains$VariantChainStrategy:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 50
    invoke-static {}, Lcom/ibotta/android/features/chains/VariantChainStrategy;->values()[Lcom/ibotta/android/features/chains/VariantChainStrategy;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl$1;->$SwitchMap$com$ibotta$android$features$chains$VariantChainStrategy:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl$1;->$SwitchMap$com$ibotta$android$features$chains$VariantChainStrategy:[I

    sget-object v1, Lcom/ibotta/android/features/chains/VariantChainStrategy;->LAUNCH_DARKLY_FLAGS_AND_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    invoke-virtual {v1}, Lcom/ibotta/android/features/chains/VariantChainStrategy;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl$1;->$SwitchMap$com$ibotta$android$features$chains$VariantChainStrategy:[I

    sget-object v1, Lcom/ibotta/android/features/chains/VariantChainStrategy;->APP_CONFIG_FLAGS_AND_MVT_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    invoke-virtual {v1}, Lcom/ibotta/android/features/chains/VariantChainStrategy;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl$1;->$SwitchMap$com$ibotta$android$features$chains$VariantChainStrategy:[I

    sget-object v1, Lcom/ibotta/android/features/chains/VariantChainStrategy;->APP_CONFIG_FLAGS_AND_NO_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    invoke-virtual {v1}, Lcom/ibotta/android/features/chains/VariantChainStrategy;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
