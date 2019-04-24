.class synthetic Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;
.super Ljava/lang/Object;
.source "InvitePromoCodeScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/invite/InvitePromoCodeScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 234
    invoke-static {}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->values()[Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;->$SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;->$SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->SMS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {v1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;->$SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->EMAIL:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {v1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;->$SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->FACEBOOK:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {v1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;->$SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->COPY_TO_CLIPBOARD:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {v1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
