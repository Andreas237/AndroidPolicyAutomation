.class synthetic Lcom/shopkick/app/bnc/BCRulesScreen$2;
.super Ljava/lang/Object;
.source "BCRulesScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/BCRulesScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$bnc$BCRulesScreen$ButtonType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 547
    invoke-static {}, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->values()[Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/bnc/BCRulesScreen$2;->$SwitchMap$com$shopkick$app$bnc$BCRulesScreen$ButtonType:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/bnc/BCRulesScreen$2;->$SwitchMap$com$shopkick$app$bnc$BCRulesScreen$ButtonType:[I

    sget-object v1, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->RegisterPhone:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    invoke-virtual {v1}, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/bnc/BCRulesScreen$2;->$SwitchMap$com$shopkick$app$bnc$BCRulesScreen$ButtonType:[I

    sget-object v1, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->LinkCard:Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;

    invoke-virtual {v1}, Lcom/shopkick/app/bnc/BCRulesScreen$ButtonType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
