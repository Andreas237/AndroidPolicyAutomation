.class synthetic Lcom/mopub/mobileads/VastVideoViewController$11;
.super Ljava/lang/Object;
.source "VastVideoViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/VastVideoViewController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$mopub$common$util$DeviceUtils$ForceOrientation:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 252
    invoke-static {}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->values()[Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/mopub/mobileads/VastVideoViewController$11;->$SwitchMap$com$mopub$common$util$DeviceUtils$ForceOrientation:[I

    :try_start_0
    sget-object v0, Lcom/mopub/mobileads/VastVideoViewController$11;->$SwitchMap$com$mopub$common$util$DeviceUtils$ForceOrientation:[I

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_PORTRAIT:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    invoke-virtual {v1}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/mopub/mobileads/VastVideoViewController$11;->$SwitchMap$com$mopub$common$util$DeviceUtils$ForceOrientation:[I

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_LANDSCAPE:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    invoke-virtual {v1}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/mopub/mobileads/VastVideoViewController$11;->$SwitchMap$com$mopub$common$util$DeviceUtils$ForceOrientation:[I

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->DEVICE_ORIENTATION:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    invoke-virtual {v1}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/mopub/mobileads/VastVideoViewController$11;->$SwitchMap$com$mopub$common$util$DeviceUtils$ForceOrientation:[I

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->UNDEFINED:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    invoke-virtual {v1}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
