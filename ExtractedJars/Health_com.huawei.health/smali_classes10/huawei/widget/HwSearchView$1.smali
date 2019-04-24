.class Lhuawei/widget/HwSearchView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/HwSearchView;


# direct methods
.method constructor <init>(Lhuawei/widget/HwSearchView;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lhuawei/widget/HwSearchView$1;->this$0:Lhuawei/widget/HwSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 265
    iget-object v0, p0, Lhuawei/widget/HwSearchView$1;->this$0:Lhuawei/widget/HwSearchView;

    invoke-static {v0}, Lhuawei/widget/HwSearchView;->access$000(Lhuawei/widget/HwSearchView;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 266
    iget-object v0, p0, Lhuawei/widget/HwSearchView$1;->this$0:Lhuawei/widget/HwSearchView;

    invoke-static {v0}, Lhuawei/widget/HwSearchView;->access$100(Lhuawei/widget/HwSearchView;)V

    .line 268
    :cond_0
    return-void
.end method
