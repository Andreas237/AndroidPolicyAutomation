.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerScreen.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$000(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$100(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)I

    move-result p1

    if-le p2, p1, :cond_0

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$200(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$400(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$500(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    goto :goto_0

    .line 163
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$100(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)I

    move-result p1

    if-ge p2, p1, :cond_1

    if-nez p2, :cond_1

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$600(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$400(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$700(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    .line 171
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    invoke-static {p1, p2}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$102(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;I)I

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->access$002(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z

    return-void
.end method
