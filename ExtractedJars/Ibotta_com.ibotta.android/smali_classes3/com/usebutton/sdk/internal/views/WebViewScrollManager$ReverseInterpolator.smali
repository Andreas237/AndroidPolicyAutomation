.class Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;
.super Ljava/lang/Object;
.source "WebViewScrollManager.java"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/WebViewScrollManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ReverseInterpolator"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;->this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    .line 201
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1
.end method
