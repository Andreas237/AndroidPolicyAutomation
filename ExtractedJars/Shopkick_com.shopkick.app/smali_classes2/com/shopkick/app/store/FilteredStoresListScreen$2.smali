.class Lcom/shopkick/app/store/FilteredStoresListScreen$2;
.super Lcom/shopkick/app/widget/ToolTipView;
.source "FilteredStoresListScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/FilteredStoresListScreen;->maybeDisplayTooltip()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/FilteredStoresListScreen;Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 437
    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$2;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/widget/ToolTipView;-><init>(Landroid/view/ViewGroup;Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public after(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 1

    .line 439
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$2;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$502(Lcom/shopkick/app/store/FilteredStoresListScreen;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;

    .line 440
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$2;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$600(Lcom/shopkick/app/store/FilteredStoresListScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setStoreListK4RRTooltipShown(Z)V

    return-void
.end method
