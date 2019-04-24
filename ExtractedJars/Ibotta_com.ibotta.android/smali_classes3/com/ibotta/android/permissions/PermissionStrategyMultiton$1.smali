.class synthetic Lcom/ibotta/android/permissions/PermissionStrategyMultiton$1;
.super Ljava/lang/Object;
.source "PermissionStrategyMultiton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/permissions/PermissionStrategyMultiton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$permissions$Permission:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 62
    invoke-static {}, Lcom/ibotta/android/permissions/Permission;->values()[Lcom/ibotta/android/permissions/Permission;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton$1;->$SwitchMap$com$ibotta$android$permissions$Permission:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton$1;->$SwitchMap$com$ibotta$android$permissions$Permission:[I

    sget-object v1, Lcom/ibotta/android/permissions/Permission;->LOCATION:Lcom/ibotta/android/permissions/Permission;

    invoke-virtual {v1}, Lcom/ibotta/android/permissions/Permission;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
