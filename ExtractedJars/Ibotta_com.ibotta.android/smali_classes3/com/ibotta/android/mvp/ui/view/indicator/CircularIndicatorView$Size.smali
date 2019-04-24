.class public final enum Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;
.super Ljava/lang/Enum;
.source "CircularIndicatorView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Size"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

.field public static final enum LARGE:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

.field public static final enum SMALL:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    const-string v1, "SMALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->SMALL:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    .line 26
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    const-string v1, "LARGE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->LARGE:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    const/4 v0, 0x2

    .line 24
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->SMALL:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->LARGE:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;
    .locals 1

    .line 24
    const-class v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;
    .locals 1

    .line 24
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    return-object v0
.end method
