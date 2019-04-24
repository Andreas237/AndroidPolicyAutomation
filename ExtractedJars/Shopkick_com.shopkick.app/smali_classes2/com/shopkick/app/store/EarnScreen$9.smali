.class synthetic Lcom/shopkick/app/store/EarnScreen$9;
.super Ljava/lang/Object;
.source "EarnScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/EarnScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$store$EarnScreen$EarnScreenMode:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 764
    invoke-static {}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->values()[Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/store/EarnScreen$9;->$SwitchMap$com$shopkick$app$store$EarnScreen$EarnScreenMode:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/store/EarnScreen$9;->$SwitchMap$com$shopkick$app$store$EarnScreen$EarnScreenMode:[I

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-virtual {v1}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/store/EarnScreen$9;->$SwitchMap$com$shopkick$app$store$EarnScreen$EarnScreenMode:[I

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-virtual {v1}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/app/store/EarnScreen$9;->$SwitchMap$com$shopkick$app$store$EarnScreen$EarnScreenMode:[I

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-virtual {v1}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
