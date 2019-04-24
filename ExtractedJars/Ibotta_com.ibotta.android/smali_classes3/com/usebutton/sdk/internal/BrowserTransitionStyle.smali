.class public final enum Lcom/usebutton/sdk/internal/BrowserTransitionStyle;
.super Ljava/lang/Enum;
.source "BrowserTransitionStyle.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/internal/BrowserTransitionStyle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

.field public static final enum DEFAULT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

.field public static final enum RIGHT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;


# instance fields
.field private final apiValue:Ljava/lang/String;

.field private final finishEnterAnimation:I
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation
.end field

.field private final finishExitAnimation:I
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation
.end field

.field private final startEnterAnimation:I
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation
.end field

.field private final startExitAnimation:I
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 10
    new-instance v8, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    const-string v1, "DEFAULT"

    const-string v3, "default"

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;-><init>(Ljava/lang/String;ILjava/lang/String;IIII)V

    sput-object v8, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->DEFAULT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    .line 11
    new-instance v0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    const-string v10, "RIGHT"

    const-string v12, "right"

    sget v13, Lcom/usebutton/sdk/R$anim;->btn_browser_transition_style_right_enter_start:I

    sget v14, Lcom/usebutton/sdk/R$anim;->btn_browser_transition_style_right_exit_start:I

    sget v15, Lcom/usebutton/sdk/R$anim;->btn_browser_transition_style_right_enter_finish:I

    sget v16, Lcom/usebutton/sdk/R$anim;->btn_browser_transition_style_right_exit_finish:I

    const/4 v11, 0x1

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;-><init>(Ljava/lang/String;ILjava/lang/String;IIII)V

    sput-object v0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->RIGHT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    sget-object v1, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->DEFAULT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    aput-object v1, v0, v2

    sget-object v1, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->RIGHT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->$VALUES:[Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;IIII)V
    .locals 0
    .param p4    # I
        .annotation build Landroid/support/annotation/AnimRes;
        .end annotation
    .end param
    .param p5    # I
        .annotation build Landroid/support/annotation/AnimRes;
        .end annotation
    .end param
    .param p6    # I
        .annotation build Landroid/support/annotation/AnimRes;
        .end annotation
    .end param
    .param p7    # I
        .annotation build Landroid/support/annotation/AnimRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIII)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput-object p3, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->apiValue:Ljava/lang/String;

    .line 33
    iput p4, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->startEnterAnimation:I

    .line 34
    iput p5, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->startExitAnimation:I

    .line 35
    iput p6, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->finishEnterAnimation:I

    .line 36
    iput p7, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->finishExitAnimation:I

    return-void
.end method

.method public static fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/BrowserTransitionStyle;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 60
    invoke-static {}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->values()[Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 61
    iget-object v4, v3, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->apiValue:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 66
    :cond_1
    sget-object p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->DEFAULT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/internal/BrowserTransitionStyle;
    .locals 1

    .line 8
    const-class v0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/internal/BrowserTransitionStyle;
    .locals 1

    .line 8
    sget-object v0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->$VALUES:[Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    return-object v0
.end method


# virtual methods
.method public getFinishEnterAnimation()I
    .locals 1
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation

    .line 51
    iget v0, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->finishEnterAnimation:I

    return v0
.end method

.method public getFinishExitAnimation()I
    .locals 1
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation

    .line 56
    iget v0, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->finishExitAnimation:I

    return v0
.end method

.method public getStartEnterAnimation()I
    .locals 1
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation

    .line 41
    iget v0, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->startEnterAnimation:I

    return v0
.end method

.method public getStartExitAnimation()I
    .locals 1
    .annotation build Landroid/support/annotation/AnimRes;
    .end annotation

    .line 46
    iget v0, p0, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->startExitAnimation:I

    return v0
.end method
