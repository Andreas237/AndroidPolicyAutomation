.class Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;
.super Ljava/lang/Object;
.source "ScanCategoryJumpAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScanCategoryJumpAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "JumpCategoryClick"
.end annotation


# instance fields
.field private categoryInfo:Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

.field private categoryJumperControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/CategoryJumperController;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;


# direct methods
.method protected constructor <init>(Lcom/shopkick/app/products/ScanCategoryJumpAdapter;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/CategoryJumperController;",
            ">;",
            "Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;",
            ")V"
        }
    .end annotation

    .line 164
    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->this$0:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object p2, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->categoryJumperControllerRef:Ljava/lang/ref/WeakReference;

    .line 166
    iput-object p3, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->categoryInfo:Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 170
    iget-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->categoryJumperControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/products/CategoryJumperController;

    if-nez p1, :cond_0

    return-void

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->categoryInfo:Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    iget-object v0, v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->skLink:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->this$0:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->access$000(Lcom/shopkick/app/products/ScanCategoryJumpAdapter;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->categoryInfo:Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    iget-object v0, v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->skLink:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->dispatchUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;->categoryInfo:Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    iget v0, v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->listPosition:I

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->scrollToPosition(I)V

    :goto_0
    return-void
.end method
