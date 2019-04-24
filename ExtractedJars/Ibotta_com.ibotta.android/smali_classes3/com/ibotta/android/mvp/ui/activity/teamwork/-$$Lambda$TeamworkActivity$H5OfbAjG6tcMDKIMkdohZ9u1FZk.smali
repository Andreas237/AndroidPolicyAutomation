.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

.field private final synthetic f$1:Lcom/ibotta/android/view/model/FriendItem;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;->f$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;->f$1:Lcom/ibotta/android/view/model/FriendItem;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;->f$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$TeamworkActivity$H5OfbAjG6tcMDKIMkdohZ9u1FZk;->f$1:Lcom/ibotta/android/view/model/FriendItem;

    invoke-static {v0, v1, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;->lambda$showRemoveConfirmation$3(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/view/model/FriendItem;Landroid/content/DialogInterface;I)V

    return-void
.end method
