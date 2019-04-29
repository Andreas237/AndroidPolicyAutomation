.class Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "QuickReturnRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RecyclerScrollListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;


# direct methods
.method private constructor <init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 3

    .line 111
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p1

    const/16 p2, 0x30

    const/16 v0, 0x50

    if-ne p1, v0, :cond_0

    .line 112
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$500(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v1

    add-int/2addr v1, p3

    invoke-static {p1, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$502(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto :goto_0

    .line 113
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p1

    if-ne p1, p2, :cond_1

    .line 114
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$500(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v1

    sub-int/2addr v1, p3

    invoke-static {p1, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$502(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 116
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$200(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    .line 120
    :cond_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$500(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p1

    .line 122
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$600(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch p3, :pswitch_data_0

    goto/16 :goto_2

    .line 159
    :pswitch_0
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    if-ne p3, v0, :cond_5

    .line 160
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$700(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p2

    sub-int p2, p1, p2

    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    add-int/2addr p2, p3

    if-gez p2, :cond_3

    .line 164
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    add-int/2addr p3, p1

    invoke-static {p2, p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    move p2, v2

    :cond_3
    if-nez p1, :cond_4

    .line 168
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, v2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    move p2, v2

    .line 172
    :cond_4
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    if-le p2, p3, :cond_e

    .line 173
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 174
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto/16 :goto_3

    .line 176
    :cond_5
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    if-ne p3, p2, :cond_d

    .line 177
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$700(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    add-int/2addr p2, p1

    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    sub-int/2addr p2, p3

    if-lez p2, :cond_6

    .line 181
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    sub-int p3, p1, p3

    invoke-static {p2, p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    move p2, v2

    :cond_6
    if-nez p1, :cond_7

    .line 185
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, v2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    move p2, v2

    .line 189
    :cond_7
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    neg-int p3, p3

    if-ge p2, p3, :cond_e

    .line 190
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 191
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto/16 :goto_3

    .line 124
    :pswitch_1
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    const/4 v1, 0x2

    if-ne p3, v0, :cond_9

    .line 125
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$700(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p2

    if-lt p1, p2, :cond_8

    .line 126
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto :goto_1

    .line 128
    :cond_8
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto :goto_1

    .line 130
    :cond_9
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    if-ne p3, p2, :cond_c

    .line 131
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$700(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p2

    if-gt p1, p2, :cond_a

    .line 132
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto :goto_1

    .line 134
    :cond_a
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto :goto_1

    .line 142
    :pswitch_2
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    if-ne p3, v0, :cond_b

    .line 144
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p2

    if-le p1, p2, :cond_c

    .line 145
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 146
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    goto :goto_1

    .line 148
    :cond_b
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p3

    if-ne p3, p2, :cond_c

    .line 150
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result p2

    neg-int p2, p2

    if-ge p1, p2, :cond_c

    .line 151
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 152
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p2, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    :cond_c
    :goto_1
    move p2, p1

    goto :goto_3

    :cond_d
    :goto_2
    move p2, v2

    .line 197
    :cond_e
    :goto_3
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$200(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)Landroid/view/View;

    move-result-object p1

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
