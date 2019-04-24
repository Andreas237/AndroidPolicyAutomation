.class Lhuawei/widget/HwErrorTipTextLayout$2;
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

    .line 291
    iput-object p1, p0, Lhuawei/widget/HwErrorTipTextLayout$2;->this$0:Lhuawei/widget/HwErrorTipTextLayout;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 294
    iget-object v0, p0, Lhuawei/widget/HwErrorTipTextLayout$2;->this$0:Lhuawei/widget/HwErrorTipTextLayout;

    invoke-static {v0}, Lhuawei/widget/HwErrorTipTextLayout;->access$100(Lhuawei/widget/HwErrorTipTextLayout;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lhuawei/widget/HwErrorTipTextLayout$2;->this$0:Lhuawei/widget/HwErrorTipTextLayout;

    .line 295
    invoke-static {v1}, Lhuawei/widget/HwErrorTipTextLayout;->access$200(Lhuawei/widget/HwErrorTipTextLayout;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 297
    return-void
.end method
