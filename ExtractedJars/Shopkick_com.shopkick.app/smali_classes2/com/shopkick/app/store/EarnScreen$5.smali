.class Lcom/shopkick/app/store/EarnScreen$5;
.super Ljava/lang/Object;
.source "EarnScreen.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->updateBonusCountdownFooter()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/EarnScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 987
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$5;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 990
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$5;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$1400(Lcom/shopkick/app/store/EarnScreen;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/store/EarnScreen;->access$1500(Lcom/shopkick/app/store/EarnScreen;I)V

    .line 991
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$5;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$1400(Lcom/shopkick/app/store/EarnScreen;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method
