.class Lhuawei/widget/HwErrorTipTextLayout$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhuawei/widget/HwErrorTipTextLayout;->setError(Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwErrorTipTextLayout;


# direct methods
.method constructor <init>(Lhuawei/widget/HwErrorTipTextLayout;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lhuawei/widget/HwErrorTipTextLayout$1;->this$0:Lhuawei/widget/HwErrorTipTextLayout;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 266
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout$1;->this$0:Lhuawei/widget/HwErrorTipTextLayout;

    invoke-static {v0}, Lhuawei/widget/HwErrorTipTextLayout;->access$100(Lhuawei/widget/HwErrorTipTextLayout;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 267
    return-void
.end method
