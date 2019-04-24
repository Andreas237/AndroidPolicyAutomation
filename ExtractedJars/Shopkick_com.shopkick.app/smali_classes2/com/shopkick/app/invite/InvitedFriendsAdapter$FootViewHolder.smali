.class Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "InvitedFriendsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/invite/InvitedFriendsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FootViewHolder"
.end annotation


# instance fields
.field private final disclaimerTextView:Lcom/shopkick/app/widget/SKTextView;

.field final synthetic this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/InvitedFriendsAdapter;Landroid/view/View;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    .line 240
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f09021b

    .line 241
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;->disclaimerTextView:Lcom/shopkick/app/widget/SKTextView;

    return-void
.end method


# virtual methods
.method setDisclaimerText(Ljava/lang/String;)V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;->disclaimerTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method
