.class Lcom/usebutton/sdk/internal/util/CompatHelpers$LollipopHelper;
.super Ljava/lang/Object;
.source "CompatHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/CompatHelpers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LollipopHelper"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/util/CompatHelpers$1;)V
    .locals 0

    .line 147
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/CompatHelpers$LollipopHelper;-><init>()V

    return-void
.end method


# virtual methods
.method public createSceneTransition(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View;)Landroid/os/Bundle;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/4 v0, 0x1

    .line 150
    new-array v0, v0, [Landroid/util/Pair;

    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, p3, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x0

    aput-object v1, v0, p2

    invoke-static {p1, v0}, Landroid/app/ActivityOptions;->makeSceneTransitionAnimation(Landroid/app/Activity;[Landroid/util/Pair;)Landroid/app/ActivityOptions;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
