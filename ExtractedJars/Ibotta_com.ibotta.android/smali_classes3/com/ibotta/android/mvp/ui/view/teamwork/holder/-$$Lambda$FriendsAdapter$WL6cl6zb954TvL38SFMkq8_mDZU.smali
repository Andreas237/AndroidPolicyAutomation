.class public final synthetic Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

.field private final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;->f$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;->f$1:I

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;->f$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;->f$1:I

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->lambda$onBindViewHolder$1(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;ILandroid/view/View;)Z

    move-result p1

    return p1
.end method
