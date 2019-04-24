.class public Lcom/huawei/feedback/ui/ResizeRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/huawei/feedback/ui/ResizeRelativeLayout;->a:Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;

    .line 16
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .line 24
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 26
    iget-object v0, p0, Lcom/huawei/feedback/ui/ResizeRelativeLayout;->a:Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/huawei/feedback/ui/ResizeRelativeLayout;->a:Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;->a(IIII)V

    .line 29
    :cond_0
    return-void
.end method
