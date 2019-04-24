.class synthetic Lcom/shopkick/app/application/AppLaunchState$1;
.super Ljava/lang/Object;
.source "AppLaunchState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/AppLaunchState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 277
    invoke-static {}, Lcom/shopkick/app/application/AppLaunchState$Source;->values()[Lcom/shopkick/app/application/AppLaunchState$Source;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->LOCAL_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->PHONE_VERIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->WEB_REG:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method
