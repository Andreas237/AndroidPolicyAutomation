.class synthetic Lcom/usebutton/sdk/internal/InternalRewardsExtension$2;
.super Ljava/lang/Object;
.source "InternalRewardsExtension.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/InternalRewardsExtension;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$usebutton$sdk$purchasepath$Commission$CommissionType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 68
    invoke-static {}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->values()[Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$2;->$SwitchMap$com$usebutton$sdk$purchasepath$Commission$CommissionType:[I

    :try_start_0
    sget-object v0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$2;->$SwitchMap$com$usebutton$sdk$purchasepath$Commission$CommissionType:[I

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$2;->$SwitchMap$com$usebutton$sdk$purchasepath$Commission$CommissionType:[I

    sget-object v1, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->NON_COMMISSIONABLE:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
