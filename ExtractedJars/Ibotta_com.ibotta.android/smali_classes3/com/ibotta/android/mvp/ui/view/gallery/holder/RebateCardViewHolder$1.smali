.class synthetic Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder$1;
.super Ljava/lang/Object;
.source "RebateCardViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$api$model$ContentModel$Type:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 56
    invoke-static {}, Lcom/ibotta/api/model/ContentModel$Type;->values()[Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->DEAL:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->OFFER:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
