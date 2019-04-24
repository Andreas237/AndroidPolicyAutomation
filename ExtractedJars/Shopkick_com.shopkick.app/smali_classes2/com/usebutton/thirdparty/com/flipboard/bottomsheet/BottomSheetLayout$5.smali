.class Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;
.super Ljava/lang/Object;
.source "BottomSheetLayout.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)V
    .locals 0

    .line 743
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 747
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p2

    if-ge p9, p5, :cond_0

    const p3, -0x41333333    # -0.4f

    goto :goto_0

    :cond_0
    const p3, 0x3ecccccd    # 0.4f

    :goto_0
    add-float/2addr p2, p3

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$002(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;F)F

    .line 749
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$500(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object p1

    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq p1, p2, :cond_4

    .line 751
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p1

    iget-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$600(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)I

    move-result p2

    int-to-float p2, p2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_2

    .line 752
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$500(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object p1

    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, p2, :cond_1

    .line 753
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$700(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 755
    :cond_1
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p2

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$100(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;F)V

    goto :goto_1

    .line 756
    :cond_2
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$600(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)I

    move-result p1

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    .line 757
    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p1

    iget-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$600(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)I

    move-result p2

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    .line 758
    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$500(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object p1

    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, p2, :cond_4

    .line 759
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p1

    iget-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result p2

    cmpl-float p1, p1, p2

    if-nez p1, :cond_3

    .line 760
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$700(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 762
    :cond_3
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p2

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$100(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;F)V

    .line 765
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F

    move-result p2

    float-to-int p2, p2

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$602(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;I)I

    return-void
.end method
