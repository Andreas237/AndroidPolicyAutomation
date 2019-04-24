.class synthetic Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl$1;
.super Ljava/lang/Object;
.source "ModulePresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 145
    invoke-static {}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->values()[Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl$1;->$SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl$1;->$SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->BOXED:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl$1;->$SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ROWS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl$1;->$SwitchMap$com$ibotta$api$model$base$BaseModule$DisplayType:[I

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->CIRCLES:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
